package network.platon.contracts.evm.v0_8_2;

import com.platon.abi.solidity.TypeReference;
import com.platon.abi.solidity.datatypes.Function;
import com.platon.abi.solidity.datatypes.Type;
import com.platon.abi.solidity.datatypes.generated.Uint256;
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
public class LoopCallOfView extends Contract {
    private static final String BINARY = "608060405234801561001057600080fd5b506101d0806100206000396000f3fe608060405234801561001057600080fd5b506004361061002b5760003560e01c80633fde082714610030575b600080fd5b61004a600480360381019061004591906100ae565b610060565b60405161005791906100e6565b60405180910390f35b60008060005b8381101561008f5781806100799061010b565b92505080806100879061010b565b915050610066565b5080915050919050565b6000813590506100a881610183565b92915050565b6000602082840312156100c057600080fd5b60006100ce84828501610099565b91505092915050565b6100e081610101565b82525050565b60006020820190506100fb60008301846100d7565b92915050565b6000819050919050565b600061011682610101565b91507fffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff82141561014957610148610154565b5b600182019050919050565b7f4e487b7100000000000000000000000000000000000000000000000000000000600052601160045260246000fd5b61018c81610101565b811461019757600080fd5b5056fea264697066735822122054e6cad42717db375fb0bc96ffeca58ff77dcb0178c8d0cb548a49713d0fcc9264736f6c63430008020033";

    public static final String FUNC_LOOPCALLTEST = "loopCallTest";

    protected LoopCallOfView(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected LoopCallOfView(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteCall<BigInteger> loopCallTest(BigInteger n) {
        final Function function = new Function(FUNC_LOOPCALLTEST, 
                Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.generated.Uint256(n)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public static RemoteCall<LoopCallOfView> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return deployRemoteCall(LoopCallOfView.class, web3j, credentials, contractGasProvider, BINARY,  "");
    }

    public static RemoteCall<LoopCallOfView> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return deployRemoteCall(LoopCallOfView.class, web3j, transactionManager, contractGasProvider, BINARY,  "");
    }

    public static LoopCallOfView load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new LoopCallOfView(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static LoopCallOfView load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new LoopCallOfView(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
