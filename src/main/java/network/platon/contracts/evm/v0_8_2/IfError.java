package network.platon.contracts.evm.v0_8_2;

import com.platon.abi.solidity.TypeReference;
import com.platon.abi.solidity.datatypes.Bool;
import com.platon.abi.solidity.datatypes.Function;
import com.platon.abi.solidity.datatypes.Type;
import com.platon.crypto.Credentials;
import com.platon.protocol.Web3j;
import com.platon.protocol.core.RemoteCall;
import com.platon.tx.Contract;
import com.platon.tx.TransactionManager;
import com.platon.tx.gas.GasProvider;
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
public class IfError extends Contract {
    private static final String BINARY = "608060405234801561001057600080fd5b50610176806100206000396000f3fe608060405234801561001057600080fd5b50600436106100365760003560e01c806349b9d30f1461003b578063c77beeb614610059575b600080fd5b610043610077565b6040516100509190610119565b60405180910390f35b61006161009e565b60405161006e9190610119565b60405180910390f35b60008061008460016100c5565b90508060000160009054906101000a900460ff1691505090565b6000806100ab60016100e0565b90508060000160009054906101000a900460ff1691505090565b600081156100d657600090506100db565b600090505b919050565b600081156100f15760009050610105565b816100ff5760009050610104565b600090505b5b919050565b61011381610134565b82525050565b600060208201905061012e600083018461010a565b92915050565b6000811515905091905056fea26469706673582212200038c6fac1b99407fa84aa1492714da9afd809c182b7ef8e4bd418895e88a8b164736f6c63430008020033";

    public static final String FUNC_GETIFCONTROLRES = "getIfControlRes";

    public static final String FUNC_GETIFCONTROLRES1 = "getIfControlRes1";

    protected IfError(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected IfError(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteCall<Boolean> getIfControlRes() {
        final Function function = new Function(FUNC_GETIFCONTROLRES, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}));
        return executeRemoteCallSingleValueReturn(function, Boolean.class);
    }

    public RemoteCall<Boolean> getIfControlRes1() {
        final Function function = new Function(FUNC_GETIFCONTROLRES1, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}));
        return executeRemoteCallSingleValueReturn(function, Boolean.class);
    }

    public static RemoteCall<IfError> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return deployRemoteCall(IfError.class, web3j, credentials, contractGasProvider, BINARY,  "");
    }

    public static RemoteCall<IfError> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return deployRemoteCall(IfError.class, web3j, transactionManager, contractGasProvider, BINARY,  "");
    }

    public static IfError load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new IfError(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static IfError load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new IfError(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
