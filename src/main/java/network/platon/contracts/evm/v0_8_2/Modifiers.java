package network.platon.contracts.evm.v0_8_2;

import com.platon.abi.solidity.TypeReference;
import com.platon.abi.solidity.datatypes.Function;
import com.platon.abi.solidity.datatypes.Type;
import com.platon.abi.solidity.datatypes.generated.Uint256;
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
public class Modifiers extends Contract {
    private static final String BINARY = "6080604052600a60005534801561001557600080fd5b5060f0806100246000396000f3fe6080604052348015600f57600080fd5b506004361060325760003560e01c806366e41cb71460375780636b59084d146051575b600080fd5b603d6059565b604051604891906097565b60405180910390f35b60576062565b005b60008054905090565b6000546000819050600080549050600c600081905550506000549050600b6000819055505050565b60918160b0565b82525050565b600060208201905060aa6000830184608a565b92915050565b600081905091905056fea26469706673582212206f3d224dc4de960a66cc0796144e7d7fc3d44592fbf9cce014d38f8d6580ecfd64736f6c63430008020033";

    public static final String FUNC_TEST1 = "test1";

    public static final String FUNC_TEST2 = "test2";

    protected Modifiers(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected Modifiers(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteCall<TransactionReceipt> test1() {
        final Function function = new Function(
                FUNC_TEST1, 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<BigInteger> test2() {
        final Function function = new Function(FUNC_TEST2, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public static RemoteCall<Modifiers> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return deployRemoteCall(Modifiers.class, web3j, credentials, contractGasProvider, BINARY,  "");
    }

    public static RemoteCall<Modifiers> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return deployRemoteCall(Modifiers.class, web3j, transactionManager, contractGasProvider, BINARY,  "");
    }

    public static Modifiers load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new Modifiers(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static Modifiers load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new Modifiers(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
