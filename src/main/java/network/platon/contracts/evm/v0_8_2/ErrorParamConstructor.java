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
public class ErrorParamConstructor extends Contract {
    private static final String BINARY = "608060405234801561001057600080fd5b506040516103b23803806103b28339818101604052810190610032919061005e565b600a806000819055505080600181905550506100a8565b60008151905061005881610091565b92915050565b60006020828403121561007057600080fd5b600061007e84828501610049565b91505092915050565b6000819050919050565b61009a81610087565b81146100a557600080fd5b50565b6102fb806100b76000396000f3fe608060405234801561001057600080fd5b50600436106100575760003560e01c80630dbe671f1461005c5780634df7e3d01461007a57806382ab890a14610098578063a1c51915146100c9578063d46300fd146100e7575b600080fd5b610064610105565b60405161007191906101d2565b60405180910390f35b61008261010b565b60405161008f91906101d2565b60405180910390f35b6100b260048036038101906100ad9190610162565b610111565b6040516100c09291906101a9565b60405180910390f35b6100d161013a565b6040516100de91906101d2565b60405180910390f35b6100ef610144565b6040516100fc91906101d2565b60405180910390f35b60005481565b60015481565b600080826001600082825461012691906101ed565b925050819055503360015491509150915091565b6000600154905090565b60008054905090565b60008135905061015c816102ae565b92915050565b60006020828403121561017457600080fd5b60006101828482850161014d565b91505092915050565b61019481610243565b82525050565b6101a381610275565b82525050565b60006040820190506101be600083018561018b565b6101cb602083018461019a565b9392505050565b60006020820190506101e7600083018461019a565b92915050565b60006101f882610275565b915061020383610275565b9250827fffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff038211156102385761023761027f565b5b828201905092915050565b600061024e82610255565b9050919050565b600073ffffffffffffffffffffffffffffffffffffffff82169050919050565b6000819050919050565b7f4e487b7100000000000000000000000000000000000000000000000000000000600052601160045260246000fd5b6102b781610275565b81146102c257600080fd5b5056fea264697066735822122099af53e3d6d4ca042e36b52d00b1027a28ce8eabcefa3de042e4056f2fd313e264736f6c63430008020033";

    public static final String FUNC_A = "a";

    public static final String FUNC_B = "b";

    public static final String FUNC_GETA = "getA";

    public static final String FUNC_GETB = "getB";

    public static final String FUNC_UPDATE = "update";

    protected ErrorParamConstructor(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected ErrorParamConstructor(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static RemoteCall<ErrorParamConstructor> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider, BigInteger _b) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.generated.Uint256(_b)));
        return deployRemoteCall(ErrorParamConstructor.class, web3j, credentials, contractGasProvider, BINARY, encodedConstructor);
    }

    public static RemoteCall<ErrorParamConstructor> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider, BigInteger _b) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.generated.Uint256(_b)));
        return deployRemoteCall(ErrorParamConstructor.class, web3j, transactionManager, contractGasProvider, BINARY, encodedConstructor);
    }

    public RemoteCall<BigInteger> a() {
        final Function function = new Function(FUNC_A, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<BigInteger> b() {
        final Function function = new Function(FUNC_B, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<BigInteger> getA() {
        final Function function = new Function(FUNC_GETA, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<BigInteger> getB() {
        final Function function = new Function(FUNC_GETB, 
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

    public static ErrorParamConstructor load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new ErrorParamConstructor(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static ErrorParamConstructor load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new ErrorParamConstructor(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
