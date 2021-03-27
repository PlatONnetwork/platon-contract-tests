#undef NDEBUG
#include <platon/platon.hpp>
#include <vector>
#include <string>

using namespace platon;

CONTRACT delegate_call_ppos : public platon::Contract {
    public:
        PLATON_EVENT0(CallErrorInfo, const platon::bytes &);
    public:
        ACTION void init(){}

        ACTION uint64_t delegate_call_ppos_send (std::string target_addr, std::string &in, uint64_t gas) {
            platon::bytes  input = fromHex(in);

            auto address_info = make_address(target_addr);
            if(address_info.second){
                if (platon_delegate_call(address_info.first, input, gas)) {
                    printf("to call");
                    DEBUG("delegate call contract delegate_call_ppos_send success", "address", target_addr);
                    return 0;
                }else{
                    printf("return code");
                    platon::bytes error_info;
                    platon::get_call_output(error_info);
                    auto func = [](uint8_t one){printf("%d\t\n", int(one));};
                    std::for_each(error_info.begin(), error_info.end(), func);
                    PLATON_EMIT_EVENT0(CallErrorInfo, error_info);
                }
            }else{
                printf("error address:%s\t\n", target_addr.c_str());
            }
            printf("undo!");
            DEBUG("delegate call contract delegate_call_ppos_send fail", "address", target_addr);
            return 1;
        }

        CONST const std::string  delegate_call_ppos_query (std::string target_addr, std::string &in, uint64_t gas) {
            platon::bytes  input = fromHex(in);

            auto address_info = make_address(target_addr);
            if(address_info.second){
                if (platon_delegate_call(address_info.first, input, gas)) {
                DEBUG("delegate call contract delegate_call_ppos_query success", "address", target_addr);
                platon::bytes ret;
                size_t len = platon_get_call_output_length();
                ret.resize(len);
                platon_get_call_output(ret.data());
                std::string str = toHex(ret);
                DEBUG("delegate call contract delegate_call_ppos_query success", "ret", str);
                return str;
            }
            }

            DEBUG("delegate call contract delegate_call_ppos_query fail", "address", target_addr);
            return "";
        }

};

PLATON_DISPATCH(delegate_call_ppos, (init)(delegate_call_ppos_send)(delegate_call_ppos_query))