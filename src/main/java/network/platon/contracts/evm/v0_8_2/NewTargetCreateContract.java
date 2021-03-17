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
public class NewTargetCreateContract extends Contract {
    private static final String BINARY = "60806040526040516101833803806101838339818101604052810190610025919061004e565b806000819055503460018190555050610098565b60008151905061004881610081565b92915050565b60006020828403121561006057600080fd5b600061006e84828501610039565b91505092915050565b6000819050919050565b61008a81610077565b811461009557600080fd5b50565b60dd806100a66000396000f3fe6080604052348015600f57600080fd5b506004361060325760003560e01c80630c55699c146037578063aa8c217c146051575b600080fd5b603d606b565b604051604891906084565b60405180910390f35b60576071565b604051606291906084565b60405180910390f35b60005481565b60015481565b607e81609d565b82525050565b6000602082019050609760008301846077565b92915050565b600081905091905056fea2646970667358221220fcaffcac1c6d2dea9350ebd2b9e8a8fa8348d517be72f6ce61dd7257d03dec4864736f6c63430008020033";

    public static final String FUNC_AMOUNT = "amount";

    public static final String FUNC_X = "x";

    protected NewTargetCreateContract(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected NewTargetCreateContract(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static RemoteCall<NewTargetCreateContract> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider, BigInteger initialVonValue, BigInteger _a) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.generated.Uint256(_a)));
        return deployRemoteCall(NewTargetCreateContract.class, web3j, credentials, contractGasProvider, BINARY, encodedConstructor, initialVonValue);
    }

    public static RemoteCall<NewTargetCreateContract> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider, BigInteger initialVonValue, BigInteger _a) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.generated.Uint256(_a)));
        return deployRemoteCall(NewTargetCreateContract.class, web3j, transactionManager, contractGasProvider, BINARY, encodedConstructor, initialVonValue);
    }

    public RemoteCall<BigInteger> amount() {
        final Function function = new Function(FUNC_AMOUNT, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<BigInteger> x() {
        final Function function = new Function(FUNC_X, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public static NewTargetCreateContract load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new NewTargetCreateContract(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static NewTargetCreateContract load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new NewTargetCreateContract(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
