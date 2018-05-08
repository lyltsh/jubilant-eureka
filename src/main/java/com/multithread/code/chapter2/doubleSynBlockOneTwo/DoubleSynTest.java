package com.multithread.code.chapter2.doubleSynBlockOneTwo;

import com.multithread.code.chapter2.doubleSynBlockOneTwo.mythread.DoubleSynThreadA;
import com.multithread.code.chapter2.doubleSynBlockOneTwo.mythread.DoubleSynThreadB;
import com.multithread.code.chapter2.doubleSynBlockOneTwo.service.ObjectService;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/5/8
 */
public class DoubleSynTest {
    public static void main(String[] args){
        ObjectService objectService = new ObjectService();
        DoubleSynThreadA threadA = new DoubleSynThreadA(objectService);
        threadA.setName("threadA");
        threadA.start();
        DoubleSynThreadB threadB = new DoubleSynThreadB(objectService);
        threadB.setName("threadB");
        threadB.start();
    }
}
