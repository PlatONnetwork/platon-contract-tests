package network.platon.contracts.evm.v0_8_2;

import com.platon.abi.solidity.TypeReference;
import com.platon.abi.solidity.datatypes.Function;
import com.platon.abi.solidity.datatypes.Type;
import com.platon.abi.solidity.datatypes.generated.Bytes4;
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
public class DecimalLiteralsChangeByte extends Contract {
    private static final String BINARY = "608060405234801561001057600080fd5b50610200806100206000396000f3fe608060405234801561001057600080fd5b50600436106100415760003560e01c806322e20d8f146100465780633db3fb0a14610076578063c2b21da414610094575b600080fd5b610060600480360381019061005b919061012a565b6100b2565b60405161006d9190610162565b60405180910390f35b61007e6100ee565b60405161008b9190610162565b60405180910390f35b61009c6100ff565b6040516100a99190610162565b60405180910390f35b6000808290508060e01b6000806101000a81548163ffffffff021916908360e01c021790555060008054906101000a900460e01b915050919050565b60008054906101000a900460e01b81565b60008060009054906101000a900460e01b905090565b600081359050610124816101b3565b92915050565b60006020828403121561013c57600080fd5b600061014a84828501610115565b91505092915050565b61015c8161017d565b82525050565b60006020820190506101776000830184610153565b92915050565b60007fffffffff0000000000000000000000000000000000000000000000000000000082169050919050565b6000819050919050565b6101bc816101a9565b81146101c757600080fd5b5056fea264697066735822122007384b81d27fcc419500e4c7865cd2edd8b0d77cbf9667e4372005af4aac327464736f6c63430008020033";

    public static final String FUNC_B4 = "b4";

    public static final String FUNC_GETB4 = "getB4";

    public static final String FUNC_TESTCHANGE = "testChange";

    protected DecimalLiteralsChangeByte(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected DecimalLiteralsChangeByte(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteCall<byte[]> b4() {
        final Function function = new Function(FUNC_B4, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bytes4>() {}));
        return executeRemoteCallSingleValueReturn(function, byte[].class);
    }

    public RemoteCall<byte[]> getB4() {
        final Function function = new Function(FUNC_GETB4, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bytes4>() {}));
        return executeRemoteCallSingleValueReturn(function, byte[].class);
    }

    public RemoteCall<TransactionReceipt> testChange(BigInteger a) {
        final Function function = new Function(
                FUNC_TESTCHANGE, 
                Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.generated.Uint256(a)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public static RemoteCall<DecimalLiteralsChangeByte> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return deployRemoteCall(DecimalLiteralsChangeByte.class, web3j, credentials, contractGasProvider, BINARY,  "");
    }

    public static RemoteCall<DecimalLiteralsChangeByte> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return deployRemoteCall(DecimalLiteralsChangeByte.class, web3j, transactionManager, contractGasProvider, BINARY,  "");
    }

    public static DecimalLiteralsChangeByte load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new DecimalLiteralsChangeByte(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static DecimalLiteralsChangeByte load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new DecimalLiteralsChangeByte(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
