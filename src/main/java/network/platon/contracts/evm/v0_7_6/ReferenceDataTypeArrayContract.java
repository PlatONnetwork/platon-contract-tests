package network.platon.contracts.evm.v0_7_6;

import com.platon.abi.solidity.TypeReference;
import com.platon.abi.solidity.datatypes.Function;
import com.platon.abi.solidity.datatypes.Type;
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
public class ReferenceDataTypeArrayContract extends Contract {
    private static final String BINARY = "60806040526040518060a00160405280600160ff168152602001600260ff168152602001600360ff168152602001600460ff168152602001600560ff16815250600090600561004f929190610322565b506040518060c001604052806040518060400160405280600181526020017f310000000000000000000000000000000000000000000000000000000000000081525081526020016040518060400160405280600181526020017f320000000000000000000000000000000000000000000000000000000000000081525081526020016040518060400160405280600181526020017f330000000000000000000000000000000000000000000000000000000000000081525081526020016040518060400160405280600181526020017f340000000000000000000000000000000000000000000000000000000000000081525081526020016040518060400160405280600181526020017f350000000000000000000000000000000000000000000000000000000000000081525081526020016040518060400160405280600181526020017f360000000000000000000000000000000000000000000000000000000000000081525081525060059060066101cb929190610367565b50600567ffffffffffffffff811180156101e457600080fd5b506040519080825280602002602001820160405280156102135781602001602082028036833780820191505090505b50600690805190602001906102299291906103c7565b506040518060c001604052806040518060400160405280600060ff168152602001600060ff1681525081526020016040518060400160405280600060ff168152602001600160ff1681525081526020016040518060400160405280600060ff168152602001600260ff1681525081526020016040518060400160405280600160ff168152602001600060ff1681525081526020016040518060400160405280600160ff168152602001600160ff1681525081526020016040518060400160405280600160ff168152602001600260ff16815250815250600790600661030f929190610414565b5034801561031c57600080fd5b5061061d565b8260058101928215610356579160200282015b82811115610355578251829060ff16905591602001919060010190610335565b5b509050610363919061046f565b5090565b8280548282559060005260206000209081019282156103b6579160200282015b828111156103b55782518290805190602001906103a592919061048c565b5091602001919060010190610387565b5b5090506103c3919061051a565b5090565b828054828255906000526020600020908101928215610403579160200282015b828111156104025782518255916020019190600101906103e7565b5b509050610410919061046f565b5090565b82805482825590600052602060002090810192821561045e579160200282015b8281111561045d5782518290600261044d92919061053e565b5091602001919060010190610434565b5b50905061046b9190610590565b5090565b5b80821115610488576000816000905550600101610470565b5090565b828054600181600116156101000203166002900490600052602060002090601f0160209004810192826104c25760008555610509565b82601f106104db57805160ff1916838001178555610509565b82800160010185558215610509579182015b828111156105085782518255916020019190600101906104ed565b5b509050610516919061046f565b5090565b5b8082111561053a576000818161053191906105b4565b5060010161051b565b5090565b82805482825590600052602060002090810192821561057f579160200282015b8281111561057e578251829060ff1690559160200191906001019061055e565b5b50905061058c919061046f565b5090565b5b808211156105b057600081816105a791906105fc565b50600101610591565b5090565b50805460018160011615610100020316600290046000825580601f106105da57506105f9565b601f0160209004906000526020600020908101906105f8919061046f565b5b50565b508054600082559060005260206000209081019061061a919061046f565b50565b6103d08061062c6000396000f3fe608060405234801561001057600080fd5b50600436106100625760003560e01c80630849cc99146100675780630dca60821461008557806354c73338146100bd57806357933804146100c7578063ab35ec6314610182578063c3d1f404146101c4575b600080fd5b61006f6101e9565b6040518082815260200191505060405180910390f35b6100bb6004803603604081101561009b57600080fd5b8101908080359060200190929190803590602001909291905050506101f6565b005b6100c561020d565b005b610180600480360360208110156100dd57600080fd5b81019080803590602001906401000000008111156100fa57600080fd5b82018360208201111561010c57600080fd5b8035906020019184600183028401116401000000008311171561012e57600080fd5b91908080601f016020809104026020016040519081016040528093929190818152602001838380828437600081840152601f19601f820116905080830192505050505050509192919290505050610243565b005b6101ae6004803603602081101561019857600080fd5b8101908080359060200190929190505050610282565b6040518082815260200191505060405180910390f35b6101cc610299565b604051808381526020018281526020019250505060405180910390f35b6000600580549050905090565b806000836005811061020457fe5b01819055505050565b6064600760018154811061021d57fe5b9060005260206000200160008154811061023357fe5b9060005260206000200181905550565b60058190806001815401808255809150506001900390600052602060002001600090919091909150908051906020019061027e9291906102ef565b5050565b600080826005811061029057fe5b01549050919050565b60008060076001815481106102aa57fe5b906000526020600020016000815481106102c057fe5b906000526020600020015460076000815481106102d957fe5b9060005260206000200180549050915091509091565b828054600181600116156101000203166002900490600052602060002090601f016020900481019282610325576000855561036c565b82601f1061033e57805160ff191683800117855561036c565b8280016001018555821561036c579182015b8281111561036b578251825591602001919060010190610350565b5b509050610379919061037d565b5090565b5b8082111561039657600081600090555060010161037e565b509056fea26469706673582212202d702e9124fc16f238d53d16375ceda3e3b4d3615c17fd6e28df065b3082a7f064736f6c63430007060033";

    public static final String FUNC_GETARRAY = "getArray";

    public static final String FUNC_GETARRAYLENGTH = "getArrayLength";

    public static final String FUNC_GETMULTIARRAY = "getMultiArray";

    public static final String FUNC_SETARRAY = "setArray";

    public static final String FUNC_SETARRAYPUSH = "setArrayPush";

    public static final String FUNC_SETMULTIARRAY = "setMultiArray";

    protected ReferenceDataTypeArrayContract(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected ReferenceDataTypeArrayContract(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteCall<BigInteger> getArray(BigInteger index) {
        final Function function = new Function(FUNC_GETARRAY, 
                Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.generated.Uint256(index)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<BigInteger> getArrayLength() {
        final Function function = new Function(FUNC_GETARRAYLENGTH, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<Tuple2<BigInteger, BigInteger>> getMultiArray() {
        final Function function = new Function(FUNC_GETMULTIARRAY, 
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

    public RemoteCall<TransactionReceipt> setArray(BigInteger index, BigInteger value) {
        final Function function = new Function(
                FUNC_SETARRAY, 
                Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.generated.Uint256(index), 
                new com.platon.abi.solidity.datatypes.generated.Uint256(value)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> setArrayPush(String x) {
        final Function function = new Function(
                FUNC_SETARRAYPUSH, 
                Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.Utf8String(x)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> setMultiArray() {
        final Function function = new Function(
                FUNC_SETMULTIARRAY, 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public static RemoteCall<ReferenceDataTypeArrayContract> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return deployRemoteCall(ReferenceDataTypeArrayContract.class, web3j, credentials, contractGasProvider, BINARY,  "");
    }

    public static RemoteCall<ReferenceDataTypeArrayContract> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return deployRemoteCall(ReferenceDataTypeArrayContract.class, web3j, transactionManager, contractGasProvider, BINARY,  "");
    }

    public static ReferenceDataTypeArrayContract load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new ReferenceDataTypeArrayContract(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static ReferenceDataTypeArrayContract load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new ReferenceDataTypeArrayContract(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
