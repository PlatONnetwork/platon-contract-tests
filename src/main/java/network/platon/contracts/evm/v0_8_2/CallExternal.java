package network.platon.contracts.evm.v0_8_2;

import com.platon.abi.solidity.EventEncoder;
import com.platon.abi.solidity.TypeReference;
import com.platon.abi.solidity.datatypes.Event;
import com.platon.abi.solidity.datatypes.Function;
import com.platon.abi.solidity.datatypes.Type;
import com.platon.abi.solidity.datatypes.generated.Uint256;
import com.platon.crypto.Credentials;
import com.platon.protocol.Web3j;
import com.platon.protocol.core.DefaultBlockParameter;
import com.platon.protocol.core.RemoteCall;
import com.platon.protocol.core.methods.request.PlatonFilter;
import com.platon.protocol.core.methods.response.Log;
import com.platon.protocol.core.methods.response.TransactionReceipt;
import com.platon.tx.Contract;
import com.platon.tx.TransactionManager;
import com.platon.tx.gas.GasProvider;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import rx.Observable;
import rx.functions.Func1;

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://github.com/PlatONnetwork/client-sdk-java/releases">platon-web3j command line tools</a>,
 * or the com.platon.codegen.SolidityFunctionWrapperGenerator in the 
 * <a href="https://github.com/PlatONnetwork/client-sdk-java/tree/master/codegen">codegen module</a> to update.
 *
 * <p>Generated with web3j version 0.15.1.7.
 */
public class CallExternal extends Contract {
    private static final String BINARY = "608060405234801561001057600080fd5b50610373806100206000396000f3fe60806040526004361061001e5760003560e01c8063de29278914610023575b600080fd5b61002b610041565b6040516100389190610184565b60405180910390f35b6000806040516100509061012a565b604051809103906000f08015801561006c573d6000803e3d6000fd5b5090508073ffffffffffffffffffffffffffffffffffffffff1663569c5f6d6040518163ffffffff1660e01b815260040160206040518083038186803b1580156100b557600080fd5b505afa1580156100c9573d6000803e3d6000fd5b505050506040513d601f19601f820116820180604052508101906100ed919061014c565b91507f0a9f1213b326cb97c7a18f80791661027e1cf7a53125f3d6729d0ae093bd8ad28260405161011e9190610184565b60405180910390a15090565b61017d806101c183390190565b600081519050610146816101a9565b92915050565b60006020828403121561015e57600080fd5b600061016c84828501610137565b91505092915050565b61017e8161019f565b82525050565b60006020820190506101996000830184610175565b92915050565b6000819050919050565b6101b28161019f565b81146101bd57600080fd5b5056fe608060405234801561001057600080fd5b5061015d806100206000396000f3fe608060405234801561001057600080fd5b506004361061002b5760003560e01c8063569c5f6d14610030575b600080fd5b61003861004e565b604051610045919061007d565b60405180910390f35b6000806001905060006002905080826100679190610098565b9250505090565b610077816100ee565b82525050565b6000602082019050610092600083018461006e565b92915050565b60006100a3826100ee565b91506100ae836100ee565b9250827fffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff038211156100e3576100e26100f8565b5b828201905092915050565b6000819050919050565b7f4e487b7100000000000000000000000000000000000000000000000000000000600052601160045260246000fdfea26469706673582212206d18394c5f787ef27f1e40430c9c20c30cdd5e06bc7b605083dfe24b269409e964736f6c63430008020033a2646970667358221220c98755c7acee34490d5eaf92645205a37d59bf68ae984944bf21c4cf9add816564736f6c63430008020033";

    public static final String FUNC_GETRESULT = "getResult";

    public static final Event EXTERNALCVALUE_EVENT = new Event("ExternalCValue", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
    ;

    protected CallExternal(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected CallExternal(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public List<ExternalCValueEventResponse> getExternalCValueEvents(TransactionReceipt transactionReceipt) {
        List<Contract.EventValuesWithLog> valueList = extractEventParametersWithLog(EXTERNALCVALUE_EVENT, transactionReceipt);
        ArrayList<ExternalCValueEventResponse> responses = new ArrayList<ExternalCValueEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            ExternalCValueEventResponse typedResponse = new ExternalCValueEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.value = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Observable<ExternalCValueEventResponse> externalCValueEventObservable(PlatonFilter filter) {
        return web3j.platonLogObservable(filter).map(new Func1<Log, ExternalCValueEventResponse>() {
            @Override
            public ExternalCValueEventResponse call(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(EXTERNALCVALUE_EVENT, log);
                ExternalCValueEventResponse typedResponse = new ExternalCValueEventResponse();
                typedResponse.log = log;
                typedResponse.value = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
                return typedResponse;
            }
        });
    }

    public Observable<ExternalCValueEventResponse> externalCValueEventObservable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        PlatonFilter filter = new PlatonFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(EXTERNALCVALUE_EVENT));
        return externalCValueEventObservable(filter);
    }

    public RemoteCall<TransactionReceipt> getResult(BigInteger vonValue) {
        final Function function = new Function(
                FUNC_GETRESULT, 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function, vonValue);
    }

    public static RemoteCall<CallExternal> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return deployRemoteCall(CallExternal.class, web3j, credentials, contractGasProvider, BINARY,  "");
    }

    public static RemoteCall<CallExternal> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return deployRemoteCall(CallExternal.class, web3j, transactionManager, contractGasProvider, BINARY,  "");
    }

    public static CallExternal load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new CallExternal(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static CallExternal load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new CallExternal(contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static class ExternalCValueEventResponse {
        public Log log;

        public BigInteger value;
    }
}
