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
public class BubbleSort extends Contract {
    private static final String BINARY = "608060405234801561001057600080fd5b506107a2806100206000396000f3fe6080604052600436106100295760003560e01c8063970f17bd1461002e578063f6dd00aa14610059575b600080fd5b34801561003a57600080fd5b50610043610075565b604051610050919061050b565b60405180910390f35b610073600480360381019061006e9190610432565b6100cd565b005b606060008054806020026020016040519081016040528092919081815260200182805480156100c357602002820191906000526020600020905b8154815260200190600101908083116100af575b5050505050905090565b60005b6001826100dd919061060d565b8110156102ec5760005b816001846100f5919061060d565b6100ff919061060d565b8110156102d8578360018261011491906105b7565b8151811061014b577f4e487b7100000000000000000000000000000000000000000000000000000000600052603260045260246000fd5b602002602001015184828151811061018c577f4e487b7100000000000000000000000000000000000000000000000000000000600052603260045260246000fd5b602002602001015113156102c55760008482815181106101d5577f4e487b7100000000000000000000000000000000000000000000000000000000600052603260045260246000fd5b60200260200101519050846001836101ed91906105b7565b81518110610224577f4e487b7100000000000000000000000000000000000000000000000000000000600052603260045260246000fd5b6020026020010151858381518110610265577f4e487b7100000000000000000000000000000000000000000000000000000000600052603260045260246000fd5b602002602001018181525050808560018461028091906105b7565b815181106102b7577f4e487b7100000000000000000000000000000000000000000000000000000000600052603260045260246000fd5b602002602001018181525050505b80806102d090610686565b9150506100e7565b5080806102e490610686565b9150506100d0565b508160009080519060200190610303929190610308565b505050565b828054828255906000526020600020908101928215610344579160200282015b82811115610343578251825591602001919060010190610328565b5b5090506103519190610355565b5090565b5b8082111561036e576000816000905550600101610356565b5090565b600061038561038084610552565b61052d565b905080838252602082019050828560208602820111156103a457600080fd5b60005b858110156103d457816103ba8882610408565b8452602084019350602083019250506001810190506103a7565b5050509392505050565b600082601f8301126103ef57600080fd5b81356103ff848260208601610372565b91505092915050565b6000813590506104178161073e565b92915050565b60008135905061042c81610755565b92915050565b6000806040838503121561044557600080fd5b600083013567ffffffffffffffff81111561045f57600080fd5b61046b858286016103de565b925050602061047c8582860161041d565b9150509250929050565b600061049283836104fc565b60208301905092915050565b60006104a98261058e565b6104b381856105a6565b93506104be8361057e565b8060005b838110156104ef5781516104d68882610486565b97506104e183610599565b9250506001810190506104c2565b5085935050505092915050565b61050581610641565b82525050565b60006020820190508181036000830152610525818461049e565b905092915050565b6000610537610548565b90506105438282610655565b919050565b6000604051905090565b600067ffffffffffffffff82111561056d5761056c6106fe565b5b602082029050602081019050919050565b6000819050602082019050919050565b600081519050919050565b6000602082019050919050565b600082825260208201905092915050565b60006105c28261064b565b91506105cd8361064b565b9250827fffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff03821115610602576106016106cf565b5b828201905092915050565b60006106188261064b565b91506106238361064b565b925082821015610636576106356106cf565b5b828203905092915050565b6000819050919050565b6000819050919050565b61065e8261072d565b810181811067ffffffffffffffff8211171561067d5761067c6106fe565b5b80604052505050565b60006106918261064b565b91507fffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff8214156106c4576106c36106cf565b5b600182019050919050565b7f4e487b7100000000000000000000000000000000000000000000000000000000600052601160045260246000fd5b7f4e487b7100000000000000000000000000000000000000000000000000000000600052604160045260246000fd5b6000601f19601f8301169050919050565b61074781610641565b811461075257600080fd5b50565b61075e8161064b565b811461076957600080fd5b5056fea2646970667358221220a8647e42ba040ec07995c6c098ea3783c10f7f99fc339568d6861b1b293007be64736f6c63430008020033";

    public static final String FUNC_BUBBLEARRAYS = "BubbleArrays";

    public static final String FUNC_GET_ARR = "get_arr";

    protected BubbleSort(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected BubbleSort(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteCall<TransactionReceipt> BubbleArrays(List<BigInteger> arr, BigInteger n, BigInteger vonValue) {
        final Function function = new Function(
                FUNC_BUBBLEARRAYS, 
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

    public static RemoteCall<BubbleSort> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return deployRemoteCall(BubbleSort.class, web3j, credentials, contractGasProvider, BINARY,  "");
    }

    public static RemoteCall<BubbleSort> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return deployRemoteCall(BubbleSort.class, web3j, transactionManager, contractGasProvider, BINARY,  "");
    }

    public static BubbleSort load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new BubbleSort(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static BubbleSort load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new BubbleSort(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
