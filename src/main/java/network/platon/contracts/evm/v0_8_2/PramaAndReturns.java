package network.platon.contracts.evm.v0_8_2;

import com.platon.abi.solidity.TypeReference;
import com.platon.abi.solidity.datatypes.DynamicArray;
import com.platon.abi.solidity.datatypes.Function;
import com.platon.abi.solidity.datatypes.Type;
import com.platon.abi.solidity.datatypes.Utf8String;
import com.platon.abi.solidity.datatypes.generated.StaticArray3;
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
public class PramaAndReturns extends Contract {
    private static final String BINARY = "60806040526040518060400160405280600d81526020017f576861742773207570206d616e000000000000000000000000000000000000008152506000908051906020019061004f929190610062565b5034801561005c57600080fd5b50610166565b82805461006e90610105565b90600052602060002090601f01602090048101928261009057600085556100d7565b82601f106100a957805160ff19168380011785556100d7565b828001600101855582156100d7579182015b828111156100d65782518255916020019190600101906100bb565b5b5090506100e491906100e8565b5090565b5b808211156101015760008160009055506001016100e9565b5090565b6000600282049050600182168061011d57607f821691505b6020821081141561013157610130610137565b5b50919050565b7f4e487b7100000000000000000000000000000000000000000000000000000000600052602260045260246000fd5b61099c806101756000396000f3fe608060405234801561001057600080fd5b50600436106100885760003560e01c806386b714e21161005b57806386b714e2146101165780639e2eea0614610134578063e93314ab14610164578063f8adff321461018257610088565b80630965e1451461008d5780631aa72bf8146100bd57806354d410c8146100db5780637f0ffe31146100fa575b600080fd5b6100a760048036038101906100a29190610532565b6101b2565b6040516100b491906106e4565b60405180910390f35b6100c5610207565b6040516100d29190610736565b60405180910390f35b6100e3610299565b6040516100f19291906106ff565b60405180910390f35b610114600480360381019061010f9190610584565b610441565b005b61011e61044c565b60405161012b9190610758565b60405180910390f35b61014e60048036038101906101499190610584565b610452565b60405161015b9190610758565b60405180910390f35b61016c61045d565b6040516101799190610758565b60405180910390f35b61019c6004803603810190610197919061055b565b610467565b6040516101a99190610758565b60405180910390f35b6101ba610471565b6003826002600381106101f6577f4e487b7100000000000000000000000000000000000000000000000000000000600052603260045260246000fd5b602002018181525050819050919050565b6060600080546102169061087d565b80601f01602080910402602001604051908101604052809291908181526020018280546102429061087d565b801561028f5780601f106102645761010080835404028352916020019161028f565b820191906000526020600020905b81548152906001019060200180831161027257829003601f168201915b5050505050905090565b6060806000600367ffffffffffffffff8111156102df577f4e487b7100000000000000000000000000000000000000000000000000000000600052604160045260246000fd5b60405190808252806020026020018201604052801561030d5781602001602082028036833780820191505090505b50905060018160008151811061034c577f4e487b7100000000000000000000000000000000000000000000000000000000600052603260045260246000fd5b602002602001018181525050600281600181518110610394577f4e487b7100000000000000000000000000000000000000000000000000000000600052603260045260246000fd5b6020026020010181815250506003816002815181106103dc577f4e487b7100000000000000000000000000000000000000000000000000000000600052603260045260246000fd5b6020026020010181815250506000819050600a82600081518110610429577f4e487b7100000000000000000000000000000000000000000000000000000000600052603260045260246000fd5b60200260200101818152505081819350935050509091565b816001819055505050565b60015481565b600082905092915050565b6000600154905090565b6000819050919050565b6040518060600160405280600390602082028036833780820191505090505090565b60006104a66104a184610798565b610773565b905080828560208602820111156104bc57600080fd5b60005b858110156104ec57816104d2888261051d565b8452602084019350602083019250506001810190506104bf565b5050509392505050565b600082601f83011261050757600080fd5b6003610514848285610493565b91505092915050565b60008135905061052c8161094f565b92915050565b60006060828403121561054457600080fd5b6000610552848285016104f6565b91505092915050565b60006020828403121561056d57600080fd5b600061057b8482850161051d565b91505092915050565b6000806040838503121561059757600080fd5b60006105a58582860161051d565b92505060206105b68582860161051d565b9150509250929050565b60006105cc83836106c6565b60208301905092915050565b6105e1816107d8565b6105eb8184610813565b92506105f6826107be565b8060005b8381101561062757815161060e87826105c0565b9650610619836107f9565b9250506001810190506105fa565b505050505050565b600061063a826107e3565b610644818561081e565b935061064f836107c8565b8060005b8381101561068057815161066788826105c0565b975061067283610806565b925050600181019050610653565b5085935050505092915050565b6000610698826107ee565b6106a2818561082f565b93506106b281856020860161084a565b6106bb8161093e565b840191505092915050565b6106cf81610840565b82525050565b6106de81610840565b82525050565b60006060820190506106f960008301846105d8565b92915050565b60006040820190508181036000830152610719818561062f565b9050818103602083015261072d818461062f565b90509392505050565b60006020820190508181036000830152610750818461068d565b905092915050565b600060208201905061076d60008301846106d5565b92915050565b600061077d61078e565b905061078982826108af565b919050565b6000604051905090565b600067ffffffffffffffff8211156107b3576107b261090f565b5b602082029050919050565b6000819050919050565b6000819050602082019050919050565b600060039050919050565b600081519050919050565b600081519050919050565b6000602082019050919050565b6000602082019050919050565b600081905092915050565b600082825260208201905092915050565b600082825260208201905092915050565b6000819050919050565b60005b8381101561086857808201518184015260208101905061084d565b83811115610877576000848401525b50505050565b6000600282049050600182168061089557607f821691505b602082108114156108a9576108a86108e0565b5b50919050565b6108b88261093e565b810181811067ffffffffffffffff821117156108d7576108d661090f565b5b80604052505050565b7f4e487b7100000000000000000000000000000000000000000000000000000000600052602260045260246000fd5b7f4e487b7100000000000000000000000000000000000000000000000000000000600052604160045260246000fd5b6000601f19601f8301169050919050565b61095881610840565b811461096357600080fd5b5056fea2646970667358221220f531382ad8001282fd9943507c5aa85f8298159e0a1fad784079b93128f9753664736f6c63430008020033";

