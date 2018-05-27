package com.multithread.code.chapter6.singleton2;

/**
 * @Description: 单例模式-懒汉模式 同步方式
 * @Author: leiyulin
 * @date: 2018/5/26
 */
public class SingleTon2Object {
    //立即加载方式-饿汉模式
    private static SingleTon2Object object;

    private SingleTon2Object() {
    }

    /**
     * get方法时，才实例化对象
     * 可能会造成多次实例化，与单例模式不符合
     * 需要做同步性操作
     * 使用synchronized关键字，对整个方法都上锁，效率太低。下一个线程需要访问此对象，需要上一个线程释放锁才可以继续进行
     *
     * @return
     */
//    public static synchronized SingleTon2Object getInstance() {
//        try {
//            if (null == object) {
//                Thread.sleep(1000);
//                object = new SingleTon2Object();
//            }
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        return object;
//    }
    public static SingleTon2Object getInstance() {
        try {
            synchronized (SingleTon2Object.class) {
                if (null == object) {
                    Thread.sleep(1000);
                    object = new SingleTon2Object();
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return object;
    }
}
