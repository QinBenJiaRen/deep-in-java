package com.haiyang.www.juc;

import java.util.concurrent.locks.LockSupport;

public class LockSupportDemo {

    public static void main(String[] args) {
        LockSupport.unpark(Thread.currentThread());
        System.out.println("哈哈。。。我来了，我没有被阻塞，快乐ing...");
        LockSupport.park();
        System.out.println("我被阻塞住了吗？？？");
        LockSupport.park();
        System.out.println("好像是被阻塞了，伤心ing....");


    }
}
