package com.multithread.code.chapter3.PRTest.entity;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/5/13
 */
public class PRConsumer {
    private String lock;

    public PRConsumer(String lock) {
        super();
        this.lock = lock;
    }

    public void getValue(){
        try{
            synchronized (lock){
                if(ValueObject.value.equals("")){
                    lock.wait();
                }
                System.out.println("get value is: " + ValueObject.value);
                ValueObject.value = "";
                lock.notify();
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
