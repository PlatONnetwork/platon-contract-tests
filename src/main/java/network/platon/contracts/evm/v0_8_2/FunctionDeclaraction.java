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
public class FunctionDeclaraction extends Contract {
    private static final String BINARY = "608060405234801561001057600080fd5b50610303806100206000396000f3fe608060405234801561001057600080fd5b50600436106100415760003560e01c806312065fe014610046578063ab95edb114610064578063cb533b3814610095575b600080fd5b61004e6100c6565b60405161005b91906101da565b60405180910390f35b61007e6004803603810190610079919061016a565b6100cf565b60405161008c9291906101b1565b60405180910390f35b6100af60048036038101906100aa919061016a565b6100ea565b6040516100bd9291906101b1565b60405180910390f35b60008054905090565b6000806100db83610105565b50503360005491509150915091565b6000806100f68361012d565b50503360005491509150915091565b6000808260008082825461011991906101f5565b925050819055503360005491509150915091565b6000808260008082825461014191906101f5565b925050819055503360005491509150915091565b600081359050610164816102b6565b92915050565b60006020828403121561017c57600080fd5b600061018a84828501610155565b91505092915050565b61019c8161024b565b82525050565b6101ab8161027d565b82525050565b60006040820190506101c66000830185610193565b6101d360208301846101a2565b9392505050565b60006020820190506101ef60008301846101a2565b92915050565b60006102008261027d565b915061020b8361027d565b9250827fffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff038211156102405761023f610287565b5b828201905092915050565b60006102568261025d565b9050919050565b600073ffffffffffffffffffffffffffffffffffffffff82169050919050565b6000819050919050565b7f4e487b7100000000000000000000000000000000000000000000000000000000600052601160045260246000fd5b6102bf8161027d565b81146102ca57600080fd5b5056fea26469706673582212207a4b1f0a5913c58fdc34e67abe38a3043354ecba60661d3911885fb2fc19776764736f6c63430008020033";

    public static final String FUNC_GETBALANCE = "getBalance";

    public static final String FUNC_UPDATE_EXTERNAL = "update_external";

    public static final String FUNC_UPDATE_PUBLIC = "update_public";

    protected FunctionDeclaraction(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected FunctionDeclaraction(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteCall<BigInteger> getBalance() {
        final Function function = new Function(FUNC_GETBALANCE, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<TransactionReceipt> update_external(BigInteger amount_ex) {
        final Function function = new Function(
                FUNC_UPDATE_EXTERNAL, 
                Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.generated.Uint256(amount_ex)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> update_public(BigInteger amount_pu) {
        final Function function = new Function(
                FUNC_UPDATE_PUBLIC, 
                Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.generated.Uint256(amount_pu)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public static RemoteCall<FunctionDeclaraction> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return deployRemoteCall(FunctionDeclaraction.class, web3j, credentials, contractGasProvider, BINARY,  "");
    }

    public static RemoteCall<FunctionDeclaraction> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return deployRemoteCall(FunctionDeclaraction.class, web3j, transactionManager, contractGasProvider, BINARY,  "");
    }

    public static FunctionDeclaraction load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new FunctionDeclaraction(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static FunctionDeclaraction load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new FunctionDeclaraction(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
