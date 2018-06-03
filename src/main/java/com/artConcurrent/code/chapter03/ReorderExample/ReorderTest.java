package com.artConcurrent.code.chapter03.ReorderExample;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/6/2
 */
public class ReorderTest {
    public static void main(String[] args){
        ReorderExample example = new ReorderExample();
        ReorderThreadA threadA = new ReorderThreadA(example);
        ReorderThreadB threadB = new ReorderThreadB(example);
        threadA.start();
        threadB.start();

        List<Thread> threads = new ArrayList<>();
        for(int j=0; j<40; j++){
            threads.add(new ReorderThreadA(example));
            threads.add(new ReorderThreadB(example));
        }
        for(int j=0; j<threads.size(); j++){
            threads.get(j).start();
        }
    }
}
