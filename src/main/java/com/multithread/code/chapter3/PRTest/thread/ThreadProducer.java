package com.multithread.code.chapter3.PRTest.thread;

import com.multithread.code.chapter3.PRTest.entity.PRProducer;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/5/13
 */
public class ThreadProducer implements Runnable {
    private PRProducer producer;

    public ThreadProducer(PRProducer producer) {
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
