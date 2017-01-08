package com.niujiwei.lockRisk;

/**
 * Created by 90 on 2017/1/8.
 */
public class MyThread extends Thread {
    private DeadlockRisk dead;
    private int a, b;


    MyThread(DeadlockRisk dead, int a, int b) {
        this.dead = dead;
        this.a = a;
        this.b = b;
    }

    @Override
    public void run() {
        dead.read();
        dead.write(a, b);
    }
}
