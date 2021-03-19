package network.platon.contracts.evm.v0_4_26;

import com.platon.abi.solidity.FunctionEncoder;
import com.platon.abi.solidity.datatypes.Type;
import com.platon.crypto.Credentials;
import com.platon.protocol.Web3j;
import com.platon.protocol.core.RemoteCall;
import com.platon.tx.Contract;
import com.platon.tx.TransactionManager;
import com.platon.tx.gas.GasProvider;
import java.math.BigInteger;
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
public class BaseDefault extends Contract {
    private static final String BINARY = "6080604052348015600f57600080fd5b50604051602080607b83398101806040528101908080519060200190929190505050806000819055505060358060466000396000f3006080604052600080fd00a165627a7a723058200846d02c1570805a7a18d62e293a28c10230e17a02bc30f24197c4ef8ecc4cbd0029";

    protected BaseDefault(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected BaseDefault(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static RemoteCall<BaseDefault> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider, BigInteger _x) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.generated.Uint256(_x)));
        return deployRemoteCall(BaseDefault.class, web3j, credentials, contractGasProvider, BINARY, encodedConstructor);
    }

    public static RemoteCall<BaseDefault> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider, BigInteger _x) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.generated.Uint256(_x)));
        return deployRemoteCall(BaseDefault.class, web3j, transactionManager, contractGasProvider, BINARY, encodedConstructor);
    }

    public static BaseDefault load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new BaseDefault(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static BaseDefault load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new BaseDefault(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
