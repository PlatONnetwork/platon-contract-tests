package network.platon.contracts.evm.v0_8_2;

import com.platon.abi.solidity.TypeReference;
import com.platon.abi.solidity.datatypes.Function;
import com.platon.abi.solidity.datatypes.Type;
import com.platon.abi.solidity.datatypes.generated.Uint256;
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
public class InheritContractOverload extends Contract {
    private static final String BINARY = "608060405234801561001057600080fd5b506102f3806100206000396000f3fe608060405234801561001057600080fd5b506004361061004c5760003560e01c80635873f056146100515780639450268b1461006f578063a46cf4b31461009f578063cad0899b146100bd575b600080fd5b6100596100ed565b60405161006691906101fc565b60405180910390f35b6100896004803603810190610084919061019e565b610102565b60405161009691906101fc565b60405180910390f35b6100a7610124565b6040516100b491906101fc565b60405180910390f35b6100d760048036038101906100d29190610162565b610137565b6040516100e491906101fc565b60405180910390f35b60006100fd600160026003610102565b905090565b60008183856101119190610217565b61011b9190610217565b90509392505050565b600061013260016002610137565b905090565b600081836101459190610217565b905092915050565b60008135905061015c816102a6565b92915050565b6000806040838503121561017557600080fd5b60006101838582860161014d565b92505060206101948582860161014d565b9150509250929050565b6000806000606084860312156101b357600080fd5b60006101c18682870161014d565b93505060206101d28682870161014d565b92505060406101e38682870161014d565b9150509250925092565b6101f68161026d565b82525050565b600060208201905061021160008301846101ed565b92915050565b60006102228261026d565b915061022d8361026d565b9250827fffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff0382111561026257610261610277565b5b828201905092915050565b6000819050919050565b7f4e487b7100000000000000000000000000000000000000000000000000000000600052601160045260246000fd5b6102af8161026d565b81146102ba57600080fd5b5056fea2646970667358221220a2de0244bf2c720c5ae28512ffe27ad09ad2b282b17560331bb45f02aebc1f1964736f6c63430008020033";

    public static final String FUNC_GETDATAA = "getDataA";

    public static final String FUNC_GETDATAB = "getDataB";

    public static final String FUNC_SUM = "sum";

    protected InheritContractOverload(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected InheritContractOverload(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteCall<BigInteger> getDataA() {
        final Function function = new Function(FUNC_GETDATAA, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<BigInteger> getDataB() {
        final Function function = new Function(FUNC_GETDATAB, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<BigInteger> sum(BigInteger a, BigInteger b, BigInteger c) {
        final Function function = new Function(FUNC_SUM, 
                Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.generated.Uint256(a), 
                new com.platon.abi.solidity.datatypes.generated.Uint256(b), 
                new com.platon.abi.solidity.datatypes.generated.Uint256(c)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<BigInteger> sum(BigInteger a, BigInteger b) {
        final Function function = new Function(FUNC_SUM, 
                Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.generated.Uint256(a), 
                new com.platon.abi.solidity.datatypes.generated.Uint256(b)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public static RemoteCall<InheritContractOverload> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return deployRemoteCall(InheritContractOverload.class, web3j, credentials, contractGasProvider, BINARY,  "");
    }

    public static RemoteCall<InheritContractOverload> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return deployRemoteCall(InheritContractOverload.class, web3j, transactionManager, contractGasProvider, BINARY,  "");
    }

    public static InheritContractOverload load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new InheritContractOverload(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static InheritContractOverload load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new InheritContractOverload(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
