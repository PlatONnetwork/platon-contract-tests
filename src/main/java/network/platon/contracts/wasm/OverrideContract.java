package network.platon.contracts.wasm;

import com.platon.abi.wasm.WasmFunctionEncoder;
import com.platon.abi.wasm.datatypes.WasmFunction;
import com.platon.crypto.Credentials;
import com.platon.protocol.Web3j;
import com.platon.protocol.core.RemoteCall;
import com.platon.rlp.wasm.datatypes.Uint32;
import com.platon.rlp.wasm.datatypes.Uint64;
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
public class OverrideContract extends WasmContract {
    private static String BINARY_0 = "0x0061736d0100000001430c60017f017f60000060027f7f0060017f0060037f7f7f0060017f017e60047f7f7f7f006000017f60027f7f017f60037f7f7f017f60047f7f7f7f017f60027f7e017f025d0403656e760c706c61746f6e5f70616e6963000103656e7617706c61746f6e5f6765745f696e7075745f6c656e677468000703656e7610706c61746f6e5f6765745f696e707574000303656e760d706c61746f6e5f72657475726e0002031918010b01000a040505000202020401030002080900010000060405017001020205030100020608017f0141c088040b073904066d656d6f72790200115f5f7761736d5f63616c6c5f63746f727300040f5f5f66756e63735f6f6e5f65786974001106696e766f6b6500060907010041010b01170a8d2618040010180b2d002001427f7c2201420156044041000f0b2001a741016b0440200020002802002802001100000f0b4190ce000bc90702067f027e230041406a22012400101810012200100722021002200141286a200120022000411c100822004100100902400240200141286a100a2206500d00418008100b20065104402000100c4101460d020c010b418508100b2006520d002000100c410247044010000b41012102200141286a200041011009200141286a100a2106200142818080801037021c2001419808360218200141186a20061005210441002100200141003602304200210620014200370328200141286a4100100d2001413c6a41003602002001420037023420044180014f04402004ad2107034020062007845045044020064238862007420888842107200041016a2100200642088821060c010b0b024020004138490d002000210203402002450d01200041016a2100200241087621020c000b000b200041016a21020b20012802302002490440200141286a2002100d0b02402004450440200141286a418001100e0c010b20044180014f04402004ad21074200210641002100034020062007845045044020064238862007420888842107200041016a2100200642088821060c010b0b0240200041384f04402000210203402002044020024108762102200341016a21030c010b0b200341c9004f044010000b200141286a200341b77f6a41ff0171100e200141286a200128022c20036a100f200128022c20012802286a417f6a21032000210203402002450d02200320023a0000200241087621022003417f6a21030c000b000b200141286a20004180017341ff0171100e0b200141286a200128022c20006a100f200128022c20012802286a417f6a21002004ad21064200210703402006200784500d02200020063c0000200742388620064208888421062000417f6a2100200742088821070c000b000b200141286a200441ff0171100e0b034002402001280238220320012802344622040d00200341786a220028020022024504401000200028020021020b20002002417f6a220236020020020d002001200036023841002102200128022c22042003417c6a28020022056b2203210003402000044020004108762100200241016a21020c010b0b200141286a4101200241016a20034138491b220020046a100f2000200128022820056a22006a200020031010200341374d04402000200341406a3a00000c020b200241084d04402000200241776a3a0000200020026a210003402003450d03200020033a0000200341087621032000417f6a21000c000b000510000c020b000b0b200445044010000b2001280228200128022c100320012802342200450d01200120003602380c010b10000b1011200141406b24000b9b0101047f230041106b220124002001200036020c2000047f41b008200041086a2202411076220041b0082802006a220336020041ac0841ac08280200220420026a41076a417871220236020002400240200341107420024d044041b008200341016a360200200041016a21000c010b2000450d010b200040000d0010000b20042001410c6a4104101641086a0541000b2100200141106a240020000b730020004200370210200042ffffffff0f370208200020023602042000200136020002402003410871450d002000101920024f0d002003410471044010000c010b200042003702000b02402003411071450d002000101920024d0d0020034104710440100020000f0b200042003702000b20000bc90202067f017e230041106b220324002001280208220520024b0440200341086a2001101420012003280208200328020c101536020c200320011014410021052001027f410020032802002207450d001a410020032802042208200128020c2206490d001a200820062006417f461b210420070b360210200141146a2004360200200141003602080b200141106a210603402001280214210402402005200249044020040d01410021040b200020062802002004411410081a200341106a24000f0b20032001101441002104027f410020032802002205450d001a410020032802042208200128020c2207490d001a200820076b2104200520076a0b21052001200436021420012005360210200320064100200520041015101b2001200329030022093702102001200128020c2009422088a76a36020c2001200128020841016a22053602080c000b000bad0302057f017e20001012024002402000280204450d00200010120240200028020022012c0000220241004e044020020d010c020b200241807f460d00200241ff0171220341b7014d0440200028020441014d04401000200028020021010b20012d00010d010c020b200341bf014b0d012000280204200241ff017141ca7e6a22024d04401000200028020021010b200120026a2d0000450d010b2000280204450d0020012d000041c001490d010b10000b200010132204200028020422014b04401000200028020421010b20002802002105024002400240200104404100210320052c00002200417f4a0d01027f200041ff0171220341bf014d04404100200041ff017141b801490d011a200341c97e6a0c010b4100200041ff017141f801490d001a200341897e6a0b41016a21030c010b4101210320050d00410021000c010b41002100200320046a20014b0d0020012004490d004100210220012003490d01200320056a2102200120036b20042004417f461b22004109490d0110000c010b410021020b0340200004402000417f6a210020023100002006420886842106200241016a21020c010b0b20060b3901027e42a5c688a1c89ca7f94b210103402000300000220250450440200041016a2100200142b383808080207e20028521010c010b0b20010b800101047f230041106b2201240002402000280204450d0020002802002d000041c001490d00200141086a20001014200128020c210003402000450d01200141002001280208220320032000101522046a20034520002004497222031b3602084100200020046b20031b2100200241016a21020c000b000b200141106a240020020b2f01017f2000280208200149044020011007200028020020002802041016210220002001360208200020023602000b0b3f01027f2000280204220241016a220320002802084b047f20002003100d20002802040520020b20002802006a20013a00002000200028020441016a3602040b0f0020002001100d200020013602040b8d0301037f024020002001460d00200120006b20026b410020024101746b4d044020002001200210161a0c010b20002001734103712103027f024020002001490440200020030d021a410021030340200120036a2105200020036a2204410371450440200220036b210241002103034020024104490d04200320046a200320056a280200360200200341046a21032002417c6a21020c000b000b20022003460d04200420052d00003a0000200341016a21030c000b000b024020030d002001417f6a21040340200020026a22034103714504402001417c6a21032000417c6a2104034020024104490d03200220046a200220036a2802003602002002417c6a21020c000b000b2002450d042003417f6a200220046a2d00003a00002002417f6a21020c000b000b2001417f6a210103402002450d03200020026a417f6a200120026a2d00003a00002002417f6a21020c000b000b200320056a2101200320046a0b210303402002450d01200320012d00003a00002002417f6a2102200341016a2103200141016a21010c000b000b0b880101037f419c08410136020041a0082802002100034020000440034041a40841a4082802002201417f6a22023602002001410148450440419c084100360200200020024102746a22004184016a280200200041046a280200110300419c08410136020041a00828020021000c010b0b41a408412036020041a008200028020022003602000c010b0b0b4101017f200028020445044010000b0240200028020022012d0000418101470d00200028020441014d047f100020002802000520010b2c00014100480d0010000b0bff0201037f200028020445044041000f0b2000101241012102024020002802002c00002201417f4a0d00200141ff0171220341b7014d0440200341807f6a0f0b02400240200141ff0171220141bf014d0440024020002802042201200341c97e6a22024d047f100020002802040520010b4102490d0020002802002d00010d0010000b200241054f044010000b20002802002d000145044010000b4100210241b7012101034020012003460440200241384f0d030c0405200028020020016a41ca7e6a2d00002002410874722102200141016a21010c010b000b000b200141f7014d0440200341c07e6a0f0b024020002802042201200341897e6a22024d047f100020002802040520010b4102490d0020002802002d00010d0010000b200241054f044010000b20002802002d000145044010000b4100210241f701210103402001200346044020024138490d0305200028020020016a418a7e6a2d00002002410874722102200141016a21010c010b0b0b200241ff7d490d010b10000b20020b2101017f20011013220220012802044b044010000b200020012001101a2002101b0b2701017f230041206b22022400200241086a200020014114100810192100200241206a240020000bfc0801067f03400240200020046a2105200120046a210320022004460d002003410371450d00200520032d00003a0000200441016a21040c010b0b200220046b210602402005410371220745044003402006411049450440200020046a2203200120046a2205290200370200200341086a200541086a290200370200200441106a2104200641706a21060c010b0b027f2006410871450440200120046a2103200020046a0c010b200020046a2205200120046a2204290200370200200441086a2103200541086a0b21042006410471044020042003280200360200200341046a2103200441046a21040b20064102710440200420032f00003b0000200341026a2103200441026a21040b2006410171450d01200420032d00003a000020000f0b024020064120490d002007417f6a220741024b0d00024002400240024002400240200741016b0e020102000b2005200120046a220328020022073a0000200541016a200341016a2f00003b0000200041036a2108200220046b417d6a2106034020064111490d03200420086a2203200120046a220541046a2802002202410874200741187672360200200341046a200541086a2802002207410874200241187672360200200341086a2005410c6a28020022024108742007411876723602002003410c6a200541106a2802002207410874200241187672360200200441106a2104200641706a21060c000b000b2005200120046a220328020022073a0000200541016a200341016a2d00003a0000200041026a2108200220046b417e6a2106034020064112490d03200420086a2203200120046a220541046a2802002202411074200741107672360200200341046a200541086a2802002207411074200241107672360200200341086a2005410c6a28020022024110742007411076723602002003410c6a200541106a2802002207411074200241107672360200200441106a2104200641706a21060c000b000b2005200120046a28020022073a0000200041016a21082004417f7320026a2106034020064113490d03200420086a2203200120046a220541046a2802002202411874200741087672360200200341046a200541086a2802002207411874200241087672360200200341086a2005410c6a28020022024118742007410876723602002003410c6a200541106a2802002207411874200241087672360200200441106a2104200641706a21060c000b000b200120046a41036a2103200020046a41036a21050c020b200120046a41026a2103200020046a41026a21050c010b200120046a41016a2103200020046a41016a21050b20064110710440200520032d00003a00002005200328000136000120052003290005370005200520032f000d3b000d200520032d000f3a000f200541106a2105200341106a21030b2006410871044020052003290000370000200541086a2105200341086a21030b2006410471044020052003280000360000200541046a2105200341046a21030b20064102710440200520032f00003b0000200541026a2105200341026a21030b2006410171450d00200520032d00003a00000b20000b050041e4000b3501017f230041106b220041c0880436020c41a808200028020c41076a417871220036020041ac08200036020041b0083f003602000b2e01017f200028020445044041000f0b4101210120002802002c0000417f4c047f2000101a200010136a0520010b0b5b00027f027f41002000280204450d001a410020002802002c0000417f4a0d011a20002802002d0000220041bf014d04404100200041b801490d011a200041c97e6a0c010b4100200041f801490d001a200041897e6a0b41016a0b0b5b01027f2000027f0240200128020022054504400c010b200220036a200128020422014b0d0020012002490d00410020012003490d011a200220056a2104200120026b20032003417f461b0c010b41000b360204200020043602000b0b1a02004180080b0c696e69740067657441726561004198080b0101";

