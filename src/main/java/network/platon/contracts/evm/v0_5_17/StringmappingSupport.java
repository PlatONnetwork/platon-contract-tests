package network.platon.contracts.evm.v0_5_17;

import com.platon.abi.solidity.TypeReference;
import com.platon.abi.solidity.datatypes.Function;
import com.platon.abi.solidity.datatypes.Type;
import com.platon.abi.solidity.datatypes.Utf8String;
import com.platon.crypto.Credentials;
import com.platon.protocol.Web3j;
import com.platon.protocol.core.RemoteCall;
import com.platon.protocol.core.methods.response.TransactionReceipt;
import com.platon.tx.Contract;
import com.platon.tx.TransactionManager;
import com.platon.tx.gas.GasProvider;
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
public class StringmappingSupport extends Contract {
    private static final String BINARY = "608060405234801561001057600080fd5b50610827806100206000396000f3fe608060405234801561001057600080fd5b506004361061004c5760003560e01c80638f39654914610051578063d4d7306b14610112578063e4e50f7814610264578063e78855a814610343575b600080fd5b6100976004803603602081101561006757600080fd5b81019080803576ffffffffffffffffffffffffffffffffffffffffffffff19169060200190929190505050610477565b6040518080602001828103825283818151815260200191508051906020019080838360005b838110156100d75780820151818401526020810190506100bc565b50505050905090810190601f1680156101045780820380516001836020036101000a031916815260200191505b509250505060405180910390f35b6102626004803603604081101561012857600080fd5b810190808035906020019064010000000081111561014557600080fd5b82018360208201111561015757600080fd5b8035906020019184600183028401116401000000008311171561017957600080fd5b91908080601f016020809104026020016040519081016040528093929190818152602001838380828437600081840152601f19601f820116905080830192505050505050509192919290803590602001906401000000008111156101dc57600080fd5b8201836020820111156101ee57600080fd5b8035906020019184600183028401116401000000008311171561021057600080fd5b91908080601f016020809104026020016040519081016040528093929190818152602001838380828437600081840152601f19601f820116905080830192505050505050509192919290505050610560565b005b6103416004803603604081101561027a57600080fd5b81019080803576ffffffffffffffffffffffffffffffffffffffffffffff19169060200190929190803590602001906401000000008111156102bb57600080fd5b8201836020820111156102cd57600080fd5b803590602001918460018302840111640100000000831117156102ef57600080fd5b91908080601f016020809104026020016040519081016040528093929190818152602001838380828437600081840152601f19601f8201169050808301925050505050505091929192905050506105e2565b005b6103fc6004803603602081101561035957600080fd5b810190808035906020019064010000000081111561037657600080fd5b82018360208201111561038857600080fd5b803590602001918460018302840111640100000000831117156103aa57600080fd5b91908080601f016020809104026020016040519081016040528093929190818152602001838380828437600081840152601f19601f820116905080830192505050505050509192919290505050610642565b6040518080602001828103825283818151815260200191508051906020019080838360005b8381101561043c578082015181840152602081019050610421565b50505050905090810190601f1680156104695780820380516001836020036101000a031916815260200191505b509250505060405180910390f35b6060600160008376ffffffffffffffffffffffffffffffffffffffffffffff191676ffffffffffffffffffffffffffffffffffffffffffffff191681526020019081526020016000208054600181600116156101000203166002900480601f0160208091040260200160405190810160405280929190818152602001828054600181600116156101000203166002900480156105545780601f1061052957610100808354040283529160200191610554565b820191906000526020600020905b81548152906001019060200180831161053757829003601f168201915b50505050509050919050565b806000836040518082805190602001908083835b602083106105975780518252602082019150602081019050602083039250610574565b6001836020036101000a038019825116818451168082178552505050505050905001915050908152602001604051809103902090805190602001906105dd92919061074d565b505050565b80600160008476ffffffffffffffffffffffffffffffffffffffffffffff191676ffffffffffffffffffffffffffffffffffffffffffffff19168152602001908152602001600020908051906020019061063d92919061074d565b505050565b60606000826040518082805190602001908083835b6020831061067a5780518252602082019150602081019050602083039250610657565b6001836020036101000a03801982511681845116808217855250505050505090500191505090815260200160405180910390208054600181600116156101000203166002900480601f0160208091040260200160405190810160405280929190818152602001828054600181600116156101000203166002900480156107415780601f1061071657610100808354040283529160200191610741565b820191906000526020600020905b81548152906001019060200180831161072457829003601f168201915b50505050509050919050565b828054600181600116156101000203166002900490600052602060002090601f016020900481019282601f1061078e57805160ff19168380011785556107bc565b828001600101855582156107bc579182015b828111156107bb5782518255916020019190600101906107a0565b5b5090506107c991906107cd565b5090565b6107ef91905b808211156107eb5760008160009055506001016107d3565b5090565b9056fea265627a7a723158202acb62dc6d5750f1e96d82532dcd8c03cf3e4f5533e9338c64faaf75ab715d1264736f6c63430005110032";

    public static final String FUNC_GETBYTE32MAPVALUE = "getByte32mapValue";

    public static final String FUNC_GETSTRINGMAPVALUE = "getStringmapValue";

    public static final String FUNC_SETBYTE32MAPVALUE = "setByte32mapValue";

    public static final String FUNC_SETSTRINGMAPVALUE = "setStringmapValue";

    protected StringmappingSupport(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected StringmappingSupport(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteCall<String> getByte32mapValue(byte[] _key) {
        final Function function = new Function(FUNC_GETBYTE32MAPVALUE, 
                Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.generated.Bytes9(_key)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<String> getStringmapValue(String _key) {
        final Function function = new Function(FUNC_GETSTRINGMAPVALUE, 
                Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.Utf8String(_key)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<TransactionReceipt> setByte32mapValue(byte[] _key, String _value) {
        final Function function = new Function(
                FUNC_SETBYTE32MAPVALUE, 
                Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.generated.Bytes9(_key), 
                new com.platon.abi.solidity.datatypes.Utf8String(_value)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> setStringmapValue(String _key, String _value) {
        final Function function = new Function(
                FUNC_SETSTRINGMAPVALUE, 
                Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.Utf8String(_key), 
                new com.platon.abi.solidity.datatypes.Utf8String(_value)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public static RemoteCall<StringmappingSupport> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return deployRemoteCall(StringmappingSupport.class, web3j, credentials, contractGasProvider, BINARY,  "");
    }

    public static RemoteCall<StringmappingSupport> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return deployRemoteCall(StringmappingSupport.class, web3j, transactionManager, contractGasProvider, BINARY,  "");
    }

    public static StringmappingSupport load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new StringmappingSupport(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static StringmappingSupport load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new StringmappingSupport(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
