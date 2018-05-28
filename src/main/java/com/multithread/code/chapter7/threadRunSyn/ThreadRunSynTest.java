package com.multithread.code.chapter7.threadRunSyn;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/5/28
 */
public class ThreadRunSynTest {
    public static void main(String[] args){
        Object lock = new Object();
        ThreadRunSynThread threadA = new ThreadRunSynThread(lock, "A",1);
        ThreadRunSynThread threadB = new ThreadRunSynThread(lock, "B",2);
        ThreadRunSynThread threadC = new ThreadRunSynThread(lock, "C",0);

        threadA.start();
        threadB.start();
        threadC.start();
    }
}
