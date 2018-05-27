package com.multithread.code.chapter6.singleton8;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/5/27
 */
public class Singleton8Test {
    public static void main(String[] args){
        Singleton8Thread thread1 = new Singleton8Thread();
        Singleton8Thread thread2 = new Singleton8Thread();
        Singleton8Thread thread3 = new Singleton8Thread();
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
