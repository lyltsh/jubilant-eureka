package com.multithread.code.chapter2.synOutAsyn.mythread;

import com.multithread.code.chapter2.synOutAsyn.mylist.MyList;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/5/9
 */
public class SynOutAsynThreadB extends Thread {
    private MyList myList;

    public SynOutAsynThreadB(MyList myList) {
        this.myList = myList;
    }

    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 1000; i++) {
            myList.add("threadA" + (i + 1));
        }
    }
}
