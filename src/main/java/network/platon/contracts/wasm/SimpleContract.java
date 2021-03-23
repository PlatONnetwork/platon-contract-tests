package network.platon.contracts.wasm;

import com.platon.abi.wasm.WasmFunctionEncoder;
import com.platon.abi.wasm.datatypes.WasmFunction;
import com.platon.crypto.Credentials;
import com.platon.protocol.Web3j;
import com.platon.protocol.core.RemoteCall;
import com.platon.protocol.core.methods.response.TransactionReceipt;
import com.platon.rlp.wasm.datatypes.Uint64;
import com.platon.rlp.wasm.datatypes.WasmAddress;
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
public class SimpleContract extends WasmContract {
    private static String BINARY_0 = "0x0061736d0100000001470d60027f7f0060017f017f60017f0060000060027f7f017f60037f7f7f0060047f7f7f7f0060037f7f7f017f60047f7f7f7f017f60017f017e60027f7e006000017f60017e017f02a9010703656e760c706c61746f6e5f70616e6963000303656e7617706c61746f6e5f6765745f696e7075745f6c656e677468000b03656e7610706c61746f6e5f6765745f696e707574000203656e7617706c61746f6e5f6765745f73746174655f6c656e677468000403656e7610706c61746f6e5f6765745f7374617465000803656e7610706c61746f6e5f7365745f7374617465000603656e760d706c61746f6e5f72657475726e0000032b2a0303010705090902010201010c000a0100010403080200000100000400020000020701010305010106000405017001010105030100020608017f0141c088040b073904066d656d6f72790200115f5f7761736d5f63616c6c5f63746f727300070f5f5f66756e63735f6f6e5f65786974001a06696e766f6b6500080ad83d2a0400102b0bd30502057f027e23004190026b22002400102b10012201100922021002200041c8006a200020022001100a22014100100b02400240200041c8006a100c2205500d00418008100d20055104402001100e200041c8006a100f10100c020b418508100d200551044020011011410247044010000b200041c8006a20014101100b200041c8006a100c2105200041c8006a100f22012005370310200110100c020b418908100d20055104402001100e200041c8006a100f22022903102105200041c8016a10122201200510131014200120051015200128020c200141106a28020047044010000b200128020020012802041006200128020c22030440200120033602100b200210100c020b418d08100d2005510440200041c8016a1016210220011011410247044010000b200041c8006a20014101100b200041c8006a20021017200041c8006a100f2101200041286a200041d8016a2802002202360200200041206a200041d0016a2903002205370300200020002903c8012206370318200141386a2006370300200141406b2005370300200141c8006a2002360200200110100c020b419908100d2005520d002001100e200041a8016a2201200041c8006a100f220241c8006a280000360200200041a0016a2203200241406b2900003703002000200241386a29000037039801200041c8016a1012220420004198016a10181014200041c0016a20012802002201360200200041b8016a20032903002205370300200020002903980122063703b001200041e8016a2005370300200041f0016a2001360200200041206a2005370300200041286a2001360200200020063703e0012000200637031820004188026a200136020020004180026a2005370300200020063703f8012004200041f8016a1019220128020c200141106a28020047044010000b200128020020012802041006200128020c22030440200120033602100b200210100c010b10000b101a20004190026a24000b9b0101047f230041106b220124002001200036020c2000047f41bc08200041086a2202411076220041bc082802006a220336020041b80841b808280200220420026a41076a417871220236020002400240200341107420024d044041bc08200341016a360200200041016a21000c010b2000450d010b200040000d0010000b20042001410c6a4104102841086a0541000b2100200141106a240020000b0c00200020012002411c101b0bc90202067f017e230041106b220324002001280208220520024b0440200341086a2001102120012003280208200328020c102236020c200320011021410021052001027f410020032802002207450d001a410020032802042208200128020c2206490d001a200820062006417f461b210420070b360210200141146a2004360200200141003602080b200141106a210603402001280214210402402005200249044020040d01410021040b2000200628020020044114101b1a200341106a24000f0b20032001102141002104027f410020032802002205450d001a410020032802042208200128020c2207490d001a200820076b2104200520076a0b21052001200436021420012005360210200320064100200520041022102f2001200329030022093702102001200128020c2009422088a76a36020c2001200128020841016a22053602080c000b000b870202047f017e230041106b220324002000101c024002402000280204450d002000101c0240200028020022022c0000220141004e044020010d010c020b200141807f460d00200141ff0171220441b7014d0440200028020441014d04401000200028020021020b20022d00010d010c020b200441bf014b0d012000280204200141ff017141ca7e6a22014d04401000200028020021020b200120026a2d0000450d010b2000280204450d0020022d000041c001490d010b10000b200341086a2000101d200328020c220041094f044010000b200328020821010340200004402000417f6a210020013100002005420886842105200141016a21010c010b0b200341106a240020050b3901027e42a5c688a1c89ca7f94b210103402000300000220250450440200041016a2100200142b383808080207e20028521010c010b0b20010b0e0020001011410147044010000b0bef0301087f230041406a22022400200042d1f0fad48ae09ad34537030820004200370300200241286a1012220320002903081015200328020c200341106a28020047044010000b02402003280200220620032802042208100322054504400c010b2002410036022020024200370318200241186a2005101e2006200820022802182201200228021c220720016b1004417f47044020002002200141016a20072001417f736a100a100c370310200521040b2001450d002002200136021c0b200328020c22010440200320013602100b2004450440200020002903003703100b200041186a220610161a200041306a220142dda4afedfcbbf09c977f370300200041386a10162104200241286a1012220320012903001015200328020c200341106a28020047044010000b0240200328020022072003280204220110032208450440410021050c010b410021052002410036022020024200370318200241186a2008101e2007200120022802182201200228021c220720016b1004417f4704402002200141016a20072001417f736a100a20041017200821050b2001450d002002200136021c0b200328020c22010440200320013602100b200545044020042006290300370300200441106a200641106a280200360200200441086a200641086a2903003703000b200241406b240020000b9e0502087f027e230041a0016b2203240020034188016a10122202200041306a220129030010131014200220012903001015200041386a2101200228020c200241106a28020047044010000b2002280204210720022802002108200341f0006a101221052001101821062005200341186a101f220410202005200620042802046a20042802006b1014200341106a200141106a2800002206360200200341086a200141086a290000220937030020032001290000220a370300200341306a2009370300200341386a2006360200200341c8006a2009370300200341d0006a20063602002003200a3703282003200a370340200341e8006a2006360200200341e0006a20093703002003200a37035802402005200341d8006a1019220128020c200141106a280200460440200141046a2105200128020021060c010b200141046a2105100020012802002106200128020c2001280210460d0010000b20082007200620052802001005200428020022050440200420053602040b200128020c22040440200120043602100b200228020c22010440200220013602100b20034188016a10122201200029030810131014200120002903081015200128020c200141106a28020047044010000b2001280204210520012802002106200341f0006a101221022000290310101321072002200341d8006a101f220410202002200720042802046a20042802006b10142002200029031010150240200228020c200241106a280200460440200241046a2107200228020021080c010b200241046a2107100020022802002108200228020c2002280210460d0010000b20062005200820072802001005200428020022050440200420053602040b200228020c22040440200220043602100b200128020c22020440200120023602100b200341a0016a24000b800101047f230041106b2201240002402000280204450d0020002802002d000041c001490d00200141086a20001021200128020c210003402000450d01200141002001280208220320032000102222046a20034520002004497222031b3602084100200020046b20031b2100200241016a21020c000b000b200141106a240020020b29002000410036020820004200370200200041001023200041146a41003602002000420037020c20000bb00102037f017e230041206b22012400200141186a4100360200200141106a4200370300200141086a4200370300200142003703004101210320004280015a0440034020002004845045044020044238862000420888842100200241016a2102200442088821040c010b0b024020024138490d002002210303402003450d01200241016a2102200341087621030c000b000b200241016a21030b2001200336020020014104721024200141206a240020030b1300200028020820014904402000200110230b0bbc0202037f027e02402001500440200041800110250c010b20014280015a044020012106034020052006845045044020054238862006420888842106200241016a2102200542088821050c010b0b0240200241384f04402002210403402004044020044108762104200341016a21030c010b0b200341c9004f044010000b2000200341b77f6a41ff017110252000200028020420036a1026200028020420002802006a417f6a21032002210403402004450d02200320043a0000200441087621042003417f6a21030c000b000b200020024180017341ff017110250b2000200028020420026a1026200028020420002802006a417f6a21024200210503402001200584500d02200220013c0000200542388620014208888421012002417f6a2102200542088821050c000b000b20002001a741ff017110250b200010270b2501017f03402001411446450440200020016a41003a0000200141016a21010c010b0b20000bbb0102027f027e230041406a220224002000101c200241386a2000101d200228023c2103024002402000280204450d00200341144b0d0020002802002d000041c001490d010b10000b200241206a10162003411420034114491b22006b41146a2002280238200010281a200241186a200241306a2802002200360200200241106a200241286a2903002204370300200220022903202205370308200141106a2000360000200141086a200437000020012005370000200241406b24000b850202037f027e23004180016b22012400200141306a4100360200200141286a4200370300200141206a4200370300200141086a200041086a2900002204370300200141106a200041106a280000220236020020014200370318200120002900002205370300200141406b2004370300200141c8006a2002360200200141d8006a2004370300200141e0006a20023602002001200537033820012005370350200141f8006a2002360200200141f0006a200437030020012005370368410121020240034020034114460d01200141e8006a20036a2100200341016a210320002d0000450d000b411521020b20012002360218200141186a410472102420014180016a240020020b340020004194011025200041141030200028020020002802046a2001411410281a2000200028020441146a3602042000102720000b880101037f41a808410136020041ac082802002100034020000440034041b00841b0082802002201417f6a2202360200200141014845044041a8084100360200200020024102746a22004184016a280200200041046a28020011020041a808410136020041ac0828020021000c010b0b41b008412036020041ac08200028020022003602000c010b0b0b730020004200370210200042ffffffff0f370208200020023602042000200136020002402003410871450d002000102d20024f0d002003410471044010000c010b200042003702000b02402003411071450d002000102d20024d0d0020034104710440100020000f0b200042003702000b20000b4101017f200028020445044010000b0240200028020022012d0000418101470d00200028020441014d047f100020002802000520010b2c00014100480d0010000b0bd50101047f200110292204200128020422024b04401000200128020421020b200128020021052000027f02400240200204404100210120052c00002203417f4a0d01027f200341ff0171220141bf014d04404100200341ff017141b801490d011a200141c97e6a0c010b4100200341ff017141f801490d001a200141897e6a0b41016a21010c010b4101210120050d000c010b41002103200120046a20024b0d0020022001490d00410020022004490d011a200120056a2103200220016b20042004417f461b0c010b41000b360204200020033602000bfd0101067f024020002802042202200028020022046b220520014904402000280208220720026b200120056b22034f04400340200241003a00002000200028020441016a22023602042003417f6a22030d000c030b000b2001200720046b2202410174220420042001491b41ffffffff07200241ffffffff03491b220104402001102a21060b200520066a220521020340200241003a0000200241016a21022003417f6a22030d000b200120066a210420052000280204200028020022066b22016b2103200141014e044020032006200110281a0b2000200436020820002002360204200020033602000f0b200520014d0d002000200120046a3602040b0b3a01017f200041003602082000420037020020004101102a2201360200200141fe013a00002000200141016a22013602082000200136020420000b6101037f200028020c200041106a28020047044010000b200028020422022001280204200128020022036b22016a220420002802084b047f20002004102320002802040520020b20002802006a2003200110281a2000200028020420016a3602040b2101017f20011029220220012802044b044010000b200020012001102e2002102f0b2701017f230041206b22022400200241086a200020014114101b102d2100200241206a240020000b2f01017f2000280208200149044020011009200028020020002802041028210220002001360208200020023602000b0b860201067f200028020422032000280210220141087641fcffff07716a2102027f200320002802082204460440200041146a210641000c010b2003200028021420016a220541087641fcffff07716a280200200541ff07714102746a2105200041146a21062002280200200141ff07714102746a0b21010340024020012005460440200641003602000340200420036b41027522014103490d022000200341046a22033602040c000b000b200141046a220120022802006b418020470d0120022802042101200241046a21020c010b0b2001417f6a220241014d04402000418004418008200241016b1b3602100b03402003200447044020002004417c6a22043602080c010b0b0b2500200041011030200028020020002802046a20013a00002000200028020441016a3602040b0f00200020011023200020013602040b960201057f0340024020002802102201200028020c460d00200141786a28020041014904401000200028021021010b200141786a2203200328020041016b220236020020020d002000200336021020004101200028020422032001417c6a28020022026b220121044100210503402004044020044108762104200541016a21050c010b0b2005220441016a20014138491b220520036a1026200220002802006a220320056a20032001102c0240200141374d0440200028020020026a200141406a3a00000c010b200441f7016a220341ff014d0440200028020020026a20033a00002000280200200220046a6a210203402001450d02200220013a0000200141087621012002417f6a21020c000b000b10000b0c010b0b0bfc0801067f03400240200020046a2105200120046a210320022004460d002003410371450d00200520032d00003a0000200441016a21040c010b0b200220046b210602402005410371220745044003402006411049450440200020046a2203200120046a2205290200370200200341086a200541086a290200370200200441106a2104200641706a21060c010b0b027f2006410871450440200120046a2103200020046a0c010b200020046a2205200120046a2204290200370200200441086a2103200541086a0b21042006410471044020042003280200360200200341046a2103200441046a21040b20064102710440200420032f00003b0000200341026a2103200441026a21040b2006410171450d01200420032d00003a000020000f0b024020064120490d002007417f6a220741024b0d00024002400240024002400240200741016b0e020102000b2005200120046a220328020022073a0000200541016a200341016a2f00003b0000200041036a2108200220046b417d6a2106034020064111490d03200420086a2203200120046a220541046a2802002202410874200741187672360200200341046a200541086a2802002207410874200241187672360200200341086a2005410c6a28020022024108742007411876723602002003410c6a200541106a2802002207410874200241187672360200200441106a2104200641706a21060c000b000b2005200120046a220328020022073a0000200541016a200341016a2d00003a0000200041026a2108200220046b417e6a2106034020064112490d03200420086a2203200120046a220541046a2802002202411074200741107672360200200341046a200541086a2802002207411074200241107672360200200341086a2005410c6a28020022024110742007411076723602002003410c6a200541106a2802002207411074200241107672360200200441106a2104200641706a21060c000b000b2005200120046a28020022073a0000200041016a21082004417f7320026a2106034020064113490d03200420086a2203200120046a220541046a2802002202411874200741087672360200200341046a200541086a2802002207411874200241087672360200200341086a2005410c6a28020022024118742007410876723602002003410c6a200541106a2802002207411874200241087672360200200441106a2104200641706a21060c000b000b200120046a41036a2103200020046a41036a21050c020b200120046a41026a2103200020046a41026a21050c010b200120046a41016a2103200020046a41016a21050b20064110710440200520032d00003a00002005200328000136000120052003290005370005200520032f000d3b000d200520032d000f3a000f200541106a2105200341106a21030b2006410871044020052003290000370000200541086a2105200341086a21030b2006410471044020052003280000360000200541046a2105200341046a21030b20064102710440200520032f00003b0000200541026a2105200341026a21030b2006410171450d00200520032d00003a00000b20000bff0201037f200028020445044041000f0b2000101c41012102024020002802002c00002201417f4a0d00200141ff0171220341b7014d0440200341807f6a0f0b02400240200141ff0171220141bf014d0440024020002802042201200341c97e6a22024d047f100020002802040520010b4102490d0020002802002d00010d0010000b200241054f044010000b20002802002d000145044010000b4100210241b7012101034020012003460440200241384f0d030c0405200028020020016a41ca7e6a2d00002002410874722102200141016a21010c010b000b000b200141f7014d0440200341c07e6a0f0b024020002802042201200341897e6a22024d047f100020002802040520010b4102490d0020002802002d00010d0010000b200241054f044010000b20002802002d000145044010000b4100210241f701210103402001200346044020024138490d0305200028020020016a418a7e6a2d00002002410874722102200141016a21010c010b0b0b200241ff7d490d010b10000b20020b0b002000410120001b10090b3501017f230041106b220041c0880436020c41b408200028020c41076a417871220036020041b808200036020041bc083f003602000b8d0301037f024020002001460d00200120006b20026b410020024101746b4d044020002001200210281a0c010b20002001734103712103027f024020002001490440200020030d021a410021030340200120036a2105200020036a2204410371450440200220036b210241002103034020024104490d04200320046a200320056a280200360200200341046a21032002417c6a21020c000b000b20022003460d04200420052d00003a0000200341016a21030c000b000b024020030d002001417f6a21040340200020026a22034103714504402001417c6a21032000417c6a2104034020024104490d03200220046a200220036a2802003602002002417c6a21020c000b000b2002450d042003417f6a200220046a2d00003a00002002417f6a21020c000b000b2001417f6a210103402002450d03200020026a417f6a200120026a2d00003a00002002417f6a21020c000b000b200320056a2101200320046a0b210303402002450d01200320012d00003a00002002417f6a2102200341016a2103200141016a21010c000b000b0b2e01017f200028020445044041000f0b4101210120002802002c0000417f4c047f2000102e200010296a0520010b0b5b00027f027f41002000280204450d001a410020002802002c0000417f4a0d011a20002802002d0000220041bf014d04404100200041b801490d011a200041c97e6a0c010b4100200041f801490d001a200041897e6a0b41016a0b0b5b01027f2000027f0240200128020022054504400c010b200220036a200128020422014b0d0020012002490d00410020012003490d011a200220056a2104200120026b20032003417f461b0c010b41000b360204200020043602000b1b00200028020420016a220120002802084b04402000200110230b0b0b2b01004180080b24696e69740073657400676574007365745f61646472657373006765745f61646472657373";

