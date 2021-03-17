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
public class LibraryUsingFor extends Contract {
    private static final String BINARY = "608060405234801561001057600080fd5b5061028a806100206000396000f3fe608060405234801561001057600080fd5b506004361061002b5760003560e01c8063f207564e14610030575b600080fd5b61004a6004803603810190610045919061017e565b610060565b60405161005791906101cc565b60405180910390f35b60008073__$6f453310acfa5b9ed2a68561e527281bb1$__637ae1e0589091846040518363ffffffff1660e01b815260040161009d9291906101e7565b60206040518083038186803b1580156100b557600080fd5b505af41580156100c9573d6000803e3d6000fd5b505050506040513d601f19601f820116820180604052508101906100ed9190610155565b90507f0b3bdb70bcb1393d4319be3261bd6ab95e2ea1665e718029d24cecca39e84ccc8160405161011e91906101cc565b60405180910390a1919050565b60008151905061013a81610226565b92915050565b60008135905061014f8161023d565b92915050565b60006020828403121561016757600080fd5b60006101758482850161012b565b91505092915050565b60006020828403121561019057600080fd5b600061019e84828501610140565b91505092915050565b6101b081610210565b82525050565b8082525050565b6101c68161021c565b82525050565b60006020820190506101e160008301846101a7565b92915050565b60006040820190506101fc60008301856101b6565b61020960208301846101bd565b9392505050565b60008115159050919050565b6000819050919050565b61022f81610210565b811461023a57600080fd5b50565b6102468161021c565b811461025157600080fd5b5056fea264697066735822122078f0599a03032c1df8eae06d814d99b7f09c236e0a75f4e26788bd6aad2b05c064736f6c63430008020033\n"
            + "\n"
            + "// $6f453310acfa5b9ed2a68561e527281bb1$ -> /home/platon/.jenkins/workspace/contracts_test_alaya/src/test/resources/contracts/evm/0.8.2/9.library/LibraryUsingFor.sol:BaseLibrary";

    public static final String FUNC_REGISTER = "register";

    public static final Event RESULT_EVENT = new Event("Result", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}));
    ;

    protected LibraryUsingFor(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected LibraryUsingFor(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
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

    public static RemoteCall<LibraryUsingFor> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return deployRemoteCall(LibraryUsingFor.class, web3j, credentials, contractGasProvider, BINARY,  "");
    }

    public static RemoteCall<LibraryUsingFor> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return deployRemoteCall(LibraryUsingFor.class, web3j, transactionManager, contractGasProvider, BINARY,  "");
    }

    public static LibraryUsingFor load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new LibraryUsingFor(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static LibraryUsingFor load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new LibraryUsingFor(contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static class ResultEventResponse {
        public Log log;

        public Boolean result;
    }
}
