package network.platon.contracts.evm.v0_8_2;

import com.platon.abi.solidity.EventEncoder;
import com.platon.abi.solidity.TypeReference;
import com.platon.abi.solidity.datatypes.Address;
import com.platon.abi.solidity.datatypes.Bool;
import com.platon.abi.solidity.datatypes.Event;
import com.platon.abi.solidity.datatypes.Function;
import com.platon.abi.solidity.datatypes.Type;
import com.platon.abi.solidity.datatypes.generated.Uint256;
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
public class EventCallContract extends Contract {
    private static final String BINARY = "608060405234801561001057600080fd5b5061052d806100206000396000f3fe608060405234801561001057600080fd5b50600436106100575760003560e01c806336aacafa1461005c5780637b0cb839146100665780639d6d4cde14610084578063b53c846b146100a2578063b7301a1f146100ac575b600080fd5b6100646100ca565b005b61006e6101d9565b60405161007b91906103d9565b60405180910390f35b61008c610224565b60405161009991906103d9565b60405180910390f35b6100aa61024e565b005b6100b4610295565b6040516100c191906103d9565b60405180910390f35b7f9f252e5d94c6346e0073dfdaa81c6bba97bc07b05f8378efc62d77d157e1b01160006040516100fa919061036d565b60405180910390a17f9f252e5d94c6346e0073dfdaa81c6bba97bc07b05f8378efc62d77d157e1b0116001604051610132919061036d565b60405180910390a17ffc3a67c9f0b5967ae4041ed898b05ec1fa49d2a3c22336247201d71be6f97120336040516101699190610352565b60405180910390a1600c6040516101809190610388565b60405180910390a03373ffffffffffffffffffffffffffffffffffffffff167fe1fffcc4923d04b559f4d29a8bfc6cda04eb5b0d3c460751c2402c5c5cc9109c600c6040516101cf9190610388565b60405180910390a2565b60007ffc3a67c9f0b5967ae4041ed898b05ec1fa49d2a3c22336247201d71be6f971203360405161020a9190610352565b60405180910390a160018161021f91906103f4565b905090565b600060018161023391906103f4565b90508060405161024391906103d9565b60405180910390a090565b600c60405161025d9190610388565b60405180910390a0600d60405161027491906103a3565b60405180910390a0600e60405161028b91906103be565b60405180910390a0565b60003373ffffffffffffffffffffffffffffffffffffffff167fe1fffcc4923d04b559f4d29a8bfc6cda04eb5b0d3c460751c2402c5c5cc9109c600c6040516102de9190610388565b60405180910390a26001816102f391906103f4565b905090565b6103018161044a565b82525050565b6103108161045c565b82525050565b61031f81610492565b82525050565b61032e816104a4565b82525050565b61033d816104b6565b82525050565b61034c81610488565b82525050565b600060208201905061036760008301846102f8565b92915050565b60006020820190506103826000830184610307565b92915050565b600060208201905061039d6000830184610316565b92915050565b60006020820190506103b86000830184610325565b92915050565b60006020820190506103d36000830184610334565b92915050565b60006020820190506103ee6000830184610343565b92915050565b60006103ff82610488565b915061040a83610488565b9250827fffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff0382111561043f5761043e6104c8565b5b828201905092915050565b600061045582610468565b9050919050565b60008115159050919050565b600073ffffffffffffffffffffffffffffffffffffffff82169050919050565b6000819050919050565b600061049d82610488565b9050919050565b60006104af82610488565b9050919050565b60006104c182610488565b9050919050565b7f4e487b7100000000000000000000000000000000000000000000000000000000600052601160045260246000fdfea26469706673582212200c732972ff13494febe41142cc8cc3a9c5ab81999de9a3f36be8f6292406fd6664736f6c63430008020033";

    public static final String FUNC_ANONYMOUSEVENT = "anonymousEvent";

    public static final String FUNC_EMITEVENT = "emitEvent";

    public static final String FUNC_INDEXEDEVENT = "indexedEvent";

