package com.multithread.code.chapter3.stack1new.thread;

import com.multithread.code.chapter3.stack1new.service.Stack1Consumer;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/5/15
 */
public class Stack1ThreadC extends Thread {
    private Stack1Consumer consumer;

    public Stack1ThreadC(Stack1Consumer consumer) {
        this.consumer = consumer;
    }

    @Override
    public void run() {
        while (true) {
            consumer.popService();
        }
    }
}
