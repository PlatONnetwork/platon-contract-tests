package network.platon.contracts.evm.v0_8_2;

import com.platon.abi.solidity.TypeReference;
import com.platon.abi.solidity.datatypes.Bool;
import com.platon.abi.solidity.datatypes.Function;
import com.platon.abi.solidity.datatypes.Type;
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
public class ShortCircuitError extends Contract {
    private static final String BINARY = "608060405234801561001057600080fd5b50610174806100206000396000f3fe608060405234801561001057600080fd5b50600436106100365760003560e01c806304c09ce91461003b5780630c204dbc14610059575b600080fd5b610043610077565b6040516100509190610117565b60405180910390f35b61006161009c565b60405161006e9190610117565b60405180910390f35b6000806100826100c1565b90508060000160009054906101000a900460ff1691505090565b6000806100a76100e6565b90508060000160009054906101000a900460ff1691505090565b6000600190508060000160009054906101000a900460ff16806100e2575060015b5090565b60008060000160009054906101000a900460ff168015610104575060005b5090565b61011181610132565b82525050565b600060208201905061012c6000830184610108565b92915050565b6000811515905091905056fea264697066735822122055ee21cac7c00970e2dda19e845eda7cbd2f16cf38919e548d9c968bb15f158164736f6c63430008020033";

    public static final String FUNC_GETF = "getF";

    public static final String FUNC_GETG = "getG";

    protected ShortCircuitError(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected ShortCircuitError(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteCall<Boolean> getF() {
        final Function function = new Function(FUNC_GETF, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}));
        return executeRemoteCallSingleValueReturn(function, Boolean.class);
    }

    public RemoteCall<Boolean> getG() {
        final Function function = new Function(FUNC_GETG, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}));
        return executeRemoteCallSingleValueReturn(function, Boolean.class);
    }

    public static RemoteCall<ShortCircuitError> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return deployRemoteCall(ShortCircuitError.class, web3j, credentials, contractGasProvider, BINARY,  "");
    }

    public static RemoteCall<ShortCircuitError> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return deployRemoteCall(ShortCircuitError.class, web3j, transactionManager, contractGasProvider, BINARY,  "");
    }

    public static ShortCircuitError load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new ShortCircuitError(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static ShortCircuitError load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new ShortCircuitError(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
