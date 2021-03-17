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
public class PlatONToken extends Contract {
    private static final String BINARY = "608060405234801561001057600080fd5b506101e3806100206000396000f3fe608060405234801561001057600080fd5b506004361061004c5760003560e01c8063249bb37314610051578063c24126761461006f578063c951fdf614610079578063d87698ae14610097575b600080fd5b6100596100b5565b6040516100669190610103565b60405180910390f35b6100776100d0565b005b6100816100da565b60405161008e9190610103565b60405180910390f35b61009f6100ee565b6040516100ac9190610103565b60405180910390f35b6000670de0b6b3a7640000816100cb919061011e565b905090565b6001600081905550565b60006001816100e9919061011e565b905090565b60005481565b6100fd81610174565b82525050565b600060208201905061011860008301846100f4565b92915050565b600061012982610174565b915061013483610174565b9250827fffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff038211156101695761016861017e565b5b828201905092915050565b6000819050919050565b7f4e487b7100000000000000000000000000000000000000000000000000000000600052601160045260246000fdfea2646970667358221220cbe3c957320f5d2a230f21bc0739df993e35e67112f252f6a3fd01b5d56f6d2f64736f6c63430008020033";

    public static final String FUNC_PLAT = "Plat";

    public static final String FUNC_PVON = "Pvon";

    public static final String FUNC_TOKEN = "Token";

    public static final String FUNC_PLATONTOKEN = "platontoken";

    protected PlatONToken(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected PlatONToken(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteCall<BigInteger> Plat() {
        final Function function = new Function(FUNC_PLAT, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<BigInteger> Pvon() {
        final Function function = new Function(FUNC_PVON, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<TransactionReceipt> Token() {
        final Function function = new Function(
                FUNC_TOKEN, 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<BigInteger> platontoken() {
        final Function function = new Function(FUNC_PLATONTOKEN, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public static RemoteCall<PlatONToken> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return deployRemoteCall(PlatONToken.class, web3j, credentials, contractGasProvider, BINARY,  "");
    }

    public static RemoteCall<PlatONToken> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return deployRemoteCall(PlatONToken.class, web3j, transactionManager, contractGasProvider, BINARY,  "");
    }

    public static PlatONToken load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new PlatONToken(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static PlatONToken load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new PlatONToken(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
