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
public class PersonPublic extends Contract {
    private static final String BINARY = "608060405234801561001057600080fd5b50601d60018190555060aa6002819055506040518060400160405280600981526020017f4c75636b7920646f6700000000000000000000000000000000000000000000008152506003908051906020019061006c9291906100be565b506040518060400160405280600a81526020017f323031312d30312d303100000000000000000000000000000000000000000000815250600090805190602001906100b89291906100be565b506101c2565b8280546100ca90610161565b90600052602060002090601f0160209004810192826100ec5760008555610133565b82601f1061010557805160ff1916838001178555610133565b82800160010185558215610133579182015b82811115610132578251825591602001919060010190610117565b5b5090506101409190610144565b5090565b5b8082111561015d576000816000905550600101610145565b5090565b6000600282049050600182168061017957607f821691505b6020821081141561018d5761018c610193565b5b50919050565b7f4e487b7100000000000000000000000000000000000000000000000000000000600052602260045260246000fd5b610212806101d16000396000f3fe608060405234801561001057600080fd5b50600436106100415760003560e01c8063262a9dff14610046578063beb0067e14610064578063f377bd5b14610082575b600080fd5b61004e6100a0565b60405161005b9190610135565b60405180910390f35b61006c6100aa565b6040516100799190610150565b60405180910390f35b61008a6100e7565b6040516100979190610135565b60405180910390f35b6000600154905090565b60606040518060400160405280600a81526020017f323032302d31322d313500000000000000000000000000000000000000000000815250905090565b60015481565b6100f68161018e565b82525050565b600061010782610172565b610111818561017d565b9350610121818560208601610198565b61012a816101cb565b840191505092915050565b600060208201905061014a60008301846100ed565b92915050565b6000602082019050818103600083015261016a81846100fc565b905092915050565b600081519050919050565b600082825260208201905092915050565b6000819050919050565b60005b838110156101b657808201518184015260208101905061019b565b838111156101c5576000848401525b50505050565b6000601f19601f830116905091905056fea26469706673582212202792beb26440244dd650cd928601a9f72b1a3f8145620d69e9b6f96ca3097ff464736f6c63430008020033";

    public static final String FUNC__AGE = "_age";

    public static final String FUNC_AGE = "age";

    public static final String FUNC_BIRTHDAY = "birthDay";

    protected PersonPublic(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected PersonPublic(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
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

    public static RemoteCall<PersonPublic> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return deployRemoteCall(PersonPublic.class, web3j, credentials, contractGasProvider, BINARY,  "");
    }

    public static RemoteCall<PersonPublic> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return deployRemoteCall(PersonPublic.class, web3j, transactionManager, contractGasProvider, BINARY,  "");
    }

    public static PersonPublic load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new PersonPublic(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static PersonPublic load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new PersonPublic(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
