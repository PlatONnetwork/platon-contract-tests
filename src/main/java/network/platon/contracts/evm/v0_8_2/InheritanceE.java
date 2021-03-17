package network.platon.contracts.evm.v0_8_2;

import com.platon.abi.solidity.TypeReference;
import com.platon.abi.solidity.datatypes.Function;
import com.platon.abi.solidity.datatypes.Type;
import com.platon.abi.solidity.datatypes.Utf8String;
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
public class InheritanceE extends Contract {
    private static final String BINARY = "608060405234801561001057600080fd5b5061018b806100206000396000f3fe608060405234801561001057600080fd5b506004361061002b5760003560e01c8063c298557814610030575b600080fd5b61003861004e565b60405161004591906100d3565b60405180910390f35b606061005861005d565b905090565b60606040518060400160405280600c81526020017f496e6865726974616e6365420000000000000000000000000000000000000000815250905090565b60006100a5826100f5565b6100af8185610100565b93506100bf818560208601610111565b6100c881610144565b840191505092915050565b600060208201905081810360008301526100ed818461009a565b905092915050565b600081519050919050565b600082825260208201905092915050565b60005b8381101561012f578082015181840152602081019050610114565b8381111561013e576000848401525b50505050565b6000601f19601f830116905091905056fea26469706673582212209ca6d2395de8d4fcbed30c585fa9f47df34826f87623144d2c54b9662dc8ae6764736f6c63430008020033";

    public static final String FUNC_FOO = "foo";

    protected InheritanceE(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected InheritanceE(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteCall<String> foo() {
        final Function function = new Function(FUNC_FOO, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public static RemoteCall<InheritanceE> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return deployRemoteCall(InheritanceE.class, web3j, credentials, contractGasProvider, BINARY,  "");
    }

    public static RemoteCall<InheritanceE> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return deployRemoteCall(InheritanceE.class, web3j, transactionManager, contractGasProvider, BINARY,  "");
    }

    public static InheritanceE load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new InheritanceE(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static InheritanceE load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new InheritanceE(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
