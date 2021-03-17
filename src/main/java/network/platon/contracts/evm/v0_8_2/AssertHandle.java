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
public class AssertHandle extends Contract {
    private static final String BINARY = "608060405234801561001057600080fd5b506102eb806100206000396000f3fe608060405234801561001057600080fd5b50600436106100625760003560e01c80638c671e0a14610067578063ad92212f14610071578063afcd320e1461007b578063cda0a5eb14610097578063f25e0471146100c7578063f81cf6db146100d1575b600080fd5b61006f6100db565b005b6100796100dd565b005b610095600480360381019061009091906101b5565b6100df565b005b6100b160048036038101906100ac919061018c565b610119565b6040516100be91906101ed565b60405180910390f35b6100cf61015e565b005b6100d9610160565b005b565b565b600a8110610116577f4e487b7100000000000000000000000000000000000000000000000000000000600052600160045260246000fd5b50565b60008160000b6003811115610157577f4e487b7100000000000000000000000000000000000000000000000000000000600052602160045260246000fd5b9050919050565b565b565b60008135905061017181610287565b92915050565b6000813590506101868161029e565b92915050565b60006020828403121561019e57600080fd5b60006101ac84828501610162565b91505092915050565b6000602082840312156101c757600080fd5b60006101d584828501610177565b91505092915050565b6101e781610232565b82525050565b600060208201905061020260008301846101de565b92915050565b600081905061021682610273565b919050565b60008160000b9050919050565b6000819050919050565b600061023d82610208565b9050919050565b7f4e487b7100000000000000000000000000000000000000000000000000000000600052602160045260246000fd5b6004811061028457610283610244565b5b50565b6102908161021b565b811461029b57600080fd5b50565b6102a781610228565b81146102b257600080fd5b5056fea264697066735822122016cdf40e47e676ce67d2a2cf24374902cbcd7d0739b4ccd83d8c741520f7c7e164736f6c63430008020033";

    public static final String FUNC_BINARYMOVEMINUSEXCEPTION = "binaryMoveMinusException";

    public static final String FUNC_DIVIDENDZEROEXCEPTION = "dividendZeroException";

    public static final String FUNC_INTCHANGEEXCEPTION = "intChangeException";

    public static final String FUNC_NOOUTOFBOUNDSEXCEPTION = "noOutOfBoundsException";

    public static final String FUNC_OUTOFBOUNDSEXCEPTION = "outOfBoundsException";

    public static final String FUNC_PARAMEXCEPTION = "paramException";

    protected AssertHandle(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected AssertHandle(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteCall<TransactionReceipt> binaryMoveMinusException() {
        final Function function = new Function(
                FUNC_BINARYMOVEMINUSEXCEPTION, 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> dividendZeroException() {
        final Function function = new Function(
                FUNC_DIVIDENDZEROEXCEPTION, 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> intChangeException(BigInteger param) {
        final Function function = new Function(
                FUNC_INTCHANGEEXCEPTION, 
                Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.generated.Int8(param)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> noOutOfBoundsException() {
        final Function function = new Function(
                FUNC_NOOUTOFBOUNDSEXCEPTION, 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> outOfBoundsException() {
        final Function function = new Function(
                FUNC_OUTOFBOUNDSEXCEPTION, 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> paramException(BigInteger param) {
        final Function function = new Function(
                FUNC_PARAMEXCEPTION, 
                Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.generated.Uint256(param)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public static RemoteCall<AssertHandle> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return deployRemoteCall(AssertHandle.class, web3j, credentials, contractGasProvider, BINARY,  "");
    }

    public static RemoteCall<AssertHandle> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return deployRemoteCall(AssertHandle.class, web3j, transactionManager, contractGasProvider, BINARY,  "");
    }

    public static AssertHandle load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new AssertHandle(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static AssertHandle load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new AssertHandle(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
