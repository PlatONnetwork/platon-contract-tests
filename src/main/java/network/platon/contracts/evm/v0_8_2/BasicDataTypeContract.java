package network.platon.contracts.evm.v0_8_2;

import com.platon.abi.solidity.TypeReference;
import com.platon.abi.solidity.datatypes.Function;
import com.platon.abi.solidity.datatypes.Type;
import com.platon.abi.solidity.datatypes.generated.Int8;
import com.platon.abi.solidity.datatypes.generated.Uint256;
import com.platon.abi.solidity.datatypes.generated.Uint8;
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
public class BasicDataTypeContract extends Contract {
    private static final String BINARY = "60806040527fffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff60005560018055600280556001600360006101000a81548160ff021916908360ff16021790555060ff600360016101000a81548160ff021916908360ff1602179055506001600360026101000a81548161ffff021916908361ffff16021790555061ffff600360046101000a81548161ffff021916908361ffff1602179055506001600360066101000a81548160ff021916908360000b60ff160217905550607f600360076101000a81548160ff021916908360000b60ff1602179055507fffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff600360086101000a81548160ff021916908360000b60ff1602179055507fffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff80600360096101000a81548160ff021916908360000b60ff16021790555060016003600a6101000a81548160ff02191690831515021790555060006003600b6101000a81548160ff0219169083151502179055507f61000000000000000000000000000000000000000000000000000000000000006003600c6101000a81548160ff021916908360f81c0217905550600160f81b6003600d6101000a81548160ff021916908360f81c02179055507f61620000000000000000000000000000000000000000000000000000000000006003600e6101000a81548161ffff021916908360f01c02179055507f6162630000000000000000000000000000000000000000000000000000000000600360106101000a81548162ffffff021916908360e81c02179055506040518060400160405280600181526020017f6100000000000000000000000000000000000000000000000000000000000000815250600490805190602001906102b392919061035e565b506040518060400160405280600281526020017f6162000000000000000000000000000000000000000000000000000000000000815250600590805190602001906102ff92919061035e565b506040518060400160405280600381526020017f61626300000000000000000000000000000000000000000000000000000000008152506006908051906020019061034b92919061035e565b5034801561035857600080fd5b50610462565b82805461036a90610401565b90600052602060002090601f01602090048101928261038c57600085556103d3565b82601f106103a557805160ff19168380011785556103d3565b828001600101855582156103d3579182015b828111156103d25782518255916020019190600101906103b7565b5b5090506103e091906103e4565b5090565b5b808211156103fd5760008160009055506001016103e5565b5090565b6000600282049050600182168061041957607f821691505b6020821081141561042d5761042c610433565b5b50919050565b7f4e487b7100000000000000000000000000000000000000000000000000000000600052602260045260246000fd5b610407806104716000396000f3fe608060405234801561001057600080fd5b506004361061004c5760003560e01c806307da3eae146100515780633d9ceb371461006f5780635c5c84191461009f578063d29f1598146100bd575b600080fd5b6100596100ed565b604051610066919061020d565b60405180910390f35b61008960048036038101906100849190610173565b610103565b60405161009691906101f2565b60405180910390f35b6100a7610119565b6040516100b4919061020d565b60405180910390f35b6100d760048036038101906100d2919061019c565b610133565b6040516100e49190610228565b60405180910390f35b6000600680546100fc90610313565b9050905090565b60006001826101129190610243565b9050919050565b60006003600e9054906101000a905050600260ff16905090565b600060018261014291906102b8565b9050919050565b600081359050610158816103a3565b92915050565b60008135905061016d816103ba565b92915050565b60006020828403121561018557600080fd5b600061019384828501610149565b91505092915050565b6000602082840312156101ae57600080fd5b60006101bc8482850161015e565b91505092915050565b6101ce816102ef565b82525050565b6101dd816102fc565b82525050565b6101ec81610306565b82525050565b600060208201905061020760008301846101c5565b92915050565b600060208201905061022260008301846101d4565b92915050565b600060208201905061023d60008301846101e3565b92915050565b600061024e826102ef565b9150610259836102ef565b925081607f0383136000831215161561027557610274610345565b5b817fffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff800383126000831216156102ad576102ac610345565b5b828201905092915050565b60006102c382610306565b91506102ce83610306565b92508260ff038211156102e4576102e3610345565b5b828201905092915050565b60008160000b9050919050565b6000819050919050565b600060ff82169050919050565b6000600282049050600182168061032b57607f821691505b6020821081141561033f5761033e610374565b5b50919050565b7f4e487b7100000000000000000000000000000000000000000000000000000000600052601160045260246000fd5b7f4e487b7100000000000000000000000000000000000000000000000000000000600052602260045260246000fd5b6103ac816102ef565b81146103b757600080fd5b50565b6103c381610306565b81146103ce57600080fd5b5056fea2646970667358221220408e083341461711dea55d9768d7d5a951baf76392e5568ba6feb42f436c98bc64736f6c63430008020033";

    public static final String FUNC_ADDINTOVERFLOW = "addIntOverflow";

    public static final String FUNC_ADDUINTOVERFLOW = "addUintOverflow";

    public static final String FUNC_GETBYTES1LENGTH = "getBytes1Length";

    public static final String FUNC_GETBYTESLENGTH = "getBytesLength";

    protected BasicDataTypeContract(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected BasicDataTypeContract(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteCall<BigInteger> addIntOverflow(BigInteger a) {
        final Function function = new Function(FUNC_ADDINTOVERFLOW, 
                Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.generated.Int8(a)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Int8>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<BigInteger> addUintOverflow(BigInteger a) {
        final Function function = new Function(FUNC_ADDUINTOVERFLOW, 
                Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.generated.Uint8(a)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint8>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<BigInteger> getBytes1Length() {
        final Function function = new Function(FUNC_GETBYTES1LENGTH, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<BigInteger> getBytesLength() {
        final Function function = new Function(FUNC_GETBYTESLENGTH, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public static RemoteCall<BasicDataTypeContract> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return deployRemoteCall(BasicDataTypeContract.class, web3j, credentials, contractGasProvider, BINARY,  "");
    }

    public static RemoteCall<BasicDataTypeContract> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return deployRemoteCall(BasicDataTypeContract.class, web3j, transactionManager, contractGasProvider, BINARY,  "");
    }

    public static BasicDataTypeContract load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new BasicDataTypeContract(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static BasicDataTypeContract load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new BasicDataTypeContract(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
