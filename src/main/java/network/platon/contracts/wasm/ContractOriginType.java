package network.platon.contracts.wasm;

import com.platon.abi.wasm.WasmEventEncoder;
import com.platon.abi.wasm.WasmFunctionEncoder;
import com.platon.abi.wasm.datatypes.WasmEvent;
import com.platon.abi.wasm.datatypes.WasmEventParameter;
import com.platon.abi.wasm.datatypes.WasmFunction;
import com.platon.crypto.Credentials;
import com.platon.protocol.Web3j;
import com.platon.protocol.core.DefaultBlockParameter;
import com.platon.protocol.core.RemoteCall;
import com.platon.protocol.core.methods.request.PlatonFilter;
import com.platon.protocol.core.methods.response.Log;
import com.platon.protocol.core.methods.response.TransactionReceipt;
import com.platon.rlp.wasm.datatypes.Uint32;
import com.platon.rlp.wasm.datatypes.Uint64;
import com.platon.tx.TransactionManager;
import com.platon.tx.WasmContract;
import com.platon.tx.gas.GasProvider;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import rx.Observable;
import rx.functions.Func1;

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://github.com/PlatONnetwork/client-sdk-java/releases">platon-web3j command line tools</a>,
 * or the com.platon.codegen.WasmFunctionWrapperGenerator in the 
 * <a href="https://github.com/PlatONnetwork/client-sdk-java/tree/master/codegen">codegen module</a> to update.
 *
 * <p>Generated with platon-web3j version 0.15.1.7.
 */
