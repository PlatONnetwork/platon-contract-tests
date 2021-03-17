package network.platon.contracts.evm.v0_8_2;

import com.platon.abi.solidity.TypeReference;
import com.platon.abi.solidity.datatypes.Address;
import com.platon.abi.solidity.datatypes.Function;
import com.platon.abi.solidity.datatypes.Type;
import com.platon.abi.solidity.datatypes.generated.Bytes32;
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
public class MathAndCryptographicFunctions extends Contract {
    private static final String BINARY = "608060405234801561001057600080fd5b50610599806100206000396000f3fe608060405234801561001057600080fd5b50600436106100625760003560e01c806301c740441461006757806301f56b78146100855780635b4aa3ee146100b5578063aa4e8744146100d3578063cc98f30e146100f1578063f9b416911461010f575b600080fd5b61006f61012d565b60405161007c9190610433565b60405180910390f35b61009f600480360381019061009a9190610341565b610182565b6040516100ac9190610418565b60405180910390f35b6100bd6101e2565b6040516100ca9190610433565b60405180910390f35b6100db61020a565b6040516100e89190610493565b60405180910390f35b6100f961024c565b6040516101069190610433565b60405180910390f35b610117610297565b6040516101249190610493565b60405180910390f35b6000600260405161013d90610403565b602060405180830381855afa15801561015a573d6000803e3d6000fd5b5050506040513d601f19601f8201168201806040525081019061017d9190610318565b905090565b600080600186868686604051600081526020016040526040516101a8949392919061044e565b6020604051602081039080840390855afa1580156101ca573d6000803e3d6000fd5b50505060206040510351905080915050949350505050565b60007fe1629b9dda060bb30c7908346f6af189c16773fa148d3366701fbaa35d54f3c8905090565b6000600380610242577f4e487b7100000000000000000000000000000000000000000000000000000000600052601260045260246000fd5b6003600209905090565b6000600360405161025c90610403565b602060405180830381855afa158015610279573d6000803e3d6000fd5b5050506040515160601b6bffffffffffffffffffffffff1916905090565b60006003806102cf577f4e487b7100000000000000000000000000000000000000000000000000000000600052601260045260246000fd5b6003600208905090565b6000813590506102e881610535565b92915050565b6000815190506102fd81610535565b92915050565b6000813590506103128161054c565b92915050565b60006020828403121561032a57600080fd5b6000610338848285016102ee565b91505092915050565b6000806000806080858703121561035757600080fd5b6000610365878288016102d9565b945050602061037687828801610303565b9350506040610387878288016102d9565b9250506060610398878288016102d9565b91505092959194509250565b6103ad816104b9565b82525050565b6103bc816104cb565b82525050565b60006103cf6003836104ae565b91506103da8261050c565b600382019050919050565b6103ee816104f5565b82525050565b6103fd816104ff565b82525050565b600061040e826103c2565b9150819050919050565b600060208201905061042d60008301846103a4565b92915050565b600060208201905061044860008301846103b3565b92915050565b600060808201905061046360008301876103b3565b61047060208301866103f4565b61047d60408301856103b3565b61048a60608301846103b3565b95945050505050565b60006020820190506104a860008301846103e5565b92915050565b600081905092915050565b60006104c4826104d5565b9050919050565b6000819050919050565b600073ffffffffffffffffffffffffffffffffffffffff82169050919050565b6000819050919050565b600060ff82169050919050565b7f4142430000000000000000000000000000000000000000000000000000000000600082015250565b61053e816104cb565b811461054957600080fd5b50565b610555816104ff565b811461056057600080fd5b5056fea264697066735822122069c688f82b3b0acb1cbbaf81b1216ace50b9de1925c3dbd7ea7d87135c57d15364736f6c63430008020033";

    public static final String FUNC_CALLADDMOD = "callAddMod";

    public static final String FUNC_CALLECRECOVER = "callEcrecover";

    public static final String FUNC_CALLKECCAK256 = "callKeccak256";

    public static final String FUNC_CALLMULMOD = "callMulMod";

    public static final String FUNC_CALLRIPEMD160 = "callRipemd160";

    public static final String FUNC_CALLSHA256 = "callSha256";

    protected MathAndCryptographicFunctions(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected MathAndCryptographicFunctions(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteCall<BigInteger> callAddMod() {
        final Function function = new Function(FUNC_CALLADDMOD, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<String> callEcrecover(byte[] hash, BigInteger v, byte[] r, byte[] s) {
        final Function function = new Function(FUNC_CALLECRECOVER, 
                Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.generated.Bytes32(hash), 
                new com.platon.abi.solidity.datatypes.generated.Uint8(v), 
                new com.platon.abi.solidity.datatypes.generated.Bytes32(r), 
                new com.platon.abi.solidity.datatypes.generated.Bytes32(s)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<byte[]> callKeccak256() {
        final Function function = new Function(FUNC_CALLKECCAK256, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bytes32>() {}));
        return executeRemoteCallSingleValueReturn(function, byte[].class);
    }

    public RemoteCall<BigInteger> callMulMod() {
        final Function function = new Function(FUNC_CALLMULMOD, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<byte[]> callRipemd160() {
        final Function function = new Function(FUNC_CALLRIPEMD160, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bytes32>() {}));
        return executeRemoteCallSingleValueReturn(function, byte[].class);
    }

    public RemoteCall<byte[]> callSha256() {
        final Function function = new Function(FUNC_CALLSHA256, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bytes32>() {}));
        return executeRemoteCallSingleValueReturn(function, byte[].class);
    }

    public static RemoteCall<MathAndCryptographicFunctions> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return deployRemoteCall(MathAndCryptographicFunctions.class, web3j, credentials, contractGasProvider, BINARY,  "");
    }

    public static RemoteCall<MathAndCryptographicFunctions> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return deployRemoteCall(MathAndCryptographicFunctions.class, web3j, transactionManager, contractGasProvider, BINARY,  "");
    }

    public static MathAndCryptographicFunctions load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new MathAndCryptographicFunctions(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static MathAndCryptographicFunctions load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new MathAndCryptographicFunctions(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
