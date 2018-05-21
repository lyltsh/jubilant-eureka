package com.multithread.code.chapter4.ConditionTestMany;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/5/21
 */
public class ConditionService {
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();
    private boolean hasValue = false;

    public void set() {
        try {
            lock.lock();
            while (true == hasValue){
                System.out.println("many true");
                condition.await();
            }
            System.out.println("print false");
            hasValue = true;
            condition.signalAll();
        }catch (InterruptedException e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

    public void get(){
        try{
            lock.lock();
            while(false == hasValue){
                System.out.println("many false");
                condition.await();
            }
            System.out.println("print true");
            hasValue = false;
            condition.signalAll();
        }catch (InterruptedException e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
}
