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
public class StringmappingSupport extends Contract {
    private static final String BINARY = "608060405234801561001057600080fd5b50610800806100206000396000f3fe608060405234801561001057600080fd5b506004361061004c5760003560e01c80638f39654914610051578063d4d7306b14610081578063e4e50f781461009d578063e78855a8146100b9575b600080fd5b61006b60048036038101906100669190610429565b6100e9565b60405161007891906105d4565b60405180910390f35b61009b600480360381019061009691906104e7565b6101c2565b005b6100b760048036038101906100b29190610452565b6101f9565b005b6100d360048036038101906100ce91906104a6565b610259565b6040516100e091906105d4565b60405180910390f35b6060600160008376ffffffffffffffffffffffffffffffffffffffffffffff191676ffffffffffffffffffffffffffffffffffffffffffffff19168152602001908152602001600020805461013d906106e1565b80601f0160208091040260200160405190810160405280929190818152602001828054610169906106e1565b80156101b65780601f1061018b576101008083540402835291602001916101b6565b820191906000526020600020905b81548152906001019060200180831161019957829003601f168201915b50505050509050919050565b806000836040516101d391906105bd565b908152602001604051809103902090805190602001906101f4929190610309565b505050565b80600160008476ffffffffffffffffffffffffffffffffffffffffffffff191676ffffffffffffffffffffffffffffffffffffffffffffff191681526020019081526020016000209080519060200190610254929190610309565b505050565b606060008260405161026b91906105bd565b90815260200160405180910390208054610284906106e1565b80601f01602080910402602001604051908101604052809291908181526020018280546102b0906106e1565b80156102fd5780601f106102d2576101008083540402835291602001916102fd565b820191906000526020600020905b8154815290600101906020018083116102e057829003601f168201915b50505050509050919050565b828054610315906106e1565b90600052602060002090601f016020900481019282610337576000855561037e565b82601f1061035057805160ff191683800117855561037e565b8280016001018555821561037e579182015b8281111561037d578251825591602001919060010190610362565b5b50905061038b919061038f565b5090565b5b808211156103a8576000816000905550600101610390565b5090565b60006103bf6103ba8461061b565b6105f6565b9050828152602081018484840111156103d757600080fd5b6103e284828561069f565b509392505050565b6000813590506103f9816107b3565b92915050565b600082601f83011261041057600080fd5b81356104208482602086016103ac565b91505092915050565b60006020828403121561043b57600080fd5b6000610449848285016103ea565b91505092915050565b6000806040838503121561046557600080fd5b6000610473858286016103ea565b925050602083013567ffffffffffffffff81111561049057600080fd5b61049c858286016103ff565b9150509250929050565b6000602082840312156104b857600080fd5b600082013567ffffffffffffffff8111156104d257600080fd5b6104de848285016103ff565b91505092915050565b600080604083850312156104fa57600080fd5b600083013567ffffffffffffffff81111561051457600080fd5b610520858286016103ff565b925050602083013567ffffffffffffffff81111561053d57600080fd5b610549858286016103ff565b9150509250929050565b600061055e8261064c565b6105688185610657565b93506105788185602086016106ae565b610581816107a2565b840191505092915050565b60006105978261064c565b6105a18185610668565b93506105b18185602086016106ae565b80840191505092915050565b60006105c9828461058c565b915081905092915050565b600060208201905081810360008301526105ee8184610553565b905092915050565b6000610600610611565b905061060c8282610713565b919050565b6000604051905090565b600067ffffffffffffffff82111561063657610635610773565b5b61063f826107a2565b9050602081019050919050565b600081519050919050565b600082825260208201905092915050565b600081905092915050565b60007fffffffffffffffffff000000000000000000000000000000000000000000000082169050919050565b82818337600083830152505050565b60005b838110156106cc5780820151818401526020810190506106b1565b838111156106db576000848401525b50505050565b600060028204905060018216806106f957607f821691505b6020821081141561070d5761070c610744565b5b50919050565b61071c826107a2565b810181811067ffffffffffffffff8211171561073b5761073a610773565b5b80604052505050565b7f4e487b7100000000000000000000000000000000000000000000000000000000600052602260045260246000fd5b7f4e487b7100000000000000000000000000000000000000000000000000000000600052604160045260246000fd5b6000601f19601f8301169050919050565b6107bc81610673565b81146107c757600080fd5b5056fea2646970667358221220879a2262b192967f818e7b978bd656251e7b3176c7e8f6fe764c1b8f9d24b3e564736f6c63430008020033";

    public static final String FUNC_GETBYTE32MAPVALUE = "getByte32mapValue";

    public static final String FUNC_GETSTRINGMAPVALUE = "getStringmapValue";

    public static final String FUNC_SETBYTE32MAPVALUE = "setByte32mapValue";

    public static final String FUNC_SETSTRINGMAPVALUE = "setStringmapValue";

    protected StringmappingSupport(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected StringmappingSupport(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteCall<String> getByte32mapValue(byte[] _key) {
        final Function function = new Function(FUNC_GETBYTE32MAPVALUE, 
                Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.generated.Bytes9(_key)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<String> getStringmapValue(String _key) {
        final Function function = new Function(FUNC_GETSTRINGMAPVALUE, 
                Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.Utf8String(_key)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<TransactionReceipt> setByte32mapValue(byte[] _key, String _value) {
        final Function function = new Function(
                FUNC_SETBYTE32MAPVALUE, 
                Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.generated.Bytes9(_key), 
                new com.platon.abi.solidity.datatypes.Utf8String(_value)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> setStringmapValue(String _key, String _value) {
        final Function function = new Function(
                FUNC_SETSTRINGMAPVALUE, 
                Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.Utf8String(_key), 
                new com.platon.abi.solidity.datatypes.Utf8String(_value)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public static RemoteCall<StringmappingSupport> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return deployRemoteCall(StringmappingSupport.class, web3j, credentials, contractGasProvider, BINARY,  "");
    }

    public static RemoteCall<StringmappingSupport> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return deployRemoteCall(StringmappingSupport.class, web3j, transactionManager, contractGasProvider, BINARY,  "");
    }

    public static StringmappingSupport load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new StringmappingSupport(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static StringmappingSupport load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new StringmappingSupport(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
