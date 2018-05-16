package com.multithread.code.chapter3.PRAllWait.thread;

import com.multithread.code.chapter3.PRAllWait.entity.PRAllWaitProducer;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/5/13
 */
public class ThreadProducer extends Thread {
    private PRAllWaitProducer producer;

    public ThreadProducer(PRAllWaitProducer producer) {
        super();
        this.producer = producer;
    }

    @Override
    public void run() {
        while (true){
            producer.setValue();
        }
    }
}
