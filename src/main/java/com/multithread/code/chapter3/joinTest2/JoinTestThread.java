package com.multithread.code.chapter3.joinTest2;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/5/17
 */
public class JoinTestThread extends Thread {
    @Override
    public void run(){
        try {
            int secondValue = (int) (Math.random() * 10000);
            System.out.println(secondValue);
            Thread.sleep(secondValue);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
