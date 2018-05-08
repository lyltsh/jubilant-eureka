package com.multithread.code.chapter2.synNotExtends.extthread;

import com.multithread.code.chapter2.synNotExtends.service.SynNotExtendsSub;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/5/7
 */
public class SynNotExtendsMyThreadA extends Thread {
    private SynNotExtendsSub sub;

    public SynNotExtendsMyThreadA(SynNotExtendsSub sub) {
        this.sub = sub;
    }

    @Override
    public void run() {
//        super.run();
        sub.serviceMethod();
    }
}
