package network.platon.contracts.evm.v0_8_2;

import com.platon.abi.solidity.EventEncoder;
import com.platon.abi.solidity.TypeReference;
import com.platon.abi.solidity.datatypes.DynamicArray;
import com.platon.abi.solidity.datatypes.Event;
import com.platon.abi.solidity.datatypes.Function;
import com.platon.abi.solidity.datatypes.Type;
import com.platon.abi.solidity.datatypes.Utf8String;
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
public class EventTypeContract extends Contract {
    private static final String BINARY = "60806040526040518060a00160405280600060ff168152602001600160ff168152602001600260ff168152602001600360ff168152602001600460ff1681525060009060056200005192919062000180565b506040518060c001604052806040518060400160405280600060ff168152602001600060ff1681525081526020016040518060400160405280600060ff168152602001600160ff1681525081526020016040518060400160405280600060ff168152602001600260ff1681525081526020016040518060400160405280600060ff168152602001600360ff1681525081526020016040518060400160405280600060ff168152602001600460ff1681525081526020016040518060400160405280600060ff168152602001600560ff16815250815250600190600662000139929190620001d7565b50604051806080016040528060588152602001620009cd60589139600290805190602001906200016b9291906200023c565b503480156200017957600080fd5b50620003d1565b828054828255906000526020600020908101928215620001c4579160200282015b82811115620001c3578251829060ff16905591602001919060010190620001a1565b5b509050620001d39190620002cd565b5090565b82805482825590600052602060002090600202810192821562000229579160200282015b82811115620002285782518290600262000217929190620002ec565b5091602001919060020190620001fb565b5b50905062000238919062000336565b5090565b8280546200024a906200036c565b90600052602060002090601f0160209004810192826200026e5760008555620002ba565b82601f106200028957805160ff1916838001178555620002ba565b82800160010185558215620002ba579182015b82811115620002b95782518255916020019190600101906200029c565b5b509050620002c99190620002cd565b5090565b5b80821115620002e8576000816000905550600101620002ce565b5090565b826002810192821562000323579160200282015b8281111562000322578251829060ff1690559160200191906001019062000300565b5b509050620003329190620002cd565b5090565b5b808211156200035a57600081816200035091906200035e565b5060020162000337565b5090565b506000815560010160009055565b600060028204905060018216806200038557607f821691505b602082108114156200039c576200039b620003a2565b5b50919050565b7f4e487b7100000000000000000000000000000000000000000000000000000000600052602260045260246000fd5b6105ec80620003e16000396000f3fe608060405234801561001057600080fd5b506004361061004c5760003560e01c80633ac559931461005157806343ae41d81461005b578063b05dfcf814610065578063bbd847af1461006f575b600080fd5b610059610079565b005b6100636100b3565b005b61006d6100ed565b005b610077610127565b005b7f617cf8a4400dd7963ed519ebe655a16e8da1282bb8fea36a21f634af912f54ab60026040516100a991906103ae565b60405180910390a1565b7fde7a62815e0b38238b6211179d7d98017a99227a90823b0f44227e81dd3ad9c260006040516100e39190610393565b60405180910390a1565b7f38a323fa24260bbb8b86f61cd1d8c1900024088af6d08eda9e2d793da33c1b58600060405161011d9190610371565b60405180910390a1565b7f406715adbc90cbc793dcd5707190ad1390229b2a75cf5b5ca228b518ae52de9a6001604051610157919061034f565b60405180910390a1565b600061016d83836101ee565b60408301905092915050565b60006101858383610340565b60208301905092915050565b600061019c82610419565b6101a68185610461565b93506101b1836103d0565b8060005b838110156101e157816101c88882610161565b97506101d38361043a565b9250506001810190506101b5565b5085935050505092915050565b6101f781610424565b6102018184610472565b925061020c826103e5565b8060005b838110156102445761022182610582565b61022b8782610179565b965061023683610447565b925050600181019050610210565b505050505050565b60006102578261042f565b610261818561047d565b935061026c836103ef565b8060005b838110156102a45761028182610582565b61028b8882610179565b975061029683610454565b925050600181019050610270565b5085935050505092915050565b6102ba816104c6565b82525050565b600081546102cd816104d8565b6102d7818661048e565b945060018216600081146102f2576001811461030457610337565b60ff1983168652602086019350610337565b61030d85610404565b60005b8381101561032f57815481890152600182019150602081019050610310565b808801955050505b50505092915050565b610349816104bc565b82525050565b600060208201905081810360008301526103698184610191565b905092915050565b6000602082019050818103600083015261038b818461024c565b905092915050565b60006020820190506103a860008301846102b1565b92915050565b600060208201905081810360008301526103c881846102c0565b905092915050565b60008190508160005260206000209050919050565b6000819050919050565b60008190508160005260206000209050919050565b60008190508160005260206000209050919050565b600081549050919050565b600060029050919050565b600081549050919050565b6000600282019050919050565b6000600182019050919050565b6000600182019050919050565b600082825260208201905092915050565b600081905092915050565b600082825260208201905092915050565b600082825260208201905092915050565b6000819050919050565b60008190506104b7826105a2565b919050565b6000819050919050565b60006104d1826104a9565b9050919050565b600060028204905060018216806104f057607f821691505b6020821081141561050457610503610553565b5b50919050565b600061051d61051883610595565b61049f565b9050919050565b7f4e487b7100000000000000000000000000000000000000000000000000000000600052602160045260246000fd5b7f4e487b7100000000000000000000000000000000000000000000000000000000600052602260045260246000fd5b600061058e825461050a565b9050919050565b60008160001c9050919050565b600481106105b3576105b2610524565b5b5056fea2646970667358221220314697a405412e8cc12da35db389d76d21c51df7d77312d89f3463e66c182c8d64736f6c6343000802003331323334353637383930303937383635343332313132333435363738393030393837363534333231313233343536373839303039373634333534363636363633323432343434343434343434343735383331353436383536";

