package com.multithread.code.chapter1.t8.mythread;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/4/22
 */
public class T8MythreadRun2 {
    public static void main(String[] args) {
        T8Mythread2 mythread = new T8Mythread2();
        System.out.println("begin =" + System.currentTimeMillis());
        mythread.start();
        System.out.println("end =" + System.currentTimeMillis());
    }
}
