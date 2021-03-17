package network.platon.contracts.evm.v0_8_2;

import com.platon.abi.solidity.TypeReference;
import com.platon.abi.solidity.datatypes.Function;
import com.platon.abi.solidity.datatypes.Type;
import com.platon.abi.solidity.datatypes.generated.Uint8;
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
public class InterfaceEnableStructAndenumImpl extends Contract {
    private static final String BINARY = "608060405234801561001057600080fd5b5061016d806100206000396000f3fe608060405234801561001057600080fd5b506004361061002b5760003560e01c80636ff6560314610030575b600080fd5b61003861004e565b60405161004591906100b4565b60405180910390f35b6000806040518060200160405280600180811115610095577f4e487b7100000000000000000000000000000000000000000000000000000000600052602160045260246000fd5b8152509050806000015191505090565b6100ae816100e2565b82525050565b60006020820190506100c960008301846100a5565b92915050565b60008190506100dd82610123565b919050565b60006100ed826100cf565b9050919050565b7f4e487b7100000000000000000000000000000000000000000000000000000000600052602160045260246000fd5b60028110610134576101336100f4565b5b5056fea26469706673582212207171f06524574c076e6e89db5c8d00e582927e7b46fe4b94416cd0b87b486e3264736f6c63430008020033";

    public static final String FUNC_GETPRODUCTCONDITION = "getProductCondition";

    protected InterfaceEnableStructAndenumImpl(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected InterfaceEnableStructAndenumImpl(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteCall<BigInteger> getProductCondition() {
        final Function function = new Function(FUNC_GETPRODUCTCONDITION, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint8>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public static RemoteCall<InterfaceEnableStructAndenumImpl> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return deployRemoteCall(InterfaceEnableStructAndenumImpl.class, web3j, credentials, contractGasProvider, BINARY,  "");
    }

    public static RemoteCall<InterfaceEnableStructAndenumImpl> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return deployRemoteCall(InterfaceEnableStructAndenumImpl.class, web3j, transactionManager, contractGasProvider, BINARY,  "");
    }

    public static InterfaceEnableStructAndenumImpl load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new InterfaceEnableStructAndenumImpl(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static InterfaceEnableStructAndenumImpl load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new InterfaceEnableStructAndenumImpl(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
