package com.haiyang.www.GoF.ProxyPattern;

/**
 * 静态代理模式实现1
 * 此种情况为原始类有定义接口，此时可让代理类直接继承接口，并将原始类注入到代理类中
 * */
public class UserControllerProxy implements IUser {

    private UserController userController;

    public UserControllerProxy(UserController userController) {
        this.userController = userController;
    }

    @Override
    public void login(String telephone, String password) {
        long startTime = System.currentTimeMillis();
        //委托
        userController.login("1111", "11111");
        long endTime = System.currentTimeMillis();
        long responseTime = endTime - startTime;
        System.out.println("用户登录接口响应时间为：" + responseTime);
    }

    @Override
    public void register(String telephone, String password) {

    }
}
