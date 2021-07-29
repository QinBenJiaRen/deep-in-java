package com.haiyang.www.GoF.ProxyPattern;

import java.lang.reflect.Proxy;

public class UserControllerDynamicProxy {

    private UserController userController;

    public UserControllerDynamicProxy(UserController userController) {
        this.userController = userController;
    }

    public Object createProxy(Object obj) {
        Class<?>[] interfaces = obj.getClass().getInterfaces();
        DynamicHandler dynamicHandler = new DynamicHandler(obj);
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(), interfaces, dynamicHandler);
    }
}
