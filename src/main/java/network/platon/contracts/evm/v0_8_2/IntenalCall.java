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
public class IntenalCall extends Contract {
    private static final String BINARY = "608060405234801561001057600080fd5b50610200806100206000396000f3fe608060405234801561001057600080fd5b50600436106100365760003560e01c8063569c5f6d1461003b578063de29278914610059575b600080fd5b610043610077565b60405161005091906100c6565b60405180910390f35b610061610097565b60405161006e91906100c6565b60405180910390f35b60008060019050600060029050808261009091906100e1565b9250505090565b600080600390506100a6610077565b816100b19190610137565b91505090565b6100c081610191565b82525050565b60006020820190506100db60008301846100b7565b92915050565b60006100ec82610191565b91506100f783610191565b9250827fffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff0382111561012c5761012b61019b565b5b828201905092915050565b600061014282610191565b915061014d83610191565b9250817fffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff04831182151516156101865761018561019b565b5b828202905092915050565b6000819050919050565b7f4e487b7100000000000000000000000000000000000000000000000000000000600052601160045260246000fdfea2646970667358221220355f4e29dc698cc26bc245c7b640a65fb70c955bb175f69c23f4adcfa604873264736f6c63430008020033";

    public static final String FUNC_GETRESULT = "getResult";

    public static final String FUNC_GETSUM = "getSum";

    protected IntenalCall(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected IntenalCall(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteCall<BigInteger> getResult() {
        final Function function = new Function(FUNC_GETRESULT, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<BigInteger> getSum() {
        final Function function = new Function(FUNC_GETSUM, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public static RemoteCall<IntenalCall> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return deployRemoteCall(IntenalCall.class, web3j, credentials, contractGasProvider, BINARY,  "");
    }

    public static RemoteCall<IntenalCall> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return deployRemoteCall(IntenalCall.class, web3j, transactionManager, contractGasProvider, BINARY,  "");
    }

    public static IntenalCall load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new IntenalCall(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static IntenalCall load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new IntenalCall(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
