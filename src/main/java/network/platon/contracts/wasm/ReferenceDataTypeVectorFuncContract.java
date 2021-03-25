package network.platon.contracts.wasm;

import com.platon.abi.wasm.WasmFunctionEncoder;
import com.platon.abi.wasm.datatypes.WasmFunction;
import com.platon.crypto.Credentials;
import com.platon.protocol.Web3j;
import com.platon.protocol.core.RemoteCall;
import com.platon.protocol.core.methods.response.TransactionReceipt;
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
public class ReferenceDataTypeVectorFuncContract extends WasmContract {
    private static String BINARY_0 = "0x0061736d0100000001591060027f7f0060017f0060017f017f60037f7f7f0060037f7f7f017f60000060027f7f017f60047f7f7f7f017f60047f7f7f7f0060027f7e0060017f017e60037e7e7f006000017f60027f7e017f60017e017f60027e7e017f02a9020d03656e760c706c61746f6e5f70616e6963000503656e760d726c705f6c6973745f73697a65000203656e760f706c61746f6e5f726c705f6c697374000303656e760e726c705f62797465735f73697a65000603656e7610706c61746f6e5f726c705f6279746573000303656e760d726c705f753132385f73697a65000f03656e760f706c61746f6e5f726c705f75313238000b03656e7617706c61746f6e5f6765745f696e7075745f6c656e677468000c03656e7610706c61746f6e5f6765745f696e707574000103656e7617706c61746f6e5f6765745f73746174655f6c656e677468000603656e7610706c61746f6e5f6765745f7374617465000703656e7610706c61746f6e5f7365745f7374617465000803656e760d706c61746f6e5f72657475726e0000035251050100060800060704010103030000010001010100020302050204030a0a00020200020101020e0009010009010d05070100000602000404030000000400010001020400000200040701040305030202080405017001070705030100020608017f0141d089040b073904066d656d6f72790200115f5f7761736d5f63616c6c5f63746f7273000d0f5f5f66756e63735f6f6e5f65786974003b06696e766f6b650025090c010041010b060e1a1b1c1e1f0abe6451040010590b0300010bd20302077f017e230041306b22072400200041186a21082000280218210402402000411c6a2802002203200041206a2205280200490440200320044604402004200110101a2000200028021c410c6a36021c0c020b2008200420032004410c6a10112004200420014d047f2001410c6a2001200028021c20014b1b0520010b10120c010b024020072008200320046b410c6d41016a101341002005101422022802082200200228020c2203470d0020022802042205200228020022064b04402002200520002005200520066b410c6d41016a417e6d410c6c22036a101522003602082002200228020420036a3602040c010b200741186a200320066b2200410c6d410174410120001b22002000410276200241106a28020010142103200228020821062002280204210003402000200646450440200328020822052000290200370200200541086a200041086a2802003602002000101620032003280208410c6a3602082000410c6a21000c010b0b20022902002109200220032902003702002003200937020020022902082109200220032902083702082003200937020820031017200228020821000b2000200110101a20022002280208410c6a3602082008200220041018200210170b200741306a24000ba10101037f20004200370200200041086a2202410036020020012d0000410171450440200020012902003702002002200141086a28020036020020000f0b20012802082103024020012802042201410a4d0440200020014101743a0000200041016a21020c010b200141106a4170712204102421022000200136020420002004410172360200200020023602080b200220032001105a200120026a41003a000020000b970101037f20012000280204220520036b410c6d2206410c6c6a2103200521040340200320024f0440200541746a21042006410c6c2103200141746a21000340200304402004200020036a1021200441746a2104200341746a21030c010b0b0520042003290200370200200441086a200341086a2802003602002003101620002000280204410c6a22043602042003410c6a21030c010b0b0b8c0201047f20002001470440200128020420012d00002202410176200241017122041b2102200141016a210320012802082105410a21012005200320041b210420002d0000410171220304402000280200417e71417f6a21010b200220014d0440027f2003044020002802080c010b200041016a0b21012002044020012004200210580b200120026a41003a000020002d00004101710440200020023602040f0b200020024101743a00000f0b416f2103200141e6ffffff074d0440410b20014101742201200220022001491b220141106a4170712001410b491b21030b20031024220120042002105a200020023602042000200341017236020020002001360208200120026a41003a00000b0b3101017f2001200028020820002802006b410c6d2200410174220220022001491b41d5aad5aa01200041aad5aad500491b0b4c01017f2000410036020c200041106a2003360200200104402001102221040b20002004360200200020042002410c6c6a2202360208200020042001410c6c6a36020c2000200236020420000b2600034020002001464504402002200010212002410c6a21022000410c6a21000c010b0b20020b2201017f03402001410c470440200020016a4100360200200141046a21010c010b0b0b2b01027f20002802082101200028020421020340200120024704402000200141746a22013602080c010b0b0bb00101027f20002802002002200141046a10232000280204210303402002200346450440200128020822042002290200370200200441086a200241086a2802003602002002101620012001280208410c6a3602082002410c6a21020c010b0b200028020021022000200128020436020020012002360204200028020421022000200128020836020420012002360208200028020821022000200128020c3602082001200236020c200120012802043602000bbc02010a7f230041206b22072400024020012802002204450d00200041186a210620002802182101200041206a22032802002000411c6a28020022056b410c6d20044f0440200520016b220a410c6d220820042203490440200820046b21032005210903402009200210101a2000200028021c410c6a220936021c200341016a220b20034f210c200b2103200c0d000b20082103200a450d020b20062001200520012004410c6c22046a1011200120024d0440200220046a2002200028021c20024b1b21020b03402003450d022001200210122001410c6a21012003417f6a21030c000b000b200741086a2006200520016b410c6d20046a10134100200310142203280208210003402000200210101a20032003280208410c6a22003602082004417f6a22040d000b2006200320011018200310170b200741206a24000b0c002000200128021810101a0b120020002001411c6a28020041746a10101a0b1400200041186a2000411c6a28020041746a101d0b0900200020013602040b2101017f200041186a20002802182201410c6a2000411c6a28020020011015101d0b0900200041186a10200b0b0020002000280200101d0b5b00024020002d0000410171450440200041003b01000c010b200028020841003a00002000410036020420002d0000410171450d00200041003602000b20002001290200370200200041086a200141086a280200360200200110160b09002000410c6c10240b4a01017f03402000200146450440200228020041746a2203200141746a2201290200370200200341086a200141086a280200360200200110162002200228020041746a3602000c010b0b0b0b002000410120001b10260bc10602057f017e23004180016b22002400105910072201102622021008200041206a200020022001102722014100102802400240200041206a10292205500d00418008102a200551044020014101102b0c020b418508102a2005510440200041c8006a102c21022001102d410247044010000b200041206a200141011028200041206a2002102e200041206a102f2101200041206a200041e0006a20021010100f200110300c020b419708102a200551044020004200370360200041e8006a102c21022001102d410347044010000b200041206a2001410110282000200041206a1029370360200041206a200141021028200041206a2002102e200041206a102f210120002903602105200041c8006a20021010210220002005370318200041206a200041186a20021019200110300c020b41ad08102a200551044020011031200041206a102f21022000413c6a280200210320002802382104200041e0006a10322201200320046b410c6dad220510331034200120051035200128020c200141106a28020047044010000b20012802002001280204100c200128020c22030440200120033602100b200210300c020b41bd08102a20055104402001102d410247044010000b200041206a200141011028200041206a10292105200041206a102f210120002005370348200041e0006a200041206a280218200041c8006a280200410c6c6a10101a200041e0006a1036200110300c020b41ca08102a20055104402001410210370c020b41da08102a20055104402001410310370c020b41e908102a200551044020014104102b0c020b41fd08102a200551044020014105102b0c020b418f09102a200551044020014106102b0c020b41a109102a2005520d0020011031200041206a102f21022000413c6a280200210320002802382104200041c8006a10322101200041f8006a4100360200200041f0006a4200370300200041e8006a420037030020004200370360200041e0006a2003200446ad2205103820002802602103200041e0006a410472103920012003103420012005103a220128020c200141106a28020047044010000b20012802002001280204100c200128020c22030440200120033602100b200210300c010b10000b103b20004180016a24000b9b0101047f230041106b220124002001200036020c2000047f41c809200041086a2202411076220041c8092802006a220336020041c40941c409280200220420026a41076a417871220236020002400240200341107420024d044041c809200341016a360200200041016a21000c010b2000450d010b200040000d0010000b20042001410c6a4104104941086a0541000b2100200141106a240020000b0c00200020012002411c103c0bc90202067f017e230041106b220324002001280208220520024b0440200341086a2001103f20012003280208200328020c104036020c20032001103f410021052001027f410020032802002207450d001a410020032802042208200128020c2206490d001a200820062006417f461b210420070b360210200141146a2004360200200141003602080b200141106a210603402001280214210402402005200249044020040d01410021040b2000200628020020044114103c1a200341106a24000f0b20032001103f41002104027f410020032802002205450d001a410020032802042208200128020c2207490d001a200820076b2104200520076a0b21052001200436021420012005360210200320064100200520041040105d2001200329030022093702102001200128020c2009422088a76a36020c2001200128020841016a22053602080c000b000b870202047f017e230041106b220324002000103d024002402000280204450d002000103d0240200028020022022c0000220141004e044020010d010c020b200141807f460d00200141ff0171220441b7014d0440200028020441014d04401000200028020021020b20022d00010d010c020b200441bf014b0d012000280204200141ff017141ca7e6a22014d04401000200028020021020b200120026a2d0000450d010b2000280204450d0020022d000041c001490d010b10000b200341086a2000103e200328020c220041094f044010000b200328020821010340200004402000417f6a210020013100002005420886842105200141016a21010c010b0b200341106a240020050b3901027e42a5c688a1c89ca7f94b210103402000300000220250450440200041016a2100200142b383808080207e20028521010c010b0b20010b2f01017f230041306b2202240020001031200241086a102f2100200241086a200111010020001030200241306a24000b190020004200370200200041086a41003602002000101620000b800101047f230041106b2201240002402000280204450d0020002802002d000041c001490d00200141086a2000103f200128020c210003402000450d01200141002001280208220320032000104022046a20034520002004497222031b3602084100200020046b20031b2100200241016a21020c000b000b200141106a240020020ba10201057f230041206b22022400024002402000280204044020002802002d000041c001490d010b200241086a102c1a0c010b200241186a2000103e2000104121030240024002400240200228021822000440200228021c220520034f0d010b41002100200241106a410036020020024200370308410021050c010b200241106a4100360200200242003703082000200520032003417f461b22046a21052004410a4b0d010b200220044101743a0008200241086a41017221030c010b200441106a4170712206102421032002200436020c20022006410172360208200220033602100b03402000200546450440200320002d00003a0000200341016a2103200041016a21000c010b0b200341003a00000b2001200241086a1021200241206a24000b9707010c7f23004190016b22042400200042003702182000428debc585c3a7f9dbf7003703102000410036020820004200370200200041206a4100360200200441186a1032220820002903101035200828020c200841106a28020047044010000b200041186a21052000411c6a210a0240200828020022032008280204220910092206450d002006102421020340200120026a41003a00002006200141016a2201470d000b2003200920022001100a417f460440410021010c010b024002402004200241016a200120026a2002417f736a10272202280204450d0020022802002d000041c001490d002002102d21012000280220200028021822036b410c6d20014904402005200441406b2001200028021c20036b410c6d200041206a101422011042200110170b200441e8006a2002410110432101200441d8006a2002410010432109200041206a210b20012802042102034020092802042002464100200128020822032009280208461b0d02200441406b20022003411c103c200441306a102c2203102e0240200028021c2202200028022049044020022004290330370200200241086a200441386a28020036020020031016200a200a280200410c6a3602000c010b200441f8006a2005200220052802006b410c6d220241016a10132002200b1014210220042802800122072004290330370200200741086a200441386a280200360200200310162004200428028001410c6a36028001200520021042200210170b20012001280204220220012802086a410020021b22023602042001280200220304402001200336020820022003104021072001027f2001280204220c4504404100210341000c010b410021034100200128020822022007490d001a200220072007417f461b2103200c0b2202ad2003ad42208684370204200141002001280200220720036b2203200320074b1b3602000c0105200141003602080c010b000b000b10000b200621010b200828020c22020440200820023602100b024020010d0020002802042206200028020022026b410c6d22032000280220200028021822016b410c6d4d04402003200a28020020016b410c6d22094b0440200220022009410c6c6a2203200110441a20032006200a10450c020b20052002200620011044101d0c010b200104402005102020004100360220200042003702180b20002005200310132203102222013602182000200136021c200020012003410c6c6a36022020022006200a10450b20044190016a240020000ba506010b7f230041e0006b22032400200341186a10322208200029031010331034200820002903101035200828020c200841106a28020047044010000b2008280204210a2008280200210b200310322101200341c8006a4100360200200341406b4200370300200341386a420037030020034200370330027f20002802182000411c6a2802004604402003410136023041010c010b200341306a41001046200028021c210420002802182102037f2002200446047f200341306a41011046200328023005200341306a200341d0006a2002101010472002410c6a21020c010b0b0b2106200341306a410472103941011024220241fe013a0000200128020c200141106a28020047044010000b200241016a21052001280204220441016a220720012802084b047f20012007104820012802040520040b20012802006a2002410110491a2001200128020441016a3602042001200620026b20056a10340240200028021c20002802186b220204402002410c6d21022001280204210420012802102205200141146a280200220649044020052002ad2004ad422086843702002001200128021041086a3602100c020b027f41002005200128020c22076b410375220941016a2205200620076b2206410275220720072005491b41ffffffff01200641037541ffffffff00491b2207450d001a200741037410240b2105200520094103746a22062002ad2004ad4220868437020020062001280210200128020c22096b22026b2104200520074103746a2105200641086a2106200241014e044020042009200210491a0b20012005360214200120063602102001200436020c0c010b200141001001200128020422026a104a41004100200220012802006a10022001104b0b200028021c2104200028021821020340200220044704402001200341306a20021010104c2002410c6a21020c010b0b0240200128020c2001280210460440200128020021020c010b100020012802002102200128020c2001280210460d0010000b200b200a20022001280204100b200128020c22020440200120023602100b200828020c22020440200820023602100b200041186a104d2000104d200341e0006a24000b0e002000102d410147044010000b0b29002000410036020820004200370200200041001048200041146a41003602002000420037020c20000b4f01027f230041206b22012400200141186a4100360200200141106a4200370300200141086a4200370300200142003703002001200010382001280200210220014104721039200141206a240020020b1300200028020820014904402000200110480b0b090020002001103a1a0bab0101037f230041e0006b22012400200141186a10322102200141d8006a4100360200200141d0006a4200370300200141c8006a420037030020014200370340200141406b200141306a20001010104720012802402103200141406b41047210392002200310342002200141086a20001010104c200228020c200241106a28020047044010000b20022802002002280204100c200228020c22000440200220003602100b200141e0006a24000b3b01017f230041406a2202240020001031200241086a102f2100200241306a200241086a2001110000200241306a103620001030200241406b24000b840102027f017e4101210320014280015a0440034020012004845045044020044238862001420888842101200241016a2102200442088821040c010b0b200241384f047f2002104e20026a0520020b41016a21030b200041186a28020022020440200041086a280200200041146a2802002002104f21000b2000200028020020036a3602000bea0101047f230041106b22042400200028020422012000280210220241087641fcffff07716a2103027f410020012000280208460d001a2003280200200241ff07714102746a0b2101200441086a20001050200428020c210203400240200120024604402000410036021420002802082103200028020421010340200320016b41027522024103490d022000200141046a22013602040c000b000b200141046a220120032802006b418020470d0120032802042101200341046a21030c010b0b2002417f6a220241014d04402000418004418008200241016b1b3602100b200020011051200441106a24000b2a01017f2000420020011005200028020422026a104a42002001200220002802006a10062000104b20000b880101037f41b409410136020041b8092802002100034020000440034041bc0941bc092802002201417f6a2202360200200141014845044041b4094100360200200020024102746a22004184016a280200200041046a28020011010041b409410136020041b80928020021000c010b0b41bc09412036020041b809200028020022003602000c010b0b0b730020004200370210200042ffffffff0f370208200020023602042000200136020002402003410871450d002000105b20024f0d002003410471044010000c010b200042003702000b02402003411071450d002000105b20024d0d0020034104710440100020000f0b200042003702000b20000b4101017f200028020445044010000b0240200028020022012d0000418101470d00200028020441014d047f100020002802000520010b2c00014100480d0010000b0bd50101047f200110412204200128020422024b04401000200128020421020b200128020021052000027f02400240200204404100210120052c00002203417f4a0d01027f200341ff0171220141bf014d04404100200341ff017141b801490d011a200141c97e6a0c010b4100200341ff017141f801490d001a200141897e6a0b41016a21010c010b4101210120050d000c010b41002103200120046a20024b0d0020022001490d00410020022004490d011a200120056a2103200220016b20042004417f461b0c010b41000b360204200020033602000b2101017f20011041220220012802044b044010000b200020012001105c2002105d0b2701017f230041206b22022400200241086a200020014114103c105b2100200241206a240020000bff0201037f200028020445044041000f0b2000103d41012102024020002802002c00002201417f4a0d00200141ff0171220341b7014d0440200341807f6a0f0b02400240200141ff0171220141bf014d0440024020002802042201200341c97e6a22024d047f100020002802040520010b4102490d0020002802002d00010d0010000b200241054f044010000b20002802002d000145044010000b4100210241b7012101034020012003460440200241384f0d030c0405200028020020016a41ca7e6a2d00002002410874722102200141016a21010c010b000b000b200141f7014d0440200341c07e6a0f0b024020002802042201200341897e6a22024d047f100020002802040520010b4102490d0020002802002d00010d0010000b200241054f044010000b20002802002d000145044010000b4100210241f701210103402001200346044020024138490d0305200028020020016a418a7e6a2d00002002410874722102200141016a21010c010b0b0b200241ff7d490d010b10000b20020b6701017f20002802002000280204200141046a1023200028020021022000200128020436020020012002360204200028020421022000200128020836020420012002360208200028020821022000200128020c3602082001200236020c200120012802043602000be70101037f230041106b2204240020004200370200200041086a410036020020012802042103024002402002450440200321020c010b410021022003450d002003210220012802002d000041c001490d00200441086a2001103f20004100200428020c2201200428020822022001104022032003417f461b20024520012003497222031b220536020820004100200220031b3602042000200120056b3602000c010b20012802002103200128020421012000410036020020004100200220016b20034520022001497222021b36020820004100200120036a20021b3602040b200441106a240020000b2600034020002001464504402002200010122002410c6a21022000410c6a21000c010b0b20020b2e00034020002001464504402002280200200010101a20022002280200410c6a3602002000410c6a21000c010b0b0bc10c02077f027e230041306b22042400200041046a2107024020014101460440200041086a280200200041146a280200200041186a22022802002203104f280200210120022003417f6a360200200710524180104f044020072000410c6a280200417c6a10510b200141384f047f2001104e20016a0520010b41016a2101200041186a2802002202450d01200041086a280200200041146a2802002002104f21000c010b0240200710520d00200041146a28020022014180084f0440200020014180786a360214200041086a2201280200220228020021032001200241046a360200200420033602182007200441186a10530c010b2000410c6a2802002202200041086a2802006b4102752203200041106a2205280200220620002802046b220141027549044041802010242105200220064704400240200028020c220120002802102202470d0020002802082203200028020422064b04402000200320012003200320066b41027541016a417e6d41027422026a1054220136020c2000200028020820026a3602080c010b200441186a200220066b2201410175410120011b22012001410276200041106a10552102200028020c210320002802082101034020012003470440200228020820012802003602002002200228020841046a360208200141046a21010c010b0b200029020421092000200229020037020420022009370200200029020c21092000200229020837020c2002200937020820021056200028020c21010b200120053602002000200028020c41046a36020c0c020b02402000280208220120002802042202470d00200028020c2203200028021022064904402000200120032003200620036b41027541016a41026d41027422026a105722013602082000200028020c20026a36020c0c010b200441186a200620026b2201410175410120011b2201200141036a410276200041106a10552102200028020c210320002802082101034020012003470440200228020820012802003602002002200228020841046a360208200141046a21010c010b0b200029020421092000200229020037020420022009370200200029020c21092000200229020837020c2002200937020820021056200028020821010b2001417c6a2005360200200020002802082201417c6a22023602082002280200210220002001360208200420023602182007200441186a10530c010b20042001410175410120011b200320051055210241802010242106024020022802082201200228020c2203470d0020022802042205200228020022084b04402002200520012005200520086b41027541016a417e6d41027422036a105422013602082002200228020420036a3602040c010b200441186a200320086b2201410175410120011b22012001410276200241106a280200105521032002280208210520022802042101034020012005470440200328020820012802003602002003200328020841046a360208200141046a21010c010b0b20022902002109200220032902003702002003200937020020022902082109200220032902083702082003200937020820031056200228020821010b200120063602002002200228020841046a360208200028020c2105034020002802082005460440200028020421012000200228020036020420022001360200200228020421012002200536020420002001360208200029020c21092000200229020837020c2002200937020820021056052005417c6a210502402002280204220120022802002203470d0020022802082206200228020c22084904402002200120062006200820066b41027541016a41026d41027422036a105722013602042002200228020820036a3602080c010b200441186a200820036b2201410175410120011b2201200141036a4102762002280210105521062002280208210320022802042101034020012003470440200428022020012802003602002004200428022041046a360220200141046a21010c010b0b20022902002109200220042903183702002002290208210a20022004290320370208200420093703182004200a37032020061056200228020421010b2001417c6a200528020036020020022002280204417c6a3602040c010b0b0b200441186a20071050200428021c4100360200200041186a2100410121010b2000200028020020016a360200200441306a24000b9a0101037f41012103024002400240200128020420012d00002202410176200241017122041b220241014d0440200241016b0d032001280208200141016a20041b2c0000417f4c0d010c030b200241374b0d010b200241016a21030c010b2002104e20026a41016a21030b200041186a28020022010440200041086a280200200041146a2802002001104f21000b2000200028020020036a3602000b2f01017f2000280208200149044020011026200028020020002802041049210220002001360208200020023602000b0bfc0801067f03400240200020046a2105200120046a210320022004460d002003410371450d00200520032d00003a0000200441016a21040c010b0b200220046b210602402005410371220745044003402006411049450440200020046a2203200120046a2205290200370200200341086a200541086a290200370200200441106a2104200641706a21060c010b0b027f2006410871450440200120046a2103200020046a0c010b200020046a2205200120046a2204290200370200200441086a2103200541086a0b21042006410471044020042003280200360200200341046a2103200441046a21040b20064102710440200420032f00003b0000200341026a2103200441026a21040b2006410171450d01200420032d00003a000020000f0b024020064120490d002007417f6a220741024b0d00024002400240024002400240200741016b0e020102000b2005200120046a220328020022073a0000200541016a200341016a2f00003b0000200041036a2108200220046b417d6a2106034020064111490d03200420086a2203200120046a220541046a2802002202410874200741187672360200200341046a200541086a2802002207410874200241187672360200200341086a2005410c6a28020022024108742007411876723602002003410c6a200541106a2802002207410874200241187672360200200441106a2104200641706a21060c000b000b2005200120046a220328020022073a0000200541016a200341016a2d00003a0000200041026a2108200220046b417e6a2106034020064112490d03200420086a2203200120046a220541046a2802002202411074200741107672360200200341046a200541086a2802002207411074200241107672360200200341086a2005410c6a28020022024110742007411076723602002003410c6a200541106a2802002207411074200241107672360200200441106a2104200641706a21060c000b000b2005200120046a28020022073a0000200041016a21082004417f7320026a2106034020064113490d03200420086a2203200120046a220541046a2802002202411874200741087672360200200341046a200541086a2802002207411874200241087672360200200341086a2005410c6a28020022024118742007410876723602002003410c6a200541106a2802002207411874200241087672360200200441106a2104200641706a21060c000b000b200120046a41036a2103200020046a41036a21050c020b200120046a41026a2103200020046a41026a21050c010b200120046a41016a2103200020046a41016a21050b20064110710440200520032d00003a00002005200328000136000120052003290005370005200520032f000d3b000d200520032d000f3a000f200541106a2105200341106a21030b2006410871044020052003290000370000200541086a2105200341086a21030b2006410471044020052003280000360000200541046a2105200341046a21030b20064102710440200520032f00003b0000200541026a2105200341026a21030b2006410171450d00200520032d00003a00000b20000b3601017f2000280208200149044020011026200028020020002802041049210220002001360208200020023602000b200020013602040b7a01037f0340024020002802102201200028020c460d00200141786a2802004504401000200028021021010b200141786a22022002280200417f6a220336020020030d002000200236021020002001417c6a2802002201200028020420016b220210016a104a200120002802006a22012002200110020c010b0b0b4c01037f20002001280208200141016a20012d0000220241017122031b22042001280204200241017620031b22011003200028020422026a104a20042001200220002802006a10042000104b0b0e0020002802000440200010200b0b1e01017f03402000044020004108762100200141016a21010c010b0b20010b25002000200120026a417f6a220241087641fcffff07716a280200200241ff07714102746a0b4f01037f20012802042203200128021020012802146a220441087641fcffff07716a21022000027f410020032001280208460d001a2002280200200441ff07714102746a0b360204200020023602000b2501017f200028020821020340200120024645044020002002417c6a22023602080c010b0b0b2801017f200028020820002802046b2201410874417f6a410020011b200028021420002802106a6b0ba10202057f017e230041206b22052400024020002802082202200028020c2203470d0020002802042204200028020022064b04402000200420022004200420066b41027541016a417e6d41027422036a105422023602082000200028020420036a3602040c010b200541086a200320066b2202410175410120021b220220024102762000410c6a10552103200028020821042000280204210203402002200446450440200328020820022802003602002003200328020841046a360208200241046a21020c010b0b20002902002107200020032902003702002003200737020020002902082107200020032902083702082003200737020820031056200028020821020b200220012802003602002000200028020841046a360208200541206a24000b2501017f200120006b220141027521032001044020022000200110580b200220034102746a0b4f01017f2000410036020c200041106a2003360200200104402001410274102421040b200020043602002000200420024102746a22023602082000200420014102746a36020c2000200236020420000b2b01027f200028020821012000280204210203402001200247044020002001417c6a22013602080c010b0b0b1b00200120006b22010440200220016b22022000200110580b20020b8d0301037f024020002001460d00200120006b20026b410020024101746b4d044020002001200210491a0c010b20002001734103712103027f024020002001490440200020030d021a410021030340200120036a2105200020036a2204410371450440200220036b210241002103034020024104490d04200320046a200320056a280200360200200341046a21032002417c6a21020c000b000b20022003460d04200420052d00003a0000200341016a21030c000b000b024020030d002001417f6a21040340200020026a22034103714504402001417c6a21032000417c6a2104034020024104490d03200220046a200220036a2802003602002002417c6a21020c000b000b2002450d042003417f6a200220046a2d00003a00002002417f6a21020c000b000b2001417f6a210103402002450d03200020026a417f6a200120026a2d00003a00002002417f6a21020c000b000b200320056a2101200320046a0b210303402002450d01200320012d00003a00002002417f6a2102200341016a2103200141016a21010c000b000b0b3501017f230041106b220041d0890436020c41c009200028020c41076a417871220036020041c409200036020041c8093f003602000b10002002044020002001200210491a0b0b2e01017f200028020445044041000f0b4101210120002802002c0000417f4c047f2000105c200010416a0520010b0b5b00027f027f41002000280204450d001a410020002802002c0000417f4a0d011a20002802002d0000220041bf014d04404100200041b801490d011a200041c97e6a0c010b4100200041f801490d001a200041897e6a0b41016a0b0b5b01027f2000027f0240200128020022054504400c010b200220036a200128020422014b0d0020012002490d00410020012003490d011a200220056a2104200120026b20032003417f461b0c010b41000b360204200020043602000b0bb80101004180080bb001696e697400696e73657274566563746f7256616c756500696e73657274566563746f724d616e6756616c756500676574566563746f724c656e6774680066696e64566563746f7241740066696e64566563746f7246726f6e740066696e64566563746f724261636b0064656c657465566563746f72506f704261636b0064656c657465566563746f7245726173650064656c657465566563746f72436c6561720066696e64566563746f72456d707479";

