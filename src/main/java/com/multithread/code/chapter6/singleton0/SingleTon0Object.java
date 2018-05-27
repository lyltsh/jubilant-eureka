package com.multithread.code.chapter6.singleton0;

/**
 * @Description: 单例模式-饿汉模式
 * @Author: leiyulin
 * @date: 2018/5/26
 */
public class SingleTon0Object {
    //立即加载方式-饿汉模式
    private static SingleTon0Object object = new SingleTon0Object();

    private SingleTon0Object() {
    }


    /**
     * 立即加载模式
     * 缺点：getInstance方法没有同步，不能有其他实例，否则会出现非线程安全问题
     *
     * @return
     */
    public static SingleTon0Object getInstance() {
        return object;
    }
}
