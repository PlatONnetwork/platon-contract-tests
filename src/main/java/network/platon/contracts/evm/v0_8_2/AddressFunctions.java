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
public class AddressFunctions extends Contract {
    private static final String BINARY = "608060405234801561001057600080fd5b50610338806100206000396000f3fe60806040526004361061003f5760003560e01c80631a695230146100445780633e58c58c14610060578063ecbde5e614610090578063f8b2cb4f146100bb575b600080fd5b61005e600480360381019061005991906101fd565b6100f8565b005b61007a600480360381019061007591906101fd565b610142565b6040516100879190610244565b60405180910390f35b34801561009c57600080fd5b506100a5610181565b6040516100b2919061025f565b60405180910390f35b3480156100c757600080fd5b506100e260048036038101906100dd91906101d4565b610189565b6040516100ef919061025f565b60405180910390f35b8073ffffffffffffffffffffffffffffffffffffffff166108fc349081150290604051600060405180830381858888f1935050505015801561013e573d6000803e3d6000fd5b5050565b60008173ffffffffffffffffffffffffffffffffffffffff166108fc60019081150290604051600060405180830381858888f193505050509050919050565b600047905090565b60008173ffffffffffffffffffffffffffffffffffffffff16319050919050565b6000813590506101b9816102d4565b92915050565b6000813590506101ce816102eb565b92915050565b6000602082840312156101e657600080fd5b60006101f4848285016101aa565b91505092915050565b60006020828403121561020f57600080fd5b600061021d848285016101bf565b91505092915050565b61022f8161029e565b82525050565b61023e816102ca565b82525050565b60006020820190506102596000830184610226565b92915050565b60006020820190506102746000830184610235565b92915050565b6000610285826102aa565b9050919050565b6000610297826102aa565b9050919050565b60008115159050919050565b600073ffffffffffffffffffffffffffffffffffffffff82169050919050565b6000819050919050565b6102dd8161027a565b81146102e857600080fd5b50565b6102f48161028c565b81146102ff57600080fd5b5056fea2646970667358221220fa9ec628f1928d022bdeece332040c86a13ac99edfc05be3b3bf8011e5b71a0a64736f6c63430008020033";

    public static final String FUNC_GETBALANCE = "getBalance";

    public static final String FUNC_GETBALANCEOF = "getBalanceOf";

    public static final String FUNC_SEND = "send";

    public static final String FUNC_TRANSFER = "transfer";

    protected AddressFunctions(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected AddressFunctions(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteCall<BigInteger> getBalance(String addr) {
        final Function function = new Function(FUNC_GETBALANCE, 
                Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.Address(addr)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<BigInteger> getBalanceOf() {
        final Function function = new Function(FUNC_GETBALANCEOF, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<TransactionReceipt> send(String addr, BigInteger vonValue) {
        final Function function = new Function(
                FUNC_SEND, 
                Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.Address(addr)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function, vonValue);
    }

    public RemoteCall<TransactionReceipt> transfer(String addr, BigInteger vonValue) {
        final Function function = new Function(
                FUNC_TRANSFER, 
                Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.Address(addr)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function, vonValue);
    }

    public static RemoteCall<AddressFunctions> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return deployRemoteCall(AddressFunctions.class, web3j, credentials, contractGasProvider, BINARY,  "");
    }

    public static RemoteCall<AddressFunctions> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return deployRemoteCall(AddressFunctions.class, web3j, transactionManager, contractGasProvider, BINARY,  "");
    }

    public static AddressFunctions load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new AddressFunctions(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static AddressFunctions load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new AddressFunctions(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
