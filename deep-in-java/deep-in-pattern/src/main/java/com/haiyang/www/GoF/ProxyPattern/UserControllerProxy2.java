package com.haiyang.www.GoF.ProxyPattern;

/**
 * 静态代理模式实现2
 * 此种情况为：原始类UserController并没有定义接口，且原始类代码并非自己开发，也不能直接修改原始类代码，或给它定义一个接口；
 * 此种情况下，可直接继承原始类，然后添加附功能即可。
 * */
public class UserControllerProxy2 extends UserController {

    public void login(String telephone, String password) {
        long startTime = System.currentTimeMillis();
        super.login(telephone, password);
        long endTime = System.currentTimeMillis();
        System.out.println("用户登录接口响应时间为：" + (endTime - startTime)/1000 + "s");
    }

    public void register(String telephone, String password) {
        long startTime = System.currentTimeMillis();
        super.register(telephone, password);
        long endTime = System.currentTimeMillis();
        System.out.println("用户注册接口响应时间为：" + (endTime - startTime)/1000 + "s");
    }


}
