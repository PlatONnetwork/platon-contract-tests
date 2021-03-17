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
public class ABIFunctions extends Contract {
    private static final String BINARY = "608060405234801561001057600080fd5b50610329806100206000396000f3fe608060405234801561001057600080fd5b50600436106100415760003560e01c8063538fad8b14610046578063911a336314610064578063b19d51e414610082575b600080fd5b61004e6100a0565b60405161005b9190610203565b60405180910390f35b61006c6100c5565b6040516100799190610203565b60405180910390f35b61008a6100ed565b6040516100979190610203565b60405180910390f35b60606040516020016100b1906101ee565b604051602081830303815290604052905090565b606060016040516020016100d99190610225565b604051602081830303815290604052905090565b606060016040516024016101019190610225565b6040516020818303038152906040527f60fe47b1000000000000000000000000000000000000000000000000000000007bffffffffffffffffffffffffffffffffffffffffffffffffffffffff19166020820180517bffffffffffffffffffffffffffffffffffffffffffffffffffffffff8381831617835250505050905090565b600061018e82610240565b610198818561024b565b93506101a8818560208601610286565b6101b1816102b9565b840191505092915050565b6101c581610274565b82525050565b60006101d860018361025c565b91506101e3826102ca565b600182019050919050565b60006101f9826101cb565b9150819050919050565b6000602082019050818103600083015261021d8184610183565b905092915050565b600060208201905061023a60008301846101bc565b92915050565b600081519050919050565b600082825260208201905092915050565b600081905092915050565b600060ff82169050919050565b600061027f82610267565b9050919050565b60005b838110156102a4578082015181840152602081019050610289565b838111156102b3576000848401525b50505050565b6000601f19601f8301169050919050565b7f310000000000000000000000000000000000000000000000000000000000000060008201525056fea26469706673582212203a9a6351471305cebc6b92ab4cf535d9a1bd371cba6110abb799552a741b951264736f6c63430008020033";

    public static final String FUNC_GETENCODE = "getEncode";

    public static final String FUNC_GETENCODEPACKED = "getEncodePacked";

    public static final String FUNC_GETENCODEWITHSIGNATURE = "getEncodeWithSignature";

    protected ABIFunctions(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected ABIFunctions(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteCall<byte[]> getEncode() {
        final Function function = new Function(FUNC_GETENCODE, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<DynamicBytes>() {}));
        return executeRemoteCallSingleValueReturn(function, byte[].class);
    }

    public RemoteCall<byte[]> getEncodePacked() {
        final Function function = new Function(FUNC_GETENCODEPACKED, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<DynamicBytes>() {}));
        return executeRemoteCallSingleValueReturn(function, byte[].class);
    }

    public RemoteCall<byte[]> getEncodeWithSignature() {
        final Function function = new Function(FUNC_GETENCODEWITHSIGNATURE, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<DynamicBytes>() {}));
        return executeRemoteCallSingleValueReturn(function, byte[].class);
    }

    public static RemoteCall<ABIFunctions> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return deployRemoteCall(ABIFunctions.class, web3j, credentials, contractGasProvider, BINARY,  "");
    }

    public static RemoteCall<ABIFunctions> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return deployRemoteCall(ABIFunctions.class, web3j, transactionManager, contractGasProvider, BINARY,  "");
    }

    public static ABIFunctions load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new ABIFunctions(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static ABIFunctions load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new ABIFunctions(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
