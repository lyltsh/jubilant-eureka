package com.multithread.code.chapter3.test1;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/5/12
 */
public class Test1 {
    public static void main(String[] args){
        try{
            String newString = new String ("");
            newString.wait();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
