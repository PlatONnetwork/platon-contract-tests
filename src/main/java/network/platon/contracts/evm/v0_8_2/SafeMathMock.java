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
public class SafeMathMock extends Contract {
    private static final String BINARY = "608060405234801561001057600080fd5b506109ff806100206000396000f3fe608060405234801561001057600080fd5b50600436106100885760003560e01c8063a391c15b1161005b578063a391c15b1461014d578063b67d77c51461017d578063c8a4ac9c146101ad578063f43f523a146101dd57610088565b80632b7423ab1461008d5780636d5433e6146100bd578063771602f7146100ed5780637ae2b5c71461011d575b600080fd5b6100a760048036038101906100a2919061054b565b61020d565b6040516100b491906106e5565b60405180910390f35b6100d760048036038101906100d2919061054b565b610221565b6040516100e491906106e5565b60405180910390f35b6101076004803603810190610102919061054b565b610235565b60405161011491906106e5565b60405180910390f35b6101376004803603810190610132919061054b565b610249565b60405161014491906106e5565b60405180910390f35b6101676004803603810190610162919061054b565b61025d565b60405161017491906106e5565b60405180910390f35b6101976004803603810190610192919061054b565b610271565b6040516101a491906106e5565b60405180910390f35b6101c760048036038101906101c2919061054b565b610285565b6040516101d491906106e5565b60405180910390f35b6101f760048036038101906101f2919061054b565b610299565b60405161020491906106e5565b60405180910390f35b600061021983836102ad565b905092915050565b600061022d8383610314565b905092915050565b6000610241838361032e565b905092915050565b6000610255838361038c565b905092915050565b600061026983836103a5565b905092915050565b600061027d8383610403565b905092915050565b60006102918383610462565b905092915050565b60006102a583836104dd565b905092915050565b6000600280836102bd9190610830565b6002856102ca9190610830565b6102d49190610711565b6102de9190610767565b6002836102eb9190610767565b6002856102f89190610767565b6103029190610711565b61030c9190610711565b905092915050565b6000818310156103245781610326565b825b905092915050565b600080828461033d9190610711565b905083811015610382576040517f08c379a000000000000000000000000000000000000000000000000000000000815260040161037990610645565b60405180910390fd5b8091505092915050565b600081831061039b578161039d565b825b905092915050565b60008082116103e9576040517f08c379a00000000000000000000000000000000000000000000000000000000081526004016103e090610685565b60405180910390fd5b600082846103f79190610767565b90508091505092915050565b600082821115610448576040517f08c379a000000000000000000000000000000000000000000000000000000000815260040161043f90610665565b60405180910390fd5b6000828461045691906107f2565b90508091505092915050565b60008083141561047557600090506104d7565b600082846104839190610798565b90508284826104929190610767565b146104d2576040517f08c379a00000000000000000000000000000000000000000000000000000000081526004016104c9906106c5565b60405180910390fd5b809150505b92915050565b600080821415610522576040517f08c379a0000000000000000000000000000000000000000000000000000000008152600401610519906106a5565b60405180910390fd5b818361052e9190610830565b905092915050565b600081359050610545816109b2565b92915050565b6000806040838503121561055e57600080fd5b600061056c85828601610536565b925050602061057d85828601610536565b9150509250929050565b6000610594601b83610700565b915061059f826108bf565b602082019050919050565b60006105b7601e83610700565b91506105c2826108e8565b602082019050919050565b60006105da601a83610700565b91506105e582610911565b602082019050919050565b60006105fd601883610700565b91506106088261093a565b602082019050919050565b6000610620602183610700565b915061062b82610963565b604082019050919050565b61063f81610826565b82525050565b6000602082019050818103600083015261065e81610587565b9050919050565b6000602082019050818103600083015261067e816105aa565b9050919050565b6000602082019050818103600083015261069e816105cd565b9050919050565b600060208201905081810360008301526106be816105f0565b9050919050565b600060208201905081810360008301526106de81610613565b9050919050565b60006020820190506106fa6000830184610636565b92915050565b600082825260208201905092915050565b600061071c82610826565b915061072783610826565b9250827fffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff0382111561075c5761075b610861565b5b828201905092915050565b600061077282610826565b915061077d83610826565b92508261078d5761078c610890565b5b828204905092915050565b60006107a382610826565b91506107ae83610826565b9250817fffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff04831182151516156107e7576107e6610861565b5b828202905092915050565b60006107fd82610826565b915061080883610826565b92508282101561081b5761081a610861565b5b828203905092915050565b6000819050919050565b600061083b82610826565b915061084683610826565b92508261085657610855610890565b5b828206905092915050565b7f4e487b7100000000000000000000000000000000000000000000000000000000600052601160045260246000fd5b7f4e487b7100000000000000000000000000000000000000000000000000000000600052601260045260246000fd5b7f536166654d6174683a206164646974696f6e206f766572666c6f770000000000600082015250565b7f536166654d6174683a207375627472616374696f6e206f766572666c6f770000600082015250565b7f536166654d6174683a206469766973696f6e206279207a65726f000000000000600082015250565b7f536166654d6174683a206d6f64756c6f206279207a65726f0000000000000000600082015250565b7f536166654d6174683a206d756c7469706c69636174696f6e206f766572666c6f60008201527f7700000000000000000000000000000000000000000000000000000000000000602082015250565b6109bb81610826565b81146109c657600080fd5b5056fea26469706673582212203cf5987a48799038bf787c4d65884be0b2c6b34478e12ad115d8e25faaff040e64736f6c63430008020033";

