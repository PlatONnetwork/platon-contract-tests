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
public class External extends Contract {
    private static final String BINARY = "608060405234801561001057600080fd5b5061015d806100206000396000f3fe608060405234801561001057600080fd5b506004361061002b5760003560e01c8063569c5f6d14610030575b600080fd5b61003861004e565b604051610045919061007d565b60405180910390f35b6000806001905060006002905080826100679190610098565b9250505090565b610077816100ee565b82525050565b6000602082019050610092600083018461006e565b92915050565b60006100a3826100ee565b91506100ae836100ee565b9250827fffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff038211156100e3576100e26100f8565b5b828201905092915050565b6000819050919050565b7f4e487b7100000000000000000000000000000000000000000000000000000000600052601160045260246000fdfea26469706673582212206d18394c5f787ef27f1e40430c9c20c30cdd5e06bc7b605083dfe24b269409e964736f6c63430008020033";

    public static final String FUNC_GETSUM = "getSum";

    protected External(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected External(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteCall<BigInteger> getSum() {
        final Function function = new Function(FUNC_GETSUM, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public static RemoteCall<External> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return deployRemoteCall(External.class, web3j, credentials, contractGasProvider, BINARY,  "");
    }

    public static RemoteCall<External> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return deployRemoteCall(External.class, web3j, transactionManager, contractGasProvider, BINARY,  "");
    }

    public static External load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new External(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static External load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new External(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
