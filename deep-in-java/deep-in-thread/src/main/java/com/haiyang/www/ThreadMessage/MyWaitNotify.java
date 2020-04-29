package com.haiyang.www.ThreadMessage;

/**
 * 等待线程将调用doWait(),而唤醒线程将调用doNotify()。
 *
 * */
public class MyWaitNotify {

    MonitorObject monitorObject = new MonitorObject();

    public void doWait() {
        synchronized (monitorObject) {
            try {
                monitorObject.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void doNotify() {
        synchronized (monitorObject) {
            monitorObject.notify();
        }
    }

    public static void main(String[] args) {

    }
}
