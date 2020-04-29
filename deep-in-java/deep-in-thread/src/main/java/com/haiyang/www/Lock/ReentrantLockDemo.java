package com.haiyang.www.Lock;

import java.util.ServiceLoader;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockDemo {

    public static void main(String[] args) {

        ServiceLoader<Thread> loaders = ServiceLoader.load(Thread.class);


    }
}
