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
public class LoopCall extends Contract {
    private static final String BINARY = "608060405234801561001057600080fd5b50610192806100206000396000f3fe608060405234801561001057600080fd5b506004361061002b5760003560e01c80633fde082714610030575b600080fd5b61004a6004803603810190610045919061009a565b61004c565b005b60005b8181101561008157600080815480929190610069906100cd565b91905055508080610079906100cd565b91505061004f565b5050565b60008135905061009481610145565b92915050565b6000602082840312156100ac57600080fd5b60006100ba84828501610085565b91505092915050565b6000819050919050565b60006100d8826100c3565b91507fffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff82141561010b5761010a610116565b5b600182019050919050565b7f4e487b7100000000000000000000000000000000000000000000000000000000600052601160045260246000fd5b61014e816100c3565b811461015957600080fd5b5056fea2646970667358221220b5ccb7805d007fe550925e504ef3e0d4a9cad8d73a8d5de48ae5fd4ba98dbe9f64736f6c63430008020033";

    public static final String FUNC_LOOPCALLTEST = "loopCallTest";

    protected LoopCall(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected LoopCall(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteCall<TransactionReceipt> loopCallTest(BigInteger n) {
        final Function function = new Function(
                FUNC_LOOPCALLTEST, 
                Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.generated.Uint256(n)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public static RemoteCall<LoopCall> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return deployRemoteCall(LoopCall.class, web3j, credentials, contractGasProvider, BINARY,  "");
    }

    public static RemoteCall<LoopCall> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return deployRemoteCall(LoopCall.class, web3j, transactionManager, contractGasProvider, BINARY,  "");
    }

    public static LoopCall load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new LoopCall(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static LoopCall load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new LoopCall(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
