package com.jvm.code.chapter8;

/**
 * @Description: 静态方法解析
 * @Author: leiyulin
 * @date: 2018/4/11
 */
public class StaticResolution {
    public static void sayHello() {
        System.out.println("hello world");
    }

    public static void main(String[] args) {
        StaticResolution.sayHello();
    }

    private final void getName(){
        System.out.println("test");
    }
}
