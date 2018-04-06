package com.jvm.code.chapter2;

/**
 * @Description: VM Args：-Xss128k
 * 设置栈容量 128k
 * @Author: leiyulin
 * @date: 2018/4/5
 */
public class JavaVMStackSOF {
    private int stackLength = 1;

    public void stackLeak() {
        stackLength++;
        stackLeak();
    }

    public static void main(String[] args) throws Throwable {
        JavaVMStackSOF oom = new JavaVMStackSOF();
        try {
            oom.stackLeak();
        } catch (Throwable e) {
            System.out.println("stack length:" + oom.stackLength);
            throw e;
        }
    }
}
