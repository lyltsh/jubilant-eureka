package com.multithread.code.chapter7.groupAddThread;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/5/27
 */
public class GroupAddThreadTest {
    public static void main(String[] args){
        GroupAddThreadA aRunnable = new GroupAddThreadA();
        GroupAddThreadB bRunnable = new GroupAddThreadB();

        ThreadGroup group = new ThreadGroup("threadGroup");

        Thread aThread = new Thread(group, aRunnable);
        Thread bThread = new Thread(group, bRunnable);
        aThread.start();
        bThread.start();

        System.out.println("activeCount: " + group.activeCount());
        System.out.println("groupName: " + group.getName());
    }
}
