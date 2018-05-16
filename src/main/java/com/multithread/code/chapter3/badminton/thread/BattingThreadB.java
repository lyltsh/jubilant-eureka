package com.multithread.code.chapter3.badminton.thread;

import com.multithread.code.chapter3.badminton.entity.SportsmanB;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/5/15
 */
public class BattingThreadB implements Runnable {
    private SportsmanB sportsmanB;

    public BattingThreadB(SportsmanB sportsmanB) {
        this.sportsmanB = sportsmanB;
    }

    @Override
    public void run() {
        sportsmanB.batting();
    }
}
