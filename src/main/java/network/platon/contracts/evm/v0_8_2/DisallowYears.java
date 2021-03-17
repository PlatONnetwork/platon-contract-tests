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
public class DisallowYears extends Contract {
    private static final String BINARY = "608060405234801561001057600080fd5b5061024b806100206000396000f3fe60806040526004361061004a5760003560e01c80630bb2b6961461004f57806320de797e1461007a57806325b29d84146100aa578063c6d8d657146100d5578063c6f8a3b714610100575b600080fd5b34801561005b57600080fd5b5061006461012b565b60405161007191906101d9565b60405180910390f35b610094600480360381019061008f91906101a1565b610135565b6040516100a191906101d9565b60405180910390f35b3480156100b657600080fd5b506100bf61016f565b6040516100cc91906101d9565b60405180910390f35b3480156100e157600080fd5b506100ea610179565b6040516100f791906101d9565b60405180910390f35b34801561010c57600080fd5b50610115610182565b60405161012291906101d9565b60405180910390f35b6000600254905090565b60006301e13380600081905550680dd2d5fcf3bc9c000060018190555060ff600281905550680dd2d5fcf3bc9c0000600381905550919050565b6000600154905090565b60008054905090565b6000600354905090565b60008135905061019b816101fe565b92915050565b6000602082840312156101b357600080fd5b60006101c18482850161018c565b91505092915050565b6101d3816101f4565b82525050565b60006020820190506101ee60008301846101ca565b92915050565b6000819050919050565b610207816101f4565b811461021257600080fd5b5056fea2646970667358221220b885456dc16713ad0aaedf5cb2d9f54fcc846101c568039a92006f8ea5a8097f64736f6c63430008020033";

    public static final String FUNC_GETETHERVALUE = "getEtherValue";

    public static final String FUNC_GETHEXCOMVALUE = "getHexComValue";

    public static final String FUNC_GETHEXVALUE = "getHexValue";

    public static final String FUNC_GETTIME1 = "getTime1";

    public static final String FUNC_TESTYEAR = "testyear";

    protected DisallowYears(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected DisallowYears(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteCall<BigInteger> getEtherValue() {
        final Function function = new Function(FUNC_GETETHERVALUE, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<BigInteger> getHexComValue() {
        final Function function = new Function(FUNC_GETHEXCOMVALUE, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<BigInteger> getHexValue() {
        final Function function = new Function(FUNC_GETHEXVALUE, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<BigInteger> getTime1() {
        final Function function = new Function(FUNC_GETTIME1, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<TransactionReceipt> testyear(BigInteger a, BigInteger vonValue) {
        final Function function = new Function(
                FUNC_TESTYEAR, 
                Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.generated.Uint256(a)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function, vonValue);
    }

    public static RemoteCall<DisallowYears> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return deployRemoteCall(DisallowYears.class, web3j, credentials, contractGasProvider, BINARY,  "");
    }

    public static RemoteCall<DisallowYears> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return deployRemoteCall(DisallowYears.class, web3j, transactionManager, contractGasProvider, BINARY,  "");
    }

    public static DisallowYears load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new DisallowYears(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static DisallowYears load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new DisallowYears(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