    public static String BINARY = BINARY_0;

    public static final String FUNC_SET = "set";

    public static final String FUNC_GET = "get";

    public static final String FUNC_SET_ADDRESS = "set_address";

    public static final String FUNC_GET_ADDRESS = "get_address";

    protected SimpleContract(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected SimpleContract(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static RemoteCall<SimpleContract> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        String encodedConstructor = WasmFunctionEncoder.encodeConstructor(BINARY, Arrays.asList());
        return deployRemoteCall(SimpleContract.class, web3j, credentials, contractGasProvider, encodedConstructor);
    }

    public static RemoteCall<SimpleContract> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        String encodedConstructor = WasmFunctionEncoder.encodeConstructor(BINARY, Arrays.asList());
        return deployRemoteCall(SimpleContract.class, web3j, transactionManager, contractGasProvider, encodedConstructor);
    }

    public static RemoteCall<SimpleContract> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider, BigInteger initialVonValue) {
        String encodedConstructor = WasmFunctionEncoder.encodeConstructor(BINARY, Arrays.asList());
        return deployRemoteCall(SimpleContract.class, web3j, credentials, contractGasProvider, encodedConstructor, initialVonValue);
    }

    public static RemoteCall<SimpleContract> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider, BigInteger initialVonValue) {
        String encodedConstructor = WasmFunctionEncoder.encodeConstructor(BINARY, Arrays.asList());
        return deployRemoteCall(SimpleContract.class, web3j, transactionManager, contractGasProvider, encodedConstructor, initialVonValue);
    }

    public RemoteCall<TransactionReceipt> set(Uint64 input) {
        final WasmFunction function = new WasmFunction(FUNC_SET, Arrays.asList(input), Void.class);
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> set(Uint64 input, BigInteger vonValue) {
        final WasmFunction function = new WasmFunction(FUNC_SET, Arrays.asList(input), Void.class);
        return executeRemoteCallTransaction(function, vonValue);
    }

    public RemoteCall<Uint64> get() {
        final WasmFunction function = new WasmFunction(FUNC_GET, Arrays.asList(), Uint64.class);
        return executeRemoteCall(function, Uint64.class);
    }

    public RemoteCall<TransactionReceipt> set_address(WasmAddress addr) {
        final WasmFunction function = new WasmFunction(FUNC_SET_ADDRESS, Arrays.asList(addr), Void.class);
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> set_address(WasmAddress addr, BigInteger vonValue) {
        final WasmFunction function = new WasmFunction(FUNC_SET_ADDRESS, Arrays.asList(addr), Void.class);
        return executeRemoteCallTransaction(function, vonValue);
    }

    public RemoteCall<WasmAddress> get_address() {
        final WasmFunction function = new WasmFunction(FUNC_GET_ADDRESS, Arrays.asList(), WasmAddress.class);
        return executeRemoteCall(function, WasmAddress.class);
    }

    public static SimpleContract load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new SimpleContract(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static SimpleContract load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new SimpleContract(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
