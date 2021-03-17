package network.platon.contracts.evm.v0_8_2;

import com.platon.abi.solidity.EventEncoder;
import com.platon.abi.solidity.FunctionEncoder;
import com.platon.abi.solidity.TypeReference;
import com.platon.abi.solidity.datatypes.Address;
import com.platon.abi.solidity.datatypes.Event;
import com.platon.abi.solidity.datatypes.Function;
import com.platon.abi.solidity.datatypes.Type;
import com.platon.abi.solidity.datatypes.Utf8String;
import com.platon.abi.solidity.datatypes.generated.Uint256;
import com.platon.abi.solidity.datatypes.generated.Uint8;
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
public class ERC200513Token extends Contract {
    private static final String BINARY = "60806040526012600260006101000a81548160ff021916908360ff1602179055503480156200002d57600080fd5b5060405162001a9538038062001a95833981810160405281019062000053919062000241565b600260009054906101000a900460ff1660ff16600a62000074919062000383565b83620000819190620004c0565b600381905550600354600460003373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff168152602001908152602001600020819055508160009080519060200190620000e592919062000108565b508060019080519060200190620000fe92919062000108565b5050505062000692565b828054620001169062000561565b90600052602060002090601f0160209004810192826200013a576000855562000186565b82601f106200015557805160ff191683800117855562000186565b8280016001018555821562000186579182015b828111156200018557825182559160200191906001019062000168565b5b50905062000195919062000199565b5090565b5b80821115620001b45760008160009055506001016200019a565b5090565b6000620001cf620001c984620002f2565b620002c9565b905082815260208101848484011115620001e857600080fd5b620001f58482856200052b565b509392505050565b600082601f8301126200020f57600080fd5b815162000221848260208601620001b8565b91505092915050565b6000815190506200023b8162000678565b92915050565b6000806000606084860312156200025757600080fd5b600062000267868287016200022a565b935050602084015167ffffffffffffffff8111156200028557600080fd5b6200029386828701620001fd565b925050604084015167ffffffffffffffff811115620002b157600080fd5b620002bf86828701620001fd565b9150509250925092565b6000620002d5620002e8565b9050620002e3828262000597565b919050565b6000604051905090565b600067ffffffffffffffff82111562000310576200030f6200062b565b5b6200031b826200065a565b9050602081019050919050565b6000808291508390505b60018511156200037a57808604811115620003525762000351620005cd565b5b6001851615620003625780820291505b808102905062000372856200066b565b945062000332565b94509492505050565b6000620003908262000521565b91506200039d8362000521565b9250620003cc7fffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff8484620003d4565b905092915050565b600082620003e65760019050620004b9565b81620003f65760009050620004b9565b81600181146200040f57600281146200041a5762000450565b6001915050620004b9565b60ff8411156200042f576200042e620005cd565b5b8360020a915084821115620004495762000448620005cd565b5b50620004b9565b5060208310610133831016604e8410600b84101617156200048a5782820a905083811115620004845762000483620005cd565b5b620004b9565b62000499848484600162000328565b92509050818404811115620004b357620004b2620005cd565b5b81810290505b9392505050565b6000620004cd8262000521565b9150620004da8362000521565b9250817fffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff0483118215151615620005165762000515620005cd565b5b828202905092915050565b6000819050919050565b60005b838110156200054b5780820151818401526020810190506200052e565b838111156200055b576000848401525b50505050565b600060028204905060018216806200057a57607f821691505b60208210811415620005915762000590620005fc565b5b50919050565b620005a2826200065a565b810181811067ffffffffffffffff82111715620005c457620005c36200062b565b5b80604052505050565b7f4e487b7100000000000000000000000000000000000000000000000000000000600052601160045260246000fd5b7f4e487b7100000000000000000000000000000000000000000000000000000000600052602260045260246000fd5b7f4e487b7100000000000000000000000000000000000000000000000000000000600052604160045260246000fd5b6000601f19601f8301169050919050565b60008160011c9050919050565b620006838162000521565b81146200068f57600080fd5b50565b6113f380620006a26000396000f3fe608060405234801561001057600080fd5b506004361061010b5760003560e01c806342966c68116100a25780639b96eece116100715780639b96eece146102e4578063a9059cbb14610314578063c4e41b2214610344578063dd62ed3e14610362578063f0141d84146103925761010b565b806342966c681461023657806370a082311461026657806379cc67901461029657806395d89b41146102c65761010b565b806317d7de7c116100de57806317d7de7c146101ac57806318160ddd146101ca57806323b872dd146101e8578063313ce567146102185761010b565b806306fdde0314610110578063095ea7b31461012e5780630af4187d1461015e578063150704011461018e575b600080fd5b6101186103b0565b6040516101259190611168565b60405180910390f35b61014860048036038101906101439190611082565b61043e565b604051610155919061114d565b60405180910390f35b61017860048036038101906101739190610ff7565b6104cb565b604051610185919061118a565b60405180910390f35b610196610552565b6040516101a39190611168565b60405180910390f35b6101b46105e4565b6040516101c19190611168565b60405180910390f35b6101d2610676565b6040516101df919061118a565b60405180910390f35b61020260048036038101906101fd9190611033565b61067c565b60405161020f919061114d565b60405180910390f35b6102206107b1565b60405161022d91906111a5565b60405180910390f35b610250600480360381019061024b91906110be565b6107c4565b60405161025d919061114d565b60405180910390f35b610280600480360381019061027b9190610fce565b6108d8565b60405161028d919061118a565b60405180910390f35b6102b060048036038101906102ab9190611082565b6108f0565b6040516102bd919061114d565b60405180910390f35b6102ce610b21565b6040516102db9190611168565b60405180910390f35b6102fe60048036038101906102f99190610fce565b610baf565b60405161030b919061118a565b60405180910390f35b61032e60048036038101906103299190611082565b610bf8565b60405161033b919061114d565b60405180910390f35b61034c610c0d565b604051610359919061118a565b60405180910390f35b61037c60048036038101906103779190610ff7565b610c17565b604051610389919061118a565b60405180910390f35b61039a610c3c565b6040516103a791906111a5565b60405180910390f35b600080546103bd906112ee565b80601f01602080910402602001604051908101604052809291908181526020018280546103e9906112ee565b80156104365780601f1061040b57610100808354040283529160200191610436565b820191906000526020600020905b81548152906001019060200180831161041957829003601f168201915b505050505081565b600081600560003373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002060008573ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff168152602001908152602001600020819055506001905092915050565b6000600560008473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002060008373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002054905092915050565b606060018054610561906112ee565b80601f016020809104026020016040519081016040528092919081815260200182805461058d906112ee565b80156105da5780601f106105af576101008083540402835291602001916105da565b820191906000526020600020905b8154815290600101906020018083116105bd57829003601f168201915b5050505050905090565b6060600080546105f3906112ee565b80601f016020809104026020016040519081016040528092919081815260200182805461061f906112ee565b801561066c5780601f106106415761010080835404028352916020019161066c565b820191906000526020600020905b81548152906001019060200180831161064f57829003601f168201915b5050505050905090565b60035481565b6000600560008573ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002060003373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1681526020019081526020016000205482111561070757600080fd5b81600560008673ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002060003373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002060008282546107939190611232565b925050819055506107a5848484610c53565b50600190509392505050565b600260009054906101000a900460ff1681565b600081600460003373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002054101561081257600080fd5b81600460003373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002060008282546108619190611232565b92505081905550816003600082825461087a9190611232565b925050819055503373ffffffffffffffffffffffffffffffffffffffff167fcc16f5dbb4873280815c1ee09dbd06736cffcc184412cf7a71a0fdb75d397ca5836040516108c7919061118a565b60405180910390a260019050919050565b60046020528060005260406000206000915090505481565b600081600460008573ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002054101561093e57600080fd5b600560008473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002060003373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff168152602001908152602001600020548211156109c757600080fd5b81600460008573ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1681526020019081526020016000206000828254610a169190611232565b9250508190555081600560008573ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002060003373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1681526020019081526020016000206000828254610aa99190611232565b925050819055508160036000828254610ac29190611232565b925050819055508273ffffffffffffffffffffffffffffffffffffffff167fcc16f5dbb4873280815c1ee09dbd06736cffcc184412cf7a71a0fdb75d397ca583604051610b0f919061118a565b60405180910390a26001905092915050565b60018054610b2e906112ee565b80601f0160208091040260200160405190810160405280929190818152602001828054610b5a906112ee565b8015610ba75780601f10610b7c57610100808354040283529160200191610ba7565b820191906000526020600020905b815481529060010190602001808311610b8a57829003601f168201915b505050505081565b6000600460008373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff168152602001908152602001600020549050919050565b6000610c05338484610c53565b905092915050565b6000600354905090565b6005602052816000526040600020602052806000526040600020600091509150505481565b6000600260009054906101000a900460ff16905090565b60008073ffffffffffffffffffffffffffffffffffffffff168373ffffffffffffffffffffffffffffffffffffffff161415610c8e57600080fd5b81600460008673ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff168152602001908152602001600020541015610cda57600080fd5b600460008473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1681526020019081526020016000205482600460008673ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002054610d6591906111dc565b11610d6f57600080fd5b6000600460008573ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002054600460008773ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002054610dfb91906111dc565b905082600460008773ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1681526020019081526020016000206000828254610e4c9190611232565b9250508190555082600460008673ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1681526020019081526020016000206000828254610ea291906111dc565b925050819055508373ffffffffffffffffffffffffffffffffffffffff168573ffffffffffffffffffffffffffffffffffffffff167fddf252ad1be2c89b69c2b068fc378daa952ba7f163c4a11628f55a4df523b3ef85604051610f06919061118a565b60405180910390a380600460008673ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002054600460008873ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002054610f9991906111dc565b149150509392505050565b600081359050610fb38161138f565b92915050565b600081359050610fc8816113a6565b92915050565b600060208284031215610fe057600080fd5b6000610fee84828501610fa4565b91505092915050565b6000806040838503121561100a57600080fd5b600061101885828601610fa4565b925050602061102985828601610fa4565b9150509250929050565b60008060006060848603121561104857600080fd5b600061105686828701610fa4565b935050602061106786828701610fa4565b925050604061107886828701610fb9565b9150509250925092565b6000806040838503121561109557600080fd5b60006110a385828601610fa4565b92505060206110b485828601610fb9565b9150509250929050565b6000602082840312156110d057600080fd5b60006110de84828501610fb9565b91505092915050565b6110f081611278565b82525050565b6000611101826111c0565b61110b81856111cb565b935061111b8185602086016112bb565b6111248161137e565b840191505092915050565b611138816112a4565b82525050565b611147816112ae565b82525050565b600060208201905061116260008301846110e7565b92915050565b6000602082019050818103600083015261118281846110f6565b905092915050565b600060208201905061119f600083018461112f565b92915050565b60006020820190506111ba600083018461113e565b92915050565b600081519050919050565b600082825260208201905092915050565b60006111e7826112a4565b91506111f2836112a4565b9250827fffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff0382111561122757611226611320565b5b828201905092915050565b600061123d826112a4565b9150611248836112a4565b92508282101561125b5761125a611320565b5b828203905092915050565b600061127182611284565b9050919050565b60008115159050919050565b600073ffffffffffffffffffffffffffffffffffffffff82169050919050565b6000819050919050565b600060ff82169050919050565b60005b838110156112d95780820151818401526020810190506112be565b838111156112e8576000848401525b50505050565b6000600282049050600182168061130657607f821691505b6020821081141561131a5761131961134f565b5b50919050565b7f4e487b7100000000000000000000000000000000000000000000000000000000600052601160045260246000fd5b7f4e487b7100000000000000000000000000000000000000000000000000000000600052602260045260246000fd5b6000601f19601f8301169050919050565b61139881611266565b81146113a357600080fd5b50565b6113af816112a4565b81146113ba57600080fd5b5056fea264697066735822122056027afbdb96003433807504a61b862a4bf7cd6b64cbf906e6a9192b4a974ec464736f6c63430008020033";

