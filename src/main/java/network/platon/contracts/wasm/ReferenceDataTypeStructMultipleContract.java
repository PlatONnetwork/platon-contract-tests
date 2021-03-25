package network.platon.contracts.wasm;

import com.platon.abi.wasm.WasmFunctionEncoder;
import com.platon.abi.wasm.datatypes.WasmFunction;
import com.platon.crypto.Credentials;
import com.platon.protocol.Web3j;
import com.platon.protocol.core.RemoteCall;
import com.platon.protocol.core.methods.response.TransactionReceipt;
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
public class ReferenceDataTypeStructMultipleContract extends WasmContract {
    private static String BINARY_0 = "0x0061736d01000000014f0e60017f017f60027f7f0060017f0060027f7f017f60037f7f7f017f60000060037f7f7f0060047f7f7f7f0060047f7f7f7f017f60027f7e017f60017f017e60037e7e7f006000017f60027e7e017f02a9020d03656e760c706c61746f6e5f70616e6963000503656e760d726c705f6c6973745f73697a65000003656e760f706c61746f6e5f726c705f6c697374000603656e760e726c705f62797465735f73697a65000303656e7610706c61746f6e5f726c705f6279746573000603656e760d726c705f753132385f73697a65000d03656e760f706c61746f6e5f726c705f75313238000b03656e7617706c61746f6e5f6765745f696e7075745f6c656e677468000c03656e7610706c61746f6e5f6765745f696e707574000203656e7617706c61746f6e5f6765745f73746174655f6c656e677468000303656e7610706c61746f6e5f6765745f7374617465000803656e7610706c61746f6e5f7365745f7374617465000703656e760d706c61746f6e5f72657475726e0001034847050303050004060a0a02000200000102010200010508000009000001040302070300040001090201030303010104030300000004010101020001040802040602020506000007010405017001010105030100020608017f0141f088040b073904066d656d6f72790200115f5f7761736d5f63616c6c5f63746f7273000d0f5f5f66756e63735f6f6e5f65786974002106696e766f6b6500100aea63470400104e0b920201047f20002001470440200128020420012d00002202410176200241017122041b2102200141016a210320012802082105410a21012005200320041b210420002d0000410171220304402000280200417e71417f6a21010b200220014d0440027f2003044020002802080c010b200041016a0b210120020440200120042002104b0b200120026a41003a000020002d000041017104402000200236020420000f0b200020024101743a000020000f0b416f2103200141e6ffffff074d0440410b20014101742201200220022001491b220141106a4170712001410b491b21030b20031026220120042002104f200020023602042000200341017236020020002001360208200120026a41003a00000b20000ba10101037f20004200370200200041086a2202410036020020012d0000410171450440200020012902003702002002200141086a28020036020020000f0b20012802082103024020012802042201410a4d0440200020014101743a0000200041016a21020c010b200141106a4170712204102621022000200136020420002004410172360200200020023602080b200220032001104f200120026a41003a000020000bfc0402057f017e23004190036b22002400104e10072201101122021008200041d8006a200041086a20022001101222014100101302400240200041d8006a10142205500d004180081015200551044020011016200041d8006a101710180c020b41850810152005510440200041206a10192102200042003703302001101a410347044010000b200041d8006a200141011013200041d8006a2002101b200041d8006a2001410210132000200041d8006a1014370330200041d8006a10172101200041c8006a2002100f2102200020002903303703f80120004180026a2002100e1a200110180c020b4193081015200551044020011016200041d8006a10172101200041206a20004180026a100f101c200110180c020b41a00810152005510440200041206a101921022000412c6a101921032001101a410347044010000b20004101360248200020013602582000200041c8006a36025c200041d8006a2002101d200041d8006a2003101d200041d8006a10172101200041c8006a2002100f2102200041386a2003100f2103200041d8006a220441b4016a2002100e1a200441c0016a2003100e1a200110180c020b41b30810152005520d002001101a410247044010000b200041d8006a200141011013200041d8006a101e02400240200041d8006a101f450d00200028025c450d0020002802582d000041c001490d010b10000b200041206a200041d8006a10202000280224220141054f044010000b200028022021020340200104402001417f6a210120022d00002003410874722103200241016a21020c010b0b200041d8006a10172101200041206a2003410c6c20006a418c026a100f101c200110180c010b10000b102120004190036a24000b9b0101047f230041106b220124002001200036020c2000047f41e008200041086a2202411076220041e0082802006a220336020041dc0841dc08280200220420026a41076a417871220236020002400240200341107420024d044041e008200341016a360200200041016a21000c010b2000450d010b200040000d0010000b20042001410c6a4104103a41086a0541000b2100200141106a240020000b0c00200020012002411c10220bc90202067f017e230041106b220324002001280208220520024b0440200341086a2001105320012003280208200328020c102d36020c200320011053410021052001027f410020032802002207450d001a410020032802042208200128020c2206490d001a200820062006417f461b210420070b360210200141146a2004360200200141003602080b200141106a210603402001280214210402402005200249044020040d01410021040b200020062802002004411410221a200341106a24000f0b20032001105341002104027f410020032802002205450d001a410020032802042208200128020c2207490d001a200820076b2104200520076a0b2105200120043602142001200536021020032006410020052004102d10522001200329030022093702102001200128020c2009422088a76a36020c2001200128020841016a22053602080c000b000b850102027f017e230041106b220124002000101e024002402000101f450d002000280204450d0020002802002d000041c001490d010b10000b200141086a20001020200128020c220041094f044010000b200128020821020340200004402000417f6a210020023100002003420886842103200241016a21020c010b0b200141106a240020030b3901027e42a5c688a1c89ca7f94b210103402000300000220250450440200041016a2100200142b383808080207e20028521010c010b0b20010b0e002000101a410147044010000b0be40a010e7f230041d0016b22042400200010231a20004282a8c5b8cfb2f1993537039801200041a0016a1023210c200441186a10242000290398011025220928020c200941106a28020047044010000b02400240200928020022022009280204220510092207450d002007102621030340200120036a41003a00002007200141016a2201470d000b2002200520032001100a417f460d0041002102200441a8016a2004200341016a200120036a2003417f736a1012220541001013200c200441a8016a1014370300200441a8016a200541011013200441a8016a200041a8016a101b200441e0006a200541021013200441e0006a1027410a47044010000b200041b4016a210103402002410a470440200441c8006a10192103200441a8016a200441e0006a20021013200441a8016a2003101b2001200310282001410c6a2101200241016a21020c010b0b200441306a20054103101302402004280234450d0020042802302d000041c001490d00200041b0026a2108200041ac026a210e20044188016a200441306a410110292106200441f8006a200441306a41001029210d200441d4006a210b200628020421010340200d280204200146410020062802082202200d280208461b0d03200441e0006a20012002411c10222101200441c8006a10192105200b1019210a20011027410247044010000b200441c0016a10192102200441a8016a200141001013200441a8016a2002101b20052002102820044198016a10192102200441a8016a200141011013200441a8016a2002101b200a200210280240200828020022014504402008220121020c010b20082102034002402005200141106a2203102a0440200128020022030d01200121020c030b20032005102a450d02200141046a210220012802042203450d02200221010b20012102200321010c000b000b20022802004504404128102622032004290348370210200341186a200441d0006a2802003602002005102b200341246a200b41086a2802003602002003411c6a200b290200370200200a102b200e200120022003102c0b20062006280204220120062802086a410020011b22013602042006280200220204402006200236020820012002102d21032006027f200628020422054504404100210241000c010b4100210241002006280208220a2003490d001a200a20032003417f461b210220050b2201ad2002ad42208684370204200641002006280200220320026b2202200220034b1b3602000c0105200641003602080c010b000b000b10000c010b410021070b200928020c22010440200920013602100b024020070d00200c2000290300370300200041a8016a200041086a100e1a41887f2101034020010440200020016a220241ac026a2002418c016a100e1a2001410c6a21010c010b0b20004190016a2106200041ac026a2102200028028c0121010240200041b4026a280200450d0020002802ac0221032000200041b0026a22053602ac02200041003602b40220052802002107200541003602002007410036020820032802042205200320051b2105034020052203450d0120012006470440200341106a200141106a100e21072003411c6a2001411c6a100e1a024020032802082205450440410021050c010b2003200528020022084604402005410036020020052802042208450d012008102e21050c010b200541003602042008450d002008102e21050b2002200441a8016a2007102f2107200220042802a80120072003102c2001103021010c010b0b0340200328020822030d000b200621010b034020012006460d0141281026220341106a2205200141106a10312002200441a8016a2005102f2105200220042802a80120052003102c2001103021010c000b000b200441d0016a240020000bdb05010c7f23004190016b22022400200241186a10242101200241e8006a22044100360200200241e0006a22064200370300200241d8006a2207420037030020024200370350200241d0006a2000290398011032210320022802502105200341046a103320012005103420012000290398011025220528020c200541106a28020047044010000b200528020421082005280200210920021024210320044100360200200642003703002007420037030020024200370350200241d0006a4100103520002903a001103220024180016a200041a8016a2204100f1036200041b4016a220710372201200041ac026a220a103820014101103521012002280250210b200141046a103341011026220141fe013a0000200328020c200341106a28020047044010000b2003280204220641016a220c20032802084b047f2003200c103920032802040520060b20032802006a20014101103a1a2003200328020441016a3602042003200141016a200b20016b6a103420034104103b2101200241e8006a4100360200200241e0006a4200370300200241d8006a420037030020024200370350200241d0006a20002903a0011032200241406b2004100f1036200710372207200a1038200120022802501034200120002903a0011025200241306a2004100f103c410a103b210441b40121010340200141ac02470440200420024180016a200020016a100f103c1a2001410c6a21010c010b0b2004200041b4026a280200103b2106200041b0026a210420002802ac02210103402001200447044020064102103b20024180016a200141106a100f103c200241f0006a2001411c6a100f103c1a2001103021010c010b0b200741046a10330240200328020c2003280210460440200328020021010c010b100020032802002101200328020c2003280210460d0010000b2009200820012003280204100b200328020c22010440200320013602100b200528020c22010440200520013602100b20024190016a24000b190020004200370200200041086a41003602002000102b20000b2501017f02402000280204450d0020002802002d000041c001490d002000103d21010b20010ba10201057f230041206b22022400024002402000280204044020002802002d000041c001490d010b200241086a10191a0c010b200241186a200010202000103e21030240024002400240200228021822000440200228021c220520034f0d010b41002100200241106a410036020020024200370308410021050c010b200241106a4100360200200242003703082000200520032003417f461b22046a21052004410a4b0d010b200220044101743a0008200241086a41017221030c010b200441106a4170712206102621032002200436020c20022006410172360208200220033602100b03402000200546450440200320002d00003a0000200341016a2103200041016a21000c010b0b200341003a00000b2001200241086a1028200241206a24000baa0101047f230041e0006b22012400200141186a10242102200141d8006a4100360200200141d0006a4200370300200141c8006a420037030020014200370340200141406b200141306a2000100f1036210320012802402104200341046a10332002200410342002200141086a2000100f103c220028020c200041106a28020047044010000b20002802002000280204100c200028020c22020440200020023602100b200141e0006a24000b4301017f230041206b22022400200241086a200028020020002802042802001013200241086a2001101b20002802042200200028020041016a360200200241206a24000b4101017f200028020445044010000b0240200028020022012d0000418101470d00200028020441014d047f100020002802000520010b2c00014100480d0010000b0b980101037f200028020445044041000f0b2000101e200028020022022c0000220141004e044020014100470f0b027f4101200141807f460d001a200141ff0171220341b7014d0440200028020441014d047f100020002802000520020b2d00014100470f0b4100200341bf014b0d001a2000280204200141ff017141ca7e6a22014d047f100020002802000520020b20016a2d00004100470b0bd50101047f2001103e2204200128020422024b04401000200128020421020b200128020021052000027f02400240200204404100210120052c00002203417f4a0d01027f200341ff0171220141bf014d04404100200341ff017141b801490d011a200141c97e6a0c010b4100200341ff017141f801490d001a200141897e6a0b41016a21010c010b4101210120050d000c010b41002103200120046a20024b0d0020022001490d00410020022004490d011a200120056a2103200220016b20042004417f461b0c010b41000b360204200020033602000b880101037f41cc08410136020041d0082802002100034020000440034041d40841d4082802002201417f6a2202360200200141014845044041cc084100360200200020024102746a22004184016a280200200041046a28020011020041cc08410136020041d00828020021000c010b0b41d408412036020041d008200028020022003602000c010b0b0b730020004200370210200042ffffffff0f370208200020023602042000200136020002402003410871450d002000105020024f0d002003410471044010000c010b200042003702000b02402003411071450d002000105020024d0d0020034104710440100020000f0b200042003702000b20000b4c01037f200041086a10191a200041146a21012000418c016a210203402001101921032001410c6a21012003410c6a2002470d000b20004190016a220142003702002000200136028c0120000b29002000410036020820004200370200200041001039200041146a41003602002000420037020c20000b2a01017f2000420020011005200028020422026a104342002001200220002802006a10062000104420000b0b002000410120001b10110b210002402000280204044020002802002d000041bf014b0d010b10000b2000103d0b5b00024020002d0000410171450440200041003b01000c010b200028020841003a00002000410036020420002d0000410171450d00200041003602000b20002001290200370200200041086a200141086a2802003602002001102b0be70101037f230041106b2204240020004200370200200041086a410036020020012802042103024002402002450440200321020c010b410021022003450d002003210220012802002d000041c001490d00200441086a2001105320004100200428020c2201200428020822022001102d22032003417f461b20024520012003497222031b220536020820004100200220031b3602042000200120056b3602000c010b20012802002103200128020421012000410036020020004100200220016b20034520022001497222021b36020820004100200120036a20021b3602040b200441106a240020000bb20101067f02400240200128020420012d00002202410176200241017122031b2205200028020420002d00002202410176200241017122041b2206200520064922071b2202450d002000280208200041016a20041b21002001280208200141016a20031b210103402002450d0120002d0000220320012d00002204460440200141016a2101200041016a21002002417f6a21020c010b0b200320046b22020d010b417f200720062005491b21020b2002411f760b2201017f03402001410c470440200020016a4100360200200141046a21010c010b0b0baf0201027f20032001360208200342003702002002200336020020002802002802002201044020002001360200200228020021030b2003200320002802042205463a000c03400240024020032005460d00200328020822012d000c0d002001200128020822022802002204460440024020022802042204450d0020042d000c0d002004410c6a21030c030b200320012802004704402001104c2001280208220128020821020b200141013a000c200241003a000c2002104d0c010b02402004450d0020042d000c0d002004410c6a21030c020b200320012802004604402001104d2001280208220128020821020b200141013a000c200241003a000c2002104c0b2000200028020841016a3602080f0b200141013a000c200220022005463a000c200341013a0000200221030c000b000b2701017f230041206b22022400200241086a200020014114102210502100200241206a240020000b1d01017f03402000220128020022000d00200128020422000d000b20010b5c01017f0240200028020422030440034002402002200341106a102a044020032802002200450d040c010b200328020422000d0020012003360200200341046a0f0b200021030c000b000b200041046a21030b2001200336020020030b3601017f024020002802042201044003402001220028020022010d000c020b000b0340200020002802082200280200470d000b0b20000b160020002001100f1a2000410c6a2001410c6a100f1a0b8b0102027f017e4101210320014280015a0440034020012004845045044020044238862001420888842101200241016a2102200442088821040c010b0b200241384f047f2002103f20026a0520020b41016a21030b027f200041186a28020022020440200041086a280200200041146a280200200210400c010b20000b2202200228020020036a36020020000bea0101047f230041106b22042400200028020422012000280210220241087641fcffff07716a2103027f410020012000280208460d001a2003280200200241ff07714102746a0b2101200441086a20001041200428020c210203400240200120024604402000410036021420002802082103200028020421010340200320016b41027522024103490d022000200141046a22013602040c000b000b200141046a220120032802006b418020470d0120032802042101200341046a21030c010b0b2002417f6a220241014d04402000418004418008200241016b1b3602100b200020011042200441106a24000b1300200028020820014904402000200110390b0bc30c02077f027e230041306b22042400200041046a2107027f20014101460440200041086a280200200041146a280200200041186a220228020022031040280200210120022003417f6a360200200710454180104f044020072000410c6a280200417c6a10420b200141384f047f2001103f20016a0520010b41016a2102200041186a28020022010440200041086a280200200041146a280200200110400c020b20000c010b0240200710450d00200041146a28020022014180084f0440200020014180786a360214200041086a2201280200220228020021032001200241046a360200200420033602182007200441186a10460c010b2000410c6a2802002202200041086a2802006b4102752203200041106a2205280200220620002802046b220141027549044041802010262105200220064704400240200028020c220120002802102202470d0020002802082203200028020422064b04402000200320012003200320066b41027541016a417e6d41027422026a1047220136020c2000200028020820026a3602080c010b200441186a200220066b2201410175410120011b22012001410276200041106a10482102200028020c210320002802082101034020012003470440200228020820012802003602002002200228020841046a360208200141046a21010c010b0b200029020421092000200229020037020420022009370200200029020c21092000200229020837020c2002200937020820021049200028020c21010b200120053602002000200028020c41046a36020c0c020b02402000280208220120002802042202470d00200028020c2203200028021022064904402000200120032003200620036b41027541016a41026d41027422026a104a22013602082000200028020c20026a36020c0c010b200441186a200620026b2201410175410120011b2201200141036a410276200041106a10482102200028020c210320002802082101034020012003470440200228020820012802003602002002200228020841046a360208200141046a21010c010b0b200029020421092000200229020037020420022009370200200029020c21092000200229020837020c2002200937020820021049200028020821010b2001417c6a2005360200200020002802082201417c6a22023602082002280200210220002001360208200420023602182007200441186a10460c010b20042001410175410120011b200320051048210241802010262106024020022802082201200228020c2203470d0020022802042205200228020022084b04402002200520012005200520086b41027541016a417e6d41027422036a104722013602082002200228020420036a3602040c010b200441186a200320086b2201410175410120011b22012001410276200241106a280200104821032002280208210520022802042101034020012005470440200328020820012802003602002003200328020841046a360208200141046a21010c010b0b20022902002109200220032902003702002003200937020020022902082109200220032902083702082003200937020820031049200228020821010b200120063602002002200228020841046a360208200028020c2105034020002802082005460440200028020421012000200228020036020420022001360200200228020421012002200536020420002001360208200029020c21092000200229020837020c2002200937020820021049052005417c6a210502402002280204220120022802002203470d0020022802082206200228020c22084904402002200120062006200820066b41027541016a41026d41027422036a104a22013602042002200228020820036a3602080c010b200441186a200820036b2201410175410120011b2201200141036a4102762002280210104821062002280208210320022802042101034020012003470440200428022020012802003602002004200428022041046a360220200141046a21010c010b0b20022902002109200220042903183702002002290208210a20022004290320370208200420093703182004200a37032020061049200228020421010b2001417c6a200528020036020020022002280204417c6a3602040c010b0b0b200441186a20071041200428021c410036020041012102200041186a0b2201200128020020026a360200200441306a240020000ba10101037f41012103024002400240200128020420012d00002202410176200241017122041b220241014d0440200241016b0d032001280208200141016a20041b2c0000417f4c0d010c030b200241374b0d010b200241016a21030c010b2002103f20026a41016a21030b027f200041186a28020022010440200041086a280200200041146a280200200110400c010b20000b2201200128020020036a36020020000b4a01027f230041106b2203240020004100103521000340200241f8004645044020002003200120026a100f10361a2002410c6a21020c010b0b2000410110352102200341106a240020020bba0101047f230041406a2202240002402001280208450440200041186a28020022030440200041086a280200200041146a2802002003104021000b2000200028020041016a3602000c010b2000410010352103200141046a2104200241146a2105200128020021000340200020044604402003410110351a05200241086a200041106a1031200341001035200241306a200241086a100f1036200241206a2005100f1036410110351a2000103021000c010b0b0b200241406b24000b2f01017f200028020820014904402001101120002802002000280204103a210220002001360208200020023602000b0bfc0801067f03400240200020046a2105200120046a210320022004460d002003410371450d00200520032d00003a0000200441016a21040c010b0b200220046b210602402005410371220745044003402006411049450440200020046a2203200120046a2205290200370200200341086a200541086a290200370200200441106a2104200641706a21060c010b0b027f2006410871450440200120046a2103200020046a0c010b200020046a2205200120046a2204290200370200200441086a2103200541086a0b21042006410471044020042003280200360200200341046a2103200441046a21040b20064102710440200420032f00003b0000200341026a2103200441026a21040b2006410171450d01200420032d00003a000020000f0b024020064120490d002007417f6a220741024b0d00024002400240024002400240200741016b0e020102000b2005200120046a220328020022073a0000200541016a200341016a2f00003b0000200041036a2108200220046b417d6a2106034020064111490d03200420086a2203200120046a220541046a2802002202410874200741187672360200200341046a200541086a2802002207410874200241187672360200200341086a2005410c6a28020022024108742007411876723602002003410c6a200541106a2802002207410874200241187672360200200441106a2104200641706a21060c000b000b2005200120046a220328020022073a0000200541016a200341016a2d00003a0000200041026a2108200220046b417e6a2106034020064112490d03200420086a2203200120046a220541046a2802002202411074200741107672360200200341046a200541086a2802002207411074200241107672360200200341086a2005410c6a28020022024110742007411076723602002003410c6a200541106a2802002207411074200241107672360200200441106a2104200641706a21060c000b000b2005200120046a28020022073a0000200041016a21082004417f7320026a2106034020064113490d03200420086a2203200120046a220541046a2802002202411874200741087672360200200341046a200541086a2802002207411874200241087672360200200341086a2005410c6a28020022024118742007410876723602002003410c6a200541106a2802002207411874200241087672360200200441106a2104200641706a21060c000b000b200120046a41036a2103200020046a41036a21050c020b200120046a41026a2103200020046a41026a21050c010b200120046a41016a2103200020046a41016a21050b20064110710440200520032d00003a00002005200328000136000120052003290005370005200520032f000d3b000d200520032d000f3a000f200541106a2105200341106a21030b2006410871044020052003290000370000200541086a2105200341086a21030b2006410471044020052003280000360000200541046a2105200341046a21030b20064102710440200520032f00003b0000200541026a2105200341026a21030b2006410171450d00200520032d00003a00000b20000b9d0201057f2001044020002802042105200041106a2802002202200041146a280200220349044020022001ad2005ad422086843702002000200028021041086a36021020000f0b027f41002002200028020c22046b410375220641016a2202200320046b2203410275220420042002491b41ffffffff01200341037541ffffffff00491b2204450d001a200441037410260b2102200220064103746a22032001ad2005ad4220868437020020032000280210200028020c22066b22016b2105200220044103746a2102200341086a2103200141014e0440200520062001103a1a0b20002002360214200020033602102000200536020c20000f0b200041001001200028020422016a104341004100200120002802006a10022000104420000b4e01037f20002001280208200141016a20012d0000220241017122031b22042001280204200241017620031b22011003200028020422026a104320042001200220002802006a10042000104420000b800101047f230041106b2201240002402000280204450d0020002802002d000041c001490d00200141086a20001053200128020c210003402000450d01200141002001280208220320032000102d22046a20034520002004497222031b3602084100200020046b20031b2100200241016a21020c000b000b200141106a240020020bff0201037f200028020445044041000f0b2000101e41012102024020002802002c00002201417f4a0d00200141ff0171220341b7014d0440200341807f6a0f0b02400240200141ff0171220141bf014d0440024020002802042201200341c97e6a22024d047f100020002802040520010b4102490d0020002802002d00010d0010000b200241054f044010000b20002802002d000145044010000b4100210241b7012101034020012003460440200241384f0d030c0405200028020020016a41ca7e6a2d00002002410874722102200141016a21010c010b000b000b200141f7014d0440200341c07e6a0f0b024020002802042201200341897e6a22024d047f100020002802040520010b4102490d0020002802002d00010d0010000b200241054f044010000b20002802002d000145044010000b4100210241f701210103402001200346044020024138490d0305200028020020016a418a7e6a2d00002002410874722102200141016a21010c010b0b0b200241ff7d490d010b10000b20020b1e01017f03402000044020004108762100200141016a21010c010b0b20010b25002000200120026a417f6a220241087641fcffff07716a280200200241ff07714102746a0b4f01037f20012802042203200128021020012802146a220441087641fcffff07716a21022000027f410020032001280208460d001a2002280200200441ff07714102746a0b360204200020023602000b2501017f200028020821020340200120024645044020002002417c6a22023602080c010b0b0b3601017f200028020820014904402001101120002802002000280204103a210220002001360208200020023602000b200020013602040b7a01037f0340024020002802102201200028020c460d00200141786a2802004504401000200028021021010b200141786a22022002280200417f6a220336020020030d002000200236021020002001417c6a2802002201200028020420016b220210016a1043200120002802006a22012002200110020c010b0b0b2801017f200028020820002802046b2201410874417f6a410020011b200028021420002802106a6b0ba10202057f017e230041206b22052400024020002802082202200028020c2203470d0020002802042204200028020022064b04402000200420022004200420066b41027541016a417e6d41027422036a104722023602082000200028020420036a3602040c010b200541086a200320066b2202410175410120021b220220024102762000410c6a10482103200028020821042000280204210203402002200446450440200328020820022802003602002003200328020841046a360208200241046a21020c010b0b20002902002107200020032902003702002003200737020020002902082107200020032902083702082003200737020820031049200028020821020b200220012802003602002000200028020841046a360208200541206a24000b2501017f200120006b2201410275210320010440200220002001104b0b200220034102746a0b4f01017f2000410036020c200041106a2003360200200104402001410274102621040b200020043602002000200420024102746a22023602082000200420014102746a36020c2000200236020420000b2b01027f200028020821012000280204210203402001200247044020002001417c6a22013602080c010b0b0b1b00200120006b22010440200220016b220220002001104b0b20020b8d0301037f024020002001460d00200120006b20026b410020024101746b4d0440200020012002103a1a0c010b20002001734103712103027f024020002001490440200020030d021a410021030340200120036a2105200020036a2204410371450440200220036b210241002103034020024104490d04200320046a200320056a280200360200200341046a21032002417c6a21020c000b000b20022003460d04200420052d00003a0000200341016a21030c000b000b024020030d002001417f6a21040340200020026a22034103714504402001417c6a21032000417c6a2104034020024104490d03200220046a200220036a2802003602002002417c6a21020c000b000b2002450d042003417f6a200220046a2d00003a00002002417f6a21020c000b000b2001417f6a210103402002450d03200020026a417f6a200120026a2d00003a00002002417f6a21020c000b000b200320056a2101200320046a0b210303402002450d01200320012d00003a00002002417f6a2102200341016a2103200141016a21010c000b000b0b5101027f200020002802042201280200220236020420020440200220003602080b200120002802083602082000280208220220022802002000474102746a200136020020002001360208200120003602000b5101027f200020002802002201280204220236020020020440200220003602080b200120002802083602082000280208220220022802002000474102746a200136020020002001360208200120003602040b3501017f230041106b220041f0880436020c41d808200028020c41076a417871220036020041dc08200036020041e0083f003602000b100020020440200020012002103a1a0b0b2e01017f200028020445044041000f0b4101210120002802002c0000417f4c047f200010512000103e6a0520010b0b5b00027f027f41002000280204450d001a410020002802002c0000417f4a0d011a20002802002d0000220041bf014d04404100200041b801490d011a200041c97e6a0c010b4100200041f801490d001a200041897e6a0b41016a0b0b5b01027f2000027f0240200128020022054504400c010b200220036a200128020422014b0d0020012002490d00410020012003490d011a200220056a2104200120026b20032003417f461b0c010b41000b360204200020043602000b2101017f2001103e220220012802044b044010000b2000200120011051200210520b0b5101004180080b4a696e69740073657447726f757056616c75650067657447726f75704e616d650073657447726f7570417272617956616c75650067657447726f75704172726179496e64657856616c7565";

