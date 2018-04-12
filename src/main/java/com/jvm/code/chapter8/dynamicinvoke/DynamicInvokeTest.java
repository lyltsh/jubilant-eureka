package com.jvm.code.chapter8.dynamicinvoke;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/4/12
 */
public class DynamicInvokeTest {

    public static class GrandFather {
        void thinking() {
            System.out.println("i am grandfather");
        }
    }

    public static class Father extends GrandFather {
        void thinking() {
            System.out.println("i am father");
        }
    }

    public static class Son extends Father {

        void thinking() {
            // 请读者在这里填入适当的代码（不能修改其他地方的代码）
            // 实现调用祖父类的thinking()方法，打印"i am grandfather"
            System.out.println("i am son");
        }
    }

    public static void main(String[] args) {
        GrandFather gf = new Son();
        gf.thinking();
    }
}
