package network.platon.contracts.evm.v0_8_2;

import com.platon.abi.solidity.TypeReference;
import com.platon.abi.solidity.datatypes.Address;
import com.platon.abi.solidity.datatypes.Function;
import com.platon.abi.solidity.datatypes.Type;
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
public class ChainFunction extends Contract {
    private static final String BINARY = "6080604052336000806101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff160217905550346001819055506000600260006101000a81548160ff02191690831515021790555061026f806100756000396000f3fe608060405234801561001057600080fd5b50600436106100365760003560e01c80637eed92c01461003b5780639f9232f41461006b575b600080fd5b61005560048036038101906100509190610134565b61009b565b60405161006291906101a8565b60405180910390f35b6100856004803603810190610080919061015d565b6100b6565b60405161009291906101a8565b60405180910390f35b600060011515821515146100ae57600080fd5b339050919050565b600060011515831515146100f3577f4e487b7100000000000000000000000000000000000000000000000000000000600052600160045260246000fd5b600982101561010157600080fd5b33905092915050565b6000813590506101198161020b565b92915050565b60008135905061012e81610222565b92915050565b60006020828403121561014657600080fd5b60006101548482850161010a565b91505092915050565b6000806040838503121561017057600080fd5b600061017e8582860161010a565b925050602061018f8582860161011f565b9150509250929050565b6101a2816101c3565b82525050565b60006020820190506101bd6000830184610199565b92915050565b60006101ce826101e1565b9050919050565b60008115159050919050565b600073ffffffffffffffffffffffffffffffffffffffff82169050919050565b6000819050919050565b610214816101d5565b811461021f57600080fd5b50565b61022b81610201565b811461023657600080fd5b5056fea2646970667358221220931a032598b139c0de0f86337e9ff62dc484f0bff47025b7764353b3e31877f264736f6c63430008020033";

    public static final String FUNC_DECEASED = "deceased";

    public static final String FUNC_DECEASEDWITHMODIFY = "deceasedWithModify";

    protected ChainFunction(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected ChainFunction(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static RemoteCall<ChainFunction> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider, BigInteger initialVonValue) {
        return deployRemoteCall(ChainFunction.class, web3j, credentials, contractGasProvider, BINARY, "", initialVonValue);
    }

    public static RemoteCall<ChainFunction> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider, BigInteger initialVonValue) {
        return deployRemoteCall(ChainFunction.class, web3j, transactionManager, contractGasProvider, BINARY, "", initialVonValue);
    }

    public RemoteCall<String> deceased(Boolean isDeceased, BigInteger less9) {
        final Function function = new Function(FUNC_DECEASED, 
                Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.Bool(isDeceased), 
                new com.platon.abi.solidity.datatypes.generated.Uint256(less9)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<String> deceasedWithModify(Boolean _isDeceased) {
        final Function function = new Function(FUNC_DECEASEDWITHMODIFY, 
                Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.Bool(_isDeceased)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public static ChainFunction load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new ChainFunction(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static ChainFunction load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new ChainFunction(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
