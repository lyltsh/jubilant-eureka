package com.multithread.code.chapter6.singleton3;

/**
 * @Description: 单例模式-同步方式
 * @Author: leiyulin
 * @date: 2018/5/26
 */
public class SingleTon3Object {
    //立即加载方式-饿汉模式
    private static SingleTon3Object object;

    private SingleTon3Object() {
    }

    public static SingleTon3Object getInstance() {
        try {
            if (null == object) {
                Thread.sleep(1000);
                //对关键部分代码做同步，但是也会出现线程安全问题，导致异常
                synchronized (SingleTon3Object.class) {
                    object = new SingleTon3Object();
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return object;
    }
}
