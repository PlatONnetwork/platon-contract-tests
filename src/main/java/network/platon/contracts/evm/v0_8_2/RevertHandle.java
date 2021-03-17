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
public class RevertHandle extends Contract {
    private static final String BINARY = "608060405234801561001057600080fd5b506101dd806100206000396000f3fe608060405234801561001057600080fd5b50600436106100365760003560e01c8063852da1631461003b578063f76051e714610057575b600080fd5b610055600480360381019061005091906100e0565b610073565b005b610071600480360381019061006c91906100e0565b6100ba565b005b600a8111156100b7576040517f08c379a00000000000000000000000000000000000000000000000000000000081526004016100ae9061012c565b60405180910390fd5b50565b600a8111156100c857600080fd5b50565b6000813590506100da81610190565b92915050565b6000602082840312156100f257600080fd5b6000610100848285016100cb565b91505092915050565b600061011660158361014c565b915061012182610167565b602082019050919050565b6000602082019050818103600083015261014581610109565b9050919050565b600082825260208201905092915050565b6000819050919050565b7f636865636b20636174636820657863657074696f6e0000000000000000000000600082015250565b6101998161015d565b81146101a457600080fd5b5056fea26469706673582212207a7bfeaf0fa0bb5c9e389291c0f570bae824f21fb6257bbda8c4aaf82864f7ad64736f6c63430008020033";

    public static final String FUNC_REVERTCHECK = "revertCheck";

    public static final String FUNC_REVERTREASONCHECK = "revertReasonCheck";

    protected RevertHandle(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected RevertHandle(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteCall<TransactionReceipt> revertCheck(BigInteger param) {
        final Function function = new Function(
                FUNC_REVERTCHECK, 
                Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.generated.Uint256(param)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> revertReasonCheck(BigInteger param) {
        final Function function = new Function(
                FUNC_REVERTREASONCHECK, 
                Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.generated.Uint256(param)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public static RemoteCall<RevertHandle> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return deployRemoteCall(RevertHandle.class, web3j, credentials, contractGasProvider, BINARY,  "");
    }

    public static RemoteCall<RevertHandle> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return deployRemoteCall(RevertHandle.class, web3j, transactionManager, contractGasProvider, BINARY,  "");
    }

    public static RevertHandle load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new RevertHandle(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static RevertHandle load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new RevertHandle(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
