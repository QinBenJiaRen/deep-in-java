package com.haiyang.www.ThreadMessage;

/**
 * 保证执行顺序为：t1 -> t2 -> t3
 * */
public class ThreadExecQuestionDemo {
    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(ThreadExecQuestionDemo::action, "t1");
        Thread t2 = new Thread(ThreadExecQuestionDemo::action, "t2");
        Thread t3 = new Thread(ThreadExecQuestionDemo::action, "t3");

        //方法1 join()方式
        /*t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();
        t3.join();*/

        //方法2 自旋
        /*t1.start();
        while (t1.isAlive()){

        }
        t2.start();
        while (t2.isAlive()){

        }
        t3.start();
        while (t3.isAlive()){

        }*/

        //方法3 sleep
        /*t1.start();
        while (t1.isAlive()){
            t1.sleep(0);
        }
        t2.start();
        while (t2.isAlive()) {
            t2.sleep(0);
        }
        t3.start();
        while (t3.isAlive()){
            t3.sleep(0);
        }*/

        //方法4 wait
        t1.start();
        while (t1.isAlive()) {
            synchronized (t1) {
                t1.wait();
            }
        }
        t2.start();
        while (t2.isAlive()) {
            synchronized (t2) {
                t2.wait();
            }
        }
        t3.start();
        while (t3.isAlive()) {
            synchronized (t3) {
                t3.wait();
            }
        }

    }

    public static void action() {
        System.out.printf("当前线程[%s]正在运行\n", Thread.currentThread().getName());
    }
}
