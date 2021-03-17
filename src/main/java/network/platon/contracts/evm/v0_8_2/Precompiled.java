package network.platon.contracts.evm.v0_8_2;

import com.platon.abi.solidity.TypeReference;
import com.platon.abi.solidity.datatypes.Address;
import com.platon.abi.solidity.datatypes.DynamicBytes;
import com.platon.abi.solidity.datatypes.Function;
import com.platon.abi.solidity.datatypes.Type;
import com.platon.abi.solidity.datatypes.generated.Bytes32;
import com.platon.abi.solidity.datatypes.generated.StaticArray2;
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
public class Precompiled extends Contract {
    private static final String BINARY = "608060405234801561001057600080fd5b5061129b806100206000396000f3fe608060405234801561001057600080fd5b50600436106100cf5760003560e01c8063af13657c1161008c578063c3e6b01811610066578063c3e6b0181461022a578063caa260321461025a578063dd0678f11461028a578063ec8b466a146102ba576100cf565b8063af13657c146101ac578063b2acd509146101ca578063be310540146101fa576100cf565b806301f56b78146100d457806341be3d52146101045780636f29e2d7146101225780637e59b08a14610140578063897bf0401461015e5780638af606d41461017c575b600080fd5b6100ee60048036038101906100e99190610bfe565b6102ea565b6040516100fb9190610eaf565b60405180910390f35b61010c610345565b6040516101199190610ee5565b60405180910390f35b61012a61038f565b6040516101379190610f00565b60405180910390f35b610148610399565b6040516101559190610f60565b60405180910390f35b61016661042b565b6040516101739190610eca565b60405180910390f35b61019660048036038101906101919190610c61565b610476565b6040516101a39190610f00565b60405180910390f35b6101b46104c5565b6040516101c19190610f00565b60405180910390f35b6101e460048036038101906101df9190610c61565b6104cf565b6040516101f19190610f00565b60405180910390f35b610214600480360381019061020f9190610ca2565b610527565b6040516102219190610ee5565b60405180910390f35b610244600480360381019061023f9190610baf565b610683565b6040516102519190610f00565b60405180910390f35b610274600480360381019061026f9190610c61565b6106df565b6040516102819190610f60565b60405180910390f35b6102a4600480360381019061029f9190610c61565b610792565b6040516102b19190610f00565b60405180910390f35b6102d460048036038101906102cf9190610baf565b6107eb565b6040516102e19190610eca565b60405180910390f35b60006001858585856040516000815260200160405260405161030f9493929190610f1b565b6020604051602081039080840390855afa158015610331573d6000803e3d6000fd5b505050602060405103519050949350505050565b61034d610902565b60028080602002604051908101604052809291908260028015610385576020028201915b815481526020019060010190808311610371575b5050505050905090565b6000600154905090565b6060600080546103a8906110ee565b80601f01602080910402602001604051908101604052809291908181526020018280546103d4906110ee565b80156104215780601f106103f657610100808354040283529160200191610421565b820191906000526020600020905b81548152906001019060200180831161040457829003601f168201915b5050505050905090565b610433610924565b600460028060200260405190810160405280929190826002801561046c576020028201915b815481526020019060010190808311610458575b5050505050905090565b60006003826040516104889190610e98565b602060405180830381855afa1580156104a5573d6000803e3d6000fd5b5050506040515160601b6bffffffffffffffffffffffff19169050919050565b6000600654905090565b60008082519050600060c0826104e59190611151565b146104ef57600080fd5b6040516020818360208701600060085af180600081146105125782519450610517565b600080fd5b5050508160068190555050919050565b61052f610902565b610537610946565b8581600060048110610572577f4e487b7100000000000000000000000000000000000000000000000000000000600052603260045260246000fd5b60200201818152505084816001600481106105b6577f4e487b7100000000000000000000000000000000000000000000000000000000600052603260045260246000fd5b60200201818152505083816002600481106105fa577f4e487b7100000000000000000000000000000000000000000000000000000000600052603260045260246000fd5b602002018181525050828160036004811061063e577f4e487b7100000000000000000000000000000000000000000000000000000000600052603260045260246000fd5b602002018181525050604082608083600060065af1806000811461066157610666565b600080fd5b5050816002906002610679929190610968565b5050949350505050565b600060405160208152602080820152602060408201528460608201528360808201528260a082015260208160c083600060055af180600081146106c957825193506106ce565b600080fd5b505050806001819055509392505050565b60606000825167ffffffffffffffff811115610724577f4e487b7100000000000000000000000000000000000000000000000000000000600052604160045260246000fd5b6040519080825280601f01601f1916602001820160405280156107565781602001600182028036833780820191505090505b509050825180602083018260208701600060045af161077157fe5b5080600090805190602001906107889291906109a8565b5080915050919050565b60006002826040516107a49190610e98565b602060405180830381855afa1580156107c1573d6000803e3d6000fd5b5050506040513d601f19601f820116820180604052508101906107e49190610b86565b9050919050565b6107f3610924565b6107fb610a2e565b8481600060038110610836577f4e487b7100000000000000000000000000000000000000000000000000000000600052603260045260246000fd5b602002018181525050838160016003811061087a577f4e487b7100000000000000000000000000000000000000000000000000000000600052603260045260246000fd5b60200201818152505082816002600381106108be577f4e487b7100000000000000000000000000000000000000000000000000000000600052603260045260246000fd5b602002018181525050604082606083600060075af180600081146108e1576108e6565b600080fd5b50508160049060026108f9929190610a50565b50509392505050565b6040518060400160405280600290602082028036833780820191505090505090565b6040518060400160405280600290602082028036833780820191505090505090565b6040518060800160405280600490602082028036833780820191505090505090565b8260028101928215610997579160200282015b8281111561099657825182559160200191906001019061097b565b5b5090506109a49190610a90565b5090565b8280546109b4906110ee565b90600052602060002090601f0160209004810192826109d65760008555610a1d565b82601f106109ef57805160ff1916838001178555610a1d565b82800160010185558215610a1d579182015b82811115610a1c578251825591602001919060010190610a01565b5b509050610a2a9190610a90565b5090565b6040518060600160405280600390602082028036833780820191505090505090565b8260028101928215610a7f579160200282015b82811115610a7e578251825591602001919060010190610a63565b5b509050610a8c9190610aad565b5090565b5b80821115610aa9576000816000905550600101610a91565b5090565b5b80821115610ac6576000816000905550600101610aae565b5090565b6000610add610ad884610fa7565b610f82565b905082815260208101848484011115610af557600080fd5b610b008482856110ac565b509392505050565b600081359050610b1781611220565b92915050565b600081519050610b2c81611220565b92915050565b600082601f830112610b4357600080fd5b8135610b53848260208601610aca565b91505092915050565b600081359050610b6b81611237565b92915050565b600081359050610b808161124e565b92915050565b600060208284031215610b9857600080fd5b6000610ba684828501610b1d565b91505092915050565b600080600060608486031215610bc457600080fd5b6000610bd286828701610b08565b9350506020610be386828701610b08565b9250506040610bf486828701610b08565b9150509250925092565b60008060008060808587031215610c1457600080fd5b6000610c2287828801610b08565b9450506020610c3387828801610b71565b9350506040610c4487828801610b08565b9250506060610c5587828801610b08565b91505092959194509250565b600060208284031215610c7357600080fd5b600082013567ffffffffffffffff811115610c8d57600080fd5b610c9984828501610b32565b91505092915050565b60008060008060808587031215610cb857600080fd5b6000610cc687828801610b5c565b9450506020610cd787828801610b5c565b9350506040610ce887828801610b5c565b9250506060610cf987828801610b5c565b91505092959194509250565b6000610d118383610df2565b60208301905092915050565b6000610d298383610e7a565b60208301905092915050565b610d3e81611059565b82525050565b610d4d81610fec565b610d578184611027565b9250610d6282610fd8565b8060005b83811015610d93578151610d7a8782610d05565b9650610d858361100d565b925050600181019050610d66565b505050505050565b610da481610ff7565b610dae8184611032565b9250610db982610fe2565b8060005b83811015610dea578151610dd18782610d1d565b9650610ddc8361101a565b925050600181019050610dbd565b505050505050565b610dfb8161106b565b82525050565b610e0a8161106b565b82525050565b6000610e1b82611002565b610e25818561103d565b9350610e358185602086016110bb565b610e3e8161120f565b840191505092915050565b6000610e5482611002565b610e5e818561104e565b9350610e6e8185602086016110bb565b80840191505092915050565b610e8381611095565b82525050565b610e928161109f565b82525050565b6000610ea48284610e49565b915081905092915050565b6000602082019050610ec46000830184610d35565b92915050565b6000604082019050610edf6000830184610d44565b92915050565b6000604082019050610efa6000830184610d9b565b92915050565b6000602082019050610f156000830184610e01565b92915050565b6000608082019050610f306000830187610e01565b610f3d6020830186610e89565b610f4a6040830185610e01565b610f576060830184610e01565b95945050505050565b60006020820190508181036000830152610f7a8184610e10565b905092915050565b6000610f8c610f9d565b9050610f988282611120565b919050565b6000604051905090565b600067ffffffffffffffff821115610fc257610fc16111e0565b5b610fcb8261120f565b9050602081019050919050565b6000819050919050565b6000819050919050565b600060029050919050565b600060029050919050565b600081519050919050565b6000602082019050919050565b6000602082019050919050565b600081905092915050565b600081905092915050565b600082825260208201905092915050565b600081905092915050565b600061106482611075565b9050919050565b6000819050919050565b600073ffffffffffffffffffffffffffffffffffffffff82169050919050565b6000819050919050565b600060ff82169050919050565b82818337600083830152505050565b60005b838110156110d95780820151818401526020810190506110be565b838111156110e8576000848401525b50505050565b6000600282049050600182168061110657607f821691505b6020821081141561111a576111196111b1565b5b50919050565b6111298261120f565b810181811067ffffffffffffffff82111715611148576111476111e0565b5b80604052505050565b600061115c82611095565b915061116783611095565b92508261117757611176611182565b5b828206905092915050565b7f4e487b7100000000000000000000000000000000000000000000000000000000600052601260045260246000fd5b7f4e487b7100000000000000000000000000000000000000000000000000000000600052602260045260246000fd5b7f4e487b7100000000000000000000000000000000000000000000000000000000600052604160045260246000fd5b6000601f19601f8301169050919050565b6112298161106b565b811461123457600080fd5b50565b61124081611095565b811461124b57600080fd5b50565b6112578161109f565b811461126257600080fd5b5056fea26469706673582212200ee6f746bd291b12d1ee3ebac6c187136e5ce08ce9e4d280b1354a796bcbd2b264736f6c63430008020033";

