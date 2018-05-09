package com.multithread.code.chapter2.synNotExtends;

import com.multithread.code.chapter2.synNotExtends.extthread.SynNotExtendsMyThreadA;
import com.multithread.code.chapter2.synNotExtends.extthread.SynNotExtendsMyThreadB;
import com.multithread.code.chapter2.synNotExtends.service.SynNotExtendsSub;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/5/7
 */
public class SynNoExtendsTest {
    public static void main(String[] args){
        SynNotExtendsSub sub = new SynNotExtendsSub();
        SynNotExtendsMyThreadA threadA = new SynNotExtendsMyThreadA(sub);
        SynNotExtendsMyThreadB threadB = new SynNotExtendsMyThreadB(sub);
        threadA.setName("threadA");
        threadA.start();
        threadB.setName("threadB");
        threadB.start();
    }
}
