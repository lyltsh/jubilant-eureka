package com.multithread.code.chapter6.singleton3;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/5/26
 */
public class Singleton3Test {
    public static void main(String[] args) {
        Singleton3Thread thread1 = new Singleton3Thread();
        Singleton3Thread thread2 = new Singleton3Thread();
        Singleton3Thread thread3 = new Singleton3Thread();
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
