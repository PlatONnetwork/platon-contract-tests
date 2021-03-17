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
public class Sha3AndKeccake256 extends Contract {
    private static final String BINARY = "608060405234801561001057600080fd5b5061033a806100206000396000f3fe608060405234801561001057600080fd5b50600436106100365760003560e01c8063598a717b1461003b5780638f9e1a5d14610059575b600080fd5b610043610075565b60405161005091906101c0565b60405180910390f35b610073600480360381019061006e919061011b565b61007e565b005b60008054905090565b808160405160200161009192919061019c565b6040516020818303038152906040528051906020012060001c60008190555050565b60006100c66100c184610200565b6101db565b9050828152602081018484840111156100de57600080fd5b6100e9848285610251565b509392505050565b600082601f83011261010257600080fd5b81356101128482602086016100b3565b91505092915050565b60006020828403121561012d57600080fd5b600082013567ffffffffffffffff81111561014757600080fd5b610153848285016100f1565b91505092915050565b600061016782610231565b610171818561023c565b9350610181818560208601610260565b80840191505092915050565b61019681610247565b82525050565b60006101a8828561015c565b91506101b4828461015c565b91508190509392505050565b60006020820190506101d5600083018461018d565b92915050565b60006101e56101f6565b90506101f18282610293565b919050565b6000604051905090565b600067ffffffffffffffff82111561021b5761021a6102c4565b5b610224826102f3565b9050602081019050919050565b600081519050919050565b600081905092915050565b6000819050919050565b82818337600083830152505050565b60005b8381101561027e578082015181840152602081019050610263565b8381111561028d576000848401525b50505050565b61029c826102f3565b810181811067ffffffffffffffff821117156102bb576102ba6102c4565b5b80604052505050565b7f4e487b7100000000000000000000000000000000000000000000000000000000600052604160045260246000fd5b6000601f19601f830116905091905056fea264697066735822122017a519363596299d8a7bc83b544c31eca623d56a65ca0018be7620c6358998bd64736f6c63430008020033";

    public static final String FUNC_GETKECCAK256VALUE = "getKeccak256Value";

    public static final String FUNC_KECCAK = "keccak";

    protected Sha3AndKeccake256(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected Sha3AndKeccake256(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteCall<BigInteger> getKeccak256Value() {
        final Function function = new Function(FUNC_GETKECCAK256VALUE, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<TransactionReceipt> keccak(String sha256value) {
        final Function function = new Function(
                FUNC_KECCAK, 
                Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.Utf8String(sha256value)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public static RemoteCall<Sha3AndKeccake256> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return deployRemoteCall(Sha3AndKeccake256.class, web3j, credentials, contractGasProvider, BINARY,  "");
    }

    public static RemoteCall<Sha3AndKeccake256> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return deployRemoteCall(Sha3AndKeccake256.class, web3j, transactionManager, contractGasProvider, BINARY,  "");
    }

    public static Sha3AndKeccake256 load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new Sha3AndKeccake256(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static Sha3AndKeccake256 load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new Sha3AndKeccake256(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
