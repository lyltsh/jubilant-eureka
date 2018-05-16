package com.multithread.code.chapter3.badminton.thread;

import com.multithread.code.chapter3.badminton.entity.SportsmanA;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/5/15
 */
public class BattingThreadA implements Runnable {
    private SportsmanA sportsmanA;

    public BattingThreadA(SportsmanA sportsmanA) {
        this.sportsmanA = sportsmanA;
    }

    @Override
    public void run() {
        sportsmanA.batting();
    }
}
