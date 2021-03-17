package network.platon.contracts.evm.v0_8_2;

import com.platon.abi.solidity.TypeReference;
import com.platon.abi.solidity.datatypes.Address;
import com.platon.abi.solidity.datatypes.DynamicBytes;
import com.platon.abi.solidity.datatypes.Function;
import com.platon.abi.solidity.datatypes.Type;
import com.platon.abi.solidity.datatypes.generated.Bytes32;
import com.platon.abi.solidity.datatypes.generated.Bytes4;
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
public class BlockTransactionPropertiesFunctions extends Contract {
    private static final String BINARY = "608060405234801561001057600080fd5b5061067c806100206000396000f3fe6080604052600436106100dd5760003560e01c8063a16963b31161007f578063d12d910211610059578063d12d910214610283578063df1f29ee146102ae578063e9413d38146102d9578063edb4b86514610316576100dd565b8063a16963b314610202578063ab70fd691461022d578063bbe4fd5014610258576100dd565b80633bc5de30116100bb5780633bc5de301461015657806342cbb15c146101815780635e01eb5a146101ac578063796b89b9146101d7576100dd565b806312e05dd1146100e2578063209652551461010d5780632df8e9491461012b575b600080fd5b3480156100ee57600080fd5b506100f7610341565b6040516101049190610542565b60405180910390f35b610115610349565b6040516101229190610542565b60405180910390f35b34801561013757600080fd5b50610140610351565b60405161014d91906104cf565b60405180910390f35b34801561016257600080fd5b5061016b610359565b6040516101789190610520565b60405180910390f35b34801561018d57600080fd5b506101966103a6565b6040516101a39190610542565b60405180910390f35b3480156101b857600080fd5b506101c16103ae565b6040516101ce91906104cf565b60405180910390f35b3480156101e357600080fd5b506101ec6103b6565b6040516101f99190610542565b60405180910390f35b34801561020e57600080fd5b506102176103be565b6040516102249190610542565b60405180910390f35b34801561023957600080fd5b506102426103c6565b60405161024f9190610542565b60405180910390f35b34801561026457600080fd5b5061026d6103ce565b60405161027a9190610542565b60405180910390f35b34801561028f57600080fd5b506102986103d6565b6040516102a59190610505565b60405180910390f35b3480156102ba57600080fd5b506102c3610401565b6040516102d091906104cf565b60405180910390f35b3480156102e557600080fd5b5061030060048036038101906102fb9190610431565b610409565b60405161030d91906104ea565b60405180910390f35b34801561032257600080fd5b5061032b610414565b6040516103389190610542565b60405180910390f35b600044905090565b600034905090565b600041905090565b60606000368080601f016020809104026020016040519081016040528093929190818152602001838380828437600081840152601f19601f82011690508083019250505050505050905090565b600043905090565b600033905090565b600042905090565b600045905090565b60003a905090565b600042905090565b600080357fffffffff0000000000000000000000000000000000000000000000000000000016905090565b600032905090565b600081409050919050565b60005a905090565b60008135905061042b8161062f565b92915050565b60006020828403121561044357600080fd5b60006104518482850161041c565b91505092915050565b61046381610579565b82525050565b6104728161058b565b82525050565b61048181610595565b82525050565b60006104928261055d565b61049c8185610568565b93506104ac8185602086016105eb565b6104b58161061e565b840191505092915050565b6104c9816105e1565b82525050565b60006020820190506104e4600083018461045a565b92915050565b60006020820190506104ff6000830184610469565b92915050565b600060208201905061051a6000830184610478565b92915050565b6000602082019050818103600083015261053a8184610487565b905092915050565b600060208201905061055760008301846104c0565b92915050565b600081519050919050565b600082825260208201905092915050565b6000610584826105c1565b9050919050565b6000819050919050565b60007fffffffff0000000000000000000000000000000000000000000000000000000082169050919050565b600073ffffffffffffffffffffffffffffffffffffffff82169050919050565b6000819050919050565b60005b838110156106095780820151818401526020810190506105ee565b83811115610618576000848401525b50505050565b6000601f19601f8301169050919050565b610638816105e1565b811461064357600080fd5b5056fea26469706673582212206326eb27f6ca135b41afcb4632d445e2c329fc0a24fac10cba2700c40c6d110964736f6c63430008020033";

