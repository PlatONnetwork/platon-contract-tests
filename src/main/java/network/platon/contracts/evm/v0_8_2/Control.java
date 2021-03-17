package network.platon.contracts.evm.v0_8_2;

import com.platon.abi.solidity.TypeReference;
import com.platon.abi.solidity.datatypes.Function;
import com.platon.abi.solidity.datatypes.Type;
import com.platon.abi.solidity.datatypes.Utf8String;
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
public class Control extends Contract {
    private static final String BINARY = "608060405234801561001057600080fd5b50610da9806100206000396000f3fe608060405234801561001057600080fd5b50600436106101375760003560e01c806357609889116100b85780638e418fdb1161007c5780638e418fdb146102fa578063a64be0d514610318578063b4feac7c14610336578063b87df01414610354578063c0e641fc14610372578063da193c1f1461039057610137565b80635760988914610264578063687615d71461028257806371ee5202146102a057806378aa6155146102be5780637e6b0f57146102dc57610137565b806344e24ce0116100ff57806344e24ce0146101d257806347808fc3146101ee5780634b8016b91461020a578063508242dc1461022857806356230cca1461024657610137565b80631f9c9f3c1461013c578063275ec9761461015a57806335432d3114610178578063383d49e5146101965780633f9dbcf9146101b4575b600080fd5b6101446103ae565b6040516101519190610b27565b60405180910390f35b6101626103b4565b60405161016f9190610b27565b60405180910390f35b610180610423565b60405161018d9190610b05565b60405180910390f35b61019e6104b1565b6040516101ab9190610b27565b60405180910390f35b6101bc6104b7565b6040516101c99190610b05565b60405180910390f35b6101ec60048036038101906101e79190610a94565b610545565b005b61020860048036038101906102039190610a6b565b61064a565b005b6102126106dd565b60405161021f9190610b27565b60405180910390f35b6102306106e3565b60405161023d9190610b27565b60405180910390f35b61024e6106e9565b60405161025b9190610b27565b60405180910390f35b61026c61074e565b6040516102799190610b27565b60405180910390f35b61028a610758565b6040516102979190610b27565b60405180910390f35b6102a861075e565b6040516102b59190610b05565b60405180910390f35b6102c66107f0565b6040516102d39190610b27565b60405180910390f35b6102e46107fa565b6040516102f19190610b05565b60405180910390f35b61030261088c565b60405161030f9190610b27565b60405180910390f35b6103206108ce565b60405161032d9190610b27565b60405180910390f35b61033e610936565b60405161034b9190610b27565b60405180910390f35b61035c610980565b6040516103699190610b27565b60405180910390f35b61037a61098a565b6040516103879190610b27565b60405180910390f35b610398610994565b6040516103a59190610b27565b60405180910390f35b60025481565b6000806005819055506000600190505b600a8110156104195760006005826103dc9190610c76565b14156103ed57600554915050610420565b80600560008282546103ff9190610b5e565b92505081905550808061041190610c2d565b9150506103c4565b5060055490505b90565b6000805461043090610bfb565b80601f016020809104026020016040519081016040528092919081815260200182805461045c90610bfb565b80156104a95780601f1061047e576101008083540402835291602001916104a9565b820191906000526020600020905b81548152906001019060200180831161048c57829003601f168201915b505050505081565b60035481565b600680546104c490610bfb565b80601f01602080910402602001604051908101604052809291908181526020018280546104f090610bfb565b801561053d5780601f106105125761010080835404028352916020019161053d565b820191906000526020600020905b81548152906001019060200180831161052057829003601f168201915b505050505081565b601481101561059f576040518060400160405280601381526020017f796f7520617265206120796f756e67206d616e000000000000000000000000008152506000908051906020019061059992919061099e565b50610647565b603c8110156105f9576040518060400160405280601481526020017f796f75206172652061206d6964646c65206d616e000000000000000000000000815250600090805190602001906105f392919061099e565b50610646565b6040518060400160405280601181526020017f796f75206172652061206f6c64206d616e0000000000000000000000000000008152506000908051906020019061064492919061099e565b505b5b50565b6014811361068d576040518060400160405280600c81526020017f6d6f7265207468616e20323000000000000000000000000000000000000000008152506106c4565b6040518060400160405280600c81526020017f6c657373207468616e20323000000000000000000000000000000000000000008152505b600690805190602001906106d992919061099e565b5050565b60045481565b60015481565b60008060048190555060005b600a81101561074557600060028261070d9190610c76565b141561071857610732565b806004600082825461072a9190610b5e565b925050819055505b808061073d90610c2d565b9150506106f5565b50600454905090565b6000600454905090565b60055481565b60606006805461076d90610bfb565b80601f016020809104026020016040519081016040528092919081815260200182805461079990610bfb565b80156107e65780601f106107bb576101008083540402835291602001916107e6565b820191906000526020600020905b8154815290600101906020018083116107c957829003601f168201915b5050505050905090565b6000600554905090565b60606000805461080990610bfb565b80601f016020809104026020016040519081016040528092919081815260200182805461083590610bfb565b80156108825780601f1061085757610100808354040283529160200191610882565b820191906000526020600020905b81548152906001019060200180831161086557829003601f168201915b5050505050905090565b60008060018190555060005b80600160008282546108aa9190610b5e565b92505081905550806108bb90610c2d565b9050600a81106108985760015491505090565b6000806003819055506000600190505b600a81101561092d5760006002826108f69190610c76565b14156109015761092d565b80600360008282546109139190610b5e565b92505081905550808061092590610c2d565b9150506108de565b50600354905090565b60008060028190555060005b600a81101561097757806002600082825461095d9190610b5e565b92505081905550808061096f90610c2d565b915050610942565b50600254905090565b6000600254905090565b6000600354905090565b6000600154905090565b8280546109aa90610bfb565b90600052602060002090601f0160209004810192826109cc5760008555610a13565b82601f106109e557805160ff1916838001178555610a13565b82800160010185558215610a13579182015b82811115610a125782518255916020019190600101906109f7565b5b509050610a209190610a24565b5090565b5b80821115610a3d576000816000905550600101610a25565b5090565b600081359050610a5081610d45565b92915050565b600081359050610a6581610d5c565b92915050565b600060208284031215610a7d57600080fd5b6000610a8b84828501610a41565b91505092915050565b600060208284031215610aa657600080fd5b6000610ab484828501610a56565b91505092915050565b6000610ac882610b42565b610ad28185610b4d565b9350610ae2818560208601610bc8565b610aeb81610d34565b840191505092915050565b610aff81610bbe565b82525050565b60006020820190508181036000830152610b1f8184610abd565b905092915050565b6000602082019050610b3c6000830184610af6565b92915050565b600081519050919050565b600082825260208201905092915050565b6000610b6982610bbe565b9150610b7483610bbe565b9250827fffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff03821115610ba957610ba8610ca7565b5b828201905092915050565b6000819050919050565b6000819050919050565b60005b83811015610be6578082015181840152602081019050610bcb565b83811115610bf5576000848401525b50505050565b60006002820490506001821680610c1357607f821691505b60208210811415610c2757610c26610d05565b5b50919050565b6000610c3882610bbe565b91507fffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff821415610c6b57610c6a610ca7565b5b600182019050919050565b6000610c8182610bbe565b9150610c8c83610bbe565b925082610c9c57610c9b610cd6565b5b828206905092915050565b7f4e487b7100000000000000000000000000000000000000000000000000000000600052601160045260246000fd5b7f4e487b7100000000000000000000000000000000000000000000000000000000600052601260045260246000fd5b7f4e487b7100000000000000000000000000000000000000000000000000000000600052602260045260246000fd5b6000601f19601f8301169050919050565b610d4e81610bb4565b8114610d5957600080fd5b50565b610d6581610bbe565b8114610d7057600080fd5b5056fea264697066735822122079eb83832d8b61b99e02efc3ee767f0102f3437f1a063f29bbe8051e2e0b4b7764736f6c63430008020033";

