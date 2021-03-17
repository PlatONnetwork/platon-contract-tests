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
public class TimeComplexity extends Contract {
    private static final String BINARY = "608060405234801561001057600080fd5b5061011f806100206000396000f3fe6080604052348015600f57600080fd5b5060043610603c5760003560e01c80637003f6c2146041578063d25f2640146059578063e65284be146071575b600080fd5b605760048036038101906053919060a5565b6089565b005b606f6004803603810190606b919060a5565b608c565b005b608760048036038101906083919060a5565b608f565b005b50565b50565b50565b600081359050609f8160d5565b92915050565b60006020828403121560b657600080fd5b600060c2848285016092565b91505092915050565b6000819050919050565b60dc8160cb565b811460e657600080fd5b5056fea2646970667358221220d892c1f2f9cb8aebef4373a37defce16853b25ff01556fbc622c98746b0bf5e064736f6c63430008020033";

    public static final String FUNC_LOGNTEST = "logNTest";

    public static final String FUNC_NSQUARETEST = "nSquareTest";

    public static final String FUNC_NTEST = "nTest";

    protected TimeComplexity(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected TimeComplexity(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteCall<TransactionReceipt> logNTest(BigInteger n) {
        final Function function = new Function(
                FUNC_LOGNTEST, 
                Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.generated.Uint256(n)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> nSquareTest(BigInteger n) {
        final Function function = new Function(
                FUNC_NSQUARETEST, 
                Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.generated.Uint256(n)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> nTest(BigInteger n) {
        final Function function = new Function(
                FUNC_NTEST, 
                Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.generated.Uint256(n)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public static RemoteCall<TimeComplexity> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return deployRemoteCall(TimeComplexity.class, web3j, credentials, contractGasProvider, BINARY,  "");
    }

    public static RemoteCall<TimeComplexity> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return deployRemoteCall(TimeComplexity.class, web3j, transactionManager, contractGasProvider, BINARY,  "");
    }

    public static TimeComplexity load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new TimeComplexity(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static TimeComplexity load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new TimeComplexity(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
