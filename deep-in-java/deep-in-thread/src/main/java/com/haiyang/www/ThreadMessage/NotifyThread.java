package com.haiyang.www.ThreadMessage;

public class NotifyThread implements Runnable {

    public void run() {
        synchronized (this) {
            System.out.println(111);
            this.notify();
        }
    }

    public static void main(String[] args) {
        new Thread(new NotifyThread()).start();
    }
}
