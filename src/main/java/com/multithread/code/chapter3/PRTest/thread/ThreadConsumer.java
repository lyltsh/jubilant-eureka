package com.multithread.code.chapter3.PRTest.thread;

import com.multithread.code.chapter3.PRTest.entity.PRConsumer;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/5/13
 */
public class ThreadConsumer implements Runnable {
    private PRConsumer consumer;

    public ThreadConsumer(PRConsumer consumer) {
        super();
        this.consumer = consumer;
    }

    @Override
    public void run() {
        while (true){
            consumer.getValue();
        }
    }
}
