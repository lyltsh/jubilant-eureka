package com.multithread.code.chapter2.synOutAsyn;

import com.multithread.code.chapter2.synOutAsyn.mylist.MyList;
import com.multithread.code.chapter2.synOutAsyn.mythread.SynOutAsynThreadA;
import com.multithread.code.chapter2.synOutAsyn.mythread.SynOutAsynThreadB;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/5/9
 */
public class SynOutAsynTest {
    public static void main(String[] args){
        MyList myList = new MyList();
        SynOutAsynThreadA threadA = new SynOutAsynThreadA(myList);
        SynOutAsynThreadB threadB = new SynOutAsynThreadB(myList);
        threadA.setName("threadA");
        threadA.start();
        threadB.setName("threadB");
        threadB.start();
    }
}
