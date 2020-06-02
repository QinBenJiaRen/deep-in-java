package com.haiyang.www.GoF.ProxyPattern;

public class UserController implements IUser {
    @Override
    public void login(String telephone, String password) {
        System.out.println("这是用户登录请求接口");
    }

    @Override
    public void register(String telephone, String password) {
        System.out.println("这是用户注册请求接口");
    }
}
