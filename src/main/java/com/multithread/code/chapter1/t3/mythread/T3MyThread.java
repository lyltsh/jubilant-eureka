package com.multithread.code.chapter1.t3.mythread;

/**
 * @Description: 线程之间变量不共享
 * @Author: leiyulin
 * @date: 2018/4/19
 */
public class T3MyThread extends Thread{
    public int count = 5;

    public T3MyThread(String name){
        super();
        this.setName(name);
    }
    @Override
    public void run(){
        super.run();
        while (count >0){
            --count;
            System.out.println("run by" + this.currentThread().getName()
                    + " , count= " + count);
        }
    }
}
