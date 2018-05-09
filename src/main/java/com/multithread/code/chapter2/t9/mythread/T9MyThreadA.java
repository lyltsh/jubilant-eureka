package com.multithread.code.chapter2.t9.mythread;

import com.multithread.code.chapter2.t9.mylist.MyOneList;
import com.multithread.code.chapter2.t9.myservice.T9Service;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/5/9
 */
public class T9MyThreadA extends Thread {
    private MyOneList myOneList;

    public T9MyThreadA(MyOneList myOneList) {
        this.myOneList = myOneList;
    }

    @Override
    public void run() {
        super.run();
        T9Service service = new T9Service();
        service.addServiceMethod(myOneList, "A");
    }
}
