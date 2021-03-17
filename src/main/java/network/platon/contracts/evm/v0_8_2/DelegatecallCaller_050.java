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
public class DelegatecallCaller_050 extends Contract {
    private static final String BINARY = "608060405234801561001057600080fd5b5061031f806100206000396000f3fe608060405234801561001057600080fd5b50600436106100415760003560e01c80630c55699c146100465780637b8ed01814610064578063a7126c2d14610082575b600080fd5b61004e61009e565b60405161005b919061021e565b60405180910390f35b61006c6100a4565b604051610079919061021e565b60405180910390f35b61009c6004803603810190610097919061016c565b6100ad565b005b60005481565b60008054905090565b8073ffffffffffffffffffffffffffffffffffffffff167f371303c051bff726100ad13871cababf50c20dd920fca137e519f98f089a74b46040516020016100f591906101ec565b6040516020818303038152906040526040516101119190610207565b600060405180830381855af49150503d806000811461014c576040519150601f19603f3d011682016040523d82523d6000602084013e610151565b606091505b50505050565b600081359050610166816102d2565b92915050565b60006020828403121561017e57600080fd5b600061018c84828501610157565b91505092915050565b6101a66101a182610261565b6102c8565b82525050565b60006101b782610239565b6101c18185610244565b93506101d1818560208601610295565b80840191505092915050565b6101e68161028b565b82525050565b60006101f88284610195565b60208201915081905092915050565b600061021382846101ac565b915081905092915050565b600060208201905061023360008301846101dd565b92915050565b600081519050919050565b600081905092915050565b600061025a8261026b565b9050919050565b6000819050919050565b600073ffffffffffffffffffffffffffffffffffffffff82169050919050565b6000819050919050565b60005b838110156102b3578082015181840152602081019050610298565b838111156102c2576000848401525b50505050565b6000819050919050565b6102db8161024f565b81146102e657600080fd5b5056fea264697066735822122094209313773463fc4cb023fd51c50ef47ea872b4fedff31c56b2f9c37c49cf2264736f6c63430008020033";

    public static final String FUNC_GETCALLERX = "getCallerX";

    public static final String FUNC_INC_DELEGATECALL = "inc_delegatecall";

    public static final String FUNC_X = "x";

    protected DelegatecallCaller_050(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected DelegatecallCaller_050(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteCall<BigInteger> getCallerX() {
        final Function function = new Function(FUNC_GETCALLERX, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<TransactionReceipt> inc_delegatecall(String _contractAddress) {
        final Function function = new Function(
                FUNC_INC_DELEGATECALL, 
                Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.Address(_contractAddress)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<BigInteger> x() {
        final Function function = new Function(FUNC_X, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public static RemoteCall<DelegatecallCaller_050> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return deployRemoteCall(DelegatecallCaller_050.class, web3j, credentials, contractGasProvider, BINARY,  "");
    }

    public static RemoteCall<DelegatecallCaller_050> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return deployRemoteCall(DelegatecallCaller_050.class, web3j, transactionManager, contractGasProvider, BINARY,  "");
    }

    public static DelegatecallCaller_050 load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new DelegatecallCaller_050(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static DelegatecallCaller_050 load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new DelegatecallCaller_050(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
