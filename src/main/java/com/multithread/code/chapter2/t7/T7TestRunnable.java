package com.multithread.code.chapter2.t7;

import com.multithread.code.chapter2.t7.mytask.MyTask;
import com.multithread.code.chapter2.t7.mythread.T7MyThread;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/5/8
 */
public class T7TestRunnable {
    public static void main(String[] args){
        MyTask task = new MyTask();
        T7MyThread threadA = new T7MyThread(task);
        T7MyThread threadB = new T7MyThread(task);
        threadA.run();
        threadB.run();
    }
}
