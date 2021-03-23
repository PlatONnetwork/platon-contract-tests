package network.platon.contracts.wasm;

import com.platon.abi.wasm.WasmFunctionEncoder;
import com.platon.abi.wasm.datatypes.WasmFunction;
import com.platon.crypto.Credentials;
import com.platon.protocol.Web3j;
import com.platon.protocol.core.RemoteCall;
import com.platon.protocol.core.methods.response.TransactionReceipt;
import com.platon.rlp.wasm.datatypes.Int64;
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
public class InnerFunction_2 extends WasmContract {
    private static String BINARY_0 = "0x0061736d0100000001520e60027f7f0060017f017f60017f0060037f7f7f0060000060027f7f017f60037f7e7e0060037f7f7f017f60047f7f7f7f0060017f017e60077f7f7f7f7f7f7f0060027f7e006000017f60047f7f7f7f017f02da010a03656e760c706c61746f6e5f70616e6963000403656e760d706c61746f6e5f6f726967696e000203656e760f706c61746f6e5f7472616e73666572000703656e7611706c61746f6e5f63616c6c5f76616c7565000103656e760b706c61746f6e5f73686133000803656e760e706c61746f6e5f64657374726f79000103656e760d706c61746f6e5f726576657274000403656e7617706c61746f6e5f6765745f696e7075745f6c656e677468000c03656e7610706c61746f6e5f6765745f696e707574000203656e760d706c61746f6e5f72657475726e0000034342040b000002010103060600000302070505030a0102020200010003000300050301050200070001040d030909020001000002010004000501030401010801000000060405017001030305030100020608017f0141b08a040b073904066d656d6f72790200115f5f7761736d5f63616c6c5f63746f7273000a0f5f5f66756e63735f6f6e5f65786974003e06696e766f6b6500310908010041010b0223210ad86842040010430bb30102017f017e230041306b2202240002402001500d00200241086a2000100c20022d001c450d002002410036022820024200370320200241206a4120100d20022802242002280220417f736a210003402000417f470440200228022020006a20013c0000200342388620014208888421012000417f6a2100200342088821030c010b0b200241086a20022802202200200228022420006b10021a20022802202200450d00200220003602240b200241306a24000b2101017f230041106b2202240020002001200241800810191024200241106a24000bfa0101057f230041206b22022400024020002802042203200028020022046b22052001490440200028020820036b200120056b22044f04400340200341003a00002000200028020441016a22033602042004417f6a22040d000c030b000b2000200110282106200241186a200041086a3602002002410036021441002101200604402006101021010b200220013602082002200120056a22033602102002200120066a3602142002200336020c0340200341003a00002002200228021041016a22033602102004417f6a22040d000b2000200241086a1027200241086a10170c010b200520014d0d002000200120046a3602040b200241206a24000bd50302067f047e230041306b22042400200441206a2102200441206a10032101034020010440200842088620074238888421082001417f6a210120023100002007420886842107200241016a21020c010b0b0240027f2000100f22032d00002201410171450440200141017622024128200241284b1b41106a41f001712101410a0c010b200328020422024128200241284b1b41106a41707122012003280200417e712200460d012000417f6a0b210541002001417f6a20054d2001101022001b0d0020002003280208200341016a20032d0000220541017122061b2003280204200541017620061b41016a10112003200036020820032002360204200320014101723602000b200441186a21050340200441106a2007200810122004200429031022092005290300220a10132003200429030020077ca741cb096a2c000010142007420956210120084200522102200850210020092107200a21082001200220001b0d000b0240200328020420032d00002201410176200141017122011b2202450d0020022003280208200341016a20011b22016a417f6a21020340200120024f0d0120012d00002100200120022d00003a0000200220003a00002002417f6a2102200141016a21010c000b000b200441306a24000b190020004200370200200041086a41003602002000101e20000b0b002000410120001b10300b10002002044020002001200210181a0b0b3701017f230041106b22032400200320012002104b200329030021012000200341086a29030037030820002001370300200341106a24000b7701017e20002001427f7e200242767e7c2001422088220242ffffffff0f7e7c200242f6ffffff0f7e200142ffffffff0f83220142f6ffffff0f7e22034220887c22024220887c200142ffffffff0f7e200242ffffffff0f837c22024220887c3703082000200342ffffffff0f832002422086843703000bf60101057f027f20002d00002202410171220345044020024101762104410a0c010b2000280204210420002802002202417e71417f6a0b210502400240024020042005460440027f2002410171044020002802080c010b200041016a0b2106416f2103200541e6ffffff074d0440410b20054101742202200541016a220320032002491b220241106a4170712002410b491b21030b20031010220220062005101120002003410172360200200020023602080c010b2003450d01200028020821020b2000200441016a3602040c010b2000200441017441026a3a0000200041016a21020b200220046a220041003a0001200020013a00000b850a01097f230041e0006b220224002002410036022820024200370320027f200128020420012d00002203410176200341017122041b220341014804404100210341000c010b2001280208200141016a20041b2101200241406b200241286a3602002002410036023c200220031010220436023820022004360230200220043602342002200320046a36023c034020030440200420012d00003a00002002200228023841016a22043602382003417f6a2103200141016a21010c010b0b200241206a200241306a41001016200241306a10172002280220210320022802240b21012003200120036b200241306a4120100441002103034020034120470440200220036a41003a0000200341016a21030c010b0b2002200241306a412010181a200241306a41b60910192101200241d8006a41003602002002420037035002400240200128020420022d0030220441017620044101711b220341406b2205410b4f0440200341d0006a4170712204101021062002200536025420022004410172360250200220063602580c010b200220054101743a0050200241d0006a41017221062005450d010b20062005101a210620022d003021040b200520066a41003a0000200141016a2107200128020821092001280204200441fe0171410176200441017122081b2101027f20022d00502204410171220a450440410a2106200441017622042003200320044b1b0c010b2002280250417e71417f6a210620022802542204200320042003491b0b21052009200720081b2107024002400240027f02400240200520046b20066a20014f04402002280258200241d0006a410172200a1b21064100210920012005460440200121080c050b200420056b220a450440200521080c050b20012005490d01200620074f0d02200420066a20074d0d02200520066a20074d04402007200120056b6a21070c030b200620072005101b200120076a2107200120056b21012005210941000c030b200241d0006a2006200120046a20056b20066b2004200520012007101c0c050b200620072001101b200120066a200520066a200a101b200521080c030b20050b2108200620096a220520016a200520086a200a101b0b200620096a20072001101b0b200120086b20046a2101024020022d00504101710440200220013602540c010b200220014101743a00500b200120066a41003a00000b200241d0006a4101722104410021010340200141204704402002280258200420022d00504101711b20036a200120026a22052d000041047641b7096a2d00003a00002002280258200420022d00504101711b20036a41016a20052d0000410f7141b7096a2d00003a0000200141016a2101200341026a21030c010b0b41c809101d21030240027f20022d00502201410171220645044020014101762101410a0c010b200228025421012002280250417e71417f6a0b220520016b20034f04402003450d012002280258200420061b2204027f20014504404100210141c8090c010b200320046a20042001101b200341c8096a41c809200120046a41c8094b1b41c809200441c8094d1b0b2003101b200120036a2103024020022d00504101710440200220033602540c010b200220034101743a00500b200320046a41003a00000c010b200241d0006a2005200120036a20056b20014100200341c809101c0b20002002290350370200200041086a200241d8006a280200360200200241d0006a101e200228022022030440200220033602240b200241e0006a24000b8d0101017f20002802002002200141046a1029200028020420026b220341014e044020012802082002200310181a2001200128020820036a3602080b200028020021022000200128020436020020012002360204200028020421022000200128020836020420012002360208200028020821022000200128020c3602082001200236020c200120012802043602000b2b01027f200028020821012000280204210203402001200247044020002001417f6a22013602080c010b0b0bfc0801067f03400240200020046a2105200120046a210320022004460d002003410371450d00200520032d00003a0000200441016a21040c010b0b200220046b210602402005410371220745044003402006411049450440200020046a2203200120046a2205290200370200200341086a200541086a290200370200200441106a2104200641706a21060c010b0b027f2006410871450440200120046a2103200020046a0c010b200020046a2205200120046a2204290200370200200441086a2103200541086a0b21042006410471044020042003280200360200200341046a2103200441046a21040b20064102710440200420032f00003b0000200341026a2103200441026a21040b2006410171450d01200420032d00003a000020000f0b024020064120490d002007417f6a220741024b0d00024002400240024002400240200741016b0e020102000b2005200120046a220328020022073a0000200541016a200341016a2f00003b0000200041036a2108200220046b417d6a2106034020064111490d03200420086a2203200120046a220541046a2802002202410874200741187672360200200341046a200541086a2802002207410874200241187672360200200341086a2005410c6a28020022024108742007411876723602002003410c6a200541106a2802002207410874200241187672360200200441106a2104200641706a21060c000b000b2005200120046a220328020022073a0000200541016a200341016a2d00003a0000200041026a2108200220046b417e6a2106034020064112490d03200420086a2203200120046a220541046a2802002202411074200741107672360200200341046a200541086a2802002207411074200241107672360200200341086a2005410c6a28020022024110742007411076723602002003410c6a200541106a2802002207411074200241107672360200200441106a2104200641706a21060c000b000b2005200120046a28020022073a0000200041016a21082004417f7320026a2106034020064113490d03200420086a2203200120046a220541046a2802002202411874200741087672360200200341046a200541086a2802002207411874200241087672360200200341086a2005410c6a28020022024118742007410876723602002003410c6a200541106a2802002207411874200241087672360200200441106a2104200641706a21060c000b000b200120046a41036a2103200020046a41036a21050c020b200120046a41026a2103200020046a41026a21050c010b200120046a41016a2103200020046a41016a21050b20064110710440200520032d00003a00002005200328000136000120052003290005370005200520032f000d3b000d200520032d000f3a000f200541106a2105200341106a21030b2006410871044020052003290000370000200541086a2105200341086a21030b2006410471044020052003280000360000200541046a2105200341046a21030b20064102710440200520032f00003b0000200541026a2105200341026a21030b2006410171450d00200520032d00003a00000b20000b1f0020004200370200200041086a4100360200200020012001101d102620000bb90301027f02402001450d00200041303a0000200020016a2203417f6a41303a000020014103490d00200041303a0002200041303a00012003417d6a41303a00002003417e6a41303a000020014107490d00200041303a00032003417c6a41303a000020014109490d002000410020006b41037122026a220341b0e0c081033602002003200120026b417c7122026a2201417c6a41b0e0c0810336020020024109490d00200341b0e0c08103360208200341b0e0c08103360204200141786a41b0e0c08103360200200141746a41b0e0c0810336020020024119490d00200341b0e0c08103360218200341b0e0c08103360214200341b0e0c08103360210200341b0e0c0810336020c200141706a41b0e0c081033602002001416c6a41b0e0c08103360200200141686a41b0e0c08103360200200141646a41b0e0c081033602002002200341047141187222026b2101200220036a2102034020014120490d01200242b0e0c08183868c9830370300200241186a42b0e0c08183868c9830370300200241106a42b0e0c08183868c9830370300200241086a42b0e0c08183868c9830370300200241206a2102200141606a21010c000b000b20000b0f002002044020002001200210420b0ba80101027f027f20002d0000410171044020002802080c010b200041016a0b2108416f2107200141e6ffffff074d0440410b20014101742207200120026a220120012007491b220141106a4170712001410b491b21070b2007101021012005044020012006200510110b200320046b22030440200120056a200420086a200310110b200020013602082000200320056a220536020420002007410172360200200120056a41003a00000b7801027f20002101024003402001410371044020012d0000450d02200141016a21010c010b0b2001417c6a21010340200141046a22012802002202417f73200241fffdfb776a7141808182847871450d000b0340200241ff0171450d01200141016a2d00002102200141016a21010c000b000b200120006b0b2201017f03402001410c470440200020016a4100360200200141046a21010c010b0b0bc00201067f230041e0006b22022400200241186a102a2104200241d8006a4100360200200241d0006a4200370300200241c8006a42003703002002420037034041012103024002400240200241306a2000102b220528020420022d00302201410176200141017122061b220141014d0440200141016b0d030c010b20014138490d01200141016a210303402001450d03200341016a2103200141087621010c000b000b2005280208200541016a20061b2c0000417f4a0d010b200141016a21030b20022003360240200241406b410472102c20042003102d2004200241086a2000102b2201280208200141016a20012d0000220341017122001b2001280204200341017620001b102e220128020c200141106a28020047044010000b200128020020012802041009200128020c22030440200120033602100b200241e0006a24000b2d01017f230041206b22012400200141086a2000100c20012d001c0440200141086a10051a0b200141206a24000b08002000102210010b2601017f230041106b22012400200141003a000f20002001410f6a1025200141106a240020000b6b01017f230041406a22012400200010222100200141306a41800810192102200141086a200141206a41840810192002102420012d001c044020002001290308370000200041106a200141186a280200360000200041086a200141106a2903003700000b200141406b24000bc510010b7f230041d0006b220324002001280208200141016a220c20012d0000220441017122061b21092001280204200441017620061b210a410021044101210502400340200541017141002004200a491b0440200420096a2d00002206415f6a41ff017141de004921052007200641bf7f6a41ff0171411a4972210720082006419f7f6a41ff0171411a49722108200441016a21040c0105024020052007200871410173712107200a450d00200a210403402004450d01200420096a21052004417f6a220621042005417f6a2d00004131470d000b0c030b0b0b417f21060b024002402007410171450d00200641076a200a4b0d00200641016a4102490d00200a41da004b0d00410021042003410036022020034200370318200341186a200a2006417f7322086a100d4101210702400240024003402004200128020420012d00002205410176200541017122051b20086a4f044002402007410171450d0541002104200341086a100f21070340200420064604402007280204220820032d000822044101762209200441017122051b2206200228020420022d00002204410176200441017122041b470d052002280208200241016a20041b210420050d02200741016a21052009210603402006450440200921080c080b20052d000020042d0000470d06200441016a2104200541016a21052006417f6a21060c000b000520072001280208200c20012d00004101711b20046a2c000022054120722005200541bf7f6a411a491b4118744118751014200441016a21040c010b000b000b05200328021820046a2001280208200c20051b20066a20046a41016a2d000041b0086a2d000022053a00002007200541ff0147712107200441016a21040c010b0b2006450d012007280208210503402006450d0220052d000020042d0000470d01200441016a2104200541016a21052006417f6a21060c000b000b200341386a10221a200041003a0014200041106a200341c8006a280200360000200041086a200341406b2903003700002000200329033837000020032802182204450d032003200436021c0c030b410021042003410036023020034200370328200341286a2008410174410172100d200741016a210803402004200728020420032d00082206410176200641017122061b22054f450440200328022820046a2007280208200820061b20046a2d000022064105763a00002003280228200728020420032d0008220541017620054101711b6a20046a41016a2006411f713a0000200441016a21040c010b0b200328022820056a41003a0000200328022c21050240200328021c2206200328021822046b22074101480d0020072003280230220920056b4c0440034020042006460d02200520042d00003a00002003200328022c41016a220536022c200441016a21040c000b000b200341c8006a200341306a36020041002108200341003602442005200328022822016b210a200520076a20016b2207200920016b2209410174220120012007491b41ffffffff07200941ffffffff03491b220904402009101021080b2003200836023820032008200a6a22073602402003200820096a3602442003200736023c03402004200646450440200720042d00003a00002003200328024041016a2207360240200441016a21040c010b0b200341286a200341386a20051016200341386a1017200328022c21050b2003420037022c2003280228210620034100360228200520066b21054101210403402005044020062d000041002004411d764101716b41b3c5d1d0027141002004411c764101716b41dde788ea037141002004411b764101716b41fab384f5017141002004411a764101716b41ed9cc2b20271410020044119764101716b41b2afa9db0371200441057441e0ffffff037173737373737321042005417f6a2105200641016a21060c010b0b20044101470d0041002104200341003602302003420037032841002105200328021c417a6a2207200328021822066b2208044020081010220d210b03402006200746450440200b20062d00003a0000200b41016a210b200641016a21060c010b0b200b21050b200341306a210c41002109410021020240034020022005200d6b4f04400240200441044c044041ff01410820046b76200971450d010b200328022821040c030b052002200d6a2d0000200941057441e01f71722109200441056a21040340200441084e04402009200441786a2204762105200328022c220720032802302208490440200720053a00002003200328022c41016a36022c0c02052003200c36024841002106200341003602442007200328022822016b220741016a220a200820016b220841017422012001200a491b41ffffffff07200841ffffffff03491b220804402008101021060b20032006360238200620076a220720053a00002003200620086a3602442003200736023c2003200741016a360240200341286a200341386a1027200341386a10170c020b000b0b200241016a2102200b21050c010b0b200328022c200328022822046b4114470d0041002104200341003a004f200341386a200341cf006a1025200328022c200328022822066b210503400240200441134b0d0020042005460d00200341386a20046a200420066a2d00003a0000200441016a21040c010b0b20002003290338370000200041013a0014200041106a200341c8006a280200360000200041086a200341406b290300370000200604402003200636022c0b20032802182204450d032003200436021c0c030b2004450d002003200436022c0b20032802182204450d002003200436021c0b200341386a10221a200041003a0014200041106a200341c8006a280200360000200041086a200341406b290300370000200020032903383700000b200341d0006a24000b2601017f03402002411446450440200020026a20012d00003a0000200241016a21020c010b0b0b5a01027f02402002410a4d0440200020024101743a0000200041016a21030c010b200241106a4170712204101021032000200236020420002004410172360200200020033602080b2003200120021011200220036a41003a00000b6701017f20002802002000280204200141046a1029200028020021022000200128020436020020012002360204200028020421022000200128020836020420012002360208200028020821022000200128020c3602082001200236020c200120012802043602000b2e01017f2001200028020820002802006b2200410174220220022001491b41ffffffff07200041ffffffff03491b0b270020022002280200200120006b22016b2202360200200141014e044020022000200110181a0b0b2900200041003602082000420037020020004100102f200041146a41003602002000420037020c20000b4d01017f20004200370200200041086a2202410036020020012d0000410171450440200020012902003702002002200141086a28020036020020000f0b200020012802082001280204102620000b860201067f200028020422032000280210220141087641fcffff07716a2102027f200320002802082204460440200041146a210641000c010b2003200028021420016a220541087641fcffff07716a280200200541ff07714102746a2105200041146a21062002280200200141ff07714102746a0b21010340024020012005460440200641003602000340200420036b41027522014103490d022000200341046a22033602040c000b000b200141046a220120022802006b418020470d0120022802042101200241046a21020c010b0b2001417f6a220241014d04402000418004418008200241016b1b3602100b03402003200447044020002004417c6a22043602080c010b0b0b13002000280208200149044020002001102f0b0bca0301037f4101210302400240024002402002410146044020012c000022044100480d012000200441ff0171104a0c040b200241374b0d01200221030b200020034180017341ff0171104a0c010b20021047220341b7016a22044180024e044010000b2000200441ff0171104a2000200028020420036a1048200028020420002802006a417f6a210420022103037f2003047f200420033a0000200341087621032004417f6a21040c010520020b0b21030b200020031049200028020020002802046a2001200310181a2000200028020420036a3602040b0340024020002802102203200028020c460d00200341786a2802004504401000200028021021030b200341786a22042004280200417f6a220236020020020d002000200436021020004101200028020422022003417c6a28020022046b22031047220541016a20034138491b220120026a1048200420002802006a220220016a200220031042200341374d0440200028020020046a200341406a3a00000c020b200541f7016a220241ff014d0440200028020020046a20023a00002000280200200420056a6a210403402003450d03200420033a0000200341087621032004417f6a21040c000b000510000c020b000b0b20000b2f01017f2000280208200149044020011030200028020020002802041018210220002001360208200020023602000b0b9b0101047f230041106b220124002001200036020c2000047f41ac0a200041086a2202411076220041ac0a2802006a220336020041a80a41a80a280200220420026a41076a417871220236020002400240200341107420024d044041ac0a200341016a360200200041016a21000c010b2000450d010b200040000d0010000b20042001410c6a4104101841086a0541000b2100200141106a240020000bf90402037f027e230041e0006b22002400104310072201103022021008200041c8006a200020022001411c103222014100103302400240200041c8006a10342203500d0041d60910352003510440200110360c020b41db09103520035104402001410110370c020b41e00910352003510440200041186a100f21022000420037032820011038410347044010000b200041c8006a200141011033200041c8006a20021039200041c8006a2001410210332000200041c8006a1034370328200041c8006a2002102b2000290328100b0c020b41e9091035200351044020011036200041c8006a100e200041c8006a101f0c020b41ef0910352003510440200041386a100f21022001200041386a103a200041c8006a200041186a2002102b1015200041c8006a101f0c020b41f4091035200351044020011036230041106b22012400200141b0091019101f200141106a24000c020b41fc0910352003510440200110360c010b41820a1035200351044020011038410247044010000b200041c8006a200141011033200041c8006a103b02400240200041c8006a103c450d00200028024c450d0020002802482d000041c001490d010b10000b200041186a200041c8006a103d200028021c220141114f044010000b4200210320002802182102034020010440200442088620034238888421042001417f6a210120023100002003420886842103200241016a21020c010b0b420020034201837d2004423f86200342018884854201520d0210060c020b41890a10352003510440200041186a100f21022001200041186a103a200041c8006a2002102b10200c020b41910a10352003520d002001410210370c010b10000b103e200041e0006a24000b730020004200370210200042ffffffff0f370208200020023602042000200136020002402003410871450d002000104420024f0d002003410471044010000c010b200042003702000b02402003411071450d002000104420024d0d0020034104710440100020000f0b200042003702000b20000bc90202067f017e230041106b220324002001280208220520024b0440200341086a2001103f20012003280208200328020c104036020c20032001103f410021052001027f410020032802002207450d001a410020032802042208200128020c2206490d001a200820062006417f461b210420070b360210200141146a2004360200200141003602080b200141106a210603402001280214210402402005200249044020040d01410021040b200020062802002004411410321a200341106a24000f0b20032001103f41002104027f410020032802002205450d001a410020032802042208200128020c2207490d001a200820076b2104200520076a0b2105200120043602142001200536021020032006410020052004104010462001200329030022093702102001200128020c2009422088a76a36020c2001200128020841016a22053602080c000b000b850102027f017e230041106b220124002000103b024002402000103c450d002000280204450d0020002802002d000041c001490d010b10000b200141086a2000103d200128020c220041094f044010000b200128020821020340200004402000417f6a210020023100002003420886842103200241016a21020c010b0b200141106a240020030b3901027e42a5c688a1c89ca7f94b210103402000300000220250450440200041016a2100200142b383808080207e20028521010c010b0b20010b0e0020001038410147044010000b0bf90302037f027e230041c0016b220224002000103641012100200241106a200241086a2001110000200241286a102a2104200241d0006a200241206a2802002203360200200241c8006a200241186a290300220537030041002101200241f0006a4100360200200241e8006a4200370300200241e0006a42003703002002200229031022063703402002420037035820024180016a200537030020024188016a200336020020024198016a2005370300200241a0016a2003360200200220063703782002200637039001200241b8016a2003360200200241b0016a2005370300200220063703a8010240034020014114460d01200241a8016a20016a2103200141016a210120032d0000450d000b411521000b20022000360258200241d8006a410472102c20042000102d20024188016a200241206a280200220136020020024180016a200241186a290300220537030020022002290310220637037820024198016a2005370300200241a0016a2001360200200241b0016a2005370300200241b8016a20013602002002200637039001200220063703a801200241e8006a2001360200200241e0006a2005370300200220063703582004200241d8006a4114102e220128020c200141106a28020047044010000b200128020020012802041009200128020c22030440200120033602100b200241c0016a24000b800101047f230041106b2201240002402000280204450d0020002802002d000041c001490d00200141086a2000103f200128020c210003402000450d01200141002001280208220320032000104022046a20034520002004497222031b3602084100200020046b20031b2100200241016a21020c000b000b200141106a240020020bf40201057f230041206b22022400024002402000280204044020002802002d000041c001490d010b200241086a100f1a0c010b200241186a2000103d2000104121030240024002400240200228021822000440200228021c220520034f0d010b41002100200241106a410036020020024200370308410021050c010b200241106a4100360200200242003703082000200520032003417f461b22046a21052004410a4b0d010b200220044101743a0008200241086a41017221030c010b200441106a4170712206101021032002200436020c20022006410172360208200220033602100b03402000200546450440200320002d00003a0000200341016a2103200041016a21000c010b0b200341003a00000b024020012d0000410171450440200141003b01000c010b200128020841003a00002001410036020420012d0000410171450d00200141003602000b20012002290308370200200141086a200241106a280200360200200241086a101e200241206a24000b3401017f230041206b2202240020001038410247044010000b200241086a200041011033200241086a20011039200241206a24000b4101017f200028020445044010000b0240200028020022012d0000418101470d00200028020441014d047f100020002802000520010b2c00014100480d0010000b0b980101037f200028020445044041000f0b2000103b200028020022022c0000220141004e044020014100470f0b027f4101200141807f460d001a200141ff0171220341b7014d0440200028020441014d047f100020002802000520020b2d00014100470f0b4100200341bf014b0d001a2000280204200141ff017141ca7e6a22014d047f100020002802000520020b20016a2d00004100470b0bd50101047f200110412204200128020422024b04401000200128020421020b200128020021052000027f02400240200204404100210120052c00002203417f4a0d01027f200341ff0171220141bf014d04404100200341ff017141b801490d011a200141c97e6a0c010b4100200341ff017141f801490d001a200141897e6a0b41016a21010c010b4101210120050d000c010b41002103200120046a20024b0d0020022001490d00410020022004490d011a200120056a2103200220016b20042004417f461b0c010b41000b360204200020033602000b880101037f41980a4101360200419c0a2802002100034020000440034041a00a41a00a2802002201417f6a2202360200200141014845044041980a4100360200200020024102746a22004184016a280200200041046a28020011020041980a4101360200419c0a28020021000c010b0b41a00a4120360200419c0a200028020022003602000c010b0b0b2101017f20011041220220012802044b044010000b2000200120011045200210460b2701017f230041206b22022400200241086a200020014114103210442100200241206a240020000bff0201037f200028020445044041000f0b2000103b41012102024020002802002c00002201417f4a0d00200141ff0171220341b7014d0440200341807f6a0f0b02400240200141ff0171220141bf014d0440024020002802042201200341c97e6a22024d047f100020002802040520010b4102490d0020002802002d00010d0010000b200241054f044010000b20002802002d000145044010000b4100210241b7012101034020012003460440200241384f0d030c0405200028020020016a41ca7e6a2d00002002410874722102200141016a21010c010b000b000b200141f7014d0440200341c07e6a0f0b024020002802042201200341897e6a22024d047f100020002802040520010b4102490d0020002802002d00010d0010000b200241054f044010000b20002802002d000145044010000b4100210241f701210103402001200346044020024138490d0305200028020020016a418a7e6a2d00002002410874722102200141016a21010c010b0b0b200241ff7d490d010b10000b20020b8d0301037f024020002001460d00200120006b20026b410020024101746b4d044020002001200210181a0c010b20002001734103712103027f024020002001490440200020030d021a410021030340200120036a2105200020036a2204410371450440200220036b210241002103034020024104490d04200320046a200320056a280200360200200341046a21032002417c6a21020c000b000b20022003460d04200420052d00003a0000200341016a21030c000b000b024020030d002001417f6a21040340200020026a22034103714504402001417c6a21032000417c6a2104034020024104490d03200220046a200220036a2802003602002002417c6a21020c000b000b2002450d042003417f6a200220046a2d00003a00002002417f6a21020c000b000b2001417f6a210103402002450d03200020026a417f6a200120026a2d00003a00002002417f6a21020c000b000b200320056a2101200320046a0b210303402002450d01200320012d00003a00002002417f6a2102200341016a2103200141016a21010c000b000b0b3501017f230041106b220041b08a0436020c41a40a200028020c41076a417871220036020041a80a200036020041ac0a3f003602000b2e01017f200028020445044041000f0b4101210120002802002c0000417f4c047f20001045200010416a0520010b0b5b00027f027f41002000280204450d001a410020002802002c0000417f4a0d011a20002802002d0000220041bf014d04404100200041b801490d011a200041c97e6a0c010b4100200041f801490d001a200041897e6a0b41016a0b0b5b01027f2000027f0240200128020022054504400c010b200220036a200128020422014b0d0020012002490d00410020012003490d011a200220056a2104200120026b20032003417f461b0c010b41000b360204200020043602000b1e01017f03402000044020004108762100200141016a21010c010b0b20010b0f0020002001102f200020013602040b1b00200028020420016a220120002802084b044020002001102f0b0b2500200041011049200028020020002802046a20013a00002000200028020441016a3602040bbe0202027f047e2000027e2002500440420021022001420a800c010b0240027e200141fd00200279a76b220341c000460d001a2003413f4d0440200241c00020036bad22058620012003ad2207888421062002200788210820012005862107420021050c020b200241800120036bad2205862001200341406aad22068884210720022006882106200120058621050c010b21072002210641c00021030b03402003044020084201862006423f888422022002427f8542007c20064201862007423f88842206427f852202420a7c200254ad7c423f8722024200837d20062002420a83220154ad7d2108200620017d210620074201862005423f888421072003417f6a21032004ad20054201868421052002a741017121040c010b0b20074201862005423f888421022004ad2005420186427e83840b370300200020023703080b0b9f0201004180080b97026c6174006c617431667965737a75667877786b3632703436646a6e636a38367264353533736b7070793471677a340000ffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff0fff0a1115141a1e0705ffffffffffffff1dff180d19090817ff12161f1b13ff010003100b1c0c0e060402ffffffffffff1dff180d19090817ff12161f1b13ff010003100b1c0c0e060402ffffffffff68656c6c6f000030313233343536373839616263646566003078003031323334353637383900696e69740061646472007472616e736665720076616c75650073686133007272657475726e0070616e6963007265766572740064657374726f79006f726967696e";

