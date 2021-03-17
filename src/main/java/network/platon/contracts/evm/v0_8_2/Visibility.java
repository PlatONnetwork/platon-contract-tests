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
public class Visibility extends Contract {
    private static final String BINARY = "608060405234801561001057600080fd5b5061020b806100206000396000f3fe608060405234801561001057600080fd5b50600436106100365760003560e01c8063b8b1feb41461003b578063ca77156f1461006b575b600080fd5b610055600480360381019061005091906100dc565b61009b565b6040516100629190610114565b60405180910390f35b610085600480360381019061008091906100dc565b6100b1565b6040516100929190610114565b60405180910390f35b60006003826100aa919061012f565b9050919050565b60006002826100c0919061012f565b9050919050565b6000813590506100d6816101be565b92915050565b6000602082840312156100ee57600080fd5b60006100fc848285016100c7565b91505092915050565b61010e81610185565b82525050565b60006020820190506101296000830184610105565b92915050565b600061013a82610185565b915061014583610185565b9250827fffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff0382111561017a5761017961018f565b5b828201905092915050565b6000819050919050565b7f4e487b7100000000000000000000000000000000000000000000000000000000600052601160045260246000fd5b6101c781610185565b81146101d257600080fd5b5056fea264697066735822122074148a3ee5fc6fd2343765c4414fba961efb5775dbc527e94ae6fed68adf0cb264736f6c63430008020033";

    public static final String FUNC_FE = "fe";

    public static final String FUNC_FPUB = "fpub";

    protected Visibility(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected Visibility(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
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

    public static RemoteCall<Visibility> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return deployRemoteCall(Visibility.class, web3j, credentials, contractGasProvider, BINARY,  "");
    }

    public static RemoteCall<Visibility> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return deployRemoteCall(Visibility.class, web3j, transactionManager, contractGasProvider, BINARY,  "");
    }

    public static Visibility load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new Visibility(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static Visibility load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new Visibility(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
