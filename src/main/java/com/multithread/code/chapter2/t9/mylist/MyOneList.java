package com.multithread.code.chapter2.t9.mylist;

import java.util.ArrayList;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/5/9
 */
public class MyOneList {
    private ArrayList list = new ArrayList();

    synchronized public void add(String data){
        list.add(data);
    }
    synchronized public int getSize(){
        return list.size();
    }
}
