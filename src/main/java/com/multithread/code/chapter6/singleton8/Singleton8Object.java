package com.multithread.code.chapter6.singleton8;

/**
 * @Description: 单例模式-使用静态
 * @Author: leiyulin
 * @date: 2018/5/27
 */
public class Singleton8Object {
    private Singleton8Object() {
    }

    private static Singleton8Object object;

    static {
        object = new Singleton8Object();
    }

    public static Singleton8Object getInstance(){
        return object;
    }
}
