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
public class ShadowingInheritedStateVariablesSuperChild extends Contract {
    private static final String BINARY = "60806040526040518060600160405280602e81526020016104a3602e913960009080519060200190610032929190610074565b5034801561003f57600080fd5b50604051806060016040528060338152602001610470603391396000908051906020019061006e929190610074565b50610178565b82805461008090610117565b90600052602060002090601f0160209004810192826100a257600085556100e9565b82601f106100bb57805160ff19168380011785556100e9565b828001600101855582156100e9579182015b828111156100e85782518255916020019190600101906100cd565b5b5090506100f691906100fa565b5090565b5b808211156101135760008160009055506001016100fb565b5090565b6000600282049050600182168061012f57607f821691505b6020821081141561014357610142610149565b5b50919050565b7f4e487b7100000000000000000000000000000000000000000000000000000000600052602260045260246000fd5b6102e9806101876000396000f3fe608060405234801561001057600080fd5b50600436106100365760003560e01c806306fdde031461003b57806317d7de7c14610059575b600080fd5b610043610077565b60405161005091906101d0565b60405180910390f35b610061610105565b60405161006e91906101d0565b60405180910390f35b6000805461008490610241565b80601f01602080910402602001604051908101604052809291908181526020018280546100b090610241565b80156100fd5780601f106100d2576101008083540402835291602001916100fd565b820191906000526020600020905b8154815290600101906020018083116100e057829003601f168201915b505050505081565b60606000805461011490610241565b80601f016020809104026020016040519081016040528092919081815260200182805461014090610241565b801561018d5780601f106101625761010080835404028352916020019161018d565b820191906000526020600020905b81548152906001019060200180831161017057829003601f168201915b5050505050905090565b60006101a2826101f2565b6101ac81856101fd565b93506101bc81856020860161020e565b6101c5816102a2565b840191505092915050565b600060208201905081810360008301526101ea8184610197565b905092915050565b600081519050919050565b600082825260208201905092915050565b60005b8381101561022c578082015181840152602081019050610211565b8381111561023b576000848401525b50505050565b6000600282049050600182168061025957607f821691505b6020821081141561026d5761026c610273565b5b50919050565b7f4e487b7100000000000000000000000000000000000000000000000000000000600052602260045260246000fd5b6000601f19601f830116905091905056fea2646970667358221220deb1713d03db4ed3629d0043ea6167452ab6b16914f64bd8702b08268d8d308664736f6c63430008020033436f6e747261637420536861646f77696e67496e6865726974656453746174655661726961626c657353757065724368696c64436f6e747261637420536861646f77696e67496e6865726974656453746174655661726961626c65735375706572";

    public static final String FUNC_GETNAME = "getName";

    public static final String FUNC_NAME = "name";

    protected ShadowingInheritedStateVariablesSuperChild(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected ShadowingInheritedStateVariablesSuperChild(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static RemoteCall<ShadowingInheritedStateVariablesSuperChild> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return deployRemoteCall(ShadowingInheritedStateVariablesSuperChild.class, web3j, credentials, contractGasProvider, BINARY,  "");
    }

    public static RemoteCall<ShadowingInheritedStateVariablesSuperChild> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return deployRemoteCall(ShadowingInheritedStateVariablesSuperChild.class, web3j, transactionManager, contractGasProvider, BINARY,  "");
    }

    public RemoteCall<String> getName() {
        final Function function = new Function(FUNC_GETNAME, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<String> name() {
        final Function function = new Function(FUNC_NAME, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public static ShadowingInheritedStateVariablesSuperChild load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new ShadowingInheritedStateVariablesSuperChild(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static ShadowingInheritedStateVariablesSuperChild load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new ShadowingInheritedStateVariablesSuperChild(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