    public static String BINARY = BINARY_0;

    public static final String FUNC_TRANSFER = "transfer";

    public static final String FUNC_VALUE = "value";

    public static final String FUNC_SHA3 = "sha3";

    public static final String FUNC_RRETURN = "rreturn";

    public static final String FUNC_PANIC = "panic";

    public static final String FUNC_REVERT = "revert";

    public static final String FUNC_DESTROY = "destroy";

    public static final String FUNC_ORIGIN = "origin";

    public static final String FUNC_ADDR = "addr";

    protected InnerFunction_2(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected InnerFunction_2(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteCall<TransactionReceipt> transfer(String addr, Uint64 amount) {
        final WasmFunction function = new WasmFunction(FUNC_TRANSFER, Arrays.asList(addr,amount), Void.class);
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> transfer(String addr, Uint64 amount, BigInteger vonValue) {
        final WasmFunction function = new WasmFunction(FUNC_TRANSFER, Arrays.asList(addr,amount), Void.class);
        return executeRemoteCallTransaction(function, vonValue);
    }

    public RemoteCall<String> value() {
        final WasmFunction function = new WasmFunction(FUNC_VALUE, Arrays.asList(), String.class);
        return executeRemoteCall(function, String.class);
    }

    public static RemoteCall<InnerFunction_2> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        String encodedConstructor = WasmFunctionEncoder.encodeConstructor(BINARY, Arrays.asList());
        return deployRemoteCall(InnerFunction_2.class, web3j, credentials, contractGasProvider, encodedConstructor);
    }

    public static RemoteCall<InnerFunction_2> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        String encodedConstructor = WasmFunctionEncoder.encodeConstructor(BINARY, Arrays.asList());
        return deployRemoteCall(InnerFunction_2.class, web3j, transactionManager, contractGasProvider, encodedConstructor);
    }

    public static RemoteCall<InnerFunction_2> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider, BigInteger initialVonValue) {
        String encodedConstructor = WasmFunctionEncoder.encodeConstructor(BINARY, Arrays.asList());
        return deployRemoteCall(InnerFunction_2.class, web3j, credentials, contractGasProvider, encodedConstructor, initialVonValue);
    }

