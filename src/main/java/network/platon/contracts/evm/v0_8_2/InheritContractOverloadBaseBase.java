package network.platon.contracts.evm.v0_8_2;

import com.platon.abi.solidity.TypeReference;
import com.platon.abi.solidity.datatypes.Function;
import com.platon.abi.solidity.datatypes.Type;
import com.platon.abi.solidity.datatypes.generated.Uint256;
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

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://github.com/PlatONnetwork/client-sdk-java/releases">platon-web3j command line tools</a>,
 * or the com.platon.codegen.SolidityFunctionWrapperGenerator in the 
 * <a href="https://github.com/PlatONnetwork/client-sdk-java/tree/master/codegen">codegen module</a> to update.
 *
 * <p>Generated with web3j version 0.15.1.7.
 */
public class InheritContractOverloadBaseBase extends Contract {
    private static final String BINARY = "608060405234801561001057600080fd5b506102de806100206000396000f3fe608060405234801561001057600080fd5b50600436106100625760003560e01c80630b7f1665146100675780630c55699c146100855780635197c7aa146100a3578063a56dfe4a146100c1578063a5843f08146100df578063b7b0422d146100fb575b600080fd5b61006f610117565b60405161007c91906101e7565b60405180910390f35b61008d610121565b60405161009a91906101e7565b60405180910390f35b6100ab610127565b6040516100b891906101e7565b60405180910390f35b6100c9610130565b6040516100d691906101e7565b60405180910390f35b6100f960048036038101906100f4919061019c565b610136565b005b61011560048036038101906101109190610173565b610148565b005b6000600154905090565b60005481565b60008054905090565b60015481565b80600081905550816001819055505050565b6001816101559190610202565b60008190555050565b60008135905061016d81610291565b92915050565b60006020828403121561018557600080fd5b60006101938482850161015e565b91505092915050565b600080604083850312156101af57600080fd5b60006101bd8582860161015e565b92505060206101ce8582860161015e565b9150509250929050565b6101e181610258565b82525050565b60006020820190506101fc60008301846101d8565b92915050565b600061020d82610258565b915061021883610258565b9250827fffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff0382111561024d5761024c610262565b5b828201905092915050565b6000819050919050565b7f4e487b7100000000000000000000000000000000000000000000000000000000600052601160045260246000fd5b61029a81610258565b81146102a557600080fd5b5056fea26469706673582212205dbe8d95625ff05ff25ea4fb9186b825746bddcc2a6619031f9664deafbaa19064736f6c63430008020033";

    public static final String FUNC_GETX = "getX";

    public static final String FUNC_GETY = "getY";

    public static final String FUNC_INIT = "init";

    public static final String FUNC_X = "x";

    public static final String FUNC_Y = "y";

    protected InheritContractOverloadBaseBase(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected InheritContractOverloadBaseBase(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteCall<BigInteger> getX() {
        final Function function = new Function(FUNC_GETX, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<BigInteger> getY() {
        final Function function = new Function(FUNC_GETY, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<TransactionReceipt> init(BigInteger a, BigInteger b) {
        final Function function = new Function(
                FUNC_INIT, 
                Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.generated.Uint256(a), 
                new com.platon.abi.solidity.datatypes.generated.Uint256(b)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> init(BigInteger a) {
        final Function function = new Function(
                FUNC_INIT, 
                Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.generated.Uint256(a)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<BigInteger> x() {
        final Function function = new Function(FUNC_X, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<BigInteger> y() {
        final Function function = new Function(FUNC_Y, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public static RemoteCall<InheritContractOverloadBaseBase> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return deployRemoteCall(InheritContractOverloadBaseBase.class, web3j, credentials, contractGasProvider, BINARY,  "");
    }

    public static RemoteCall<InheritContractOverloadBaseBase> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return deployRemoteCall(InheritContractOverloadBaseBase.class, web3j, transactionManager, contractGasProvider, BINARY,  "");
    }

    public static InheritContractOverloadBaseBase load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new InheritContractOverloadBaseBase(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static InheritContractOverloadBaseBase load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new InheritContractOverloadBaseBase(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
