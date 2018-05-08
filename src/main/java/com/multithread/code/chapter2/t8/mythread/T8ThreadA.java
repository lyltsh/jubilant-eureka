package com.multithread.code.chapter2.t8.mythread;

import com.multithread.code.chapter2.t8.mytask.T8MyTask;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/5/8
 */
public class T8ThreadA extends Thread {
    private T8MyTask task;

    public T8ThreadA(T8MyTask task) {
        super();
        this.task = task;
    }

    @Override
    public void run() {
        super.run();
        task.doLongTimeTask();
    }
}