    public static String BINARY = BINARY_0;

    public static final String FUNC_DELETEVECTORPOPBACK = "deleteVectorPopBack";

    public static final String FUNC_INSERTVECTORVALUE = "insertVectorValue";

    public static final String FUNC_INSERTVECTORMANGVALUE = "insertVectorMangValue";

    public static final String FUNC_GETVECTORLENGTH = "getVectorLength";

    public static final String FUNC_FINDVECTORAT = "findVectorAt";

    public static final String FUNC_FINDVECTORFRONT = "findVectorFront";

    public static final String FUNC_FINDVECTORBACK = "findVectorBack";

    public static final String FUNC_DELETEVECTORERASE = "deleteVectorErase";

    public static final String FUNC_DELETEVECTORCLEAR = "deleteVectorClear";

    public static final String FUNC_FINDVECTOREMPTY = "findVectorEmpty";

    protected ReferenceDataTypeVectorFuncContract(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected ReferenceDataTypeVectorFuncContract(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteCall<TransactionReceipt> deleteVectorPopBack() {
        final WasmFunction function = new WasmFunction(FUNC_DELETEVECTORPOPBACK, Arrays.asList(), Void.class);
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> deleteVectorPopBack(BigInteger vonValue) {
        final WasmFunction function = new WasmFunction(FUNC_DELETEVECTORPOPBACK, Arrays.asList(), Void.class);
        return executeRemoteCallTransaction(function, vonValue);
    }

    public RemoteCall<TransactionReceipt> insertVectorValue(String my_value) {
        final WasmFunction function = new WasmFunction(FUNC_INSERTVECTORVALUE, Arrays.asList(my_value), Void.class);
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> insertVectorValue(String my_value, BigInteger vonValue) {
        final WasmFunction function = new WasmFunction(FUNC_INSERTVECTORVALUE, Arrays.asList(my_value), Void.class);
        return executeRemoteCallTransaction(function, vonValue);
    }

    public static RemoteCall<ReferenceDataTypeVectorFuncContract> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        String encodedConstructor = WasmFunctionEncoder.encodeConstructor(BINARY, Arrays.asList());
        return deployRemoteCall(ReferenceDataTypeVectorFuncContract.class, web3j, credentials, contractGasProvider, encodedConstructor);
    }

    public static RemoteCall<ReferenceDataTypeVectorFuncContract> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        String encodedConstructor = WasmFunctionEncoder.encodeConstructor(BINARY, Arrays.asList());
        return deployRemoteCall(ReferenceDataTypeVectorFuncContract.class, web3j, transactionManager, contractGasProvider, encodedConstructor);
    }

    public static RemoteCall<ReferenceDataTypeVectorFuncContract> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider, BigInteger initialVonValue) {
        String encodedConstructor = WasmFunctionEncoder.encodeConstructor(BINARY, Arrays.asList());
        return deployRemoteCall(ReferenceDataTypeVectorFuncContract.class, web3j, credentials, contractGasProvider, encodedConstructor, initialVonValue);
    }

    public static RemoteCall<ReferenceDataTypeVectorFuncContract> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider, BigInteger initialVonValue) {
        String encodedConstructor = WasmFunctionEncoder.encodeConstructor(BINARY, Arrays.asList());
        return deployRemoteCall(ReferenceDataTypeVectorFuncContract.class, web3j, transactionManager, contractGasProvider, encodedConstructor, initialVonValue);
    }

