package com.multithread.code.chapter2.t3.extthread;

import com.multithread.code.chapter2.t3.entity.PublicVar;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/5/5
 */
public class T3Thread extends Thread {
    private PublicVar publicVar;

    public T3Thread(PublicVar publicVar) {
        super();
        this.publicVar = publicVar;
    }

    @Override
    public void run() {
        super.run();
        publicVar.setValue("B", "BB");
    }
}
