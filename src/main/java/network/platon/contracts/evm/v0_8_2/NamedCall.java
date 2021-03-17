package network.platon.contracts.evm.v0_8_2;

import com.platon.abi.solidity.TypeReference;
import com.platon.abi.solidity.datatypes.Function;
import com.platon.abi.solidity.datatypes.Type;
import com.platon.abi.solidity.datatypes.generated.Uint256;
import com.platon.crypto.Credentials;
import com.platon.protocol.Web3j;
import com.platon.protocol.core.RemoteCall;
import com.platon.tuples.generated.Tuple2;
import com.platon.tx.Contract;
import com.platon.tx.TransactionManager;
import com.platon.tx.gas.GasProvider;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://github.com/PlatONnetwork/client-sdk-java/releases">platon-web3j command line tools</a>,
 * or the com.platon.codegen.SolidityFunctionWrapperGenerator in the 
 * <a href="https://github.com/PlatONnetwork/client-sdk-java/tree/master/codegen">codegen module</a> to update.
 *
 * <p>Generated with web3j version 0.15.1.7.
 */
public class NamedCall extends Contract {
    private static final String BINARY = "608060405234801561001057600080fd5b50610192806100206000396000f3fe608060405234801561001057600080fd5b50600436106100365760003560e01c8063d4b7eac31461003b578063e9e3370e1461006c575b600080fd5b610055600480360381019061005091906100c7565b61008b565b604051610063929190610112565b60405180910390f35b61007461009b565b604051610082929190610112565b60405180910390f35b6000808284915091509250929050565b6000806100aa6001600261008b565b915091509091565b6000813590506100c181610145565b92915050565b600080604083850312156100da57600080fd5b60006100e8858286016100b2565b92505060206100f9858286016100b2565b9150509250929050565b61010c8161013b565b82525050565b60006040820190506101276000830185610103565b6101346020830184610103565b9392505050565b6000819050919050565b61014e8161013b565b811461015957600080fd5b5056fea264697066735822122057967e17a6343803bab513ed4e85049089d94a5fa7f9b3256a81926385f268be64736f6c63430008020033";

    public static final String FUNC_EXCHANGE = "exchange";

    public static final String FUNC_NAMECALL = "namecall";

    protected NamedCall(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected NamedCall(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteCall<Tuple2<BigInteger, BigInteger>> exchange(BigInteger key, BigInteger value) {
        final Function function = new Function(FUNC_EXCHANGE, 
                Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.generated.Uint256(key), 
                new com.platon.abi.solidity.datatypes.generated.Uint256(value)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}, new TypeReference<Uint256>() {}));
        return new RemoteCall<Tuple2<BigInteger, BigInteger>>(
                new Callable<Tuple2<BigInteger, BigInteger>>() {
                    @Override
                    public Tuple2<BigInteger, BigInteger> call() throws Exception {
                        List<Type> results = executeCallMultipleValueReturn(function);
                        return new Tuple2<BigInteger, BigInteger>(
                                (BigInteger) results.get(0).getValue(), 
                                (BigInteger) results.get(1).getValue());
                    }
                });
    }

    public RemoteCall<Tuple2<BigInteger, BigInteger>> namecall() {
        final Function function = new Function(FUNC_NAMECALL, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}, new TypeReference<Uint256>() {}));
        return new RemoteCall<Tuple2<BigInteger, BigInteger>>(
                new Callable<Tuple2<BigInteger, BigInteger>>() {
                    @Override
                    public Tuple2<BigInteger, BigInteger> call() throws Exception {
                        List<Type> results = executeCallMultipleValueReturn(function);
                        return new Tuple2<BigInteger, BigInteger>(
                                (BigInteger) results.get(0).getValue(), 
                                (BigInteger) results.get(1).getValue());
                    }
                });
    }

    public static RemoteCall<NamedCall> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return deployRemoteCall(NamedCall.class, web3j, credentials, contractGasProvider, BINARY,  "");
    }

    public static RemoteCall<NamedCall> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return deployRemoteCall(NamedCall.class, web3j, transactionManager, contractGasProvider, BINARY,  "");
    }

    public static NamedCall load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new NamedCall(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static NamedCall load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new NamedCall(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
