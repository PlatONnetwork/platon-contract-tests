package network.platon.contracts.evm.v0_8_2;

import com.platon.abi.solidity.TypeReference;
import com.platon.abi.solidity.datatypes.Function;
import com.platon.abi.solidity.datatypes.Type;
import com.platon.abi.solidity.datatypes.generated.Uint256;
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
public class SumAssembly extends Contract {
    private static final String BINARY = "608060405234801561001057600080fd5b506000600190806001815401808255809150506001900390600052602060002001600090919091909150556000600290806001815401808255809150506001900390600052602060002001600090919091909150556000600390806001815401808255809150506001900390600052602060002001600090919091909150556000600490806001815401808255809150506001900390600052602060002001600090919091909150556000600590806001815401808255809150506001900390600052602060002001600090919091909150556102cc806100f26000396000f3fe608060405234801561001057600080fd5b506004361061002b5760003560e01c8063853255cc14610030575b600080fd5b61003861004e565b60405161004591906101d8565b60405180910390f35b6000736c1889cb38bc67cdea120990fb193485a0a9d8ef6387fbcc7760006040518263ffffffff1660e01b815260040161008891906101b6565b60206040518083038186803b1580156100a057600080fd5b505af41580156100b4573d6000803e3d6000fd5b505050506040513d601f19601f820116820180604052508101906100d891906100f2565b905090565b6000815190506100ec8161027f565b92915050565b60006020828403121561010457600080fd5b6000610112848285016100dd565b91505092915050565b600061012783836101a7565b60208301905092915050565b600061013e82610208565b6101488185610220565b9350610153836101f3565b8060005b8381101561018b576101688261025f565b610172888261011b565b975061017d83610213565b925050600181019050610157565b5085935050505092915050565b6101a18161023b565b82525050565b6101b08161023b565b82525050565b600060208201905081810360008301526101d08184610133565b905092915050565b60006020820190506101ed6000830184610198565b92915050565b60008190508160005260206000209050919050565b600081549050919050565b6000600182019050919050565b600082825260208201905092915050565b6000819050919050565b6000819050919050565b600061025861025383610272565b610231565b9050919050565b600061026b8254610245565b9050919050565b60008160001c9050919050565b6102888161023b565b811461029357600080fd5b5056fea2646970667358221220230d7c330fa58339098b26f16a93b856787cbf54d8c08ce9a695094fd4f568c364736f6c63430008020033";

    public static final String FUNC_SUM = "sum";

    protected SumAssembly(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected SumAssembly(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static RemoteCall<SumAssembly> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return deployRemoteCall(SumAssembly.class, web3j, credentials, contractGasProvider, BINARY,  "");
    }

    public static RemoteCall<SumAssembly> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return deployRemoteCall(SumAssembly.class, web3j, transactionManager, contractGasProvider, BINARY,  "");
    }

    public RemoteCall<BigInteger> sum() {
        final Function function = new Function(FUNC_SUM, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public static SumAssembly load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new SumAssembly(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static SumAssembly load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new SumAssembly(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
