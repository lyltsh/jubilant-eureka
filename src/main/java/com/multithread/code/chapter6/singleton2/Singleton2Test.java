package com.multithread.code.chapter6.singleton2;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/5/26
 */
public class Singleton2Test {
    public static void main(String[] args) {
        Singleton2Thread thread1 = new Singleton2Thread();
        Singleton2Thread thread2 = new Singleton2Thread();
        Singleton2Thread thread3 = new Singleton2Thread();
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
