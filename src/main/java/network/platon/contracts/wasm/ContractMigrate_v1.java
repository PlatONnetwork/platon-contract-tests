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
public class ContractMigrate_v1 extends WasmContract {
    private static String BINARY_0 = "0x0061736d01000000016a1160027f7f0060017f017f60017f0060037f7f7f0060027f7f017f60037f7f7f017f60000060047f7f7f7f0060047f7f7f7f017f60027f7e0060017f017e60077f7f7f7f7f7f7f0060047f7f7e7e0060037e7e7f006000017f60077f7f7f7f7f7f7f017f60027e7e017f02e3021003656e760c706c61746f6e5f70616e6963000603656e760b706c61746f6e5f73686133000703656e760d726c705f6c6973745f73697a65000103656e760f706c61746f6e5f726c705f6c697374000303656e760e726c705f62797465735f73697a65000403656e7610706c61746f6e5f726c705f6279746573000303656e760d726c705f753132385f73697a65001003656e760f706c61746f6e5f726c705f75313238000d03656e7617706c61746f6e5f6765745f696e7075745f6c656e677468000e03656e7610706c61746f6e5f6765745f696e707574000203656e7617706c61746f6e5f6765745f73746174655f6c656e677468000403656e7610706c61746f6e5f6765745f7374617465000803656e7610706c61746f6e5f7365745f7374617465000703656e760c706c61746f6e5f6576656e74000703656e760e706c61746f6e5f6d696772617465000f03656e760d706c61746f6e5f72657475726e00000351500600040204000500000104000002000c0104030b09000003000500070402030000050400020300010503010000050802050003010605030a0a02010201000100020100060802090100040002060101070405017001010105030100020608017f01419089040b073904066d656d6f72790200115f5f7761736d5f63616c6c5f63746f727300100f5f5f66756e63735f6f6e5f65786974005306696e766f6b6500440ac876500400105c0bd50301077f230041c0016b22022400200241b70810122104200241e8006a1013200241fc006a410036020020024200370274200241e8006a410210142103200241d8006a20041015200241c8006a20001015200241406b4100360200200241386a4200370300200241306a420037030020024200370328200241286a20022802582200200228025c101620022802482204200228024c101621052003200228022810172003200241d8006a10182003200241c8006a10182002280274200241f8006a28020047044010000b2003280204210620032802002107200241106a1019210320024180016a2001101a2101200241a8016a4100360200200241a0016a420037030020024198016a4200370300200242003703900120024190016a4100101b20024190016a200241b0016a2001101a101c20024190016a4101101b200228029001210820024190016a410472101d200320081017200341011014220320024190016a2001101a101e200328020c200341106a28020047044010000b2007200620032802002003280204100d200328020c22010440200320013602100b200541046a101d200404402002200436024c0b200004402002200036025c0b200228027422030440200220033602780b200241c0016a24000b910101027f20004200370200200041086a410036020020012102024003402002410371044020022d0000450d02200241016a21020c010b0b2002417c6a21020340200241046a22022802002203417f73200341fffdfb776a7141808182847871450d000b0340200341ff0171450d01200241016a2d00002103200241016a21020c000b000b20002001200220016b102720000b160020004100360208200042003702002000410010360bf30101057f20002802042105200041106a2802002202200041146a280200220349044020022001ad2005ad422086843702002000200028021041086a36021020000f0b027f41002002200028020c22046b410375220641016a2202200320046b2203410275220420042002491b41ffffffff01200341037541ffffffff00491b2204450d001a200441037410200b2102200220064103746a22032001ad2005ad4220868437020020032000280210200028020c22066b22016b2105200220044103746a2102200341086a2103200141014e044020052006200110311a0b20002002360214200020033602102000200536020c20000b9e0201047f230041206b2202240020024100360218200242003703100240027f4100200128020420012d00002204410176200441017122051b2204450d001a2001280208200141016a20051b2103200241106a200410300340200404402002280214220120032d00003a00002002200141016a3602142004417f6a2104200341016a21030c010b0b2002280210210320022802140b220420036b41204d044020002004360204200020033602002000200228021836020820024100360218200242003703100c010b20024100360208200242003703002002412010282003200228021420036b20022802002204200228020420046b100120002002280200360200200020022902043702042003450d00200220033602140b200241206a24000b8b0101017f024020012002460440410121030c010b4101210302400240200220016b2202410146044020012c0000417f4c0d010c030b200241374b0d010b200241016a21030c010b2002103720026a41016a21030b027f200041186a28020022010440200041086a280200200041146a280200200110380c010b20000b2201200128020020036a36020020000b1300200028020820014904402000200110360b0b1500200020012802002200200128020420006b10390b190020001013200041146a41003602002000420037020c20000b4d01017f20004200370200200041086a2202410036020020012d0000410171450440200020012902003702002002200141086a28020036020020000f0b200020012802082001280204102720000bc10c02077f027e230041306b22042400200041046a2107024020014101460440200041086a280200200041146a280200200041186a220228020022031038280200210120022003417f6a3602002007103a4180104f044020072000410c6a280200417c6a103b0b200141384f047f2001103720016a0520010b41016a2101200041186a2802002202450d01200041086a280200200041146a2802002002103821000c010b02402007103a0d00200041146a28020022014180084f0440200020014180786a360214200041086a2201280200220228020021032001200241046a360200200420033602182007200441186a103c0c010b2000410c6a2802002202200041086a2802006b4102752203200041106a2205280200220620002802046b220141027549044041802010202105200220064704400240200028020c220120002802102202470d0020002802082203200028020422064b04402000200320012003200320066b41027541016a417e6d41027422026a103d220136020c2000200028020820026a3602080c010b200441186a200220066b2201410175410120011b22012001410276200041106a103e2102200028020c210320002802082101034020012003470440200228020820012802003602002002200228020841046a360208200141046a21010c010b0b200029020421092000200229020037020420022009370200200029020c21092000200229020837020c200220093702082002103f200028020c21010b200120053602002000200028020c41046a36020c0c020b02402000280208220120002802042202470d00200028020c2203200028021022064904402000200120032003200620036b41027541016a41026d41027422026a104022013602082000200028020c20026a36020c0c010b200441186a200620026b2201410175410120011b2201200141036a410276200041106a103e2102200028020c210320002802082101034020012003470440200228020820012802003602002002200228020841046a360208200141046a21010c010b0b200029020421092000200229020037020420022009370200200029020c21092000200229020837020c200220093702082002103f200028020821010b2001417c6a2005360200200020002802082201417c6a22023602082002280200210220002001360208200420023602182007200441186a103c0c010b20042001410175410120011b20032005103e210241802010202106024020022802082201200228020c2203470d0020022802042205200228020022084b04402002200520012005200520086b41027541016a417e6d41027422036a103d22013602082002200228020420036a3602040c010b200441186a200320086b2201410175410120011b22012001410276200241106a280200103e21032002280208210520022802042101034020012005470440200328020820012802003602002003200328020841046a360208200141046a21010c010b0b2002290200210920022003290200370200200320093702002002290208210920022003290208370208200320093702082003103f200228020821010b200120063602002002200228020841046a360208200028020c2105034020002802082005460440200028020421012000200228020036020420022001360200200228020421012002200536020420002001360208200029020c21092000200229020837020c200220093702082002103f052005417c6a210502402002280204220120022802002203470d0020022802082206200228020c22084904402002200120062006200820066b41027541016a41026d41027422036a104022013602042002200228020820036a3602080c010b200441186a200820036b2201410175410120011b2201200141036a4102762002280210103e21062002280208210320022802042101034020012003470440200428022020012802003602002004200428022041046a360220200141046a21010c010b0b20022902002109200220042903183702002002290208210a20022004290320370208200420093703182004200a3703202006103f200228020421010b2001417c6a200528020036020020022002280204417c6a3602040c010b0b0b200441186a20071041200428021c4100360200200041186a2100410121010b2000200028020020016a360200200441306a24000b9a0101037f41012103024002400240200128020420012d00002202410176200241017122041b220241014d0440200241016b0d032001280208200141016a20041b2c0000417f4c0d010c030b200241374b0d010b200241016a21030c010b2002103720026a41016a21030b200041186a28020022010440200041086a280200200041146a2802002001103821000b2000200028020020036a3602000bea0101047f230041106b22042400200028020422012000280210220241087641fcffff07716a2103027f410020012000280208460d001a2003280200200241ff07714102746a0b2101200441086a20001041200428020c210203400240200120024604402000410036021420002802082103200028020421010340200320016b41027522024103490d022000200141046a22013602040c000b000b200141046a220120032802006b418020470d0120032802042101200341046a21030c010b0b2002417f6a220241014d04402000418004418008200241016b1b3602100b20002001103b200441106a24000b2c01017f20002001280208200141016a20012d0000220041017122021b2001280204200041017620021b10390ba707010c7f230041e0006b220424002001280204210f20012802002109200441286a41800810122105200441d8006a41003602002004420037035002400240200528020420042d0028220841017620084101711b220b200f20096b4101746a2206410b4f0440200641106a4170712208102021072004200636025420042008410172360250200420073602580c010b200420064101743a0050200441d0006a41017221072006450d010b200720061021210720042d002821080b200620076a41003a0000200541016a210a2005280208210d2005280204200841fe01714101762008410171220c1b2105027f20042d00502208410171220e450440410a210720084101762208200b200b20084b1b0c010b2004280250417e71417f6a210720042802542208200b2008200b491b0b2106200d200a200c1b210a024002400240027f02400240200620086b20076a20054f04402004280258200441d0006a410172200e1b21074100210d200520064604402005210c0c050b200820066b220e4504402006210c0c050b20052006490d012007200a4f0d02200720086a200a4d0d02200620076a200a4d0440200a200520066b6a210a0c030b2007200a200610222005200a6a210a200520066b21052006210d41000c030b200441d0006a2007200520086a20066b20076b200820062005200a10230c050b2007200a20051022200520076a200620076a200e10222006210c0c030b20060b210c2007200d6a220620056a2006200c6a200e10220b2007200d6a200a200510220b2005200c6b20086a2105024020042d00504101710440200420053602540c010b200420054101743a00500b200520076a41003a00000b200441d0006a410172210503402009200f4704402004280258200520042d00504101711b200b6a20092d00004104764181086a2d00003a00002004280258200520042d00504101711b200b6a41016a20092d0000410f714181086a2d00003a0000200941016a2109200b41026a210b0c010b0b200441386a4100360200200441306a420037030020044200370328200441d0006a20021024200441406b20031024200441286a20012802002209200128020420096b20042802502209200428025420096b20042802402209200428024420096b100e1a200428024022090440200420093602440b200428025022090440200420093602540b200441186a200441286a1025200441086a200441286a1025200441186a200441086a1011200441d0006a200441286a10252000200441286a1025200441e0006a24000b0b002000410120001b10430bb90301027f02402001450d00200041303a0000200020016a2203417f6a41303a000020014103490d00200041303a0002200041303a00012003417d6a41303a00002003417e6a41303a000020014107490d00200041303a00032003417c6a41303a000020014109490d002000410020006b41037122026a220341b0e0c081033602002003200120026b417c7122026a2201417c6a41b0e0c0810336020020024109490d00200341b0e0c08103360208200341b0e0c08103360204200141786a41b0e0c08103360200200141746a41b0e0c0810336020020024119490d00200341b0e0c08103360218200341b0e0c08103360214200341b0e0c08103360210200341b0e0c0810336020c200141706a41b0e0c081033602002001416c6a41b0e0c08103360200200141686a41b0e0c08103360200200141646a41b0e0c081033602002002200341047141187222026b2101200220036a2102034020014120490d01200242b0e0c08183868c9830370300200241186a42b0e0c08183868c9830370300200241106a42b0e0c08183868c9830370300200241086a42b0e0c08183868c9830370300200241206a2102200141606a21010c000b000b20000b0f002002044020002001200210420b0ba80101027f027f20002d0000410171044020002802080c010b200041016a0b2108416f2107200141e6ffffff074d0440410b20014101742207200120026a220120012007491b220141106a4170712001410b491b21070b20071020210120050440200120062005102e0b200320046b22030440200120056a200420086a2003102e0b200020013602082000200320056a220536020420002007410172360200200120056a41003a00000b6302017f017e20012103034020035045044020034208882103200241016a21020c010b0b20004100360208200042003702002000200210282000280204417f6a21020340200150450440200220013c00002002417f6a2102200142088821010c010b0b0b930a01087f230041d0006b220324002003419208101221062003410036022820034200370320200341406b2001200141146a1029210541002101034020042005280204200528020022076b4f044002402002044020032001410520026b74411f713a0030200341206a200341306a102a200528020021070b20070440200520073602040b410021022003410036023820034200370330200341306a200628020420032d0000220141017620014101711b4101744101721028200641016a210503402002200628020420032d00002201410176200141017122011b22044f0d01200328023020026a2006280208200520011b20026a2d000022014105763a00002003280230200628020420032d0000220441017620044101711b6a20026a41016a2001411f713a0000200241016a21020c000b000b05200420076a2d0000200141087441801e71722101200241086a210203402002410548450440200320012002417b6a220276411f713a0030200341206a200341306a102a0c010b0b200441016a21040c010b0b200328023020046a41003a0000200341406b200341306a20032802202003280224102b200328023022020440200320023602340b200341406b200328024420032802406b41066a10282003280244200328024022046b21014101210203402001044020042d000041002002411d764101716b41b3c5d1d0027141002002411c764101716b41dde788ea037141002002411b764101716b41fab384f5017141002002411a764101716b41ed9cc2b20271410020024119764101716b41b2afa9db0371200241057441e0ffffff037173737373737321022001417f6a2101200441016a21040c010b0b410021012003410036021820034200370310200341106a41061028200241017321044119210203402002417b46450440200328021020016a2004200276411f713a00002002417b6a2102200141016a21010c010b0b200328024022020440200320023602440b200341406b200341306a200341206a102c220220032802102003280214102b200228020022010440200220013602040b20004200370200200041086a41003602002000102d2006280208200520032d0000220241017122011b210402402006280204200241017620011b220241016a410a4d0440200020024101743a0000200041016a21010c010b200241116a4170712206102021012000200236020420002006410172360200200020013602080b200120042002102e200120026a41003a000020004131102f20032802442202200328024022046b2000280204220920002d000022064101762201200641017122081b6a2105410a21072008044020002802002206417e71417f6a2107200921010b024020012005200120054b1b220541106a417071417f6a410a2005410a4b1b22052007460d00027f2005410a460440200041016a21082000280208210741000c010b4100200520074d200541016a102022081b0d0120002d0000220641017104402000280208210741010c010b200041016a210741010b210920082007027f2006410171044020002802040c010b200641fe01714101760b41016a102e2009044020002008360208200020013602042000200541016a4101723602000c010b200020014101743a00000b2004210103402002200446450440200020012d00004196086a2c0000102f200141016a21012002417f6a21020c010b0b20040440200320043602440b200328021022020440200320023602140b200328022022020440200320023602240b200341d0006a24000bcf0101047f20002001470440200128020420012d00002202410176200241017122041b2102200141016a210320012802082105410a21012005200320041b210420002d00002205410171220304402000280200417e71417f6a21010b200220014d0440027f2003044020002802080c010b200041016a0b2201200420021022200120026a41003a000020002d00004101710440200020023602040f0b200020024101743a00000f0b20002001200220016b027f2003044020002802040c010b20054101760b220320032002200410230b0b5a01027f02402002410a4d0440200020024101743a0000200041016a21030c010b200241106a4170712204102021032000200236020420002004410172360200200020033602080b200320012002102e200220036a41003a00000bfa0101057f230041206b22022400024020002802042203200028020022046b22052001490440200028020820036b200120056b22044f04400340200341003a00002000200028020441016a22033602042004417f6a22040d000c030b000b2000200110322106200241186a200041086a3602002002410036021441002101200604402006102021010b200220013602082002200120056a22033602102002200120066a3602142002200336020c0340200341003a00002002200228021041016a22033602102004417f6a22040d000b2000200241086a1033200241086a10340c010b200520014d0d002000200120046a3602040b200241206a24000b450020004100360208200042003702000240200220016b2202450d0020002002103020024101480d0020002802042001200210311a2000200028020420026a3602040b20000bb70101047f230041206b220224000240200028020422032000280208490440200320012d00003a00002000200028020441016a3602040c010b2000200320002802006b220441016a10322105200241186a200041086a3602004100210320024100360214200504402005102021030b20022003360208200320046a220420012d00003a00002002200320056a3602142002200436020c2002200441016a3602102000200241086a1033200241086a10340b200241206a24000bc60301057f230041206b22042400200128020421050240200320026b22064101480d002006200128020820056b4c0440034020022003460d02200520022d00003a00002001200128020441016a2205360204200241016a21020c000b000b2001200520066a200128020022066b10322108200441186a200141086a36020020044100360214200520066b2106200804402008102021070b200420073602082004200620076a22063602102004200720086a3602142004200636020c200441086a410472210703402002200346450440200620022d00003a00002004200428021041016a2206360210200241016a21020c010b0b200128020020052007103502402001280204220320056b220241004c0440200428021021020c010b2004200428021020052002103120026a2202360210200128020421030b20012002360204200128020021022001200428020c3602002001280208210520012004280214360208200420033602102004200236020c2004200536021420042002360208200441086a1034200128020421050b20002005360204200141003602042000200128020036020020012802082102200141003602082000200236020820014100360200200441206a24000b5a01017f20004200370200200041003602080240200128020420012802006b2202450d002000200210302001280204200128020022026b22014101480d0020002802042002200110311a2000200028020420016a3602040b20000b2201017f03402001410c470440200020016a4100360200200141046a21010c010b0b0b10002002044020002001200210311a0b0bf60101057f027f20002d00002202410171220345044020024101762104410a0c010b2000280204210420002802002202417e71417f6a0b210502400240024020042005460440027f2002410171044020002802080c010b200041016a0b2106416f2103200541e6ffffff074d0440410b20054101742202200541016a220320032002491b220241106a4170712002410b491b21030b20031020220220062005102e20002003410172360200200020023602080c010b2003450d01200028020821020b2000200441016a3602040c010b2000200441017441026a3a0000200041016a21020b200220046a220041003a0001200020013a00000b2001017f2000200110202202360200200020023602042000200120026a3602080bfc0801067f03400240200020046a2105200120046a210320022004460d002003410371450d00200520032d00003a0000200441016a21040c010b0b200220046b210602402005410371220745044003402006411049450440200020046a2203200120046a2205290200370200200341086a200541086a290200370200200441106a2104200641706a21060c010b0b027f2006410871450440200120046a2103200020046a0c010b200020046a2205200120046a2204290200370200200441086a2103200541086a0b21042006410471044020042003280200360200200341046a2103200441046a21040b20064102710440200420032f00003b0000200341026a2103200441026a21040b2006410171450d01200420032d00003a000020000f0b024020064120490d002007417f6a220741024b0d00024002400240024002400240200741016b0e020102000b2005200120046a220328020022073a0000200541016a200341016a2f00003b0000200041036a2108200220046b417d6a2106034020064111490d03200420086a2203200120046a220541046a2802002202410874200741187672360200200341046a200541086a2802002207410874200241187672360200200341086a2005410c6a28020022024108742007411876723602002003410c6a200541106a2802002207410874200241187672360200200441106a2104200641706a21060c000b000b2005200120046a220328020022073a0000200541016a200341016a2d00003a0000200041026a2108200220046b417e6a2106034020064112490d03200420086a2203200120046a220541046a2802002202411074200741107672360200200341046a200541086a2802002207411074200241107672360200200341086a2005410c6a28020022024110742007411076723602002003410c6a200541106a2802002207411074200241107672360200200441106a2104200641706a21060c000b000b2005200120046a28020022073a0000200041016a21082004417f7320026a2106034020064113490d03200420086a2203200120046a220541046a2802002202411874200741087672360200200341046a200541086a2802002207411874200241087672360200200341086a2005410c6a28020022024118742007410876723602002003410c6a200541106a2802002207411874200241087672360200200441106a2104200641706a21060c000b000b200120046a41036a2103200020046a41036a21050c020b200120046a41026a2103200020046a41026a21050c010b200120046a41016a2103200020046a41016a21050b20064110710440200520032d00003a00002005200328000136000120052003290005370005200520032f000d3b000d200520032d000f3a000f200541106a2105200341106a21030b2006410871044020052003290000370000200541086a2105200341086a21030b2006410471044020052003280000360000200541046a2105200341046a21030b20064102710440200520032f00003b0000200541026a2105200341026a21030b2006410171450d00200520032d00003a00000b20000b2e01017f2001200028020820002802006b2200410174220220022001491b41ffffffff07200041ffffffff03491b0b6701017f20002802002000280204200141046a1035200028020021022000200128020436020020012002360204200028020421022000200128020836020420012002360208200028020821022000200128020c3602082001200236020c200120012802043602000b2b01027f200028020821012000280204210203402001200247044020002001417f6a22013602080c010b0b0b270020022002280200200120006b22016b2202360200200141014e044020022000200110311a0b0b2f01017f2000280208200149044020011043200028020020002802041031210220002001360208200020023602000b0b1e01017f03402000044020004108762100200141016a21010c010b0b20010b25002000200120026a417f6a220241087641fcffff07716a280200200241ff07714102746a0b2801017f2000200120021004200028020422036a105a20012002200320002802006a10052000105b0b2801017f200028020820002802046b2201410874417f6a410020011b200028021420002802106a6b0b2501017f200028020821020340200120024645044020002002417c6a22023602080c010b0b0ba10202057f017e230041206b22052400024020002802082202200028020c2203470d0020002802042204200028020022064b04402000200420022004200420066b41027541016a417e6d41027422036a103d22023602082000200028020420036a3602040c010b200541086a200320066b2202410175410120021b220220024102762000410c6a103e2103200028020821042000280204210203402002200446450440200328020820022802003602002003200328020841046a360208200241046a21020c010b0b2000290200210720002003290200370200200320073702002000290208210720002003290208370208200320073702082003103f200028020821020b200220012802003602002000200028020841046a360208200541206a24000b2501017f200120006b220141027521032001044020022000200110420b200220034102746a0b4f01017f2000410036020c200041106a2003360200200104402001410274102021040b200020043602002000200420024102746a22023602082000200420014102746a36020c2000200236020420000b2b01027f200028020821012000280204210203402001200247044020002001417c6a22013602080c010b0b0b1b00200120006b22010440200220016b22022000200110420b20020b4f01037f20012802042203200128021020012802146a220441087641fcffff07716a21022000027f410020032001280208460d001a2002280200200441ff07714102746a0b360204200020023602000b8d0301037f024020002001460d00200120006b20026b410020024101746b4d044020002001200210311a0c010b20002001734103712103027f024020002001490440200020030d021a410021030340200120036a2105200020036a2204410371450440200220036b210241002103034020024104490d04200320046a200320056a280200360200200341046a21032002417c6a21020c000b000b20022003460d04200420052d00003a0000200341016a21030c000b000b024020030d002001417f6a21040340200020026a22034103714504402001417c6a21032000417c6a2104034020024104490d03200220046a200220036a2802003602002002417c6a21020c000b000b2002450d042003417f6a200220046a2d00003a00002002417f6a21020c000b000b2001417f6a210103402002450d03200020026a417f6a200120026a2d00003a00002002417f6a21020c000b000b200320056a2101200320046a0b210303402002450d01200320012d00003a00002002417f6a2102200341016a2103200141016a21010c000b000b0b9b0101047f230041106b220124002001200036020c2000047f418009200041086a220241107622004180092802006a220336020041fc0841fc08280200220420026a41076a417871220236020002400240200341107420024d0440418009200341016a360200200041016a21000c010b2000450d010b200040000d0010000b20042001410c6a4104103141086a0541000b2100200141106a240020000bce0402047f017e230041a0016b22002400105c10082201104322021009200041f8006a200041086a20022001104522014100104602400240200041f8006a10472204500d0041c0081048200451044020011049200041f8006a104a104b0c020b41c50810482004510440200042003703382000420037033020004100360228200042003703202001104c410447044010000b200041386a2102200041306a21032000410136024c200020013602402000200041cc006a360244200041f8006a20014101104602400240200028027c044020002802782d000041c001490d010b20004100360270200042003703680c010b200041d8006a200041f8006a104d20002802582101200041d0006a200041f8006a104d200041e8006a20012000280250200041f8006a104e6a10291a0b200020002802683602202000200029026c3702242000200028024c41016a36024c200041406b2003104f200041406b2002104f200041f8006a104a2102200041e8006a200041d8006a200041206a102c220120002903302000290338101f200041e8006a1050200128020022030440200120033602040b2002104b20002802202201450d02200020013602240c020b41d60810482004510440200041e8006a105121022001104c410247044010000b200041f8006a200141011046200041f8006a20021052200041f8006a104a210120004190016a200041206a2002101a10262001104b0c020b41e10810482004520d0020011049200041f8006a104a2101200041206a20004190016a101a10502001104b0c010b10000b1053200041a0016a24000b0c00200020012002411c10540bc90202067f017e230041106b220324002001280208220520024b0440200341086a2001105820012003280208200328020c105936020c200320011058410021052001027f410020032802002207450d001a410020032802042208200128020c2206490d001a200820062006417f461b210420070b360210200141146a2004360200200141003602080b200141106a210603402001280214210402402005200249044020040d01410021040b200020062802002004411410541a200341106a24000f0b20032001105841002104027f410020032802002205450d001a410020032802042208200128020c2207490d001a200820076b2104200520076a0b21052001200436021420012005360210200320064100200520041059105f2001200329030022093702102001200128020c2009422088a76a36020c2001200128020841016a22053602080c000b000b870202047f017e230041106b2203240020001055024002402000280204450d00200010550240200028020022022c0000220141004e044020010d010c020b200141807f460d00200141ff0171220441b7014d0440200028020441014d04401000200028020021020b20022d00010d010c020b200441bf014b0d012000280204200141ff017141ca7e6a22014d04401000200028020021020b200120026a2d0000450d010b2000280204450d0020022d000041c001490d010b10000b200341086a2000104d200328020c220041094f044010000b200328020821010340200004402000417f6a210020013100002005420886842105200141016a21010c010b0b200341106a240020050b3901027e42a5c688a1c89ca7f94b210103402000300000220250450440200041016a2100200142b383808080207e20028521010c010b0b20010b0e002000104c410147044010000b0bf40101087f230041406a22012400200010512107200042afb59bdd9e8485b9f800370310200041186a10512106200141286a1019220220002903101056200228020c200241106a28020047044010000b02402002280200220520022802042208100a22034504400c010b2001410036022020014200370318200141186a200310282005200820012802182205200128021c20056b100b417f47044020012001280218220441016a200128021c2004417f736a104520061052200321040b20012802182203450d002001200336021c0b200228020c22030440200220033602100b20044504402006200710260b200141406b240020000bc80302097f027e230041d0006b22032400200341186a10192104200341c8006a4100360200200341406b4200370300200341386a420037030020034200370330410121022000290310220a4280015a04400340200a200b8450450440200b423886200a42088884210a200141016a2101200b420888210b0c010b0b200141384f047f2001103720016a0520010b41016a21020b20032002360230200341306a410472101d200420021017200420002903101056200428020c200441106a28020047044010000b2004280204210520042802002106200341306a10192101200041186a22001057210741011020220241fe013a0000200128020c200141106a28020047044010000b2001280204220841016a220920012802084b047f20012009103620012802040520080b20012802006a2002410110311a2001200128020441016a3602042001200241016a200720026b6a10172001200341086a2000101a101e0240200128020c2001280210460440200128020021020c010b100020012802002102200128020c2001280210460d0010000b2006200520022001280204100c200128020c22020440200120023602100b200428020c22010440200420013602100b200341d0006a24000b800101047f230041106b2201240002402000280204450d0020002802002d000041c001490d00200141086a20001058200128020c210003402000450d01200141002001280208220320032000105922046a20034520002004497222031b3602084100200020046b20031b2100200241016a21020c000b000b200141106a240020020bd50101047f2001104e2204200128020422024b04401000200128020421020b200128020021052000027f02400240200204404100210120052c00002203417f4a0d01027f200341ff0171220141bf014d04404100200341ff017141b801490d011a200141c97e6a0c010b4100200341ff017141f801490d001a200141897e6a0b41016a21010c010b4101210120050d000c010b41002103200120046a20024b0d0020022001490d00410020022004490d011a200120056a2103200220016b20042004417f461b0c010b41000b360204200020033602000bff0201037f200028020445044041000f0b2000105541012102024020002802002c00002201417f4a0d00200141ff0171220341b7014d0440200341807f6a0f0b02400240200141ff0171220141bf014d0440024020002802042201200341c97e6a22024d047f100020002802040520010b4102490d0020002802002d00010d0010000b200241054f044010000b20002802002d000145044010000b4100210241b7012101034020012003460440200241384f0d030c0405200028020020016a41ca7e6a2d00002002410874722102200141016a21010c010b000b000b200141f7014d0440200341c07e6a0f0b024020002802042201200341897e6a22024d047f100020002802040520010b4102490d0020002802002d00010d0010000b200241054f044010000b20002802002d000145044010000b4100210241f701210103402001200346044020024138490d0305200028020020016a418a7e6a2d00002002410874722102200141016a21010c010b0b0b200241ff7d490d010b10000b20020b4601017f230041206b22022400200241086a2000280200200028020428020010462001200241086a104737030020002802042200200028020041016a360200200241206a24000b6001027f230041306b22022400200241186a101922012000105710172001200241086a2000101a101e200128020c200141106a28020047044010000b20012802002001280204100f200128020c22000440200120003602100b200241306a24000b190020004200370200200041086a41003602002000102d20000bf40201057f230041206b22022400024002402000280204044020002802002d000041c001490d010b200241086a10511a0c010b200241186a2000104d2000104e21030240024002400240200228021822000440200228021c220520034f0d010b41002100200241106a410036020020024200370308410021050c010b200241106a4100360200200242003703082000200520032003417f461b22046a21052004410a4b0d010b200220044101743a0008200241086a41017221030c010b200441106a4170712206102021032002200436020c20022006410172360208200220033602100b03402000200546450440200320002d00003a0000200341016a2103200041016a21000c010b0b200341003a00000b024020012d0000410171450440200141003b01000c010b200128020841003a00002001410036020420012d0000410171450d00200141003602000b20012002290308370200200141086a200241106a280200360200200241086a102d200241206a24000b880101037f41ec08410136020041f0082802002100034020000440034041f40841f4082802002201417f6a2202360200200141014845044041ec084100360200200020024102746a22004184016a280200200041046a28020011020041ec08410136020041f00828020021000c010b0b41f408412036020041f008200028020022003602000c010b0b0b730020004200370210200042ffffffff0f370208200020023602042000200136020002402003410871450d002000105d20024f0d002003410471044010000c010b200042003702000b02402003411071450d002000105d20024d0d0020034104710440100020000f0b200042003702000b20000b4101017f200028020445044010000b0240200028020022012d0000418101470d00200028020441014d047f100020002802000520010b2c00014100480d0010000b0b2801017f2000420020011006200028020422026a105a42002001200220002802006a10072000105b0b5901017f230041306b22012400200141286a4100360200200141206a4200370300200141186a420037030020014200370310200141106a20012000101a101c20012802102100200141106a410472101d200141306a240020000b2101017f2001104e220220012802044b044010000b200020012001105e2002105f0b2701017f230041206b22022400200241086a2000200141141054105d2100200241206a240020000b3601017f2000280208200149044020011043200028020020002802041031210220002001360208200020023602000b200020013602040b7a01037f0340024020002802102201200028020c460d00200141786a2802004504401000200028021021010b200141786a22022002280200417f6a220336020020030d002000200236021020002001417c6a2802002201200028020420016b220210026a105a200120002802006a22012002200110030c010b0b0b3501017f230041106b22004190890436020c41f808200028020c41076a417871220036020041fc0820003602004180093f003602000b2e01017f200028020445044041000f0b4101210120002802002c0000417f4c047f2000105e2000104e6a0520010b0b5b00027f027f41002000280204450d001a410020002802002c0000417f4a0d011a20002802002d0000220041bf014d04404100200041b801490d011a200041c97e6a0c010b4100200041f801490d001a200041897e6a0b41016a0b0b5b01027f2000027f0240200128020022054504400c010b200220036a200128020422014b0d0020012002490d00410020012003490d011a200220056a2104200120026b20032003417f461b0c010b41000b360204200020043602000b0b7101004181080b6a30313233343536373839616263646566006174780071707a7279397838676632747664773073336a6e35346b686365366d7561376c007472616e7366657200696e6974006d6967726174655f636f6e7472616374007365745f737472696e67006765745f737472696e67";

