package com.jvm.code.chapter7.code;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/4/11
 */
public class StaticBlock {
    /**
     * 父类定义的静态语句块要优先于子类的变量赋值操作
     */
    static class Parent {
        public static int A = 1;
        static {
            A = 2;
        }
    }

    static class Sub extends Parent {
        public static int B = A;
    }

    public static void main(String[] args) {
        System.out.println(Sub.B);
    }
}
