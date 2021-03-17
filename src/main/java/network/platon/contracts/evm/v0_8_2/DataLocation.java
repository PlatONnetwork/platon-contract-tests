package network.platon.contracts.evm.v0_8_2;

import com.platon.abi.solidity.TypeReference;
import com.platon.abi.solidity.datatypes.DynamicBytes;
import com.platon.abi.solidity.datatypes.Function;
import com.platon.abi.solidity.datatypes.Type;
import com.platon.abi.solidity.datatypes.Utf8String;
import com.platon.abi.solidity.datatypes.generated.Uint256;
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
public class DataLocation extends Contract {
    private static final String BINARY = "608060405234801561001057600080fd5b50610935806100206000396000f3fe608060405234801561001057600080fd5b506004361061004c5760003560e01c80630bcd3b3314610051578063246982c41461006f5780633ca8b1a7146100a0578063a1715deb146100d0575b600080fd5b610059610100565b60405161006691906106de565b60405180910390f35b610089600480360381019061008491906105a3565b610192565b604051610097929190610700565b60405180910390f35b6100ba60048036038101906100b5919061055e565b610256565b6040516100c791906106de565b60405180910390f35b6100ea60048036038101906100e591906105cc565b6102fd565b6040516100f791906106c3565b60405180910390f35b60606001805461010f90610816565b80601f016020809104026020016040519081016040528092919081815260200182805461013b90610816565b80156101885780601f1061015d57610100808354040283529160200191610188565b820191906000526020600020905b81548152906001019060200180831161016b57829003601f168201915b5050505050905090565b60606000806000848152602001908152602001600020600001600080858152602001908152602001600020600101548180546101cd90610816565b80601f01602080910402602001604051908101604052809291908181526020018280546101f990610816565b80156102465780601f1061021b57610100808354040283529160200191610246565b820191906000526020600020905b81548152906001019060200180831161022957829003601f168201915b5050505050915091509150915091565b606082826001919061026992919061036e565b506001805461027790610816565b80601f01602080910402602001604051908101604052809291908181526020018280546102a390610816565b80156102f05780601f106102c5576101008083540402835291602001916102f0565b820191906000526020600020905b8154815290600101906020018083116102d357829003601f168201915b5050505050905092915050565b6000806040518060400160405280858152602001848152509050610321818661032d565b60019150509392505050565b81600080838152602001908152602001600020600082015181600001908051906020019061035c9291906103f4565b50602082015181600101559050505050565b82805461037a90610816565b90600052602060002090601f01602090048101928261039c57600085556103e3565b82601f106103b557803560ff19168380011785556103e3565b828001600101855582156103e3579182015b828111156103e25782358255916020019190600101906103c7565b5b5090506103f0919061047a565b5090565b82805461040090610816565b90600052602060002090601f0160209004810192826104225760008555610469565b82601f1061043b57805160ff1916838001178555610469565b82800160010185558215610469579182015b8281111561046857825182559160200191906001019061044d565b5b509050610476919061047a565b5090565b5b8082111561049357600081600090555060010161047b565b5090565b60006104aa6104a584610755565b610730565b9050828152602081018484840111156104c257600080fd5b6104cd8482856107d4565b509392505050565b60008083601f8401126104e757600080fd5b8235905067ffffffffffffffff81111561050057600080fd5b60208301915083600182028301111561051857600080fd5b9250929050565b600082601f83011261053057600080fd5b8135610540848260208601610497565b91505092915050565b600081359050610558816108e8565b92915050565b6000806020838503121561057157600080fd5b600083013567ffffffffffffffff81111561058b57600080fd5b610597858286016104d5565b92509250509250929050565b6000602082840312156105b557600080fd5b60006105c384828501610549565b91505092915050565b6000806000606084860312156105e157600080fd5b60006105ef86828701610549565b935050602084013567ffffffffffffffff81111561060c57600080fd5b6106188682870161051f565b925050604061062986828701610549565b9150509250925092565b61063c816107be565b82525050565b600061064d82610786565b610657818561079c565b93506106678185602086016107e3565b610670816108d7565b840191505092915050565b600061068682610791565b61069081856107ad565b93506106a08185602086016107e3565b6106a9816108d7565b840191505092915050565b6106bd816107ca565b82525050565b60006020820190506106d86000830184610633565b92915050565b600060208201905081810360008301526106f88184610642565b905092915050565b6000604082019050818103600083015261071a818561067b565b905061072960208301846106b4565b9392505050565b600061073a61074b565b90506107468282610848565b919050565b6000604051905090565b600067ffffffffffffffff8211156107705761076f6108a8565b5b610779826108d7565b9050602081019050919050565b600081519050919050565b600081519050919050565b600082825260208201905092915050565b600082825260208201905092915050565b60008115159050919050565b6000819050919050565b82818337600083830152505050565b60005b838110156108015780820151818401526020810190506107e6565b83811115610810576000848401525b50505050565b6000600282049050600182168061082e57607f821691505b6020821081141561084257610841610879565b5b50919050565b610851826108d7565b810181811067ffffffffffffffff821117156108705761086f6108a8565b5b80604052505050565b7f4e487b7100000000000000000000000000000000000000000000000000000000600052602260045260246000fd5b7f4e487b7100000000000000000000000000000000000000000000000000000000600052604160045260246000fd5b6000601f19601f8301169050919050565b6108f1816107ca565b81146108fc57600080fd5b5056fea26469706673582212202fba556ec1fc868c059c17deb46a2e1f5f1eee4df02354f7737674d83610627964736f6c63430008020033";

    public static final String FUNC_GETBYTES = "getBytes";

    public static final String FUNC_GETPERSON = "getPerson";

    public static final String FUNC_SAVEPERSON = "savePerson";

    public static final String FUNC_TESTBYTES = "testBytes";

    protected DataLocation(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected DataLocation(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteCall<byte[]> getBytes() {
        final Function function = new Function(FUNC_GETBYTES, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<DynamicBytes>() {}));
        return executeRemoteCallSingleValueReturn(function, byte[].class);
    }

    public RemoteCall<Tuple2<String, BigInteger>> getPerson(BigInteger _id) {
        final Function function = new Function(FUNC_GETPERSON, 
                Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.generated.Uint256(_id)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}, new TypeReference<Uint256>() {}));
        return new RemoteCall<Tuple2<String, BigInteger>>(
                new Callable<Tuple2<String, BigInteger>>() {
                    @Override
                    public Tuple2<String, BigInteger> call() throws Exception {
                        List<Type> results = executeCallMultipleValueReturn(function);
                        return new Tuple2<String, BigInteger>(
                                (String) results.get(0).getValue(), 
                                (BigInteger) results.get(1).getValue());
                    }
                });
    }

    public RemoteCall<TransactionReceipt> savePerson(BigInteger _id, String _name, BigInteger _age) {
        final Function function = new Function(
                FUNC_SAVEPERSON, 
                Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.generated.Uint256(_id), 
                new com.platon.abi.solidity.datatypes.Utf8String(_name), 
                new com.platon.abi.solidity.datatypes.generated.Uint256(_age)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> testBytes(byte[] _data) {
        final Function function = new Function(
                FUNC_TESTBYTES, 
                Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.DynamicBytes(_data)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public static RemoteCall<DataLocation> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return deployRemoteCall(DataLocation.class, web3j, credentials, contractGasProvider, BINARY,  "");
    }

    public static RemoteCall<DataLocation> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return deployRemoteCall(DataLocation.class, web3j, transactionManager, contractGasProvider, BINARY,  "");
    }

    public static DataLocation load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new DataLocation(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static DataLocation load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new DataLocation(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
