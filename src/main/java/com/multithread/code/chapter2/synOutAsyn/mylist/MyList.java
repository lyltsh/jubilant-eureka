package com.multithread.code.chapter2.synOutAsyn.mylist;

import java.util.ArrayList;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/5/9
 */
public class MyList {
    private ArrayList list = new ArrayList();

    synchronized public void add(String username) {
        System.out.println("ThreadName= " + Thread.currentThread().getName()
                + " execute add method");
        list.add(username);
        System.out.println("ThreadName=" + Thread.currentThread().getName()
                + " end add method");
    }

    synchronized public int getSize() {
        System.out.println("ThreadName=" + Thread.currentThread().getName()
                + " execute size method");
        int sizeValue = list.size();
        System.out.println("ThreadName=" + Thread.currentThread().getName()
                + " end size method");
        return sizeValue;
    }

}
