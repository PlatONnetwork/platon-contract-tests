package network.platon.contracts.evm.v0_8_2;

import com.platon.abi.solidity.TypeReference;
import com.platon.abi.solidity.datatypes.Function;
import com.platon.abi.solidity.datatypes.Type;
import com.platon.abi.solidity.datatypes.generated.Uint256;
import com.platon.crypto.Credentials;
import com.platon.protocol.Web3j;
import com.platon.protocol.core.RemoteCall;
import com.platon.tuples.generated.Tuple3;
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
public class ReferenceDataTypeStructRecursiveContract extends Contract {
    private static final String BINARY = "608060405234801561001057600080fd5b50610212806100206000396000f3fe608060405234801561001057600080fd5b506004361061002b5760003560e01c806397b93b1a14610030575b600080fd5b610038610050565b6040516100479392919061019b565b60405180910390f35b600080600061005d610112565b600061006890610125565b905080600001515181600001516000815181106100ae577f4e487b7100000000000000000000000000000000000000000000000000000000600052603260045260246000fd5b6020026020010151600001515182600001516001815181106100f9577f4e487b7100000000000000000000000000000000000000000000000000000000600052603260045260246000fd5b6020026020010151600001515193509350935050909192565b6040518060200160405280606081525090565b60405180602001604052908160008201805480602002602001604051908101604052809291908181526020016000905b828210156101815783829060005260206000200161017290610125565b81526020019060010190610155565b505050508152505090565b610195816101d2565b82525050565b60006060820190506101b0600083018661018c565b6101bd602083018561018c565b6101ca604083018461018c565b949350505050565b600081905091905056fea26469706673582212201f18ce1fce18436e5bf94efb7d89a35939baaa912765d33eeb97396452a5e3ef64736f6c63430008020033";

    public static final String FUNC_GETSTRUCTPERSONLENGTH = "getStructPersonLength";

    protected ReferenceDataTypeStructRecursiveContract(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected ReferenceDataTypeStructRecursiveContract(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteCall<Tuple3<BigInteger, BigInteger, BigInteger>> getStructPersonLength() {
        final Function function = new Function(FUNC_GETSTRUCTPERSONLENGTH, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}, new TypeReference<Uint256>() {}, new TypeReference<Uint256>() {}));
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

    public static RemoteCall<ReferenceDataTypeStructRecursiveContract> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return deployRemoteCall(ReferenceDataTypeStructRecursiveContract.class, web3j, credentials, contractGasProvider, BINARY,  "");
    }

    public static RemoteCall<ReferenceDataTypeStructRecursiveContract> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return deployRemoteCall(ReferenceDataTypeStructRecursiveContract.class, web3j, transactionManager, contractGasProvider, BINARY,  "");
    }

    public static ReferenceDataTypeStructRecursiveContract load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new ReferenceDataTypeStructRecursiveContract(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static ReferenceDataTypeStructRecursiveContract load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new ReferenceDataTypeStructRecursiveContract(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
