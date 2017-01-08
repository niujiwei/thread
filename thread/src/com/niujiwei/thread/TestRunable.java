package com.niujiwei.thread;

/**
 * Created by 90 on 2016/12/31.
 */
public class TestRunable {
    public static void main(String[] args) throws InterruptedException {
        Thread thread =  new Thread(new MyRunable("王五"));

        thread.start();
        thread.join();
        new Thread(new MyRunable("张三")).start();
        new Thread(new MyRunable("李四")).start();



    }
}
