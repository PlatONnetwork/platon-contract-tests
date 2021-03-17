package network.platon.contracts.evm.v0_8_2;

import com.platon.abi.solidity.TypeReference;
import com.platon.abi.solidity.datatypes.Function;
import com.platon.abi.solidity.datatypes.Type;
import com.platon.abi.solidity.datatypes.generated.Uint32;
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
public class DisallowTypeChange extends Contract {
    private static final String BINARY = "608060405234801561001057600080fd5b50610187806100206000396000f3fe6080604052600436106100345760003560e01c80630b7f166514610039578063420343a414610064578063a56dfe4a1461006e575b600080fd5b34801561004557600080fd5b5061004e610099565b60405161005b9190610126565b60405180910390f35b61006c6100b2565b005b34801561007a57600080fd5b50610083610103565b6040516100909190610126565b60405180910390f35b60008060009054906101000a900463ffffffff16905090565b60007faaaa000000000000000000000000000000000000000000000000000000000000905060008190508060e01c6000806101000a81548163ffffffff021916908363ffffffff1602179055505050565b60008054906101000a900463ffffffff1681565b61012081610141565b82525050565b600060208201905061013b6000830184610117565b92915050565b600063ffffffff8216905091905056fea26469706673582212208c70df8cf8fa65c8df6c14e26c9783b0757ecc473819610bc72d69d56ad8c70864736f6c63430008020033";

    public static final String FUNC_GETY = "getY";

    public static final String FUNC_TESTCHANGE = "testChange";

    public static final String FUNC_Y = "y";

    protected DisallowTypeChange(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected DisallowTypeChange(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteCall<BigInteger> getY() {
        final Function function = new Function(FUNC_GETY, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint32>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<TransactionReceipt> testChange(BigInteger vonValue) {
        final Function function = new Function(
                FUNC_TESTCHANGE, 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function, vonValue);
    }

    public RemoteCall<BigInteger> y() {
        final Function function = new Function(FUNC_Y, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint32>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public static RemoteCall<DisallowTypeChange> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return deployRemoteCall(DisallowTypeChange.class, web3j, credentials, contractGasProvider, BINARY,  "");
    }

    public static RemoteCall<DisallowTypeChange> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return deployRemoteCall(DisallowTypeChange.class, web3j, transactionManager, contractGasProvider, BINARY,  "");
    }

    public static DisallowTypeChange load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new DisallowTypeChange(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static DisallowTypeChange load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new DisallowTypeChange(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
