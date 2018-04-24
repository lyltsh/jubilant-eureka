package com.multithread.code.chapter2.t1;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/4/24
 */
public class HasSelfPrivateNumTest {
    public static void main(String[] args) {

        HasSelfPrivateNum numRef1 = new HasSelfPrivateNum();
        HasSelfPrivateNum numRef2 = new HasSelfPrivateNum();
        T1ThreadA athread = new T1ThreadA(numRef1);
        athread.start();

        T1ThreadB bthread = new T1ThreadB(numRef2);
        bthread.start();

    }
}
