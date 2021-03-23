pragma solidity ^0.8.2;

contract Semantics {

    //function fallback() external payable {
    //}

    receive() external payable {
    }

    function exponentiation(uint a, uint b, uint c) public view returns(uint) {
        uint d = a**b**c;
        return d;
    }

    function getBytes1() public view returns(bytes1) {
        //byte 已在0.8.2删除只能用bytes1声明
        bytes1 b = hex"c8";//十进制数字200 <====> 十六进制c8 <===> 二进制11001000
        return  b;
    }

    function addrPay() public payable {
        payable(msg.sender).transfer(msg.value);
    }
}