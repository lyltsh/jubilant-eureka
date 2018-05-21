package com.multithread.code.chapter3.joinTest2;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/5/17
 */
public class JoinTest2 {
    public static void main(String[] args){
        try {
            JoinTestThread thread = new JoinTestThread();
            thread.start();
            thread.join();
            System.out.println("main thread");
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}
