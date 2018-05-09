package com.multithread.code.chapter2.synBlockString;

import com.multithread.code.chapter2.synBlockString.mythread.SynBlockThreadA;
import com.multithread.code.chapter2.synBlockString.mythread.SynBlockThreadB;
import com.multithread.code.chapter2.synBlockString.service.SynBlockService;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/5/9
 */
public class SynBlockTest {
    public static void main(String[] args){
        SynBlockService blockService = new SynBlockService();
        SynBlockThreadA threadA = new SynBlockThreadA(blockService);
        SynBlockThreadB threadB = new SynBlockThreadB(blockService);
        threadA.setName("threadA");
        threadA.start();
        threadB.setName("threadB");
        threadB.start();
    }
}
