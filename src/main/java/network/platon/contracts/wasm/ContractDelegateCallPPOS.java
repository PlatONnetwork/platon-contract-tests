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
public class ContractDelegateCallPPOS extends WasmContract {
    private static String BINARY_0 = "0x0061736d0100000001671160027f7f0060017f017f60017f0060037f7f7f0060027f7f017f60000060037f7f7f017f60047f7f7f7f006000017f60047f7f7f7f017f60017f017e60047f7f7f7e0060037e7e7f0060057f7f7f7f7f017f60037f7f7e017f60027e7e017f60037f7f7e017e02de020f03656e760c706c61746f6e5f70616e6963000503656e760b706c61746f6e5f73686133000703656e761d706c61746f6e5f6765745f63616c6c5f6f75747075745f6c656e677468000803656e7616706c61746f6e5f6765745f63616c6c5f6f7574707574000203656e760d726c705f6c6973745f73697a65000103656e760f706c61746f6e5f726c705f6c697374000303656e760e726c705f62797465735f73697a65000403656e7610706c61746f6e5f726c705f6279746573000303656e760d726c705f753132385f73697a65000f03656e760f706c61746f6e5f726c705f75313238000c03656e7617706c61746f6e5f6765745f696e7075745f6c656e677468000803656e7610706c61746f6e5f6765745f696e707574000203656e760c706c61746f6e5f6576656e74000703656e7614706c61746f6e5f64656c65676174655f63616c6c000d03656e760d706c61746f6e5f72657475726e000003454405020402010000030200000106001000000e0900010b01040303000201000103040302000106000006010006090206030105030a0a0102000400020502000400050101070405017001010105030100020608017f0141808a040b073904066d656d6f72790200115f5f7761736d5f63616c6c5f63746f7273000f0f5f5f66756e63735f6f6e5f65786974004a06696e766f6b6500400a9377440400104f0b8d0601077f23004180016b22012400200141a00910112103200141386a1012200141cc006a410036020020014200370244200141386a1013210520014100360268200142003703600240027f4100200328020420012d00002202410176200241017122061b2202450d001a2003280208200341016a20061b2104200141e0006a200210140340200204402001280264220320042d00003a00002001200341016a3602642002417f6a2102200441016a21040c010b0b2001280260210420012802640b220220046b41204d04402001200236022c20012004360228200128026821032001410036026820012003360230200142003703600c010b2001410036021820014200370310200141106a412010152004200128026420046b20012802102202200128021420026b100120012001280210220336022820012001280214220236022c2001200128021836023020040440200120043602640b200321040b41002103200141f8006a4100360200200141f0006a4200370300200141e8006a420037030020014200370360200141e0006a20042002101620012802602102200141e0006a41047210172005200210182005200141286a10192001280244200128024847044010000b2005280204210620052802002107200141106a101a210220014100360258200142003703500240200028020420002802006b2205450d00200141d0006a20051014200128025421032000280204200028020022006b22054101480d002001200320002005101b20056a22033602540b200141f8006a4100360200200141f0006a4200370300200141e8006a420037030020014200370360200141e0006a4100101c200141e0006a2001280250220520031016200141e0006a4101101c20012802602103200141e0006a4104721017200220031018200210132202200141d0006a101920050440200120053602540b200228020c200241106a28020047044010000b2007200620022802002002280204100c200228020c22030440200220033602100b200404402001200436022c0b200128024422020440200120023602480b20014180016a24000b910101027f20004200370200200041086a410036020020012102024003402002410371044020022d0000450d02200241016a21020c010b0b2002417c6a21020340200241046a22022802002203417f73200341fffdfb776a7141808182847871450d000b0340200341ff0171450d01200241016a2d00002103200241016a21020c000b000b20002001200220016b103020000b160020004100360208200042003702002000410010320bf10101067f20002802042104200041106a2802002201200041146a280200220249044020012004ad4220864201843702002000200028021041086a36021020000f0b027f41002001200028020c22036b410375220541016a2201200220036b2202410275220320032001491b41ffffffff01200241037541ffffffff00491b2203450d001a200341037410250b2101200120054103746a22022004ad42208642018437020020022000280210200028020c22066b22046b2105200120034103746a2101200241086a2102200441014e0440200520062004101b1a0b20002001360214200020023602102000200536020c20000b2001017f2000200110252202360200200020023602042000200120026a3602080bfa0101057f230041206b22022400024020002802042203200028020022046b22052001490440200028020820036b200120056b22044f04400340200341003a00002000200028020441016a22033602042004417f6a22040d000c030b000b20002001102f2106200241186a200041086a3602002002410036021441002101200604402006102521010b200220013602082002200120056a22033602102002200120066a3602142002200336020c0340200341003a00002002200228021041016a22033602102004417f6a22040d000b2000200241086a1029200241086a102a0c010b200520014d0d002000200120046a3602040b200241206a24000b840101017f024020012002460440410121030c010b4101210302400240200220016b2202410146044020012c0000417f4c0d010c030b200241374b0d010b200241016a21030c010b2002103320026a41016a21030b200041186a28020022010440200041086a280200200041146a2802002001103421000b2000200028020020036a3602000bea0101047f230041106b22042400200028020422012000280210220241087641fcffff07716a2103027f410020012000280208460d001a2003280200200241ff07714102746a0b2101200441086a20001035200428020c210203400240200120024604402000410036021420002802082103200028020421010340200320016b41027522024103490d022000200141046a22013602040c000b000b200141046a220120032802006b418020470d0120032802042101200341046a21030c010b0b2002417f6a220241014d04402000418004418008200241016b1b3602100b200020011036200441106a24000b1300200028020820014904402000200110320b0b1600200020012802002200200128020420006b10371a0b190020001012200041146a41003602002000420037020c20000bfc0801067f03400240200020046a2105200120046a210320022004460d002003410371450d00200520032d00003a0000200441016a21040c010b0b200220046b210602402005410371220745044003402006411049450440200020046a2203200120046a2205290200370200200341086a200541086a290200370200200441106a2104200641706a21060c010b0b027f2006410871450440200120046a2103200020046a0c010b200020046a2205200120046a2204290200370200200441086a2103200541086a0b21042006410471044020042003280200360200200341046a2103200441046a21040b20064102710440200420032f00003b0000200341026a2103200441026a21040b2006410171450d01200420032d00003a000020000f0b024020064120490d002007417f6a220741024b0d00024002400240024002400240200741016b0e020102000b2005200120046a220328020022073a0000200541016a200341016a2f00003b0000200041036a2108200220046b417d6a2106034020064111490d03200420086a2203200120046a220541046a2802002202410874200741187672360200200341046a200541086a2802002207410874200241187672360200200341086a2005410c6a28020022024108742007411876723602002003410c6a200541106a2802002207410874200241187672360200200441106a2104200641706a21060c000b000b2005200120046a220328020022073a0000200541016a200341016a2d00003a0000200041026a2108200220046b417e6a2106034020064112490d03200420086a2203200120046a220541046a2802002202411074200741107672360200200341046a200541086a2802002207411074200241107672360200200341086a2005410c6a28020022024110742007411076723602002003410c6a200541106a2802002207411074200241107672360200200441106a2104200641706a21060c000b000b2005200120046a28020022073a0000200041016a21082004417f7320026a2106034020064113490d03200420086a2203200120046a220541046a2802002202411874200741087672360200200341046a200541086a2802002207411874200241087672360200200341086a2005410c6a28020022024118742007410876723602002003410c6a200541106a2802002207411874200241087672360200200441106a2104200641706a21060c000b000b200120046a41036a2103200020046a41036a21050c020b200120046a41026a2103200020046a41026a21050c010b200120046a41016a2103200020046a41016a21050b20064110710440200520032d00003a00002005200328000136000120052003290005370005200520032f000d3b000d200520032d000f3a000f200541106a2105200341106a21030b2006410871044020052003290000370000200541086a2105200341086a21030b2006410471044020052003280000360000200541046a2105200341046a21030b20064102710440200520032f00003b0000200541026a2105200341026a21030b2006410171450d00200520032d00003a00000b20000bc10c02077f027e230041306b22042400200041046a2107024020014101460440200041086a280200200041146a280200200041186a220228020022031034280200210120022003417f6a360200200710384180104f044020072000410c6a280200417c6a10360b200141384f047f2001103320016a0520010b41016a2101200041186a2802002202450d01200041086a280200200041146a2802002002103421000c010b0240200710380d00200041146a28020022014180084f0440200020014180786a360214200041086a2201280200220228020021032001200241046a360200200420033602182007200441186a10390c010b2000410c6a2802002202200041086a2802006b4102752203200041106a2205280200220620002802046b220141027549044041802010252105200220064704400240200028020c220120002802102202470d0020002802082203200028020422064b04402000200320012003200320066b41027541016a417e6d41027422026a103a220136020c2000200028020820026a3602080c010b200441186a200220066b2201410175410120011b22012001410276200041106a103b2102200028020c210320002802082101034020012003470440200228020820012802003602002002200228020841046a360208200141046a21010c010b0b200029020421092000200229020037020420022009370200200029020c21092000200229020837020c200220093702082002103c200028020c21010b200120053602002000200028020c41046a36020c0c020b02402000280208220120002802042202470d00200028020c2203200028021022064904402000200120032003200620036b41027541016a41026d41027422026a103d22013602082000200028020c20026a36020c0c010b200441186a200620026b2201410175410120011b2201200141036a410276200041106a103b2102200028020c210320002802082101034020012003470440200228020820012802003602002002200228020841046a360208200141046a21010c010b0b200029020421092000200229020037020420022009370200200029020c21092000200229020837020c200220093702082002103c200028020821010b2001417c6a2005360200200020002802082201417c6a22023602082002280200210220002001360208200420023602182007200441186a10390c010b20042001410175410120011b20032005103b210241802010252106024020022802082201200228020c2203470d0020022802042205200228020022084b04402002200520012005200520086b41027541016a417e6d41027422036a103a22013602082002200228020420036a3602040c010b200441186a200320086b2201410175410120011b22012001410276200241106a280200103b21032002280208210520022802042101034020012005470440200328020820012802003602002003200328020841046a360208200141046a21010c010b0b2002290200210920022003290200370200200320093702002002290208210920022003290208370208200320093702082003103c200228020821010b200120063602002002200228020841046a360208200028020c2105034020002802082005460440200028020421012000200228020036020420022001360200200228020421012002200536020420002001360208200029020c21092000200229020837020c200220093702082002103c052005417c6a210502402002280204220120022802002203470d0020022802082206200228020c22084904402002200120062006200820066b41027541016a41026d41027422036a103d22013602042002200228020820036a3602080c010b200441186a200820036b2201410175410120011b2201200141036a4102762002280210103b21062002280208210320022802042101034020012003470440200428022020012802003602002004200428022041046a360220200141046a21010c010b0b20022902002109200220042903183702002002290208210a20022004290320370208200420093703182004200a3703202006103c200228020421010b2001417c6a200528020036020020022002280204417c6a3602040c010b0b0b200441186a20071035200428021c4100360200200041186a2100410121010b2000200028020020016a360200200441306a24000bef0201027f23004180016b22032400200341286a2001101e200341106a2000101f027e420120032d0024450d001a4200200341106a200341286a200210200d001a20034100360208200342003703002003410036025820034200370350200341d0006a100210152003280250100302400240200341386a20032802502200200328025420006b411c10212200280204044020002802002d000041c001490d010b20034100360268200342003703600c010b200341f8006a2000102220032802782101200341f0006a20001022200328027021042000102321002003410036026820034200370360200020046a20016b2200450d00200341e0006a2000101420004101480d002003200328026420012000101b20006a3602640b20032003280260220036020020032003290264370204200328025022010440200320013602540b2003101020000440200320003602040b42010b21022003280228220004402003200036022c0b20034180016a240020020bfc0301067f230041306b22022400027f41002001280204220520012d000022034101762206200341017122031b22074102490d001a41002001280208200141016a20031b22042d00004130470d001a20042d000141f800464101740b21042002410036021020024200370308200720046b41016a41017622070440200241286a200241106a3602002002200710252203360220200220033602182002200336021c2002200320076a360224200241086a200241186a1029200241186a102a20012d00002203410176210620012802042105200341017121030b0240024002402005200620031b41017104402001280208200141016a20031b20046a2c0000102b2203417f460d01200220033a0018200241086a200241186a102c200441017221040b200141016a2106024003402004200128020420012d00002203410176200341017122031b4f0d012001280208200620031b20046a22052c0000102b2103200541016a2c0000102b210502402003417f460d002005417f460d002002200520034104746a3a0018200441026a2104200241086a200241186a102c0c010b0b20004100360208200042003702000c020b200020022802083602002000200229020c37020420024100360210200242003703080c020b20004100360208200042003702000b20022802082204450d002002200436020c0b200241306a24000bc412010d7f23004190016b22022400200241086a4192081011210b2001280208200141016a220c20012d0000220341017122051b21072001280204200341017620051b21094100210341012104024003402004410171410020032009491b0440200320076a2d00002205415f6a41ff017141de004921042006200541bf7f6a41ff0171411a4972210620082005419f7f6a41ff0171411a49722108200341016a21030c01050240200420062008714101737121062009450d002009210303402003450d01200320076a21042003417f6a220521032004417f6a2d00004131470d000b0c030b0b0b417f21050b024002402006410171450d00200541076a20094b0d00200541016a4102490d00200941da004b0d00410021032002410036026020024200370358200241d8006a20092005417f7322086a10154101210602400240024003402003200128020420012d00002204410176200441017122041b20086a4f044002402006410171450d05200241c8006a102d220341016a210a410021040340200420054604402003280204220820022d004822054101762207200541017122061b2204200b28020420022d00082205410176200541017122051b470d05200b280208200b41016a20051b210520060d0220072104200a210603402004450440200721080c080b20062d000020052d0000470d06200541016a2105200641016a21062004417f6a21040c000b00052001280208200c20012d00004101711b20046a2c000022074120722007200741bf7f6a411a491b210d024002400240027f20022d004822094101712207450440410a210820094101760c010b20032802002209417e71417f6a210820032802040b220620084604402003280208200a20094101711b210e416f2109200841e6ffffff074d0440410b20084101742207200841016a220920092007491b220741106a4170712007410b491b21090b200910252207200e2008102820032009410172360200200320073602080c010b2007450d01200328020821070b2003200641016a3602040c010b2002200641017441026a3a0048200a21070b200620076a220641003a00012006200d3a0000200441016a21040c010b000b000b05200228025820036a2001280208200c20041b20056a20036a41016a2d000041a0086a2d000022043a00002006200441ff0147712106200341016a21030c010b0b2004450d012003280208210603402004450d0220062d000020052d0000470d01200541016a2105200641016a21062004417f6a21040c000b000b20004200370000200041003a0014200041086a4200370000200041106a410036000020022802582203450d032002200336025c0c030b410021052002410036027020024200370368200241e8006a2008410174410172101503402005200328020420022d00482204410176200441017122041b22064f450440200228026820056a2003280208200a20041b20056a2d000022044105763a00002002280268200328020420022d0048220641017620064101711b6a20056a41016a2004411f713a0000200541016a21050c010b0b200228026820066a41003a0000200228026c21040240200228025c2205200228025822036b22064101480d0020062002280270220720046b4c0440034020032005460d02200420032d00003a00002002200228026c41016a220436026c200341016a21030c000b000b20024188016a200241f0006a3602004100210820024100360284012004200228026822016b2109200420066a20016b2206200720016b2207410174220120012006491b41ffffffff07200741ffffffff03491b220704402007102521080b200220083602782002200820096a2206360280012002200720086a360284012002200636027c200241f8006a410472210803402003200546450440200620032d00003a0000200220022802800141016a220636028001200341016a21030c010b0b200228026820042008102e0240200228026c220520046b220341004c044020022802800121040c010b200220022802800120042003101b20036a220436028001200228026c21050b200228026821032002200228027c3602682002200336027c2002200436026c2002200536028001200228027021052002200228028401360270200220053602840120022003360278200241f8006a102a200228026c21040b2002420037026c2002280268210520024100360268200420056b21044101210303402004044020052d000041002003411d764101716b41b3c5d1d0027141002003411c764101716b41dde788ea037141002003411b764101716b41fab384f5017141002003411a764101716b41ed9cc2b20271410020034119764101716b41b2afa9db0371200341057441e0ffffff037173737373737321032004417f6a2104200541016a21050c010b0b20034101470d00410021062002410036027020024200370368200241003602800120024200370378027f4100200228025c417a6a2204200228025822036b2205450d001a200241f8006a2005101403402003200446450440200228027c220520032d00003a00002002200541016a36027c200341016a21030c010b0b20022802782106200228027c0b20066b2108410021034100210541002104024003402004200846044002402005410820036b7441ff0171452003410548712103200604402002200636027c0b20030d00200228026821030c030b05200420066a2d0000200541057441e01f71722105200341056a21030340200341084845044020022005200341786a2203763a008f01200241e8006a2002418f016a102c0c010b0b200441016a21040c010b0b200228026c200228026822036b4114470d0020024188016a410036020020024180016a4200370300200242003703784100210303402003411446450440200241f8006a20036a41003a0000200341016a21030c010b0b200228026c200228026822056b2104410021030340024020032004460d00200341134b0d00200241f8006a20036a200320056a2d00003a0000200341016a21030c010b0b20002002290378370000200041013a0014200041106a20024188016a280200360000200041086a20024180016a290300370000200504402002200536026c0b20022802582203450d032002200336025c0c030b2003450d002002200336026c0b20022802582203450d002002200336025c0b20004200370000200041003a0014200041086a4200370000200041106a41003600000b20024190016a24000bab0102027f017e230041106b2204240020022105034020055045044020054208882105200341016a21030c010b0b20044100360208200442003703002004200310152004280204417f6a21030340200250450440200320023c00002003417f6a2103200242088821020c010b0b200020012802002203200128020420036b20042802002203200428020420036b100d2103200428020022010440200420013602040b200441106a24002003450b730020004200370210200042ffffffff0f370208200020023602042000200136020002402003410871450d002000105020024f0d002003410471044010000c010b200042003702000b02402003411071450d002000105020024d0d0020034104710440100020000f0b200042003702000b20000bd50101047f200110232204200128020422024b04401000200128020421020b200128020021052000027f02400240200204404100210120052c00002203417f4a0d01027f200341ff0171220141bf014d04404100200341ff017141b801490d011a200141c97e6a0c010b4100200341ff017141f801490d001a200141897e6a0b41016a21010c010b4101210120050d000c010b41002103200120046a20024b0d0020022001490d00410020022004490d011a200120056a2103200220016b20042004417f461b0c010b41000b360204200020033602000bff0201037f200028020445044041000f0b2000104b41012102024020002802002c00002201417f4a0d00200141ff0171220341b7014d0440200341807f6a0f0b02400240200141ff0171220141bf014d0440024020002802042201200341c97e6a22024d047f100020002802040520010b4102490d0020002802002d00010d0010000b200241054f044010000b20002802002d000145044010000b4100210241b7012101034020012003460440200241384f0d030c0405200028020020016a41ca7e6a2d00002002410874722102200141016a21010c010b000b000b200141f7014d0440200341c07e6a0f0b024020002802042201200341897e6a22024d047f100020002802040520010b4102490d0020002802002d00010d0010000b200241054f044010000b20002802002d000145044010000b4100210241f701210103402001200346044020024138490d0305200028020020016a418a7e6a2d00002002410874722102200141016a21010c010b0b0b200241ff7d490d010b10000b20020bd107010b7f230041d0006b22072400200741306a2002101e200741186a2001101f0240024002400240027f02400240024020072d002c450d00200741186a200741306a20031020450d002007410036021020074200370308200741086a1002101520072802081003200728020c210d20072802082101200741406b4180081011210420004200370200200041086a410036020002400240200428020420072d0040220841017620084101711b2202200d20016b4101746a2206410b4f0440200641106a4170712208102521052000200636020420002008410172360200200020053602080c010b200020064101743a0000200041016a21052006450d010b200520061026210520072d004021080b200520066a41003a0000200441016a21092004280208210a2004280204200841fe01714101762008410171220c1b2104027f20002d0000220b410171220e450440410a2105200b41017622082002200220084b1b0c010b2000280200220b417e71417f6a210520002802042208200220082002491b0b2106200a2009200c1b2109200620086b20056a20044f04402000280208200041016a200e1b21054100210b200420064604402004210a0c060b200820066b220c4504402006210a0c060b20042006490d02200520094f0d03200520086a20094d0d03200520066a20094d04402009200420066b6a21090c040b2005200920061027200420096a2109200420066b21042006210b41000c040b2000280208210c416f210a200541e6ffffff074d0440410b20054101742205200420086a20066b220a200a2005491b220541106a4170712005410b491b210a0b200a10252205200920041028200820066b22080440200420056a200c200041016a200b4101711b20066a200810280b200020053602082000200420086a22043602042000200a410172360200200420056a41003a00000c060b200041800810111a0c060b2005200920041027200420056a200520066a200c10272006210a0c030b20060b210a2005200b6a220620046a2006200a6a200c10270b2005200b6a2009200410270b2004200a6b20086a2104024020002d00004101710440200020043602040c010b200020044101743a00000b200420056a41003a00000b200041016a210403402001200d4704402000280208200420002d00004101711b20026a20012d00004104764181086a2d00003a00002000280208200420002d00004101711b20026a41016a20012d0000410f714181086a2d00003a0000200141016a2101200241026a21020c010b0b20072802082201450d002007200136020c0b200728023022010440200720013602340b200741d0006a24000b0b002000410120001b103f0bb90301027f02402001450d00200041303a0000200020016a2203417f6a41303a000020014103490d00200041303a0002200041303a00012003417d6a41303a00002003417e6a41303a000020014107490d00200041303a00032003417c6a41303a000020014109490d002000410020006b41037122026a220341b0e0c081033602002003200120026b417c7122026a2201417c6a41b0e0c0810336020020024109490d00200341b0e0c08103360208200341b0e0c08103360204200141786a41b0e0c08103360200200141746a41b0e0c0810336020020024119490d00200341b0e0c08103360218200341b0e0c08103360214200341b0e0c08103360210200341b0e0c0810336020c200141706a41b0e0c081033602002001416c6a41b0e0c08103360200200141686a41b0e0c08103360200200141646a41b0e0c081033602002002200341047141187222026b2101200220036a2102034020014120490d01200242b0e0c08183868c9830370300200241186a42b0e0c08183868c9830370300200241106a42b0e0c08183868c9830370300200241086a42b0e0c08183868c9830370300200241206a2102200141606a21010c000b000b20000b0f0020020440200020012002103e0b0b100020020440200020012002101b1a0b0b6701017f20002802002000280204200141046a102e200028020021022000200128020436020020012002360204200028020421022000200128020836020420012002360208200028020821022000200128020c3602082001200236020c200120012802043602000b2b01027f200028020821012000280204210203402001200247044020002001417f6a22013602080c010b0b0b4801017f415021010240200041506a41ff0171410a490d0041a97f21012000419f7f6a41ff01714106490d00200041496a417f200041bf7f6a41ff01714106491b0f0b200020016a0bb70101047f230041206b220224000240200028020422032000280208490440200320012d00003a00002000200028020441016a3602040c010b2000200320002802006b220441016a102f2105200241186a200041086a3602004100210320024100360214200504402005102521030b20022003360208200320046a220420012d00003a00002002200320056a3602142002200436020c2002200441016a3602102000200241086a1029200241086a102a0b200241206a24000b190020004200370200200041086a41003602002000103120000b270020022002280200200120006b22016b2202360200200141014e0440200220002001101b1a0b0b2e01017f2001200028020820002802006b2200410174220220022001491b41ffffffff07200041ffffffff03491b0b5a01027f02402002410a4d0440200020024101743a0000200041016a21030c010b200241106a4170712204102521032000200236020420002004410172360200200020033602080b2003200120021028200220036a41003a00000b2201017f03402001410c470440200020016a4100360200200141046a21010c010b0b0b2f01017f200028020820014904402001103f20002802002000280204101b210220002001360208200020023602000b0b1e01017f03402000044020004108762100200141016a21010c010b0b20010b25002000200120026a417f6a220241087641fcffff07716a280200200241ff07714102746a0b4f01037f20012802042203200128021020012802146a220441087641fcffff07716a21022000027f410020032001280208460d001a2002280200200441ff07714102746a0b360204200020023602000b2501017f200028020821020340200120024645044020002002417c6a22023602080c010b0b0b2a01017f2000200120021006200028020422036a104820012002200320002802006a10072000104920000b2801017f200028020820002802046b2201410874417f6a410020011b200028021420002802106a6b0ba10202057f017e230041206b22052400024020002802082202200028020c2203470d0020002802042204200028020022064b04402000200420022004200420066b41027541016a417e6d41027422036a103a22023602082000200028020420036a3602040c010b200541086a200320066b2202410175410120021b220220024102762000410c6a103b2103200028020821042000280204210203402002200446450440200328020820022802003602002003200328020841046a360208200241046a21020c010b0b2000290200210720002003290200370200200320073702002000290208210720002003290208370208200320073702082003103c200028020821020b200220012802003602002000200028020841046a360208200541206a24000b2501017f200120006b2201410275210320010440200220002001103e0b200220034102746a0b4f01017f2000410036020c200041106a2003360200200104402001410274102521040b200020043602002000200420024102746a22023602082000200420014102746a36020c2000200236020420000b2b01027f200028020821012000280204210203402001200247044020002001417c6a22013602080c010b0b0b1b00200120006b22010440200220016b220220002001103e0b20020b8d0301037f024020002001460d00200120006b20026b410020024101746b4d0440200020012002101b1a0c010b20002001734103712103027f024020002001490440200020030d021a410021030340200120036a2105200020036a2204410371450440200220036b210241002103034020024104490d04200320046a200320056a280200360200200341046a21032002417c6a21020c000b000b20022003460d04200420052d00003a0000200341016a21030c000b000b024020030d002001417f6a21040340200020026a22034103714504402001417c6a21032000417c6a2104034020024104490d03200220046a200220036a2802003602002002417c6a21020c000b000b2002450d042003417f6a200220046a2d00003a00002002417f6a21020c000b000b2001417f6a210103402002450d03200020026a417f6a200120026a2d00003a00002002417f6a21020c000b000b200320056a2101200320046a0b210303402002450d01200320012d00003a00002002417f6a2102200341016a2103200141016a21010c000b000b0b9b0101047f230041106b220124002001200036020c2000047f41f809200041086a2202411076220041f8092802006a220336020041f40941f409280200220420026a41076a417871220236020002400240200341107420024d044041f809200341016a360200200041016a21000c010b2000450d010b200040000d0010000b20042001410c6a4104101b41086a0541000b2100200141106a240020000bb50602067f037e230041d0016b22002400104f100a2201103f2202100b200041286a200041086a20022001411c102122014100104102400240200041286a10422206500d0041ae0910432006510440200110444101460d020c010b41b30910432006510440200041286a10452001200041286a1046200041f8006a200041286a10472101200041e8006a200041346a1047210220002903402106200041a0016a2001104720022006101d210720004188016a101a210241002101200041c8016a410036020042002106200041c0016a4200370300200041b8016a4200370300200042003703b0014101210320074280015a044020072108034020062008845045044020064238862008420888842108200141016a2101200642088821060c010b0b200141384f047f2001103320016a0520010b41016a21030b200020033602b001200041b0016a41047210172002200310182002420020071008200228020422016a104842002007200120022802006a100920021049200228020c200241106a28020047044010000b20022802002002280204100e200228020c2201450d02200220013602100c020b41cb0910432006520d00200041286a10452001200041286a1046200041d8006a200041286a10472101200041c8006a200041346a1047210220002903402106200041f8006a200041e8006a2001104720022006102420004188016a101a2102200041c8016a4100360200200041c0016a4200370300200041b8016a4200370300200042003703b00141012101024002400240200041a0016a200041f8006a1047220428020420002d00a0012203410176200341017122051b220341014d0440200341016b0d032004280208200441016a20051b2c0000417f4c0d010c030b200341374b0d010b200341016a21010c010b2003103320036a41016a21010b200020013602b001200041b0016a41047210172002200110182002200041b0016a200041f8006a10472201280208200141016a20002d00b001220341017122041b2001280204200341017620041b1037220128020c200141106a28020047044010000b20012802002001280204100e200128020c2202450d01200120023602100c010b10000b104a200041d0016a24000bc90202067f017e230041106b220324002001280208220520024b0440200341086a2001104c20012003280208200328020c104d36020c20032001104c410021052001027f410020032802002207450d001a410020032802042208200128020c2206490d001a200820062006417f461b210420070b360210200141146a2004360200200141003602080b200141106a210603402001280214210402402005200249044020040d01410021040b200020062802002004411410211a200341106a24000f0b20032001104c41002104027f410020032802002205450d001a410020032802042208200128020c2207490d001a200820076b2104200520076a0b2105200120043602142001200536021020032006410020052004104d10522001200329030022093702102001200128020c2009422088a76a36020c2001200128020841016a22053602080c000b000b870202047f017e230041106b220324002000104b024002402000280204450d002000104b0240200028020022022c0000220141004e044020010d010c020b200141807f460d00200141ff0171220441b7014d0440200028020441014d04401000200028020021020b20022d00010d010c020b200441bf014b0d012000280204200141ff017141ca7e6a22014d04401000200028020021020b200120026a2d0000450d010b2000280204450d0020022d000041c001490d010b10000b200341086a20001022200328020c220041094f044010000b200328020821010340200004402000417f6a210020013100002005420886842105200141016a21010c010b0b200341106a240020050b3901027e42a5c688a1c89ca7f94b210103402000300000220250450440200041016a2100200142b383808080207e20028521010c010b0b20010b800101047f230041106b2201240002402000280204450d0020002802002d000041c001490d00200141086a2000104c200128020c210003402000450d01200141002001280208220320032000104d22046a20034520002004497222031b3602084100200020046b20031b2100200241016a21020c000b000b200141106a240020020b16002000102d1a2000410c6a102d1a200042003703180b6701017f230041306b2202240020001044410447044010000b20024101360214200220003602082002200241146a36020c200241086a2001104e200241086a2001410c6a104e200241186a2000200228021410412001200241186a1042370318200241306a24000b4d01017f20004200370200200041086a2202410036020020012d0000410171450440200020012902003702002002200141086a28020036020020000f0b200020012802082001280204103020000b3601017f200028020820014904402001103f20002802002000280204101b210220002001360208200020023602000b200020013602040b7a01037f0340024020002802102201200028020c460d00200141786a2802004504401000200028021021010b200141786a22022002280200417f6a220336020020030d002000200236021020002001417c6a2802002201200028020420016b220210046a1048200120002802006a22012002200110050c010b0b0b880101037f41e409410136020041e8092802002100034020000440034041ec0941ec092802002201417f6a2202360200200141014845044041e4094100360200200020024102746a22004184016a280200200041046a28020011020041e409410136020041e80928020021000c010b0b41ec09412036020041e809200028020022003602000c010b0b0b4101017f200028020445044010000b0240200028020022012d0000418101470d00200028020441014d047f100020002802000520010b2c00014100480d0010000b0b2101017f20011023220220012802044b044010000b2000200120011051200210520b2701017f230041206b22022400200241086a200020014114102110502100200241206a240020000b970301067f230041306b220224002002200028020020002802042802001041024002402002280204044020022802002d000041c001490d010b200241186a102d1a0c010b200241286a200210222002102321030240024002400240200228022822040440200228022c220620034f0d010b41002104200241206a410036020020024200370318410021060c010b200241206a4100360200200242003703182004200620032003417f461b22056a21062005410a4b0d010b200220054101743a0018200241186a41017221030c010b200541106a4170712207102521032002200536021c20022007410172360218200220033602200b03402004200646450440200320042d00003a0000200341016a2103200441016a21040c010b0b200341003a00000b024020012d0000410171450440200141003b01000c010b200128020841003a00002001410036020420012d0000410171450d00200141003602000b20012002290318370200200141086a200241206a280200360200200241186a103120002802042204200428020041016a360200200241306a24000b3501017f230041106b220041808a0436020c41f009200028020c41076a417871220036020041f409200036020041f8093f003602000b2e01017f200028020445044041000f0b4101210120002802002c0000417f4c047f20001051200010236a0520010b0b5b00027f027f41002000280204450d001a410020002802002c0000417f4a0d011a20002802002d0000220041bf014d04404100200041b801490d011a200041c97e6a0c010b4100200041f801490d001a200041897e6a0b41016a0b0b5b01027f2000027f0240200128020022054504400c010b200220036a200128020422014b0d0020012002490d00410020012003490d011a200220056a2104200120026b20032003417f461b0c010b41000b360204200020043602000b0be50102004181080b1430313233343536373839616263646566006c61740041a0080bc301ffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff0fff0a1115141a1e0705ffffffffffffff1dff180d19090817ff12161f1b13ff010003100b1c0c0e060402ffffffffffff1dff180d19090817ff12161f1b13ff010003100b1c0c0e060402ffffffffff43616c6c4572726f72496e666f00696e69740064656c65676174655f63616c6c5f70706f735f73656e640064656c65676174655f63616c6c5f70706f735f7175657279";

