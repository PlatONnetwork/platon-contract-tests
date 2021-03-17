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
import java.util.List;

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://github.com/PlatONnetwork/client-sdk-java/releases">platon-web3j command line tools</a>,
 * or the com.platon.codegen.SolidityFunctionWrapperGenerator in the 
 * <a href="https://github.com/PlatONnetwork/client-sdk-java/tree/master/codegen">codegen module</a> to update.
 *
 * <p>Generated with web3j version 0.15.1.7.
 */
public class Sum extends Contract {
    private static final String BINARY = "610347610053600b82828239805160001a607314610046577f4e487b7100000000000000000000000000000000000000000000000000000000600052600060045260246000fd5b30600052607381538281f3fe73000000000000000000000000000000000000000030146080604052600436106100355760003560e01c806387fbcc771461003a575b600080fd5b610054600480360381019061004f919061014b565b61006a565b604051610061919061019b565b60405180910390f35b600080600090505b825181101561009a5760208102602084010151820191508061009390610242565b9050610072565b50919050565b60006100b36100ae846101db565b6101b6565b905080838252602082019050828560208602820111156100d257600080fd5b60005b8581101561010257816100e88882610136565b8452602084019350602083019250506001810190506100d5565b5050509392505050565b600082601f83011261011d57600080fd5b813561012d8482602086016100a0565b91505092915050565b600081359050610145816102fa565b92915050565b60006020828403121561015d57600080fd5b600082013567ffffffffffffffff81111561017757600080fd5b6101838482850161010c565b91505092915050565b61019581610207565b82525050565b60006020820190506101b0600083018461018c565b92915050565b60006101c06101d1565b90506101cc8282610211565b919050565b6000604051905090565b600067ffffffffffffffff8211156101f6576101f56102ba565b5b602082029050602081019050919050565b6000819050919050565b61021a826102e9565b810181811067ffffffffffffffff82111715610239576102386102ba565b5b80604052505050565b600061024d82610207565b91507fffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff8214156102805761027f61028b565b5b600182019050919050565b7f4e487b7100000000000000000000000000000000000000000000000000000000600052601160045260246000fd5b7f4e487b7100000000000000000000000000000000000000000000000000000000600052604160045260246000fd5b6000601f19601f8301169050919050565b61030381610207565b811461030e57600080fd5b5056fea2646970667358221220b8e6f8289534f23846bc1a9921cb448a2db0518f7bf3dc47c1e66a900da80c3664736f6c63430008020033";

    public static final String FUNC_SUMUSINGINLINEASSEMBLY = "sumUsingInlineAssembly";

    protected Sum(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected Sum(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteCall<BigInteger> sumUsingInlineAssembly(List<BigInteger> _data) {
        final Function function = new Function(FUNC_SUMUSINGINLINEASSEMBLY, 
                Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.DynamicArray<com.platon.abi.solidity.datatypes.generated.Uint256>(
                com.platon.abi.solidity.datatypes.generated.Uint256.class,
                        com.platon.abi.solidity.Utils.typeMap(_data, com.platon.abi.solidity.datatypes.generated.Uint256.class))), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public static RemoteCall<Sum> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return deployRemoteCall(Sum.class, web3j, credentials, contractGasProvider, BINARY,  "");
    }

    public static RemoteCall<Sum> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return deployRemoteCall(Sum.class, web3j, transactionManager, contractGasProvider, BINARY,  "");
    }

    public static Sum load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new Sum(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static Sum load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new Sum(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
