package network.platon.contracts.evm.v0_8_2;

import com.platon.abi.solidity.TypeReference;
import com.platon.abi.solidity.datatypes.Address;
import com.platon.abi.solidity.datatypes.Bool;
import com.platon.abi.solidity.datatypes.DynamicBytes;
import com.platon.abi.solidity.datatypes.Function;
import com.platon.abi.solidity.datatypes.Type;
import com.platon.abi.solidity.datatypes.Utf8String;
import com.platon.abi.solidity.datatypes.generated.Uint256;
import com.platon.abi.solidity.datatypes.generated.Uint8;
import com.platon.crypto.Credentials;
import com.platon.protocol.Web3j;
import com.platon.protocol.core.RemoteCall;
import com.platon.protocol.core.methods.response.TransactionReceipt;
import com.platon.tuples.generated.Tuple2;
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
public class DeleteDemo extends Contract {
    private static final String BINARY = "608060405260016000806101000a81548160ff0219169083151502179055506001805533600260006101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff1602179055506040518060400160405280600381526020017f313233000000000000000000000000000000000000000000000000000000000081525060039080519060200190620000b092919062000165565b506040518060400160405280600381526020017f616263000000000000000000000000000000000000000000000000000000000081525060049080519060200190620000fe929190620001f6565b506001600560006101000a81548160ff021916908360028111156200014c577f4e487b7100000000000000000000000000000000000000000000000000000000600052602160045260246000fd5b02179055503480156200015e57600080fd5b506200030b565b8280546200017390620002a6565b90600052602060002090601f016020900481019282620001975760008555620001e3565b82601f10620001b257805160ff1916838001178555620001e3565b82800160010185558215620001e3579182015b82811115620001e2578251825591602001919060010190620001c5565b5b509050620001f2919062000287565b5090565b8280546200020490620002a6565b90600052602060002090601f01602090048101928262000228576000855562000274565b82601f106200024357805160ff191683800117855562000274565b8280016001018555821562000274579182015b828111156200027357825182559160200191906001019062000256565b5b50905062000283919062000287565b5090565b5b80821115620002a257600081600090555060010162000288565b5090565b60006002820490506001821680620002bf57607f821691505b60208210811415620002d657620002d5620002dc565b5b50919050565b7f4e487b7100000000000000000000000000000000000000000000000000000000600052602260045260246000fd5b610eb6806200031b6000396000f3fe6080604052600436106101095760003560e01c8063767800de11610095578063c15bae8411610064578063c15bae841461030a578063cf08fed514610335578063d1bdda4114610360578063e5aa3d581461037f578063f0299749146103aa57610109565b8063767800de1461025e57806393e1ed8314610289578063a1a984e5146102b4578063ab5170b2146102df57610109565b806327c58232116100dc57806327c58232146101bc57806332d057c9146101d35780633ab0698c146101dd5780634df7e3d0146102085780635d743b5d1461023357610109565b806305be2c121461010e57806313a5a8af1461013a5780631acddabe14610165578063252bd4d314610191575b600080fd5b34801561011a57600080fd5b506101236103d5565b604051610131929190610c9a565b60405180910390f35b34801561014657600080fd5b5061014f610478565b60405161015c9190610c42565b60405180910390f35b34801561017157600080fd5b5061017a61048f565b604051610188929190610cca565b60405180910390f35b34801561019d57600080fd5b506101a66104e3565b6040516101b39190610bea565b60405180910390f35b3480156101c857600080fd5b506101d161050d565b005b6101db610579565b005b3480156101e957600080fd5b506101f26105d2565b6040516101ff9190610c7f565b60405180910390f35b34801561021457600080fd5b5061021d6106e3565b60405161022a9190610c05565b60405180910390f35b34801561023f57600080fd5b506102486106f4565b6040516102559190610c20565b60405180910390f35b34801561026a57600080fd5b50610273610786565b6040516102809190610bea565b60405180910390f35b34801561029557600080fd5b5061029e6107ac565b6040516102ab9190610c20565b60405180910390f35b3480156102c057600080fd5b506102c961083a565b6040516102d69190610c7f565b60405180910390f35b3480156102eb57600080fd5b506102f4610844565b6040516103019190610c5d565b60405180910390f35b34801561031657600080fd5b5061031f6108d6565b60405161032c9190610c5d565b60405180910390f35b34801561034157600080fd5b5061034a610964565b6040516103579190610c42565b60405180910390f35b610368610977565b604051610376929190610c9a565b60405180910390f35b34801561038b57600080fd5b50610394610a83565b6040516103a19190610c7f565b60405180910390f35b3480156103b657600080fd5b506103bf610a89565b6040516103cc9190610c05565b60405180910390f35b6000606060066000015460066001018080546103f090610dcb565b80601f016020809104026020016040519081016040528092919081815260200182805461041c90610dcb565b80156104695780601f1061043e57610100808354040283529160200191610469565b820191906000526020600020905b81548152906001019060200180831161044c57829003601f168201915b50505050509050915091509091565b6000600560009054906101000a900460ff16905090565b600080600860000160003373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002054600860010154915091509091565b6000600260009054906101000a900473ffffffffffffffffffffffffffffffffffffffff16905090565b6000806101000a81549060ff0219169055600160009055600260006101000a81549073ffffffffffffffffffffffffffffffffffffffff0219169055600360006105579190610a9f565b600460006105659190610adf565b600560006101000a81549060ff0219169055565b6107d0600860000160003373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff168152602001908152602001600020819055506008600060018201600090555050565b600080600767ffffffffffffffff811115610616577f4e487b7100000000000000000000000000000000000000000000000000000000600052604160045260246000fd5b6040519080825280602002602001820160405280156106445781602001602082028036833780820191505090505b509050606481600081518110610683577f4e487b7100000000000000000000000000000000000000000000000000000000600052603260045260246000fd5b60200260200101818152505060c8816001815181106106cb577f4e487b7100000000000000000000000000000000000000000000000000000000600052603260045260246000fd5b60200260200101818152505060609050805191505090565b60008054906101000a900460ff1681565b60606003805461070390610dcb565b80601f016020809104026020016040519081016040528092919081815260200182805461072f90610dcb565b801561077c5780601f106107515761010080835404028352916020019161077c565b820191906000526020600020905b81548152906001019060200180831161075f57829003601f168201915b5050505050905090565b600260009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1681565b600380546107b990610dcb565b80601f01602080910402602001604051908101604052809291908181526020018280546107e590610dcb565b80156108325780601f1061080757610100808354040283529160200191610832565b820191906000526020600020905b81548152906001019060200180831161081557829003601f168201915b505050505081565b6000600154905090565b60606004805461085390610dcb565b80601f016020809104026020016040519081016040528092919081815260200182805461087f90610dcb565b80156108cc5780601f106108a1576101008083540402835291602001916108cc565b820191906000526020600020905b8154815290600101906020018083116108af57829003601f168201915b5050505050905090565b600480546108e390610dcb565b80601f016020809104026020016040519081016040528092919081815260200182805461090f90610dcb565b801561095c5780601f106109315761010080835404028352916020019161095c565b820191906000526020600020905b81548152906001019060200180831161093f57829003601f168201915b505050505081565b600560009054906101000a900460ff1681565b600060606040518060400160405280600a81526020016040518060400160405280600381526020017f61626300000000000000000000000000000000000000000000000000000000008152508152505060066000808201600090556001820160006109e29190610adf565b505060066000015460066001018080546109fb90610dcb565b80601f0160208091040260200160405190810160405280929190818152602001828054610a2790610dcb565b8015610a745780601f10610a4957610100808354040283529160200191610a74565b820191906000526020600020905b815481529060010190602001808311610a5757829003601f168201915b50505050509050915091509091565b60015481565b60008060009054906101000a900460ff16905090565b508054610aab90610dcb565b6000825580601f10610abd5750610adc565b601f016020900490600052602060002090810190610adb9190610b1f565b5b50565b508054610aeb90610dcb565b6000825580601f10610afd5750610b1c565b601f016020900490600052602060002090810190610b1b9190610b1f565b5b50565b5b80821115610b38576000816000905550600101610b20565b5090565b610b4581610d2b565b82525050565b610b5481610d3d565b82525050565b6000610b6582610cf3565b610b6f8185610d09565b9350610b7f818560208601610d98565b610b8881610e5b565b840191505092915050565b610b9c81610d86565b82525050565b6000610bad82610cfe565b610bb78185610d1a565b9350610bc7818560208601610d98565b610bd081610e5b565b840191505092915050565b610be481610d7c565b82525050565b6000602082019050610bff6000830184610b3c565b92915050565b6000602082019050610c1a6000830184610b4b565b92915050565b60006020820190508181036000830152610c3a8184610b5a565b905092915050565b6000602082019050610c576000830184610b93565b92915050565b60006020820190508181036000830152610c778184610ba2565b905092915050565b6000602082019050610c946000830184610bdb565b92915050565b6000604082019050610caf6000830185610bdb565b8181036020830152610cc18184610ba2565b90509392505050565b6000604082019050610cdf6000830185610bdb565b610cec6020830184610bdb565b9392505050565b600081519050919050565b600081519050919050565b600082825260208201905092915050565b600082825260208201905092915050565b6000610d3682610d5c565b9050919050565b60008115159050919050565b6000819050610d5782610e6c565b919050565b600073ffffffffffffffffffffffffffffffffffffffff82169050919050565b6000819050919050565b6000610d9182610d49565b9050919050565b60005b83811015610db6578082015181840152602081019050610d9b565b83811115610dc5576000848401525b50505050565b60006002820490506001821680610de357607f821691505b60208210811415610df757610df6610e2c565b5b50919050565b7f4e487b7100000000000000000000000000000000000000000000000000000000600052602160045260246000fd5b7f4e487b7100000000000000000000000000000000000000000000000000000000600052602260045260246000fd5b6000601f19601f8301169050919050565b60038110610e7d57610e7c610dfd565b5b5056fea26469706673582212208fa033a443ceb1415234dec3b58ade930e9f13e7be24b3a57ad513ee32ae99b064736f6c63430008020033";

