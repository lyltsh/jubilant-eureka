package com.multithread.code.chapter2.synchronizedOneThreadIn;

import com.multithread.code.chapter2.synchronizedOneThreadIn.mythread.SynOneThreadA;
import com.multithread.code.chapter2.synchronizedOneThreadIn.mythread.SynOneThreadB;
import com.multithread.code.chapter2.synchronizedOneThreadIn.service.ObjectService;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/5/8
 */
public class SynOneThreadTest {
    public static void main(String[] args){
        ObjectService objectService = new ObjectService();
        SynOneThreadA threadA = new SynOneThreadA(objectService);
        SynOneThreadB threadB = new SynOneThreadB(objectService);
        threadA.setName("threadA");
        threadA.start();
        threadB.setName("threadB");
        threadB.start();
    }
}
