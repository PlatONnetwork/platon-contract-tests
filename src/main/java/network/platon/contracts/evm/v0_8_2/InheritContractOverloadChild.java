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
public class InheritContractOverloadChild extends Contract {
    private static final String BINARY = "608060405234801561001057600080fd5b506103da806100206000396000f3fe608060405234801561001057600080fd5b506004361061009e5760003560e01c8063a56dfe4a11610066578063a56dfe4a14610135578063a5843f0814610153578063b7b0422d1461016f578063cedf673f1461018b578063fa98b867146101a75761009e565b80630b7f1665146100a35780630c55699c146100c15780631c5e6b98146100df5780635197c7aa146100fb578063560512c614610119575b600080fd5b6100ab6101c3565b6040516100b891906102e3565b60405180910390f35b6100c96101cd565b6040516100d691906102e3565b60405180910390f35b6100f960048036038101906100f4919061026f565b6101d3565b005b6101036101df565b60405161011091906102e3565b60405180910390f35b610133600480360381019061012e9190610298565b6101e8565b005b61013d6101f6565b60405161014a91906102e3565b60405180910390f35b61016d60048036038101906101689190610298565b6101fc565b005b6101896004803603810190610184919061026f565b61020e565b005b6101a560048036038101906101a09190610298565b610218565b005b6101c160048036038101906101bc919061026f565b610226565b005b6000600154905090565b60005481565b6101dc81610232565b50565b60008054905090565b6101f282826101fc565b5050565b60015481565b81600081905550806001819055505050565b8060008190555050565b6102228282610248565b5050565b61022f8161020e565b50565b60018161023f91906102fe565b60008190555050565b80600081905550816001819055505050565b6000813590506102698161038d565b92915050565b60006020828403121561028157600080fd5b600061028f8482850161025a565b91505092915050565b600080604083850312156102ab57600080fd5b60006102b98582860161025a565b92505060206102ca8582860161025a565b9150509250929050565b6102dd81610354565b82525050565b60006020820190506102f860008301846102d4565b92915050565b600061030982610354565b915061031483610354565b9250827fffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff038211156103495761034861035e565b5b828201905092915050565b6000819050919050565b7f4e487b7100000000000000000000000000000000000000000000000000000000600052601160045260246000fd5b61039681610354565b81146103a157600080fd5b5056fea26469706673582212206d1c212097e4100747952e5264256345004129c8fce36408367489637aea533d64736f6c63430008020033";

    public static final String FUNC_GETX = "getX";

    public static final String FUNC_GETY = "getY";

    public static final String FUNC_INIT = "init";

    public static final String FUNC_INITBASE = "initBase";

    public static final String FUNC_INITBASEBASE = "initBaseBase";

    public static final String FUNC_X = "x";

    public static final String FUNC_Y = "y";

    protected InheritContractOverloadChild(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected InheritContractOverloadChild(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteCall<BigInteger> getX() {
        final Function function = new Function(FUNC_GETX, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<BigInteger> getY() {
        final Function function = new Function(FUNC_GETY, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<TransactionReceipt> init(BigInteger a, BigInteger b) {
        final Function function = new Function(
                FUNC_INIT, 
                Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.generated.Uint256(a), 
                new com.platon.abi.solidity.datatypes.generated.Uint256(b)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> init(BigInteger a) {
        final Function function = new Function(
                FUNC_INIT, 
                Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.generated.Uint256(a)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> initBase(BigInteger c, BigInteger d) {
        final Function function = new Function(
                FUNC_INITBASE, 
                Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.generated.Uint256(c), 
                new com.platon.abi.solidity.datatypes.generated.Uint256(d)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> initBase(BigInteger c) {
        final Function function = new Function(
                FUNC_INITBASE, 
                Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.generated.Uint256(c)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> initBaseBase(BigInteger c) {
        final Function function = new Function(
                FUNC_INITBASEBASE, 
                Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.generated.Uint256(c)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> initBaseBase(BigInteger c, BigInteger d) {
        final Function function = new Function(
                FUNC_INITBASEBASE, 
                Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.generated.Uint256(c), 
                new com.platon.abi.solidity.datatypes.generated.Uint256(d)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<BigInteger> x() {
        final Function function = new Function(FUNC_X, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<BigInteger> y() {
        final Function function = new Function(FUNC_Y, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public static RemoteCall<InheritContractOverloadChild> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return deployRemoteCall(InheritContractOverloadChild.class, web3j, credentials, contractGasProvider, BINARY,  "");
    }

    public static RemoteCall<InheritContractOverloadChild> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return deployRemoteCall(InheritContractOverloadChild.class, web3j, transactionManager, contractGasProvider, BINARY,  "");
    }

    public static InheritContractOverloadChild load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new InheritContractOverloadChild(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static InheritContractOverloadChild load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new InheritContractOverloadChild(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
