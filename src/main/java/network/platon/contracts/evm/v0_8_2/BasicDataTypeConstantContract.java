package network.platon.contracts.evm.v0_8_2;

import com.platon.abi.solidity.TypeReference;
import com.platon.abi.solidity.datatypes.Function;
import com.platon.abi.solidity.datatypes.Type;
import com.platon.abi.solidity.datatypes.Utf8String;
import com.platon.abi.solidity.datatypes.generated.Bytes1;
import com.platon.abi.solidity.datatypes.generated.Bytes2;
import com.platon.abi.solidity.datatypes.generated.Uint128;
import com.platon.abi.solidity.datatypes.generated.Uint256;
import com.platon.abi.solidity.datatypes.generated.Uint8;
import com.platon.crypto.Credentials;
import com.platon.protocol.Web3j;
import com.platon.protocol.core.RemoteCall;
import com.platon.protocol.core.methods.response.TransactionReceipt;
import com.platon.tuples.generated.Tuple3;
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
public class BasicDataTypeConstantContract extends Contract {
    private static final String BINARY = "60806040526040518060400160405280600581526020017f68656c6c6f0000000000000000000000000000000000000000000000000000008152506000908051906020019062000051929190620000b4565b506040518060400160405280600581526020017f776f726c64000000000000000000000000000000000000000000000000000000815250600190805190602001906200009f929190620000b4565b50348015620000ad57600080fd5b50620001c9565b828054620000c29062000164565b90600052602060002090601f016020900481019282620000e6576000855562000132565b82601f106200010157805160ff191683800117855562000132565b8280016001018555821562000132579182015b828111156200013157825182559160200191906001019062000114565b5b50905062000141919062000145565b5090565b5b808211156200016057600081600090555060010162000146565b5090565b600060028204905060018216806200017d57607f821691505b602082108114156200019457620001936200019a565b5b50919050565b7f4e487b7100000000000000000000000000000000000000000000000000000000600052602260045260246000fd5b610dc780620001d96000396000f3fe6080604052600436106100fe5760003560e01c80636273899811610095578063a574971011610064578063a574971014610314578063a650b6831461033f578063ccb344151461036a578063ea07cdfa14610395578063f8b2cb4f146103c0576100fe565b8063627389981461026057806369c769171461028b5780637c66959d146102b6578063833f17d5146102e3576100fe565b806338cc4831116100d157806338cc4831146101b457806343e33562146101df5780634dbe1d0f1461020a578063515899f014610235576100fe565b8063166aa6e614610103578063209652551461014057806332c7a2831461016d57806338023fb914610198575b600080fd5b34801561010f57600080fd5b5061012a6004803603810190610125919061091d565b6103fd565b6040516101379190610a7f565b60405180910390f35b34801561014c57600080fd5b50610155610407565b60405161016493929190610ad7565b60405180910390f35b34801561017957600080fd5b50610182610438565b60405161018f9190610a7f565b60405180910390f35b6101b260048036038101906101ad91906108f4565b61047d565b005b3480156101c057600080fd5b506101c96104c7565b6040516101d691906109f7565b60405180910390f35b3480156101eb57600080fd5b506101f46104e8565b6040516102019190610a2d565b60405180910390f35b34801561021657600080fd5b5061021f610515565b60405161022c9190610a7f565b60405180910390f35b34801561024157600080fd5b5061024a610526565b6040516102579190610b0e565b60405180910390f35b34801561026c57600080fd5b5061027561053b565b6040516102829190610a9a565b60405180910390f35b34801561029757600080fd5b506102a0610549565b6040516102ad9190610ab5565b60405180910390f35b3480156102c257600080fd5b506102cb61066a565b6040516102da93929190610a48565b60405180910390f35b6102fd60048036038101906102f891906108f4565b61071c565b60405161030b929190610b29565b60405180910390f35b34801561032057600080fd5b5061032961075e565b6040516103369190610b0e565b60405180910390f35b34801561034b57600080fd5b50610354610766565b6040516103619190610ab5565b60405180910390f35b34801561037657600080fd5b5061037f6107f8565b60405161038c9190610a12565b60405180910390f35b3480156103a157600080fd5b506103aa610825565b6040516103b79190610b0e565b60405180910390f35b3480156103cc57600080fd5b506103e760048036038101906103e291906108cb565b61086b565b6040516103f49190610b0e565b60405180910390f35b6000819050919050565b6000806000806003905060006404a817c80090506000660aa87bee5380009050828282955095509550505050909192565b600080600380811115610474577f4e487b7100000000000000000000000000000000000000000000000000000000600052602160045260246000fd5b90508091505090565b8073ffffffffffffffffffffffffffffffffffffffff166108fc349081150290604051600060405180830381858888f193505050501580156104c3573d6000803e3d6000fd5b5050565b6000807372ad2b713faa14c2c4cd2d7affe5d8f538968f5a90508091505090565b6000807f01f400000000000000000000000000000000000000000000000000000000000090508091505090565b600061052160016103fd565b905090565b600080805461053490610c9e565b9050905090565b600080600690508091505090565b6060600080805461055990610c9e565b80601f016020809104026020016040519081016040528092919081815260200182805461058590610c9e565b80156105d25780601f106105a7576101008083540402835291602001916105d2565b820191906000526020600020905b8154815290600101906020018083116105b557829003601f168201915b505050505090507f610000000000000000000000000000000000000000000000000000000000000081600081518110610634577f4e487b7100000000000000000000000000000000000000000000000000000000600052603260045260246000fd5b60200101907effffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff1916908160001a9053508091505090565b6000806000807f01f4000000000000000000000000000000000000000000000000000000000000905080816000600281106106ce577f4e487b7100000000000000000000000000000000000000000000000000000000600052603260045260246000fd5b1a60f81b8260016002811061070c577f4e487b7100000000000000000000000000000000000000000000000000000000600052603260045260246000fd5b1a60f81b93509350935050909192565b600080348373ffffffffffffffffffffffffffffffffffffffff166108fc349081150290604051600060405180830381858888f1935050505091509150915091565b600047905090565b60606000805461077590610c9e565b80601f01602080910402602001604051908101604052809291908181526020018280546107a190610c9e565b80156107ee5780601f106107c3576101008083540402835291602001916107ee565b820191906000526020600020905b8154815290600101906020018083116107d157829003601f168201915b5050505050905090565b6000807fc80000000000000000000000000000000000000000000000000000000000000090508091505090565b60008060006003811115610862577f4e487b7100000000000000000000000000000000000000000000000000000000600052602160045260246000fd5b90508091505090565b60008173ffffffffffffffffffffffffffffffffffffffff16319050919050565b60008135905061089b81610d53565b92915050565b6000813590506108b081610d6a565b92915050565b6000813590506108c581610d81565b92915050565b6000602082840312156108dd57600080fd5b60006108eb8482850161088c565b91505092915050565b60006020828403121561090657600080fd5b6000610914848285016108a1565b91505092915050565b60006020828403121561092f57600080fd5b600061093d848285016108b6565b91505092915050565b61094f81610b6e565b82525050565b61095e81610b92565b82525050565b61096d81610b9e565b82525050565b61097c81610bca565b82525050565b61098b81610c59565b82525050565b61099a81610c09565b82525050565b60006109ab82610b52565b6109b58185610b5d565b93506109c5818560208601610c6b565b6109ce81610d2e565b840191505092915050565b6109e281610c13565b82525050565b6109f181610c4f565b82525050565b6000602082019050610a0c6000830184610946565b92915050565b6000602082019050610a276000830184610964565b92915050565b6000602082019050610a426000830184610973565b92915050565b6000606082019050610a5d6000830186610973565b610a6a6020830185610964565b610a776040830184610964565b949350505050565b6000602082019050610a946000830184610982565b92915050565b6000602082019050610aaf6000830184610991565b92915050565b60006020820190508181036000830152610acf81846109a0565b905092915050565b6000606082019050610aec60008301866109d9565b610af960208301856109e8565b610b0660408301846109e8565b949350505050565b6000602082019050610b2360008301846109e8565b92915050565b6000604082019050610b3e60008301856109e8565b610b4b6020830184610955565b9392505050565b600081519050919050565b600082825260208201905092915050565b6000610b7982610c2f565b9050919050565b6000610b8b82610c2f565b9050919050565b60008115159050919050565b60007fff0000000000000000000000000000000000000000000000000000000000000082169050919050565b60007fffff00000000000000000000000000000000000000000000000000000000000082169050919050565b6000819050610c0482610d3f565b919050565b6000819050919050565b60006fffffffffffffffffffffffffffffffff82169050919050565b600073ffffffffffffffffffffffffffffffffffffffff82169050919050565b6000819050919050565b6000610c6482610bf6565b9050919050565b60005b83811015610c89578082015181840152602081019050610c6e565b83811115610c98576000848401525b50505050565b60006002820490506001821680610cb657607f821691505b60208210811415610cca57610cc9610cff565b5b50919050565b7f4e487b7100000000000000000000000000000000000000000000000000000000600052602160045260246000fd5b7f4e487b7100000000000000000000000000000000000000000000000000000000600052602260045260246000fd5b6000601f19601f8301169050919050565b60048110610d5057610d4f610cd0565b5b50565b610d5c81610b6e565b8114610d6757600080fd5b50565b610d7381610b80565b8114610d7e57600080fd5b50565b60048110610d8e57600080fd5b5056fea2646970667358221220793c073493b3d92c3ee3e56be462a8825956ecc082bdad2c22bc80e8674c7c1864736f6c63430008020033";

