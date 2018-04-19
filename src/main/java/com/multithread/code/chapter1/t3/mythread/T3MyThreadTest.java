package com.multithread.code.chapter1.t3.mythread;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/4/19
 */
public class T3MyThreadTest {
    public static void main(String[] args){
        T3MyThread threadA = new T3MyThread("A");
        T3MyThread threadB = new T3MyThread("B");
        T3MyThread threadC = new T3MyThread("C");
        threadA.start();
        threadB.start();
        threadC.start();
    }
}
