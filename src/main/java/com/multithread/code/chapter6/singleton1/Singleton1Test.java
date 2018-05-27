package com.multithread.code.chapter6.singleton1;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/5/26
 */
public class Singleton1Test {
    public static void main(String[] args) {
        Singleton1Thread thread1 = new Singleton1Thread();
        Singleton1Thread thread2 = new Singleton1Thread();
        Singleton1Thread thread3 = new Singleton1Thread();
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
