package network.platon.contracts.evm.v0_6_12;

import com.platon.abi.solidity.TypeReference;
import com.platon.abi.solidity.datatypes.Function;
import com.platon.abi.solidity.datatypes.Type;
import com.platon.crypto.Credentials;
import com.platon.protocol.Web3j;
import com.platon.protocol.core.RemoteCall;
import com.platon.protocol.core.methods.response.TransactionReceipt;
import com.platon.tx.Contract;
import com.platon.tx.TransactionManager;
import com.platon.tx.gas.GasProvider;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://github.com/PlatONnetwork/client-sdk-java/releases">platon-web3j command line tools</a>,
 * or the com.platon.codegen.SolidityFunctionWrapperGenerator in the 
 * <a href="https://github.com/PlatONnetwork/client-sdk-java/tree/master/codegen">codegen module</a> to update.
 *
 * <p>Generated with web3j version 0.15.1.7.
 */
public class RequireMessageHandle extends Contract {
    private static final String BINARY = "608060405234801561001057600080fd5b50610106806100206000396000f3fe6080604052348015600f57600080fd5b506004361060285760003560e01c8063afcd320e14602d575b600080fd5b605660048036036020811015604157600080fd5b81019080803590602001909291905050506058565b005b600a811060cd576040517f08c379a00000000000000000000000000000000000000000000000000000000081526004018080602001828103825260188152602001807fe695b4e59e8be5a4a7e5b08fe6af94e8be83e5bc82e5b8b8000000000000000081525060200191505060405180910390fd5b5056fea2646970667358221220fddd265fec05f267a8df28322696e036e6665ceb3ea8911982e7f0a87f1e847d64736f6c634300060c0033";

    public static final String FUNC_PARAMEXCEPTION = "paramException";

    protected RequireMessageHandle(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected RequireMessageHandle(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteCall<TransactionReceipt> paramException(BigInteger param) {
        final Function function = new Function(
                FUNC_PARAMEXCEPTION, 
                Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.generated.Uint256(param)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public static RemoteCall<RequireMessageHandle> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return deployRemoteCall(RequireMessageHandle.class, web3j, credentials, contractGasProvider, BINARY,  "");
    }

    public static RemoteCall<RequireMessageHandle> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return deployRemoteCall(RequireMessageHandle.class, web3j, transactionManager, contractGasProvider, BINARY,  "");
    }

    public static RequireMessageHandle load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new RequireMessageHandle(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static RequireMessageHandle load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new RequireMessageHandle(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
