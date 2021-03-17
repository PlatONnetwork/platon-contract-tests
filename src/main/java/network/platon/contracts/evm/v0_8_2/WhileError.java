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
public class WhileError extends Contract {
    private static final String BINARY = "608060405234801561001057600080fd5b5060f68061001f6000396000f3fe6080604052348015600f57600080fd5b506004361060285760003560e01c8063ed6f916c14602d575b600080fd5b60336047565b604051603e9190609b565b60405180910390f35b6000806050606a565b90508060000160009054906101000a900460ff1691505090565b60005b600090508060000160009054906101000a900460ff1615608b57606d565b90565b60958160b4565b82525050565b600060208201905060ae6000830184608e565b92915050565b6000811515905091905056fea2646970667358221220d03895a1e55f08bf93e310fc64b97e6e0288ddc45872f964c9aa496fa91197b164736f6c63430008020033";

    public static final String FUNC_GETWHILECONTROLRES = "getWhileControlRes";

    protected WhileError(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected WhileError(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteCall<Boolean> getWhileControlRes() {
        final Function function = new Function(FUNC_GETWHILECONTROLRES, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}));
        return executeRemoteCallSingleValueReturn(function, Boolean.class);
    }

    public static RemoteCall<WhileError> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return deployRemoteCall(WhileError.class, web3j, credentials, contractGasProvider, BINARY,  "");
    }

    public static RemoteCall<WhileError> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return deployRemoteCall(WhileError.class, web3j, transactionManager, contractGasProvider, BINARY,  "");
    }

    public static WhileError load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new WhileError(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static WhileError load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new WhileError(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
