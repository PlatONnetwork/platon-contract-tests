package network.platon.contracts.wasm;

import com.platon.abi.wasm.WasmFunctionEncoder;
import com.platon.abi.wasm.datatypes.WasmFunction;
import com.platon.crypto.Credentials;
import com.platon.protocol.Web3j;
import com.platon.protocol.core.RemoteCall;
import com.platon.protocol.core.methods.response.TransactionReceipt;
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
public class ContractDistoryWithPermissionCheck extends WasmContract {
    private static String BINARY_0 = "0x0061736d01000000015b1060027f7f0060017f017f60017f0060037f7f7f0060000060027f7f017f60047f7f7f7f0060037f7f7f017f60047f7f7f7f017f60027f7e0060037f7e7e0060037e7e7f006000017f60037f7e7e017f60027e7e017f60017f017e02d2020f03656e760c706c61746f6e5f70616e6963000403656e760d706c61746f6e5f6f726967696e000203656e760e706c61746f6e5f64657374726f79000103656e760d726c705f6c6973745f73697a65000103656e760f706c61746f6e5f726c705f6c697374000303656e760e726c705f62797465735f73697a65000503656e7610706c61746f6e5f726c705f6279746573000303656e760d726c705f753132385f73697a65000e03656e760f706c61746f6e5f726c705f75313238000b03656e7617706c61746f6e5f6765745f696e7075745f6c656e677468000c03656e7610706c61746f6e5f6765745f696e707574000203656e7617706c61746f6e5f6765745f73746174655f6c656e677468000503656e7610706c61746f6e5f6765745f7374617465000803656e7610706c61746f6e5f7365745f7374617465000603656e760d706c61746f6e5f72657475726e00000339380402020000010005030107000006020300050002030401070302000f020102010a02000d01010001000408010900010005000203040101060405017001010105030100020608017f0141f088040b073904066d656d6f72790200115f5f7761736d5f63616c6c5f63746f7273000f0f5f5f66756e63735f6f6e5f65786974003806696e766f6b6500240ab24f38040010430b3301017f230041306b22012400200141086a1011200141206a200141086a1012200041186a200141206a1013200141306a24000b210020004200370000200041106a4100360000200041086a4200370000200010010be20b01087f230041e0006b22022400200241086a4100360200200242003703000240034020044180086a2203410371044020044103460d02200441016a21040c010b0b200441fc076a21030340200341046a22032802002204417f73200441fffdfb776a7141808182847871450d000b0340200441ff0171450d01200341016a2d00002104200341016a21030c000b000b200241800820034180086b1017410021032002410036023820024200370330411410182001411410192105410021014100210403402001411446044002402003044020022004410520036b74411f713a0050200241306a200241d0006a101a0b410021032002410036024820024200370340200241406b200228020420022d0000220441017620044101711b410174410172101b2002410172210503402003200228020420022d00002204410176200441017122041b22014f0d01200228024020036a2002280208200520041b20036a2d000022044105763a00002002280240200228020420022d0000220141017620014101711b6a20036a41016a2004411f713a0000200341016a21030c000b000b05200120056a2d0000200441087441801e71722104200341086a210303402003410548450440200220042003417b6a220376411f713a0050200241306a200241d0006a101a0c010b0b200141016a21010c010b0b200228024020016a41003a0000200241d0006a200241406b20022802302002280234101c200228024022030440200220033602440b200241d0006a200228025420022802506b41066a101b2002280254200228025022016b21044101210303402004044020012d000041002003411d764101716b41b3c5d1d0027141002003411c764101716b41dde788ea037141002003411b764101716b41fab384f5017141002003411a764101716b41ed9cc2b20271410020034119764101716b41b2afa9db0371200341057441e0ffffff037173737373737321032004417f6a2104200141016a21010c010b0b410021042002410036022820024200370320200241206a4106101b200341017321014119210303402003417b46450440200228022020046a2001200376411f713a00002003417b6a2103200441016a21040c010b0b200228025022030440200220033602540b20024100360218200242003703100240200228023420022802306b2204450d002002200410182203360210200220033602142002200320046a3602182002280234200228023022016b22044101480d0020032001200410191a2002200228021420046a3602140b200241d0006a200241106a20022802202002280224101c200228021022030440200220033602140b20004200370200200041086a41003602002000101d2002280208200520022d0000220341017122041b210102402002280204200341017620041b220341016a410a4d0440200020034101743a0000200041016a21040c010b200341116a4170712205101821042000200336020420002005410172360200200020043602080b200420012003101e200320046a41003a000020004131101f20022802542203200228025022016b2000280204220920002d000022054101762204200541017122081b6a2106410a21072008044020002802002205417e71417f6a2107200921040b024020042006200420064b1b220641106a417071417f6a410a2006410a4b1b22062007460d00027f2006410a460440200041016a21082000280208210741000c010b4100200620074d200641016a101822081b0d0120002d0000220541017104402000280208210741010c010b200041016a210741010b210920082007027f2005410171044020002802040c010b200541fe01714101760b41016a101e2009044020002008360208200020043602042000200641016a4101723602000c010b200020044101743a00000b2001210403402001200346450440200020042d00004184086a2c0000101f200441016a21042003417f6a21030c010b0b20010440200220013602540b200228022022030440200220033602240b200228023022030440200220033602340b200241e0006a24000b5b00024020002d0000410171450440200041003b01000c010b200028020841003a00002000410036020420002d0000410171450d00200041003602000b20002001290200370200200041086a200141086a2802003602002001101d0b800201057f230041306b22022400200241186a1011200241086a200241186a1012027f024002402000411c6a28020020002d001822014101762204200141017122051b2203200228020c20022d00082201410176200141017122011b470d002002280210200241086a41017220011b21012005450440200041196a210303402004450d0320032d000020012d0000470d02200141016a2101200341016a21032004417f6a21040c000b000b2003450d01200041206a280200210403402003450d0220042d000020012d0000470d01200141016a2101200441016a21042003417f6a21030c000b000b417f0c010b200241186a1002450b2101200241306a240020010b8c0201047f20002001470440200128020420012d00002202410176200241017122041b2102200141016a210320012802082105410a21012005200320041b210420002d0000410171220304402000280200417e71417f6a21010b200220014d0440027f2003044020002802080c010b200041016a0b21012002044020012004200210420b200120026a41003a000020002d00004101710440200020023602040f0b200020024101743a00000f0b416f2103200141e6ffffff074d0440410b20014101742201200220022001491b220141106a4170712001410b491b21030b20031018220120042002101e200020023602042000200341017236020020002001360208200120026a41003a00000b0b4d01017f20004200370200200041086a2202410036020020012d0000410171450440200020012902003702002002200141086a28020036020020000f0b200020012802082001280204101720000b5a01027f02402002410a4d0440200020024101743a0000200041016a21030c010b200241106a4170712204101821032000200236020420002004410172360200200020033602080b200320012002101e200220036a41003a00000b0b002000410120001b10250bfc0801067f03400240200020046a2105200120046a210320022004460d002003410371450d00200520032d00003a0000200441016a21040c010b0b200220046b210602402005410371220745044003402006411049450440200020046a2203200120046a2205290200370200200341086a200541086a290200370200200441106a2104200641706a21060c010b0b027f2006410871450440200120046a2103200020046a0c010b200020046a2205200120046a2204290200370200200441086a2103200541086a0b21042006410471044020042003280200360200200341046a2103200441046a21040b20064102710440200420032f00003b0000200341026a2103200441026a21040b2006410171450d01200420032d00003a000020000f0b024020064120490d002007417f6a220741024b0d00024002400240024002400240200741016b0e020102000b2005200120046a220328020022073a0000200541016a200341016a2f00003b0000200041036a2108200220046b417d6a2106034020064111490d03200420086a2203200120046a220541046a2802002202410874200741187672360200200341046a200541086a2802002207410874200241187672360200200341086a2005410c6a28020022024108742007411876723602002003410c6a200541106a2802002207410874200241187672360200200441106a2104200641706a21060c000b000b2005200120046a220328020022073a0000200541016a200341016a2d00003a0000200041026a2108200220046b417e6a2106034020064112490d03200420086a2203200120046a220541046a2802002202411074200741107672360200200341046a200541086a2802002207411074200241107672360200200341086a2005410c6a28020022024110742007411076723602002003410c6a200541106a2802002207411074200241107672360200200441106a2104200641706a21060c000b000b2005200120046a28020022073a0000200041016a21082004417f7320026a2106034020064113490d03200420086a2203200120046a220541046a2802002202411874200741087672360200200341046a200541086a2802002207411874200241087672360200200341086a2005410c6a28020022024118742007410876723602002003410c6a200541106a2802002207411874200241087672360200200441106a2104200641706a21060c000b000b200120046a41036a2103200020046a41036a21050c020b200120046a41026a2103200020046a41026a21050c010b200120046a41016a2103200020046a41016a21050b20064110710440200520032d00003a00002005200328000136000120052003290005370005200520032f000d3b000d200520032d000f3a000f200541106a2105200341106a21030b2006410871044020052003290000370000200541086a2105200341086a21030b2006410471044020052003280000360000200541046a2105200341046a21030b20064102710440200520032f00003b0000200541026a2105200341026a21030b2006410171450d00200520032d00003a00000b20000bb70101047f230041206b220224000240200028020422032000280208490440200320012d00003a00002000200028020441016a3602040c010b2000200320002802006b220441016a10202105200241186a200041086a3602004100210320024100360214200504402005101821030b20022003360208200320046a220420012d00003a00002002200320056a3602142002200436020c2002200441016a3602102000200241086a1021200241086a10220b200241206a24000bfa0101057f230041206b22022400024020002802042203200028020022046b22052001490440200028020820036b200120056b22044f04400340200341003a00002000200028020441016a22033602042004417f6a22040d000c030b000b2000200110202106200241186a200041086a3602002002410036021441002101200604402006101821010b200220013602082002200120056a22033602102002200120066a3602142002200336020c0340200341003a00002002200228021041016a22033602102004417f6a22040d000b2000200241086a1021200241086a10220c010b200520014d0d002000200120046a3602040b200241206a24000bc60301057f230041206b22042400200128020421050240200320026b22064101480d002006200128020820056b4c0440034020022003460d02200520022d00003a00002001200128020441016a2205360204200241016a21020c000b000b2001200520066a200128020022066b10202108200441186a200141086a36020020044100360214200520066b2106200804402008101821070b200420073602082004200620076a22063602102004200720086a3602142004200636020c200441086a410472210703402002200346450440200620022d00003a00002004200428021041016a2206360210200241016a21020c010b0b200128020020052007102302402001280204220320056b220241004c0440200428021021020c010b2004200428021020052002101920026a2202360210200128020421030b20012002360204200128020021022001200428020c3602002001280208210520012004280214360208200420033602102004200236020c2004200536021420042002360208200441086a1022200128020421050b20002005360204200141003602042000200128020036020020012802082102200141003602082000200236020820014100360200200441206a24000b2201017f03402001410c470440200020016a4100360200200141046a21010c010b0b0b10002002044020002001200210191a0b0bf60101057f027f20002d00002202410171220345044020024101762104410a0c010b2000280204210420002802002202417e71417f6a0b210502400240024020042005460440027f2002410171044020002802080c010b200041016a0b2106416f2103200541e6ffffff074d0440410b20054101742202200541016a220320032002491b220241106a4170712002410b491b21030b20031018220220062005101e20002003410172360200200020023602080c010b2003450d01200028020821020b2000200441016a3602040c010b2000200441017441026a3a0000200041016a21020b200220046a220041003a0001200020013a00000b2e01017f2001200028020820002802006b2200410174220220022001491b41ffffffff07200041ffffffff03491b0b6701017f20002802002000280204200141046a1023200028020021022000200128020436020020012002360204200028020421022000200128020836020420012002360208200028020821022000200128020c3602082001200236020c200120012802043602000b2b01027f200028020821012000280204210203402001200247044020002001417f6a22013602080c010b0b0b270020022002280200200120006b22016b2202360200200141014e044020022000200110191a0b0b8e0602057f037e23004190016b2200240010431009220110252202100a200041d8006a200041086a200220011026220341001027200041d8006a102802400240200028025c450d00200041d8006a10280240200028025822022c0000220141004e044020010d010c020b200141807f460d00200141ff0171220441b7014d0440200028025c41014d04401000200028025821020b20022d00010d010c020b200441bf014b0d01200028025c200141ff017141ca7e6a22014d04401000200028025821020b200120026a2d0000450d010b200028025c450d0020022d000041c001490d010b10000b200041386a200041d8006a1029200028023c220141094f044010000b200028023821020340200104402001417f6a210120023100002005420886842105200241016a21020c010b0b024002402005500d0041a508102a20055104402003102b200041d8006a102c2101200041d8006a10102001102d0c020b41aa08102a20055104402003102b200041d8006a102c2102200041d8006a10142103200041206a102e2101200041d0006a4100360200200041c8006a4200370300200041406b420037030020004200370338200041386a2003ac22054201862005423f87220685220720064201862005423f88842006852205102f20002802382103200041386a41047210302001200310312001200720051032220128020c200141106a28020047044010000b20012802002001280204100e200128020c22030440200120033602100b2002102d0c020b41bb08102a2005510440200041206a1033210120031034410247044010000b200041d8006a200341011027200041d8006a20011035200041d8006a102c2102200041f0006a200041386a2001101610152002102d0c020b41c608102a2005520d002003102b200041d8006a102c210320004180016a200041f0006a10162102200041386a102e22012002103610312001200041206a200210161037200128020c200141106a28020047044010000b20012802002001280204100e200128020c22020440200120023602100b2003102d0c010b10000b103820004190016a24000b9b0101047f230041106b220124002001200036020c2000047f41e808200041086a2202411076220041e8082802006a220336020041e40841e408280200220420026a41076a417871220236020002400240200341107420024d044041e808200341016a360200200041016a21000c010b2000450d010b200040000d0010000b20042001410c6a4104101941086a0541000b2100200141106a240020000b0c00200020012002411c10390bc90202067f017e230041106b220324002001280208220520024b0440200341086a2001103e20012003280208200328020c103f36020c20032001103e410021052001027f410020032802002207450d001a410020032802042208200128020c2206490d001a200820062006417f461b210420070b360210200141146a2004360200200141003602080b200141106a210603402001280214210402402005200249044020040d01410021040b200020062802002004411410391a200341106a24000f0b20032001103e41002104027f410020032802002205450d001a410020032802042208200128020c2207490d001a200820076b2104200520076a0b2105200120043602142001200536021020032006410020052004103f10462001200329030022093702102001200128020c2009422088a76a36020c2001200128020841016a22053602080c000b000b4101017f200028020445044010000b0240200028020022012d0000418101470d00200028020441014d047f100020002802000520010b2c00014100480d0010000b0bd50101047f2001103a2204200128020422024b04401000200128020421020b200128020021052000027f02400240200204404100210120052c00002203417f4a0d01027f200341ff0171220141bf014d04404100200341ff017141b801490d011a200141c97e6a0c010b4100200341ff017141f801490d001a200141897e6a0b41016a21010c010b4101210120050d000c010b41002103200120046a20024b0d0020022001490d00410020022004490d011a200120056a2103200220016b20042004417f461b0c010b41000b360204200020033602000b3901027e42a5c688a1c89ca7f94b210103402000300000220250450440200041016a2100200142b383808080207e20028521010c010b0b20010b0e0020001034410147044010000b0bf40101087f230041406a22012400200010332107200042afb59bdd9e8485b9f800370310200041186a10332106200141286a102e22022000290310103b200228020c200241106a28020047044010000b02402002280200220520022802042208100b22034504400c010b2001410036022020014200370318200141186a2003101b2005200820012802182205200128021c20056b100c417f47044020012001280218220441016a200128021c2004417f736a102620061035200321040b20012802182203450d002001200336021c0b200228020c22030440200220033602100b20044504402006200710150b200141406b240020000b810301097f230041d0006b22022400200241186a102e2103200241c8006a4100360200200241406b4200370300200241386a420037030020024200370330200241306a20002903104200102f20022802302101200241306a410472103020032001103120032000290310103b200328020c200341106a28020047044010000b2003280204210420032802002105200241306a102e2101200041186a22061036210741011018220041fe013a0000200128020c200141106a28020047044010000b2001280204220841016a220920012802084b047f20012009103c20012802040520080b20012802006a2000410110191a2001200128020441016a3602042001200041016a200720006b6a10312001200241086a2006101610370240200128020c2001280210460440200128020021000c010b100020012802002100200128020c2001280210460d0010000b2005200420002001280204100d200128020c22000440200120003602100b200328020c22010440200320013602100b200241d0006a24000b2900200041003602082000420037020020004100103c200041146a41003602002000420037020c20000ba40101027f4101210420014280015441002002501b450440034020012002845045044020024238862001420888842101200341016a2103200242088821020c010b0b200341384f047f2003103d20036a0520030b41016a21040b200041186a28020022030440200041086a2802002003200041146a2802006a417f6a220341087641fcffff07716a280200200341ff07714102746a21000b2000200028020020046a3602000b860201067f200028020422032000280210220141087641fcffff07716a2102027f200320002802082204460440200041146a210641000c010b2003200028021420016a220541087641fcffff07716a280200200541ff07714102746a2105200041146a21062002280200200141ff07714102746a0b21010340024020012005460440200641003602000340200420036b41027522014103490d022000200341046a22033602040c000b000b200141046a220120022802006b418020470d0120022802042101200241046a21020c010b0b2001417f6a220241014d04402000418004418008200241016b1b3602100b03402003200447044020002004417c6a22043602080c010b0b0b13002000280208200149044020002001103c0b0b2a01017f2000200220011007200028020422036a104020022001200320002802006a10082000104120000b190020004200370200200041086a41003602002000101d20000b800101047f230041106b2201240002402000280204450d0020002802002d000041c001490d00200141086a2000103e200128020c210003402000450d01200141002001280208220320032000103f22046a20034520002004497222031b3602084100200020046b20031b2100200241016a21020c000b000b200141106a240020020ba10201057f230041206b22022400024002402000280204044020002802002d000041c001490d010b200241086a10331a0c010b200241186a200010292000103a21030240024002400240200228021822000440200228021c220520034f0d010b41002100200241106a410036020020024200370308410021050c010b200241106a4100360200200242003703082000200520032003417f461b22046a21052004410a4b0d010b200220044101743a0008200241086a41017221030c010b200441106a4170712206101821032002200436020c20022006410172360208200220033602100b03402000200546450440200320002d00003a0000200341016a2103200041016a21000c010b0b200341003a00000b2001200241086a1013200241206a24000bb80101047f230041306b22012400200141286a4100360200200141206a4200370300200141186a42003703002001420037031041012103024002400240200120001016220028020420002d00002202410176200241017122041b220241014d0440200241016b0d032000280208200041016a20041b2c0000417f4c0d010c030b200241374b0d010b200241016a21030c010b2002103d20026a41016a21030b20012003360210200141106a4104721030200141306a240020030b4c01037f20002001280208200141016a20012d0000220241017122031b22042001280204200241017620031b22011005200028020422026a104020042001200220002802006a1006200010410b880101037f41d408410136020041d8082802002100034020000440034041dc0841dc082802002201417f6a2202360200200141014845044041d4084100360200200020024102746a22004184016a280200200041046a28020011020041d408410136020041d80828020021000c010b0b41dc08412036020041d808200028020022003602000c010b0b0b730020004200370210200042ffffffff0f370208200020023602042000200136020002402003410871450d002000104420024f0d002003410471044010000c010b200042003702000b02402003411071450d002000104420024d0d0020034104710440100020000f0b200042003702000b20000bff0201037f200028020445044041000f0b2000102841012102024020002802002c00002201417f4a0d00200141ff0171220341b7014d0440200341807f6a0f0b02400240200141ff0171220141bf014d0440024020002802042201200341c97e6a22024d047f100020002802040520010b4102490d0020002802002d00010d0010000b200241054f044010000b20002802002d000145044010000b4100210241b7012101034020012003460440200241384f0d030c0405200028020020016a41ca7e6a2d00002002410874722102200141016a21010c010b000b000b200141f7014d0440200341c07e6a0f0b024020002802042201200341897e6a22024d047f100020002802040520010b4102490d0020002802002d00010d0010000b200241054f044010000b20002802002d000145044010000b4100210241f701210103402001200346044020024138490d0305200028020020016a418a7e6a2d00002002410874722102200141016a21010c010b0b0b200241ff7d490d010b10000b20020b0b0020002001420010321a0b2f01017f2000280208200149044020011025200028020020002802041019210220002001360208200020023602000b0b1e01017f03402000044020004108762100200141016a21010c010b0b20010b2101017f2001103a220220012802044b044010000b2000200120011045200210460b2701017f230041206b22022400200241086a200020014114103910442100200241206a240020000b3601017f2000280208200149044020011025200028020020002802041019210220002001360208200020023602000b200020013602040b7a01037f0340024020002802102201200028020c460d00200141786a2802004504401000200028021021010b200141786a22022002280200417f6a220336020020030d002000200236021020002001417c6a2802002201200028020420016b220210036a1040200120002802006a22012002200110040c010b0b0b8d0301037f024020002001460d00200120006b20026b410020024101746b4d044020002001200210191a0c010b20002001734103712103027f024020002001490440200020030d021a410021030340200120036a2105200020036a2204410371450440200220036b210241002103034020024104490d04200320046a200320056a280200360200200341046a21032002417c6a21020c000b000b20022003460d04200420052d00003a0000200341016a21030c000b000b024020030d002001417f6a21040340200020026a22034103714504402001417c6a21032000417c6a2104034020024104490d03200220046a200220036a2802003602002002417c6a21020c000b000b2002450d042003417f6a200220046a2d00003a00002002417f6a21020c000b000b2001417f6a210103402002450d03200020026a417f6a200120026a2d00003a00002002417f6a21020c000b000b200320056a2101200320046a0b210303402002450d01200320012d00003a00002002417f6a2102200341016a2103200141016a21010c000b000b0b3501017f230041106b220041f0880436020c41e008200028020c41076a417871220036020041e408200036020041e8083f003602000b2e01017f200028020445044041000f0b4101210120002802002c0000417f4c047f200010452000103a6a0520010b0b5b00027f027f41002000280204450d001a410020002802002c0000417f4a0d011a20002802002d0000220041bf014d04404100200041b801490d011a200041c97e6a0c010b4100200041f801490d001a200041897e6a0b41016a0b0b5b01027f2000027f0240200128020022054504400c010b200220036a200128020422014b0d0020012002490d00410020012003490d011a200220056a2104200120026b20032003417f461b0c010b41000b360204200020043602000b0b5701004180080b506174780071707a7279397838676632747664773073336a6e35346b686365366d7561376c00696e697400646973746f72795f636f6e7472616374007365745f737472696e67006765745f737472696e67";

