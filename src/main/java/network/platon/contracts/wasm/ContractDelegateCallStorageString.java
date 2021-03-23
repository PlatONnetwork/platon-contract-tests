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
public class ContractDelegateCallStorageString extends WasmContract {
    private static String BINARY_0 = "0x0061736d0100000001560f60027f7f0060017f0060017f017f60000060037f7f7f0060027f7f017f60037f7f7f017f60047f7f7f7f0060027f7e0060047f7f7f7f017f60017f017e60037f7f7e006000017f60057f7f7f7f7f017f60017e017f02c4010803656e760c706c61746f6e5f70616e6963000303656e7617706c61746f6e5f6765745f696e7075745f6c656e677468000c03656e7610706c61746f6e5f6765745f696e707574000103656e7617706c61746f6e5f6765745f73746174655f6c656e677468000503656e7610706c61746f6e5f6765745f7374617465000903656e7610706c61746f6e5f7365745f7374617465000703656e7614706c61746f6e5f64656c65676174655f63616c6c000d03656e760d706c61746f6e5f72657475726e0000033a39030b0502050206080000080000010002040104010000010600040e02000100000105090002020200060403040a0a01020003010005030202070405017001010105030100020608017f0141e089040b073904066d656d6f72790200115f5f7761736d5f63616c6c5f63746f727300080f5f5f66756e63735f6f6e5f65786974003906696e766f6b6500320af85a390400103d0b971a020d7f017e23004190016b22032400200341e0006a418008100a220528020420032d00602204410176200441017122061b21042005280208200541016a20061b210542a5c688a1c89ca7f94b21100340200404402004417f6a21042005300000201042b383808080207e852110200541016a21050c010b0b200341386a100b2104200341f0006a2001100c2105200428020421010240200441106a2802002206200441146a280200220749044020062001ad4220864202843702002004200428021041086a3602100c010b027f41002006200428020c22086b410375220941016a2206200720086b2207410275220820082006491b41ffffffff01200741037541ffffffff00491b2208450d001a2008410374100d0b2106200620094103746a22072001ad42208642028437020020072004280210200428020c220c6b22016b2109200620084103746a2106200741086a2107200141014e04402009200c2001100e1a0b20042006360214200420073602102004200936020c0b200341306a4100360200200341286a4200370300200341206a420037030020034200370318200341186a2010100f200341186a20034180016a2005100c1010200420032802181011200420101012200420034180016a2005100c1013027f02400240200428020c2004280210460440200428020021010c010b100020042802002101200428020c2004280210470d010b20010c010b100020042802000b210520034100360210200342003703080240200520042802046a20016b2205450d00200341086a2005101420054101480d002003200328020c20012005100e20056a36020c0b200341186a4104721015200428020c22050440200420053602100b200341d0006a418b08100a210e2000280208200041016a220c20002d0000220441017122051b21082000280204200441017620051b210941002104410121014100210641002107024003402001410171410020042009491b0440200420086a2d00002205415f6a41ff017141de004921012006200541bf7f6a41ff0171411a4972210620072005419f7f6a41ff0171411a49722107200441016a21040c01050240200120062007714101737121062009450d002009210403402004450d01200420086a21012004417f6a220521042001417f6a2d00004131470d000b0c030b0b0b417f21050b0240024002402006410171450d00200541076a20094b0d00200541016a4102490d00200941da004b0d00410021042003410036028801200342003703800120034180016a20092005417f7322076a10164101210602400240024003402004200028020420002d00002201410176200141017122011b20076a4f044002402006410171450d05200341f0006a1017220441016a210d410021010340200120054604402004280204220720032d007022054101762208200541017122061b2201200e28020420032d00502205410176200541017122051b470d05200e280208200e41016a20051b210520060d0220082101200d210603402001450440200821070c080b20062d000020052d0000470d06200541016a2105200641016a21062001417f6a21010c000b00052000280208200c20002d00004101711b20016a2c00002208412072210b200841bf7f6a411a49210a027f20032d00702209410171220f45044020094101762106410a0c010b2004280204210620042802002209417e71417f6a0b2107200b2008200a1b210b024002400240200620074604402004280208200d20094101711b210a416f2109200741e6ffffff074d0440410b20074101742208200741016a220920092008491b220841106a4170712008410b491b21090b2009100d2208200a2007101820042009410172360200200420083602080c010b200f450d01200428020821080b2004200641016a3602040c010b2003200641017441026a3a0070200d21080b200620086a220641003a00012006200b3a0000200141016a21010c010b000b000b0520032802800120046a2000280208200c20011b20056a20046a41016a2d00004190086a2d000022013a00002006200141ff0147712106200441016a21040c010b0b2001450d012004280208210603402001450d0220062d000020052d0000470d01200541016a2105200641016a21062001417f6a21010c000b000b200341386a1019200341286a200341c8006a280200360200200341206a200341406b290300370300200341003a002c200320032903383703182003280280012204450d0320032004360284010c030b410021052003410036024020034200370338200341386a2007410174410172101603402005200428020420032d00702201410176200141017122011b2206490440200328023820056a2004280208200d20011b20056a2d000022014105763a00002003280238200428020420032d0070220641017620064101711b6a20056a41016a2001411f713a0000200541016a21050c010b0b200328023820066a41003a0000200328023c21010240200328028401220520032802800122046b22064101480d0020062003280240220820016b4c0440034020042005460d02200120042d00003a00002003200328023c41016a220136023c200441016a21040c000b000b200341286a200341406b36020041002107200341003602242001200328023822006b2109200120066a20006b2206200820006b2208410174220020002006491b41ffffffff07200841ffffffff03491b220804402008100d21070b200320073602182003200720096a22063602202003200720086a3602242003200636021c200341186a4104722107034020042005470440200620042d00003a00002003200328022041016a2206360220200441016a21040c010b0b200328023820012007101a0240200328023c220520016b220441004c0440200328022021010c010b2003200328022020012004100e20046a2201360220200328023c21050b200328023821042003200328021c3602382003200436021c2003200136023c2003200536022020032802402105200320032802243602402003200536022420032004360218200341186a101b200328023c21010b2003420037023c2003280238210520034100360238200120056b21014101210403402001044020052d000041002004411d764101716b41b3c5d1d0027141002004411c764101716b41dde788ea037141002004411b764101716b41fab384f5017141002004411a764101716b41ed9cc2b20271410020044119764101716b41b2afa9db0371200441057441e0ffffff037173737373737321042001417f6a2101200541016a21050c010b0b20044101470d004100210a20034100360268200342003703602003410036024020034200370338027f4100200328028401417a6a220120032802800122046b2205450d001a200341386a20051014034020012004470440200328023c220520042d00003a00002003200541016a36023c200441016a21040c010b0b2003280238210a200328023c0b200a6b210f200341e8006a210c41002104410021084100210b02400340200b200f46044002402008410820046b7441ff0171452004410548712104200a04402003200a36023c0b20040d00200328026021040c030b05200a200b6a2d0000200841057441e01f71722108200441056a21040340200441084e04402008200441786a22047621012003280264220620032802682207490440200620013a00002003200328026441016a3602640c02052003200c36022841002105200341003602242006200328026022006b220641016a2209200720006b2207410174220020002009491b41ffffffff07200741ffffffff03491b220704402007100d21050b20032005360218200520066a220620013a00002003200520076a3602242003200636021c2003200641016a360220200341e0006a200341186a101c200341186a101b0c020b000b0b200b41016a210b0c010b0b2003280264200328026022046b4114470d0041002104200341003a0018200341386a200341186a101d2003280264200328026022056b21010340024020012004460d00200441134b0d00200341386a20046a200420056a2d00003a0000200441016a21040c010b0b200341286a200341c8006a280200360200200341206a200341406b29030037030020032003290338370318200341013a002c20050440200320053602640b2003280280012204044020032004360284010b4100210420022110034020105045044020104208882110200441016a21040c010b0b2003410036024020034200370338200341386a20041016200328023c417f6a21040340200250450440200420023c00002004417f6a2104200242088821020c010b0b200341186a20032802082204200328020c20046b20032802382205200328023c20056b10061a20032802382205450d042003200536023c0c040b2004450d00200320043602640b2003280280012204450d0020032004360284010b200341386a1019200341286a200341c8006a280200360200200341206a200341406b290300370300200341003a002c200320032903383703180b200328020821040b200404402003200436020c0b20034190016a24000b910101027f20004200370200200041086a410036020020012102024003402002410371044020022d0000450d02200241016a21020c010b0b2002417c6a21020340200241046a22022802002203417f73200341fffdfb776a7141808182847871450d000b0340200341ff0171450d01200241016a2d00002103200241016a21020c000b000b20002001200220016b103120000b29002000410036020820004200370200200041001024200041146a41003602002000420037020c20000b4d01017f20004200370200200041086a2202410036020020012d0000410171450440200020012902003702002002200141086a28020036020020000f0b200020012802082001280204103120000b0b002000410120001b102d0bfc0801067f03400240200020046a2105200120046a210320022004460d002003410371450d00200520032d00003a0000200441016a21040c010b0b200220046b210602402005410371220745044003402006411049450440200020046a2203200120046a2205290200370200200341086a200541086a290200370200200441106a2104200641706a21060c010b0b027f2006410871450440200120046a2103200020046a0c010b200020046a2205200120046a2204290200370200200441086a2103200541086a0b21042006410471044020042003280200360200200341046a2103200441046a21040b20064102710440200420032f00003b0000200341026a2103200441026a21040b2006410171450d01200420032d00003a000020000f0b024020064120490d002007417f6a220741024b0d00024002400240024002400240200741016b0e020102000b2005200120046a220328020022073a0000200541016a200341016a2f00003b0000200041036a2108200220046b417d6a2106034020064111490d03200420086a2203200120046a220541046a2802002202410874200741187672360200200341046a200541086a2802002207410874200241187672360200200341086a2005410c6a28020022024108742007411876723602002003410c6a200541106a2802002207410874200241187672360200200441106a2104200641706a21060c000b000b2005200120046a220328020022073a0000200541016a200341016a2d00003a0000200041026a2108200220046b417e6a2106034020064112490d03200420086a2203200120046a220541046a2802002202411074200741107672360200200341046a200541086a2802002207411074200241107672360200200341086a2005410c6a28020022024110742007411076723602002003410c6a200541106a2802002207411074200241107672360200200441106a2104200641706a21060c000b000b2005200120046a28020022073a0000200041016a21082004417f7320026a2106034020064113490d03200420086a2203200120046a220541046a2802002202411874200741087672360200200341046a200541086a2802002207411874200241087672360200200341086a2005410c6a28020022024118742007410876723602002003410c6a200541106a2802002207411874200241087672360200200441106a2104200641706a21060c000b000b200120046a41036a2103200020046a41036a21050c020b200120046a41026a2103200020046a41026a21050c010b200120046a41016a2103200020046a41016a21050b20064110710440200520032d00003a00002005200328000136000120052003290005370005200520032f000d3b000d200520032d000f3a000f200541106a2105200341106a21030b2006410871044020052003290000370000200541086a2105200341086a21030b2006410471044020052003280000360000200541046a2105200341046a21030b20064102710440200520032f00003b0000200541026a2105200341026a21030b2006410171450d00200520032d00003a00000b20000b880102027f017e4101210220014280015a044041002102034020012004845045044020044238862001420888842101200241016a2102200442088821040c010b0b200241384f047f2002102e20026a0520020b41016a21020b200041186a28020022030440200041086a280200200041146a2802002003103021000b2000200028020020026a3602000b9a0101037f41012103024002400240200128020420012d00002202410176200241017122041b220241014d0440200241016b0d032001280208200141016a20041b2c0000417f4c0d010c030b200241374b0d010b200241016a21030c010b2002102e20026a41016a21030b200041186a28020022010440200041086a280200200041146a2802002001103021000b2000200028020020036a3602000b1300200028020820014904402000200110240b0bbc0202037f027e02402001500440200041800110260c010b20014280015a044020012106034020052006845045044020054238862006420888842106200241016a2102200542088821050c010b0b0240200241384f04402002210403402004044020044108762104200341016a21030c010b0b200341c9004f044010000b2000200341b77f6a41ff017110262000200028020420036a1027200028020420002802006a417f6a21032002210403402004450d02200320043a0000200441087621042003417f6a21030c000b000b200020024180017341ff017110260b2000200028020420026a1027200028020420002802006a417f6a21024200210503402001200584500d02200220013c0000200542388620014208888421012002417f6a2102200542088821050c000b000b20002001a741ff017110260b200010280b810201047f410121022001280208200141016a20012d0000220341017122051b210402400240024002402001280204200341017620051b2203410146044020042c000022014100480d012000200141ff017110260c040b200341374b0d01200321020b200020024180017341ff017110260c010b2003102e220141b7016a22024180024e044010000b2000200241ff017110262000200028020420016a1027200028020420002802006a417f6a210220032101037f2001047f200220013a0000200141087621012002417f6a21020c010520030b0b21020b20002002102f200028020020002802046a20042002100e1a2000200028020420026a3602040b200010280b2001017f20002001100d2202360200200020023602042000200120026a3602080b860201067f200028020422032000280210220141087641fcffff07716a2102027f200320002802082204460440200041146a210641000c010b2003200028021420016a220541087641fcffff07716a280200200541ff07714102746a2105200041146a21062002280200200141ff07714102746a0b21010340024020012005460440200641003602000340200420036b41027522014103490d022000200341046a22033602040c000b000b200141046a220120022802006b418020470d0120022802042101200241046a21020c010b0b2001417f6a220241014d04402000418004418008200241016b1b3602100b03402003200447044020002004417c6a22043602080c010b0b0bfa0101057f230041206b22022400024020002802042203200028020022046b22052001490440200028020820036b200120056b22044f04400340200341003a00002000200028020441016a22033602042004417f6a22040d000c030b000b2000200110292106200241186a200041086a3602002002410036021441002101200604402006100d21010b200220013602082002200120056a22033602102002200120066a3602142002200336020c0340200341003a00002002200228021041016a22033602102004417f6a22040d000b2000200241086a101c200241086a101b0c010b200520014d0d002000200120046a3602040b200241206a24000b190020004200370200200041086a41003602002000102520000b100020020440200020012002100e1a0b0b2401017f230041106b22012400200141003a000f20002001410f6a101d200141106a24000b270020022002280200200120006b22016b2202360200200141014e0440200220002001100e1a0b0b2b01027f200028020821012000280204210203402001200247044020002001417f6a22013602080c010b0b0b6701017f20002802002000280204200141046a101a200028020021022000200128020436020020012002360204200028020421022000200128020836020420012002360208200028020821022000200128020c3602082001200236020c200120012802043602000b2601017f03402002411446450440200020026a20012d00003a0000200241016a21020c010b0b0b9a0601097f230041f0006b22022400200241086a10171a200242e299efdb8683ebcf58370318200241206a10172104200241d8006a100b220120022903181012200128020c200141106a28020047044010000b02402001280200220620012802042207100322054504400c010b2002410036023820024200370330200241306a200510162006200720022802302208200228023420086b1004417f470440200241406b2002280230220341016a20022802342003417f736a101f20041020200521030b20022802302205450d00200220053602340b200128020c22050440200120053602100b024020030d002002280210200241086a41017220022d0008220141017122031b2105200228020c200141017620031b22012004280200417e71417f6a410a20042d000041017122061b22034d0440200241286a280200200441016a20061b21032001044020032005200110210b200120036a41003a000020042d00004101710440200241246a20013602000c020b200420014101743a00000c010b416f2106200341e6ffffff074d0440410b20034101742203200120012003491b220341106a4170712003410b491b21060b2006100d220320052001101820042006410172360200200241286a2003360200200241246a2001360200200120036a41003a00000b20002004100c1a200241d8006a100b2203200229031810221011200320022903181012200328020c200341106a28020047044010000b2003280204210620032802002107200241406b100b21012004102321084101100d220541fe013a0000200128020c200141106a28020047044010000b2001280204220041016a220920012802084b047f20012009102420012802040520000b20012802006a20054101100e1a2001200128020441016a3602042001200541016a200820056b6a10112001200241306a2004100c10130240200128020c2001280210460440200128020021040c010b100020012802002104200128020c2001280210460d0010000b20072006200420012802041005200128020c22040440200120043602100b200328020c22010440200320013602100b200241f0006a24000b0c00200020012002411c102a0bf40201057f230041206b22022400024002402000280204044020002802002d000041c001490d010b200241086a10171a0c010b200241186a2000102b2000102c21030240024002400240200228021822000440200228021c220520034f0d010b41002100200241106a410036020020024200370308410021050c010b200241106a4100360200200242003703082000200520032003417f461b22046a21052004410a4b0d010b200220044101743a0008200241086a41017221030c010b200441106a4170712206100d21032002200436020c20022006410172360208200220033602100b03402000200546450440200320002d00003a0000200341016a2103200041016a21000c010b0b200341003a00000b024020012d0000410171450440200141003b01000c010b200128020841003a00002001410036020420012d0000410171450d00200141003602000b20012002290308370200200141086a200241106a280200360200200241086a1025200241206a24000b8d0301037f024020002001460d00200120006b20026b410020024101746b4d0440200020012002100e1a0c010b20002001734103712103027f024020002001490440200020030d021a410021030340200120036a2105200020036a2204410371450440200220036b210241002103034020024104490d04200320046a200320056a280200360200200341046a21032002417c6a21020c000b000b20022003460d04200420052d00003a0000200341016a21030c000b000b024020030d002001417f6a21040340200020026a22034103714504402001417c6a21032000417c6a2104034020024104490d03200220046a200220036a2802003602002002417c6a21020c000b000b2002450d042003417f6a200220046a2d00003a00002002417f6a21020c000b000b2001417f6a210103402002450d03200020026a417f6a200120026a2d00003a00002002417f6a21020c000b000b200320056a2101200320046a0b210303402002450d01200320012d00003a00002002417f6a2102200341016a2103200141016a21010c000b000b0b4f01027f230041206b22012400200141186a4100360200200141106a4200370300200141086a42003703002001420037030020012000100f2001280200210220014104721015200141206a240020020b5901017f230041306b22012400200141286a4100360200200141206a4200370300200141186a420037030020014200370310200141106a20012000100c101020012802102100200141106a4104721015200141306a240020000b2f01017f200028020820014904402001102d20002802002000280204100e210220002001360208200020023602000b0b2201017f03402001410c470440200020016a4100360200200141046a21010c010b0b0b250020004101102f200028020020002802046a20013a00002000200028020441016a3602040b0f00200020011024200020013602040bf80101057f0340024020002802102201200028020c460d00200141786a28020041014904401000200028021021010b200141786a2203200328020041016b220236020020020d002000200336021020004101200028020422032001417c6a28020022026b2201102e220441016a20014138491b220520036a1027200220002802006a220320056a2003200110210240200141374d0440200028020020026a200141406a3a00000c010b200441f7016a220341ff014d0440200028020020026a20033a00002000280200200220046a6a210203402001450d02200220013a0000200141087621012002417f6a21020c000b000b10000b0c010b0b0b2e01017f2001200028020820002802006b2200410174220220022001491b41ffffffff07200041ffffffff03491b0b730020004200370210200042ffffffff0f370208200020023602042000200136020002402003410871450d002000103e20024f0d002003410471044010000c010b200042003702000b02402003411071450d002000103e20024d0d0020034104710440100020000f0b200042003702000b20000bd50101047f2001102c2204200128020422024b04401000200128020421020b200128020021052000027f02400240200204404100210120052c00002203417f4a0d01027f200341ff0171220141bf014d04404100200341ff017141b801490d011a200141c97e6a0c010b4100200341ff017141f801490d001a200141897e6a0b41016a21010c010b4101210120050d000c010b41002103200120046a20024b0d0020022001490d00410020022004490d011a200120056a2103200220016b20042004417f461b0c010b41000b360204200020033602000bff0201037f200028020445044041000f0b2000103a41012102024020002802002c00002201417f4a0d00200141ff0171220341b7014d0440200341807f6a0f0b02400240200141ff0171220141bf014d0440024020002802042201200341c97e6a22024d047f100020002802040520010b4102490d0020002802002d00010d0010000b200241054f044010000b20002802002d000145044010000b4100210241b7012101034020012003460440200241384f0d030c0405200028020020016a41ca7e6a2d00002002410874722102200141016a21010c010b000b000b200141f7014d0440200341c07e6a0f0b024020002802042201200341897e6a22024d047f100020002802040520010b4102490d0020002802002d00010d0010000b200241054f044010000b20002802002d000145044010000b4100210241f701210103402001200346044020024138490d0305200028020020016a418a7e6a2d00002002410874722102200141016a21010c010b0b0b200241ff7d490d010b10000b20020b9b0101047f230041106b220124002001200036020c2000047f41d009200041086a2202411076220041d0092802006a220336020041cc0941cc09280200220420026a41076a417871220236020002400240200341107420024d044041d009200341016a360200200041016a21000c010b2000450d010b200040000d0010000b20042001410c6a4104100e41086a0541000b2100200141106a240020000b1e01017f03402000044020004108762100200141016a21010c010b0b20010b1b00200028020420016a220120002802084b04402000200110240b0b25002000200120026a417f6a220241087641fcffff07716a280200200241ff07714102746a0b5a01027f02402002410a4d0440200020024101743a0000200041016a21030c010b200241106a4170712204100d21032000200236020420002004410172360200200020033602080b2003200120021018200220036a41003a00000baa0302047f017e23004180016b22002400103d10012201102d22021002200041286a200041086a20022001101f22014100103302400240200041286a10342204500d0041900910352004510440200110360c020b41950910352004510440200041286a10172102200041346a101721032000420037034020011037410447044010000b20004101360248200020013602702000200041c8006a360274200041f0006a20021038200041f0006a20031038200041d8006a2001200028024810332000200041d8006a1034370340200041f0006a2002100c200041c8006a2003100c20002903401009200041d8006a100b2201420010221011200142001012200128020c200141106a28020047044010000b200128020020012802041007200128020c2202450d02200120023602100c020b41ae0910352004520d0020011036200041f0006a101e200041286a100b2201200041f0006a102310112001200041d8006a200041f0006a100c1013200128020c200141106a28020047044010000b200128020020012802041007200128020c2202450d01200120023602100c010b10000b103920004180016a24000bc90202067f017e230041106b220324002001280208220520024b0440200341086a2001103b20012003280208200328020c103c36020c20032001103b410021052001027f410020032802002207450d001a410020032802042208200128020c2206490d001a200820062006417f461b210420070b360210200141146a2004360200200141003602080b200141106a210603402001280214210402402005200249044020040d01410021040b2000200628020020044114102a1a200341106a24000f0b20032001103b41002104027f410020032802002205450d001a410020032802042208200128020c2207490d001a200820076b2104200520076a0b2105200120043602142001200536021020032006410020052004103c10402001200329030022093702102001200128020c2009422088a76a36020c2001200128020841016a22053602080c000b000b870202047f017e230041106b220324002000103a024002402000280204450d002000103a0240200028020022022c0000220141004e044020010d010c020b200141807f460d00200141ff0171220441b7014d0440200028020441014d04401000200028020021020b20022d00010d010c020b200441bf014b0d012000280204200141ff017141ca7e6a22014d04401000200028020021020b200120026a2d0000450d010b2000280204450d0020022d000041c001490d010b10000b200341086a2000102b200328020c220041094f044010000b200328020821010340200004402000417f6a210020013100002005420886842105200141016a21010c010b0b200341106a240020050b3901027e42a5c688a1c89ca7f94b210103402000300000220250450440200041016a2100200142b383808080207e20028521010c010b0b20010b0e0020001037410147044010000b0b800101047f230041106b2201240002402000280204450d0020002802002d000041c001490d00200141086a2000103b200128020c210003402000450d01200141002001280208220320032000103c22046a20034520002004497222031b3602084100200020046b20031b2100200241016a21020c000b000b200141106a240020020b4301017f230041206b22022400200241086a200028020020002802042802001033200241086a2001102020002802042200200028020041016a360200200241206a24000b880101037f41bc09410136020041c0092802002100034020000440034041c40941c4092802002201417f6a2202360200200141014845044041bc094100360200200020024102746a22004184016a280200200041046a28020011010041bc09410136020041c00928020021000c010b0b41c409412036020041c009200028020022003602000c010b0b0b4101017f200028020445044010000b0240200028020022012d0000418101470d00200028020441014d047f100020002802000520010b2c00014100480d0010000b0b2101017f2001102c220220012802044b044010000b200020012001103f200210400b2701017f230041206b22022400200241086a200020014114102a103e2100200241206a240020000b3501017f230041106b220041e0890436020c41c809200028020c41076a417871220036020041cc09200036020041d0093f003602000b2e01017f200028020445044041000f0b4101210120002802002c0000417f4c047f2000103f2000102c6a0520010b0b5b00027f027f41002000280204450d001a410020002802002c0000417f4a0d011a20002802002d0000220041bf014d04404100200041b801490d011a200041c97e6a0c010b4100200041f801490d001a200041897e6a0b41016a0b0b5b01027f2000027f0240200128020022054504400c010b200220036a200128020422014b0d0020012002490d00410020012003490d011a200220056a2104200120026b20032003417f461b0c010b41000b360204200020043602000b0bc00101004180080bb8017365745f737472696e67006c61740000ffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff0fff0a1115141a1e0705ffffffffffffff1dff180d19090817ff12161f1b13ff010003100b1c0c0e060402ffffffffffff1dff180d19090817ff12161f1b13ff010003100b1c0c0e060402ffffffffff696e69740064656c65676174655f63616c6c5f7365745f737472696e67006765745f737472696e67";

