package network.platon.contracts.wasm;

import com.platon.abi.wasm.WasmFunctionEncoder;
import com.platon.abi.wasm.datatypes.WasmFunction;
import com.platon.crypto.Credentials;
import com.platon.protocol.Web3j;
import com.platon.protocol.core.RemoteCall;
import com.platon.protocol.core.methods.response.TransactionReceipt;
import com.platon.rlp.wasm.datatypes.Int64;
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
public class QuickSort extends WasmContract {
    private static String BINARY_0 = "0x0061736d01000000014f0e60027f7f0060017f017f60017f0060037f7f7f017f60000060027f7f017f60047f7f7f7f017f60037f7f7f0060047f7f7f7f0060037f7e7e0060017f017e60047f7f7e7e0060027f7e006000017f02a9010703656e760c706c61746f6e5f70616e6963000403656e7617706c61746f6e5f6765745f696e7075745f6c656e677468000d03656e7610706c61746f6e5f6765745f696e707574000203656e7617706c61746f6e5f6765745f73746174655f6c656e677468000503656e7610706c61746f6e5f6765745f7374617465000603656e7610706c61746f6e5f7365745f7374617465000803656e760d706c61746f6e5f72657475726e0000034140040b03050007010301040103070201000a020102010000010100000406010c03050902000005060002030a0000000209030100010003060203000704010108000405017001010105030100020608017f0141b088040b073904066d656d6f72790200115f5f7761736d5f63616c6c5f63746f727300070f5f5f66756e63735f6f6e5f65786974002206696e766f6b6500100ae85440040010420b4c0020012002a72003a7100921012000280218044020004200370218200041206a41003602000b20002001290200370218200041206a200128020836020020014100360208200142003702000be40102057f027e0340200120024e4504402000280200220520014103746a34020021082002210420012103034020032004480440200520044103746a210602400340200320044e0d01200629030022092008590440200641786a21062004417f6a21040c010b0b200520034103746a2009370300200341016a21030b200520034103746a21070340200320044e0d02200820072903002209550440200741086a2107200341016a21030c010b0b200620093703002004417f6a21040c010b0b200520034103746a2008370300200020012003417f6a10091a200341016a21010c010b0b20000b3e01017f2000420037020020004100360208200128020420012802006b2202044020002002410375100b20012802002001280204200041046a100c0b20000b2301017f20002001100d2202360200200020023602042000200220014103746a3602080b2800200120006b220141014e0440200228020020002001100e1a2002200228020020016a3602000b0b09002000410374100f0bfc0801067f03400240200020046a2105200120046a210320022004460d002003410371450d00200520032d00003a0000200441016a21040c010b0b200220046b210602402005410371220745044003402006411049450440200020046a2203200120046a2205290200370200200341086a200541086a290200370200200441106a2104200641706a21060c010b0b027f2006410871450440200120046a2103200020046a0c010b200020046a2205200120046a2204290200370200200441086a2103200541086a0b21042006410471044020042003280200360200200341046a2103200441046a21040b20064102710440200420032f00003b0000200341026a2103200441026a21040b2006410171450d01200420032d00003a000020000f0b024020064120490d002007417f6a220741024b0d00024002400240024002400240200741016b0e020102000b2005200120046a220328020022073a0000200541016a200341016a2f00003b0000200041036a2108200220046b417d6a2106034020064111490d03200420086a2203200120046a220541046a2802002202410874200741187672360200200341046a200541086a2802002207410874200241187672360200200341086a2005410c6a28020022024108742007411876723602002003410c6a200541106a2802002207410874200241187672360200200441106a2104200641706a21060c000b000b2005200120046a220328020022073a0000200541016a200341016a2d00003a0000200041026a2108200220046b417e6a2106034020064112490d03200420086a2203200120046a220541046a2802002202411074200741107672360200200341046a200541086a2802002207411074200241107672360200200341086a2005410c6a28020022024110742007411076723602002003410c6a200541106a2802002207411074200241107672360200200441106a2104200641706a21060c000b000b2005200120046a28020022073a0000200041016a21082004417f7320026a2106034020064113490d03200420086a2203200120046a220541046a2802002202411874200741087672360200200341046a200541086a2802002207411874200241087672360200200341086a2005410c6a28020022024118742007410876723602002003410c6a200541106a2802002207411874200241087672360200200441106a2104200641706a21060c000b000b200120046a41036a2103200020046a41036a21050c020b200120046a41026a2103200020046a41026a21050c010b200120046a41016a2103200020046a41016a21050b20064110710440200520032d00003a00002005200328000136000120052003290005370005200520032f000d3b000d200520032d000f3a000f200541106a2105200341106a21030b2006410871044020052003290000370000200541086a2105200341086a21030b2006410471044020052003280000360000200541046a2105200341046a21030b20064102710440200520032f00003b0000200541026a2105200341026a21030b2006410171450d00200520032d00003a00000b20000b0b002000410120001b10110bc90402057f017e23004180016b22002400104210012201101122021002200041c8006a200041086a200220011012220341001013200041c8006a101402400240200041c8006a1015450d00200028024c450d0020002802482d000041c001490d010b10000b200041206a200041c8006a10162000280224220141094f044010000b200028022021020340200104402001417f6a210120023100002005420886842105200241016a21020c010b0b024002402005500d004180081017200551044020031018200041c8006a1019101a0c020b4185081017200551044020004200370338200042003703302000410036022820004200370320200041386a2101200041306a21022003101b410447044010000b20004101360244200020033602702000200041c4006a360274200041c8006a200341011013200041c8006a200041206a101c2000200028024441016a360244200041f0006a2002101d200041f0006a2001101d200041c8006a10192102200041c8006a200041f0006a200041206a100a2201200029033020002903381008200128020022030440200120033602040b2002101a20002802202201450d02200020013602240c020b418a0810172005520d0020031018200041c8006a10192103200041f0006a200041e0006a100a2102200041206a101e22012002101f1020200120021021200128020c200141106a28020047044010000b200128020020012802041006200128020c22040440200120043602100b200228020022010440200220013602040b2003101a0c010b10000b102220004180016a24000b9b0101047f230041106b220124002001200036020c2000047f41a808200041086a2202411076220041a8082802006a220336020041a40841a408280200220420026a41076a417871220236020002400240200341107420024d044041a808200341016a360200200041016a21000c010b2000450d010b200040000d0010000b20042001410c6a4104100e41086a0541000b2100200141106a240020000b0c00200020012002411c10230bc90202067f017e230041106b220324002001280208220520024b0440200341086a2001102b20012003280208200328020c102c36020c20032001102b410021052001027f410020032802002207450d001a410020032802042208200128020c2206490d001a200820062006417f461b210420070b360210200141146a2004360200200141003602080b200141106a210603402001280214210402402005200249044020040d01410021040b200020062802002004411410231a200341106a24000f0b20032001102b41002104027f410020032802002205450d001a410020032802042208200128020c2207490d001a200820076b2104200520076a0b2105200120043602142001200536021020032006410020052004102c10452001200329030022093702102001200128020c2009422088a76a36020c2001200128020841016a22053602080c000b000b4101017f200028020445044010000b0240200028020022012d0000418101470d00200028020441014d047f100020002802000520010b2c00014100480d0010000b0b980101037f200028020445044041000f0b20001014200028020022022c0000220141004e044020014100470f0b027f4101200141807f460d001a200141ff0171220341b7014d0440200028020441014d047f100020002802000520020b2d00014100470f0b4100200341bf014b0d001a2000280204200141ff017141ca7e6a22014d047f100020002802000520020b20016a2d00004100470b0bd50101047f200110242204200128020422024b04401000200128020421020b200128020021052000027f02400240200204404100210120052c00002203417f4a0d01027f200341ff0171220141bf014d04404100200341ff017141b801490d011a200141c97e6a0c010b4100200341ff017141f801490d001a200141897e6a0b41016a21010c010b4101210120050d000c010b41002103200120046a20024b0d0020022001490d00410020022004490d011a200120056a2103200220016b20042004417f461b0c010b41000b360204200020033602000b3901027e42a5c688a1c89ca7f94b210103402000300000220250450440200041016a2100200142b383808080207e20028521010c010b0b20010b0e002000101b410147044010000b0b810301087f230041306b22072400200042003702182000428debc585c3a7f9dbf7003703102000410036020820004200370200200041206a4100360200200741186a101e220320002903101025200328020c200341106a28020047044010000b200041186a21050240200328020022062003280204220810032204450d002004100f21020340200120026a41003a00002004200141016a2201470d000b20062008200220011004417f460440410021010c010b2007200241016a200120026a2002417f736a10122005101c200421010b200328020c22020440200320023602100b024020010d002000411c6a210120002802042203200028020022046b41037522062000280220200028021822026b4103754d04402006200128020020026b41037522054b04402004200420054103746a2205200210261a200520032001100c0c020b200120042003200210263602000c010b2002044020004100360220200042003702180b2005200520061027100b200420032001100c0b200741306a240020000b9c03010a7f230041406a22022400200241086a101e2103200241386a4100360200200241306a4200370300200241286a420037030020024200370320200241206a20002903104200102820022802202101200241206a4104721029200320011020200320002903101025200328020c200341106a28020047044010000b2003280204210520032802002106200241206a101e2101200041186a2207101f21084101100f220441fe013a0000200128020c200141106a28020047044010000b2001280204220941016a220a20012802084b047f2001200a102a20012802040520090b20012802006a20044101100e1a2001200128020441016a3602042001200441016a200820046b6a10202001200710210240200128020c2001280210460440200128020021040c010b100020012802002104200128020c2001280210460d0010000b20062005200420012802041005200128020c22040440200120043602100b200328020c22010440200320013602100b2000280218220104402000411c6a20013602000b200028020022010440200020013602040b200241406b24000b800101047f230041106b2201240002402000280204450d0020002802002d000041c001490d00200141086a2000102b200128020c210003402000450d01200141002001280208220320032000102c22046a20034520002004497222031b3602084100200020046b20031b2100200241016a21020c000b000b200141106a240020020bcb0302077f017e230041d0006b22042400024002402000280204450d0020002802002d000041c001490d002000101b21022001280208200128020022036b4103752002490440200120042002200128020420036b410375200141086a102d2202102e2002102f0b200441286a2000410110302102200441186a2000410010302106200141086a210720022802042100034020062802042000464100200228020822032006280208461b0d02200420002003411c1023103121090240200128020422002001280208490440200020093703002001200041086a3602040c010b200441386a2001200020012802006b410375220041016a102720002007102d21002004280240220320093703002004200341086a36024020012000102e2000102f0b20022002280204220020022802086a410020001b22003602042002280200220304402002200336020820002003102c21052002027f200228020422004504404100210341000c010b410021034100200228020822082005490d001a200820052005417f461b210320000b2200ad2003ad42208684370204200241002002280200220520036b2203200320054b1b3602000c0105200241003602080c010b000b000b10000b200441d0006a24000b4601017f230041206b22022400200241086a2000280200200028020428020010132001200241086a103137030020002802042200200028020041016a360200200241206a24000b2900200041003602082000420037020020004100102a200041146a41003602002000420037020c20000bba0102027f027e230041206b22012400200141186a4100360200200141106a4200370300200141086a420037030020014200370300027f200028020020002802044604402001410136020041010c010b2001410010322000280204210220002802002100037f2000200246047f2001410110322001280200052001200029030022034201862003423f8722048520044201862003423f88842004851028200041086a21000c010b0b0b210020014104721029200141206a240020000b13002000280208200149044020002001102a0b0bf70202067f027e0240200128020420012802006b220204402002410375210220002802042106200041106a2802002203200041146a280200220449044020032002ad2006ad422086843702002000200028021041086a3602100c020b027f41002003200028020c22056b410375220741016a2203200420056b2204410275220520052003491b41ffffffff01200441037541ffffffff00491b2205450d001a2005410374100f0b2103200320074103746a22042002ad2006ad4220868437020020042000280210200028020c22076b22026b2106200320054103746a2103200441086a2104200241014e0440200620072002100e1a0b20002003360214200020043602102000200636020c0c010b200041c0011033200041001034200028020020002802046a41004100100e1a200010350b20012802042102200128020021010340200120024704402000200129030022084201862008423f8722098520094201862008423f88842009851036200141086a21010c010b0b0b880101037f419408410136020041980828020021000340200004400340419c08419c082802002201417f6a220236020020014101484504404194084100360200200020024102746a22004184016a280200200041046a280200110200419408410136020041980828020021000c010b0b419c084120360200419808200028020022003602000c010b0b0b730020004200370210200042ffffffff0f370208200020023602042000200136020002402003410871450d002000104320024f0d002003410471044010000c010b200042003702000b02402003411071450d002000104320024d0d0020034104710440100020000f0b200042003702000b20000bff0201037f200028020445044041000f0b2000101441012102024020002802002c00002201417f4a0d00200141ff0171220341b7014d0440200341807f6a0f0b02400240200141ff0171220141bf014d0440024020002802042201200341c97e6a22024d047f100020002802040520010b4102490d0020002802002d00010d0010000b200241054f044010000b20002802002d000145044010000b4100210241b7012101034020012003460440200241384f0d030c0405200028020020016a41ca7e6a2d00002002410874722102200141016a21010c010b000b000b200141f7014d0440200341c07e6a0f0b024020002802042201200341897e6a22024d047f100020002802040520010b4102490d0020002802002d00010d0010000b200241054f044010000b20002802002d000145044010000b4100210241f701210103402001200346044020024138490d0305200028020020016a418a7e6a2d00002002410874722102200141016a21010c010b0b0b200241ff7d490d010b10000b20020b0a0020002001420010360b2501017f200120006b220141037521032001044020022000200110410b200220034103746a0b3101017f2001200028020820002802006b2200410275220220022001491b41ffffffff01200041037541ffffffff00491b0b890101027f4101210420014280015441002002501b450440034020012002845045044020024238862001420888842101200341016a2103200242088821020c010b0b200341384f047f2003103a20036a0520030b41016a21040b200041186a28020022030440200041086a280200200041146a2802002003103721000b2000200028020020046a3602000bea0101047f230041106b22042400200028020422012000280210220241087641fcffff07716a2103027f410020012000280208460d001a2003280200200241ff07714102746a0b2101200441086a20001040200428020c210203400240200120024604402000410036021420002802082103200028020421010340200320016b41027522024103490d022000200141046a22013602040c000b000b200141046a220120032802006b418020470d0120032802042101200341046a21030c010b0b2002417f6a220241014d04402000418004418008200241016b1b3602100b200020011039200441106a24000b2f01017f200028020820014904402001101120002802002000280204100e210220002001360208200020023602000b0b2101017f20011024220220012802044b044010000b2000200120011044200210450b2701017f230041206b22022400200241086a200020014114102310432100200241206a240020000b4c01017f2000410036020c200041106a2003360200200104402001100d21040b200020043602002000200420024103746a22023602082000200420014103746a36020c2000200236020420000b870101037f200120012802042000280204200028020022046b22036b2202360204200341004a0440200220042003100e1a200128020421020b200028020021032000200236020020012003360204200028020421022000200128020836020420012002360208200028020821022000200128020c3602082001200236020c200120012802043602000b2b01027f20002802082101200028020421020340200120024704402000200141786a22013602080c010b0b0be70101037f230041106b2204240020004200370200200041086a410036020020012802042103024002402002450440200321020c010b410021022003450d002003210220012802002d000041c001490d00200441086a2001102b20004100200428020c2201200428020822022001102c22032003417f461b20024520012003497222031b220536020820004100200220031b3602042000200120056b3602000c010b20012802002103200128020421012000410036020020004100200220016b20034520022001497222021b36020820004100200120036a20021b3602040b200441106a240020000ba40102027f027e230041106b22012400200010140240024020001015450d002000280204450d0020002802002d000041c001490d010b10000b200141086a20001016200128020c220041114f044010000b20012802082102034020000440200442088620034238888421042000417f6a210020023100002003420886842103200241016a21020c010b0b200141106a2400420020034201837d2004423f86200342018884850bc10c02077f027e230041306b22042400200041046a2107024020014101460440200041086a280200200041146a280200200041186a220228020022031037280200210120022003417f6a360200200710384180104f044020072000410c6a280200417c6a10390b200141384f047f2001103a20016a0520010b41016a2101200041186a2802002202450d01200041086a280200200041146a2802002002103721000c010b0240200710380d00200041146a28020022014180084f0440200020014180786a360214200041086a2201280200220228020021032001200241046a360200200420033602182007200441186a103b0c010b2000410c6a2802002202200041086a2802006b4102752203200041106a2205280200220620002802046b2201410275490440418020100f2105200220064704400240200028020c220120002802102202470d0020002802082203200028020422064b04402000200320012003200320066b41027541016a417e6d41027422026a103c220136020c2000200028020820026a3602080c010b200441186a200220066b2201410175410120011b22012001410276200041106a103d2102200028020c210320002802082101034020012003470440200228020820012802003602002002200228020841046a360208200141046a21010c010b0b200029020421092000200229020037020420022009370200200029020c21092000200229020837020c200220093702082002103e200028020c21010b200120053602002000200028020c41046a36020c0c020b02402000280208220120002802042202470d00200028020c2203200028021022064904402000200120032003200620036b41027541016a41026d41027422026a103f22013602082000200028020c20026a36020c0c010b200441186a200620026b2201410175410120011b2201200141036a410276200041106a103d2102200028020c210320002802082101034020012003470440200228020820012802003602002002200228020841046a360208200141046a21010c010b0b200029020421092000200229020037020420022009370200200029020c21092000200229020837020c200220093702082002103e200028020821010b2001417c6a2005360200200020002802082201417c6a22023602082002280200210220002001360208200420023602182007200441186a103b0c010b20042001410175410120011b20032005103d2102418020100f2106024020022802082201200228020c2203470d0020022802042205200228020022084b04402002200520012005200520086b41027541016a417e6d41027422036a103c22013602082002200228020420036a3602040c010b200441186a200320086b2201410175410120011b22012001410276200241106a280200103d21032002280208210520022802042101034020012005470440200328020820012802003602002003200328020841046a360208200141046a21010c010b0b2002290200210920022003290200370200200320093702002002290208210920022003290208370208200320093702082003103e200228020821010b200120063602002002200228020841046a360208200028020c2105034020002802082005460440200028020421012000200228020036020420022001360200200228020421012002200536020420002001360208200029020c21092000200229020837020c200220093702082002103e052005417c6a210502402002280204220120022802002203470d0020022802082206200228020c22084904402002200120062006200820066b41027541016a41026d41027422036a103f22013602042002200228020820036a3602080c010b200441186a200820036b2201410175410120011b2201200141036a4102762002280210103d21062002280208210320022802042101034020012003470440200428022020012802003602002004200428022041046a360220200141046a21010c010b0b20022902002109200220042903183702002002290208210a20022004290320370208200420093703182004200a3703202006103e200228020421010b2001417c6a200528020036020020022002280204417c6a3602040c010b0b0b200441186a20071040200428021c4100360200200041186a2100410121010b2000200028020020016a360200200441306a24000b2500200041011034200028020020002802046a20013a00002000200028020441016a3602040b1b00200028020420016a220120002802084b044020002001102a0b0bf50101057f0340024020002802102201200028020c460d00200141786a2802004504401000200028021021010b200141786a22022002280200417f6a220336020020030d002000200236021020004101200028020422032001417c6a28020022026b2201103a220441016a20014138491b220520036a1046200220002802006a220320056a200320011041200141374d0440200028020020026a200141406a3a00000c020b200441f7016a220341ff014d0440200028020020026a20033a00002000280200200220046a6a210203402001450d03200220013a0000200141087621012002417f6a21020c000b000510000c020b000b0b0bc60202037f027e02402001200284500440200041800110330c010b20014280015441002002501b4504402001210720022106034020062007845045044020064238862007420888842107200341016a2103200642088821060c010b0b0240200341384f04402003210403402004044020044108762104200541016a21050c010b0b200541c9004f044010000b2000200541b77f6a41ff017110332000200028020420056a1046200028020420002802006a417f6a21052003210403402004450d02200520043a0000200441087621042005417f6a21050c000b000b200020034180017341ff017110330b2000200028020420036a1046200028020420002802006a417f6a210303402001200284500d02200320013c0000200242388620014208888421012003417f6a2103200242088821020c000b000b20002001a741ff017110330b200010350b25002000200120026a417f6a220241087641fcffff07716a280200200241ff07714102746a0b2801017f200028020820002802046b2201410874417f6a410020011b200028021420002802106a6b0b2501017f200028020821020340200120024645044020002002417c6a22023602080c010b0b0b1e01017f03402000044020004108762100200141016a21010c010b0b20010ba10202057f017e230041206b22052400024020002802082202200028020c2203470d0020002802042204200028020022064b04402000200420022004200420066b41027541016a417e6d41027422036a103c22023602082000200028020420036a3602040c010b200541086a200320066b2202410175410120021b220220024102762000410c6a103d2103200028020821042000280204210203402002200446450440200328020820022802003602002003200328020841046a360208200241046a21020c010b0b2000290200210720002003290200370200200320073702002000290208210720002003290208370208200320073702082003103e200028020821020b200220012802003602002000200028020841046a360208200541206a24000b2501017f200120006b220141027521032001044020022000200110410b200220034102746a0b4f01017f2000410036020c200041106a2003360200200104402001410274100f21040b200020043602002000200420024102746a22023602082000200420014102746a36020c2000200236020420000b2b01027f200028020821012000280204210203402001200247044020002001417c6a22013602080c010b0b0b1b00200120006b22010440200220016b22022000200110410b20020b4f01037f20012802042203200128021020012802146a220441087641fcffff07716a21022000027f410020032001280208460d001a2002280200200441ff07714102746a0b360204200020023602000b8d0301037f024020002001460d00200120006b20026b410020024101746b4d0440200020012002100e1a0c010b20002001734103712103027f024020002001490440200020030d021a410021030340200120036a2105200020036a2204410371450440200220036b210241002103034020024104490d04200320046a200320056a280200360200200341046a21032002417c6a21020c000b000b20022003460d04200420052d00003a0000200341016a21030c000b000b024020030d002001417f6a21040340200020026a22034103714504402001417c6a21032000417c6a2104034020024104490d03200220046a200220036a2802003602002002417c6a21020c000b000b2002450d042003417f6a200220046a2d00003a00002002417f6a21020c000b000b2001417f6a210103402002450d03200020026a417f6a200120026a2d00003a00002002417f6a21020c000b000b200320056a2101200320046a0b210303402002450d01200320012d00003a00002002417f6a2102200341016a2103200141016a21010c000b000b0b3501017f230041106b220041b0880436020c41a008200028020c41076a417871220036020041a408200036020041a8083f003602000b2e01017f200028020445044041000f0b4101210120002802002c0000417f4c047f20001044200010246a0520010b0b5b00027f027f41002000280204450d001a410020002802002c0000417f4a0d011a20002802002d0000220041bf014d04404100200041b801490d011a200041c97e6a0c010b4100200041f801490d001a200041897e6a0b41016a0b0b5b01027f2000027f0240200128020022054504400c010b200220036a200128020422014b0d0020012002490d00410020012003490d011a200220056a2104200120026b20032003417f461b0c010b41000b360204200020043602000b0f0020002001102a200020013602040b0b1a01004180080b13696e697400736f7274006765745f6172726179";

