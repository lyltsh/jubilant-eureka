package com.multithread.code.chapter2.t1;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/4/24
 */
public class T1ThreadB extends Thread {
    private HasSelfPrivateNum numRef;

    public T1ThreadB(HasSelfPrivateNum numRef) {
        super();
        this.numRef = numRef;
    }

    @Override
    public void run() {
        super.run();
        numRef.addI("b");
    }
}
