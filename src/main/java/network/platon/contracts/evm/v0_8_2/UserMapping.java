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
public class UserMapping extends Contract {
    private static final String BINARY = "608060405234801561001057600080fd5b506102e4806100206000396000f3fe608060405234801561001057600080fd5b50600436106100365760003560e01c806316fa21101461003b578063ff7ac36d14610057575b600080fd5b610055600480360381019061005091906101c7565b610087565b005b610071600480360381019061006c919061019e565b61012f565b60405161007e9190610251565b60405180910390f35b8160008083815260200190815260200160002081905550600073b5d8ba3d5cc1822baad98cff258008b70584cf8a6312c487069091836040518363ffffffff1660e01b81526004016100da929190610228565b60206040518083038186803b1580156100f257600080fd5b505af4158015610106573d6000803e3d6000fd5b505050506040513d601f19601f8201168201806040525081019061012a9190610175565b505050565b6000806000838152602001908152602001600020549050919050565b60008151905061015a81610280565b92915050565b60008135905061016f81610297565b92915050565b60006020828403121561018757600080fd5b60006101958482850161014b565b91505092915050565b6000602082840312156101b057600080fd5b60006101be84828501610160565b91505092915050565b600080604083850312156101da57600080fd5b60006101e885828601610160565b92505060206101f985828601610160565b9150509250929050565b8082525050565b61021381610276565b82525050565b61022281610276565b82525050565b600060408201905061023d6000830185610203565b61024a6020830184610219565b9392505050565b6000602082019050610266600083018461020a565b92915050565b6000819050919050565b6000819050919050565b6102898161026c565b811461029457600080fd5b50565b6102a081610276565b81146102ab57600080fd5b5056fea2646970667358221220d245269080110da6c05c5f18d114aed14f102047f2130aba48ce90dd52e53a0764736f6c63430008020033";

    public static final String FUNC_GETOUTUSER = "getOutUser";

    public static final String FUNC_SETOUTUSER = "setOutUser";

    protected UserMapping(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected UserMapping(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteCall<BigInteger> getOutUser(BigInteger _id) {
        final Function function = new Function(FUNC_GETOUTUSER, 
                Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.generated.Uint256(_id)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<TransactionReceipt> setOutUser(BigInteger _age, BigInteger _id) {
        final Function function = new Function(
                FUNC_SETOUTUSER, 
                Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.generated.Uint256(_age), 
                new com.platon.abi.solidity.datatypes.generated.Uint256(_id)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public static RemoteCall<UserMapping> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return deployRemoteCall(UserMapping.class, web3j, credentials, contractGasProvider, BINARY,  "");
    }

    public static RemoteCall<UserMapping> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return deployRemoteCall(UserMapping.class, web3j, transactionManager, contractGasProvider, BINARY,  "");
    }

    public static UserMapping load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new UserMapping(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static UserMapping load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new UserMapping(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
