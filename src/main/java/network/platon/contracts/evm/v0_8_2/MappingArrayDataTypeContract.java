package network.platon.contracts.evm.v0_8_2;

import com.platon.abi.solidity.TypeReference;
import com.platon.abi.solidity.datatypes.Function;
import com.platon.abi.solidity.datatypes.Type;
import com.platon.abi.solidity.datatypes.generated.Uint8;
import com.platon.crypto.Credentials;
import com.platon.protocol.Web3j;
import com.platon.protocol.core.RemoteCall;
import com.platon.protocol.core.methods.response.TransactionReceipt;
import com.platon.tuples.generated.Tuple4;
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
public class MappingArrayDataTypeContract extends Contract {
    private static final String BINARY = "608060405234801561001057600080fd5b5061055c806100206000396000f3fe608060405234801561001057600080fd5b50600436106100365760003560e01c80631175c0491461003b5780638e7f79f614610057575b600080fd5b61005560048036038101906100509190610437565b61008a565b005b610071600480360381019061006c919061040e565b6100af565b60405161008194939291906104bd565b60405180910390f35b6100976000868686610247565b50506100a66002868484610247565b50505050505050565b600080600080600080600281106100ef577f4e487b7100000000000000000000000000000000000000000000000000000000600052603260045260246000fd5b0160008660ff1660ff16815260200190815260200160002060009054906101000a900460ff166000600160028110610150577f4e487b7100000000000000000000000000000000000000000000000000000000600052603260045260246000fd5b0160008760ff1660ff16815260200190815260200160002060009054906101000a900460ff1660026000600281106101b1577f4e487b7100000000000000000000000000000000000000000000000000000000600052603260045260246000fd5b0160008860ff1660ff16815260200190815260200160002060009054906101000a900460ff166002600160028110610212577f4e487b7100000000000000000000000000000000000000000000000000000000600052603260045260246000fd5b0160008960ff1660ff16815260200190815260200160002060009054906101000a900460ff1693509350935093509193509193565b600080600086600060028110610286577f4e487b7100000000000000000000000000000000000000000000000000000000600052603260045260246000fd5b0160008760ff1660ff16815260200190815260200160002060009054906101000a900460ff1690506000876001600281106102ea577f4e487b7100000000000000000000000000000000000000000000000000000000600052603260045260246000fd5b0160008860ff1660ff16815260200190815260200160002060009054906101000a900460ff169050858860006002811061034d577f4e487b7100000000000000000000000000000000000000000000000000000000600052603260045260246000fd5b0160008960ff1660ff16815260200190815260200160002060006101000a81548160ff021916908360ff16021790555084886001600281106103b8577f4e487b7100000000000000000000000000000000000000000000000000000000600052603260045260246000fd5b0160008960ff1660ff16815260200190815260200160002060006101000a81548160ff021916908360ff160217905550818193509350505094509492505050565b6000813590506104088161050f565b92915050565b60006020828403121561042057600080fd5b600061042e848285016103f9565b91505092915050565b600080600080600060a0868803121561044f57600080fd5b600061045d888289016103f9565b955050602061046e888289016103f9565b945050604061047f888289016103f9565b9350506060610490888289016103f9565b92505060806104a1888289016103f9565b9150509295509295909350565b6104b781610502565b82525050565b60006080820190506104d260008301876104ae565b6104df60208301866104ae565b6104ec60408301856104ae565b6104f960608301846104ae565b95945050505050565b600060ff82169050919050565b61051881610502565b811461052357600080fd5b5056fea264697066735822122020e3ec9af1374d54a6f76c262d06c382da6dc94f00c6b747d54572265296c0a164736f6c63430008020033";

    public static final String FUNC_GETVALUEBYKEY = "getValueByKey";

    public static final String FUNC_SET = "set";

    protected MappingArrayDataTypeContract(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected MappingArrayDataTypeContract(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteCall<Tuple4<BigInteger, BigInteger, BigInteger, BigInteger>> getValueByKey(BigInteger key) {
        final Function function = new Function(FUNC_GETVALUEBYKEY, 
                Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.generated.Uint8(key)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint8>() {}, new TypeReference<Uint8>() {}, new TypeReference<Uint8>() {}, new TypeReference<Uint8>() {}));
        return new RemoteCall<Tuple4<BigInteger, BigInteger, BigInteger, BigInteger>>(
                new Callable<Tuple4<BigInteger, BigInteger, BigInteger, BigInteger>>() {
                    @Override
                    public Tuple4<BigInteger, BigInteger, BigInteger, BigInteger> call() throws Exception {
                        List<Type> results = executeCallMultipleValueReturn(function);
                        return new Tuple4<BigInteger, BigInteger, BigInteger, BigInteger>(
                                (BigInteger) results.get(0).getValue(), 
                                (BigInteger) results.get(1).getValue(), 
                                (BigInteger) results.get(2).getValue(), 
                                (BigInteger) results.get(3).getValue());
                    }
                });
    }

    public RemoteCall<TransactionReceipt> set(BigInteger key, BigInteger value_a1, BigInteger value_a2, BigInteger value_b1, BigInteger value_b2) {
        final Function function = new Function(
                FUNC_SET, 
                Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.generated.Uint8(key), 
                new com.platon.abi.solidity.datatypes.generated.Uint8(value_a1), 
                new com.platon.abi.solidity.datatypes.generated.Uint8(value_a2), 
                new com.platon.abi.solidity.datatypes.generated.Uint8(value_b1), 
                new com.platon.abi.solidity.datatypes.generated.Uint8(value_b2)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public static RemoteCall<MappingArrayDataTypeContract> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return deployRemoteCall(MappingArrayDataTypeContract.class, web3j, credentials, contractGasProvider, BINARY,  "");
    }

    public static RemoteCall<MappingArrayDataTypeContract> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return deployRemoteCall(MappingArrayDataTypeContract.class, web3j, transactionManager, contractGasProvider, BINARY,  "");
    }

    public static MappingArrayDataTypeContract load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new MappingArrayDataTypeContract(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static MappingArrayDataTypeContract load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new MappingArrayDataTypeContract(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
