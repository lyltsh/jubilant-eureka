package com.multithread.code.chapter6.singleton7_1;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * @Description: 单例模式-使用内部类的方式
 * @Author: leiyulin
 * @date: 2018/5/26
 */
public class SingleTon7Object implements Serializable{
    private static final long serialVersionUID = 1L;
    private static class SingletonHandler{
        private static SingleTon7Object object = new SingleTon7Object();
    }

    private SingleTon7Object() {
    }

    public static SingleTon7Object getInstance() {
        return SingletonHandler.object;
    }

    /**
     * readResolve方法，解决反序列化问题
     * ref:https://www.javalobby.org//java/forums/t17491.html
     * @return
     * @throws ObjectStreamException
     */
    protected Object readResolve() throws ObjectStreamException {
        System.out.println("readResolve method");
        return SingletonHandler.object;
    }
}
