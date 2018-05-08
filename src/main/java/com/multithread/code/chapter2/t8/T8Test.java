package com.multithread.code.chapter2.t8;

import com.multithread.code.chapter2.t8.mytask.T8MyTask;
import com.multithread.code.chapter2.t8.mythread.T8ThreadA;
import com.multithread.code.chapter2.t8.mythread.T8ThreadB;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/5/8
 */
public class T8Test {
    public static void main(String[] args) throws InterruptedException {
        T8MyTask task = new T8MyTask();
        T8ThreadA threadA = new T8ThreadA(task);
        threadA.setName("threadA");
        threadA.start();

        Thread.sleep(10);

        T8ThreadB threadB = new T8ThreadB(task);
        threadB.setName("threadA");
        threadB.start();
    }
}
