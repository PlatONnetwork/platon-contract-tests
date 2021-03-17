package network.platon.contracts.evm.v0_8_2;

import com.platon.abi.solidity.EventEncoder;
import com.platon.abi.solidity.TypeReference;
import com.platon.abi.solidity.datatypes.DynamicArray;
import com.platon.abi.solidity.datatypes.Event;
import com.platon.abi.solidity.datatypes.Function;
import com.platon.abi.solidity.datatypes.Type;
import com.platon.abi.solidity.datatypes.Utf8String;
import com.platon.abi.solidity.datatypes.generated.Int256;
import com.platon.abi.solidity.datatypes.generated.StaticArray2;
import com.platon.abi.solidity.datatypes.generated.Uint256;
import com.platon.abi.solidity.datatypes.generated.Uint8;
import com.platon.crypto.Credentials;
import com.platon.protocol.Web3j;
import com.platon.protocol.core.DefaultBlockParameter;
import com.platon.protocol.core.RemoteCall;
import com.platon.protocol.core.methods.request.PlatonFilter;
import com.platon.protocol.core.methods.response.Log;
import com.platon.protocol.core.methods.response.TransactionReceipt;
import com.platon.tx.Contract;
import com.platon.tx.TransactionManager;
import com.platon.tx.gas.GasProvider;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import rx.Observable;
import rx.functions.Func1;

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://github.com/PlatONnetwork/client-sdk-java/releases">platon-web3j command line tools</a>,
 * or the com.platon.codegen.SolidityFunctionWrapperGenerator in the 
 * <a href="https://github.com/PlatONnetwork/client-sdk-java/tree/master/codegen">codegen module</a> to update.
 *
 * <p>Generated with web3j version 0.15.1.7.
 */
