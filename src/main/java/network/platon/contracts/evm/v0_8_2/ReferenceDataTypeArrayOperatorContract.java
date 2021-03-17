package network.platon.contracts.evm.v0_8_2;

import com.platon.abi.solidity.TypeReference;
import com.platon.abi.solidity.datatypes.Bool;
import com.platon.abi.solidity.datatypes.Function;
import com.platon.abi.solidity.datatypes.Type;
import com.platon.abi.solidity.datatypes.generated.Bytes1;
import com.platon.abi.solidity.datatypes.generated.Uint8;
import com.platon.crypto.Credentials;
import com.platon.protocol.Web3j;
import com.platon.protocol.core.RemoteCall;
import com.platon.tuples.generated.Tuple2;
import com.platon.tuples.generated.Tuple5;
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
public class ReferenceDataTypeArrayOperatorContract extends Contract {
    private static final String BINARY = "608060405234801561001057600080fd5b506105c8806100206000396000f3fe608060405234801561001057600080fd5b506004361061007d5760003560e01c806399a1c3691161005b57806399a1c369146100df5780639a6e3cb7146100fe578063b990333414610120578063fd081ef81461013f5761007d565b80631ff0db4014610082578063676cb904146100a157806386d11710146100c0575b600080fd5b61008a61015e565b604051610098929190610524565b60405180910390f35b6100a9610190565b6040516100b7929190610524565b60405180910390f35b6100c86101dc565b6040516100d6929190610524565b60405180910390f35b6100e7610228565b6040516100f5929190610524565b60405180910390f35b61010661025a565b6040516101179594939291906104d1565b60405180910390f35b61012861044b565b604051610136929190610524565b60405180910390f35b61014761047d565b604051610155929190610524565b60405180910390f35b6000806000608160f81b90506000608060f81b90506000818316905060008160f81c9050818195509550505050509091565b6000806000608160f81b905060006001827effffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff1916901b905060008160f81c90508181945094505050509091565b6000806000608160f81b905060006001827effffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff1916901c905060008160f81c90508181945094505050509091565b6000806000608160f81b90506000608060f81b90506000818318905060008160f81c9050818195509550505050509091565b6000806000806000807f6100000000000000000000000000000000000000000000000000000000000000905060007f620000000000000000000000000000000000000000000000000000000000000090506000606160f81b90506000827effffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff1916847effffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff19161090506000837effffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff1916857effffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff19161190506000837effffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff1916867effffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff19161490506000847effffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff1916867effffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff1916141590506000857effffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff1916887effffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff19161015905084848484849c509c509c509c509c5050505050505050509091929394565b6000806000608160f81b90506000608060f81b90506000818317905060008160f81c9050818195509550505050509091565b6000806000608160f81b905060008119905060008160f81c90508181945094505050509091565b6104ad8161054d565b82525050565b6104bc81610559565b82525050565b6104cb81610585565b82525050565b600060a0820190506104e660008301886104a4565b6104f360208301876104a4565b61050060408301866104a4565b61050d60608301856104a4565b61051a60808301846104a4565b9695505050505050565b600060408201905061053960008301856104b3565b61054660208301846104c2565b9392505050565b60008115159050919050565b60007fff0000000000000000000000000000000000000000000000000000000000000082169050919050565b600060ff8216905091905056fea264697066735822122096efe0e5092465367b4216f4809cd9ccd79e1cfa782ea73efddc0b01c325646164736f6c63430008020033";

    public static final String FUNC_ARRAYBITANDOPERATORS = "arrayBitAndOperators";

    public static final String FUNC_ARRAYBITINVERSEOPERATORS = "arrayBitInverseOperators";

    public static final String FUNC_ARRAYBITLEFTSHIFTPERATORS = "arrayBitLeftShiftperators";

    public static final String FUNC_ARRAYBITOROPERATORS = "arrayBitOrOperators";

    public static final String FUNC_ARRAYBITRIGHTSHIFTPERATORS = "arrayBitRightShiftperators";

    public static final String FUNC_ARRAYBITXOROPERATORS = "arrayBitXOROperators";

    public static final String FUNC_ARRAYCOMPARE = "arrayCompare";

    protected ReferenceDataTypeArrayOperatorContract(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected ReferenceDataTypeArrayOperatorContract(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteCall<Tuple2<byte[], BigInteger>> arrayBitAndOperators() {
        final Function function = new Function(FUNC_ARRAYBITANDOPERATORS, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bytes1>() {}, new TypeReference<Uint8>() {}));
        return new RemoteCall<Tuple2<byte[], BigInteger>>(
                new Callable<Tuple2<byte[], BigInteger>>() {
                    @Override
                    public Tuple2<byte[], BigInteger> call() throws Exception {
                        List<Type> results = executeCallMultipleValueReturn(function);
                        return new Tuple2<byte[], BigInteger>(
                                (byte[]) results.get(0).getValue(), 
                                (BigInteger) results.get(1).getValue());
                    }
                });
    }

    public RemoteCall<Tuple2<byte[], BigInteger>> arrayBitInverseOperators() {
        final Function function = new Function(FUNC_ARRAYBITINVERSEOPERATORS, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bytes1>() {}, new TypeReference<Uint8>() {}));
        return new RemoteCall<Tuple2<byte[], BigInteger>>(
                new Callable<Tuple2<byte[], BigInteger>>() {
                    @Override
                    public Tuple2<byte[], BigInteger> call() throws Exception {
                        List<Type> results = executeCallMultipleValueReturn(function);
                        return new Tuple2<byte[], BigInteger>(
                                (byte[]) results.get(0).getValue(), 
                                (BigInteger) results.get(1).getValue());
                    }
                });
    }

