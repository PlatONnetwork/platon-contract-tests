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
public class RecursionCall extends Contract {
    private static final String BINARY = "608060405234801561001057600080fd5b506101ff806100206000396000f3fe6080604052600436106100295760003560e01c8063191a62d41461002e57806357e9813914610059575b600080fd5b34801561003a57600080fd5b50610043610089565b6040516100509190610115565b60405180910390f35b610073600480360381019061006e91906100dd565b610092565b6040516100809190610115565b60405180910390f35b60008054905090565b60008160005410156100be5760008081546100ac9061013a565b919050819055506100bc82610092565b505b6000549050919050565b6000813590506100d7816101b2565b92915050565b6000602082840312156100ef57600080fd5b60006100fd848285016100c8565b91505092915050565b61010f81610130565b82525050565b600060208201905061012a6000830184610106565b92915050565b6000819050919050565b600061014582610130565b91507fffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff82141561017857610177610183565b5b600182019050919050565b7f4e487b7100000000000000000000000000000000000000000000000000000000600052601160045260246000fd5b6101bb81610130565b81146101c657600080fd5b5056fea2646970667358221220a3b62153bfb8da1df546f0c99c49b70aa91f0e0ac33b3446604fcbdef7ebb04164736f6c63430008020033";

    public static final String FUNC_GET_TOTAL = "get_total";

    public static final String FUNC_RECURSIONCALLTEST = "recursionCallTest";

    protected RecursionCall(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected RecursionCall(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteCall<BigInteger> get_total() {
        final Function function = new Function(FUNC_GET_TOTAL, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<TransactionReceipt> recursionCallTest(BigInteger n, BigInteger vonValue) {
        final Function function = new Function(
                FUNC_RECURSIONCALLTEST, 
                Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.generated.Uint256(n)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function, vonValue);
    }

    public static RemoteCall<RecursionCall> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return deployRemoteCall(RecursionCall.class, web3j, credentials, contractGasProvider, BINARY,  "");
    }

    public static RemoteCall<RecursionCall> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return deployRemoteCall(RecursionCall.class, web3j, transactionManager, contractGasProvider, BINARY,  "");
    }

    public static RecursionCall load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new RecursionCall(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static RecursionCall load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new RecursionCall(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