    public static String BINARY = BINARY_0;

    public static final String FUNC_GETAREA = "getArea";

    protected OverrideContract(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected OverrideContract(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteCall<Uint32> getArea(Uint64 input) {
        final WasmFunction function = new WasmFunction(FUNC_GETAREA, Arrays.asList(input), Uint32.class);
        return executeRemoteCall(function, Uint32.class);
    }

    public static RemoteCall<OverrideContract> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        String encodedConstructor = WasmFunctionEncoder.encodeConstructor(BINARY, Arrays.asList());
        return deployRemoteCall(OverrideContract.class, web3j, credentials, contractGasProvider, encodedConstructor);
    }

    public static RemoteCall<OverrideContract> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        String encodedConstructor = WasmFunctionEncoder.encodeConstructor(BINARY, Arrays.asList());
        return deployRemoteCall(OverrideContract.class, web3j, transactionManager, contractGasProvider, encodedConstructor);
    }

    public static RemoteCall<OverrideContract> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider, BigInteger initialVonValue) {
        String encodedConstructor = WasmFunctionEncoder.encodeConstructor(BINARY, Arrays.asList());
        return deployRemoteCall(OverrideContract.class, web3j, credentials, contractGasProvider, encodedConstructor, initialVonValue);
    }

    public static RemoteCall<OverrideContract> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider, BigInteger initialVonValue) {
        String encodedConstructor = WasmFunctionEncoder.encodeConstructor(BINARY, Arrays.asList());
        return deployRemoteCall(OverrideContract.class, web3j, transactionManager, contractGasProvider, encodedConstructor, initialVonValue);
    }

    public static OverrideContract load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new OverrideContract(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static OverrideContract load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new OverrideContract(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