    public static final String FUNC_ALLOWANCE = "allowance";

    public static final String FUNC_APPROVE = "approve";

    public static final String FUNC_BALANCEOF = "balanceOf";

    public static final String FUNC_BURN = "burn";

    public static final String FUNC_BURNFROM = "burnFrom";

    public static final String FUNC_DECIMALS = "decimals";

    public static final String FUNC_GETALLOWANCE = "getAllowance";

    public static final String FUNC_GETBALANCEOF = "getBalanceOf";

    public static final String FUNC_GETDECIMALS = "getDecimals";

    public static final String FUNC_GETNAME = "getName";

    public static final String FUNC_GETSYMBOL = "getSymbol";

    public static final String FUNC_GETTOTALSUPPLY = "getTotalSupply";

    public static final String FUNC_NAME = "name";

    public static final String FUNC_SYMBOL = "symbol";

    public static final String FUNC_TOTALSUPPLY = "totalSupply";

    public static final String FUNC_TRANSFER = "transfer";

    public static final String FUNC_TRANSFERFROM = "transferFrom";

    public static final Event BURN_EVENT = new Event("Burn", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Address>(true) {}, new TypeReference<Uint256>() {}));
    ;

    public static final Event TRANSFER_EVENT = new Event("Transfer", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Address>(true) {}, new TypeReference<Address>(true) {}, new TypeReference<Uint256>() {}));
    ;

    protected ERC200513Token(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected ERC200513Token(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static RemoteCall<ERC200513Token> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider, BigInteger initialSupply, String tokenName, String tokenSymbol) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.generated.Uint256(initialSupply), 
                new com.platon.abi.solidity.datatypes.Utf8String(tokenName), 
                new com.platon.abi.solidity.datatypes.Utf8String(tokenSymbol)));
        return deployRemoteCall(ERC200513Token.class, web3j, credentials, contractGasProvider, BINARY, encodedConstructor);
    }

    public static RemoteCall<ERC200513Token> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider, BigInteger initialSupply, String tokenName, String tokenSymbol) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.generated.Uint256(initialSupply), 
                new com.platon.abi.solidity.datatypes.Utf8String(tokenName), 
                new com.platon.abi.solidity.datatypes.Utf8String(tokenSymbol)));
        return deployRemoteCall(ERC200513Token.class, web3j, transactionManager, contractGasProvider, BINARY, encodedConstructor);
    }

    public List<BurnEventResponse> getBurnEvents(TransactionReceipt transactionReceipt) {
        List<Contract.EventValuesWithLog> valueList = extractEventParametersWithLog(BURN_EVENT, transactionReceipt);
        ArrayList<BurnEventResponse> responses = new ArrayList<BurnEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            BurnEventResponse typedResponse = new BurnEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.from = (String) eventValues.getIndexedValues().get(0).getValue();
            typedResponse.value = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Observable<BurnEventResponse> burnEventObservable(PlatonFilter filter) {
        return web3j.platonLogObservable(filter).map(new Func1<Log, BurnEventResponse>() {
            @Override
            public BurnEventResponse call(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(BURN_EVENT, log);
                BurnEventResponse typedResponse = new BurnEventResponse();
                typedResponse.log = log;
                typedResponse.from = (String) eventValues.getIndexedValues().get(0).getValue();
                typedResponse.value = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
                return typedResponse;
            }
        });
    }

    public Observable<BurnEventResponse> burnEventObservable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        PlatonFilter filter = new PlatonFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(BURN_EVENT));
        return burnEventObservable(filter);
    }

    public List<TransferEventResponse> getTransferEvents(TransactionReceipt transactionReceipt) {
        List<Contract.EventValuesWithLog> valueList = extractEventParametersWithLog(TRANSFER_EVENT, transactionReceipt);
        ArrayList<TransferEventResponse> responses = new ArrayList<TransferEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            TransferEventResponse typedResponse = new TransferEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.from = (String) eventValues.getIndexedValues().get(0).getValue();
            typedResponse.to = (String) eventValues.getIndexedValues().get(1).getValue();
            typedResponse.value = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Observable<TransferEventResponse> transferEventObservable(PlatonFilter filter) {
        return web3j.platonLogObservable(filter).map(new Func1<Log, TransferEventResponse>() {
            @Override
            public TransferEventResponse call(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(TRANSFER_EVENT, log);
                TransferEventResponse typedResponse = new TransferEventResponse();
                typedResponse.log = log;
                typedResponse.from = (String) eventValues.getIndexedValues().get(0).getValue();
                typedResponse.to = (String) eventValues.getIndexedValues().get(1).getValue();
                typedResponse.value = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
                return typedResponse;
            }
        });
    }

    public Observable<TransferEventResponse> transferEventObservable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        PlatonFilter filter = new PlatonFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(TRANSFER_EVENT));
        return transferEventObservable(filter);
    }

    public RemoteCall<BigInteger> allowance(String param0, String param1) {
        final Function function = new Function(FUNC_ALLOWANCE, 
                Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.Address(param0), 
                new com.platon.abi.solidity.datatypes.Address(param1)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<TransactionReceipt> approve(String _spender, BigInteger _value) {
        final Function function = new Function(
                FUNC_APPROVE, 
                Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.Address(_spender), 
                new com.platon.abi.solidity.datatypes.generated.Uint256(_value)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<BigInteger> balanceOf(String param0) {
        final Function function = new Function(FUNC_BALANCEOF, 
                Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.Address(param0)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<TransactionReceipt> burn(BigInteger _value) {
        final Function function = new Function(
                FUNC_BURN, 
                Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.generated.Uint256(_value)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> burnFrom(String _from, BigInteger _value) {
        final Function function = new Function(
                FUNC_BURNFROM, 
                Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.Address(_from), 
                new com.platon.abi.solidity.datatypes.generated.Uint256(_value)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<BigInteger> decimals() {
        final Function function = new Function(FUNC_DECIMALS, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint8>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<BigInteger> getAllowance(String _owner, String _spender) {
        final Function function = new Function(FUNC_GETALLOWANCE, 
                Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.Address(_owner), 
                new com.platon.abi.solidity.datatypes.Address(_spender)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<BigInteger> getBalanceOf(String _owner) {
        final Function function = new Function(FUNC_GETBALANCEOF, 
                Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.Address(_owner)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<BigInteger> getDecimals() {
        final Function function = new Function(FUNC_GETDECIMALS, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint8>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<String> getName() {
        final Function function = new Function(FUNC_GETNAME, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<String> getSymbol() {
        final Function function = new Function(FUNC_GETSYMBOL, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<BigInteger> getTotalSupply() {
        final Function function = new Function(FUNC_GETTOTALSUPPLY, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<String> name() {
        final Function function = new Function(FUNC_NAME, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<String> symbol() {
        final Function function = new Function(FUNC_SYMBOL, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<BigInteger> totalSupply() {
        final Function function = new Function(FUNC_TOTALSUPPLY, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<TransactionReceipt> transfer(String _to, BigInteger _value) {
        final Function function = new Function(
                FUNC_TRANSFER, 
                Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.Address(_to), 
                new com.platon.abi.solidity.datatypes.generated.Uint256(_value)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> transferFrom(String _from, String _to, BigInteger _value) {
        final Function function = new Function(
                FUNC_TRANSFERFROM, 
                Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.Address(_from), 
                new com.platon.abi.solidity.datatypes.Address(_to), 
                new com.platon.abi.solidity.datatypes.generated.Uint256(_value)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public static ERC200513Token load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new ERC200513Token(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static ERC200513Token load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new ERC200513Token(contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static class BurnEventResponse {
        public Log log;

        public String from;

        public BigInteger value;
    }

    public static class TransferEventResponse {
        public Log log;

        public String from;

        public String to;

        public BigInteger value;
    }
}