    public static String BINARY = BINARY_0;

    public static final String FUNC_MIGRATE_CONTRACT = "migrate_contract";

    public static final String FUNC_SET_STRING = "set_string";

    public static final String FUNC_GET_STRING = "get_string";

    public static final WasmEvent TRANSFER_EVENT = new WasmEvent("transfer", Arrays.asList(new WasmEventParameter(String.class, true)), Arrays.asList(new WasmEventParameter(String.class)));
    ;

    protected ContractMigrate_v1(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected ContractMigrate_v1(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public List<TransferEventResponse> getTransferEvents(TransactionReceipt transactionReceipt) {
        List<WasmContract.WasmEventValuesWithLog> valueList = extractEventParametersWithLog(TRANSFER_EVENT, transactionReceipt);
        ArrayList<TransferEventResponse> responses = new ArrayList<TransferEventResponse>(valueList.size());
        for (WasmContract.WasmEventValuesWithLog eventValues : valueList) {
            TransferEventResponse typedResponse = new TransferEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.topic = (String) eventValues.getIndexedValues().get(0);
            typedResponse.arg1 = (String) eventValues.getNonIndexedValues().get(0);
            responses.add(typedResponse);
        }
        return responses;
    }

    public Observable<TransferEventResponse> transferEventObservable(PlatonFilter filter) {
        return web3j.platonLogObservable(filter).map(new Func1<Log, TransferEventResponse>() {
            @Override
            public TransferEventResponse call(Log log) {
                WasmContract.WasmEventValuesWithLog eventValues = extractEventParametersWithLog(TRANSFER_EVENT, log);
                TransferEventResponse typedResponse = new TransferEventResponse();
                typedResponse.log = log;
                typedResponse.topic = (String) eventValues.getIndexedValues().get(0);
                typedResponse.arg1 = (String) eventValues.getNonIndexedValues().get(0);
                return typedResponse;
            }
        });
    }

    public Observable<TransferEventResponse> transferEventObservable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        PlatonFilter filter = new PlatonFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(WasmEventEncoder.encode(TRANSFER_EVENT));
        return transferEventObservable(filter);
    }

    public static RemoteCall<ContractMigrate_v1> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        String encodedConstructor = WasmFunctionEncoder.encodeConstructor(BINARY, Arrays.asList());
        return deployRemoteCall(ContractMigrate_v1.class, web3j, credentials, contractGasProvider, encodedConstructor);
    }