    public static final String FUNC_DOWHILECONTROL = "doWhileControl";

    public static final String FUNC_DOWHILECONTROLRESULT = "doWhileControlResult";

    public static final String FUNC_FORBREAKCONTROL = "forBreakControl";

    public static final String FUNC_FORBREAKCONTROLRESULT = "forBreakControlResult";

    public static final String FUNC_FORCONTINUECONTROL = "forContinueControl";

    public static final String FUNC_FORCONTINUECONTROLRESULT = "forContinueControlResult";

    public static final String FUNC_FORCONTROL = "forControl";

    public static final String FUNC_FORCONTROLRESULT = "forControlResult";

    public static final String FUNC_FORRETURNCONTROL = "forReturnControl";

    public static final String FUNC_FORRETURNCONTROLRESULT = "forReturnControlResult";

    public static final String FUNC_FORTHREECONTROLCONTROL = "forThreeControlControl";

    public static final String FUNC_FORTHREECONTROLCONTROLRESULT = "forThreeControlControlResult";

    public static final String FUNC_GETFORBREAKCONTROLRESULT = "getForBreakControlResult";

    public static final String FUNC_GETFORCONTINUECONTROLRESULT = "getForContinueControlResult";

    public static final String FUNC_GETFORCONTROLRESULT = "getForControlResult";

