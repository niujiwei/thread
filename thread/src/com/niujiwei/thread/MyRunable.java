package com.niujiwei.thread;

/**
 * Created by 90 on 2016/12/31.
 */
public class MyRunable implements Runnable {
    private String username;

    public MyRunable(String username) {
        this.username = username;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {


            System.out.println("线程名" + username + "睡眠" + i);
            Thread.yield();

            for (long k = 0; k < 100000000; k++) ;
            System.out.println(username + ": " + i);
        }
    }
}

