package com.multithread.code.chapter3.badminton;

import com.multithread.code.chapter3.badminton.entity.SportsmanA;
import com.multithread.code.chapter3.badminton.entity.SportsmanB;
import com.multithread.code.chapter3.badminton.thread.BattingThreadA;
import com.multithread.code.chapter3.badminton.thread.BattingThreadB;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/5/15
 */
public class BabmintonTest {
    public static void main(String[] args) throws InterruptedException {
        String lock = new String("");
        SportsmanA sportsmanA = new SportsmanA(lock);
        SportsmanB sportsmanB = new SportsmanB(lock);

        Thread threadA = new Thread(new BattingThreadA(sportsmanA));
        threadA.setName("Sportman-A");
        Thread threadB = new Thread(new BattingThreadB(sportsmanB));
        threadB.setName("Sportman-B");

        threadA.start();
        threadB.start();

        Thread.sleep(1000);
        System.out.println(threadA.getName() + " " + threadA.getState());
        System.out.println(threadB.getName() + " " + threadB.getState());
    }
}
