package network.platon.contracts.evm.v0_8_2;

import com.platon.abi.solidity.EventEncoder;
import com.platon.abi.solidity.TypeReference;
import com.platon.abi.solidity.datatypes.Address;
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
public class CallerTwo extends Contract {
    private static final String BINARY = "608060405234801561001057600080fd5b506105c0806100206000396000f3fe608060405234801561001057600080fd5b50600436106100415760003560e01c80630c55699c14610046578063371303c0146100645780635a3617561461006e575b600080fd5b61004e61008c565b60405161005b919061027b565b60405180910390f35b61006c610092565b005b6100766101a4565b604051610083919061027b565b60405180910390f35b60005481565b60006040516100a0906101ad565b604051809103906000f0801580156100bc573d6000803e3d6000fd5b5090508073ffffffffffffffffffffffffffffffffffffffff167f371303c051bff726100ad13871cababf50c20dd920fca137e519f98f089a74b46040516020016101079190610220565b604051602081830303815290604052604051610123919061023b565b600060405180830381855af49150503d806000811461015e576040519150601f19603f3d011682016040523d82523d6000602084013e610163565b606091505b5050507fb0333e0e3a6b99318e4e2e0d7e5e5f93646f9cbf62da1587955a4092bf7df6e733600054604051610199929190610252565b60405180910390a150565b60008054905090565b61025b8061033083390190565b6101c3816102ac565b82525050565b6101da6101d5826102be565b610325565b82525050565b60006101eb82610296565b6101f581856102a1565b93506102058185602086016102f2565b80840191505092915050565b61021a816102e8565b82525050565b600061022c82846101c9565b60208201915081905092915050565b600061024782846101e0565b915081905092915050565b600060408201905061026760008301856101ba565b6102746020830184610211565b9392505050565b60006020820190506102906000830184610211565b92915050565b600081519050919050565b600081905092915050565b60006102b7826102c8565b9050919050565b6000819050919050565b600073ffffffffffffffffffffffffffffffffffffffff82169050919050565b6000819050919050565b60005b838110156103105780820151818401526020810190506102f5565b8381111561031f576000848401525b50505050565b600081905091905056fe608060405234801561001057600080fd5b5061023b806100206000396000f3fe608060405234801561001057600080fd5b50600436106100415760003560e01c80630c55699c1461004657806317f936fb14610064578063371303c014610082575b600080fd5b61004e61008c565b60405161005b9190610136565b60405180910390f35b61006c610092565b6040516100799190610136565b60405180910390f35b61008a61009b565b005b60005481565b60008054905090565b6000808154809291906100ad9061018d565b91905055507fb0333e0e3a6b99318e4e2e0d7e5e5f93646f9cbf62da1587955a4092bf7df6e7336000546040516100e592919061010d565b60405180910390a1565b6100f881610151565b82525050565b61010781610183565b82525050565b600060408201905061012260008301856100ef565b61012f60208301846100fe565b9392505050565b600060208201905061014b60008301846100fe565b92915050565b600061015c82610163565b9050919050565b600073ffffffffffffffffffffffffffffffffffffffff82169050919050565b6000819050919050565b600061019882610183565b91507fffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff8214156101cb576101ca6101d6565b5b600182019050919050565b7f4e487b7100000000000000000000000000000000000000000000000000000000600052601160045260246000fdfea2646970667358221220772684f8fa91fe3dbb92dd8590932cbfc85e2ab1d82e001c820aa0c6b369d02064736f6c63430008020033a2646970667358221220dc9e7eaaa3d0433dfebcecd63456dbf412ee70231d6a69f5f248679613e8a1c064736f6c63430008020033";

    public static final String FUNC_GETCALLEEX = "getCalleeX";

    public static final String FUNC_INC = "inc";

    public static final String FUNC_X = "x";

    public static final Event EVENTNAME_EVENT = new Event("EventName", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}, new TypeReference<Uint256>() {}));
    ;

    protected CallerTwo(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected CallerTwo(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public List<EventNameEventResponse> getEventNameEvents(TransactionReceipt transactionReceipt) {
        List<Contract.EventValuesWithLog> valueList = extractEventParametersWithLog(EVENTNAME_EVENT, transactionReceipt);
        ArrayList<EventNameEventResponse> responses = new ArrayList<EventNameEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            EventNameEventResponse typedResponse = new EventNameEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.seder = (String) eventValues.getNonIndexedValues().get(0).getValue();
            typedResponse.x = (BigInteger) eventValues.getNonIndexedValues().get(1).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Observable<EventNameEventResponse> eventNameEventObservable(PlatonFilter filter) {
        return web3j.platonLogObservable(filter).map(new Func1<Log, EventNameEventResponse>() {
            @Override
            public EventNameEventResponse call(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(EVENTNAME_EVENT, log);
                EventNameEventResponse typedResponse = new EventNameEventResponse();
                typedResponse.log = log;
                typedResponse.seder = (String) eventValues.getNonIndexedValues().get(0).getValue();
                typedResponse.x = (BigInteger) eventValues.getNonIndexedValues().get(1).getValue();
                return typedResponse;
            }
        });
    }

    public Observable<EventNameEventResponse> eventNameEventObservable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        PlatonFilter filter = new PlatonFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(EVENTNAME_EVENT));
        return eventNameEventObservable(filter);
    }

    public RemoteCall<BigInteger> getCalleeX() {
        final Function function = new Function(FUNC_GETCALLEEX, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<TransactionReceipt> inc() {
        final Function function = new Function(
                FUNC_INC, 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<BigInteger> x() {
        final Function function = new Function(FUNC_X, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public static RemoteCall<CallerTwo> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return deployRemoteCall(CallerTwo.class, web3j, credentials, contractGasProvider, BINARY,  "");
    }

    public static RemoteCall<CallerTwo> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return deployRemoteCall(CallerTwo.class, web3j, transactionManager, contractGasProvider, BINARY,  "");
    }

    public static CallerTwo load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new CallerTwo(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static CallerTwo load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new CallerTwo(contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static class EventNameEventResponse {
        public Log log;

        public String seder;

        public BigInteger x;
    }
}