    public static final String FUNC_INPUTPARAM = "InputParam";

    public static final String FUNC_IUPUTARRAY = "IuputArray";

    public static final String FUNC_NOOUTPUT = "NoOutput";

    public static final String FUNC_OMITPARAM = "OmitParam";

    public static final String FUNC_OUPUTARRAYS = "OuputArrays";

    public static final String FUNC_OUPUTSTRING = "OuputString";

    public static final String FUNC_GETS = "getS";

    public static final String FUNC_S = "s";

    protected PramaAndReturns(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected PramaAndReturns(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteCall<BigInteger> InputParam(BigInteger a) {
        final Function function = new Function(FUNC_INPUTPARAM, 
                Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.generated.Uint256(a)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<List> IuputArray(List<BigInteger> y) {
        final Function function = new Function(FUNC_IUPUTARRAY, 
                Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.generated.StaticArray3<com.platon.abi.solidity.datatypes.generated.Uint256>(
                com.platon.abi.solidity.datatypes.generated.Uint256.class,
                        com.platon.abi.solidity.Utils.typeMap(y, com.platon.abi.solidity.datatypes.generated.Uint256.class))), 
                Arrays.<TypeReference<?>>asList(new TypeReference<StaticArray3<Uint256>>() {}));
        return new RemoteCall<List>(
                new Callable<List>() {
                    @Override
                    @SuppressWarnings("unchecked")
                    public List call() throws Exception {
                        List<Type> result = (List<Type>) executeCallSingleValueReturn(function, List.class);
                        return convertToNative(result);
                    }
                });
    }

    public RemoteCall<TransactionReceipt> NoOutput(BigInteger a, BigInteger b) {
        final Function function = new Function(
                FUNC_NOOUTPUT, 
                Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.generated.Uint256(a), 
                new com.platon.abi.solidity.datatypes.generated.Uint256(b)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<BigInteger> OmitParam(BigInteger y, BigInteger param1) {
        final Function function = new Function(FUNC_OMITPARAM, 
                Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.generated.Uint256(y), 
                new com.platon.abi.solidity.datatypes.generated.Uint256(param1)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<Tuple2<List<BigInteger>, List<BigInteger>>> OuputArrays() {
        final Function function = new Function(FUNC_OUPUTARRAYS, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<DynamicArray<Uint256>>() {}, new TypeReference<DynamicArray<Uint256>>() {}));
        return new RemoteCall<Tuple2<List<BigInteger>, List<BigInteger>>>(
                new Callable<Tuple2<List<BigInteger>, List<BigInteger>>>() {
                    @Override
                    public Tuple2<List<BigInteger>, List<BigInteger>> call() throws Exception {
                        List<Type> results = executeCallMultipleValueReturn(function);
                        return new Tuple2<List<BigInteger>, List<BigInteger>>(
                                convertToNative((List<Uint256>) results.get(0).getValue()), 
                                convertToNative((List<Uint256>) results.get(1).getValue()));
                    }
                });
    }

    public RemoteCall<String> OuputString() {
        final Function function = new Function(FUNC_OUPUTSTRING, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<BigInteger> getS() {
        final Function function = new Function(FUNC_GETS, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<BigInteger> s() {
        final Function function = new Function(FUNC_S, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public static RemoteCall<PramaAndReturns> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return deployRemoteCall(PramaAndReturns.class, web3j, credentials, contractGasProvider, BINARY,  "");
    }

    public static RemoteCall<PramaAndReturns> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return deployRemoteCall(PramaAndReturns.class, web3j, transactionManager, contractGasProvider, BINARY,  "");
    }

    public static PramaAndReturns load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new PramaAndReturns(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static PramaAndReturns load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new PramaAndReturns(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
