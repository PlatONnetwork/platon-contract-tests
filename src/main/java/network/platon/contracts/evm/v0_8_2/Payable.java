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
public class Payable extends Contract {
    private static final String BINARY = "608060405234801561001057600080fd5b5061024a806100206000396000f3fe6080604052600436106100295760003560e01c80631a6952301461002e578063c84aae171461004a575b600080fd5b61004860048036038101906100439190610145565b610087565b005b34801561005657600080fd5b50610071600480360381019061006c919061011c565b6100d1565b60405161007e919061017d565b60405180910390f35b8073ffffffffffffffffffffffffffffffffffffffff166108fc349081150290604051600060405180830381858888f193505050501580156100cd573d6000803e3d6000fd5b5050565b60008173ffffffffffffffffffffffffffffffffffffffff16319050919050565b600081359050610101816101e6565b92915050565b600081359050610116816101fd565b92915050565b60006020828403121561012e57600080fd5b600061013c848285016100f2565b91505092915050565b60006020828403121561015757600080fd5b600061016584828501610107565b91505092915050565b610177816101dc565b82525050565b6000602082019050610192600083018461016e565b92915050565b60006101a3826101bc565b9050919050565b60006101b5826101bc565b9050919050565b600073ffffffffffffffffffffffffffffffffffffffff82169050919050565b6000819050919050565b6101ef81610198565b81146101fa57600080fd5b50565b610206816101aa565b811461021157600080fd5b5056fea264697066735822122046dcfc2d207e543a640f0890f3c72a95542372e5bb375fcbe99e84640aa5a78264736f6c63430008020033";

    public static final String FUNC_GETBALANCES = "getBalances";

    public static final String FUNC_TRANSFER = "transfer";

    protected Payable(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected Payable(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteCall<BigInteger> getBalances(String addr) {
        final Function function = new Function(FUNC_GETBALANCES, 
                Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.Address(addr)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<TransactionReceipt> transfer(String addr, BigInteger vonValue) {
        final Function function = new Function(
                FUNC_TRANSFER, 
                Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.Address(addr)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function, vonValue);
    }

    public static RemoteCall<Payable> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return deployRemoteCall(Payable.class, web3j, credentials, contractGasProvider, BINARY,  "");
    }

    public static RemoteCall<Payable> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return deployRemoteCall(Payable.class, web3j, transactionManager, contractGasProvider, BINARY,  "");
    }

    public static Payable load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new Payable(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static Payable load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new Payable(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
