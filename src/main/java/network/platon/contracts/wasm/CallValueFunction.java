package network.platon.contracts.wasm;

import com.platon.abi.wasm.WasmFunctionEncoder;
import com.platon.abi.wasm.datatypes.WasmFunction;
import com.platon.crypto.Credentials;
import com.platon.protocol.Web3j;
import com.platon.protocol.core.RemoteCall;
import com.platon.rlp.wasm.datatypes.Uint8;
import com.platon.tx.TransactionManager;
import com.platon.tx.WasmContract;
import com.platon.tx.gas.GasProvider;
import java.math.BigInteger;
import java.util.Arrays;

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://github.com/PlatONnetwork/client-sdk-java/releases">platon-web3j command line tools</a>,
 * or the com.platon.codegen.WasmFunctionWrapperGenerator in the 
 * <a href="https://github.com/PlatONnetwork/client-sdk-java/tree/master/codegen">codegen module</a> to update.
 *
 * <p>Generated with platon-web3j version 0.15.1.7.
 */
public class CallValueFunction extends WasmContract {
    private static String BINARY_0 = "0x0061736d0100000001360a60000060027f7f0060017f017f60017f0060037f7f7f006000017f60027f7f017f60037f7f7f017f60047f7f7f7f017f60017f017e02750503656e7611706c61746f6e5f63616c6c5f76616c7565000203656e760c706c61746f6e5f70616e6963000003656e7617706c61746f6e5f6765745f696e7075745f6c656e677468000503656e7610706c61746f6e5f6765745f696e707574000303656e760d706c61746f6e5f72657475726e0001031413000002080106030209030101010400070002020405017001010105030100020608017f0141c088040b073904066d656d6f72790200115f5f7761736d5f63616c6c5f63746f727300050f5f5f66756e63735f6f6e5f65786974001306696e766f6b6500060a842413040010150bee0b02087f037e230041406a220324001015100222001007220110030240200341086a20012000411c10082202280208450440200241146a2802002100200228021021010c010b200341386a2002100920022003280238200328023c100a36020c200341206a20021009410021002002027f410020032802202204450d001a410020032802242206200228020c2205490d001a200620052005417f461b210020040b2201360210200241146a2000360200200241003602080b200341206a20012000411410082200100b024002402000280204450d002000100b0240200028020022042c0000220141004e044020010d010c020b200141807f460d00200141ff0171220541b7014d0440200028020441014d04401001200028020021040b20042d00010d010c020b200541bf014b0d012000280204200141ff017141ca7e6a22014d04401001200028020021040b200120046a2d0000450d010b2000280204450d0020042d000041c001490d010b10010b2000100c2206200028020422044b04401001200028020421040b20002802002107024002400240200404404100210520072c00002200417f4a0d01027f200041ff0171220541bf014d04404100200041ff017141b801490d011a200541c97e6a0c010b4100200041ff017141f801490d001a200541897e6a0b41016a21050c010b4101210520070d00410021000c010b41002100200520066a20044b0d0020042006490d004100210120042005490d01200520076a2101200420056b20062006417f461b22004109490d0110010c010b410021010b0340200004402000417f6a210020013100002008420886842108200141016a21010c010b0b024002402008500d00418008100d20085104402002100e0c020b418508100d2008520d002002100e230041206b22002400200010002101200041206a24002001210241002100200341003602284200210820034200370320200341206a4100100f200341346a41003602002003420037022c4101210120024118744118752202417f4c04402002ad42ff01832109034020082009845045044020084238862009420888842109200041016a2100200842088821080c010b0b024020004138490d002000210103402001450d01200041016a2100200141087621010c000b000b200041016a21010b20032802282001490440200341206a2001100f0b02402002450440200341206a41800110100c010b2002417f4c04402002ad220a42ff018321094200210841002100034020082009845045044020084238862009420888842109200041016a2100200842088821080c010b0b0240200041384f0440410021022000210103402001044020014108762101200241016a21020c010b0b200241c9004f044010010b200341206a200241b77f6a41ff01711010200341206a200328022420026a1011200328022420032802206a417f6a21022000210103402001450d02200220013a0000200141087621012002417f6a21020c000b000b200341206a20004180017341ff017110100b200341206a200328022420006a1011200a42ff01832108200328022420032802206a417f6a21004200210903402008200984500d02200020083c0000200942388620084208888421082000417f6a2100200942088821090c000b000b200341206a200241ff017110100b0340024020032802302202200328022c4622040d00200241786a220028020022014504401001200028020021010b20002001417f6a220136020020010d002003200036023041002101200328022422042002417c6a28020022056b2202210003402000044020004108762100200141016a21010c010b0b200341206a4101200141016a20024138491b220620046a1011200328022020056a220020066a200020021012200241374d04402000200241406a3a00000c020b200141084d04402000200141776a3a0000200020016a210003402002450d03200020023a0000200241087621022000417f6a21000c000b000510010c020b000b0b200445044010010b200328022020032802241004200328022c2200450d01200320003602300c010b10010b1013200341406b24000b9b0101047f230041106b220124002001200036020c2000047f41b008200041086a2202411076220041b0082802006a220336020041ac0841ac08280200220420026a41076a417871220236020002400240200341107420024d044041b008200341016a360200200041016a21000c010b2000450d010b200040000d0010010b20042001410c6a4104101441086a0541000b2100200141106a240020000b730020004200370210200042ffffffff0f370208200020023602042000200136020002402003410871450d002000101620024f0d002003410471044010010c010b200042003702000b02402003411071450d002000101620024d0d0020034104710440100120000f0b200042003702000b20000b7201047f2001100c220220012802044b044010010b2001101721032000027f0240200128020022054504400c010b200220036a200128020422014b0d0020012003490d00410020012002490d011a200320056a2104200120036b20022002417f461b0c010b41000b360204200020043602000b2701017f230041206b22022400200241086a200020014114100810162100200241206a240020000b4101017f200028020445044010010b0240200028020022012d0000418101470d00200028020441014d047f100120002802000520010b2c00014100480d0010010b0bff0201037f200028020445044041000f0b2000100b41012102024020002802002c00002201417f4a0d00200141ff0171220341b7014d0440200341807f6a0f0b02400240200141ff0171220141bf014d0440024020002802042201200341c97e6a22024d047f100120002802040520010b4102490d0020002802002d00010d0010010b200241054f044010010b20002802002d000145044010010b4100210241b7012101034020012003460440200241384f0d030c0405200028020020016a41ca7e6a2d00002002410874722102200141016a21010c010b000b000b200141f7014d0440200341c07e6a0f0b024020002802042201200341897e6a22024d047f100120002802040520010b4102490d0020002802002d00010d0010010b200241054f044010010b20002802002d000145044010010b4100210241f701210103402001200346044020024138490d0305200028020020016a418a7e6a2d00002002410874722102200141016a21010c010b0b0b200241ff7d490d010b10010b20020b3901027e42a5c688a1c89ca7f94b210103402000300000220250450440200041016a2100200142b383808080207e20028521010c010b0b20010b8b0101047f230041106b22012400024002402000280204450d0020002802002d000041c001490d00200141086a2000100941012103200128020c2100034020000440200141002001280208220220022000100a22046a20024520002004497222021b3602084100200020046b20021b21002003417f6a21030c010b0b2003450d010b10010b200141106a24000b2f01017f2000280208200149044020011007200028020020002802041014210220002001360208200020023602000b0b3f01027f2000280204220241016a220320002802084b047f20002003100f20002802040520020b20002802006a20013a00002000200028020441016a3602040b0f0020002001100f200020013602040b8d0301037f024020002001460d00200120006b20026b410020024101746b4d044020002001200210141a0c010b20002001734103712103027f024020002001490440200020030d021a410021030340200120036a2105200020036a2204410371450440200220036b210241002103034020024104490d04200320046a200320056a280200360200200341046a21032002417c6a21020c000b000b20022003460d04200420052d00003a0000200341016a21030c000b000b024020030d002001417f6a21040340200020026a22034103714504402001417c6a21032000417c6a2104034020024104490d03200220046a200220036a2802003602002002417c6a21020c000b000b2002450d042003417f6a200220046a2d00003a00002002417f6a21020c000b000b2001417f6a210103402002450d03200020026a417f6a200120026a2d00003a00002002417f6a21020c000b000b200320056a2101200320046a0b210303402002450d01200320012d00003a00002002417f6a2102200341016a2103200141016a21010c000b000b0b880101037f419c08410136020041a0082802002100034020000440034041a40841a4082802002201417f6a22023602002001410148450440419c084100360200200020024102746a22004184016a280200200041046a280200110300419c08410136020041a00828020021000c010b0b41a408412036020041a008200028020022003602000c010b0b0bfc0801067f03400240200020046a2105200120046a210320022004460d002003410371450d00200520032d00003a0000200441016a21040c010b0b200220046b210602402005410371220745044003402006411049450440200020046a2203200120046a2205290200370200200341086a200541086a290200370200200441106a2104200641706a21060c010b0b027f2006410871450440200120046a2103200020046a0c010b200020046a2205200120046a2204290200370200200441086a2103200541086a0b21042006410471044020042003280200360200200341046a2103200441046a21040b20064102710440200420032f00003b0000200341026a2103200441026a21040b2006410171450d01200420032d00003a000020000f0b024020064120490d002007417f6a220741024b0d00024002400240024002400240200741016b0e020102000b2005200120046a220328020022073a0000200541016a200341016a2f00003b0000200041036a2108200220046b417d6a2106034020064111490d03200420086a2203200120046a220541046a2802002202410874200741187672360200200341046a200541086a2802002207410874200241187672360200200341086a2005410c6a28020022024108742007411876723602002003410c6a200541106a2802002207410874200241187672360200200441106a2104200641706a21060c000b000b2005200120046a220328020022073a0000200541016a200341016a2d00003a0000200041026a2108200220046b417e6a2106034020064112490d03200420086a2203200120046a220541046a2802002202411074200741107672360200200341046a200541086a2802002207411074200241107672360200200341086a2005410c6a28020022024110742007411076723602002003410c6a200541106a2802002207411074200241107672360200200441106a2104200641706a21060c000b000b2005200120046a28020022073a0000200041016a21082004417f7320026a2106034020064113490d03200420086a2203200120046a220541046a2802002202411874200741087672360200200341046a200541086a2802002207411874200241087672360200200341086a2005410c6a28020022024118742007410876723602002003410c6a200541106a2802002207411874200241087672360200200441106a2104200641706a21060c000b000b200120046a41036a2103200020046a41036a21050c020b200120046a41026a2103200020046a41026a21050c010b200120046a41016a2103200020046a41016a21050b20064110710440200520032d00003a00002005200328000136000120052003290005370005200520032f000d3b000d200520032d000f3a000f200541106a2105200341106a21030b2006410871044020052003290000370000200541086a2105200341086a21030b2006410471044020052003280000360000200541046a2105200341046a21030b20064102710440200520032f00003b0000200541026a2105200341026a21030b2006410171450d00200520032d00003a00000b20000b3501017f230041106b220041c0880436020c41a808200028020c41076a417871220036020041ac08200036020041b0083f003602000b2e01017f200028020445044041000f0b4101210120002802002c0000417f4c047f200010172000100c6a0520010b0b5b00027f027f41002000280204450d001a410020002802002c0000417f4a0d011a20002802002d0000220041bf014d04404100200041b801490d011a200041c97e6a0c010b4100200041f801490d001a200041897e6a0b41016a0b0b0b2101004180080b1a696e6974006765745f706c61746f6e5f63616c6c5f76616c7565";