    public static String BINARY = BINARY_0;

    public static final String FUNC_DELEGATE_CALL_PPOS_SEND = "delegate_call_ppos_send";

    public static final String FUNC_DELEGATE_CALL_PPOS_QUERY = "delegate_call_ppos_query";

    public static final WasmEvent CALLERRORINFO_EVENT = new WasmEvent("CallErrorInfo", Arrays.asList(), Arrays.asList(new WasmEventParameter(byte[].class)));
    ;

    protected ContractDelegateCallPPOS(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected ContractDelegateCallPPOS(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public List<CallErrorInfoEventResponse> getCallErrorInfoEvents(TransactionReceipt transactionReceipt) {
        List<WasmContract.WasmEventValuesWithLog> valueList = extractEventParametersWithLog(CALLERRORINFO_EVENT, transactionReceipt);
        ArrayList<CallErrorInfoEventResponse> responses = new ArrayList<CallErrorInfoEventResponse>(valueList.size());
        for (WasmContract.WasmEventValuesWithLog eventValues : valueList) {
            CallErrorInfoEventResponse typedResponse = new CallErrorInfoEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.arg1 = (byte[]) eventValues.getNonIndexedValues().get(0);
            responses.add(typedResponse);
        }
        return responses;
    }

    public Observable<CallErrorInfoEventResponse> callErrorInfoEventObservable(PlatonFilter filter) {
        return web3j.platonLogObservable(filter).map(new Func1<Log, CallErrorInfoEventResponse>() {
            @Override
            public CallErrorInfoEventResponse call(Log log) {
                WasmContract.WasmEventValuesWithLog eventValues = extractEventParametersWithLog(CALLERRORINFO_EVENT, log);
                CallErrorInfoEventResponse typedResponse = new CallErrorInfoEventResponse();
                typedResponse.log = log;
                typedResponse.arg1 = (byte[]) eventValues.getNonIndexedValues().get(0);
                return typedResponse;
            }
        });
    }

    public Observable<CallErrorInfoEventResponse> callErrorInfoEventObservable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        PlatonFilter filter = new PlatonFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(WasmEventEncoder.encode(CALLERRORINFO_EVENT));
        return callErrorInfoEventObservable(filter);
    }

    public static RemoteCall<ContractDelegateCallPPOS> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        String encodedConstructor = WasmFunctionEncoder.encodeConstructor(BINARY, Arrays.asList());
        return deployRemoteCall(ContractDelegateCallPPOS.class, web3j, credentials, contractGasProvider, encodedConstructor);
    }

