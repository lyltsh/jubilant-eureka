package com.multithread.code.chapter6.singleton4;

/**
 * @Description: 单例模式-同步方式
 * @Author: leiyulin
 * @date: 2018/5/26
 */
public class SingleTon4Object {
    //立即加载方式-饿汉模式
    private static SingleTon4Object object;

    private SingleTon4Object() {
    }

    /**
     * 使用双重检查模式来解决问题
     * 既保证了非同步代码异步执行，提高了效率
     * 又保证了单例模式的效果，关键代码同步的，线程安全
     * @return
     */
    public static SingleTon4Object getInstance() {
        try {
            if (null == object) {
                synchronized (SingleTon4Object.class) {
                    if (null == object) {
                        Thread.sleep(1000);

                        object = new SingleTon4Object();
                    }
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return object;
    }
}