    public static String BINARY = BINARY_0;

    public static final String FUNC_GETGROUPNAME = "getGroupName";

    public static final String FUNC_SETGROUPARRAYVALUE = "setGroupArrayValue";

    public static final String FUNC_SETGROUPVALUE = "setGroupValue";

    public static final String FUNC_GETGROUPARRAYINDEXVALUE = "getGroupArrayIndexValue";

    protected ReferenceDataTypeStructMultipleContract(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected ReferenceDataTypeStructMultipleContract(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteCall<String> getGroupName() {
        final WasmFunction function = new WasmFunction(FUNC_GETGROUPNAME, Arrays.asList(), String.class);
        return executeRemoteCall(function, String.class);
    }

    public RemoteCall<TransactionReceipt> setGroupArrayValue(String oneValue, String twoValue) {
        final WasmFunction function = new WasmFunction(FUNC_SETGROUPARRAYVALUE, Arrays.asList(oneValue,twoValue), Void.class);
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> setGroupArrayValue(String oneValue, String twoValue, BigInteger vonValue) {
        final WasmFunction function = new WasmFunction(FUNC_SETGROUPARRAYVALUE, Arrays.asList(oneValue,twoValue), Void.class);
        return executeRemoteCallTransaction(function, vonValue);
    }

    public static RemoteCall<ReferenceDataTypeStructMultipleContract> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        String encodedConstructor = WasmFunctionEncoder.encodeConstructor(BINARY, Arrays.asList());
        return deployRemoteCall(ReferenceDataTypeStructMultipleContract.class, web3j, credentials, contractGasProvider, encodedConstructor);
    }

    public static RemoteCall<ReferenceDataTypeStructMultipleContract> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        String encodedConstructor = WasmFunctionEncoder.encodeConstructor(BINARY, Arrays.asList());
        return deployRemoteCall(ReferenceDataTypeStructMultipleContract.class, web3j, transactionManager, contractGasProvider, encodedConstructor);
    }

    public static RemoteCall<ReferenceDataTypeStructMultipleContract> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider, BigInteger initialVonValue) {
        String encodedConstructor = WasmFunctionEncoder.encodeConstructor(BINARY, Arrays.asList());
        return deployRemoteCall(ReferenceDataTypeStructMultipleContract.class, web3j, credentials, contractGasProvider, encodedConstructor, initialVonValue);
    }