    public RemoteCall<TransactionReceipt> insertVectorMangValue(Uint64 num, String my_value) {
        final WasmFunction function = new WasmFunction(FUNC_INSERTVECTORMANGVALUE, Arrays.asList(num,my_value), Void.class);
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> insertVectorMangValue(Uint64 num, String my_value, BigInteger vonValue) {
        final WasmFunction function = new WasmFunction(FUNC_INSERTVECTORMANGVALUE, Arrays.asList(num,my_value), Void.class);
        return executeRemoteCallTransaction(function, vonValue);
    }

    public RemoteCall<Uint64> getVectorLength() {
        final WasmFunction function = new WasmFunction(FUNC_GETVECTORLENGTH, Arrays.asList(), Uint64.class);
        return executeRemoteCall(function, Uint64.class);
    }

    public RemoteCall<String> findVectorAt(Uint64 index) {
        final WasmFunction function = new WasmFunction(FUNC_FINDVECTORAT, Arrays.asList(index), String.class);
        return executeRemoteCall(function, String.class);
    }

    public RemoteCall<String> findVectorFront() {
        final WasmFunction function = new WasmFunction(FUNC_FINDVECTORFRONT, Arrays.asList(), String.class);
        return executeRemoteCall(function, String.class);
    }

    public RemoteCall<String> findVectorBack() {
        final WasmFunction function = new WasmFunction(FUNC_FINDVECTORBACK, Arrays.asList(), String.class);
        return executeRemoteCall(function, String.class);
    }

    public RemoteCall<TransactionReceipt> deleteVectorErase() {
        final WasmFunction function = new WasmFunction(FUNC_DELETEVECTORERASE, Arrays.asList(), Void.class);
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> deleteVectorErase(BigInteger vonValue) {
        final WasmFunction function = new WasmFunction(FUNC_DELETEVECTORERASE, Arrays.asList(), Void.class);
        return executeRemoteCallTransaction(function, vonValue);
    }

    public RemoteCall<TransactionReceipt> deleteVectorClear() {
        final WasmFunction function = new WasmFunction(FUNC_DELETEVECTORCLEAR, Arrays.asList(), Void.class);
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> deleteVectorClear(BigInteger vonValue) {
        final WasmFunction function = new WasmFunction(FUNC_DELETEVECTORCLEAR, Arrays.asList(), Void.class);
        return executeRemoteCallTransaction(function, vonValue);
    }

    public RemoteCall<Boolean> findVectorEmpty() {
        final WasmFunction function = new WasmFunction(FUNC_FINDVECTOREMPTY, Arrays.asList(), Boolean.class);
        return executeRemoteCall(function, Boolean.class);
    }

    public static ReferenceDataTypeVectorFuncContract load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new ReferenceDataTypeVectorFuncContract(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static ReferenceDataTypeVectorFuncContract load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new ReferenceDataTypeVectorFuncContract(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
