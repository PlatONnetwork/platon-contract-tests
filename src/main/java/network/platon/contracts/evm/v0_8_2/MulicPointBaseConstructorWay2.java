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
public class MulicPointBaseConstructorWay2 extends Contract {
    private static final String BINARY = "608060405234801561001057600080fd5b506040516103db3803806103db83398181016040528101906100329190610061565b808161003e919061008a565b806000819055505050610134565b60008151905061005b8161011d565b92915050565b60006020828403121561007357600080fd5b60006100818482850161004c565b91505092915050565b6000610095826100e4565b91506100a0836100e4565b9250817fffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff04831182151516156100d9576100d86100ee565b5b828202905092915050565b6000819050919050565b7f4e487b7100000000000000000000000000000000000000000000000000000000600052601160045260246000fd5b610126816100e4565b811461013157600080fd5b50565b610298806101436000396000f3fe608060405234801561001057600080fd5b50600436106100415760003560e01c80630dbe671f1461004657806382ab890a14610064578063d46300fd14610095575b600080fd5b61004e6100b3565b60405161005b919061016f565b60405180910390f35b61007e600480360381019061007991906100ff565b6100b9565b60405161008c929190610146565b60405180910390f35b61009d6100e1565b6040516100aa919061016f565b60405180910390f35b60005481565b600080826000808282546100cd919061018a565b925050819055503360005491509150915091565b60008054905090565b6000813590506100f98161024b565b92915050565b60006020828403121561011157600080fd5b600061011f848285016100ea565b91505092915050565b610131816101e0565b82525050565b61014081610212565b82525050565b600060408201905061015b6000830185610128565b6101686020830184610137565b9392505050565b60006020820190506101846000830184610137565b92915050565b600061019582610212565b91506101a083610212565b9250827fffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff038211156101d5576101d461021c565b5b828201905092915050565b60006101eb826101f2565b9050919050565b600073ffffffffffffffffffffffffffffffffffffffff82169050919050565b6000819050919050565b7f4e487b7100000000000000000000000000000000000000000000000000000000600052601160045260246000fd5b61025481610212565b811461025f57600080fd5b5056fea26469706673582212201bf550453ebb84cf648ff331b9b3f436d849924cce44ab4b2a5dab3e0cb7072d64736f6c63430008020033";

    public static final String FUNC_A = "a";

    public static final String FUNC_GETA = "getA";

    public static final String FUNC_UPDATE = "update";

    protected MulicPointBaseConstructorWay2(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected MulicPointBaseConstructorWay2(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static RemoteCall<MulicPointBaseConstructorWay2> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider, BigInteger _y) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.generated.Uint256(_y)));
        return deployRemoteCall(MulicPointBaseConstructorWay2.class, web3j, credentials, contractGasProvider, BINARY, encodedConstructor);
    }

    public static RemoteCall<MulicPointBaseConstructorWay2> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider, BigInteger _y) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.generated.Uint256(_y)));
        return deployRemoteCall(MulicPointBaseConstructorWay2.class, web3j, transactionManager, contractGasProvider, BINARY, encodedConstructor);
    }

    public RemoteCall<BigInteger> a() {
        final Function function = new Function(FUNC_A, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<BigInteger> getA() {
        final Function function = new Function(FUNC_GETA, 
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

    public static MulicPointBaseConstructorWay2 load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new MulicPointBaseConstructorWay2(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static MulicPointBaseConstructorWay2 load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new MulicPointBaseConstructorWay2(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
