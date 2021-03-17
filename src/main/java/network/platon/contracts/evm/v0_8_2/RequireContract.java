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
public class RequireContract extends Contract {
    private static final String BINARY = "608060405234801561001057600080fd5b506101d5806100206000396000f3fe608060405234801561001057600080fd5b50600436106100365760003560e01c806314fef9361461003b578063de29278914610057575b600080fd5b610055600480360381019061005091906100b5565b610075565b005b61005f610097565b60405161006c9190610100565b60405180910390f35b80821161008157600080fd5b808261008d919061011b565b6000819055505050565b60008054905090565b6000813590506100af81610188565b92915050565b600080604083850312156100c857600080fd5b60006100d6858286016100a0565b92505060206100e7858286016100a0565b9150509250929050565b6100fa8161014f565b82525050565b600060208201905061011560008301846100f1565b92915050565b60006101268261014f565b91506101318361014f565b92508282101561014457610143610159565b5b828203905092915050565b6000819050919050565b7f4e487b7100000000000000000000000000000000000000000000000000000000600052601160045260246000fd5b6101918161014f565b811461019c57600080fd5b5056fea2646970667358221220a9f0bbe2491760b65a00163dac65b4eeaec7c1a7b608b1ecc03b1cc5d9ee920164736f6c63430008020033";

    public static final String FUNC_GETRESULT = "getResult";

    public static final String FUNC_TOSENDERAMOUNT = "toSenderAmount";

    protected RequireContract(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected RequireContract(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteCall<BigInteger> getResult() {
        final Function function = new Function(FUNC_GETRESULT, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<TransactionReceipt> toSenderAmount(BigInteger frist, BigInteger second) {
        final Function function = new Function(
                FUNC_TOSENDERAMOUNT, 
                Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.generated.Uint256(frist), 
                new com.platon.abi.solidity.datatypes.generated.Uint256(second)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public static RemoteCall<RequireContract> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return deployRemoteCall(RequireContract.class, web3j, credentials, contractGasProvider, BINARY,  "");
    }

    public static RemoteCall<RequireContract> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return deployRemoteCall(RequireContract.class, web3j, transactionManager, contractGasProvider, BINARY,  "");
    }

    public static RequireContract load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new RequireContract(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static RequireContract load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new RequireContract(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
