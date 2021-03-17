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
    private static final String BINARY = "608060405234801561001057600080fd5b506105f9806100206000396000f3fe608060405234801561001057600080fd5b50600436106100415760003560e01c80636f10e28514610046578063eb51cc9114610064578063f40ae8d914610082575b600080fd5b61004e61009e565b60405161005b91906103cf565b60405180910390f35b61006c6100a4565b60405161007991906103ad565b60405180910390f35b61009c60048036038101906100979190610311565b610136565b005b60015481565b6060600080546100b3906104da565b80601f01602080910402602001604051908101604052809291908181526020018280546100df906104da565b801561012c5780601f106101015761010080835404028352916020019161012c565b820191906000526020600020905b81548152906001019060200180831161010f57829003601f168201915b5050505050905090565b600082519050600060606000808460208801875af48061015257fe5b3d9250508167ffffffffffffffff811115610196577f4e487b7100000000000000000000000000000000000000000000000000000000600052604160045260246000fd5b6040519080825280601f01601f1916602001820160405280156101c85781602001600182028036833780820191505090505b5090503d6000602083013e80600090805190602001906101e99291906101f1565b505050505050565b8280546101fd906104da565b90600052602060002090601f01602090048101928261021f5760008555610266565b82601f1061023857805160ff1916838001178555610266565b82800160010185558215610266579182015b8281111561026557825182559160200191906001019061024a565b5b5090506102739190610277565b5090565b5b80821115610290576000816000905550600101610278565b5090565b60006102a76102a28461040f565b6103ea565b9050828152602081018484840111156102bf57600080fd5b6102ca848285610498565b509392505050565b6000813590506102e1816105ac565b92915050565b600082601f8301126102f857600080fd5b8135610308848260208601610294565b91505092915050565b6000806040838503121561032457600080fd5b600083013567ffffffffffffffff81111561033e57600080fd5b61034a858286016102e7565b925050602061035b858286016102d2565b9150509250929050565b600061037082610440565b61037a818561044b565b935061038a8185602086016104a7565b6103938161059b565b840191505092915050565b6103a78161048e565b82525050565b600060208201905081810360008301526103c78184610365565b905092915050565b60006020820190506103e4600083018461039e565b92915050565b60006103f4610405565b9050610400828261050c565b919050565b6000604051905090565b600067ffffffffffffffff82111561042a5761042961056c565b5b6104338261059b565b9050602081019050919050565b600081519050919050565b600082825260208201905092915050565b60006104678261046e565b9050919050565b600073ffffffffffffffffffffffffffffffffffffffff82169050919050565b6000819050919050565b82818337600083830152505050565b60005b838110156104c55780820151818401526020810190506104aa565b838111156104d4576000848401525b50505050565b600060028204905060018216806104f257607f821691505b602082108114156105065761050561053d565b5b50919050565b6105158261059b565b810181811067ffffffffffffffff821117156105345761053361056c565b5b80604052505050565b7f4e487b7100000000000000000000000000000000000000000000000000000000600052602260045260246000fd5b7f4e487b7100000000000000000000000000000000000000000000000000000000600052604160045260246000fd5b6000601f19601f8301169050919050565b6105b58161045c565b81146105c057600080fd5b5056fea264697066735822122031aa0efb4b72e5c1ed8e98cb50d900caade1c1784e18c7fb35923bc39f071d3164736f6c63430008020033";

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
