package network.platon.contracts.evm.v0_8_2;

import com.platon.abi.solidity.TypeReference;
import com.platon.abi.solidity.datatypes.Function;
import com.platon.abi.solidity.datatypes.Type;
import com.platon.abi.solidity.datatypes.Utf8String;
import com.platon.abi.solidity.datatypes.generated.Int256;
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
public class AnimalExternal extends Contract {
    private static final String BINARY = "608060405234801561001057600080fd5b50601d60018190555060aa6002819055506040518060400160405280600981526020017f4c75636b7920646f6700000000000000000000000000000000000000000000008152506003908051906020019061006c9291906100be565b506040518060400160405280600a81526020017f323031312d30312d303100000000000000000000000000000000000000000000815250600090805190602001906100b89291906100be565b506101c2565b8280546100ca90610161565b90600052602060002090601f0160209004810192826100ec5760008555610133565b82601f1061010557805160ff1916838001178555610133565b82800160010185558215610133579182015b82811115610132578251825591602001919060010190610117565b5b5090506101409190610144565b5090565b5b8082111561015d576000816000905550600101610145565b5090565b6000600282049050600182168061017957607f821691505b6020821081141561018d5761018c610193565b5b50919050565b7f4e487b7100000000000000000000000000000000000000000000000000000000600052602260045260246000fd5b6102c8806101d16000396000f3fe608060405234801561001057600080fd5b50600436106100415760003560e01c8063262a9dff14610046578063beb0067e14610064578063f377bd5b14610082575b600080fd5b61004e6100a0565b60405161005b919061018a565b60405180910390f35b61006c6100aa565b60405161007991906101a5565b60405180910390f35b61008a61013c565b604051610097919061018a565b60405180910390f35b6000600154905090565b6060600080546100b990610220565b80601f01602080910402602001604051908101604052809291908181526020018280546100e590610220565b80156101325780601f1061010757610100808354040283529160200191610132565b820191906000526020600020905b81548152906001019060200180831161011557829003601f168201915b5050505050905090565b60015481565b61014b816101e3565b82525050565b600061015c826101c7565b61016681856101d2565b93506101768185602086016101ed565b61017f81610281565b840191505092915050565b600060208201905061019f6000830184610142565b92915050565b600060208201905081810360008301526101bf8184610151565b905092915050565b600081519050919050565b600082825260208201905092915050565b6000819050919050565b60005b8381101561020b5780820151818401526020810190506101f0565b8381111561021a576000848401525b50505050565b6000600282049050600182168061023857607f821691505b6020821081141561024c5761024b610252565b5b50919050565b7f4e487b7100000000000000000000000000000000000000000000000000000000600052602260045260246000fd5b6000601f19601f830116905091905056fea26469706673582212206e3547823d8975c44e9ed84c1447324bebf27b44f154b6e7be4fb1f2acdd0e6664736f6c63430008020033";

    public static final String FUNC__AGE = "_age";

    public static final String FUNC_AGE = "age";

    public static final String FUNC_BIRTHDAY = "birthDay";

    protected AnimalExternal(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected AnimalExternal(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static RemoteCall<AnimalExternal> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return deployRemoteCall(AnimalExternal.class, web3j, credentials, contractGasProvider, BINARY,  "");
    }

    public static RemoteCall<AnimalExternal> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return deployRemoteCall(AnimalExternal.class, web3j, transactionManager, contractGasProvider, BINARY,  "");
    }

    public RemoteCall<BigInteger> _age() {
        final Function function = new Function(FUNC__AGE, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Int256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<BigInteger> age() {
        final Function function = new Function(FUNC_AGE, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Int256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<String> birthDay() {
        final Function function = new Function(FUNC_BIRTHDAY, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public static AnimalExternal load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new AnimalExternal(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static AnimalExternal load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new AnimalExternal(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