public class ContractOriginType extends WasmContract {
    private static String BINARY_0 = "0x0061736d0100000001480d60027f7f0060017f017f60017f0060027f7f017f60037f7f7f017f60037f7f7f0060000060047f7f7f7f0060047f7f7f7f017f60027f7e006000017f60027f7e017f60017f017e02ce010903656e760c706c61746f6e5f70616e6963000603656e760b706c61746f6e5f73686133000703656e7610706c61746f6e5f7365745f7374617465000703656e7617706c61746f6e5f6765745f696e7075745f6c656e677468000a03656e7610706c61746f6e5f6765745f696e707574000203656e7617706c61746f6e5f6765745f73746174655f6c656e677468000303656e7610706c61746f6e5f6765745f7374617465000803656e760c706c61746f6e5f6576656e74000703656e760d706c61746f6e5f72657475726e0000034f4e060503020300040000010303030902030b0503030800020000050501010000010400040000010401000408020405020006080502000c0201020101000201000601040300060101070700000000000405017001010105030100020608017f0141f088040b073904066d656d6f72790200115f5f7761736d5f63616c6c5f63746f727300090f5f5f66756e63735f6f6e5f65786974004806696e766f6b6500390aec644e0400104d0be10301077f230041c0016b22032400200341a608100b2105200341e8006a100c200341fc006a410036020020034200370274200341e8006a4102100d2104200341d8006a2005100e200341c8006a2000100e200341406b4100360200200341386a4200370300200341306a420037030020034200370328200341286a20032802582200200328025c100f20032802482205200328024c100f21062004200328022810102004200341d8006a10112004200341c8006a10112003280274200341f8006a28020047044010000b2004280204210720042802002108200341106a1012210420034180016a2001101321012003200236028c01200341a8016a4100360200200341a0016a420037030020034198016a4200370300200342003703900120034190016a41001014200341b0016a2001101310152202200335028c01101620024101101421022003280290012109200241046a101720042009101020044102100d20034190016a200110131018200335028c011019220428020c200441106a28020047044010000b20082007200428020020042802041007200428020c22010440200420013602100b200641046a1017200504402003200536024c0b200004402003200036025c0b200328027422040440200320043602780b200341c0016a24000b910101027f20004200370200200041086a410036020020012102024003402002410371044020022d0000450d02200241016a21020c010b0b2002417c6a21020340200241046a22022802002203417f73200341fffdfb776a7141808182847871450d000b0340200341ff0171450d01200241016a2d00002103200241016a21020c000b000b20002001200220016b102320000b1600200041003602082000420037020020004100102a0b8c0201057f2001044020002802042105200041106a2802002202200041146a280200220349044020022001ad2005ad422086843702002000200028021041086a36021020000f0b027f41002002200028020c22046b410375220641016a2202200320046b2203410275220420042002491b41ffffffff01200341037541ffffffff00491b2204450d001a200441037410250b2102200220064103746a22032001ad2005ad4220868437020020032000280210200028020c22066b22016b2105200220044103746a2102200341086a2103200141014e0440200520062001102f1a0b20002002360214200020033602102000200536020c20000f0b200041c00110552000410041004101105120000bd50101047f230041e0006b22022400200241186a10122103200241d8006a4100360200200241d0006a4200370300200241c8006a420037030020024200370340200241406b200241306a200110131015210420022802402105200441046a10172003200510102003200241086a200110131018220128020c200141106a28020047044010000b200041003602082000420037020020012802042103200128020021042000412010382004200320002802002205200028020420056b1001200128020c22000440200120003602100b200241e0006a24000b8b0101017f024020012002460440410121030c010b4101210302400240200220016b2202410146044020012c0000417f4c0d010c030b200241374b0d010b200241016a21030c010b2002102820026a41016a21030b027f200041186a28020022010440200041086a280200200041146a280200200110290c010b20000b2201200128020020036a36020020000b13002000280208200149044020002001102a0b0b1600200020012802002200200128020420006b102b1a0b19002000100c200041146a41003602002000420037020c20000b4d01017f20004200370200200041086a2202410036020020012d0000410171450440200020012902003702002002200141086a28020036020020000f0b200020012802082001280204102320000bc30c02077f027e230041306b22042400200041046a2107027f20014101460440200041086a280200200041146a280200200041186a220228020022031029280200210120022003417f6a360200200710304180104f044020072000410c6a280200417c6a102d0b200141384f047f2001102820016a0520010b41016a2102200041186a28020022010440200041086a280200200041146a280200200110290c020b20000c010b0240200710300d00200041146a28020022014180084f0440200020014180786a360214200041086a2201280200220228020021032001200241046a360200200420033602182007200441186a10310c010b2000410c6a2802002202200041086a2802006b4102752203200041106a2205280200220620002802046b220141027549044041802010252105200220064704400240200028020c220120002802102202470d0020002802082203200028020422064b04402000200320012003200320066b41027541016a417e6d41027422026a1032220136020c2000200028020820026a3602080c010b200441186a200220066b2201410175410120011b22012001410276200041106a10332102200028020c210320002802082101034020012003470440200228020820012802003602002002200228020841046a360208200141046a21010c010b0b200029020421092000200229020037020420022009370200200029020c21092000200229020837020c2002200937020820021034200028020c21010b200120053602002000200028020c41046a36020c0c020b02402000280208220120002802042202470d00200028020c2203200028021022064904402000200120032003200620036b41027541016a41026d41027422026a103522013602082000200028020c20026a36020c0c010b200441186a200620026b2201410175410120011b2201200141036a410276200041106a10332102200028020c210320002802082101034020012003470440200228020820012802003602002002200228020841046a360208200141046a21010c010b0b200029020421092000200229020037020420022009370200200029020c21092000200229020837020c2002200937020820021034200028020821010b2001417c6a2005360200200020002802082201417c6a22023602082002280200210220002001360208200420023602182007200441186a10310c010b20042001410175410120011b200320051033210241802010252106024020022802082201200228020c2203470d0020022802042205200228020022084b04402002200520012005200520086b41027541016a417e6d41027422036a103222013602082002200228020420036a3602040c010b200441186a200320086b2201410175410120011b22012001410276200241106a280200103321032002280208210520022802042101034020012005470440200328020820012802003602002003200328020841046a360208200141046a21010c010b0b20022902002109200220032902003702002003200937020020022902082109200220032902083702082003200937020820031034200228020821010b200120063602002002200228020841046a360208200028020c2105034020002802082005460440200028020421012000200228020036020420022001360200200228020421012002200536020420002001360208200029020c21092000200229020837020c2002200937020820021034052005417c6a210502402002280204220120022802002203470d0020022802082206200228020c22084904402002200120062006200820066b41027541016a41026d41027422036a103522013602042002200228020820036a3602080c010b200441186a200820036b2201410175410120011b2201200141036a4102762002280210103321062002280208210320022802042101034020012003470440200428022020012802003602002004200428022041046a360220200141046a21010c010b0b20022902002109200220042903183702002002290208210a20022004290320370208200420093703182004200a37032020061034200228020421010b2001417c6a200528020036020020022002280204417c6a3602040c010b0b0b200441186a2007102c200428021c410036020041012102200041186a0b2201200128020020026a360200200441306a240020000ba10101037f41012103024002400240200128020420012d00002202410176200241017122041b220241014d0440200241016b0d032001280208200141016a20041b2c0000417f4c0d010c030b200241374b0d010b200241016a21030c010b2002102820026a41016a21030b027f200041186a28020022010440200041086a280200200041146a280200200110290c010b20000b2201200128020020036a36020020000b840102027f017e4101210320014280015a0440034020012004845045044020044238862001420888842101200241016a2102200442088821040c010b0b200241384f047f2002102820026a0520020b41016a21030b200041186a28020022020440200041086a280200200041146a2802002002102921000b2000200028020020036a3602000bea0101047f230041106b22042400200028020422012000280210220241087641fcffff07716a2103027f410020012000280208460d001a2003280200200241ff07714102746a0b2101200441086a2000102c200428020c210203400240200120024604402000410036021420002802082103200028020421010340200320016b41027522024103490d022000200141046a22013602040c000b000b200141046a220120032802006b418020470d0120032802042101200341046a21030c010b0b2002417f6a220241014d04402000418004418008200241016b1b3602100b20002001102d200441106a24000b2c01017f20002001280208200141016a20012d0000220041017122021b2001280204200041017620021b102b0bbc0202037f037e02402001500440200041800110550c010b20014280015a044020012107034020062007845045044020064238862007420888842107200241016a2102200642088821060c010b0b0240200241384f04402002210303402003044020034108762103200441016a21040c010b0b200441c9004f044010000b2000200441b77f6a41ff017110552000200028020420046a1054200028020420002802006a417f6a21042002210303402003450d02200420033a0000200341087621032004417f6a21040c000b000b200020024180017341ff017110550b2000200028020420026a1054200028020420002802006a417f6a210203402001200584500d02200220013c0000200542388620014208888421012002417f6a2102200542088821050c000b000b20002001a741ff017110550b20004101105320000b850201037f230041406a22042400200441306a419308100b200441206a419f08100b4101100a024020012802042203200128020847044020032002101b1a2001200128020441246a3602040c010b200441086a2001200320012802006b41246d220341016a101c2003200141086a101d22032802082002101b1a2003200328020841246a36020820012003101e2003101f0b200441086a1012220220011020200228020c200241106a28020047044010000b2002280204210320022802002105027f20012d000c4101710440200141146a2802000c010b2001410d6a0b2001280218200520031002200020011021200228020c22010440200220013602100b200441406b24000b25002000200110131a2000410c6a2001410c6a10131a200041186a200141186a10131a20000b2f01017f2001200028020820002802006b41246d2200410174220220022001491b41c7e3f138200041e3f1b81c491b0b4c01017f2000410036020c200041106a2003360200200104402001102421040b2000200436020020002004200241246c6a220236020820002004200141246c6a36020c2000200236020420000b900101027f2000280204210220002802002103034020022003464504402001280204415c6a2002415c6a2202102620012001280204415c6a3602040c010b0b200028020021022000200128020436020020012002360204200028020421022000200128020836020420012002360208200028020821022000200128020c3602082001200236020c200120012802043602000b2b01027f200028020821012000280204210203402001200247044020002001415c6a22013602080c010b0b0bb20201077f23004180016b220224002000200128020420012802006b41246d100d21042001280204200128020022016b2100200241206a4104722105200241e0006a410472210603402000044020044103100d210320024100360238200242003703302002420037032820024200370320200241206a20011027200241206a200241106a2001410c6a2207101310152002200141186a2208101310151a20032002280220101020034101100d210320024100360278200242003703702002420037036820024200370360200241e0006a200241d0006a2001101310151a2003200228026010102003200241406b2001101310182103200610172003200241e0006a200710131018200241d0006a2008101310181a200510172000415c6a2100200141246a21010c010520024180016a24000b0b0b810101027f20004200370200200041003602080240200128020420012802006b2202450d002000200241246d22031024220236020420002002200341246c6a360208200020023602002001280204210320012802002101034020012003460d0120022001101b1a2000200028020441246a2202360204200141246a21010c000b000b0b2d00230041206b22022400200241106a418008100b2002418c08100b4102100a200020011021200241206a24000b6101027f027f02402002410b4f0440200241106a4170712204102521032000200236020420002004410172360200200020033602080c010b200020024101743a0000200041016a22032002450d011a0b200320012002102f0b20026a41003a00000b0900200041246c10250b0b002000410120001b102e0b620020002001290200370200200041086a200141086a28020036020020011037200041146a200141146a2802003602002000200129020c37020c2001410c6a1037200041206a200141206a28020036020020002001290218370218200141186a10370b2701017f230041106b220224002000410010142002200110131015410110141a200241106a24000b1e01017f03402000044020004108762100200141016a21010c010b0b20010b25002000200120026a417f6a220241087641fcffff07716a280200200241ff07714102746a0b2f01017f200028020820014904402001102e20002802002000280204102f210220002001360208200020023602000b0b6b01017f4101210302400240024002402002410146044020012c000022024100480d012000200241ff017110550c040b200241374b0d01200221030b200020034180017341ff017110550c010b200020021056200221030b200020012003410010510b20004101105320000b4f01037f20012802042203200128021020012802146a220441087641fcffff07716a21022000027f410020032001280208460d001a2002280200200441ff07714102746a0b360204200020023602000b2501017f200028020821020340200120024645044020002002417c6a22023602080c010b0b0b9b0101047f230041106b220124002001200036020c2000047f41e008200041086a2202411076220041e0082802006a220336020041dc0841dc08280200220420026a41076a417871220236020002400240200341107420024d044041e008200341016a360200200041016a21000c010b2000450d010b200040000d0010000b20042001410c6a4104102f41086a0541000b2100200141106a240020000bfc0801067f03400240200020046a2105200120046a210320022004460d002003410371450d00200520032d00003a0000200441016a21040c010b0b200220046b210602402005410371220745044003402006411049450440200020046a2203200120046a2205290200370200200341086a200541086a290200370200200441106a2104200641706a21060c010b0b027f2006410871450440200120046a2103200020046a0c010b200020046a2205200120046a2204290200370200200441086a2103200541086a0b21042006410471044020042003280200360200200341046a2103200441046a21040b20064102710440200420032f00003b0000200341026a2103200441026a21040b2006410171450d01200420032d00003a000020000f0b024020064120490d002007417f6a220741024b0d00024002400240024002400240200741016b0e020102000b2005200120046a220328020022073a0000200541016a200341016a2f00003b0000200041036a2108200220046b417d6a2106034020064111490d03200420086a2203200120046a220541046a2802002202410874200741187672360200200341046a200541086a2802002207410874200241187672360200200341086a2005410c6a28020022024108742007411876723602002003410c6a200541106a2802002207410874200241187672360200200441106a2104200641706a21060c000b000b2005200120046a220328020022073a0000200541016a200341016a2d00003a0000200041026a2108200220046b417e6a2106034020064112490d03200420086a2203200120046a220541046a2802002202411074200741107672360200200341046a200541086a2802002207411074200241107672360200200341086a2005410c6a28020022024110742007411076723602002003410c6a200541106a2802002207411074200241107672360200200441106a2104200641706a21060c000b000b2005200120046a28020022073a0000200041016a21082004417f7320026a2106034020064113490d03200420086a2203200120046a220541046a2802002202411874200741087672360200200341046a200541086a2802002207411874200241087672360200200341086a2005410c6a28020022024118742007410876723602002003410c6a200541106a2802002207411874200241087672360200200441106a2104200641706a21060c000b000b200120046a41036a2103200020046a41036a21050c020b200120046a41026a2103200020046a41026a21050c010b200120046a41016a2103200020046a41016a21050b20064110710440200520032d00003a00002005200328000136000120052003290005370005200520032f000d3b000d200520032d000f3a000f200541106a2105200341106a21030b2006410871044020052003290000370000200541086a2105200341086a21030b2006410471044020052003280000360000200541046a2105200341046a21030b20064102710440200520032f00003b0000200541026a2105200341026a21030b2006410171450d00200520032d00003a00000b20000b2801017f200028020820002802046b2201410874417f6a410020011b200028021420002802106a6b0ba10202057f017e230041206b22052400024020002802082202200028020c2203470d0020002802042204200028020022064b04402000200420022004200420066b41027541016a417e6d41027422036a103222023602082000200028020420036a3602040c010b200541086a200320066b2202410175410120021b220220024102762000410c6a10332103200028020821042000280204210203402002200446450440200328020820022802003602002003200328020841046a360208200241046a21020c010b0b20002902002107200020032902003702002003200737020020002902082107200020032902083702082003200737020820031034200028020821020b200220012802003602002000200028020841046a360208200541206a24000b2501017f200120006b220141027521032001044020022000200110360b200220034102746a0b4f01017f2000410036020c200041106a2003360200200104402001410274102521040b200020043602002000200420024102746a22023602082000200420014102746a36020c2000200236020420000b2b01027f200028020821012000280204210203402001200247044020002001417c6a22013602080c010b0b0b1b00200120006b22010440200220016b22022000200110360b20020b8d0301037f024020002001460d00200120006b20026b410020024101746b4d0440200020012002102f1a0c010b20002001734103712103027f024020002001490440200020030d021a410021030340200120036a2105200020036a2204410371450440200220036b210241002103034020024104490d04200320046a200320056a280200360200200341046a21032002417c6a21020c000b000b20022003460d04200420052d00003a0000200341016a21030c000b000b024020030d002001417f6a21040340200020026a22034103714504402001417c6a21032000417c6a2104034020024104490d03200220046a200220036a2802003602002002417c6a21020c000b000b2002450d042003417f6a200220046a2d00003a00002002417f6a21020c000b000b2001417f6a210103402002450d03200020026a417f6a200120026a2d00003a00002002417f6a21020c000b000b200320056a2101200320046a0b210303402002450d01200320012d00003a00002002417f6a2102200341016a2103200141016a21010c000b000b0b2201017f03402001410c470440200020016a4100360200200141046a21010c010b0b0bfd0101067f024020002802042202200028020022046b220520014904402000280208220720026b200120056b22034f04400340200241003a00002000200028020441016a22023602042003417f6a22030d000c030b000b2001200720046b2202410174220420042001491b41ffffffff07200241ffffffff03491b220104402001102521060b200520066a220521020340200241003a0000200241016a21022003417f6a22030d000b200120066a210420052000280204200028020022066b22016b2103200141014e0440200320062001102f1a0b2000200436020820002002360204200020033602000f0b200520014d0d002000200120046a3602040b0be90502057f017e230041a0016b22002400104d10032201102e22021004200041e8006a200041086a20022001411c103a22034100103b200041e8006a103c02400240200028026c450d00200041e8006a103c0240200028026822022c0000220141004e044020010d010c020b200141807f460d00200141ff0171220441b7014d0440200028026c41014d04401000200028026821020b20022d00010d010c020b200441bf014b0d01200028026c200141ff017141ca7e6a22014d04401000200028026821020b200120026a2d0000450d010b200028026c450d0020022d000041c001490d010b10000b200041406b200041e8006a103d2000280244220141094f044010000b200028024021020340200104402001417f6a210120023100002005420886842105200241016a21020c010b0b024002402005500d0041b208103e20055104402003103f200041e8006a104010410c020b419308103e2005510440200041406b1042210120031043410247044010000b200041e8006a20034101103b200041e8006a2001104420004190016a200041206a10402202200041e8006a2001101b101a20004190016a104520004190016a1041200210410c020b418008103e200551044020004190016a1046210120031043410247044010000b200041e8006a20034101103b200041e8006a20011047200041406b200041e8006a10402202200041206a200110131022200041406b1045200041406b1041200210410c020b41b708103e2005520d002003103f200041406b10402202280200210320022802042104200041206a1012210120004180016a4100360200200041f8006a4200370300200041f0006a420037030020004200370368200041e8006a200420036b41246dad2205101620002802682103200041e8006a4104721017200120031010200120051019220128020c200141106a28020047044010000b200128020020012802041008200128020c22030440200120033602100b200210410c010b10000b1048200041a0016a24000b730020004200370210200042ffffffff0f370208200020023602042000200136020002402003410871450d002000104e20024f0d002003410471044010000c010b200042003702000b02402003411071450d002000104e20024d0d0020034104710440100020000f0b200042003702000b20000bc90202067f017e230041106b220324002001280208220520024b0440200341086a2001104c20012003280208200328020c104b36020c20032001104c410021052001027f410020032802002207450d001a410020032802042208200128020c2206490d001a200820062006417f461b210420070b360210200141146a2004360200200141003602080b200141106a210603402001280214210402402005200249044020040d01410021040b2000200628020020044114103a1a200341106a24000f0b20032001104c41002104027f410020032802002205450d001a410020032802042208200128020c2207490d001a200820076b2104200520076a0b2105200120043602142001200536021020032006410020052004104b10502001200329030022093702102001200128020c2009422088a76a36020c2001200128020841016a22053602080c000b000b4101017f200028020445044010000b0240200028020022012d0000418101470d00200028020441014d047f100020002802000520010b2c00014100480d0010000b0bd50101047f200110492204200128020422024b04401000200128020421020b200128020021052000027f02400240200204404100210120052c00002203417f4a0d01027f200341ff0171220141bf014d04404100200341ff017141b801490d011a200141c97e6a0c010b4100200341ff017141f801490d001a200141897e6a0b41016a21010c010b4101210120050d000c010b41002103200120046a20024b0d0020022001490d00410020022004490d011a200120056a2103200220016b20042004417f461b0c010b41000b360204200020033602000b3901027e42a5c688a1c89ca7f94b210103402000300000220250450440200041016a2100200142b383808080207e20028521010c010b0b20010b0e0020001043410147044010000b0b8c0501097f230041a0016b2204240020004100360208200042003702002000410c6a41c708100b2101200041043602180240027f20012d00004101710440200041146a2802000c010b200141016a0b410410052203450d002004410036022020044200370318200441186a20031038027f20012d00004101710440200041146a2802000c010b200141016a0b200028021820042802182206200310061a0240024020042006200428021c20066b411c103a2203280204450d0020032802002d000041c001490d002003104321012000280208200028020022026b41246d20014904402000200441286a2001200028020420026b41246d200041086a101d2201101e2001101f0b200441f8006a20034101104a2101200441e8006a20034100104a2107200041086a210820012802042103034020072802042003464100200128020822022007280208461b0d02200441d0006a20032002411c103a200441286a10422203104402402000280204220220002802084904402002200310262000200028020441246a3602040c010b20044188016a2000200220002802006b41246d220241016a101c20022008101d210220042802900120031026200420042802900141246a3602900120002002101e2002101f0b20012001280204220320012802086a410020031b22033602042001280200220204402001200236020820032002104b21052001027f200128020422034504404100210241000c010b410021024100200128020822092005490d001a200920052005417f461b210220030b2203ad2002ad42208684370204200141002001280200220520026b2202200220054b1b3602000c0105200141003602080c010b000b000b10000b2006450d002004200636021c0b200441a0016a240020000b1501017f200028020022010440200020013602040b0b1900200010461a2000410c6a10461a200041186a10461a20000b800101047f230041106b2201240002402000280204450d0020002802002d000041c001490d00200141086a2000104c200128020c210003402000450d01200141002001280208220320032000104b22046a20034520002004497222031b3602084100200020046b20031b2100200241016a21020c000b000b200141106a240020020b5e01017f230041306b22022400200220004100103b200241186a20024100103b200241186a20011047200241186a20004101103b200241186a2001410c6a1047200241186a20004102103b200241186a200141186a1047200241306a24000b970201067f230041e0006b22012400200141086a10122103200141386a4100360200200141306a4200370300200141286a420037030020014200370320027f200028020020002802044604402001410136022041010c010b200141206a4100101421052000280204200028020022026b2104037f2004047f2005410010142206200210272006200141d0006a2002410c6a10131015200141406b200241186a10131015410110141a2004415c6a2104200241246a21020c01052005410110141a20012802200b0b0b2102200141206a4104721017200320021010200320001020200328020c200341106a28020047044010000b200328020020032802041008200328020c22020440200320023602100b200141e0006a24000b190020004200370200200041086a41003602002000103720000bf40201057f230041206b22022400024002402000280204044020002802002d000041c001490d010b200241086a10461a0c010b200241186a2000103d2000104921030240024002400240200228021822000440200228021c220520034f0d010b41002100200241106a410036020020024200370308410021050c010b200241106a4100360200200242003703082000200520032003417f461b22046a21052004410a4b0d010b200220044101743a0008200241086a41017221030c010b200441106a4170712206102521032002200436020c20022006410172360208200220033602100b03402000200546450440200320002d00003a0000200341016a2103200041016a21000c010b0b200341003a00000b024020012d0000410171450440200141003b01000c010b200128020841003a00002001410036020420012d0000410171450d00200141003602000b20012002290308370200200141086a200241106a280200360200200241086a1037200241206a24000b880101037f41cc08410136020041d0082802002100034020000440034041d40841d4082802002201417f6a2202360200200141014845044041cc084100360200200020024102746a22004184016a280200200041046a28020011020041cc08410136020041d00828020021000c010b0b41d408412036020041d008200028020022003602000c010b0b0bff0201037f200028020445044041000f0b2000103c41012102024020002802002c00002201417f4a0d00200141ff0171220341b7014d0440200341807f6a0f0b02400240200141ff0171220141bf014d0440024020002802042201200341c97e6a22024d047f100020002802040520010b4102490d0020002802002d00010d0010000b200241054f044010000b20002802002d000145044010000b4100210241b7012101034020012003460440200241384f0d030c0405200028020020016a41ca7e6a2d00002002410874722102200141016a21010c010b000b000b200141f7014d0440200341c07e6a0f0b024020002802042201200341897e6a22024d047f100020002802040520010b4102490d0020002802002d00010d0010000b200241054f044010000b20002802002d000145044010000b4100210241f701210103402001200346044020024138490d0305200028020020016a418a7e6a2d00002002410874722102200141016a21010c010b0b0b200241ff7d490d010b10000b20020be70101037f230041106b2204240020004200370200200041086a410036020020012802042103024002402002450440200321020c010b410021022003450d002003210220012802002d000041c001490d00200441086a2001104c20004100200428020c2201200428020822022001104b22032003417f461b20024520012003497222031b220536020820004100200220031b3602042000200120056b3602000c010b20012802002103200128020421012000410036020020004100200220016b20034520022001497222021b36020820004100200120036a20021b3602040b200441106a240020000b2701017f230041206b22022400200241086a200020014114103a104e2100200241206a240020000b2101017f20011049220220012802044b044010000b200020012001104f200210500b3501017f230041106b220041f0880436020c41d808200028020c41076a417871220036020041dc08200036020041e0083f003602000b2e01017f200028020445044041000f0b4101210120002802002c0000417f4c047f2000104f200010496a0520010b0b5b00027f027f41002000280204450d001a410020002802002c0000417f4a0d011a20002802002d0000220041bf014d04404100200041b801490d011a200041c97e6a0c010b4100200041f801490d001a200041897e6a0b41016a0b0b5b01027f2000027f0240200128020022054504400c010b200220036a200128020422014b0d0020012002490d00410020012003490d011a200220056a2104200120026b20032003417f461b0c010b41000b360204200020043602000b2d00200020021052200028020020002802046a20012002102f1a2000200028020420026a3602042000200310530b1b00200028020420016a220120002802084b044020002001102a0b0b820201047f02402001450d00034020002802102202200028020c460d01200241786a28020020014904401000200028021021020b200241786a2203200328020020016b220136020020010d012000200336021020004101200028020422032002417c6a28020022016b22021028220441016a20024138491b220520036a1054200120002802006a220320056a2003200210360240200241374d0440200028020020016a200241406a3a00000c010b200441f7016a220341ff014d0440200028020020016a20033a00002000280200200120046a6a210103402002450d02200120023a0000200241087621022001417f6a21010c000b000b10000b410121010c000b000b0b0f0020002001102a200020013602040b2500200041011052200028020020002802046a20013a00002000200028020441016a3602040b5e01027f20011028220241b7016a22034180024e044010000b2000200341ff017110552000200028020420026a1054200028020420002802006a417f6a2100034020010440200020013a0000200141087621012000417f6a21000c010b0b0b0b5201004180080b4b6765745f6d657373616765006576656e7432006164645f6d657373616765006576656e74310068656c6c6f5f6576656e7400696e6974006765745f766563746f725f73697a6500696e666f";

