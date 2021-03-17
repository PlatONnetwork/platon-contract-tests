package network.platon.contracts.evm.v0_8_2;

import com.platon.abi.solidity.TypeReference;
import com.platon.abi.solidity.datatypes.Address;
import com.platon.abi.solidity.datatypes.Bool;
import com.platon.abi.solidity.datatypes.Function;
import com.platon.abi.solidity.datatypes.Type;
import com.platon.abi.solidity.datatypes.Utf8String;
import com.platon.abi.solidity.datatypes.generated.Bytes3;
import com.platon.abi.solidity.datatypes.generated.Int256;
import com.platon.abi.solidity.datatypes.generated.Uint256;
import com.platon.abi.solidity.datatypes.generated.Uint8;
import com.platon.crypto.Credentials;
import com.platon.protocol.Web3j;
import com.platon.protocol.core.RemoteCall;
import com.platon.protocol.core.methods.response.TransactionReceipt;
import com.platon.tuples.generated.Tuple2;
import com.platon.tuples.generated.Tuple6;
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
public class BasicDataTypeDeleteContract extends Contract {
    private static final String BINARY = "608060405234801561001057600080fd5b50610c22806100206000396000f3fe608060405234801561001057600080fd5b50600436106100a95760003560e01c8063b2548ecc11610071578063b2548ecc14610109578063c72604671461012c578063d5e350e314610136578063d8c9d5f514610154578063e9cafac21461015e578063f0ebce5a14610168576100a9565b80630849cc99146100ae5780630860dca9146100cc57806309b1b3f2146100d65780630d35d126146100f55780633edf92a8146100ff575b600080fd5b6100b6610186565b6040516100c391906109d2565b60405180910390f35b6100d4610193565b005b6100de6101a7565b6040516100ec929190610a08565b60405180910390f35b6100fd610257565b005b6101076104fa565b005b610111610523565b6040516101239695949392919061094f565b60405180910390f35b610134610617565b005b61013e61067d565b60405161014b91906109ed565b60405180910390f35b61015c6106a9565b005b6101666106d4565b005b6101706106e4565b60405161017d91906109b7565b60405180910390f35b6000600580549050905090565b600660006101000a81549060ff0219169055565b60006060600760000160009054906101000a900460ff1660076001018080546101cf90610b37565b80601f01602080910402602001604051908101604052809291908181526020018280546101fb90610b37565b80156102485780601f1061021d57610100808354040283529160200191610248565b820191906000526020600020905b81548152906001019060200180831161022b57829003601f168201915b50505050509050915091509091565b60016000806101000a81548160ff021916908315150217905550600260018190555033600260006101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff1602179055507f3132330000000000000000000000000000000000000000000000000000000000600260146101000a81548162ffffff021916908360e81c02179055506040518060400160405280600581526020017f68656c6c6f000000000000000000000000000000000000000000000000000000815250600390805190602001906103429291906106fb565b5060056004819055506040518060400160405280600160ff1681526020016040518060400160405280600481526020017f456c6c6100000000000000000000000000000000000000000000000000000000815250815250600760008201518160000160006101000a81548160ff021916908360ff16021790555060208201518160010190805190602001906103d89291906106fb565b509050506040518060600160405280600160ff168152602001600260ff168152602001600360ff168152506005906003610413929190610781565b50600160096000600160ff16815260200190815260200160002060006101000a81548160ff021916908360ff160217905550600260096000600260ff16815260200190815260200160002060006101000a81548160ff021916908360ff160217905550600360096000600360ff16815260200190815260200160002060006101000a81548160ff021916908360ff1602179055506002600660006101000a81548160ff021916908360028111156104f3577f4e487b7100000000000000000000000000000000000000000000000000000000600052602160045260246000fd5b0217905550565b60096000600260ff16815260200190815260200160002060006101000a81549060ff0219169055565b600080600080606060008060009054906101000a900460ff16600154600260009054906101000a900473ffffffffffffffffffffffffffffffffffffffff16600260149054906101000a900460e81b600360045481805461058390610b37565b80601f01602080910402602001604051908101604052809291908181526020018280546105af90610b37565b80156105fc5780601f106105d1576101008083540402835291602001916105fc565b820191906000526020600020905b8154815290600101906020018083116105df57829003601f168201915b50505050509150955095509550955095509550909192939495565b6000806101000a81549060ff0219169055600160009055600260006101000a81549073ffffffffffffffffffffffffffffffffffffffff0219169055600260146101000a81549062ffffff0219169055600360006106759190610828565b600460009055565b600060096000600260ff16815260200190815260200160002060009054906101000a900460ff16905090565b6007600080820160006101000a81549060ff02191690556001820160006106d09190610828565b5050565b600560006106e29190610868565b565b6000600660009054906101000a900460ff16905090565b82805461070790610b37565b90600052602060002090601f0160209004810192826107295760008555610770565b82601f1061074257805160ff1916838001178555610770565b82800160010185558215610770579182015b8281111561076f578251825591602001919060010190610754565b5b50905061077d9190610890565b5090565b82805482825590600052602060002090601f016020900481019282156108175791602002820160005b838211156107e857835183826101000a81548160ff021916908360ff16021790555092602001926001016020816000010492830192600103026107aa565b80156108155782816101000a81549060ff02191690556001016020816000010492830192600103026107e8565b505b5090506108249190610890565b5090565b50805461083490610b37565b6000825580601f106108465750610865565b601f0160209004906000526020600020908101906108649190610890565b5b50565b50805460008255601f01602090049060005260206000209081019061088d9190610890565b50565b5b808211156108a9576000816000905550600101610891565b5090565b6108b681610a54565b82525050565b6108c581610a66565b82525050565b6108d481610a72565b82525050565b6108e381610af2565b82525050565b6108f281610ab1565b82525050565b600061090382610a38565b61090d8185610a43565b935061091d818560208601610b04565b61092681610bc7565b840191505092915050565b61093a81610adb565b82525050565b61094981610ae5565b82525050565b600060c08201905061096460008301896108bc565b6109716020830188610931565b61097e60408301876108ad565b61098b60608301866108cb565b818103608083015261099d81856108f8565b90506109ac60a08301846108e9565b979650505050505050565b60006020820190506109cc60008301846108da565b92915050565b60006020820190506109e76000830184610931565b92915050565b6000602082019050610a026000830184610940565b92915050565b6000604082019050610a1d6000830185610940565b8181036020830152610a2f81846108f8565b90509392505050565b600081519050919050565b600082825260208201905092915050565b6000610a5f82610abb565b9050919050565b60008115159050919050565b60007fffffff000000000000000000000000000000000000000000000000000000000082169050919050565b6000819050610aac82610bd8565b919050565b6000819050919050565b600073ffffffffffffffffffffffffffffffffffffffff82169050919050565b6000819050919050565b600060ff82169050919050565b6000610afd82610a9e565b9050919050565b60005b83811015610b22578082015181840152602081019050610b07565b83811115610b31576000848401525b50505050565b60006002820490506001821680610b4f57607f821691505b60208210811415610b6357610b62610b98565b5b50919050565b7f4e487b7100000000000000000000000000000000000000000000000000000000600052602160045260246000fd5b7f4e487b7100000000000000000000000000000000000000000000000000000000600052602260045260246000fd5b6000601f19601f8301169050919050565b60038110610be957610be8610b69565b5b5056fea2646970667358221220d06829764005e105fe41da79c3b23a2fcd2cc99a75b588e945b1234277cbb1b564736f6c63430008020033";