    public static final String FUNC_TESTBOOL = "testBool";

    public static final String FUNC_TESTMULTIANONYMOUS = "testMultiAnonymous";

    public static final Event ANONYMOUS_EVENT = new Event("Anonymous", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
    ;

    public static final Event ANONYMOUS2_EVENT = new Event("Anonymous2", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
    ;

    public static final Event BOOLEVENT_EVENT = new Event("BoolEvent", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}));
    ;

    public static final Event DEPOSIT_EVENT = new Event("Deposit", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Address>(true) {}, new TypeReference<Uint256>() {}));
    ;

    public static final Event INCREMENT_EVENT = new Event("Increment", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
    ;

    protected EventCallContract(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected EventCallContract(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public List<AnonymousEventResponse> getAnonymousEvents(TransactionReceipt transactionReceipt) {
        List<Contract.EventValuesWithLog> valueList = extractEventParametersWithLog(ANONYMOUS_EVENT, transactionReceipt);
        ArrayList<AnonymousEventResponse> responses = new ArrayList<AnonymousEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            AnonymousEventResponse typedResponse = new AnonymousEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse._id = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Observable<AnonymousEventResponse> anonymousEventObservable(PlatonFilter filter) {
        return web3j.platonLogObservable(filter).map(new Func1<Log, AnonymousEventResponse>() {
            @Override
            public AnonymousEventResponse call(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(ANONYMOUS_EVENT, log);
                AnonymousEventResponse typedResponse = new AnonymousEventResponse();
                typedResponse.log = log;
                typedResponse._id = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
                return typedResponse;
            }
        });
    }

    public Observable<AnonymousEventResponse> anonymousEventObservable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        PlatonFilter filter = new PlatonFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(ANONYMOUS_EVENT));
        return anonymousEventObservable(filter);
    }

    public List<Anonymous2EventResponse> getAnonymous2Events(TransactionReceipt transactionReceipt) {
        List<Contract.EventValuesWithLog> valueList = extractEventParametersWithLog(ANONYMOUS2_EVENT, transactionReceipt);
        ArrayList<Anonymous2EventResponse> responses = new ArrayList<Anonymous2EventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            Anonymous2EventResponse typedResponse = new Anonymous2EventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse._id = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Observable<Anonymous2EventResponse> anonymous2EventObservable(PlatonFilter filter) {
        return web3j.platonLogObservable(filter).map(new Func1<Log, Anonymous2EventResponse>() {
            @Override
            public Anonymous2EventResponse call(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(ANONYMOUS2_EVENT, log);
                Anonymous2EventResponse typedResponse = new Anonymous2EventResponse();
                typedResponse.log = log;
                typedResponse._id = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
                return typedResponse;
            }
        });
    }

    public Observable<Anonymous2EventResponse> anonymous2EventObservable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        PlatonFilter filter = new PlatonFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(ANONYMOUS2_EVENT));
        return anonymous2EventObservable(filter);
    }

    public List<BoolEventEventResponse> getBoolEventEvents(TransactionReceipt transactionReceipt) {
        List<Contract.EventValuesWithLog> valueList = extractEventParametersWithLog(BOOLEVENT_EVENT, transactionReceipt);
        ArrayList<BoolEventEventResponse> responses = new ArrayList<BoolEventEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            BoolEventEventResponse typedResponse = new BoolEventEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.result = (Boolean) eventValues.getNonIndexedValues().get(0).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Observable<BoolEventEventResponse> boolEventEventObservable(PlatonFilter filter) {
        return web3j.platonLogObservable(filter).map(new Func1<Log, BoolEventEventResponse>() {
            @Override
            public BoolEventEventResponse call(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(BOOLEVENT_EVENT, log);
                BoolEventEventResponse typedResponse = new BoolEventEventResponse();
                typedResponse.log = log;
                typedResponse.result = (Boolean) eventValues.getNonIndexedValues().get(0).getValue();
                return typedResponse;
            }
        });
    }

    public Observable<BoolEventEventResponse> boolEventEventObservable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        PlatonFilter filter = new PlatonFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(BOOLEVENT_EVENT));
        return boolEventEventObservable(filter);
    }

    public List<DepositEventResponse> getDepositEvents(TransactionReceipt transactionReceipt) {
        List<Contract.EventValuesWithLog> valueList = extractEventParametersWithLog(DEPOSIT_EVENT, transactionReceipt);
        ArrayList<DepositEventResponse> responses = new ArrayList<DepositEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            DepositEventResponse typedResponse = new DepositEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse._from = (String) eventValues.getIndexedValues().get(0).getValue();
            typedResponse._value = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Observable<DepositEventResponse> depositEventObservable(PlatonFilter filter) {
        return web3j.platonLogObservable(filter).map(new Func1<Log, DepositEventResponse>() {
            @Override
            public DepositEventResponse call(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(DEPOSIT_EVENT, log);
                DepositEventResponse typedResponse = new DepositEventResponse();
                typedResponse.log = log;
                typedResponse._from = (String) eventValues.getIndexedValues().get(0).getValue();
                typedResponse._value = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
                return typedResponse;
            }
        });
    }

    public Observable<DepositEventResponse> depositEventObservable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        PlatonFilter filter = new PlatonFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(DEPOSIT_EVENT));
        return depositEventObservable(filter);
    }

    public List<IncrementEventResponse> getIncrementEvents(TransactionReceipt transactionReceipt) {
        List<Contract.EventValuesWithLog> valueList = extractEventParametersWithLog(INCREMENT_EVENT, transactionReceipt);
        ArrayList<IncrementEventResponse> responses = new ArrayList<IncrementEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            IncrementEventResponse typedResponse = new IncrementEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.who = (String) eventValues.getNonIndexedValues().get(0).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Observable<IncrementEventResponse> incrementEventObservable(PlatonFilter filter) {
        return web3j.platonLogObservable(filter).map(new Func1<Log, IncrementEventResponse>() {
            @Override
            public IncrementEventResponse call(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(INCREMENT_EVENT, log);
                IncrementEventResponse typedResponse = new IncrementEventResponse();
                typedResponse.log = log;
                typedResponse.who = (String) eventValues.getNonIndexedValues().get(0).getValue();
                return typedResponse;
            }
        });
    }

    public Observable<IncrementEventResponse> incrementEventObservable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        PlatonFilter filter = new PlatonFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(INCREMENT_EVENT));
        return incrementEventObservable(filter);
    }

    public RemoteCall<TransactionReceipt> anonymousEvent() {
        final Function function = new Function(
                FUNC_ANONYMOUSEVENT, 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> emitEvent() {
        final Function function = new Function(
                FUNC_EMITEVENT, 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> indexedEvent() {
        final Function function = new Function(
                FUNC_INDEXEDEVENT, 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> testBool() {
        final Function function = new Function(
                FUNC_TESTBOOL, 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> testMultiAnonymous() {
        final Function function = new Function(
                FUNC_TESTMULTIANONYMOUS, 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public static RemoteCall<EventCallContract> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return deployRemoteCall(EventCallContract.class, web3j, credentials, contractGasProvider, BINARY,  "");
    }

    public static RemoteCall<EventCallContract> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return deployRemoteCall(EventCallContract.class, web3j, transactionManager, contractGasProvider, BINARY,  "");
    }

    public static EventCallContract load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new EventCallContract(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static EventCallContract load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new EventCallContract(contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static class AnonymousEventResponse {
        public Log log;

        public BigInteger _id;
    }

    public static class Anonymous2EventResponse {
        public Log log;

        public BigInteger _id;
    }

    public static class BoolEventEventResponse {
        public Log log;

        public Boolean result;
    }

    public static class DepositEventResponse {
        public Log log;

        public String _from;

        public BigInteger _value;
    }

    public static class IncrementEventResponse {
        public Log log;

        public String who;
    }
}
