package com.multithread.code.chapter4.ConditionTest;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/5/21
 */
public class ConditionTest {
    public static void main(String[] args) {
        ConditionService service = new ConditionService();
        ConditionThreadA threadA = new ConditionThreadA(service);
        ConditionThreadB threadB = new ConditionThreadB(service);
        threadA.start();
        threadB.start();
    }
}
