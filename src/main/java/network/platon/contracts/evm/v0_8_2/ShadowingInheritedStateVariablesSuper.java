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
public class ShadowingInheritedStateVariablesSuper extends Contract {
    private static final String BINARY = "60806040526040518060600160405280602e8152602001610441602e913960009080519060200190610032929190610045565b5034801561003f57600080fd5b50610149565b828054610051906100e8565b90600052602060002090601f01602090048101928261007357600085556100ba565b82601f1061008c57805160ff19168380011785556100ba565b828001600101855582156100ba579182015b828111156100b957825182559160200191906001019061009e565b5b5090506100c791906100cb565b5090565b5b808211156100e45760008160009055506001016100cc565b5090565b6000600282049050600182168061010057607f821691505b602082108114156101145761011361011a565b5b50919050565b7f4e487b7100000000000000000000000000000000000000000000000000000000600052602260045260246000fd5b6102e9806101586000396000f3fe608060405234801561001057600080fd5b50600436106100365760003560e01c806306fdde031461003b57806317d7de7c14610059575b600080fd5b610043610077565b60405161005091906101d0565b60405180910390f35b610061610105565b60405161006e91906101d0565b60405180910390f35b6000805461008490610241565b80601f01602080910402602001604051908101604052809291908181526020018280546100b090610241565b80156100fd5780601f106100d2576101008083540402835291602001916100fd565b820191906000526020600020905b8154815290600101906020018083116100e057829003601f168201915b505050505081565b60606000805461011490610241565b80601f016020809104026020016040519081016040528092919081815260200182805461014090610241565b801561018d5780601f106101625761010080835404028352916020019161018d565b820191906000526020600020905b81548152906001019060200180831161017057829003601f168201915b5050505050905090565b60006101a2826101f2565b6101ac81856101fd565b93506101bc81856020860161020e565b6101c5816102a2565b840191505092915050565b600060208201905081810360008301526101ea8184610197565b905092915050565b600081519050919050565b600082825260208201905092915050565b60005b8381101561022c578082015181840152602081019050610211565b8381111561023b576000848401525b50505050565b6000600282049050600182168061025957607f821691505b6020821081141561026d5761026c610273565b5b50919050565b7f4e487b7100000000000000000000000000000000000000000000000000000000600052602260045260246000fd5b6000601f19601f830116905091905056fea264697066735822122017c4843f5eb967ac0510382c29490f71d578fef4ec13828b26ead64932eb0e0764736f6c63430008020033436f6e747261637420536861646f77696e67496e6865726974656453746174655661726961626c65735375706572";

    public static final String FUNC_GETNAME = "getName";

    public static final String FUNC_NAME = "name";

    protected ShadowingInheritedStateVariablesSuper(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected ShadowingInheritedStateVariablesSuper(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
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

    public static RemoteCall<ShadowingInheritedStateVariablesSuper> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return deployRemoteCall(ShadowingInheritedStateVariablesSuper.class, web3j, credentials, contractGasProvider, BINARY,  "");
    }

    public static RemoteCall<ShadowingInheritedStateVariablesSuper> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return deployRemoteCall(ShadowingInheritedStateVariablesSuper.class, web3j, transactionManager, contractGasProvider, BINARY,  "");
    }

    public static ShadowingInheritedStateVariablesSuper load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new ShadowingInheritedStateVariablesSuper(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static ShadowingInheritedStateVariablesSuper load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new ShadowingInheritedStateVariablesSuper(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