    public static final String FUNC_ADDR = "addr";

    public static final String FUNC_B = "b";

    public static final String FUNC_COLOR = "color";

    public static final String FUNC_DELDYNAMICARRAY = "delDynamicArray";

    public static final String FUNC_DELMAPPING = "delMapping";

    public static final String FUNC_DELSTRUCT = "delStruct";

    public static final String FUNC_DELETEATTR = "deleteAttr";

    public static final String FUNC_GETADDRESS = "getaddress";

    public static final String FUNC_GETBOOL = "getbool";

    public static final String FUNC_GETBYTES = "getbytes";

    public static final String FUNC_GETDELMAPPING = "getdelMapping";

    public static final String FUNC_GETENUM = "getenum";

    public static final String FUNC_GETSTR = "getstr";

    public static final String FUNC_GETSTRUCT = "getstruct";

    public static final String FUNC_GETUNIT = "getunit";

    public static final String FUNC_I = "i";

    public static final String FUNC_STR = "str";

    public static final String FUNC_VARBYTE = "varByte";

    protected DeleteDemo(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected DeleteDemo(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteCall<String> addr() {
        final Function function = new Function(FUNC_ADDR, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<Boolean> b() {
        final Function function = new Function(FUNC_B, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}));
        return executeRemoteCallSingleValueReturn(function, Boolean.class);
    }

    public RemoteCall<BigInteger> color() {
        final Function function = new Function(FUNC_COLOR, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint8>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<BigInteger> delDynamicArray() {
        final Function function = new Function(FUNC_DELDYNAMICARRAY, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<TransactionReceipt> delMapping(BigInteger vonValue) {
        final Function function = new Function(
                FUNC_DELMAPPING, 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function, vonValue);
    }

    public RemoteCall<TransactionReceipt> delStruct(BigInteger vonValue) {
        final Function function = new Function(
                FUNC_DELSTRUCT, 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function, vonValue);
    }

    public RemoteCall<TransactionReceipt> deleteAttr() {
        final Function function = new Function(
                FUNC_DELETEATTR, 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<String> getaddress() {
        final Function function = new Function(FUNC_GETADDRESS, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<Boolean> getbool() {
        final Function function = new Function(FUNC_GETBOOL, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}));
        return executeRemoteCallSingleValueReturn(function, Boolean.class);
    }

    public RemoteCall<byte[]> getbytes() {
        final Function function = new Function(FUNC_GETBYTES, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<DynamicBytes>() {}));
        return executeRemoteCallSingleValueReturn(function, byte[].class);
    }

    public RemoteCall<Tuple2<BigInteger, BigInteger>> getdelMapping() {
        final Function function = new Function(FUNC_GETDELMAPPING, 
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

    public RemoteCall<BigInteger> getenum() {
        final Function function = new Function(FUNC_GETENUM, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint8>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<String> getstr() {
        final Function function = new Function(FUNC_GETSTR, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<Tuple2<BigInteger, String>> getstruct() {
        final Function function = new Function(FUNC_GETSTRUCT, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}, new TypeReference<Utf8String>() {}));
        return new RemoteCall<Tuple2<BigInteger, String>>(
                new Callable<Tuple2<BigInteger, String>>() {
                    @Override
                    public Tuple2<BigInteger, String> call() throws Exception {
                        List<Type> results = executeCallMultipleValueReturn(function);
                        return new Tuple2<BigInteger, String>(
                                (BigInteger) results.get(0).getValue(), 
                                (String) results.get(1).getValue());
                    }
                });
    }

    public RemoteCall<BigInteger> getunit() {
        final Function function = new Function(FUNC_GETUNIT, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<BigInteger> i() {
        final Function function = new Function(FUNC_I, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<String> str() {
        final Function function = new Function(FUNC_STR, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<byte[]> varByte() {
        final Function function = new Function(FUNC_VARBYTE, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<DynamicBytes>() {}));
        return executeRemoteCallSingleValueReturn(function, byte[].class);
    }

    public static RemoteCall<DeleteDemo> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return deployRemoteCall(DeleteDemo.class, web3j, credentials, contractGasProvider, BINARY,  "");
    }

    public static RemoteCall<DeleteDemo> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return deployRemoteCall(DeleteDemo.class, web3j, transactionManager, contractGasProvider, BINARY,  "");
    }

    public static DeleteDemo load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new DeleteDemo(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static DeleteDemo load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new DeleteDemo(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