    public static final String FUNC_GETFORRETURNCONTROLRESULT = "getForReturnControlResult";

    public static final String FUNC_GETFORTHREECONTROLCONTROLRESULT = "getForThreeControlControlResult";

    public static final String FUNC_GETIFCONTROLRESULT = "getIfControlResult";

    public static final String FUNC_GETDOWHILERESULT = "getdoWhileResult";

    public static final String FUNC_IFCONTROL = "ifControl";

    public static final String FUNC_IFCONTROLRESULT = "ifControlResult";

    protected Control(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected Control(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteCall<TransactionReceipt> doWhileControl() {
        final Function function = new Function(
                FUNC_DOWHILECONTROL, 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<BigInteger> doWhileControlResult() {
        final Function function = new Function(FUNC_DOWHILECONTROLRESULT, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<TransactionReceipt> forBreakControl() {
        final Function function = new Function(
                FUNC_FORBREAKCONTROL, 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<BigInteger> forBreakControlResult() {
        final Function function = new Function(FUNC_FORBREAKCONTROLRESULT, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<TransactionReceipt> forContinueControl() {
        final Function function = new Function(
                FUNC_FORCONTINUECONTROL, 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<BigInteger> forContinueControlResult() {
        final Function function = new Function(FUNC_FORCONTINUECONTROLRESULT, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<TransactionReceipt> forControl() {
        final Function function = new Function(
                FUNC_FORCONTROL, 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<BigInteger> forControlResult() {
        final Function function = new Function(FUNC_FORCONTROLRESULT, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<TransactionReceipt> forReturnControl() {
        final Function function = new Function(
                FUNC_FORRETURNCONTROL, 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<BigInteger> forReturnControlResult() {
        final Function function = new Function(FUNC_FORRETURNCONTROLRESULT, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<TransactionReceipt> forThreeControlControl(BigInteger age) {
        final Function function = new Function(
                FUNC_FORTHREECONTROLCONTROL, 
                Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.generated.Int256(age)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<String> forThreeControlControlResult() {
        final Function function = new Function(FUNC_FORTHREECONTROLCONTROLRESULT, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<BigInteger> getForBreakControlResult() {
        final Function function = new Function(FUNC_GETFORBREAKCONTROLRESULT, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<BigInteger> getForContinueControlResult() {
        final Function function = new Function(FUNC_GETFORCONTINUECONTROLRESULT, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<BigInteger> getForControlResult() {
        final Function function = new Function(FUNC_GETFORCONTROLRESULT, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<BigInteger> getForReturnControlResult() {
        final Function function = new Function(FUNC_GETFORRETURNCONTROLRESULT, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<String> getForThreeControlControlResult() {
        final Function function = new Function(FUNC_GETFORTHREECONTROLCONTROLRESULT, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<String> getIfControlResult() {
        final Function function = new Function(FUNC_GETIFCONTROLRESULT, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<BigInteger> getdoWhileResult() {
        final Function function = new Function(FUNC_GETDOWHILERESULT, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<TransactionReceipt> ifControl(BigInteger age) {
        final Function function = new Function(
                FUNC_IFCONTROL, 
                Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.generated.Uint256(age)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<String> ifControlResult() {
        final Function function = new Function(FUNC_IFCONTROLRESULT, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public static RemoteCall<Control> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return deployRemoteCall(Control.class, web3j, credentials, contractGasProvider, BINARY,  "");
    }

    public static RemoteCall<Control> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return deployRemoteCall(Control.class, web3j, transactionManager, contractGasProvider, BINARY,  "");
    }

    public static Control load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new Control(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static Control load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new Control(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