    public static final String FUNC_GETADDRESS = "getAddress";

    public static final String FUNC_GETBALANCE = "getBalance";

    public static final String FUNC_GETCURRENTBALANCE = "getCurrentBalance";

    public static final String FUNC_GETHEXLITERAA = "getHexLiteraA";

    public static final String FUNC_GETHEXLITERAB = "getHexLiteraB";

    public static final String FUNC_GETHEXLITERAC = "getHexLiteraC";

    public static final String FUNC_GETINT = "getInt";

    public static final String FUNC_GETSEASONA = "getSeasonA";

    public static final String FUNC_GETSEASONB = "getSeasonB";

    public static final String FUNC_GETSEASONINDEX = "getSeasonIndex";

    public static final String FUNC_GETSTRA = "getStrA";

    public static final String FUNC_GETSTRALENGTH = "getStrALength";

    public static final String FUNC_GETVALUE = "getValue";

    public static final String FUNC_GOSEND = "goSend";

    public static final String FUNC_GOTRANSFER = "goTransfer";

    public static final String FUNC_PRINTSEASON = "printSeason";

    public static final String FUNC_SETSTRA = "setStrA";

    protected BasicDataTypeConstantContract(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected BasicDataTypeConstantContract(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteCall<TransactionReceipt> getAddress() {
        final Function function = new Function(
                FUNC_GETADDRESS, 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<BigInteger> getBalance(String addr) {
        final Function function = new Function(FUNC_GETBALANCE, 
                Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.Address(addr)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<BigInteger> getCurrentBalance() {
        final Function function = new Function(FUNC_GETCURRENTBALANCE, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<byte[]> getHexLiteraA() {
        final Function function = new Function(FUNC_GETHEXLITERAA, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bytes1>() {}));
        return executeRemoteCallSingleValueReturn(function, byte[].class);
    }

    public RemoteCall<byte[]> getHexLiteraB() {
        final Function function = new Function(FUNC_GETHEXLITERAB, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bytes2>() {}));
        return executeRemoteCallSingleValueReturn(function, byte[].class);
    }

    public RemoteCall<Tuple3<byte[], byte[], byte[]>> getHexLiteraC() {
        final Function function = new Function(FUNC_GETHEXLITERAC, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bytes2>() {}, new TypeReference<Bytes1>() {}, new TypeReference<Bytes1>() {}));
        return new RemoteCall<Tuple3<byte[], byte[], byte[]>>(
                new Callable<Tuple3<byte[], byte[], byte[]>>() {
                    @Override
                    public Tuple3<byte[], byte[], byte[]> call() throws Exception {
                        List<Type> results = executeCallMultipleValueReturn(function);
                        return new Tuple3<byte[], byte[], byte[]>(
                                (byte[]) results.get(0).getValue(), 
                                (byte[]) results.get(1).getValue(), 
                                (byte[]) results.get(2).getValue());
                    }
                });
    }

    public RemoteCall<TransactionReceipt> getInt() {
        final Function function = new Function(
                FUNC_GETINT, 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<BigInteger> getSeasonA() {
        final Function function = new Function(FUNC_GETSEASONA, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint8>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<BigInteger> getSeasonB() {
        final Function function = new Function(FUNC_GETSEASONB, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint8>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<BigInteger> getSeasonIndex() {
        final Function function = new Function(FUNC_GETSEASONINDEX, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<String> getStrA() {
        final Function function = new Function(FUNC_GETSTRA, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<BigInteger> getStrALength() {
        final Function function = new Function(FUNC_GETSTRALENGTH, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<Tuple3<BigInteger, BigInteger, BigInteger>> getValue() {
        final Function function = new Function(FUNC_GETVALUE, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint128>() {}, new TypeReference<Uint256>() {}, new TypeReference<Uint256>() {}));
        return new RemoteCall<Tuple3<BigInteger, BigInteger, BigInteger>>(
                new Callable<Tuple3<BigInteger, BigInteger, BigInteger>>() {
                    @Override
                    public Tuple3<BigInteger, BigInteger, BigInteger> call() throws Exception {
                        List<Type> results = executeCallMultipleValueReturn(function);
                        return new Tuple3<BigInteger, BigInteger, BigInteger>(
                                (BigInteger) results.get(0).getValue(), 
                                (BigInteger) results.get(1).getValue(), 
                                (BigInteger) results.get(2).getValue());
                    }
                });
    }

    public RemoteCall<TransactionReceipt> goSend(String addr, BigInteger vonValue) {
        final Function function = new Function(
                FUNC_GOSEND, 
                Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.Address(addr)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function, vonValue);
    }

    public RemoteCall<TransactionReceipt> goTransfer(String addr, BigInteger vonValue) {
        final Function function = new Function(
                FUNC_GOTRANSFER, 
                Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.Address(addr)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function, vonValue);
    }

    public RemoteCall<BigInteger> printSeason(BigInteger s) {
        final Function function = new Function(FUNC_PRINTSEASON, 
                Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.generated.Uint8(s)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint8>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<String> setStrA() {
        final Function function = new Function(FUNC_SETSTRA, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public static RemoteCall<BasicDataTypeConstantContract> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return deployRemoteCall(BasicDataTypeConstantContract.class, web3j, credentials, contractGasProvider, BINARY,  "");
    }

    public static RemoteCall<BasicDataTypeConstantContract> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return deployRemoteCall(BasicDataTypeConstantContract.class, web3j, transactionManager, contractGasProvider, BINARY,  "");
    }

    public static BasicDataTypeConstantContract load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new BasicDataTypeConstantContract(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static BasicDataTypeConstantContract load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new BasicDataTypeConstantContract(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