    public static String BINARY = BINARY_0;

    public static final String FUNC_ADD_MESSAGE = "add_message";

    public static final String FUNC_GET_MESSAGE = "get_message";

    public static final String FUNC_GET_VECTOR_SIZE = "get_vector_size";

    public static final WasmEvent HELLO_EVENT_EVENT = new WasmEvent("hello_event", Arrays.asList(new WasmEventParameter(String.class, true)), Arrays.asList(new WasmEventParameter(String.class) , new WasmEventParameter(Uint32.class)));
    ;

    protected ContractOriginType(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected ContractOriginType(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public List<Hello_eventEventResponse> getHello_eventEvents(TransactionReceipt transactionReceipt) {
        List<WasmContract.WasmEventValuesWithLog> valueList = extractEventParametersWithLog(HELLO_EVENT_EVENT, transactionReceipt);
        ArrayList<Hello_eventEventResponse> responses = new ArrayList<Hello_eventEventResponse>(valueList.size());
        for (WasmContract.WasmEventValuesWithLog eventValues : valueList) {
            Hello_eventEventResponse typedResponse = new Hello_eventEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.topic = (String) eventValues.getIndexedValues().get(0);
            typedResponse.arg1 = (String) eventValues.getNonIndexedValues().get(0);
            typedResponse.arg2 = (Uint32) eventValues.getNonIndexedValues().get(1);
            responses.add(typedResponse);
        }
        return responses;
    }

    public Observable<Hello_eventEventResponse> hello_eventEventObservable(PlatonFilter filter) {
        return web3j.platonLogObservable(filter).map(new Func1<Log, Hello_eventEventResponse>() {
            @Override
            public Hello_eventEventResponse call(Log log) {
                WasmContract.WasmEventValuesWithLog eventValues = extractEventParametersWithLog(HELLO_EVENT_EVENT, log);
                Hello_eventEventResponse typedResponse = new Hello_eventEventResponse();
                typedResponse.log = log;
                typedResponse.topic = (String) eventValues.getIndexedValues().get(0);
                typedResponse.arg1 = (String) eventValues.getNonIndexedValues().get(0);
                typedResponse.arg2 = (Uint32) eventValues.getNonIndexedValues().get(1);
                return typedResponse;
            }
        });
    }

    public Observable<Hello_eventEventResponse> hello_eventEventObservable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        PlatonFilter filter = new PlatonFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(WasmEventEncoder.encode(HELLO_EVENT_EVENT));
        return hello_eventEventObservable(filter);
    }

    public static RemoteCall<ContractOriginType> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        String encodedConstructor = WasmFunctionEncoder.encodeConstructor(BINARY, Arrays.asList());
        return deployRemoteCall(ContractOriginType.class, web3j, credentials, contractGasProvider, encodedConstructor);
    }

