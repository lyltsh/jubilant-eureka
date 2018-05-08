package com.multithread.code.chapter2.t7.mythread;

import com.multithread.code.chapter2.t7.mytask.MyTask;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/5/8
 */
public class T7MyThread implements Runnable {
    private MyTask task;

    public T7MyThread(MyTask task) {
        this.task = task;
    }

    @Override
    public void run() {
        task.doLongTimeTask();
    }
}
