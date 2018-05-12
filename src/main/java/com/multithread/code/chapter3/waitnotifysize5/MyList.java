package com.multithread.code.chapter3.waitnotifysize5;

import java.util.ArrayList;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/5/12
 */
public class MyList {
    private static ArrayList list = new ArrayList();
    public static void add(){
        list.add("anyString");
    }
    public static int size(){
        return list.size();
    }
}
