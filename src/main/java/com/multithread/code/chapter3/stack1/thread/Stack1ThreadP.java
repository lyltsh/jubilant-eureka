package com.multithread.code.chapter3.stack1.thread;

import com.multithread.code.chapter3.stack1.service.Stack1Producer;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/5/15
 */
public class Stack1ThreadP extends Thread {
    private Stack1Producer producer;

    public Stack1ThreadP(Stack1Producer producer) {
        this.producer = producer;
    }

    @Override
    public void run() {
        while (true) {
            producer.pushService();
        }
    }
}
