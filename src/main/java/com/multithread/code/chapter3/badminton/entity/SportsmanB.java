package com.multithread.code.chapter3.badminton.entity;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/5/15
 */
public class SportsmanB {
    private String lock;

    public SportsmanB(String lock) {
        this.lock = lock;
    }

    public void batting(){
        try {
            synchronized (lock){
                System.out.println("value:"+BadmintonObject.value);
                while (!BallPossession.Sport_B.equals(BadmintonObject.value)){
                    System.out.println("球权在"+Thread.currentThread().getName()+", Waiting");
                    lock.wait();
                }
                System.out.println(Thread.currentThread().getName()+"击球, Runnable");
                BadmintonObject.value = BallPossession.Sport_B;
                lock.notifyAll();
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
