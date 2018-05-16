package com.multithread.code.chapter3.badminton.entity;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/5/15
 */
public class SportsmanA {
    private String lock;

    public SportsmanA(String lock) {
        this.lock = lock;
    }

    public void batting(){
        try{
            synchronized (lock){
                System.out.println("value:"+BadmintonObject.value);
                while (!BallPossession.Sport_A.equals(BadmintonObject.value)){
                    System.out.println("球权在"+Thread.currentThread().getName()+", Waiting");
                    lock.wait();
                }
                System.out.println(Thread.currentThread().getName()+"击球, Runnable");
                BadmintonObject.value = BallPossession.Sport_A;
                lock.notifyAll();
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