    public static final String FUNC_CALLBIGMODEXP = "callBigModExp";

    public static final String FUNC_CALLBN256ADD = "callBn256Add";

    public static final String FUNC_CALLBN256PAIRING = "callBn256Pairing";

    public static final String FUNC_CALLBN256SCALARMUL = "callBn256ScalarMul";

    public static final String FUNC_CALLDATACOPY = "callDatacopy";

    public static final String FUNC_CALLECRECOVER = "callEcrecover";

    public static final String FUNC_CALLRIPEMD160 = "callRipemd160";

    public static final String FUNC_CALLSHA256 = "callSha256";

    public static final String FUNC_GETCALLBIGMODEXPVALUE = "getCallBigModExpValue";

    public static final String FUNC_GETCALLBN256ADDVALUES = "getCallBn256AddValues";

    public static final String FUNC_GETCALLBN256PAIRINGVALUE = "getCallBn256PairingValue";

    public static final String FUNC_GETCALLBN256SCALARMULVALUES = "getCallBn256ScalarMulValues";

    public static final String FUNC_GETCALLDATACOPYVALUE = "getCallDatacopyValue";

    protected Precompiled(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected Precompiled(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteCall<TransactionReceipt> callBigModExp(byte[] base, byte[] exponent, byte[] modulus) {
        final Function function = new Function(
                FUNC_CALLBIGMODEXP, 
                Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.generated.Bytes32(base), 
                new com.platon.abi.solidity.datatypes.generated.Bytes32(exponent), 
                new com.platon.abi.solidity.datatypes.generated.Bytes32(modulus)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> callBn256Add(BigInteger ax, BigInteger ay, BigInteger bx, BigInteger by) {
        final Function function = new Function(
                FUNC_CALLBN256ADD, 
                Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.generated.Uint256(ax), 
                new com.platon.abi.solidity.datatypes.generated.Uint256(ay), 
                new com.platon.abi.solidity.datatypes.generated.Uint256(bx), 
                new com.platon.abi.solidity.datatypes.generated.Uint256(by)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> callBn256Pairing(byte[] input) {
        final Function function = new Function(
                FUNC_CALLBN256PAIRING, 
                Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.DynamicBytes(input)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> callBn256ScalarMul(byte[] x, byte[] y, byte[] scalar) {
        final Function function = new Function(
                FUNC_CALLBN256SCALARMUL, 
                Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.generated.Bytes32(x), 
                new com.platon.abi.solidity.datatypes.generated.Bytes32(y), 
                new com.platon.abi.solidity.datatypes.generated.Bytes32(scalar)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> callDatacopy(byte[] data) {
        final Function function = new Function(
                FUNC_CALLDATACOPY, 
                Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.DynamicBytes(data)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
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

    public RemoteCall<byte[]> callRipemd160(byte[] data) {
        final Function function = new Function(FUNC_CALLRIPEMD160, 
                Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.DynamicBytes(data)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bytes32>() {}));
        return executeRemoteCallSingleValueReturn(function, byte[].class);
    }

    public RemoteCall<byte[]> callSha256(byte[] data) {
        final Function function = new Function(FUNC_CALLSHA256, 
                Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.DynamicBytes(data)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bytes32>() {}));
        return executeRemoteCallSingleValueReturn(function, byte[].class);
    }

    public RemoteCall<byte[]> getCallBigModExpValue() {
        final Function function = new Function(FUNC_GETCALLBIGMODEXPVALUE, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bytes32>() {}));
        return executeRemoteCallSingleValueReturn(function, byte[].class);
    }

    public RemoteCall<List> getCallBn256AddValues() {
        final Function function = new Function(FUNC_GETCALLBN256ADDVALUES, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<StaticArray2<Uint256>>() {}));
        return new RemoteCall<List>(
                new Callable<List>() {
                    @Override
                    @SuppressWarnings("unchecked")
                    public List call() throws Exception {
                        List<Type> result = (List<Type>) executeCallSingleValueReturn(function, List.class);
                        return convertToNative(result);
                    }
                });
    }

    public RemoteCall<byte[]> getCallBn256PairingValue() {
        final Function function = new Function(FUNC_GETCALLBN256PAIRINGVALUE, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bytes32>() {}));
        return executeRemoteCallSingleValueReturn(function, byte[].class);
    }

    public RemoteCall<List> getCallBn256ScalarMulValues() {
        final Function function = new Function(FUNC_GETCALLBN256SCALARMULVALUES, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<StaticArray2<Bytes32>>() {}));
        return new RemoteCall<List>(
                new Callable<List>() {
                    @Override
                    @SuppressWarnings("unchecked")
                    public List call() throws Exception {
                        List<Type> result = (List<Type>) executeCallSingleValueReturn(function, List.class);
                        return convertToNative(result);
                    }
                });
    }

    public RemoteCall<byte[]> getCallDatacopyValue() {
        final Function function = new Function(FUNC_GETCALLDATACOPYVALUE, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<DynamicBytes>() {}));
        return executeRemoteCallSingleValueReturn(function, byte[].class);
    }

    public static RemoteCall<Precompiled> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return deployRemoteCall(Precompiled.class, web3j, credentials, contractGasProvider, BINARY,  "");
    }

    public static RemoteCall<Precompiled> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return deployRemoteCall(Precompiled.class, web3j, transactionManager, contractGasProvider, BINARY,  "");
    }

    public static Precompiled load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new Precompiled(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static Precompiled load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new Precompiled(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
