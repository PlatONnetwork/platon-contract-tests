package network.platon.contracts.evm.v0_8_2;

import com.platon.abi.solidity.TypeReference;
import com.platon.abi.solidity.datatypes.Function;
import com.platon.abi.solidity.datatypes.Type;
import com.platon.abi.solidity.datatypes.generated.Int256;
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
public class InterfaceContractStructTest extends Contract {
    private static final String BINARY = "608060405234801561001057600080fd5b506102f8806100206000396000f3fe608060405234801561001057600080fd5b50600436106100415760003560e01c8063079d318b14610046578063d629546c14610064578063e36afde31461006e575b600080fd5b61004e61008c565b60405161005b919061023c565b60405180910390f35b61006c6100ae565b005b61007661017e565b604051610083919061023c565b60405180910390f35b600080600080015414156100a357600090506100ab565b600080015490505b90565b6040518060600160405280600181526020016040518060400160405280600681526020017f506c61744f4e000000000000000000000000000000000000000000000000000081525081526020016040518060400160405280600f81526020017f506c61744f4e20446573637269626500000000000000000000000000000000008152508152506000808201518160000155602082015181600101908051906020019061015b92919061018a565b50604082015181600201908051906020019061017892919061018a565b50905050565b60008060000154905090565b82805461019690610261565b90600052602060002090601f0160209004810192826101b857600085556101ff565b82601f106101d157805160ff19168380011785556101ff565b828001600101855582156101ff579182015b828111156101fe5782518255916020019190600101906101e3565b5b50905061020c9190610210565b5090565b5b80821115610229576000816000905550600101610211565b5090565b61023681610257565b82525050565b6000602082019050610251600083018461022d565b92915050565b6000819050919050565b6000600282049050600182168061027957607f821691505b6020821081141561028d5761028c610293565b5b50919050565b7f4e487b7100000000000000000000000000000000000000000000000000000000600052602260045260246000fdfea2646970667358221220fb74df05f7cd258ed1058e6a2173182096114df35af012fbda1c18709cfb805964736f6c63430008020033";

    public static final String FUNC_GETBOOKID = "getBookID";

    public static final String FUNC_GETDEFAULTBOOKID = "getDefaultBookID";

    public static final String FUNC_SETBOOK = "setBook";

    protected InterfaceContractStructTest(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected InterfaceContractStructTest(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteCall<BigInteger> getBookID() {
        final Function function = new Function(FUNC_GETBOOKID, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Int256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<BigInteger> getDefaultBookID() {
        final Function function = new Function(FUNC_GETDEFAULTBOOKID, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Int256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<TransactionReceipt> setBook() {
        final Function function = new Function(
                FUNC_SETBOOK, 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public static RemoteCall<InterfaceContractStructTest> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return deployRemoteCall(InterfaceContractStructTest.class, web3j, credentials, contractGasProvider, BINARY,  "");
    }

    public static RemoteCall<InterfaceContractStructTest> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return deployRemoteCall(InterfaceContractStructTest.class, web3j, transactionManager, contractGasProvider, BINARY,  "");
    }

    public static InterfaceContractStructTest load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new InterfaceContractStructTest(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static InterfaceContractStructTest load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new InterfaceContractStructTest(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
