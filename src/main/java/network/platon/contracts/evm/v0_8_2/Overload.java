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
public class Overload extends Contract {
    private static final String BINARY = "608060405234801561001057600080fd5b506102d7806100206000396000f3fe608060405234801561001057600080fd5b50600436106100575760003560e01c806313d1aa2e1461005c57806315d55b281461008c578063587dcf18146100aa578063b3de648b146100c8578063e2179b8e146100f8575b600080fd5b61007660048036038101906100719190610195565b610102565b60405161008391906101e0565b60405180910390f35b610094610118565b6040516100a191906101e0565b60405180910390f35b6100b261011e565b6040516100bf91906101e0565b60405180910390f35b6100e260048036038101906100dd919061016c565b610127565b6040516100ef91906101e0565b60405180910390f35b610100610131565b005b6000818361011091906101fb565b905092915050565b60005481565b60008054905090565b6000819050919050565b600061013f60026003610102565b905061014b6002610127565b90508060008190555050565b6000813590506101668161028a565b92915050565b60006020828403121561017e57600080fd5b600061018c84828501610157565b91505092915050565b600080604083850312156101a857600080fd5b60006101b685828601610157565b92505060206101c785828601610157565b9150509250929050565b6101da81610251565b82525050565b60006020820190506101f560008301846101d1565b92915050565b600061020682610251565b915061021183610251565b9250827fffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff038211156102465761024561025b565b5b828201905092915050565b6000819050919050565b7f4e487b7100000000000000000000000000000000000000000000000000000000600052601160045260246000fd5b61029381610251565b811461029e57600080fd5b5056fea2646970667358221220cbcefc04b241c368d2ff9fdd00f093acc24bbfee348d3e03e0e1d0216ab1a4f364736f6c63430008020033";

    public static final String FUNC_F = "f";

    public static final String FUNC_G = "g";

    public static final String FUNC_GETRE = "getRe";

    public static final String FUNC_RE = "re";

    protected Overload(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected Overload(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteCall<TransactionReceipt> f(BigInteger a, BigInteger b) {
        final Function function = new Function(
                FUNC_F, 
                Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.generated.Uint256(a), 
                new com.platon.abi.solidity.datatypes.generated.Uint256(b)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> f(BigInteger a) {
        final Function function = new Function(
                FUNC_F, 
                Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.generated.Uint256(a)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> g() {
        final Function function = new Function(
                FUNC_G, 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<BigInteger> getRe() {
        final Function function = new Function(FUNC_GETRE, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<BigInteger> re() {
        final Function function = new Function(FUNC_RE, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public static RemoteCall<Overload> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return deployRemoteCall(Overload.class, web3j, credentials, contractGasProvider, BINARY,  "");
    }

    public static RemoteCall<Overload> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return deployRemoteCall(Overload.class, web3j, transactionManager, contractGasProvider, BINARY,  "");
    }

    public static Overload load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new Overload(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static Overload load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new Overload(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
