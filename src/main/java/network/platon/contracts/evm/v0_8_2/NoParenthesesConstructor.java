package network.platon.contracts.evm.v0_8_2;

import com.platon.abi.solidity.FunctionEncoder;
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
public class NoParenthesesConstructor extends Contract {
    private static final String BINARY = "608060405234801561001057600080fd5b5060405161016238038061016283398181016040528101906100329190610057565b60018060008190555050506100a1565b6000815190506100518161008a565b92915050565b60006020828403121561006957600080fd5b600061007784828501610042565b91505092915050565b6000819050919050565b61009381610080565b811461009e57600080fd5b50565b60b3806100af6000396000f3fe6080604052348015600f57600080fd5b506004361060285760003560e01c80630dbe671f14602d575b600080fd5b60336047565b604051603e9190605a565b60405180910390f35b60005481565b6054816073565b82525050565b6000602082019050606d6000830184604d565b92915050565b600081905091905056fea26469706673582212206191618844ec7d7a7cb51fb39df05ce925c8f5e4b4d212e8132b0e425d313c2164736f6c63430008020033";

    public static final String FUNC_A = "a";

    protected NoParenthesesConstructor(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected NoParenthesesConstructor(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static RemoteCall<NoParenthesesConstructor> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider, BigInteger _b) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.generated.Uint256(_b)));
        return deployRemoteCall(NoParenthesesConstructor.class, web3j, credentials, contractGasProvider, BINARY, encodedConstructor);
    }

    public static RemoteCall<NoParenthesesConstructor> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider, BigInteger _b) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.generated.Uint256(_b)));
        return deployRemoteCall(NoParenthesesConstructor.class, web3j, transactionManager, contractGasProvider, BINARY, encodedConstructor);
    }

    public RemoteCall<BigInteger> a() {
        final Function function = new Function(FUNC_A, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public static NoParenthesesConstructor load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new NoParenthesesConstructor(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static NoParenthesesConstructor load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new NoParenthesesConstructor(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
