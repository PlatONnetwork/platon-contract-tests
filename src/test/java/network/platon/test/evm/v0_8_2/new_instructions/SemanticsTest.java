package network.platon.test.evm.v0_8_2.new_instructions;

import com.platon.crypto.Credentials;
import com.platon.protocol.core.DefaultBlockParameterName;
import com.platon.protocol.core.methods.response.TransactionReceipt;
import com.platon.tx.RawTransactionManager;
import com.platon.tx.Transfer;
import com.platon.utils.Convert;
import network.platon.autotest.junit.annotations.DataSource;
import network.platon.autotest.junit.enums.DataSourceType;
import network.platon.contracts.evm.v0_8_2.Semantics;
import network.platon.test.evm.beforetest.ContractPrepareTest;
import network.platon.utils.DataChangeUtil;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.math.BigInteger;

public class SemanticsTest extends ContractPrepareTest {
    @Before
    public void before() {
        this.prepare();
    }

    @Test
    @DataSource(type = DataSourceType.EXCEL, file = "test.xls", sheetName = "Sheet1",
            author = "liweic", showName = "SemanticsTest-0.8.2新语法测试", sourcePrefix = "evm/0.8.2")
    public void semanticsTest() {
        try {
            Semantics semantics = Semantics.deploy(web3j, transactionManager, provider).send();
            String contractAddress = semantics.getContractAddress();

            collector.logStepPass("semantics 合约地址:" + contractAddress);
            collector.logStepPass("deploy gas used:" + semantics.getTransactionReceipt().get().getGasUsed());

            //幂运算
            BigInteger result = semantics.exponentiation(new BigInteger("3"), new BigInteger("2"), new BigInteger("1")).send();
            collector.logStepPass( "幂运算的结果是:" + result);
            collector.assertEqual(result , new BigInteger("9"));

            //bytes1
            String expectStr = "c8";
            byte[] byteResult = semantics.getBytes1().send();
            String actualStr = DataChangeUtil.bytesToHex(byteResult);
            collector.logStepPass( "actualStr:" + actualStr);
            collector.assertEqual(actualStr , expectStr);

            //address payable
            String priKey = this.generatePrivateKey();
            Credentials myCredentials = Credentials.create(priKey);
            String userAddr = myCredentials.getAddress();
            RawTransactionManager myTransactionManager = new RawTransactionManager(web3j, myCredentials);

            BigInteger payablePremoney = web3j.platonGetBalance(userAddr, DefaultBlockParameterName.LATEST).send().getBalance();
            collector.logStepPass("转账前余额：" +  payablePremoney);

            new Transfer(web3j, transactionManager).sendFunds(userAddr, new BigDecimal("100000"), Convert.Unit.KPVON, new BigInteger("1000000000"), new BigInteger("4712388")).send();
            new Transfer(web3j, transactionManager).sendFunds(contractAddress, new BigDecimal("101"), Convert.Unit.KPVON, new BigInteger("1000000000"), new BigInteger("4712388")).send();

            semantics = Semantics.load(contractAddress, web3j, myTransactionManager, provider);
            TransactionReceipt tx = semantics.addrPay(new BigInteger("1")).send();
            collector.logStepPass("交易Hash:" + tx.getTransactionHash());


            BigInteger payableAftermoney = web3j.platonGetBalance(contractAddress, DefaultBlockParameterName.LATEST).send().getBalance();
            collector.logStepPass("转账后余额：" + payableAftermoney);

            payablePremoney = web3j.platonGetBalance(userAddr, DefaultBlockParameterName.LATEST).send().getBalance();
            collector.logStepPass("转账前余额：" +  payablePremoney);

        } catch (Exception e) {
            collector.logStepFail("SemanticsTest process fail.", e.toString());
            e.printStackTrace();
        }
    }


}