    public static final String FUNC_DELETEARRAY = "deleteArray";

    public static final String FUNC_DELETEBASICDATA = "deleteBasicData";

    public static final String FUNC_DELETEENUM = "deleteEnum";

    public static final String FUNC_DELETEMAPPING = "deleteMapping";

    public static final String FUNC_DELETESTRUCT = "deleteStruct";

    public static final String FUNC_GETARRAYLENGTH = "getArrayLength";

    public static final String FUNC_GETBASICDATA = "getBasicData";

    public static final String FUNC_GETENUM = "getEnum";

    public static final String FUNC_GETMAPPING = "getMapping";

    public static final String FUNC_GETSTRUCT = "getStruct";

    public static final String FUNC_INITBASICDATA = "initBasicData";

    protected BasicDataTypeDeleteContract(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected BasicDataTypeDeleteContract(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteCall<TransactionReceipt> deleteArray() {
        final Function function = new Function(
                FUNC_DELETEARRAY, 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> deleteBasicData() {
        final Function function = new Function(
                FUNC_DELETEBASICDATA, 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> deleteEnum() {
        final Function function = new Function(
                FUNC_DELETEENUM, 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> deleteMapping() {
        final Function function = new Function(
                FUNC_DELETEMAPPING, 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> deleteStruct() {
        final Function function = new Function(
                FUNC_DELETESTRUCT, 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<BigInteger> getArrayLength() {
        final Function function = new Function(FUNC_GETARRAYLENGTH, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<Tuple6<Boolean, BigInteger, String, byte[], String, BigInteger>> getBasicData() {
        final Function function = new Function(FUNC_GETBASICDATA, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}, new TypeReference<Uint256>() {}, new TypeReference<Address>() {}, new TypeReference<Bytes3>() {}, new TypeReference<Utf8String>() {}, new TypeReference<Int256>() {}));
        return new RemoteCall<Tuple6<Boolean, BigInteger, String, byte[], String, BigInteger>>(
                new Callable<Tuple6<Boolean, BigInteger, String, byte[], String, BigInteger>>() {
                    @Override
                    public Tuple6<Boolean, BigInteger, String, byte[], String, BigInteger> call() throws Exception {
                        List<Type> results = executeCallMultipleValueReturn(function);
                        return new Tuple6<Boolean, BigInteger, String, byte[], String, BigInteger>(
                                (Boolean) results.get(0).getValue(), 
                                (BigInteger) results.get(1).getValue(), 
                                (String) results.get(2).getValue(), 
                                (byte[]) results.get(3).getValue(), 
                                (String) results.get(4).getValue(), 
                                (BigInteger) results.get(5).getValue());
                    }
                });
    }

    public RemoteCall<BigInteger> getEnum() {
        final Function function = new Function(FUNC_GETENUM, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint8>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<BigInteger> getMapping() {
        final Function function = new Function(FUNC_GETMAPPING, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint8>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<Tuple2<BigInteger, String>> getStruct() {
        final Function function = new Function(FUNC_GETSTRUCT, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint8>() {}, new TypeReference<Utf8String>() {}));
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

    public RemoteCall<TransactionReceipt> initBasicData() {
        final Function function = new Function(
                FUNC_INITBASICDATA, 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public static RemoteCall<BasicDataTypeDeleteContract> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return deployRemoteCall(BasicDataTypeDeleteContract.class, web3j, credentials, contractGasProvider, BINARY,  "");
    }

    public static RemoteCall<BasicDataTypeDeleteContract> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return deployRemoteCall(BasicDataTypeDeleteContract.class, web3j, transactionManager, contractGasProvider, BINARY,  "");
    }

    public static BasicDataTypeDeleteContract load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new BasicDataTypeDeleteContract(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static BasicDataTypeDeleteContract load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new BasicDataTypeDeleteContract(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