    public static String BINARY = BINARY_0;

    public static final String FUNC_SORT = "sort";

    public static final String FUNC_GET_ARRAY = "get_array";

    protected QuickSort(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected QuickSort(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static RemoteCall<QuickSort> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        String encodedConstructor = WasmFunctionEncoder.encodeConstructor(BINARY, Arrays.asList());
        return deployRemoteCall(QuickSort.class, web3j, credentials, contractGasProvider, encodedConstructor);
    }

    public static RemoteCall<QuickSort> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        String encodedConstructor = WasmFunctionEncoder.encodeConstructor(BINARY, Arrays.asList());
        return deployRemoteCall(QuickSort.class, web3j, transactionManager, contractGasProvider, encodedConstructor);
    }

    public static RemoteCall<QuickSort> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider, BigInteger initialVonValue) {
        String encodedConstructor = WasmFunctionEncoder.encodeConstructor(BINARY, Arrays.asList());
        return deployRemoteCall(QuickSort.class, web3j, credentials, contractGasProvider, encodedConstructor, initialVonValue);
    }

    public static RemoteCall<QuickSort> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider, BigInteger initialVonValue) {
        String encodedConstructor = WasmFunctionEncoder.encodeConstructor(BINARY, Arrays.asList());
        return deployRemoteCall(QuickSort.class, web3j, transactionManager, contractGasProvider, encodedConstructor, initialVonValue);
    }

    public RemoteCall<TransactionReceipt> sort(Int64[] arr, Int64 start, Int64 last) {
        final WasmFunction function = new WasmFunction(FUNC_SORT, Arrays.asList(arr,start,last), Void.class);
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> sort(Int64[] arr, Int64 start, Int64 last, BigInteger vonValue) {
        final WasmFunction function = new WasmFunction(FUNC_SORT, Arrays.asList(arr,start,last), Void.class);
        return executeRemoteCallTransaction(function, vonValue);
    }

    public RemoteCall<Int64[]> get_array() {
        final WasmFunction function = new WasmFunction(FUNC_GET_ARRAY, Arrays.asList(), Int64[].class);
        return executeRemoteCall(function, Int64[].class);
    }

    public static QuickSort load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new QuickSort(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static QuickSort load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new QuickSort(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
