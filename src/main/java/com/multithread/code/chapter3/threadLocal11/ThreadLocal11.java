package com.multithread.code.chapter3.threadLocal11;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/5/19
 */
public class ThreadLocal11 {
    public static ThreadLocal t1 = new ThreadLocal();
    public static void main(String[] args){
        if(null == t1.get()){
            System.out.println("there is no value");
            t1.set("the value");
        }
        System.out.println(t1.get());
        System.out.println(t1.get());
    }
}
