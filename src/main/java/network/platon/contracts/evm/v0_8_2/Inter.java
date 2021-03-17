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
public class Inter extends Contract {
    private static final String BINARY = "608060405234801561001057600080fd5b5061025d806100206000396000f3fe608060405234801561001057600080fd5b50600436106100415760003560e01c8063b8b1feb414610046578063ca77156f14610076578063e2179b8e146100a6575b600080fd5b610060600480360381019061005b919061012e565b6100c4565b60405161006d9190610166565b60405180910390f35b610090600480360381019061008b919061012e565b6100da565b60405161009d9190610166565b60405180910390f35b6100ae6100f0565b6040516100bb9190610166565b60405180910390f35b60006003826100d39190610181565b9050919050565b60006002826100e99190610181565b9050919050565b60006100fe60016002610103565b905090565b600081836101119190610181565b905092915050565b60008135905061012881610210565b92915050565b60006020828403121561014057600080fd5b600061014e84828501610119565b91505092915050565b610160816101d7565b82525050565b600060208201905061017b6000830184610157565b92915050565b600061018c826101d7565b9150610197836101d7565b9250827fffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff038211156101cc576101cb6101e1565b5b828201905092915050565b6000819050919050565b7f4e487b7100000000000000000000000000000000000000000000000000000000600052601160045260246000fd5b610219816101d7565b811461022457600080fd5b5056fea2646970667358221220b9556555874a2c3691f2a5a0965e2480c3fea2c30ac465422dcd4df64a438e6164736f6c63430008020033";

    public static final String FUNC_FE = "fe";

    public static final String FUNC_FPUB = "fpub";

    public static final String FUNC_G = "g";

    protected Inter(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected Inter(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteCall<BigInteger> fe(BigInteger a) {
        final Function function = new Function(FUNC_FE, 
                Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.generated.Uint256(a)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<BigInteger> fpub(BigInteger a) {
        final Function function = new Function(FUNC_FPUB, 
                Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.generated.Uint256(a)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<BigInteger> g() {
        final Function function = new Function(FUNC_G, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public static RemoteCall<Inter> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return deployRemoteCall(Inter.class, web3j, credentials, contractGasProvider, BINARY,  "");
    }

    public static RemoteCall<Inter> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return deployRemoteCall(Inter.class, web3j, transactionManager, contractGasProvider, BINARY,  "");
    }

    public static Inter load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new Inter(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static Inter load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new Inter(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
