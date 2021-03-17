package network.platon.contracts.evm.v0_8_2;

import com.platon.abi.solidity.TypeReference;
import com.platon.abi.solidity.datatypes.Function;
import com.platon.abi.solidity.datatypes.Type;
import com.platon.abi.solidity.datatypes.Utf8String;
import com.platon.abi.solidity.datatypes.generated.Int256;
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
public class AbstractContractSon extends Contract {
    private static final String BINARY = "608060405234801561001057600080fd5b50610256806100206000396000f3fe608060405234801561001057600080fd5b50600436106100415760003560e01c806305a83329146100465780637839360014610064578063ed55abd414610082575b600080fd5b61004e6100a0565b60405161005b9190610179565b60405180910390f35b61006c6100ae565b6040516100799190610194565b60405180910390f35b61008a6100ee565b6040516100979190610194565b60405180910390f35b600080601490508091505090565b606060006040518060400160405280600a81526020017f6661746865724e616d650000000000000000000000000000000000000000000081525090505090565b606060006040518060400160405280600781526020017f736f6e4e616d650000000000000000000000000000000000000000000000000081525090508091505090565b61013a816101d2565b82525050565b600061014b826101b6565b61015581856101c1565b93506101658185602086016101dc565b61016e8161020f565b840191505092915050565b600060208201905061018e6000830184610131565b92915050565b600060208201905081810360008301526101ae8184610140565b905092915050565b600081519050919050565b600082825260208201905092915050565b6000819050919050565b60005b838110156101fa5780820151818401526020810190506101df565b83811115610209576000848401525b50505050565b6000601f19601f830116905091905056fea2646970667358221220ab1cdf996dd395353072c72d921bcade3fe0d81f2b3cb67769ca99571cc2b9d664736f6c63430008020033";

    public static final String FUNC_FATHERAGE = "fatherAge";

    public static final String FUNC_FATHERNAME = "fatherName";

    public static final String FUNC_SONNAME = "sonName";

    protected AbstractContractSon(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected AbstractContractSon(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteCall<BigInteger> fatherAge() {
        final Function function = new Function(FUNC_FATHERAGE, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Int256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<String> fatherName() {
        final Function function = new Function(FUNC_FATHERNAME, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<String> sonName() {
        final Function function = new Function(FUNC_SONNAME, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public static RemoteCall<AbstractContractSon> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return deployRemoteCall(AbstractContractSon.class, web3j, credentials, contractGasProvider, BINARY,  "");
    }

    public static RemoteCall<AbstractContractSon> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return deployRemoteCall(AbstractContractSon.class, web3j, transactionManager, contractGasProvider, BINARY,  "");
    }

    public static AbstractContractSon load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new AbstractContractSon(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static AbstractContractSon load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new AbstractContractSon(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
