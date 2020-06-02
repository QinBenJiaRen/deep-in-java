package com.haiyang.www.GoF.ProxyPattern;

import java.lang.reflect.Proxy;

public class UserControllerDynamicProxy {

    private UserController userController;

    public UserControllerDynamicProxy(UserController userController) {
        this.userController = userController;
    }

    public Object createProxy(Object proxiedObject) {
        Class<?>[] interfaces = proxiedObject.getClass().getInterfaces();
        DynamicHandler dynamicHandler = new DynamicHandler(proxiedObject);
        return Proxy.newProxyInstance(proxiedObject.getClass().getClassLoader(), interfaces, dynamicHandler);
    }
}
