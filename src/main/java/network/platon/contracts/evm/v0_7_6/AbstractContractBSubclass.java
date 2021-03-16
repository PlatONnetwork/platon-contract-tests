package network.platon.contracts.evm.v0_7_6;

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
    private static final String BINARY = "6080604052604051806020016040528060008152506000908051906020019061002992919061003c565b5034801561003657600080fd5b506100e7565b828054600181600116156101000203166002900490600052602060002090601f01602090048101928261007257600085556100b9565b82601f1061008b57805160ff19168380011785556100b9565b828001600101855582156100b9579182015b828111156100b857825182559160200191906001019061009d565b5b5090506100c691906100ca565b5090565b5b808211156100e35760008160009055506001016100cb565b5090565b6103e7806100f66000396000f3fe608060405234801561001057600080fd5b50600436106100415760003560e01c80630fdd8d4514610046578063accab56b146100c9578063e652e56514610184575b600080fd5b61004e610207565b6040518080602001828103825283818151815260200191508051906020019080838360005b8381101561008e578082015181840152602081019050610073565b50505050905090810190601f1680156100bb5780820380516001836020036101000a031916815260200191505b509250505060405180910390f35b610182600480360360208110156100df57600080fd5b81019080803590602001906401000000008111156100fc57600080fd5b82018360208201111561010e57600080fd5b8035906020019184600183028401116401000000008311171561013057600080fd5b91908080601f016020809104026020016040519081016040528093929190818152602001838380828437600081840152601f19601f82011690508083019250505050505050919291929050505061024a565b005b61018c610264565b6040518080602001828103825283818151815260200191508051906020019080838360005b838110156101cc5780820151818401526020810190506101b1565b50505050905090810190601f1680156101f95780820380516001836020036101000a031916815260200191505b509250505060405180910390f35b606060006040518060400160405280600881526020017f625375624e616d6500000000000000000000000000000000000000000000000081525090508091505090565b8060009080519060200190610260929190610306565b5050565b606060008054600181600116156101000203166002900480601f0160208091040260200160405190810160405280929190818152602001828054600181600116156101000203166002900480156102fc5780601f106102d1576101008083540402835291602001916102fc565b820191906000526020600020905b8154815290600101906020018083116102df57829003601f168201915b5050505050905090565b828054600181600116156101000203166002900490600052602060002090601f01602090048101928261033c5760008555610383565b82601f1061035557805160ff1916838001178555610383565b82800160010185558215610383579182015b82811115610382578251825591602001919060010190610367565b5b5090506103909190610394565b5090565b5b808211156103ad576000816000905550600101610395565b509056fea264697066735822122088e1f121771c707307544de3e495c4cd4cc86ca128d97fb227d26e24491ea10464736f6c63430007060033";

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
