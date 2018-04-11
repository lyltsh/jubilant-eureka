package com.jvm.code.chapter7.classloading;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/4/11
 */
/**
 * 非主动使用类字段演示
 **/
public class NotInitialization {

    public static void main(String[] args) {
        System.out.println(SubClass.value);
    }

}