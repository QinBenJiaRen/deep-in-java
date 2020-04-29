package com.haiyang.www.GoF.SingletonPattern;

/**
 * 普通双重检测写法
 * */
public class NormalSingleton {

    private static volatile NormalSingleton instance = null;

    public NormalSingleton() {}

    public static NormalSingleton getInstance() {
        if (instance == null) {
            synchronized (NormalSingleton.class) {
                instance = new NormalSingleton();
            }
        }
        return instance;
    }
}
