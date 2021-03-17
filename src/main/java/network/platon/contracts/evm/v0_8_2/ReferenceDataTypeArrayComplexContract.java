package network.platon.contracts.evm.v0_8_2;

import com.platon.abi.solidity.TypeReference;
import com.platon.abi.solidity.datatypes.Function;
import com.platon.abi.solidity.datatypes.Type;
import com.platon.abi.solidity.datatypes.generated.Uint256;
import com.platon.crypto.Credentials;
import com.platon.protocol.Web3j;
import com.platon.protocol.core.RemoteCall;
import com.platon.tx.Contract;
import com.platon.tx.TransactionManager;
import com.platon.tx.gas.GasProvider;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://github.com/PlatONnetwork/client-sdk-java/releases">platon-web3j command line tools</a>,
 * or the com.platon.codegen.SolidityFunctionWrapperGenerator in the 
 * <a href="https://github.com/PlatONnetwork/client-sdk-java/tree/master/codegen">codegen module</a> to update.
 *
 * <p>Generated with web3j version 0.15.1.7.
 */
public class ReferenceDataTypeArrayComplexContract extends Contract {
    private static final String BINARY = "60806040526040518060400160405280600160ff168152602001600260ff168152506000906002610031929190610044565b5034801561003e57600080fd5b506100b3565b828054828255906000526020600020908101928215610085579160200282015b82811115610084578251829060ff16905591602001919060010190610064565b5b5090506100929190610096565b5090565b5b808211156100af576000816000905550600101610097565b5090565b6102f7806100c26000396000f3fe608060405234801561001057600080fd5b506004361061002b5760003560e01c806310c037da14610030575b600080fd5b61004a6004803603810190610045919061017a565b610060565b60405161005791906101ce565b60405180910390f35b6000806000905060005b84849050821015610124576000829050600a8111156100895750610124565b60008686838181106100c4577f4e487b7100000000000000000000000000000000000000000000000000000000600052603260045260246000fd5b9050602002013590506103e881106100ec576001846100e391906101e9565b9350505061006a565b80836100f891906101e9565b92506101f4831061010f578294505050505061012a565b838061011a90610249565b945050505061006a565b80925050505b92915050565b60008083601f84011261014257600080fd5b8235905067ffffffffffffffff81111561015b57600080fd5b60208301915083602082028301111561017357600080fd5b9250929050565b6000806020838503121561018d57600080fd5b600083013567ffffffffffffffff8111156101a757600080fd5b6101b385828601610130565b92509250509250929050565b6101c88161023f565b82525050565b60006020820190506101e360008301846101bf565b92915050565b60006101f48261023f565b91506101ff8361023f565b9250827fffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff0382111561023457610233610292565b5b828201905092915050565b6000819050919050565b60006102548261023f565b91507fffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff82141561028757610286610292565b5b600182019050919050565b7f4e487b7100000000000000000000000000000000000000000000000000000000600052601160045260246000fdfea264697066735822122068f6b8a6bf702ed068a9a77e9264061cc2980b4c287735c2df2763330dc1388664736f6c63430008020033";

    public static final String FUNC_SUMCOMPLEXARRAY = "sumComplexArray";

    protected ReferenceDataTypeArrayComplexContract(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected ReferenceDataTypeArrayComplexContract(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteCall<BigInteger> sumComplexArray(List<BigInteger> array) {
        final Function function = new Function(FUNC_SUMCOMPLEXARRAY, 
                Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.DynamicArray<com.platon.abi.solidity.datatypes.generated.Uint256>(
                com.platon.abi.solidity.datatypes.generated.Uint256.class,
                        com.platon.abi.solidity.Utils.typeMap(array, com.platon.abi.solidity.datatypes.generated.Uint256.class))), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public static RemoteCall<ReferenceDataTypeArrayComplexContract> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return deployRemoteCall(ReferenceDataTypeArrayComplexContract.class, web3j, credentials, contractGasProvider, BINARY,  "");
    }

    public static RemoteCall<ReferenceDataTypeArrayComplexContract> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return deployRemoteCall(ReferenceDataTypeArrayComplexContract.class, web3j, transactionManager, contractGasProvider, BINARY,  "");
    }

    public static ReferenceDataTypeArrayComplexContract load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new ReferenceDataTypeArrayComplexContract(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static ReferenceDataTypeArrayComplexContract load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new ReferenceDataTypeArrayComplexContract(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
