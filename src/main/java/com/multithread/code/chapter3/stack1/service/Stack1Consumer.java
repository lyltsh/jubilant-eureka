package com.multithread.code.chapter3.stack1.service;

import com.multithread.code.chapter3.stack1.entity.Stack1MyStack;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/5/15
 */
public class Stack1Consumer {
    private Stack1MyStack myStack;

    public Stack1Consumer(Stack1MyStack myStack){
        this.myStack = myStack;
    }

    public void popService(){
        myStack.pop();
    }
}
