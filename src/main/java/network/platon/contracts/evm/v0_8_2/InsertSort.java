package network.platon.contracts.evm.v0_8_2;

import com.platon.abi.solidity.TypeReference;
import com.platon.abi.solidity.datatypes.DynamicArray;
import com.platon.abi.solidity.datatypes.Function;
import com.platon.abi.solidity.datatypes.Type;
import com.platon.abi.solidity.datatypes.generated.Int256;
import com.platon.crypto.Credentials;
import com.platon.protocol.Web3j;
import com.platon.protocol.core.RemoteCall;
import com.platon.protocol.core.methods.response.TransactionReceipt;
import com.platon.tx.Contract;
import com.platon.tx.TransactionManager;
import com.platon.tx.gas.GasProvider;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://github.com/PlatONnetwork/client-sdk-java/releases">platon-web3j command line tools</a>,
 * or the com.platon.codegen.SolidityFunctionWrapperGenerator in the 
 * <a href="https://github.com/PlatONnetwork/client-sdk-java/tree/master/codegen">codegen module</a> to update.
 *
 * <p>Generated with web3j version 0.15.1.7.
 */
public class InsertSort extends Contract {
    private static final String BINARY = "608060405234801561001057600080fd5b50610716806100206000396000f3fe6080604052600436106100295760003560e01c80631df339cf1461002e578063970f17bd1461004a575b600080fd5b610048600480360381019061004391906103d2565b610075565b005b34801561005657600080fd5b5061005f610250565b60405161006c91906104ab565b60405180910390f35b6000806000600192505b83831015610232576000808685815181106100c3577f4e487b7100000000000000000000000000000000000000000000000000000000600052603260045260246000fd5b602002602001015190508492505b6001831015801561012d5750866001846100eb9190610557565b81518110610122577f4e487b7100000000000000000000000000000000000000000000000000000000600052603260045260246000fd5b602002602001015181125b156101d757866001846101409190610557565b81518110610177577f4e487b7100000000000000000000000000000000000000000000000000000000600052603260045260246000fd5b60200260200101518784815181106101b8577f4e487b7100000000000000000000000000000000000000000000000000000000600052603260045260246000fd5b60200260200101818152505082806101cf9061059f565b9350506100d1565b80878481518110610211577f4e487b7100000000000000000000000000000000000000000000000000000000600052603260045260246000fd5b6020026020010181815250505050828061022a906105fa565b93505061007f565b84600090805190602001906102489291906102a8565b505050505050565b6060600080548060200260200160405190810160405280929190818152602001828054801561029e57602002820191906000526020600020905b81548152602001906001019080831161028a575b5050505050905090565b8280548282559060005260206000209081019282156102e4579160200282015b828111156102e35782518255916020019190600101906102c8565b5b5090506102f191906102f5565b5090565b5b8082111561030e5760008160009055506001016102f6565b5090565b6000610325610320846104f2565b6104cd565b9050808382526020820190508285602086028201111561034457600080fd5b60005b85811015610374578161035a88826103a8565b845260208401935060208301925050600181019050610347565b5050509392505050565b600082601f83011261038f57600080fd5b813561039f848260208601610312565b91505092915050565b6000813590506103b7816106b2565b92915050565b6000813590506103cc816106c9565b92915050565b600080604083850312156103e557600080fd5b600083013567ffffffffffffffff8111156103ff57600080fd5b61040b8582860161037e565b925050602061041c858286016103bd565b9150509250929050565b6000610432838361049c565b60208301905092915050565b60006104498261052e565b6104538185610546565b935061045e8361051e565b8060005b8381101561048f5781516104768882610426565b975061048183610539565b925050600181019050610462565b5085935050505092915050565b6104a58161058b565b82525050565b600060208201905081810360008301526104c5818461043e565b905092915050565b60006104d76104e8565b90506104e382826105c9565b919050565b6000604051905090565b600067ffffffffffffffff82111561050d5761050c610672565b5b602082029050602081019050919050565b6000819050602082019050919050565b600081519050919050565b6000602082019050919050565b600082825260208201905092915050565b600061056282610595565b915061056d83610595565b9250828210156105805761057f610643565b5b828203905092915050565b6000819050919050565b6000819050919050565b60006105aa82610595565b915060008214156105be576105bd610643565b5b600182039050919050565b6105d2826106a1565b810181811067ffffffffffffffff821117156105f1576105f0610672565b5b80604052505050565b600061060582610595565b91507fffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff82141561063857610637610643565b5b600182019050919050565b7f4e487b7100000000000000000000000000000000000000000000000000000000600052601160045260246000fd5b7f4e487b7100000000000000000000000000000000000000000000000000000000600052604160045260246000fd5b6000601f19601f8301169050919050565b6106bb8161058b565b81146106c657600080fd5b50565b6106d281610595565b81146106dd57600080fd5b5056fea26469706673582212201c77a5f6301244c116af622806ca158d837803bc3dc8f55cca0d8320adbd56c864736f6c63430008020033";

    public static final String FUNC_OUPUTARRAYS = "OuputArrays";

    public static final String FUNC_GET_ARR = "get_arr";

    protected InsertSort(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected InsertSort(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteCall<TransactionReceipt> OuputArrays(List<BigInteger> arr, BigInteger n, BigInteger vonValue) {
        final Function function = new Function(
                FUNC_OUPUTARRAYS, 
                Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.DynamicArray<com.platon.abi.solidity.datatypes.generated.Int256>(
                com.platon.abi.solidity.datatypes.generated.Int256.class,
                        com.platon.abi.solidity.Utils.typeMap(arr, com.platon.abi.solidity.datatypes.generated.Int256.class)), 
                new com.platon.abi.solidity.datatypes.generated.Uint256(n)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function, vonValue);
    }

    public RemoteCall<List> get_arr() {
        final Function function = new Function(FUNC_GET_ARR, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<DynamicArray<Int256>>() {}));
        return new RemoteCall<List>(
                new Callable<List>() {
                    @Override
                    @SuppressWarnings("unchecked")
                    public List call() throws Exception {
                        List<Type> result = (List<Type>) executeCallSingleValueReturn(function, List.class);
                        return convertToNative(result);
                    }
                });
    }

    public static RemoteCall<InsertSort> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return deployRemoteCall(InsertSort.class, web3j, credentials, contractGasProvider, BINARY,  "");
    }

    public static RemoteCall<InsertSort> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return deployRemoteCall(InsertSort.class, web3j, transactionManager, contractGasProvider, BINARY,  "");
    }

    public static InsertSort load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new InsertSort(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static InsertSort load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new InsertSort(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
