package network.platon.contracts.evm.v0_8_2;

import com.platon.abi.solidity.TypeReference;
import com.platon.abi.solidity.datatypes.Function;
import com.platon.abi.solidity.datatypes.Type;
import com.platon.abi.solidity.datatypes.generated.Bytes32;
import com.platon.crypto.Credentials;
import com.platon.protocol.Web3j;
import com.platon.protocol.core.RemoteCall;
import com.platon.protocol.core.methods.response.TransactionReceipt;
import com.platon.tx.Contract;
import com.platon.tx.TransactionManager;
import com.platon.tx.gas.GasProvider;
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
public class SimpleStorage extends Contract {
    private static final String BINARY = "608060405234801561001057600080fd5b50610201806100206000396000f3fe608060405234801561001057600080fd5b50600436106100365760003560e01c806309bd5a601461003b57806319ff1d2114610059575b600080fd5b610043610063565b604051610050919061012f565b60405180910390f35b610061610078565b005b600060c843610072919061014a565b40905090565b600060c843610087919061014a565b406040516020016100989190610114565b6040516020818303038152906040528051906020012060001c905060008114156100eb577f4e487b7100000000000000000000000000000000000000000000000000000000600052600160045260246000fd5b50565b6100f78161017e565b82525050565b61010e6101098261017e565b610192565b82525050565b600061012082846100fd565b60208201915081905092915050565b600060208201905061014460008301846100ee565b92915050565b600061015582610188565b915061016083610188565b9250828210156101735761017261019c565b5b828203905092915050565b6000819050919050565b6000819050919050565b6000819050919050565b7f4e487b7100000000000000000000000000000000000000000000000000000000600052601160045260246000fdfea2646970667358221220ee350d3d11b0042d98e60f931a2517eb2730e703a757cffc84e347fe2326da8564736f6c63430008020033";

    public static final String FUNC_HASH = "hash";

    public static final String FUNC_HELLO = "hello";

    protected SimpleStorage(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected SimpleStorage(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteCall<byte[]> hash() {
        final Function function = new Function(FUNC_HASH, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bytes32>() {}));
        return executeRemoteCallSingleValueReturn(function, byte[].class);
    }

    public RemoteCall<TransactionReceipt> hello() {
        final Function function = new Function(
                FUNC_HELLO, 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public static RemoteCall<SimpleStorage> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return deployRemoteCall(SimpleStorage.class, web3j, credentials, contractGasProvider, BINARY,  "");
    }

    public static RemoteCall<SimpleStorage> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return deployRemoteCall(SimpleStorage.class, web3j, transactionManager, contractGasProvider, BINARY,  "");
    }

    public static SimpleStorage load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new SimpleStorage(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static SimpleStorage load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new SimpleStorage(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
