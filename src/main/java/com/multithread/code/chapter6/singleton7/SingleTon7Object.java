package com.multithread.code.chapter6.singleton7;

/**
 * @Description: 单例模式-使用内部类的方式
 * @Author: leiyulin
 * @date: 2018/5/26
 */
public class SingleTon7Object {
    private static class SingletonHandler{
        private static SingleTon7Object object = new SingleTon7Object();
    }

    private SingleTon7Object() {
    }

    /**
     * 类似于饿汉模式，在使用之前已经实例化对象。
     * 好处是，可以使用其他实例变量，保证了线程安全性
     * @return
     */
    public static SingleTon7Object getInstance() {
        return SingletonHandler.object;
    }
}