public class EventIndexedContract extends Contract {
    private static final String BINARY = "60806040526040518060a00160405280600060ff168152602001600160ff168152602001600260ff168152602001600360ff168152602001600460ff1681525060009060056200005192919062000180565b506040518060c001604052806040518060400160405280600060ff168152602001600060ff1681525081526020016040518060400160405280600060ff168152602001600160ff1681525081526020016040518060400160405280600060ff168152602001600260ff1681525081526020016040518060400160405280600060ff168152602001600360ff1681525081526020016040518060400160405280600060ff168152602001600460ff1681525081526020016040518060400160405280600060ff168152602001600560ff16815250815250600190600662000139929190620001d7565b5060405180608001604052806058815260200162000af160589139600290805190602001906200016b9291906200023c565b503480156200017957600080fd5b50620003d1565b828054828255906000526020600020908101928215620001c4579160200282015b82811115620001c3578251829060ff16905591602001919060010190620001a1565b5b509050620001d39190620002cd565b5090565b82805482825590600052602060002090600202810192821562000229579160200282015b82811115620002285782518290600262000217929190620002ec565b5091602001919060020190620001fb565b5b50905062000238919062000336565b5090565b8280546200024a906200036c565b90600052602060002090601f0160209004810192826200026e5760008555620002ba565b82601f106200028957805160ff1916838001178555620002ba565b82800160010185558215620002ba579182015b82811115620002b95782518255916020019190600101906200029c565b5b509050620002c99190620002cd565b5090565b5b80821115620002e8576000816000905550600101620002ce565b5090565b826002810192821562000323579160200282015b8281111562000322578251829060ff1690559160200191906001019062000300565b5b509050620003329190620002cd565b5090565b5b808211156200035a57600081816200035091906200035e565b5060020162000337565b5090565b506000815560010160009055565b600060028204905060018216806200038557607f821691505b602082108114156200039c576200039b620003a2565b5b50919050565b7f4e487b7100000000000000000000000000000000000000000000000000000000600052602260045260246000fd5b61071080620003e16000396000f3fe608060405234801561001057600080fd5b506004361061007d5760003560e01c8063bb0a5bd91161005b578063bb0a5bd9146100a0578063bbd847af146100aa578063db06ee8d146100b4578063fcf3fbb8146100d05761007d565b80633ac559931461008257806343ae41d81461008c578063b05dfcf814610096575b600080fd5b61008a6100da565b005b61009461011f565b005b61009e610187565b005b6100a86101cc565b005b6100b26101e1565b005b6100ce60048036038101906100c99190610301565b610226565b005b6100d8610256565b005b60026040516100e99190610536565b60405180910390207f617cf8a4400dd7963ed519ebe655a16e8da1282bb8fea36a21f634af912f54ab60405160405180910390a2565b60006003811115610159577f4e487b7100000000000000000000000000000000000000000000000000000000600052602160045260246000fd5b7fde7a62815e0b38238b6211179d7d98017a99227a90823b0f44227e81dd3ad9c260405160405180910390a2565b6000604051610196919061051f565b60405180910390207f38a323fa24260bbb8b86f61cd1d8c1900024088af6d08eda9e2d793da33c1b5860405160405180910390a2565b600460036002600160405160405180910390a4565b60016040516101f09190610508565b60405180910390207f406715adbc90cbc793dcd5707190ad1390229b2a75cf5b5ca228b518ae52de9a60405160405180910390a2565b807f834f28319998410e0230b46f29e58f7a86d825bc8505a917dae170f66d70bcdd60405160405180910390a250565b60026040516102659190610536565b6040518091039020600060038111156102a7577f4e487b7100000000000000000000000000000000000000000000000000000000600052602160045260246000fd5b60006040516102b6919061051f565b60405180910390207f36b0026af468b8a488c2bd2a23a731b236d139a5211611fb763844bcb87f1abb60405160405180910390a4565b6000813590506102fb816106c3565b92915050565b60006020828403121561031357600080fd5b6000610321848285016102ec565b91505092915050565b600061033683836103b7565b60408301905092915050565b600061034e83836104f9565b60208301905092915050565b600061036582610596565b61036f81856105de565b935061037a8361054d565b8060005b838110156103aa5781610391888261032a565b975061039c836105b7565b92505060018101905061037e565b5085935050505092915050565b6103c0816105a1565b6103ca81846105e9565b92506103d582610562565b8060005b8381101561040d576103ea826106a3565b6103f48782610342565b96506103ff836105c4565b9250506001810190506103d9565b505050505050565b6000610420826105ac565b61042a81856105f4565b93506104358361056c565b8060005b8381101561046d5761044a826106a3565b6104548882610342565b975061045f836105d1565b925050600181019050610439565b5085935050505092915050565b6000815461048781610628565b61049181866105ff565b945060018216600081146104ac57600181146104bd576104f0565b60ff198316865281860193506104f0565b6104c685610581565b60005b838110156104e8578154818901526001820191506020810190506104c9565b838801955050505b50505092915050565b6105028161061e565b82525050565b6000610514828461035a565b915081905092915050565b600061052b8284610415565b915081905092915050565b6000610542828461047a565b915081905092915050565b60008190508160005260206000209050919050565b6000819050919050565b60008190508160005260206000209050919050565b60008190508160005260206000209050919050565b600081549050919050565b600060029050919050565b600081549050919050565b6000600282019050919050565b6000600182019050919050565b6000600182019050919050565b600081905092915050565b600081905092915050565b600081905092915050565b600081905092915050565b6000819050919050565b6000819050919050565b6000819050919050565b6000600282049050600182168061064057607f821691505b6020821081141561065457610653610674565b5b50919050565b600061066d610668836106b6565b61060a565b9050919050565b7f4e487b7100000000000000000000000000000000000000000000000000000000600052602260045260246000fd5b60006106af825461065a565b9050919050565b60008160001c9050919050565b6106cc81610614565b81146106d757600080fd5b5056fea26469706673582212201e313f404328857dfd8ee1c2f6781bce441ad6c9086202515603e6a1fc52852a64736f6c6343000802003331323334353637383930303937383635343332313132333435363738393030393837363534333231313233343536373839303039373634333534363636363633323432343434343434343434343735383331353436383536";

    public static final String FUNC_TESTANONYMOUSINDEXED = "testAnonymousIndexed";

    public static final String FUNC_TESTCOMPLEX = "testComplex";

    public static final String FUNC_TESTENUM = "testEnum";

    public static final String FUNC_TESTMINUS = "testMinus";

    public static final String FUNC_TESTONEDIMENSIONALARRAY = "testOneDimensionalArray";

    public static final String FUNC_TESTSTR = "testStr";

    public static final String FUNC_TESTTWODIMENSIONALARRAY = "testTwoDimensionalArray";

