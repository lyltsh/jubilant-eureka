package com.multithread.code.chapter4.ConditionTestMany;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/5/21
 */
public class ConditionTest {
    public static void main(String[] args) {
        ConditionService service = new ConditionService();
        ConditionThreadA[] threadA = new ConditionThreadA[10];
        ConditionThreadB[] threadB = new ConditionThreadB[10];
        for(int i = 0; i<10; i++){
            threadA[i] = new ConditionThreadA(service);
            threadB[i] = new ConditionThreadB(service);
            threadA[i].start();
            threadB[i].start();
        }
    }
}
