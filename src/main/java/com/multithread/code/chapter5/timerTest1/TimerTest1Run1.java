package com.multithread.code.chapter5.timerTest1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/5/24
 */
public class TimerTest1Run1 {
    public static Timer timer = new Timer(true);

    public static class MyTask extends TimerTask{

        @Override
        public void run() {
            System.out.println("运行了！时间为："+new Date());
        }
    }

    public static void main(String[] args) throws ParseException {
        MyTask task = new MyTask();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
        String dateString = "2018-05-24 21:46:00";

        Date dateRef = sdf.parse(dateString);
        System.out.println("字符串时间：" + dateRef + " 当前时间："
                + new Date());
        timer.schedule(task, dateRef);
    }
}