    public RemoteCall<Tuple2<byte[], BigInteger>> arrayBitLeftShiftperators() {
        final Function function = new Function(FUNC_ARRAYBITLEFTSHIFTPERATORS, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bytes1>() {}, new TypeReference<Uint8>() {}));
        return new RemoteCall<Tuple2<byte[], BigInteger>>(
                new Callable<Tuple2<byte[], BigInteger>>() {
                    @Override
                    public Tuple2<byte[], BigInteger> call() throws Exception {
                        List<Type> results = executeCallMultipleValueReturn(function);
                        return new Tuple2<byte[], BigInteger>(
                                (byte[]) results.get(0).getValue(), 
                                (BigInteger) results.get(1).getValue());
                    }
                });
    }

    public RemoteCall<Tuple2<byte[], BigInteger>> arrayBitOrOperators() {
        final Function function = new Function(FUNC_ARRAYBITOROPERATORS, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bytes1>() {}, new TypeReference<Uint8>() {}));
        return new RemoteCall<Tuple2<byte[], BigInteger>>(
                new Callable<Tuple2<byte[], BigInteger>>() {
                    @Override
                    public Tuple2<byte[], BigInteger> call() throws Exception {
                        List<Type> results = executeCallMultipleValueReturn(function);
                        return new Tuple2<byte[], BigInteger>(
                                (byte[]) results.get(0).getValue(), 
                                (BigInteger) results.get(1).getValue());
                    }
                });
    }

    public RemoteCall<Tuple2<byte[], BigInteger>> arrayBitRightShiftperators() {
        final Function function = new Function(FUNC_ARRAYBITRIGHTSHIFTPERATORS, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bytes1>() {}, new TypeReference<Uint8>() {}));
        return new RemoteCall<Tuple2<byte[], BigInteger>>(
                new Callable<Tuple2<byte[], BigInteger>>() {
                    @Override
                    public Tuple2<byte[], BigInteger> call() throws Exception {
                        List<Type> results = executeCallMultipleValueReturn(function);
                        return new Tuple2<byte[], BigInteger>(
                                (byte[]) results.get(0).getValue(), 
                                (BigInteger) results.get(1).getValue());
                    }
                });
    }

    public RemoteCall<Tuple2<byte[], BigInteger>> arrayBitXOROperators() {
        final Function function = new Function(FUNC_ARRAYBITXOROPERATORS, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bytes1>() {}, new TypeReference<Uint8>() {}));
        return new RemoteCall<Tuple2<byte[], BigInteger>>(
                new Callable<Tuple2<byte[], BigInteger>>() {
                    @Override
                    public Tuple2<byte[], BigInteger> call() throws Exception {
                        List<Type> results = executeCallMultipleValueReturn(function);
                        return new Tuple2<byte[], BigInteger>(
                                (byte[]) results.get(0).getValue(), 
                                (BigInteger) results.get(1).getValue());
                    }
                });
    }

    public RemoteCall<Tuple5<Boolean, Boolean, Boolean, Boolean, Boolean>> arrayCompare() {
        final Function function = new Function(FUNC_ARRAYCOMPARE, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}, new TypeReference<Bool>() {}, new TypeReference<Bool>() {}, new TypeReference<Bool>() {}, new TypeReference<Bool>() {}));
        return new RemoteCall<Tuple5<Boolean, Boolean, Boolean, Boolean, Boolean>>(
                new Callable<Tuple5<Boolean, Boolean, Boolean, Boolean, Boolean>>() {
                    @Override
                    public Tuple5<Boolean, Boolean, Boolean, Boolean, Boolean> call() throws Exception {
                        List<Type> results = executeCallMultipleValueReturn(function);
                        return new Tuple5<Boolean, Boolean, Boolean, Boolean, Boolean>(
                                (Boolean) results.get(0).getValue(), 
                                (Boolean) results.get(1).getValue(), 
                                (Boolean) results.get(2).getValue(), 
                                (Boolean) results.get(3).getValue(), 
                                (Boolean) results.get(4).getValue());
                    }
                });
    }

    public static RemoteCall<ReferenceDataTypeArrayOperatorContract> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return deployRemoteCall(ReferenceDataTypeArrayOperatorContract.class, web3j, credentials, contractGasProvider, BINARY,  "");
    }

    public static RemoteCall<ReferenceDataTypeArrayOperatorContract> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return deployRemoteCall(ReferenceDataTypeArrayOperatorContract.class, web3j, transactionManager, contractGasProvider, BINARY,  "");
    }

    public static ReferenceDataTypeArrayOperatorContract load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new ReferenceDataTypeArrayOperatorContract(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static ReferenceDataTypeArrayOperatorContract load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new ReferenceDataTypeArrayOperatorContract(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
