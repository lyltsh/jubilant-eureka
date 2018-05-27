package com.multithread.code.chapter6.singleton1;

/**
 * @Description: 单例模式-懒汉模式
 * @Author: leiyulin
 * @date: 2018/5/26
 */
public class SingleTon1Object {
    //立即加载方式-饿汉模式
    private static SingleTon1Object object;

    private SingleTon1Object() {
    }

    /**
     * get方法时，才实例化对象
     * 可能会造成多次实例化，与单例模式不符合
     * 需要做同步性操作
     * @return
     */
    public static SingleTon1Object getInstance() {
        if (null == object) {
            object = new SingleTon1Object();
        }
        return object;
    }
}