    public static RemoteCall<ContractDelegateCallPPOS> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        String encodedConstructor = WasmFunctionEncoder.encodeConstructor(BINARY, Arrays.asList());
        return deployRemoteCall(ContractDelegateCallPPOS.class, web3j, transactionManager, contractGasProvider, encodedConstructor);
    }

    public static RemoteCall<ContractDelegateCallPPOS> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider, BigInteger initialVonValue) {
        String encodedConstructor = WasmFunctionEncoder.encodeConstructor(BINARY, Arrays.asList());
        return deployRemoteCall(ContractDelegateCallPPOS.class, web3j, credentials, contractGasProvider, encodedConstructor, initialVonValue);
    }

    public static RemoteCall<ContractDelegateCallPPOS> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider, BigInteger initialVonValue) {
        String encodedConstructor = WasmFunctionEncoder.encodeConstructor(BINARY, Arrays.asList());
        return deployRemoteCall(ContractDelegateCallPPOS.class, web3j, transactionManager, contractGasProvider, encodedConstructor, initialVonValue);
    }

    public RemoteCall<TransactionReceipt> delegate_call_ppos_send(String target_addr, String in, Uint64 gas) {
        final WasmFunction function = new WasmFunction(FUNC_DELEGATE_CALL_PPOS_SEND, Arrays.asList(target_addr,in,gas), Void.class);
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> delegate_call_ppos_send(String target_addr, String in, Uint64 gas, BigInteger vonValue) {
        final WasmFunction function = new WasmFunction(FUNC_DELEGATE_CALL_PPOS_SEND, Arrays.asList(target_addr,in,gas), Void.class);
        return executeRemoteCallTransaction(function, vonValue);
    }

    public RemoteCall<String> delegate_call_ppos_query(String target_addr, String in, Uint64 gas) {
        final WasmFunction function = new WasmFunction(FUNC_DELEGATE_CALL_PPOS_QUERY, Arrays.asList(target_addr,in,gas), String.class);
        return executeRemoteCall(function, String.class);
    }

    public static ContractDelegateCallPPOS load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new ContractDelegateCallPPOS(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static ContractDelegateCallPPOS load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new ContractDelegateCallPPOS(contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static class CallErrorInfoEventResponse {
        public Log log;

        public byte[] arg1;
    }
}
