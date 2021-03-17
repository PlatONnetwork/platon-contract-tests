package network.platon.contracts.evm.v0_8_2;

import com.platon.abi.solidity.TypeReference;
import com.platon.abi.solidity.datatypes.Bool;
import com.platon.abi.solidity.datatypes.Function;
import com.platon.abi.solidity.datatypes.Type;
import com.platon.crypto.Credentials;
import com.platon.protocol.Web3j;
import com.platon.protocol.core.RemoteCall;
import com.platon.tx.Contract;
import com.platon.tx.TransactionManager;
import com.platon.tx.gas.GasProvider;
import java.util.Arrays;

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://github.com/PlatONnetwork/client-sdk-java/releases">platon-web3j command line tools</a>,
 * or the com.platon.codegen.SolidityFunctionWrapperGenerator in the 
 * <a href="https://github.com/PlatONnetwork/client-sdk-java/tree/master/codegen">codegen module</a> to update.
 *
 * <p>Generated with web3j version 0.15.1.7.
 */
public class ForError extends Contract {
    private static final String BINARY = "608060405234801561001057600080fd5b5061017c806100206000396000f3fe608060405234801561001057600080fd5b50600436106100365760003560e01c8063895e3ada1461003b578063ec56ae5d14610059575b600080fd5b610043610077565b604051610050919061011f565b60405180910390f35b61006161009c565b60405161006e919061011f565b60405180910390f35b6000806100826100c1565b90508060000160009054906101000a900460ff1691505090565b6000806100a76100ea565b90508060000160009054906101000a900460ff1691505090565b60005b600115158160000160009054906101000a900460ff16151514156100e7576100c4565b90565b60005b600190508060000160009054906101000a900460ff161561010d576100ed565b90565b6101198161013a565b82525050565b60006020820190506101346000830184610110565b92915050565b6000811515905091905056fea2646970667358221220bda654d49db85e435e893e513a1d60c3b5aaedaf2468cdff64efe49306d2d89964736f6c63430008020033";

    public static final String FUNC_GETFORCONTROLRES = "getForControlRes";

    public static final String FUNC_GETFORCONTROLRES1 = "getForControlRes1";

    protected ForError(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected ForError(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteCall<Boolean> getForControlRes() {
        final Function function = new Function(FUNC_GETFORCONTROLRES, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}));
        return executeRemoteCallSingleValueReturn(function, Boolean.class);
    }

    public RemoteCall<Boolean> getForControlRes1() {
        final Function function = new Function(FUNC_GETFORCONTROLRES1, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}));
        return executeRemoteCallSingleValueReturn(function, Boolean.class);
    }

    public static RemoteCall<ForError> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return deployRemoteCall(ForError.class, web3j, credentials, contractGasProvider, BINARY,  "");
    }

    public static RemoteCall<ForError> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return deployRemoteCall(ForError.class, web3j, transactionManager, contractGasProvider, BINARY,  "");
    }

    public static ForError load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new ForError(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static ForError load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new ForError(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