    public static RemoteCall<InnerFunction_2> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider, BigInteger initialVonValue) {
        String encodedConstructor = WasmFunctionEncoder.encodeConstructor(BINARY, Arrays.asList());
        return deployRemoteCall(InnerFunction_2.class, web3j, transactionManager, contractGasProvider, encodedConstructor, initialVonValue);
    }

    public RemoteCall<String> sha3(String str) {
        final WasmFunction function = new WasmFunction(FUNC_SHA3, Arrays.asList(str), String.class);
        return executeRemoteCall(function, String.class);
    }

    public void rreturn() {
        throw new RuntimeException("cannot call constant function with void return type");
    }

    public RemoteCall<TransactionReceipt> panic() {
        final WasmFunction function = new WasmFunction(FUNC_PANIC, Arrays.asList(), Void.class);
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> panic(BigInteger vonValue) {
        final WasmFunction function = new WasmFunction(FUNC_PANIC, Arrays.asList(), Void.class);
        return executeRemoteCallTransaction(function, vonValue);
    }

    public RemoteCall<TransactionReceipt> revert(Int64 flag) {
        final WasmFunction function = new WasmFunction(FUNC_REVERT, Arrays.asList(flag), Void.class);
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> revert(Int64 flag, BigInteger vonValue) {
        final WasmFunction function = new WasmFunction(FUNC_REVERT, Arrays.asList(flag), Void.class);
        return executeRemoteCallTransaction(function, vonValue);
    }

    public RemoteCall<TransactionReceipt> destroy(String addr) {
        final WasmFunction function = new WasmFunction(FUNC_DESTROY, Arrays.asList(addr), Void.class);
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> destroy(String addr, BigInteger vonValue) {
        final WasmFunction function = new WasmFunction(FUNC_DESTROY, Arrays.asList(addr), Void.class);
        return executeRemoteCallTransaction(function, vonValue);
    }

    public RemoteCall<WasmAddress> origin() {
        final WasmFunction function = new WasmFunction(FUNC_ORIGIN, Arrays.asList(), WasmAddress.class);
        return executeRemoteCall(function, WasmAddress.class);
    }

    public RemoteCall<WasmAddress> addr() {
        final WasmFunction function = new WasmFunction(FUNC_ADDR, Arrays.asList(), WasmAddress.class);
        return executeRemoteCall(function, WasmAddress.class);
    }

    public static InnerFunction_2 load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new InnerFunction_2(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static InnerFunction_2 load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new InnerFunction_2(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
