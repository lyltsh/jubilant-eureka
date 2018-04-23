package com.multithread.code.chapter1.t11;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/4/23
 */
public class T11MythreadTest {
    public static void main(String[] args) {
        try {
            T11Mythread t11Mythread = new T11Mythread();
            t11Mythread.start();
            Thread.sleep(200);
            t11Mythread.interrupt();
            //System.out.println(Thread.interrupted());
            System.out.println(Thread.interrupted());
            System.out.println(t11Mythread.isInterrupted());
        } catch (InterruptedException e) {
            System.out.println("interrupted main");
            e.printStackTrace();
        }
        System.out.println("main end");
    }
}
