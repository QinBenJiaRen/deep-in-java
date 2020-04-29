package com.haiyang.www.juc;

import com.haiyang.www.ThreadMessage.SynchronizedKeyWordQuestion;

import java.util.concurrent.*;

public class BlockingQueueQuestion {

    public static void main(String[] args) throws InterruptedException {

        BlockingQueue<Integer> queue = new PriorityBlockingQueue(2);
        queue.add(9);
        queue.add(1);
        queue.add(8);
        System.out.println("queue的长度：" + queue.size());
        System.out.println(queue.take());
        System.out.println(queue.offer(1));

        BlockingQueue<Integer> queue2 = new SynchronousQueue<>();

    }
}
