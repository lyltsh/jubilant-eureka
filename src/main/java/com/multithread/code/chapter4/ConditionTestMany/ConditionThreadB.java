package com.multithread.code.chapter4.ConditionTestMany;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/5/21
 */
public class ConditionThreadB extends Thread {
    private ConditionService service;

    public ConditionThreadB(ConditionService service) {
        this.service = service;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            service.get();
        }
    }
}
