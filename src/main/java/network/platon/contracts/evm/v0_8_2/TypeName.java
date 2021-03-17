package network.platon.contracts.evm.v0_8_2;

import com.platon.abi.solidity.TypeReference;
import com.platon.abi.solidity.datatypes.Function;
import com.platon.abi.solidity.datatypes.Type;
import com.platon.abi.solidity.datatypes.Utf8String;
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
public class TypeName extends Contract {
    private static final String BINARY = "608060405234801561001057600080fd5b506101de806100206000396000f3fe608060405234801561001057600080fd5b50600436106100365760003560e01c806306fdde031461003b578063f5f5ba7214610059575b600080fd5b610043610077565b6040516100509190610126565b60405180910390f35b6100616100b0565b60405161006e9190610126565b60405180910390f35b6040518060400160405260088152806020017f547970654e616d6500000000000000000000000000000000000000000000000081525081565b60606040518060400160405260088152806020017f547970654e616d65000000000000000000000000000000000000000000000000815250905090565b60006100f882610148565b6101028185610153565b9350610112818560208601610164565b61011b81610197565b840191505092915050565b6000602082019050818103600083015261014081846100ed565b905092915050565b600081519050919050565b600082825260208201905092915050565b60005b83811015610182578082015181840152602081019050610167565b83811115610191576000848401525b50505050565b6000601f19601f830116905091905056fea264697066735822122038c3e2e9532d17c2b36ceb69756217450bf59d3ee57e39fa8b9617c3d1dbaf6864736f6c63430008020033";

    public static final String FUNC_GETCONTRACTNAME = "getContractName";

    public static final String FUNC_NAME = "name";

    protected TypeName(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected TypeName(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteCall<TransactionReceipt> getContractName() {
        final Function function = new Function(
                FUNC_GETCONTRACTNAME, 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<String> name() {
        final Function function = new Function(FUNC_NAME, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public static RemoteCall<TypeName> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return deployRemoteCall(TypeName.class, web3j, credentials, contractGasProvider, BINARY,  "");
    }

    public static RemoteCall<TypeName> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return deployRemoteCall(TypeName.class, web3j, transactionManager, contractGasProvider, BINARY,  "");
    }

    public static TypeName load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new TypeName(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static TypeName load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new TypeName(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
