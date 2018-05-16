package com.multithread.code.chapter3.PRAllWait.thread;

import com.multithread.code.chapter3.PRAllWait.entity.PRAllWaitConsumer;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/5/13
 */
public class ThreadConsumer extends Thread {
    private PRAllWaitConsumer consumer;

    public ThreadConsumer(PRAllWaitConsumer consumer) {
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
