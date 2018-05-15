package com.multithread.code.chapter3.stack1new;

import com.multithread.code.chapter3.stack1new.entity.Stack1MyStack;
import com.multithread.code.chapter3.stack1new.service.Stack1Consumer;
import com.multithread.code.chapter3.stack1new.service.Stack1Producer;
import com.multithread.code.chapter3.stack1new.thread.Stack1ThreadC;
import com.multithread.code.chapter3.stack1new.thread.Stack1ThreadP;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/5/15
 */
public class Stack1Test {
    public static void main(String[] args){
        Stack1MyStack myStack = new Stack1MyStack();
        Stack1Producer producer = new Stack1Producer(myStack);

        Stack1ThreadP threadP = new Stack1ThreadP(producer);
        threadP.setName("threadP");

        Stack1Consumer C1 = new Stack1Consumer(myStack);
        Stack1ThreadC threadC1 = new Stack1ThreadC(C1);
        Stack1Consumer C2 = new Stack1Consumer(myStack);
        Stack1ThreadC threadC2 = new Stack1ThreadC(C2);
        Stack1Consumer C3 = new Stack1Consumer(myStack);
        Stack1ThreadC threadC3 = new Stack1ThreadC(C3);

        threadP.start();
        threadC1.start();
        threadC2.start();
        threadC3.start();
    }
}
