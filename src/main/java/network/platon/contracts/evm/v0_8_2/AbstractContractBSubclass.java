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
public class AbstractContractBSubclass extends Contract {
    private static final String BINARY = "6080604052604051806020016040528060008152506000908051906020019061002992919061003c565b5034801561003657600080fd5b50610140565b828054610048906100df565b90600052602060002090601f01602090048101928261006a57600085556100b1565b82601f1061008357805160ff19168380011785556100b1565b828001600101855582156100b1579182015b828111156100b0578251825591602001919060010190610095565b5b5090506100be91906100c2565b5090565b5b808211156100db5760008160009055506001016100c3565b5090565b600060028204905060018216806100f757607f821691505b6020821081141561010b5761010a610111565b5b50919050565b7f4e487b7100000000000000000000000000000000000000000000000000000000600052602260045260246000fd5b6104f08061014f6000396000f3fe608060405234801561001057600080fd5b50600436106100415760003560e01c80630fdd8d4514610046578063accab56b14610064578063e652e56514610080575b600080fd5b61004e61009e565b60405161005b9190610312565b60405180910390f35b61007e60048036038101906100799190610298565b6100e1565b005b6100886100fb565b6040516100959190610312565b60405180910390f35b606060006040518060400160405280600881526020017f625375624e616d6500000000000000000000000000000000000000000000000081525090508091505090565b80600090805190602001906100f792919061018d565b5050565b60606000805461010a906103e8565b80601f0160208091040260200160405190810160405280929190818152602001828054610136906103e8565b80156101835780601f1061015857610100808354040283529160200191610183565b820191906000526020600020905b81548152906001019060200180831161016657829003601f168201915b5050505050905090565b828054610199906103e8565b90600052602060002090601f0160209004810192826101bb5760008555610202565b82601f106101d457805160ff1916838001178555610202565b82800160010185558215610202579182015b828111156102015782518255916020019190600101906101e6565b5b50905061020f9190610213565b5090565b5b8082111561022c576000816000905550600101610214565b5090565b600061024361023e84610359565b610334565b90508281526020810184848401111561025b57600080fd5b6102668482856103a6565b509392505050565b600082601f83011261027f57600080fd5b813561028f848260208601610230565b91505092915050565b6000602082840312156102aa57600080fd5b600082013567ffffffffffffffff8111156102c457600080fd5b6102d08482850161026e565b91505092915050565b60006102e48261038a565b6102ee8185610395565b93506102fe8185602086016103b5565b610307816104a9565b840191505092915050565b6000602082019050818103600083015261032c81846102d9565b905092915050565b600061033e61034f565b905061034a828261041a565b919050565b6000604051905090565b600067ffffffffffffffff8211156103745761037361047a565b5b61037d826104a9565b9050602081019050919050565b600081519050919050565b600082825260208201905092915050565b82818337600083830152505050565b60005b838110156103d35780820151818401526020810190506103b8565b838111156103e2576000848401525b50505050565b6000600282049050600182168061040057607f821691505b602082108114156104145761041361044b565b5b50919050565b610423826104a9565b810181811067ffffffffffffffff821117156104425761044161047a565b5b80604052505050565b7f4e487b7100000000000000000000000000000000000000000000000000000000600052602260045260246000fd5b7f4e487b7100000000000000000000000000000000000000000000000000000000600052604160045260246000fd5b6000601f19601f830116905091905056fea2646970667358221220b13b953b6fbc31e89441d0ab73746fa2ee05c88cc860c872305a3b88f01f286164736f6c63430008020033";

    public static final String FUNC_BSUBNAME = "bSubName";

    public static final String FUNC_PARENTNAME = "parentName";

    public static final String FUNC_SETPARENTNAME = "setParentName";

    protected AbstractContractBSubclass(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected AbstractContractBSubclass(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteCall<String> bSubName() {
        final Function function = new Function(FUNC_BSUBNAME, 
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

    public static RemoteCall<AbstractContractBSubclass> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return deployRemoteCall(AbstractContractBSubclass.class, web3j, credentials, contractGasProvider, BINARY,  "");
    }

    public static RemoteCall<AbstractContractBSubclass> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return deployRemoteCall(AbstractContractBSubclass.class, web3j, transactionManager, contractGasProvider, BINARY,  "");
    }

    public static AbstractContractBSubclass load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new AbstractContractBSubclass(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static AbstractContractBSubclass load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new AbstractContractBSubclass(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