    public static RemoteCall<ReferenceDataTypeStructMultipleContract> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider, BigInteger initialVonValue) {
        String encodedConstructor = WasmFunctionEncoder.encodeConstructor(BINARY, Arrays.asList());
        return deployRemoteCall(ReferenceDataTypeStructMultipleContract.class, web3j, transactionManager, contractGasProvider, encodedConstructor, initialVonValue);
    }

    public RemoteCall<TransactionReceipt> setGroupValue(String myGroupName, Uint64 myGroupId) {
        final WasmFunction function = new WasmFunction(FUNC_SETGROUPVALUE, Arrays.asList(myGroupName,myGroupId), Void.class);
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> setGroupValue(String myGroupName, Uint64 myGroupId, BigInteger vonValue) {
        final WasmFunction function = new WasmFunction(FUNC_SETGROUPVALUE, Arrays.asList(myGroupName,myGroupId), Void.class);
        return executeRemoteCallTransaction(function, vonValue);
    }

    public RemoteCall<String> getGroupArrayIndexValue(Uint32 index) {
        final WasmFunction function = new WasmFunction(FUNC_GETGROUPARRAYINDEXVALUE, Arrays.asList(index), String.class);
        return executeRemoteCall(function, String.class);
    }

    public static ReferenceDataTypeStructMultipleContract load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new ReferenceDataTypeStructMultipleContract(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static ReferenceDataTypeStructMultipleContract load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new ReferenceDataTypeStructMultipleContract(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
