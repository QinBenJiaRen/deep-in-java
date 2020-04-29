package com.haiyang.www.GoF.SingletonPattern;

/**
 * 这是双重检测方式的优化写法，volatile带有读写屏障指令，可以有效防止指令重排序，确保数据最终可以刷入主存中。
 * 静态变量使用了volatile, 需要从主存同步，修改又要同步到主存，消耗了IO，而局部变量和主存无关，只要最后一次同步到主存即可。
 * volatile 修改的变量，不走寄存器内存，每次操作都是直接访问的内存，性能较差。
 * */
public class Singleton {
    private static volatile Singleton instance = null;
    private Singleton() {

    }

    public static Singleton getInstance() {
        // 为什么要用局部变量来接收？？？
        Singleton temp = instance;
        if (null == temp) {
            synchronized (Singleton.class) {
                temp = instance;
                if (null == temp) {
                    temp = new Singleton();
                    instance = temp;
                }
            }
        }
        return instance;
    }


}
