package network.platon.contracts.evm.v0_8_2;

import com.platon.abi.solidity.TypeReference;
import com.platon.abi.solidity.datatypes.Function;
import com.platon.abi.solidity.datatypes.Type;
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
public class VisibilityCall extends Contract {
    private static final String BINARY = "608060405234801561001057600080fd5b506104d0806100206000396000f3fe60806040526004361061001e5760003560e01c8063bef55ef314610023575b600080fd5b61002b610042565b604051610039929190610213565b60405180910390f35b60008060006040516100539061018f565b604051809103906000f08015801561006f573d6000803e3d6000fd5b5090508073ffffffffffffffffffffffffffffffffffffffff1663ca77156f60016040518263ffffffff1660e01b81526004016100ac91906101f8565b60206040518083038186803b1580156100c457600080fd5b505afa1580156100d8573d6000803e3d6000fd5b505050506040513d601f19601f820116820180604052508101906100fc91906101b1565b92508073ffffffffffffffffffffffffffffffffffffffff1663b8b1feb460016040518263ffffffff1660e01b815260040161013891906101f8565b60206040518083038186803b15801561015057600080fd5b505afa158015610164573d6000803e3d6000fd5b505050506040513d601f19601f8201168201806040525081019061018891906101b1565b9150509091565b61022b8061027083390190565b6000815190506101ab81610258565b92915050565b6000602082840312156101c357600080fd5b60006101d18482850161019c565b91505092915050565b6101e381610246565b82525050565b6101f28161023c565b82525050565b600060208201905061020d60008301846101da565b92915050565b600060408201905061022860008301856101e9565b61023560208301846101e9565b9392505050565b6000819050919050565b60006102518261023c565b9050919050565b6102618161023c565b811461026c57600080fd5b5056fe608060405234801561001057600080fd5b5061020b806100206000396000f3fe608060405234801561001057600080fd5b50600436106100365760003560e01c8063b8b1feb41461003b578063ca77156f1461006b575b600080fd5b610055600480360381019061005091906100dc565b61009b565b6040516100629190610114565b60405180910390f35b610085600480360381019061008091906100dc565b6100b1565b6040516100929190610114565b60405180910390f35b60006003826100aa919061012f565b9050919050565b60006002826100c0919061012f565b9050919050565b6000813590506100d6816101be565b92915050565b6000602082840312156100ee57600080fd5b60006100fc848285016100c7565b91505092915050565b61010e81610185565b82525050565b60006020820190506101296000830184610105565b92915050565b600061013a82610185565b915061014583610185565b9250827fffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff0382111561017a5761017961018f565b5b828201905092915050565b6000819050919050565b7f4e487b7100000000000000000000000000000000000000000000000000000000600052601160045260246000fd5b6101c781610185565b81146101d257600080fd5b5056fea264697066735822122074148a3ee5fc6fd2343765c4414fba961efb5775dbc527e94ae6fed68adf0cb264736f6c63430008020033a26469706673582212209616cd0b96ca04a1e67f00c2669307d44aa6b29d3fb3da76f521b817f445076e64736f6c63430008020033";

    public static final String FUNC_READDATA = "readData";

    protected VisibilityCall(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected VisibilityCall(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteCall<TransactionReceipt> readData(BigInteger vonValue) {
        final Function function = new Function(
                FUNC_READDATA, 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function, vonValue);
    }

    public static RemoteCall<VisibilityCall> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return deployRemoteCall(VisibilityCall.class, web3j, credentials, contractGasProvider, BINARY,  "");
    }

    public static RemoteCall<VisibilityCall> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return deployRemoteCall(VisibilityCall.class, web3j, transactionManager, contractGasProvider, BINARY,  "");
    }

    public static VisibilityCall load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new VisibilityCall(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static VisibilityCall load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new VisibilityCall(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
