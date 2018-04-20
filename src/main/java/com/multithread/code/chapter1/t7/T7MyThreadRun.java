package com.multithread.code.chapter1.t7;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/4/20
 */
public class T7MyThreadRun {
    public static void main(String[] args) throws InterruptedException {
        T7MyThread t7MyThread = new T7MyThread();
        System.out.println("begin="+t7MyThread.isAlive());
        t7MyThread.start();
        //Thread.sleep(1000);
        System.out.println("end="+t7MyThread.isAlive());
    }
}
