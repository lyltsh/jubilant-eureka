package com.multithread.code.chapter2.synBlockString2.mythread;

import com.multithread.code.chapter2.synBlockString2.service.SynBlockService;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/5/9
 */
public class SynBlockThreadB extends Thread {
    private SynBlockService blockService;

    public SynBlockThreadB(SynBlockService blockService) {
        this.blockService = blockService;
    }

    @Override
    public void run() {
        super.run();
        blockService.b();
    }
}
