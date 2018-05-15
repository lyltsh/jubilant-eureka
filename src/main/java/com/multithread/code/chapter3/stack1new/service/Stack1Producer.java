package com.multithread.code.chapter3.stack1new.service;

import com.multithread.code.chapter3.stack1new.entity.Stack1MyStack;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/5/15
 */
public class Stack1Producer {
    private Stack1MyStack myStack;

    public Stack1Producer(Stack1MyStack myStack){
        this.myStack = myStack;
    }

    public void pushService(){
        myStack.push();
    }
}
