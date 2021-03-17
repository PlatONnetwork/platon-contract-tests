package network.platon.contracts.evm.v0_8_2;

import com.platon.abi.solidity.TypeReference;
import com.platon.abi.solidity.datatypes.Address;
import com.platon.abi.solidity.datatypes.DynamicArray;
import com.platon.abi.solidity.datatypes.Function;
import com.platon.abi.solidity.datatypes.Type;
import com.platon.crypto.Credentials;
import com.platon.protocol.Web3j;
import com.platon.protocol.core.RemoteCall;
import com.platon.protocol.core.methods.response.TransactionReceipt;
import com.platon.tx.Contract;
import com.platon.tx.TransactionManager;
import com.platon.tx.gas.GasProvider;
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
public class ContractArray extends Contract {
    private static final String BINARY = "6080604052600367ffffffffffffffff811115610045577f4e487b7100000000000000000000000000000000000000000000000000000000600052604160045260246000fd5b6040519080825280602002602001820160405280156100735781602001602082028036833780820191505090505b506000908051906020019061008992919061009c565b5034801561009657600080fd5b50610143565b828054828255906000526020600020908101928215610115579160200282015b828111156101145782518260006101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff160217905550916020019190600101906100bc565b5b5090506101229190610126565b5090565b5b8082111561013f576000816000905550600101610127565b5090565b61047f806101526000396000f3fe608060405234801561001057600080fd5b50600436106100415760003560e01c806326121ff014610046578063807b4c3314610050578063e276c7991461006e575b600080fd5b61004e61008c565b005b6100586101e7565b604051610065919061038f565b60405180910390f35b610076610275565b60405161008391906103b1565b60405180910390f35b6100946102d9565b6000309080600181540180825580915050600190039060005260206000200160009091909190916101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff160217905550306001600060038110610133577f4e487b7100000000000000000000000000000000000000000000000000000000600052603260045260246000fd5b0160006101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff16021790555030816000600381106101ad577f4e487b7100000000000000000000000000000000000000000000000000000000600052603260045260246000fd5b602002019073ffffffffffffffffffffffffffffffffffffffff16908173ffffffffffffffffffffffffffffffffffffffff168152505050565b6060600080548060200260200160405190810160405280929190818152602001828054801561026b57602002820191906000526020600020905b8160009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1681526020019060010190808311610221575b5050505050905090565b600060016000600381106102b2577f4e487b7100000000000000000000000000000000000000000000000000000000600052603260045260246000fd5b0160009054906101000a900473ffffffffffffffffffffffffffffffffffffffff16905090565b6040518060600160405280600390602082028036833780820191505090505090565b60006103078383610371565b60208301905092915050565b600061031e826103dc565b61032881856103f4565b9350610333836103cc565b8060005b8381101561036457815161034b88826102fb565b9750610356836103e7565b925050600181019050610337565b5085935050505092915050565b61037a81610425565b82525050565b61038981610425565b82525050565b600060208201905081810360008301526103a98184610313565b905092915050565b60006020820190506103c66000830184610380565b92915050565b6000819050602082019050919050565b600081519050919050565b6000602082019050919050565b600082825260208201905092915050565b600073ffffffffffffffffffffffffffffffffffffffff82169050919050565b600061043082610437565b9050919050565b600061044282610405565b905091905056fea2646970667358221220c3d54c29059a413668b54e04e4315a27074f48b3c5247f4d715083264d96112064736f6c63430008020033";

    public static final String FUNC_F = "f";

    public static final String FUNC_GETX = "getx";

    public static final String FUNC_GETY = "gety";

    protected ContractArray(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected ContractArray(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteCall<TransactionReceipt> f() {
        final Function function = new Function(
                FUNC_F, 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<String> getx() {
        final Function function = new Function(FUNC_GETX, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<List> gety() {
        final Function function = new Function(FUNC_GETY, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<DynamicArray<Address>>() {}));
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

    public static RemoteCall<ContractArray> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return deployRemoteCall(ContractArray.class, web3j, credentials, contractGasProvider, BINARY,  "");
    }

    public static RemoteCall<ContractArray> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return deployRemoteCall(ContractArray.class, web3j, transactionManager, contractGasProvider, BINARY,  "");
    }

    public static ContractArray load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new ContractArray(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static ContractArray load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new ContractArray(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
