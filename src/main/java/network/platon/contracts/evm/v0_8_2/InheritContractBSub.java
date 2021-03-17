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
public class InheritContractBSub extends Contract {
    private static final String BINARY = "60806040526000805534801561001457600080fd5b506003806000819055505060006001905060005481610033919061003f565b600181905550506100ce565b600061004a82610095565b915061005583610095565b9250827fffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff0382111561008a5761008961009f565b5b828201905092915050565b6000819050919050565b7f4e487b7100000000000000000000000000000000000000000000000000000000600052601160045260246000fd5b60b7806100dc6000396000f3fe6080604052348015600f57600080fd5b506004361060285760003560e01c80635873f05614602d575b600080fd5b60336047565b604051603e9190605e565b60405180910390f35b6000600154905090565b6058816077565b82525050565b6000602082019050607160008301846051565b92915050565b600081905091905056fea264697066735822122022d4f0dbc6fd391dd5948f00560a083a6046e71be1b7d5abf294e5de792579f064736f6c63430008020033";

    public static final String FUNC_GETDATAB = "getDataB";

    protected InheritContractBSub(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected InheritContractBSub(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static RemoteCall<InheritContractBSub> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return deployRemoteCall(InheritContractBSub.class, web3j, credentials, contractGasProvider, BINARY,  "");
    }

    public static RemoteCall<InheritContractBSub> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return deployRemoteCall(InheritContractBSub.class, web3j, transactionManager, contractGasProvider, BINARY,  "");
    }

    public RemoteCall<BigInteger> getDataB() {
        final Function function = new Function(FUNC_GETDATAB, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public static InheritContractBSub load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new InheritContractBSub(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static InheritContractBSub load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new InheritContractBSub(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
