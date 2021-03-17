package network.platon.contracts.evm.v0_8_2;

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
    private static final String BINARY = "60806040526040518060200160405280600081525060009080519060200190610029929190610062565b50604051806020016040528060008152506001908051906020019061004f929190610062565b5034801561005c57600080fd5b50610166565b82805461006e90610105565b90600052602060002090601f01602090048101928261009057600085556100d7565b82601f106100a957805160ff19168380011785556100d7565b828001600101855582156100d7579182015b828111156100d65782518255916020019190600101906100bb565b5b5090506100e491906100e8565b5090565b5b808211156101015760008160009055506001016100e9565b5090565b6000600282049050600182168061011d57607f821691505b6020821081141561013157610130610137565b5b50919050565b7f4e487b7100000000000000000000000000000000000000000000000000000000600052602260045260246000fd5b610608806101756000396000f3fe608060405234801561001057600080fd5b50600436106100625760003560e01c806331aa8a6e146100675780633af1a463146100855780634fc34113146100a35780639c72890b146100bf578063accab56b146100dd578063e652e565146100f9575b600080fd5b61006f610117565b60405161007c9190610420565b60405180910390f35b61008d61015a565b60405161009a9190610420565b60405180910390f35b6100bd60048036038101906100b8919061037c565b6101ec565b005b6100c7610206565b6040516100d49190610405565b60405180910390f35b6100f760048036038101906100f2919061037c565b610214565b005b61010161022e565b60405161010e9190610420565b60405180910390f35b606060006040518060400160405280600881526020017f635375624e616d6500000000000000000000000000000000000000000000000081525090508091505090565b60606000805461016990610500565b80601f016020809104026020016040519081016040528092919081815260200182805461019590610500565b80156101e25780601f106101b7576101008083540402835291602001916101e2565b820191906000526020600020905b8154815290600101906020018083116101c557829003601f168201915b5050505050905090565b8060009080519060200190610202929190610271565b5050565b600080601490508091505090565b806001908051906020019061022a929190610271565b5050565b606060006040518060400160405280600a81526020017f706172656e744e616d650000000000000000000000000000000000000000000081525090508091505090565b82805461027d90610500565b90600052602060002090601f01602090048101928261029f57600085556102e6565b82601f106102b857805160ff19168380011785556102e6565b828001600101855582156102e6579182015b828111156102e55782518255916020019190600101906102ca565b5b5090506102f391906102f7565b5090565b5b808211156103105760008160009055506001016102f8565b5090565b600061032761032284610467565b610442565b90508281526020810184848401111561033f57600080fd5b61034a8482856104be565b509392505050565b600082601f83011261036357600080fd5b8135610373848260208601610314565b91505092915050565b60006020828403121561038e57600080fd5b600082013567ffffffffffffffff8111156103a857600080fd5b6103b484828501610352565b91505092915050565b6103c6816104b4565b82525050565b60006103d782610498565b6103e181856104a3565b93506103f18185602086016104cd565b6103fa816105c1565b840191505092915050565b600060208201905061041a60008301846103bd565b92915050565b6000602082019050818103600083015261043a81846103cc565b905092915050565b600061044c61045d565b90506104588282610532565b919050565b6000604051905090565b600067ffffffffffffffff82111561048257610481610592565b5b61048b826105c1565b9050602081019050919050565b600081519050919050565b600082825260208201905092915050565b6000819050919050565b82818337600083830152505050565b60005b838110156104eb5780820151818401526020810190506104d0565b838111156104fa576000848401525b50505050565b6000600282049050600182168061051857607f821691505b6020821081141561052c5761052b610563565b5b50919050565b61053b826105c1565b810181811067ffffffffffffffff8211171561055a57610559610592565b5b80604052505050565b7f4e487b7100000000000000000000000000000000000000000000000000000000600052602260045260246000fd5b7f4e487b7100000000000000000000000000000000000000000000000000000000600052604160045260246000fd5b6000601f19601f830116905091905056fea26469706673582212209c20f52705995d7c8f7717b7b6b5ef557ef498b0a26bcaf64028fa32b2751e2964736f6c63430008020033";

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