    public static String BINARY = BINARY_0;

    public static final String FUNC_GET_PLATON_CALL_VALUE = "get_platon_call_value";

    protected CallValueFunction(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected CallValueFunction(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteCall<Uint8> get_platon_call_value() {
        final WasmFunction function = new WasmFunction(FUNC_GET_PLATON_CALL_VALUE, Arrays.asList(), Uint8.class);
        return executeRemoteCall(function, Uint8.class);
    }

    public static RemoteCall<CallValueFunction> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        String encodedConstructor = WasmFunctionEncoder.encodeConstructor(BINARY, Arrays.asList());
        return deployRemoteCall(CallValueFunction.class, web3j, credentials, contractGasProvider, encodedConstructor);
    }

    public static RemoteCall<CallValueFunction> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        String encodedConstructor = WasmFunctionEncoder.encodeConstructor(BINARY, Arrays.asList());
        return deployRemoteCall(CallValueFunction.class, web3j, transactionManager, contractGasProvider, encodedConstructor);
    }

    public static RemoteCall<CallValueFunction> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider, BigInteger initialVonValue) {
        String encodedConstructor = WasmFunctionEncoder.encodeConstructor(BINARY, Arrays.asList());
        return deployRemoteCall(CallValueFunction.class, web3j, credentials, contractGasProvider, encodedConstructor, initialVonValue);
    }

    public static RemoteCall<CallValueFunction> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider, BigInteger initialVonValue) {
        String encodedConstructor = WasmFunctionEncoder.encodeConstructor(BINARY, Arrays.asList());
        return deployRemoteCall(CallValueFunction.class, web3j, transactionManager, contractGasProvider, encodedConstructor, initialVonValue);
    }

    public static CallValueFunction load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new CallValueFunction(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static CallValueFunction load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new CallValueFunction(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
