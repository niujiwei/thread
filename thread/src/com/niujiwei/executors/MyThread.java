package com.niujiwei.executors;

/**
 * Created by 90 on 2017/1/8.
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"正在执行。。。");
    }
}
