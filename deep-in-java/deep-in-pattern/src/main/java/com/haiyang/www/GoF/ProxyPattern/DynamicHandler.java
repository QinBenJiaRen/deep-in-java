package com.haiyang.www.GoF.ProxyPattern;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicHandler implements InvocationHandler {

    private Object proxiedObject;

    public DynamicHandler(Object proxiedObject) {
        this.proxiedObject = proxiedObject;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        long startTime = System.currentTimeMillis();
        Object result = method.invoke(proxiedObject, args);
        long endTime = System.currentTimeMillis();
        System.out.println("接口调用时间为：" + (endTime - startTime)/1000 + "s");
        return result;
    }
}