    public static final String FUNC_ADD = "add";

    public static final String FUNC_AVERAGE = "average";

    public static final String FUNC_DIV = "div";

    public static final String FUNC_MAX = "max";

    public static final String FUNC_MIN = "min";

    public static final String FUNC_MOD = "mod";

    public static final String FUNC_MUL = "mul";

    public static final String FUNC_SUB = "sub";

    protected SafeMathMock(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected SafeMathMock(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteCall<BigInteger> add(BigInteger a, BigInteger b) {
        final Function function = new Function(FUNC_ADD, 
                Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.generated.Uint256(a), 
                new com.platon.abi.solidity.datatypes.generated.Uint256(b)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<BigInteger> average(BigInteger a, BigInteger b) {
        final Function function = new Function(FUNC_AVERAGE, 
                Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.generated.Uint256(a), 
                new com.platon.abi.solidity.datatypes.generated.Uint256(b)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<BigInteger> div(BigInteger a, BigInteger b) {
        final Function function = new Function(FUNC_DIV, 
                Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.generated.Uint256(a), 
                new com.platon.abi.solidity.datatypes.generated.Uint256(b)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<BigInteger> max(BigInteger a, BigInteger b) {
        final Function function = new Function(FUNC_MAX, 
                Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.generated.Uint256(a), 
                new com.platon.abi.solidity.datatypes.generated.Uint256(b)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<BigInteger> min(BigInteger a, BigInteger b) {
        final Function function = new Function(FUNC_MIN, 
                Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.generated.Uint256(a), 
                new com.platon.abi.solidity.datatypes.generated.Uint256(b)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<BigInteger> mod(BigInteger a, BigInteger b) {
        final Function function = new Function(FUNC_MOD, 
                Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.generated.Uint256(a), 
                new com.platon.abi.solidity.datatypes.generated.Uint256(b)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<BigInteger> mul(BigInteger a, BigInteger b) {
        final Function function = new Function(FUNC_MUL, 
                Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.generated.Uint256(a), 
                new com.platon.abi.solidity.datatypes.generated.Uint256(b)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<BigInteger> sub(BigInteger a, BigInteger b) {
        final Function function = new Function(FUNC_SUB, 
                Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.generated.Uint256(a), 
                new com.platon.abi.solidity.datatypes.generated.Uint256(b)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public static RemoteCall<SafeMathMock> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return deployRemoteCall(SafeMathMock.class, web3j, credentials, contractGasProvider, BINARY,  "");
    }

    public static RemoteCall<SafeMathMock> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return deployRemoteCall(SafeMathMock.class, web3j, transactionManager, contractGasProvider, BINARY,  "");
    }

    public static SafeMathMock load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new SafeMathMock(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static SafeMathMock load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new SafeMathMock(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