    public static final String FUNC_GETBLOCKCOINBASE = "getBlockCoinbase";

    public static final String FUNC_GETBLOCKDIFFICULTY = "getBlockDifficulty";

    public static final String FUNC_GETBLOCKNUMBER = "getBlockNumber";

    public static final String FUNC_GETBLOCKTIMESTAMP = "getBlockTimestamp";

    public static final String FUNC_GETBLOCKHASH = "getBlockhash";

    public static final String FUNC_GETDATA = "getData";

    public static final String FUNC_GETGASLEFT = "getGasleft";

    public static final String FUNC_GETGASLIMIT = "getGaslimit";

    public static final String FUNC_GETGASPRICE = "getGasprice";

    public static final String FUNC_GETNOW = "getNow";

    public static final String FUNC_GETORIGIN = "getOrigin";

    public static final String FUNC_GETSENDER = "getSender";

    public static final String FUNC_GETSIG = "getSig";

    public static final String FUNC_GETVALUE = "getValue";

    protected BlockTransactionPropertiesFunctions(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected BlockTransactionPropertiesFunctions(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteCall<String> getBlockCoinbase() {
        final Function function = new Function(FUNC_GETBLOCKCOINBASE, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<BigInteger> getBlockDifficulty() {
        final Function function = new Function(FUNC_GETBLOCKDIFFICULTY, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<BigInteger> getBlockNumber() {
        final Function function = new Function(FUNC_GETBLOCKNUMBER, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<BigInteger> getBlockTimestamp() {
        final Function function = new Function(FUNC_GETBLOCKTIMESTAMP, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<byte[]> getBlockhash(BigInteger blockNumber) {
        final Function function = new Function(FUNC_GETBLOCKHASH, 
                Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.generated.Uint256(blockNumber)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bytes32>() {}));
        return executeRemoteCallSingleValueReturn(function, byte[].class);
    }

    public RemoteCall<byte[]> getData() {
        final Function function = new Function(FUNC_GETDATA, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<DynamicBytes>() {}));
        return executeRemoteCallSingleValueReturn(function, byte[].class);
    }

    public RemoteCall<BigInteger> getGasleft() {
        final Function function = new Function(FUNC_GETGASLEFT, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<BigInteger> getGaslimit() {
        final Function function = new Function(FUNC_GETGASLIMIT, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<BigInteger> getGasprice() {
        final Function function = new Function(FUNC_GETGASPRICE, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<BigInteger> getNow() {
        final Function function = new Function(FUNC_GETNOW, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<String> getOrigin() {
        final Function function = new Function(FUNC_GETORIGIN, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<String> getSender() {
        final Function function = new Function(FUNC_GETSENDER, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<byte[]> getSig() {
        final Function function = new Function(FUNC_GETSIG, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bytes4>() {}));
        return executeRemoteCallSingleValueReturn(function, byte[].class);
    }

    public RemoteCall<TransactionReceipt> getValue(BigInteger vonValue) {
        final Function function = new Function(
                FUNC_GETVALUE, 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function, vonValue);
    }

    public static RemoteCall<BlockTransactionPropertiesFunctions> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return deployRemoteCall(BlockTransactionPropertiesFunctions.class, web3j, credentials, contractGasProvider, BINARY,  "");
    }

    public static RemoteCall<BlockTransactionPropertiesFunctions> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return deployRemoteCall(BlockTransactionPropertiesFunctions.class, web3j, transactionManager, contractGasProvider, BINARY,  "");
    }

    public static BlockTransactionPropertiesFunctions load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new BlockTransactionPropertiesFunctions(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static BlockTransactionPropertiesFunctions load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new BlockTransactionPropertiesFunctions(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
