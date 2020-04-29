package com.haiyang.www.serviceRegister;

public class AliPay implements IPayService {
    @Override
    public void pay() {
        System.out.println("ali Pay");
    }
}
