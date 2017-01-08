package com.niujiwei.lockRisk;

/**
 * Created by 90 on 2017/1/8.
 */
public class Main {
    public static void main(String[] args) {
        DeadlockRisk dead = new DeadlockRisk();
        MyThread t1 = new MyThread(dead, 1, 2);
        MyThread t2 = new MyThread(dead, 3, 4);
        MyThread t3 = new MyThread(dead, 5, 6);
        MyThread t4 = new MyThread(dead, 7, 8);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
