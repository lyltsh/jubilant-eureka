package com.multithread.code.chapter3.stack1;

import com.multithread.code.chapter3.stack1.entity.Stack1MyStack;
import com.multithread.code.chapter3.stack1.service.Stack1Consumer;
import com.multithread.code.chapter3.stack1.service.Stack1Producer;
import com.multithread.code.chapter3.stack1.thread.Stack1ThreadC;
import com.multithread.code.chapter3.stack1.thread.Stack1ThreadP;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/5/15
 */
public class Stack1Test {
    public static void main(String[] args){
        Stack1MyStack myStack = new Stack1MyStack();
        Stack1Consumer consumer = new Stack1Consumer(myStack);
        Stack1Producer producer = new Stack1Producer(myStack);

        Stack1ThreadP threadP = new Stack1ThreadP(producer);
        threadP.setName("threadP");
        Stack1ThreadC threadC = new Stack1ThreadC(consumer);
        threadC.setName("threadC");

        threadP.start();
        threadC.start();
    }
}
