package com.multithread.code.chapter2.t16;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/5/11
 */
public class T16Test {
    public static void main(String[] args){
        try{
            T16Thread thread = new T16Thread();
            thread.start();
            Thread.sleep(10);
            thread.setRunning(false);
            System.out.println("set running false");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