    public static String BINARY = BINARY_0;

    public static final String FUNC_DISTORY_CONTRACT = "distory_contract";

    public static final String FUNC_SET_STRING = "set_string";

    public static final String FUNC_GET_STRING = "get_string";

    protected ContractDistoryWithPermissionCheck(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected ContractDistoryWithPermissionCheck(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static RemoteCall<ContractDistoryWithPermissionCheck> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        String encodedConstructor = WasmFunctionEncoder.encodeConstructor(BINARY, Arrays.asList());
        return deployRemoteCall(ContractDistoryWithPermissionCheck.class, web3j, credentials, contractGasProvider, encodedConstructor);
    }

    public static RemoteCall<ContractDistoryWithPermissionCheck> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        String encodedConstructor = WasmFunctionEncoder.encodeConstructor(BINARY, Arrays.asList());
        return deployRemoteCall(ContractDistoryWithPermissionCheck.class, web3j, transactionManager, contractGasProvider, encodedConstructor);
    }

    public static RemoteCall<ContractDistoryWithPermissionCheck> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider, BigInteger initialVonValue) {
        String encodedConstructor = WasmFunctionEncoder.encodeConstructor(BINARY, Arrays.asList());
        return deployRemoteCall(ContractDistoryWithPermissionCheck.class, web3j, credentials, contractGasProvider, encodedConstructor, initialVonValue);
    }

    public static RemoteCall<ContractDistoryWithPermissionCheck> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider, BigInteger initialVonValue) {
        String encodedConstructor = WasmFunctionEncoder.encodeConstructor(BINARY, Arrays.asList());
        return deployRemoteCall(ContractDistoryWithPermissionCheck.class, web3j, transactionManager, contractGasProvider, encodedConstructor, initialVonValue);
    }

    public RemoteCall<TransactionReceipt> distory_contract() {
        final WasmFunction function = new WasmFunction(FUNC_DISTORY_CONTRACT, Arrays.asList(), Void.class);
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> distory_contract(BigInteger vonValue) {
        final WasmFunction function = new WasmFunction(FUNC_DISTORY_CONTRACT, Arrays.asList(), Void.class);
        return executeRemoteCallTransaction(function, vonValue);
    }

    public RemoteCall<TransactionReceipt> set_string(String name) {
        final WasmFunction function = new WasmFunction(FUNC_SET_STRING, Arrays.asList(name), Void.class);
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> set_string(String name, BigInteger vonValue) {
        final WasmFunction function = new WasmFunction(FUNC_SET_STRING, Arrays.asList(name), Void.class);
        return executeRemoteCallTransaction(function, vonValue);
    }

    public RemoteCall<String> get_string() {
        final WasmFunction function = new WasmFunction(FUNC_GET_STRING, Arrays.asList(), String.class);
        return executeRemoteCall(function, String.class);
    }

    public static ContractDistoryWithPermissionCheck load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new ContractDistoryWithPermissionCheck(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static ContractDistoryWithPermissionCheck load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new ContractDistoryWithPermissionCheck(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
