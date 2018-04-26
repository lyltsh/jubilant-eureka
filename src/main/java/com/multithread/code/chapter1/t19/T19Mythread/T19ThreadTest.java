package com.multithread.code.chapter1.t19.T19Mythread;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/4/24
 */
public class T19ThreadTest {
    public static void main(String[] args){
        for (int i = 0; i < 5; i++) {
            T19Mythread1 thread1 = new T19Mythread1();
            thread1.setPriority(1);
            thread1.start();

            T19Mythread2 thread2 = new T19Mythread2();
            thread2.setPriority(10);
            thread2.start();
        }
    }
}
