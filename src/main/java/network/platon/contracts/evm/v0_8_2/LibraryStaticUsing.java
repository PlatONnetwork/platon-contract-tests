package network.platon.contracts.evm.v0_8_2;

import com.platon.abi.solidity.EventEncoder;
import com.platon.abi.solidity.TypeReference;
import com.platon.abi.solidity.datatypes.Bool;
import com.platon.abi.solidity.datatypes.Event;
import com.platon.abi.solidity.datatypes.Function;
import com.platon.abi.solidity.datatypes.Type;
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
public class LibraryStaticUsing extends Contract {
    private static final String BINARY = "608060405234801561001057600080fd5b506102a3806100206000396000f3fe608060405234801561001057600080fd5b506004361061002b5760003560e01c8063f207564e14610030575b600080fd5b61004a6004803603810190610045919061017d565b610060565b60405161005791906101d3565b60405180910390f35b600073__$32a723c7b8c64ae9bea5d445db6cb0a12a$__63f360234c607b846040518363ffffffff1660e01b815260040161009c9291906101ee565b60206040518083038186803b1580156100b457600080fd5b505af41580156100c8573d6000803e3d6000fd5b505050506040513d601f19601f820116820180604052508101906100ec9190610154565b90507f0b3bdb70bcb1393d4319be3261bd6ab95e2ea1665e718029d24cecca39e84ccc8160405161011d91906101d3565b60405180910390a1919050565b6000815190506101398161023f565b92915050565b60008135905061014e81610256565b92915050565b60006020828403121561016657600080fd5b60006101748482850161012a565b91505092915050565b60006020828403121561018f57600080fd5b600061019d8482850161013f565b91505092915050565b6101af81610217565b82525050565b6101be8161022d565b82525050565b6101cd81610223565b82525050565b60006020820190506101e860008301846101a6565b92915050565b600060408201905061020360008301856101b5565b61021060208301846101c4565b9392505050565b60008115159050919050565b6000819050919050565b600061023882610223565b9050919050565b61024881610217565b811461025357600080fd5b50565b61025f81610223565b811461026a57600080fd5b5056fea264697066735822122054ab202207427bbe1a758eb519e035ec1ffc77374be26d357f1bddd19cca915064736f6c63430008020033\n"
            + "\n"
            + "// $32a723c7b8c64ae9bea5d445db6cb0a12a$ -> /home/platon/.jenkins/workspace/contracts_test_alaya/src/test/resources/contracts/evm/0.8.2/9.library/LibraryStaticUsing.sol:BaseStaticLibrary";

    public static final String FUNC_REGISTER = "register";

    public static final Event RESULT_EVENT = new Event("Result", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}));
    ;

    protected LibraryStaticUsing(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected LibraryStaticUsing(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public List<ResultEventResponse> getResultEvents(TransactionReceipt transactionReceipt) {
        List<Contract.EventValuesWithLog> valueList = extractEventParametersWithLog(RESULT_EVENT, transactionReceipt);
        ArrayList<ResultEventResponse> responses = new ArrayList<ResultEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            ResultEventResponse typedResponse = new ResultEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.result = (Boolean) eventValues.getNonIndexedValues().get(0).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Observable<ResultEventResponse> resultEventObservable(PlatonFilter filter) {
        return web3j.platonLogObservable(filter).map(new Func1<Log, ResultEventResponse>() {
            @Override
            public ResultEventResponse call(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(RESULT_EVENT, log);
                ResultEventResponse typedResponse = new ResultEventResponse();
                typedResponse.log = log;
                typedResponse.result = (Boolean) eventValues.getNonIndexedValues().get(0).getValue();
                return typedResponse;
            }
        });
    }

    public Observable<ResultEventResponse> resultEventObservable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        PlatonFilter filter = new PlatonFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(RESULT_EVENT));
        return resultEventObservable(filter);
    }

    public RemoteCall<TransactionReceipt> register(BigInteger value) {
        final Function function = new Function(
                FUNC_REGISTER, 
                Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.generated.Uint256(value)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public static RemoteCall<LibraryStaticUsing> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return deployRemoteCall(LibraryStaticUsing.class, web3j, credentials, contractGasProvider, BINARY,  "");
    }

    public static RemoteCall<LibraryStaticUsing> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return deployRemoteCall(LibraryStaticUsing.class, web3j, transactionManager, contractGasProvider, BINARY,  "");
    }

    public static LibraryStaticUsing load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new LibraryStaticUsing(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static LibraryStaticUsing load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new LibraryStaticUsing(contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static class ResultEventResponse {
        public Log log;

        public Boolean result;
    }
}
