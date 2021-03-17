package network.platon.contracts.evm.v0_8_2;

import com.platon.abi.solidity.TypeReference;
import com.platon.abi.solidity.datatypes.Function;
import com.platon.abi.solidity.datatypes.Type;
import com.platon.abi.solidity.datatypes.generated.Uint256;
import com.platon.abi.solidity.datatypes.generated.Uint8;
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
public class InterfaceContractEnumTest extends Contract {
    private static final String BINARY = "60806040526001600060016101000a81548160ff02191690836002811115610050577f4e487b7100000000000000000000000000000000000000000000000000000000600052602160045260246000fd5b021790555034801561006157600080fd5b5061023e806100716000396000f3fe608060405234801561001057600080fd5b50600436106100415760003560e01c806367cb61b614610046578063694ebe4f14610064578063843f72581461006e575b600080fd5b61004e61008c565b60405161005b9190610160565b60405180910390f35b61006c6100a2565b005b6100766100f4565b604051610083919061017b565b60405180910390f35b60008060009054906101000a900460ff16905090565b60026000806101000a81548160ff021916908360028111156100ed577f4e487b7100000000000000000000000000000000000000000000000000000000600052602160045260246000fd5b0217905550565b60008060019054906101000a900460ff16600281111561013d577f4e487b7100000000000000000000000000000000000000000000000000000000600052602160045260246000fd5b905090565b61014b816101b3565b82525050565b61015a816101a9565b82525050565b60006020820190506101756000830184610142565b92915050565b60006020820190506101906000830184610151565b92915050565b60008190506101a4826101f4565b919050565b6000819050919050565b60006101be82610196565b9050919050565b7f4e487b7100000000000000000000000000000000000000000000000000000000600052602160045260246000fd5b60038110610205576102046101c5565b5b5056fea26469706673582212206bf8eddbe9055e04cd78fd55f21dd847d67de54610942a61cc33012385b6833c64736f6c63430008020033";

    public static final String FUNC_GETCHOICE = "getChoice";

    public static final String FUNC_GETDEFAULTCHOICE = "getDefaultChoice";

    public static final String FUNC_SETLARGE = "setLarge";

    protected InterfaceContractEnumTest(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected InterfaceContractEnumTest(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteCall<BigInteger> getChoice() {
        final Function function = new Function(FUNC_GETCHOICE, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint8>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<BigInteger> getDefaultChoice() {
        final Function function = new Function(FUNC_GETDEFAULTCHOICE, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<TransactionReceipt> setLarge() {
        final Function function = new Function(
                FUNC_SETLARGE, 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public static RemoteCall<InterfaceContractEnumTest> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return deployRemoteCall(InterfaceContractEnumTest.class, web3j, credentials, contractGasProvider, BINARY,  "");
    }

    public static RemoteCall<InterfaceContractEnumTest> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return deployRemoteCall(InterfaceContractEnumTest.class, web3j, transactionManager, contractGasProvider, BINARY,  "");
    }

    public static InterfaceContractEnumTest load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new InterfaceContractEnumTest(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static InterfaceContractEnumTest load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new InterfaceContractEnumTest(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
