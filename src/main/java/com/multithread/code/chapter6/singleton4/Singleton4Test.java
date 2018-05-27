package com.multithread.code.chapter6.singleton4;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/5/26
 */
public class Singleton4Test {
    public static void main(String[] args) {
        Singleton4Thread thread1 = new Singleton4Thread();
        Singleton4Thread thread2 = new Singleton4Thread();
        Singleton4Thread thread3 = new Singleton4Thread();
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
