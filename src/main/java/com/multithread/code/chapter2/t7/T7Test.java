package com.multithread.code.chapter2.t7;

import com.multithread.code.chapter2.t7.mytask.MyTask;
import com.multithread.code.chapter2.t7.mythread.T7MyThreadA;
import com.multithread.code.chapter2.t7.mythread.T7MyThreadB;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/5/8
 */
public class T7Test {
    public static void main(String[] args){
        MyTask task = new MyTask();
        T7MyThreadA threadA = new T7MyThreadA(task);
        T7MyThreadB threadB = new T7MyThreadB(task);
        threadA.setName("threadA");
        threadA.start();
        threadB.setName("threadB");
        threadB.start();
    }
}
