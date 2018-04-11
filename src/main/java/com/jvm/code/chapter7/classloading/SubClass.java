package com.jvm.code.chapter7.classloading;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/4/11
 */
public class SubClass extends SuperClass {

    static {
        System.out.println("SubClass init!");
    }
}