package network.platon.contracts.evm.v0_8_2;

import com.platon.abi.solidity.TypeReference;
import com.platon.abi.solidity.datatypes.Function;
import com.platon.abi.solidity.datatypes.Type;
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
public class WithBackCallee extends Contract {
    private static final String BINARY = "608060405234801561001057600080fd5b506106fe806100206000396000f3fe608060405234801561001057600080fd5b50600436106100365760003560e01c8063688755701461003b578063ae49cd9c1461006b575b600080fd5b61005560048036038101906100509190610406565b61009b565b6040516100629190610499565b60405180910390f35b6100856004803603810190610080919061039a565b6100b5565b6040516100929190610477565b60405180910390f35b60008082836100aa9190610526565b905080915050919050565b60606100c183836100c9565b905092915050565b6060600083905060008390506000815183516100e59190610526565b67ffffffffffffffff811115610124577f4e487b7100000000000000000000000000000000000000000000000000000000600052604160045260246000fd5b6040519080825280601f01601f1916602001820160405280156101565781602001600182028036833780820191505090505b50905060008190506000805b8551811015610236578581815181106101a4577f4e487b7100000000000000000000000000000000000000000000000000000000600052603260045260246000fd5b602001015160f81c60f81b8383806101bb906105f9565b9450815181106101f4577f4e487b7100000000000000000000000000000000000000000000000000000000600052603260045260246000fd5b60200101907effffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff1916908160001a905350808061022e906105f9565b915050610162565b5060005b845181101561030e5784818151811061027c577f4e487b7100000000000000000000000000000000000000000000000000000000600052603260045260246000fd5b602001015160f81c60f81b838380610293906105f9565b9450815181106102cc577f4e487b7100000000000000000000000000000000000000000000000000000000600052603260045260246000fd5b60200101907effffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff1916908160001a9053508080610306906105f9565b91505061023a565b50829550505050505092915050565b600061033061032b846104d9565b6104b4565b90508281526020810184848401111561034857600080fd5b610353848285610586565b509392505050565b600082601f83011261036c57600080fd5b813561037c84826020860161031d565b91505092915050565b600081359050610394816106b1565b92915050565b600080604083850312156103ad57600080fd5b600083013567ffffffffffffffff8111156103c757600080fd5b6103d38582860161035b565b925050602083013567ffffffffffffffff8111156103f057600080fd5b6103fc8582860161035b565b9150509250929050565b60006020828403121561041857600080fd5b600061042684828501610385565b91505092915050565b600061043a8261050a565b6104448185610515565b9350610454818560208601610595565b61045d816106a0565b840191505092915050565b6104718161057c565b82525050565b60006020820190508181036000830152610491818461042f565b905092915050565b60006020820190506104ae6000830184610468565b92915050565b60006104be6104cf565b90506104ca82826105c8565b919050565b6000604051905090565b600067ffffffffffffffff8211156104f4576104f3610671565b5b6104fd826106a0565b9050602081019050919050565b600081519050919050565b600082825260208201905092915050565b60006105318261057c565b915061053c8361057c565b9250827fffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff0382111561057157610570610642565b5b828201905092915050565b6000819050919050565b82818337600083830152505050565b60005b838110156105b3578082015181840152602081019050610598565b838111156105c2576000848401525b50505050565b6105d1826106a0565b810181811067ffffffffffffffff821117156105f0576105ef610671565b5b80604052505050565b60006106048261057c565b91507fffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff82141561063757610636610642565b5b600182019050919050565b7f4e487b7100000000000000000000000000000000000000000000000000000000600052601160045260246000fd5b7f4e487b7100000000000000000000000000000000000000000000000000000000600052604160045260246000fd5b6000601f19601f8301169050919050565b6106ba8161057c565b81146106c557600080fd5b5056fea2646970667358221220372ec6b46ca89dbd71c8049d06f6b02ca21cc0d70cb78876abc75f49401c7f2b64736f6c63430008020033";

    public static final String FUNC_GETDOUBLE = "getDouble";

    public static final String FUNC_GETNAME = "getName";

    protected WithBackCallee(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected WithBackCallee(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteCall<TransactionReceipt> getDouble(BigInteger a) {
        final Function function = new Function(
                FUNC_GETDOUBLE, 
                Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.generated.Uint256(a)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> getName(String option, String name) {
        final Function function = new Function(
                FUNC_GETNAME, 
                Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.Utf8String(option), 
                new com.platon.abi.solidity.datatypes.Utf8String(name)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public static RemoteCall<WithBackCallee> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return deployRemoteCall(WithBackCallee.class, web3j, credentials, contractGasProvider, BINARY,  "");
    }

    public static RemoteCall<WithBackCallee> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return deployRemoteCall(WithBackCallee.class, web3j, transactionManager, contractGasProvider, BINARY,  "");
    }

    public static WithBackCallee load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new WithBackCallee(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static WithBackCallee load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new WithBackCallee(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
