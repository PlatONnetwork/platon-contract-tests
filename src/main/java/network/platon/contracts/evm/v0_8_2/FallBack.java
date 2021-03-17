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
public class FallBack extends Contract {
    private static final String BINARY = "6080604052600160005534801561001557600080fd5b506101b4806100256000396000f3fe608060405234801561001057600080fd5b506004361061003a5760003560e01c8063d1f1548f14610045578063d46300fd1461004f5761003b565b5b6064600081905550005b61004d61006d565b005b6100576100d5565b6040516100649190610125565b60405180910390f35b3073ffffffffffffffffffffffffffffffffffffffff1660405161009090610110565b600060405180830381855af49150503d80600081146100cb576040519150601f19603f3d011682016040523d82523d6000602084013e6100d0565b606091505b505050565b60008054905090565b60006100eb601283610140565b91506100f682610155565b601282019050919050565b61010a8161014b565b82525050565b600061011b826100de565b9150819050919050565b600060208201905061013a6000830184610101565b92915050565b600081905092915050565b6000819050919050565b7f66756e6374696f6e4e6f7445786973742829000000000000000000000000000060008201525056fea26469706673582212209f8e9d553d51eff54ebd02e2c8e6a6d10981ee0cdba77c9ae4f04c94c983b58464736f6c63430008020033";

    public static final String FUNC_CALLFUNCTIONNOTEXIST = "CallFunctionNotExist";

    public static final String FUNC_GETA = "getA";

    protected FallBack(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected FallBack(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteCall<TransactionReceipt> CallFunctionNotExist() {
        final Function function = new Function(
                FUNC_CALLFUNCTIONNOTEXIST, 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<BigInteger> getA() {
        final Function function = new Function(FUNC_GETA, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public static RemoteCall<FallBack> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return deployRemoteCall(FallBack.class, web3j, credentials, contractGasProvider, BINARY,  "");
    }

    public static RemoteCall<FallBack> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return deployRemoteCall(FallBack.class, web3j, transactionManager, contractGasProvider, BINARY,  "");
    }

    public static FallBack load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new FallBack(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static FallBack load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new FallBack(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
