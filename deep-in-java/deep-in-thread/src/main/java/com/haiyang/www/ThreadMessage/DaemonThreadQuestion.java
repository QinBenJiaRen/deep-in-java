package com.haiyang.www.ThreadMessage;

public class DaemonThreadQuestion {

    public static void main(String[] args) {
        Thread t1 = new Thread(()->{
           action();
        },"daemon");
        //变成守候线程
        t1.setDaemon(true);
        t1.start();

        //守候线程的执行依赖于执行时间
    }

    public static void action() {
        System.out.printf("当前线程[%s]正在执行", Thread.currentThread().getName());
    }
}
