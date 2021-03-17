package network.platon.contracts.evm.v0_8_2;

import com.platon.abi.solidity.FunctionEncoder;
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
public class ConstructorPublicDeclaraction extends Contract {
    private static final String BINARY = "60806040526000805534801561001457600080fd5b5060405161031a38038061031a83398181016040528101906100369190610058565b80600081905550506100a2565b6000815190506100528161008b565b92915050565b60006020828403121561006a57600080fd5b600061007884828501610043565b91505092915050565b6000819050919050565b61009481610081565b811461009f57600080fd5b50565b610269806100b16000396000f3fe608060405234801561001057600080fd5b50600436106100365760003560e01c806382ab890a1461003b578063a87d942c1461006c575b600080fd5b610055600480360381019061005091906100d0565b61008a565b604051610063929190610117565b60405180910390f35b6100746100b2565b6040516100819190610140565b60405180910390f35b6000808260008082825461009e919061015b565b925050819055503360005491509150915091565b60008054905090565b6000813590506100ca8161021c565b92915050565b6000602082840312156100e257600080fd5b60006100f0848285016100bb565b91505092915050565b610102816101b1565b82525050565b610111816101e3565b82525050565b600060408201905061012c60008301856100f9565b6101396020830184610108565b9392505050565b60006020820190506101556000830184610108565b92915050565b6000610166826101e3565b9150610171836101e3565b9250827fffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff038211156101a6576101a56101ed565b5b828201905092915050565b60006101bc826101c3565b9050919050565b600073ffffffffffffffffffffffffffffffffffffffff82169050919050565b6000819050919050565b7f4e487b7100000000000000000000000000000000000000000000000000000000600052601160045260246000fd5b610225816101e3565b811461023057600080fd5b5056fea264697066735822122030e5d399c02bd64398ecd949e97f6148c4e742e37d3bcd63141473737636cfed64736f6c63430008020033";

    public static final String FUNC_GETCOUNT = "getCount";

    public static final String FUNC_UPDATE = "update";

    protected ConstructorPublicDeclaraction(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected ConstructorPublicDeclaraction(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static RemoteCall<ConstructorPublicDeclaraction> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider, BigInteger _count) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.generated.Uint256(_count)));
        return deployRemoteCall(ConstructorPublicDeclaraction.class, web3j, credentials, contractGasProvider, BINARY, encodedConstructor);
    }

    public static RemoteCall<ConstructorPublicDeclaraction> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider, BigInteger _count) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.generated.Uint256(_count)));
        return deployRemoteCall(ConstructorPublicDeclaraction.class, web3j, transactionManager, contractGasProvider, BINARY, encodedConstructor);
    }

    public RemoteCall<BigInteger> getCount() {
        final Function function = new Function(FUNC_GETCOUNT, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<TransactionReceipt> update(BigInteger amount) {
        final Function function = new Function(
                FUNC_UPDATE, 
                Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.generated.Uint256(amount)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public static ConstructorPublicDeclaraction load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new ConstructorPublicDeclaraction(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static ConstructorPublicDeclaraction load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new ConstructorPublicDeclaraction(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