    public static RemoteCall<ContractOriginType> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        String encodedConstructor = WasmFunctionEncoder.encodeConstructor(BINARY, Arrays.asList());
        return deployRemoteCall(ContractOriginType.class, web3j, transactionManager, contractGasProvider, encodedConstructor);
    }

    public static RemoteCall<ContractOriginType> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider, BigInteger initialVonValue) {
        String encodedConstructor = WasmFunctionEncoder.encodeConstructor(BINARY, Arrays.asList());
        return deployRemoteCall(ContractOriginType.class, web3j, credentials, contractGasProvider, encodedConstructor, initialVonValue);
    }

    public static RemoteCall<ContractOriginType> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider, BigInteger initialVonValue) {
        String encodedConstructor = WasmFunctionEncoder.encodeConstructor(BINARY, Arrays.asList());
        return deployRemoteCall(ContractOriginType.class, web3j, transactionManager, contractGasProvider, encodedConstructor, initialVonValue);
    }

    public RemoteCall<TransactionReceipt> add_message(My_message one_message) {
        final WasmFunction function = new WasmFunction(FUNC_ADD_MESSAGE, Arrays.asList(one_message), Void.class);
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> add_message(My_message one_message, BigInteger vonValue) {
        final WasmFunction function = new WasmFunction(FUNC_ADD_MESSAGE, Arrays.asList(one_message), Void.class);
        return executeRemoteCallTransaction(function, vonValue);
    }

    public RemoteCall<My_message[]> get_message(String name) {
        final WasmFunction function = new WasmFunction(FUNC_GET_MESSAGE, Arrays.asList(name), My_message[].class);
        return executeRemoteCall(function, My_message[].class);
    }

    public RemoteCall<Uint64> get_vector_size() {
        final WasmFunction function = new WasmFunction(FUNC_GET_VECTOR_SIZE, Arrays.asList(), Uint64.class);
        return executeRemoteCall(function, Uint64.class);
    }

    public static ContractOriginType load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new ContractOriginType(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static ContractOriginType load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new ContractOriginType(contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static class Hello_eventEventResponse {
        public Log log;

        public String topic;

        public String arg1;

        public Uint32 arg2;
    }

    public static class Message {
        public String head;
    }

    public static class My_message {
        public Message baseClass;

        public String body;

        public String end;
    }
}
