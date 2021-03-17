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
public class InterfaceContractInheritMultipleTest extends Contract {
    private static final String BINARY = "608060405234801561001057600080fd5b50610252806100206000396000f3fe608060405234801561001057600080fd5b50600436106100365760003560e01c806399ecedf61461003b578063cad0899b1461006b575b600080fd5b610055600480360381019061005091906100dc565b61009b565b6040516100629190610127565b60405180910390f35b610085600480360381019061008091906100dc565b6100b1565b6040516100929190610127565b60405180910390f35b600081836100a99190610198565b905092915050565b600081836100bf9190610142565b905092915050565b6000813590506100d681610205565b92915050565b600080604083850312156100ef57600080fd5b60006100fd858286016100c7565b925050602061010e858286016100c7565b9150509250929050565b610121816101cc565b82525050565b600060208201905061013c6000830184610118565b92915050565b600061014d826101cc565b9150610158836101cc565b9250827fffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff0382111561018d5761018c6101d6565b5b828201905092915050565b60006101a3826101cc565b91506101ae836101cc565b9250828210156101c1576101c06101d6565b5b828203905092915050565b6000819050919050565b7f4e487b7100000000000000000000000000000000000000000000000000000000600052601160045260246000fd5b61020e816101cc565b811461021957600080fd5b5056fea2646970667358221220f2a59a7fe816ad2cfc1db1fdbed912e47983762613638b09c136bd309d74d10d64736f6c63430008020033";

    public static final String FUNC_REDUCE = "reduce";

    public static final String FUNC_SUM = "sum";

    protected InterfaceContractInheritMultipleTest(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected InterfaceContractInheritMultipleTest(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteCall<BigInteger> reduce(BigInteger c, BigInteger d) {
        final Function function = new Function(FUNC_REDUCE, 
                Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.generated.Uint256(c), 
                new com.platon.abi.solidity.datatypes.generated.Uint256(d)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<BigInteger> sum(BigInteger a, BigInteger b) {
        final Function function = new Function(FUNC_SUM, 
                Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.generated.Uint256(a), 
                new com.platon.abi.solidity.datatypes.generated.Uint256(b)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public static RemoteCall<InterfaceContractInheritMultipleTest> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return deployRemoteCall(InterfaceContractInheritMultipleTest.class, web3j, credentials, contractGasProvider, BINARY,  "");
    }

    public static RemoteCall<InterfaceContractInheritMultipleTest> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return deployRemoteCall(InterfaceContractInheritMultipleTest.class, web3j, transactionManager, contractGasProvider, BINARY,  "");
    }

    public static InterfaceContractInheritMultipleTest load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new InterfaceContractInheritMultipleTest(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static InterfaceContractInheritMultipleTest load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new InterfaceContractInheritMultipleTest(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