    public static final Event ANONYMOUSINDEXEDNUM_EVENT = new Event("AnonymousIndexedNum", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>(true) {}, new TypeReference<Uint256>(true) {}, new TypeReference<Uint256>(true) {}, new TypeReference<Uint256>(true) {}));
    ;

    public static final Event COMPLEXINDEXEDEVENT_EVENT = new Event("ComplexIndexedEvent", 
            Arrays.<TypeReference<?>>asList(new TypeReference<DynamicArray<Uint256>>(true) {}, new TypeReference<Uint8>(true) {}, new TypeReference<Utf8String>(true) {}));
    ;

    public static final Event ENUMEVENT_EVENT = new Event("EnumEvent", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Uint8>(true) {}));
    ;

    public static final Event MINUSEVENT_EVENT = new Event("MinusEvent", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Int256>(true) {}));
    ;

    public static final Event ONEDIMENSIONALARRAYEVENT_EVENT = new Event("OneDimensionalArrayEvent", 
            Arrays.<TypeReference<?>>asList(new TypeReference<DynamicArray<Uint256>>(true) {}));
    ;

    public static final Event STRINGEVENT_EVENT = new Event("StringEvent", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>(true) {}));
    ;

    public static final Event TWODIMENSIONALARRAYEVENT_EVENT = new Event("TwoDimensionalArrayEvent", 
            Arrays.<TypeReference<?>>asList(new TypeReference<DynamicArray<StaticArray2<Uint256>>>(true) {}));
    ;

    protected EventIndexedContract(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected EventIndexedContract(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public List<AnonymousIndexedNumEventResponse> getAnonymousIndexedNumEvents(TransactionReceipt transactionReceipt) {
        List<Contract.EventValuesWithLog> valueList = extractEventParametersWithLog(ANONYMOUSINDEXEDNUM_EVENT, transactionReceipt);
        ArrayList<AnonymousIndexedNumEventResponse> responses = new ArrayList<AnonymousIndexedNumEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            AnonymousIndexedNumEventResponse typedResponse = new AnonymousIndexedNumEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.u1 = (BigInteger) eventValues.getIndexedValues().get(0).getValue();
            typedResponse.u2 = (BigInteger) eventValues.getIndexedValues().get(1).getValue();
            typedResponse.u3 = (BigInteger) eventValues.getIndexedValues().get(2).getValue();
            typedResponse.u4 = (BigInteger) eventValues.getIndexedValues().get(3).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Observable<AnonymousIndexedNumEventResponse> anonymousIndexedNumEventObservable(PlatonFilter filter) {
        return web3j.platonLogObservable(filter).map(new Func1<Log, AnonymousIndexedNumEventResponse>() {
            @Override
            public AnonymousIndexedNumEventResponse call(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(ANONYMOUSINDEXEDNUM_EVENT, log);
                AnonymousIndexedNumEventResponse typedResponse = new AnonymousIndexedNumEventResponse();
                typedResponse.log = log;
                typedResponse.u1 = (BigInteger) eventValues.getIndexedValues().get(0).getValue();
                typedResponse.u2 = (BigInteger) eventValues.getIndexedValues().get(1).getValue();
                typedResponse.u3 = (BigInteger) eventValues.getIndexedValues().get(2).getValue();
                typedResponse.u4 = (BigInteger) eventValues.getIndexedValues().get(3).getValue();
                return typedResponse;
            }
        });
    }

    public Observable<AnonymousIndexedNumEventResponse> anonymousIndexedNumEventObservable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        PlatonFilter filter = new PlatonFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(ANONYMOUSINDEXEDNUM_EVENT));
        return anonymousIndexedNumEventObservable(filter);
    }

    public List<ComplexIndexedEventEventResponse> getComplexIndexedEventEvents(TransactionReceipt transactionReceipt) {
        List<Contract.EventValuesWithLog> valueList = extractEventParametersWithLog(COMPLEXINDEXEDEVENT_EVENT, transactionReceipt);
        ArrayList<ComplexIndexedEventEventResponse> responses = new ArrayList<ComplexIndexedEventEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            ComplexIndexedEventEventResponse typedResponse = new ComplexIndexedEventEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.array = (byte[]) eventValues.getIndexedValues().get(0).getValue();
            typedResponse.choice = (BigInteger) eventValues.getIndexedValues().get(1).getValue();
            typedResponse.str = (byte[]) eventValues.getIndexedValues().get(2).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Observable<ComplexIndexedEventEventResponse> complexIndexedEventEventObservable(PlatonFilter filter) {
        return web3j.platonLogObservable(filter).map(new Func1<Log, ComplexIndexedEventEventResponse>() {
            @Override
            public ComplexIndexedEventEventResponse call(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(COMPLEXINDEXEDEVENT_EVENT, log);
                ComplexIndexedEventEventResponse typedResponse = new ComplexIndexedEventEventResponse();
                typedResponse.log = log;
                typedResponse.array = (byte[]) eventValues.getIndexedValues().get(0).getValue();
                typedResponse.choice = (BigInteger) eventValues.getIndexedValues().get(1).getValue();
                typedResponse.str = (byte[]) eventValues.getIndexedValues().get(2).getValue();
                return typedResponse;
            }
        });
    }

    public Observable<ComplexIndexedEventEventResponse> complexIndexedEventEventObservable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        PlatonFilter filter = new PlatonFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(COMPLEXINDEXEDEVENT_EVENT));
        return complexIndexedEventEventObservable(filter);
    }

    public List<EnumEventEventResponse> getEnumEventEvents(TransactionReceipt transactionReceipt) {
        List<Contract.EventValuesWithLog> valueList = extractEventParametersWithLog(ENUMEVENT_EVENT, transactionReceipt);
        ArrayList<EnumEventEventResponse> responses = new ArrayList<EnumEventEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            EnumEventEventResponse typedResponse = new EnumEventEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.choices = (BigInteger) eventValues.getIndexedValues().get(0).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Observable<EnumEventEventResponse> enumEventEventObservable(PlatonFilter filter) {
        return web3j.platonLogObservable(filter).map(new Func1<Log, EnumEventEventResponse>() {
            @Override
            public EnumEventEventResponse call(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(ENUMEVENT_EVENT, log);
                EnumEventEventResponse typedResponse = new EnumEventEventResponse();
                typedResponse.log = log;
                typedResponse.choices = (BigInteger) eventValues.getIndexedValues().get(0).getValue();
                return typedResponse;
            }
        });
    }

    public Observable<EnumEventEventResponse> enumEventEventObservable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        PlatonFilter filter = new PlatonFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(ENUMEVENT_EVENT));
        return enumEventEventObservable(filter);
    }

    public List<MinusEventEventResponse> getMinusEventEvents(TransactionReceipt transactionReceipt) {
        List<Contract.EventValuesWithLog> valueList = extractEventParametersWithLog(MINUSEVENT_EVENT, transactionReceipt);
        ArrayList<MinusEventEventResponse> responses = new ArrayList<MinusEventEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            MinusEventEventResponse typedResponse = new MinusEventEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.minus = (BigInteger) eventValues.getIndexedValues().get(0).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Observable<MinusEventEventResponse> minusEventEventObservable(PlatonFilter filter) {
        return web3j.platonLogObservable(filter).map(new Func1<Log, MinusEventEventResponse>() {
            @Override
            public MinusEventEventResponse call(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(MINUSEVENT_EVENT, log);
                MinusEventEventResponse typedResponse = new MinusEventEventResponse();
                typedResponse.log = log;
                typedResponse.minus = (BigInteger) eventValues.getIndexedValues().get(0).getValue();
                return typedResponse;
            }
        });
    }

    public Observable<MinusEventEventResponse> minusEventEventObservable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        PlatonFilter filter = new PlatonFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(MINUSEVENT_EVENT));
        return minusEventEventObservable(filter);
    }

    public List<OneDimensionalArrayEventEventResponse> getOneDimensionalArrayEventEvents(TransactionReceipt transactionReceipt) {
        List<Contract.EventValuesWithLog> valueList = extractEventParametersWithLog(ONEDIMENSIONALARRAYEVENT_EVENT, transactionReceipt);
        ArrayList<OneDimensionalArrayEventEventResponse> responses = new ArrayList<OneDimensionalArrayEventEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            OneDimensionalArrayEventEventResponse typedResponse = new OneDimensionalArrayEventEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.array = (byte[]) eventValues.getIndexedValues().get(0).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Observable<OneDimensionalArrayEventEventResponse> oneDimensionalArrayEventEventObservable(PlatonFilter filter) {
        return web3j.platonLogObservable(filter).map(new Func1<Log, OneDimensionalArrayEventEventResponse>() {
            @Override
            public OneDimensionalArrayEventEventResponse call(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(ONEDIMENSIONALARRAYEVENT_EVENT, log);
                OneDimensionalArrayEventEventResponse typedResponse = new OneDimensionalArrayEventEventResponse();
                typedResponse.log = log;
                typedResponse.array = (byte[]) eventValues.getIndexedValues().get(0).getValue();
                return typedResponse;
            }
        });
    }

    public Observable<OneDimensionalArrayEventEventResponse> oneDimensionalArrayEventEventObservable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        PlatonFilter filter = new PlatonFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(ONEDIMENSIONALARRAYEVENT_EVENT));
        return oneDimensionalArrayEventEventObservable(filter);
    }

    public List<StringEventEventResponse> getStringEventEvents(TransactionReceipt transactionReceipt) {
        List<Contract.EventValuesWithLog> valueList = extractEventParametersWithLog(STRINGEVENT_EVENT, transactionReceipt);
        ArrayList<StringEventEventResponse> responses = new ArrayList<StringEventEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            StringEventEventResponse typedResponse = new StringEventEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.str = (byte[]) eventValues.getIndexedValues().get(0).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Observable<StringEventEventResponse> stringEventEventObservable(PlatonFilter filter) {
        return web3j.platonLogObservable(filter).map(new Func1<Log, StringEventEventResponse>() {
            @Override
            public StringEventEventResponse call(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(STRINGEVENT_EVENT, log);
                StringEventEventResponse typedResponse = new StringEventEventResponse();
                typedResponse.log = log;
                typedResponse.str = (byte[]) eventValues.getIndexedValues().get(0).getValue();
                return typedResponse;
            }
        });
    }

    public Observable<StringEventEventResponse> stringEventEventObservable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        PlatonFilter filter = new PlatonFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(STRINGEVENT_EVENT));
        return stringEventEventObservable(filter);
    }

    public List<TwoDimensionalArrayEventEventResponse> getTwoDimensionalArrayEventEvents(TransactionReceipt transactionReceipt) {
        List<Contract.EventValuesWithLog> valueList = extractEventParametersWithLog(TWODIMENSIONALARRAYEVENT_EVENT, transactionReceipt);
        ArrayList<TwoDimensionalArrayEventEventResponse> responses = new ArrayList<TwoDimensionalArrayEventEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            TwoDimensionalArrayEventEventResponse typedResponse = new TwoDimensionalArrayEventEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.array = (byte[]) eventValues.getIndexedValues().get(0).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Observable<TwoDimensionalArrayEventEventResponse> twoDimensionalArrayEventEventObservable(PlatonFilter filter) {
        return web3j.platonLogObservable(filter).map(new Func1<Log, TwoDimensionalArrayEventEventResponse>() {
            @Override
            public TwoDimensionalArrayEventEventResponse call(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(TWODIMENSIONALARRAYEVENT_EVENT, log);
                TwoDimensionalArrayEventEventResponse typedResponse = new TwoDimensionalArrayEventEventResponse();
                typedResponse.log = log;
                typedResponse.array = (byte[]) eventValues.getIndexedValues().get(0).getValue();
                return typedResponse;
            }
        });
    }

    public Observable<TwoDimensionalArrayEventEventResponse> twoDimensionalArrayEventEventObservable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        PlatonFilter filter = new PlatonFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(TWODIMENSIONALARRAYEVENT_EVENT));
        return twoDimensionalArrayEventEventObservable(filter);
    }

    public RemoteCall<TransactionReceipt> testAnonymousIndexed() {
        final Function function = new Function(
                FUNC_TESTANONYMOUSINDEXED, 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> testComplex() {
        final Function function = new Function(
                FUNC_TESTCOMPLEX, 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> testEnum() {
        final Function function = new Function(
                FUNC_TESTENUM, 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> testMinus(BigInteger value) {
        final Function function = new Function(
                FUNC_TESTMINUS, 
                Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.generated.Int256(value)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> testOneDimensionalArray() {
        final Function function = new Function(
                FUNC_TESTONEDIMENSIONALARRAY, 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> testStr() {
        final Function function = new Function(
                FUNC_TESTSTR, 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> testTwoDimensionalArray() {
        final Function function = new Function(
                FUNC_TESTTWODIMENSIONALARRAY, 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public static RemoteCall<EventIndexedContract> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return deployRemoteCall(EventIndexedContract.class, web3j, credentials, contractGasProvider, BINARY,  "");
    }

    public static RemoteCall<EventIndexedContract> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return deployRemoteCall(EventIndexedContract.class, web3j, transactionManager, contractGasProvider, BINARY,  "");
    }

    public static EventIndexedContract load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new EventIndexedContract(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static EventIndexedContract load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new EventIndexedContract(contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static class AnonymousIndexedNumEventResponse {
        public Log log;

        public BigInteger u1;

        public BigInteger u2;

        public BigInteger u3;

        public BigInteger u4;
    }

    public static class ComplexIndexedEventEventResponse {
        public Log log;

        public byte[] array;

        public BigInteger choice;

        public byte[] str;
    }

    public static class EnumEventEventResponse {
        public Log log;

        public BigInteger choices;
    }

    public static class MinusEventEventResponse {
        public Log log;

        public BigInteger minus;
    }

    public static class OneDimensionalArrayEventEventResponse {
        public Log log;

        public byte[] array;
    }

    public static class StringEventEventResponse {
        public Log log;

        public byte[] str;
    }

    public static class TwoDimensionalArrayEventEventResponse {
        public Log log;

        public byte[] array;
    }
}