    public static final String FUNC_TESTENUM = "testEnum";

    public static final String FUNC_TESTONEDIMENSIONALARRAY = "testOneDimensionalArray";

    public static final String FUNC_TESTSTR = "testStr";

    public static final String FUNC_TESTTWODIMENSIONALARRAY = "testTwoDimensionalArray";

    public static final Event ENUMEVENT_EVENT = new Event("EnumEvent", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Uint8>() {}));
    ;

    public static final Event ONEDIMENSIONALARRAYEVENT_EVENT = new Event("OneDimensionalArrayEvent", 
            Arrays.<TypeReference<?>>asList(new TypeReference<DynamicArray<Uint256>>() {}));
    ;

    public static final Event STRINGEVENT_EVENT = new Event("StringEvent", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
    ;

    public static final Event TWODIMENSIONALARRAYEVENT_EVENT = new Event("TwoDimensionalArrayEvent", 
            Arrays.<TypeReference<?>>asList(new TypeReference<DynamicArray<StaticArray2<Uint256>>>() {}));
    ;

    protected EventTypeContract(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected EventTypeContract(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public List<EnumEventEventResponse> getEnumEventEvents(TransactionReceipt transactionReceipt) {
        List<Contract.EventValuesWithLog> valueList = extractEventParametersWithLog(ENUMEVENT_EVENT, transactionReceipt);
        ArrayList<EnumEventEventResponse> responses = new ArrayList<EnumEventEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            EnumEventEventResponse typedResponse = new EnumEventEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.choices = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
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
                typedResponse.choices = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
                return typedResponse;
            }
        });
    }

    public Observable<EnumEventEventResponse> enumEventEventObservable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        PlatonFilter filter = new PlatonFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(ENUMEVENT_EVENT));
        return enumEventEventObservable(filter);
    }

    public List<OneDimensionalArrayEventEventResponse> getOneDimensionalArrayEventEvents(TransactionReceipt transactionReceipt) {
        List<Contract.EventValuesWithLog> valueList = extractEventParametersWithLog(ONEDIMENSIONALARRAYEVENT_EVENT, transactionReceipt);
        ArrayList<OneDimensionalArrayEventEventResponse> responses = new ArrayList<OneDimensionalArrayEventEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            OneDimensionalArrayEventEventResponse typedResponse = new OneDimensionalArrayEventEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.array = (List<BigInteger>) eventValues.getNonIndexedValues().get(0).getValue();
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
                typedResponse.array = (List<BigInteger>) eventValues.getNonIndexedValues().get(0).getValue();
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
            typedResponse.str = (String) eventValues.getNonIndexedValues().get(0).getValue();
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
                typedResponse.str = (String) eventValues.getNonIndexedValues().get(0).getValue();
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
            typedResponse.array = (List<List<BigInteger>>) eventValues.getNonIndexedValues().get(0).getValue();
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
                typedResponse.array = (List<List<BigInteger>>) eventValues.getNonIndexedValues().get(0).getValue();
                return typedResponse;
            }
        });
    }

    public Observable<TwoDimensionalArrayEventEventResponse> twoDimensionalArrayEventEventObservable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        PlatonFilter filter = new PlatonFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(TWODIMENSIONALARRAYEVENT_EVENT));
        return twoDimensionalArrayEventEventObservable(filter);
    }

    public RemoteCall<TransactionReceipt> testEnum() {
        final Function function = new Function(
                FUNC_TESTENUM, 
                Arrays.<Type>asList(), 
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

    public static RemoteCall<EventTypeContract> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return deployRemoteCall(EventTypeContract.class, web3j, credentials, contractGasProvider, BINARY,  "");
    }

    public static RemoteCall<EventTypeContract> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return deployRemoteCall(EventTypeContract.class, web3j, transactionManager, contractGasProvider, BINARY,  "");
    }

    public static EventTypeContract load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new EventTypeContract(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static EventTypeContract load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new EventTypeContract(contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static class EnumEventEventResponse {
        public Log log;

        public BigInteger choices;
    }

    public static class OneDimensionalArrayEventEventResponse {
        public Log log;

        public List<BigInteger> array;
    }

    public static class StringEventEventResponse {
        public Log log;

        public String str;
    }

    public static class TwoDimensionalArrayEventEventResponse {
        public Log log;

        public List<List<BigInteger>> array;
    }
}
