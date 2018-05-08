package com.multithread.code.chapter2.t7.mythread;

import com.multithread.code.chapter2.t7.mytask.MyTask;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/5/8
 */
public class T7MyThreadA extends Thread {
    private MyTask task;

    public T7MyThreadA(MyTask task) {
        super();
        this.task = task;
    }

    @Override
    public void run() {
        super.run();
        task.doLongTimeTask();
    }
}