    public static String BINARY = BINARY_0;

    public static final String FUNC_DELEGATE_CALL_SET_STRING = "delegate_call_set_string";

    public static final String FUNC_GET_STRING = "get_string";

    protected ContractDelegateCallStorageString(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected ContractDelegateCallStorageString(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static RemoteCall<ContractDelegateCallStorageString> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        String encodedConstructor = WasmFunctionEncoder.encodeConstructor(BINARY, Arrays.asList());
        return deployRemoteCall(ContractDelegateCallStorageString.class, web3j, credentials, contractGasProvider, encodedConstructor);
    }

    public static RemoteCall<ContractDelegateCallStorageString> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        String encodedConstructor = WasmFunctionEncoder.encodeConstructor(BINARY, Arrays.asList());
        return deployRemoteCall(ContractDelegateCallStorageString.class, web3j, transactionManager, contractGasProvider, encodedConstructor);
    }

    public static RemoteCall<ContractDelegateCallStorageString> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider, BigInteger initialVonValue) {
        String encodedConstructor = WasmFunctionEncoder.encodeConstructor(BINARY, Arrays.asList());
        return deployRemoteCall(ContractDelegateCallStorageString.class, web3j, credentials, contractGasProvider, encodedConstructor, initialVonValue);
    }

    public static RemoteCall<ContractDelegateCallStorageString> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider, BigInteger initialVonValue) {
        String encodedConstructor = WasmFunctionEncoder.encodeConstructor(BINARY, Arrays.asList());
        return deployRemoteCall(ContractDelegateCallStorageString.class, web3j, transactionManager, contractGasProvider, encodedConstructor, initialVonValue);
    }

    public RemoteCall<TransactionReceipt> delegate_call_set_string(String target_address, String name, Uint64 gas) {
        final WasmFunction function = new WasmFunction(FUNC_DELEGATE_CALL_SET_STRING, Arrays.asList(target_address,name,gas), Void.class);
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> delegate_call_set_string(String target_address, String name, Uint64 gas, BigInteger vonValue) {
        final WasmFunction function = new WasmFunction(FUNC_DELEGATE_CALL_SET_STRING, Arrays.asList(target_address,name,gas), Void.class);
        return executeRemoteCallTransaction(function, vonValue);
    }

    public RemoteCall<String> get_string() {
        final WasmFunction function = new WasmFunction(FUNC_GET_STRING, Arrays.asList(), String.class);
        return executeRemoteCall(function, String.class);
    }

    public static ContractDelegateCallStorageString load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new ContractDelegateCallStorageString(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static ContractDelegateCallStorageString load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new ContractDelegateCallStorageString(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
