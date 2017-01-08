package com.niujiwei.synthread;

/**
 * Created by 90 on 2017/1/7.
 */
public class Foo {
    private int x = 100;

    public int getX() {
        return x;
    }

    public  int fix(int y,String name) throws InterruptedException {
            System.out.println("线程名前"+name+"--------------"+x);
            Thread.sleep(1000);
            x = x-y;
            System.out.println("线程名后"+name+"--------------"+x);
            return x;
    }
}
