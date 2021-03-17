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
public class Instructions extends Contract {
    private static final String BINARY = "608060405234801561001057600080fd5b506102dd806100206000396000f3fe608060405234801561001057600080fd5b50600436106100575760003560e01c8063048a5fed1461005c578063165c4a161461007a5780633408e470146100aa5780635a0db89e146100c8578063eb8ac921146100f8575b600080fd5b610064610128565b60405161007191906101e2565b60405180910390f35b610094600480360381019061008f9190610197565b610135565b6040516100a191906101e2565b60405180910390f35b6100b261014b565b6040516100bf91906101e2565b60405180910390f35b6100e260048036038101906100dd9190610197565b610158565b6040516100ef91906101e2565b60405180910390f35b610112600480360381019061010d9190610197565b61016c565b60405161011f91906101e2565b60405180910390f35b6000804790508091505090565b6000818361014391906101fd565b905092915050565b6000804690508091505090565b60006101648383610135565b905092915050565b600061017a60026003610158565b905092915050565b60008135905061019181610290565b92915050565b600080604083850312156101aa57600080fd5b60006101b885828601610182565b92505060206101c985828601610182565b9150509250929050565b6101dc81610257565b82525050565b60006020820190506101f760008301846101d3565b92915050565b600061020882610257565b915061021383610257565b9250817fffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff048311821515161561024c5761024b610261565b5b828202905092915050565b6000819050919050565b7f4e487b7100000000000000000000000000000000000000000000000000000000600052601160045260246000fd5b61029981610257565b81146102a457600080fd5b5056fea26469706673582212206e3748b10535f3a02604ac1dcd2fe16548a8a196e07354b14c0d00543208f87864736f6c63430008020033";

    public static final String FUNC_GETCHAINID = "getChainId";

    public static final String FUNC_GETSELFBALANCE = "getSelfBalance";

    public static final String FUNC_MULTIPLY = "multiply";

    public static final String FUNC_TEST = "test";

    public static final String FUNC_TEST_MUL = "test_mul";

    protected Instructions(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected Instructions(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteCall<BigInteger> getChainId() {
        final Function function = new Function(FUNC_GETCHAINID, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<BigInteger> getSelfBalance() {
        final Function function = new Function(FUNC_GETSELFBALANCE, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<TransactionReceipt> multiply(BigInteger x, BigInteger y) {
        final Function function = new Function(
                FUNC_MULTIPLY, 
                Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.generated.Uint256(x), 
                new com.platon.abi.solidity.datatypes.generated.Uint256(y)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> test(BigInteger x, BigInteger y) {
        final Function function = new Function(
                FUNC_TEST, 
                Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.generated.Uint256(x), 
                new com.platon.abi.solidity.datatypes.generated.Uint256(y)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> test_mul(BigInteger x, BigInteger y) {
        final Function function = new Function(
                FUNC_TEST_MUL, 
                Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.generated.Uint256(x), 
                new com.platon.abi.solidity.datatypes.generated.Uint256(y)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public static RemoteCall<Instructions> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return deployRemoteCall(Instructions.class, web3j, credentials, contractGasProvider, BINARY,  "");
    }

    public static RemoteCall<Instructions> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return deployRemoteCall(Instructions.class, web3j, transactionManager, contractGasProvider, BINARY,  "");
    }

    public static Instructions load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new Instructions(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static Instructions load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new Instructions(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
