package network.platon.contracts.evm.v0_7_6;

import com.platon.abi.solidity.TypeReference;
import com.platon.abi.solidity.datatypes.Function;
import com.platon.abi.solidity.datatypes.Type;
import com.platon.abi.solidity.datatypes.Utf8String;
import com.platon.abi.solidity.datatypes.generated.Int256;
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
public class AbstractContractCSubclass extends Contract {
    private static final String BINARY = "60806040526040518060200160405280600081525060009080519060200190610029929190610062565b50604051806020016040528060008152506001908051906020019061004f929190610062565b5034801561005c57600080fd5b5061010d565b828054600181600116156101000203166002900490600052602060002090601f01602090048101928261009857600085556100df565b82601f106100b157805160ff19168380011785556100df565b828001600101855582156100df579182015b828111156100de5782518255916020019190600101906100c3565b5b5090506100ec91906100f0565b5090565b5b808211156101095760008160009055506001016100f1565b5090565b6105cf8061011c6000396000f3fe608060405234801561001057600080fd5b50600436106100625760003560e01c806331aa8a6e146100675780633af1a463146100ea5780634fc341131461016d5780639c72890b14610228578063accab56b14610246578063e652e56514610301575b600080fd5b61006f610384565b6040518080602001828103825283818151815260200191508051906020019080838360005b838110156100af578082015181840152602081019050610094565b50505050905090810190601f1680156100dc5780820380516001836020036101000a031916815260200191505b509250505060405180910390f35b6100f26103c7565b6040518080602001828103825283818151815260200191508051906020019080838360005b83811015610132578082015181840152602081019050610117565b50505050905090810190601f16801561015f5780820380516001836020036101000a031916815260200191505b509250505060405180910390f35b6102266004803603602081101561018357600080fd5b81019080803590602001906401000000008111156101a057600080fd5b8201836020820111156101b257600080fd5b803590602001918460018302840111640100000000831117156101d457600080fd5b91908080601f016020809104026020016040519081016040528093929190818152602001838380828437600081840152601f19601f820116905080830192505050505050509192919290505050610469565b005b610230610483565b6040518082815260200191505060405180910390f35b6102ff6004803603602081101561025c57600080fd5b810190808035906020019064010000000081111561027957600080fd5b82018360208201111561028b57600080fd5b803590602001918460018302840111640100000000831117156102ad57600080fd5b91908080601f016020809104026020016040519081016040528093929190818152602001838380828437600081840152601f19601f820116905080830192505050505050509192919290505050610491565b005b6103096104ab565b6040518080602001828103825283818151815260200191508051906020019080838360005b8381101561034957808201518184015260208101905061032e565b50505050905090810190601f1680156103765780820380516001836020036101000a031916815260200191505b509250505060405180910390f35b606060006040518060400160405280600881526020017f635375624e616d6500000000000000000000000000000000000000000000000081525090508091505090565b606060008054600181600116156101000203166002900480601f01602080910402602001604051908101604052809291908181526020018280546001816001161561010002031660029004801561045f5780601f106104345761010080835404028352916020019161045f565b820191906000526020600020905b81548152906001019060200180831161044257829003601f168201915b5050505050905090565b806000908051906020019061047f9291906104ee565b5050565b600080601490508091505090565b80600190805190602001906104a79291906104ee565b5050565b606060006040518060400160405280600a81526020017f706172656e744e616d650000000000000000000000000000000000000000000081525090508091505090565b828054600181600116156101000203166002900490600052602060002090601f016020900481019282610524576000855561056b565b82601f1061053d57805160ff191683800117855561056b565b8280016001018555821561056b579182015b8281111561056a57825182559160200191906001019061054f565b5b509050610578919061057c565b5090565b5b8082111561059557600081600090555060010161057d565b509056fea26469706673582212203ba8e29c17335c5316772b8bdb2c79ed0f3c7187c54592b72157b8efdfea3ee264736f6c63430007060033";

    public static final String FUNC_ASUBAGE = "aSubAge";

    public static final String FUNC_ASUBNAME = "aSubName";

    public static final String FUNC_CSUBNAME = "cSubName";

    public static final String FUNC_PARENTNAME = "parentName";

    public static final String FUNC_SETASUBNAME = "setASubName";

    public static final String FUNC_SETPARENTNAME = "setParentName";

    protected AbstractContractCSubclass(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected AbstractContractCSubclass(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteCall<BigInteger> aSubAge() {
        final Function function = new Function(FUNC_ASUBAGE, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Int256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<String> aSubName() {
        final Function function = new Function(FUNC_ASUBNAME, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<String> cSubName() {
        final Function function = new Function(FUNC_CSUBNAME, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<String> parentName() {
        final Function function = new Function(FUNC_PARENTNAME, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<TransactionReceipt> setASubName(String v) {
        final Function function = new Function(
                FUNC_SETASUBNAME, 
                Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.Utf8String(v)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> setParentName(String name) {
        final Function function = new Function(
                FUNC_SETPARENTNAME, 
                Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.Utf8String(name)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public static RemoteCall<AbstractContractCSubclass> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return deployRemoteCall(AbstractContractCSubclass.class, web3j, credentials, contractGasProvider, BINARY,  "");
    }

    public static RemoteCall<AbstractContractCSubclass> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return deployRemoteCall(AbstractContractCSubclass.class, web3j, transactionManager, contractGasProvider, BINARY,  "");
    }

    public static AbstractContractCSubclass load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new AbstractContractCSubclass(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static AbstractContractCSubclass load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new AbstractContractCSubclass(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
