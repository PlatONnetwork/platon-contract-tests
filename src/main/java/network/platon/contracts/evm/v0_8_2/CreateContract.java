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
public class CreateContract extends Contract {
    private static final String BINARY = "60806040526103e86040516100139061008b565b61001d91906100a7565b604051809103906000f080158015610039573d6000803e3d6000fd5b506000806101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff16021790555034801561008557600080fd5b506100de565b6101838061035083390190565b6100a1816100cc565b82525050565b60006020820190506100bc6000830184610098565b92915050565b6000819050919050565b60006100d7826100c2565b9050919050565b610263806100ed6000396000f3fe608060405234801561001057600080fd5b506004361061002b5760003560e01c8063f26ca91c14610030575b600080fd5b61003861004f565b6040516100469291906101e3565b60405180910390f35b60008060008054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16630c55699c6040518163ffffffff1660e01b815260040160206040518083038186803b1580156100b857600080fd5b505afa1580156100cc573d6000803e3d6000fd5b505050506040513d601f19601f820116820180604052508101906100f091906101ab565b60008054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1663aa8c217c6040518163ffffffff1660e01b815260040160206040518083038186803b15801561015657600080fd5b505afa15801561016a573d6000803e3d6000fd5b505050506040513d601f19601f8201168201806040525081019061018e91906101ab565b915091509091565b6000815190506101a581610216565b92915050565b6000602082840312156101bd57600080fd5b60006101cb84828501610196565b91505092915050565b6101dd8161020c565b82525050565b60006040820190506101f860008301856101d4565b61020560208301846101d4565b9392505050565b6000819050919050565b61021f8161020c565b811461022a57600080fd5b5056fea264697066735822122038919c766f6ce2abd932ad2995b81269d4178ec66f25bcf09c72a0653782551464736f6c6343000802003360806040526040516101833803806101838339818101604052810190610025919061004e565b806000819055503460018190555050610098565b60008151905061004881610081565b92915050565b60006020828403121561006057600080fd5b600061006e84828501610039565b91505092915050565b6000819050919050565b61008a81610077565b811461009557600080fd5b50565b60dd806100a66000396000f3fe6080604052348015600f57600080fd5b506004361060325760003560e01c80630c55699c146037578063aa8c217c146051575b600080fd5b603d606b565b604051604891906084565b60405180910390f35b60576071565b604051606291906084565b60405180910390f35b60005481565b60015481565b607e81609d565b82525050565b6000602082019050609760008301846077565b92915050565b600081905091905056fea2646970667358221220fcaffcac1c6d2dea9350ebd2b9e8a8fa8348d517be72f6ce61dd7257d03dec4864736f6c63430008020033";

    public static final String FUNC_GETTARGETCREATECONTRACTDATA = "getTargetCreateContractData";

    protected CreateContract(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected CreateContract(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteCall<Tuple2<BigInteger, BigInteger>> getTargetCreateContractData() {
        final Function function = new Function(FUNC_GETTARGETCREATECONTRACTDATA, 
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

    public static RemoteCall<CreateContract> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return deployRemoteCall(CreateContract.class, web3j, credentials, contractGasProvider, BINARY,  "");
    }

    public static RemoteCall<CreateContract> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return deployRemoteCall(CreateContract.class, web3j, transactionManager, contractGasProvider, BINARY,  "");
    }

    public static CreateContract load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new CreateContract(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static CreateContract load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new CreateContract(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
