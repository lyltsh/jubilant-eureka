package com.jvm.code.chapter7.classloading;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/4/11
 */
/**
 * 被动使用类字段演示三：
 * 常量在编译阶段会存入调用类的常量池中，本质上并没有引用到定义常量的类，因此不会触发定义常量的类的初始化
 **/

public class ConstClass {
    static {
        System.out.println("ConstClass init!");
    }
    public static final String HELLOWORLD = "hello world";
}
