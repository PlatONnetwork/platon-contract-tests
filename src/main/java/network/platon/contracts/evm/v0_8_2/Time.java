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
public class Time extends Contract {
    private static final String BINARY = "608060405234801561001057600080fd5b506102a5806100206000396000f3fe608060405234801561001057600080fd5b50600436106100625760003560e01c806328ed13a5146100675780633c35a0c1146100855780637fefad021461008f578063931f8bcd146100ad5780639bd1479a146100cb578063cea52e71146100e9575b600080fd5b61006f610107565b60405161007c9190610191565b60405180910390f35b61008d61011d565b005b61009761012a565b6040516100a49190610191565b60405180910390f35b6100b5610142565b6040516100c29190610191565b60405180910390f35b6100d3610155565b6040516100e09190610191565b60405180910390f35b6100f161016b565b6040516100fe9190610191565b60405180910390f35b6000603c60005461011891906101ac565b905090565b6305f5e100600081905550565b600062093a8060005461013d91906101ac565b905090565b600042426101509190610202565b905090565b6000600160005461016691906101ac565b905090565b6000610e1060005461017d91906101ac565b905090565b61018b81610236565b82525050565b60006020820190506101a66000830184610182565b92915050565b60006101b782610236565b91506101c283610236565b9250827fffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff038211156101f7576101f6610240565b5b828201905092915050565b600061020d82610236565b915061021883610236565b92508282101561022b5761022a610240565b5b828203905092915050565b6000819050919050565b7f4e487b7100000000000000000000000000000000000000000000000000000000600052601160045260246000fdfea2646970667358221220423c09f77b404df366faca29097775e207ad357ff1e39dbd925b2fd1466a180464736f6c63430008020033";

    public static final String FUNC_THOURS = "tHours";

    public static final String FUNC_TMINUTES = "tMinutes";

    public static final String FUNC_TSECONDS = "tSeconds";

    public static final String FUNC_TWEEKS = "tWeeks";

    public static final String FUNC_TESTTIME = "testTime";

    public static final String FUNC_TESTIMEDIFF = "testimeDiff";

    protected Time(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected Time(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteCall<BigInteger> tHours() {
        final Function function = new Function(FUNC_THOURS, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<BigInteger> tMinutes() {
        final Function function = new Function(FUNC_TMINUTES, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<BigInteger> tSeconds() {
        final Function function = new Function(FUNC_TSECONDS, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<BigInteger> tWeeks() {
        final Function function = new Function(FUNC_TWEEKS, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<TransactionReceipt> testTime() {
        final Function function = new Function(
                FUNC_TESTTIME, 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<BigInteger> testimeDiff() {
        final Function function = new Function(FUNC_TESTIMEDIFF, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public static RemoteCall<Time> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return deployRemoteCall(Time.class, web3j, credentials, contractGasProvider, BINARY,  "");
    }

    public static RemoteCall<Time> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return deployRemoteCall(Time.class, web3j, transactionManager, contractGasProvider, BINARY,  "");
    }

    public static Time load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new Time(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static Time load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new Time(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
