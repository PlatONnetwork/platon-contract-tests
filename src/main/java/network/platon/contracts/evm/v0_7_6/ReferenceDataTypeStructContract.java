package network.platon.contracts.evm.v0_7_6;

import com.platon.abi.solidity.TypeReference;
import com.platon.abi.solidity.datatypes.Address;
import com.platon.abi.solidity.datatypes.Bool;
import com.platon.abi.solidity.datatypes.Function;
import com.platon.abi.solidity.datatypes.Type;
import com.platon.abi.solidity.datatypes.generated.Uint256;
import com.platon.crypto.Credentials;
import com.platon.protocol.Web3j;
import com.platon.protocol.core.RemoteCall;
import com.platon.tuples.generated.Tuple4;
import com.platon.tx.Contract;
import com.platon.tx.TransactionManager;
import com.platon.tx.gas.GasProvider;
import java.math.BigInteger;
import java.util.Arrays;
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
public class ReferenceDataTypeStructContract extends Contract {
    private static final String BINARY = "608060405234801561001057600080fd5b506102e4806100206000396000f3fe608060405234801561001057600080fd5b50600436106100415760003560e01c80630b1a6855146100465780638e5f3b9c14610091578063cdd9acc1146100dc575b600080fd5b61004e610127565b604051808581526020018473ffffffffffffffffffffffffffffffffffffffff168152602001838152602001821515815260200194505050505060405180910390f35b61009961019c565b604051808581526020018473ffffffffffffffffffffffffffffffffffffffff168152602001838152602001821515815260200194505050505060405180910390f35b6100e4610205565b604051808581526020018473ffffffffffffffffffffffffffffffffffffffff168152602001838152602001821515815260200194505050505060405180910390f35b60008060008061013561026e565b60006040518060800160405280600281526020013373ffffffffffffffffffffffffffffffffffffffff1681526020016019815260200160011515815250905080915081600001518260200151836040015184606001519550955095509550505090919293565b60008060008060006040518060800160405280600281526020013373ffffffffffffffffffffffffffffffffffffffff16815260200160198152602001600115158152509050806000015181602001518260400151836060015194509450945094505090919293565b60008060008060006040518060800160405280600281526020013373ffffffffffffffffffffffffffffffffffffffff16815260200160198152602001600115158152509050806000015181602001518260400151836060015194509450945094505090919293565b604051806080016040528060008152602001600073ffffffffffffffffffffffffffffffffffffffff16815260200160008152602001600015158152509056fea2646970667358221220041ce6eec0d479c4cd5486a94295f56c1407d11be4edaaecef7d1ca1c7a82be564736f6c63430007060033";

    public static final String FUNC_INITDATASTRUCTA = "initDataStructA";

    public static final String FUNC_INITDATASTRUCTB = "initDataStructB";

    public static final String FUNC_INITDATASTRUCTC = "initDataStructC";

    protected ReferenceDataTypeStructContract(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected ReferenceDataTypeStructContract(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteCall<Tuple4<BigInteger, String, BigInteger, Boolean>> initDataStructA() {
        final Function function = new Function(FUNC_INITDATASTRUCTA, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}, new TypeReference<Address>() {}, new TypeReference<Uint256>() {}, new TypeReference<Bool>() {}));
        return new RemoteCall<Tuple4<BigInteger, String, BigInteger, Boolean>>(
                new Callable<Tuple4<BigInteger, String, BigInteger, Boolean>>() {
                    @Override
                    public Tuple4<BigInteger, String, BigInteger, Boolean> call() throws Exception {
                        List<Type> results = executeCallMultipleValueReturn(function);
                        return new Tuple4<BigInteger, String, BigInteger, Boolean>(
                                (BigInteger) results.get(0).getValue(), 
                                (String) results.get(1).getValue(), 
                                (BigInteger) results.get(2).getValue(), 
                                (Boolean) results.get(3).getValue());
                    }
                });
    }

    public RemoteCall<Tuple4<BigInteger, String, BigInteger, Boolean>> initDataStructB() {
        final Function function = new Function(FUNC_INITDATASTRUCTB, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}, new TypeReference<Address>() {}, new TypeReference<Uint256>() {}, new TypeReference<Bool>() {}));
        return new RemoteCall<Tuple4<BigInteger, String, BigInteger, Boolean>>(
                new Callable<Tuple4<BigInteger, String, BigInteger, Boolean>>() {
                    @Override
                    public Tuple4<BigInteger, String, BigInteger, Boolean> call() throws Exception {
                        List<Type> results = executeCallMultipleValueReturn(function);
                        return new Tuple4<BigInteger, String, BigInteger, Boolean>(
                                (BigInteger) results.get(0).getValue(), 
                                (String) results.get(1).getValue(), 
                                (BigInteger) results.get(2).getValue(), 
                                (Boolean) results.get(3).getValue());
                    }
                });
    }

    public RemoteCall<Tuple4<BigInteger, String, BigInteger, Boolean>> initDataStructC() {
        final Function function = new Function(FUNC_INITDATASTRUCTC, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}, new TypeReference<Address>() {}, new TypeReference<Uint256>() {}, new TypeReference<Bool>() {}));
        return new RemoteCall<Tuple4<BigInteger, String, BigInteger, Boolean>>(
                new Callable<Tuple4<BigInteger, String, BigInteger, Boolean>>() {
                    @Override
                    public Tuple4<BigInteger, String, BigInteger, Boolean> call() throws Exception {
                        List<Type> results = executeCallMultipleValueReturn(function);
                        return new Tuple4<BigInteger, String, BigInteger, Boolean>(
                                (BigInteger) results.get(0).getValue(), 
                                (String) results.get(1).getValue(), 
                                (BigInteger) results.get(2).getValue(), 
                                (Boolean) results.get(3).getValue());
                    }
                });
    }

    public static RemoteCall<ReferenceDataTypeStructContract> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return deployRemoteCall(ReferenceDataTypeStructContract.class, web3j, credentials, contractGasProvider, BINARY,  "");
    }

    public static RemoteCall<ReferenceDataTypeStructContract> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return deployRemoteCall(ReferenceDataTypeStructContract.class, web3j, transactionManager, contractGasProvider, BINARY,  "");
    }

    public static ReferenceDataTypeStructContract load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new ReferenceDataTypeStructContract(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static ReferenceDataTypeStructContract load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new ReferenceDataTypeStructContract(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
