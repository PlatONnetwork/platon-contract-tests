package network.platon.contracts.evm.v0_8_2;

import com.platon.abi.solidity.TypeReference;
import com.platon.abi.solidity.datatypes.DynamicBytes;
import com.platon.abi.solidity.datatypes.Function;
import com.platon.abi.solidity.datatypes.Type;
import com.platon.abi.solidity.datatypes.generated.Uint256;
import com.platon.crypto.Credentials;
import com.platon.protocol.Web3j;
import com.platon.protocol.core.RemoteCall;
import com.platon.protocol.core.methods.response.TransactionReceipt;
import com.platon.tx.Contract;
import com.platon.tx.TransactionManager;
import com.platon.tx.gas.GasProvider;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://github.com/PlatONnetwork/client-sdk-java/releases">platon-web3j command line tools</a>,
 * or the com.platon.codegen.SolidityFunctionWrapperGenerator in the 
 * <a href="https://github.com/PlatONnetwork/client-sdk-java/tree/master/codegen">codegen module</a> to update.
 *
 * <p>Generated with web3j version 0.15.1.7.
 */
public class PlatonInner extends Contract {
    private static final String BINARY = "608060405234801561001057600080fd5b506105f2806100206000396000f3fe608060405234801561001057600080fd5b50600436106100415760003560e01c80636f10e28514610046578063eb51cc9114610064578063f40ae8d914610082575b600080fd5b61004e61009e565b60405161005b91906103c8565b60405180910390f35b61006c6100a4565b60405161007991906103a6565b60405180910390f35b61009c6004803603810190610097919061030a565b610136565b005b60015481565b6060600080546100b3906104d3565b80601f01602080910402602001604051908101604052809291908181526020018280546100df906104d3565b801561012c5780601f106101015761010080835404028352916020019161012c565b820191906000526020600020905b81548152906001019060200180831161010f57829003601f168201915b5050505050905090565b600082519050600060606000808460208801875af43d9250508167ffffffffffffffff81111561018f577f4e487b7100000000000000000000000000000000000000000000000000000000600052604160045260246000fd5b6040519080825280601f01601f1916602001820160405280156101c15781602001600182028036833780820191505090505b5090503d6000602083013e80600090805190602001906101e29291906101ea565b505050505050565b8280546101f6906104d3565b90600052602060002090601f016020900481019282610218576000855561025f565b82601f1061023157805160ff191683800117855561025f565b8280016001018555821561025f579182015b8281111561025e578251825591602001919060010190610243565b5b50905061026c9190610270565b5090565b5b80821115610289576000816000905550600101610271565b5090565b60006102a061029b84610408565b6103e3565b9050828152602081018484840111156102b857600080fd5b6102c3848285610491565b509392505050565b6000813590506102da816105a5565b92915050565b600082601f8301126102f157600080fd5b813561030184826020860161028d565b91505092915050565b6000806040838503121561031d57600080fd5b600083013567ffffffffffffffff81111561033757600080fd5b610343858286016102e0565b9250506020610354858286016102cb565b9150509250929050565b600061036982610439565b6103738185610444565b93506103838185602086016104a0565b61038c81610594565b840191505092915050565b6103a081610487565b82525050565b600060208201905081810360008301526103c0818461035e565b905092915050565b60006020820190506103dd6000830184610397565b92915050565b60006103ed6103fe565b90506103f98282610505565b919050565b6000604051905090565b600067ffffffffffffffff82111561042357610422610565565b5b61042c82610594565b9050602081019050919050565b600081519050919050565b600082825260208201905092915050565b600061046082610467565b9050919050565b600073ffffffffffffffffffffffffffffffffffffffff82169050919050565b6000819050919050565b82818337600083830152505050565b60005b838110156104be5780820151818401526020810190506104a3565b838111156104cd576000848401525b50505050565b600060028204905060018216806104eb57607f821691505b602082108114156104ff576104fe610536565b5b50919050565b61050e82610594565b810181811067ffffffffffffffff8211171561052d5761052c610565565b5b80604052505050565b7f4e487b7100000000000000000000000000000000000000000000000000000000600052602260045260246000fd5b7f4e487b7100000000000000000000000000000000000000000000000000000000600052604160045260246000fd5b6000601f19601f8301169050919050565b6105ae81610455565b81146105b957600080fd5b5056fea26469706673582212207be73590ae215f793d27950b19cfd88b5c047c0798eacae5ca7162ffcf5d46c264736f6c63430008020033";

    public static final String FUNC_ASSEMBLYCALLPPOS = "assemblyCallppos";

    public static final String FUNC_GETRETURNVALUE = "getReturnValue";

    public static final String FUNC_RES = "res";

    protected PlatonInner(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected PlatonInner(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteCall<TransactionReceipt> assemblyCallppos(byte[] data, String addr) {
        final Function function = new Function(
                FUNC_ASSEMBLYCALLPPOS, 
                Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.DynamicBytes(data), 
                new com.platon.abi.solidity.datatypes.Address(addr)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<byte[]> getReturnValue() {
        final Function function = new Function(FUNC_GETRETURNVALUE, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<DynamicBytes>() {}));
        return executeRemoteCallSingleValueReturn(function, byte[].class);
    }

    public RemoteCall<BigInteger> res() {
        final Function function = new Function(FUNC_RES, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public static RemoteCall<PlatonInner> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return deployRemoteCall(PlatonInner.class, web3j, credentials, contractGasProvider, BINARY,  "");
    }

    public static RemoteCall<PlatonInner> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return deployRemoteCall(PlatonInner.class, web3j, transactionManager, contractGasProvider, BINARY,  "");
    }

    public static PlatonInner load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new PlatonInner(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static PlatonInner load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new PlatonInner(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
