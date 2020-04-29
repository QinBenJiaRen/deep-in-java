package com.haiyang.www.serviceRegister;

public class WechatPay implements IPayService {
    @Override
    public void pay() {
        System.out.println("wechat pay");
    }
}