    public static RemoteCall<ContractMigrate_v1> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        String encodedConstructor = WasmFunctionEncoder.encodeConstructor(BINARY, Arrays.asList());
        return deployRemoteCall(ContractMigrate_v1.class, web3j, transactionManager, contractGasProvider, encodedConstructor);
    }

    public static RemoteCall<ContractMigrate_v1> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider, BigInteger initialVonValue) {
        String encodedConstructor = WasmFunctionEncoder.encodeConstructor(BINARY, Arrays.asList());
        return deployRemoteCall(ContractMigrate_v1.class, web3j, credentials, contractGasProvider, encodedConstructor, initialVonValue);
    }

    public static RemoteCall<ContractMigrate_v1> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider, BigInteger initialVonValue) {
        String encodedConstructor = WasmFunctionEncoder.encodeConstructor(BINARY, Arrays.asList());
        return deployRemoteCall(ContractMigrate_v1.class, web3j, transactionManager, contractGasProvider, encodedConstructor, initialVonValue);
    }

    public RemoteCall<TransactionReceipt> migrate_contract(byte[] init_arg, Uint64 transfer_value, Uint64 gas_value) {
        final WasmFunction function = new WasmFunction(FUNC_MIGRATE_CONTRACT, Arrays.asList(init_arg,transfer_value,gas_value), Void.class);
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> migrate_contract(byte[] init_arg, Uint64 transfer_value, Uint64 gas_value, BigInteger vonValue) {
        final WasmFunction function = new WasmFunction(FUNC_MIGRATE_CONTRACT, Arrays.asList(init_arg,transfer_value,gas_value), Void.class);
        return executeRemoteCallTransaction(function, vonValue);
    }

    public RemoteCall<TransactionReceipt> set_string(String one_name) {
        final WasmFunction function = new WasmFunction(FUNC_SET_STRING, Arrays.asList(one_name), Void.class);
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> set_string(String one_name, BigInteger vonValue) {
        final WasmFunction function = new WasmFunction(FUNC_SET_STRING, Arrays.asList(one_name), Void.class);
        return executeRemoteCallTransaction(function, vonValue);
    }

    public RemoteCall<String> get_string() {
        final WasmFunction function = new WasmFunction(FUNC_GET_STRING, Arrays.asList(), String.class);
        return executeRemoteCall(function, String.class);
    }

    public static ContractMigrate_v1 load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new ContractMigrate_v1(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static ContractMigrate_v1 load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new ContractMigrate_v1(contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static class TransferEventResponse {
        public Log log;

        public String topic;

        public String arg1;
    }
}
