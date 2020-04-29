package com.haiyang.www.ThreadMessage;

public class ThreadCreationDemo {

    public static void main(String[] args) {

        Thread t1 = new Thread(()->{
            action();
        },"t1");

        Thread t2 = new Thread(ThreadCreationDemo::action, "t2");
        Thread t3 = new Thread(ThreadCreationDemo::action, "t3");

        t1.start();
        t2.start();
        t3.start();
    }

    public static void action() {
        System.out.printf("当前线程[%s]正在运行\n", Thread.currentThread().getName());
    }
}
