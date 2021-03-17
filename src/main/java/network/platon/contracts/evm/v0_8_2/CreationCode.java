package network.platon.contracts.evm.v0_8_2;

import com.platon.abi.solidity.TypeReference;
import com.platon.abi.solidity.datatypes.DynamicBytes;
import com.platon.abi.solidity.datatypes.Function;
import com.platon.abi.solidity.datatypes.Type;
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
public class CreationCode extends Contract {
    private static final String BINARY = "608060405234801561001057600080fd5b50610363806100206000396000f3fe608060405234801561001057600080fd5b50600436106100365760003560e01c8063ade003e81461003b578063f5f5ba7214610059575b600080fd5b610043610077565b604051610050919061010f565b60405180910390f35b61006161009e565b60405161006e919061010f565b60405180910390f35b60405180602001610087906100c9565b6020820181038252601f19601f8201166040525081565b6060604051806020016100b0906100c9565b6020820181038252601f19601f82011660405250905090565b61019c8061019283390190565b60006100e182610131565b6100eb818561013c565b93506100fb81856020860161014d565b61010481610180565b840191505092915050565b6000602082019050818103600083015261012981846100d6565b905092915050565b600081519050919050565b600082825260208201905092915050565b60005b8381101561016b578082015181840152602081019050610150565b8381111561017a576000848401525b50505050565b6000601f19601f830116905091905056fe608060405234801561001057600080fd5b5061017c806100206000396000f3fe608060405234801561001057600080fd5b506004361061002b5760003560e01c80632096525514610030575b600080fd5b61003861004e565b60405161004591906100c4565b60405180910390f35b60606040518060400160405280600581526020017f68656c6c6f000000000000000000000000000000000000000000000000000000815250905090565b6000610096826100e6565b6100a081856100f1565b93506100b0818560208601610102565b6100b981610135565b840191505092915050565b600060208201905081810360008301526100de818461008b565b905092915050565b600081519050919050565b600082825260208201905092915050565b60005b83811015610120578082015181840152602081019050610105565b8381111561012f576000848401525b50505050565b6000601f19601f830116905091905056fea26469706673582212209125fa3dad06b7d5b65a7d5111f0075b5c93d1511cc0099c43204972be3ac0eb64736f6c63430008020033a2646970667358221220e5771b8cff93678e1b574079cb0ae709255b9a9c840f3172b449d0ac68673b6764736f6c63430008020033";

    public static final String FUNC_CREATIONCODEINFO = "creationCodeInfo";

    public static final String FUNC_GETCONTRACTNAME = "getContractName";

    protected CreationCode(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected CreationCode(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteCall<byte[]> creationCodeInfo() {
        final Function function = new Function(FUNC_CREATIONCODEINFO, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<DynamicBytes>() {}));
        return executeRemoteCallSingleValueReturn(function, byte[].class);
    }

    public RemoteCall<byte[]> getContractName() {
        final Function function = new Function(FUNC_GETCONTRACTNAME, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<DynamicBytes>() {}));
        return executeRemoteCallSingleValueReturn(function, byte[].class);
    }

    public static RemoteCall<CreationCode> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return deployRemoteCall(CreationCode.class, web3j, credentials, contractGasProvider, BINARY,  "");
    }

    public static RemoteCall<CreationCode> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return deployRemoteCall(CreationCode.class, web3j, transactionManager, contractGasProvider, BINARY,  "");
    }

    public static CreationCode load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new CreationCode(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static CreationCode load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new CreationCode(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
