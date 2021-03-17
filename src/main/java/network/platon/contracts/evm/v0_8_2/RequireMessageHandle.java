package network.platon.contracts.evm.v0_8_2;

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
    private static final String BINARY = "608060405234801561001057600080fd5b506101a4806100206000396000f3fe608060405234801561001057600080fd5b506004361061002b5760003560e01c8063afcd320e14610030575b600080fd5b61004a600480360381019061004591906100a7565b61004c565b005b600a811061008f576040517f08c379a0000000000000000000000000000000000000000000000000000000008152600401610086906100f3565b60405180910390fd5b50565b6000813590506100a181610157565b92915050565b6000602082840312156100b957600080fd5b60006100c784828501610092565b91505092915050565b60006100dd601883610113565b91506100e88261012e565b602082019050919050565b6000602082019050818103600083015261010c816100d0565b9050919050565b600082825260208201905092915050565b6000819050919050565b7fe695b4e59e8be5a4a7e5b08fe6af94e8be83e5bc82e5b8b80000000000000000600082015250565b61016081610124565b811461016b57600080fd5b5056fea2646970667358221220fed02595b2e00e9f4133290d64cc02c266f98197c6516e2a17612b75a38d42df64736f6c63430008020033";

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
