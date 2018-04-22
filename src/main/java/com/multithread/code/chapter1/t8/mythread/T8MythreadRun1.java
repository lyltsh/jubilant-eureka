package com.multithread.code.chapter1.t8.mythread;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/4/22
 */
public class T8MythreadRun1 {
    public static void main(String[] args) {
        T8Mythread1 mythread = new T8Mythread1();
        System.out.println("begin =" + System.currentTimeMillis());
        mythread.run();
        System.out.println("end   =" + System.currentTimeMillis());
    }
}
