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
public class AbstractContractFSubclass extends Contract {
    private static final String BINARY = "6080604052604051806020016040528060008152506000908051906020019061002992919061003c565b5034801561003657600080fd5b50610140565b828054610048906100df565b90600052602060002090601f01602090048101928261006a57600085556100b1565b82601f1061008357805160ff19168380011785556100b1565b828001600101855582156100b1579182015b828111156100b0578251825591602001919060010190610095565b5b5090506100be91906100c2565b5090565b5b808211156100db5760008160009055506001016100c3565b5090565b600060028204905060018216806100f757607f821691505b6020821081141561010b5761010a610111565b5b50919050565b7f4e487b7100000000000000000000000000000000000000000000000000000000600052602260045260246000fd5b6104f28061014f6000396000f3fe608060405234801561001057600080fd5b506004361061004b5760003560e01c8062af095414610050578063accab56b1461006c578063e16ae64014610088578063e652e565146100a6575b600080fd5b61006a6004803603810190610065919061029a565b6100c4565b005b6100866004803603810190610081919061029a565b6100de565b005b6100906100f8565b60405161009d9190610314565b60405180910390f35b6100ae6100fd565b6040516100bb9190610314565b60405180910390f35b80600090805190602001906100da92919061018f565b5050565b80600090805190602001906100f492919061018f565b5050565b606090565b60606000805461010c906103ea565b80601f0160208091040260200160405190810160405280929190818152602001828054610138906103ea565b80156101855780601f1061015a57610100808354040283529160200191610185565b820191906000526020600020905b81548152906001019060200180831161016857829003601f168201915b5050505050905090565b82805461019b906103ea565b90600052602060002090601f0160209004810192826101bd5760008555610204565b82601f106101d657805160ff1916838001178555610204565b82800160010185558215610204579182015b828111156102035782518255916020019190600101906101e8565b5b5090506102119190610215565b5090565b5b8082111561022e576000816000905550600101610216565b5090565b60006102456102408461035b565b610336565b90508281526020810184848401111561025d57600080fd5b6102688482856103a8565b509392505050565b600082601f83011261028157600080fd5b8135610291848260208601610232565b91505092915050565b6000602082840312156102ac57600080fd5b600082013567ffffffffffffffff8111156102c657600080fd5b6102d284828501610270565b91505092915050565b60006102e68261038c565b6102f08185610397565b93506103008185602086016103b7565b610309816104ab565b840191505092915050565b6000602082019050818103600083015261032e81846102db565b905092915050565b6000610340610351565b905061034c828261041c565b919050565b6000604051905090565b600067ffffffffffffffff8211156103765761037561047c565b5b61037f826104ab565b9050602081019050919050565b600081519050919050565b600082825260208201905092915050565b82818337600083830152505050565b60005b838110156103d55780820151818401526020810190506103ba565b838111156103e4576000848401525b50505050565b6000600282049050600182168061040257607f821691505b602082108114156104165761041561044d565b5b50919050565b610425826104ab565b810181811067ffffffffffffffff821117156104445761044361047c565b5b80604052505050565b7f4e487b7100000000000000000000000000000000000000000000000000000000600052602260045260246000fd5b7f4e487b7100000000000000000000000000000000000000000000000000000000600052604160045260246000fd5b6000601f19601f830116905091905056fea2646970667358221220368992e2003dad6442064339263dbfba20a3a7da885bb3d90797c837248349ff64736f6c63430008020033";

    public static final String FUNC_DSUBCLASSNAME = "dSubClassName";

    public static final String FUNC_PARENTNAME = "parentName";

    public static final String FUNC_SETPARENTNAME = "setParentName";

    public static final String FUNC_SETPARENTNAMED = "setParentNameD";

    protected AbstractContractFSubclass(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected AbstractContractFSubclass(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteCall<String> dSubClassName() {
        final Function function = new Function(FUNC_DSUBCLASSNAME, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<String> parentName() {
        final Function function = new Function(FUNC_PARENTNAME, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<TransactionReceipt> setParentName(String name) {
        final Function function = new Function(
                FUNC_SETPARENTNAME, 
                Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.Utf8String(name)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> setParentNameD(String name) {
        final Function function = new Function(
                FUNC_SETPARENTNAMED, 
                Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.Utf8String(name)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public static RemoteCall<AbstractContractFSubclass> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return deployRemoteCall(AbstractContractFSubclass.class, web3j, credentials, contractGasProvider, BINARY,  "");
    }

    public static RemoteCall<AbstractContractFSubclass> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return deployRemoteCall(AbstractContractFSubclass.class, web3j, transactionManager, contractGasProvider, BINARY,  "");
    }

    public static AbstractContractFSubclass load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new AbstractContractFSubclass(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static AbstractContractFSubclass load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new AbstractContractFSubclass(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
