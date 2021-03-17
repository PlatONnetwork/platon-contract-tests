package network.platon.contracts.evm.v0_8_2;

import com.platon.abi.solidity.TypeReference;
import com.platon.abi.solidity.datatypes.Function;
import com.platon.abi.solidity.datatypes.Type;
import com.platon.abi.solidity.datatypes.generated.Bytes32;
import com.platon.crypto.Credentials;
import com.platon.protocol.Web3j;
import com.platon.protocol.core.RemoteCall;
import com.platon.tx.Contract;
import com.platon.tx.TransactionManager;
import com.platon.tx.gas.GasProvider;
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
public class Blockhash extends Contract {
    private static final String BINARY = "608060405234801561001057600080fd5b50610241806100206000396000f3fe608060405234801561001057600080fd5b50600436106100575760003560e01c80630f7536281461005c57806366b3eb341461007a578063696d67c3146100985780639e1f194e146100b6578063e1b99d74146100d4575b600080fd5b6100646100f2565b6040516100719190610179565b60405180910390f35b61008261010c565b60405161008f9190610179565b60405180910390f35b6100a0610127565b6040516100ad9190610179565b60405180910390f35b6100be610142565b6040516100cb9190610179565b60405180910390f35b6100dc61015c565b6040516100e99190610179565b60405180910390f35b60008060ff436101029190610194565b4090508091505090565b6000806101004361011d9190610194565b4090508091505090565b600080610101436101389190610194565b4090508091505090565b600080601e436101529190610194565b4090508091505090565b600080434090508091505090565b610173816101c8565b82525050565b600060208201905061018e600083018461016a565b92915050565b600061019f826101d2565b91506101aa836101d2565b9250828210156101bd576101bc6101dc565b5b828203905092915050565b6000819050919050565b6000819050919050565b7f4e487b7100000000000000000000000000000000000000000000000000000000600052601160045260246000fdfea26469706673582212205794e8ae2ddf3ec9d54418cf370537e9a5c83d7297caaefd5472edaabd68cbaf64736f6c63430008020033";

    public static final String FUNC_GETBLOCKHASHBEFORE0 = "getBlockhashbefore0";

    public static final String FUNC_GETBLOCKHASHBEFORE255 = "getBlockhashbefore255";

    public static final String FUNC_GETBLOCKHASHBEFORE256 = "getBlockhashbefore256";

    public static final String FUNC_GETBLOCKHASHBEFORE257 = "getBlockhashbefore257";

    public static final String FUNC_GETBLOCKHASHBEFORE30 = "getBlockhashbefore30";

    protected Blockhash(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected Blockhash(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteCall<byte[]> getBlockhashbefore0() {
        final Function function = new Function(FUNC_GETBLOCKHASHBEFORE0, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bytes32>() {}));
        return executeRemoteCallSingleValueReturn(function, byte[].class);
    }

    public RemoteCall<byte[]> getBlockhashbefore255() {
        final Function function = new Function(FUNC_GETBLOCKHASHBEFORE255, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bytes32>() {}));
        return executeRemoteCallSingleValueReturn(function, byte[].class);
    }

    public RemoteCall<byte[]> getBlockhashbefore256() {
        final Function function = new Function(FUNC_GETBLOCKHASHBEFORE256, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bytes32>() {}));
        return executeRemoteCallSingleValueReturn(function, byte[].class);
    }

    public RemoteCall<byte[]> getBlockhashbefore257() {
        final Function function = new Function(FUNC_GETBLOCKHASHBEFORE257, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bytes32>() {}));
        return executeRemoteCallSingleValueReturn(function, byte[].class);
    }

    public RemoteCall<byte[]> getBlockhashbefore30() {
        final Function function = new Function(FUNC_GETBLOCKHASHBEFORE30, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bytes32>() {}));
        return executeRemoteCallSingleValueReturn(function, byte[].class);
    }

    public static RemoteCall<Blockhash> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return deployRemoteCall(Blockhash.class, web3j, credentials, contractGasProvider, BINARY,  "");
    }

    public static RemoteCall<Blockhash> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return deployRemoteCall(Blockhash.class, web3j, transactionManager, contractGasProvider, BINARY,  "");
    }

    public static Blockhash load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new Blockhash(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static Blockhash load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new Blockhash(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
