package com.multithread.code.chapter1.currentThreadExt;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/4/20
 */
public class CountOperateTest {
    public static void main(String[] args) {
        CountOperate c = new CountOperate();
        Thread t1 = new Thread(c);
        t1.setName("A");
        t1.start();
    }
}
