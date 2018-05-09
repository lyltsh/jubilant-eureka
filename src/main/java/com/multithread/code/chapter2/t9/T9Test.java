package com.multithread.code.chapter2.t9;

import com.multithread.code.chapter2.t9.mylist.MyOneList;
import com.multithread.code.chapter2.t9.mythread.T9MyThreadA;
import com.multithread.code.chapter2.t9.mythread.T9MyThreadB;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/5/9
 */
public class T9Test {
    public static void main(String[] args) throws InterruptedException {
        MyOneList myOneList = new MyOneList();
        T9MyThreadA threadA = new T9MyThreadA(myOneList);
        threadA.setName("threadA");
        threadA.start();
        T9MyThreadB threadB = new T9MyThreadB(myOneList);
        threadB.setName("threadB");
        threadB.start();
        Thread.sleep(2000);
        System.out.println(myOneList.getSize());
    }
}
