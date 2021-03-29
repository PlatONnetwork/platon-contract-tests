package network.platon.contracts.evm.v0_8_2;

import com.platon.abi.solidity.TypeReference;
import com.platon.abi.solidity.datatypes.Function;
import com.platon.abi.solidity.datatypes.Type;
import com.platon.abi.solidity.datatypes.generated.Bytes1;
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
public class Semantics extends Contract {
    private static final String BINARY = "608060405234801561001057600080fd5b5061043b806100206000396000f3fe6080604052600436106100385760003560e01c8063ded516d214610044578063f686f6aa1461006f578063fc8a5bb8146100795761003f565b3661003f57005b600080fd5b34801561005057600080fd5b506100596100b6565b60405161006691906101d5565b60405180910390f35b6100776100e3565b005b34801561008557600080fd5b506100a0600480360381019061009b9190610168565b61012c565b6040516100ad91906101f0565b60405180910390f35b6000807fc80000000000000000000000000000000000000000000000000000000000000090508091505090565b3373ffffffffffffffffffffffffffffffffffffffff166108fc349081150290604051600060405180830381858888f19350505050158015610129573d6000803e3d6000fd5b50565b600080828461013b919061025e565b85610146919061025e565b9050809150509392505050565b600081359050610162816103ee565b92915050565b60008060006060848603121561017d57600080fd5b600061018b86828701610153565b935050602061019c86828701610153565b92505060406101ad86828701610153565b9150509250925092565b6101c08161037c565b82525050565b6101cf816103a8565b82525050565b60006020820190506101ea60008301846101b7565b92915050565b600060208201905061020560008301846101c6565b92915050565b6000808291508390505b600185111561025557808604811115610231576102306103b2565b5b60018516156102405780820291505b808102905061024e856103e1565b9450610215565b94509492505050565b6000610269826103a8565b9150610274836103a8565b92506102a17fffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff84846102a9565b905092915050565b6000826102b95760019050610375565b816102c75760009050610375565b81600181146102dd57600281146102e757610316565b6001915050610375565b60ff8411156102f9576102f86103b2565b5b8360020a9150848211156103105761030f6103b2565b5b50610375565b5060208310610133831016604e8410600b841016171561034b5782820a905083811115610346576103456103b2565b5b610375565b610358848484600161020b565b9250905081840481111561036f5761036e6103b2565b5b81810290505b9392505050565b60007fff0000000000000000000000000000000000000000000000000000000000000082169050919050565b6000819050919050565b7f4e487b7100000000000000000000000000000000000000000000000000000000600052601160045260246000fd5b60008160011c9050919050565b6103f7816103a8565b811461040257600080fd5b5056fea2646970667358221220179817303453b14a65a7acebe28e2aead1c7a9f22854e043573e1ff5c5ec59be64736f6c63430008020033";

    public static final String FUNC_ADDRPAY = "addrPay";

    public static final String FUNC_EXPONENTIATION = "exponentiation";

    public static final String FUNC_GETBYTES1 = "getBytes1";

    protected Semantics(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected Semantics(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteCall<TransactionReceipt> addrPay(BigInteger vonValue) {
        final Function function = new Function(
                FUNC_ADDRPAY, 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function, vonValue);
    }

    public RemoteCall<BigInteger> exponentiation(BigInteger a, BigInteger b, BigInteger c) {
        final Function function = new Function(FUNC_EXPONENTIATION, 
                Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.generated.Uint256(a), 
                new com.platon.abi.solidity.datatypes.generated.Uint256(b), 
                new com.platon.abi.solidity.datatypes.generated.Uint256(c)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<byte[]> getBytes1() {
        final Function function = new Function(FUNC_GETBYTES1, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bytes1>() {}));
        return executeRemoteCallSingleValueReturn(function, byte[].class);
    }

    public static RemoteCall<Semantics> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return deployRemoteCall(Semantics.class, web3j, credentials, contractGasProvider, BINARY,  "");
    }

    public static RemoteCall<Semantics> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return deployRemoteCall(Semantics.class, web3j, transactionManager, contractGasProvider, BINARY,  "");
    }

    public static Semantics load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new Semantics(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static Semantics load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new Semantics(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
