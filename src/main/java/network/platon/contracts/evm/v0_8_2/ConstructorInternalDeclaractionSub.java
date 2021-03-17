package network.platon.contracts.evm.v0_8_2;

import com.platon.abi.solidity.FunctionEncoder;
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
public class ConstructorInternalDeclaractionSub extends Contract {
    private static final String BINARY = "6080604052600a60005534801561001557600080fd5b5060405161034c38038061034c8339818101604052810190610037919061005b565b808060008190555050506100a5565b6000815190506100558161008e565b92915050565b60006020828403121561006d57600080fd5b600061007b84828501610046565b91505092915050565b6000819050919050565b61009781610084565b81146100a257600080fd5b50565b610298806100b46000396000f3fe608060405234801561001057600080fd5b50600436106100415760003560e01c806306661abd1461004657806382ab890a14610064578063a87d942c14610095575b600080fd5b61004e6100b3565b60405161005b919061016f565b60405180910390f35b61007e600480360381019061007991906100ff565b6100b9565b60405161008c929190610146565b60405180910390f35b61009d6100e1565b6040516100aa919061016f565b60405180910390f35b60005481565b600080826000808282546100cd919061018a565b925050819055503360005491509150915091565b60008054905090565b6000813590506100f98161024b565b92915050565b60006020828403121561011157600080fd5b600061011f848285016100ea565b91505092915050565b610131816101e0565b82525050565b61014081610212565b82525050565b600060408201905061015b6000830185610128565b6101686020830184610137565b9392505050565b60006020820190506101846000830184610137565b92915050565b600061019582610212565b91506101a083610212565b9250827fffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff038211156101d5576101d461021c565b5b828201905092915050565b60006101eb826101f2565b9050919050565b600073ffffffffffffffffffffffffffffffffffffffff82169050919050565b6000819050919050565b7f4e487b7100000000000000000000000000000000000000000000000000000000600052601160045260246000fd5b61025481610212565b811461025f57600080fd5b5056fea2646970667358221220821f765c3fb78336b01be5c05767c3ae09842d53f01263ab25d35a743c277e5b64736f6c63430008020033";

    public static final String FUNC_COUNT = "count";

    public static final String FUNC_GETCOUNT = "getCount";

    public static final String FUNC_UPDATE = "update";

    protected ConstructorInternalDeclaractionSub(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected ConstructorInternalDeclaractionSub(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static RemoteCall<ConstructorInternalDeclaractionSub> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider, BigInteger _count) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.generated.Uint256(_count)));
        return deployRemoteCall(ConstructorInternalDeclaractionSub.class, web3j, credentials, contractGasProvider, BINARY, encodedConstructor);
    }

    public static RemoteCall<ConstructorInternalDeclaractionSub> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider, BigInteger _count) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.generated.Uint256(_count)));
        return deployRemoteCall(ConstructorInternalDeclaractionSub.class, web3j, transactionManager, contractGasProvider, BINARY, encodedConstructor);
    }

    public RemoteCall<BigInteger> count() {
        final Function function = new Function(FUNC_COUNT, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<BigInteger> getCount() {
        final Function function = new Function(FUNC_GETCOUNT, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<TransactionReceipt> update(BigInteger amount) {
        final Function function = new Function(
                FUNC_UPDATE, 
                Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.generated.Uint256(amount)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public static ConstructorInternalDeclaractionSub load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new ConstructorInternalDeclaractionSub(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static ConstructorInternalDeclaractionSub load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new ConstructorInternalDeclaractionSub(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
