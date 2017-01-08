package com.niujiwei.synthread;

import java.util.concurrent.CountDownLatch;

/**
 * Created by 90 on 2017/1/7.
 */
public class MyRunable implements Runnable {
     private  Foo foo;

    public MyRunable(Foo foo) {
        this.foo = foo;
    }

    public static void main(String[] args) throws InterruptedException {

        MyRunable myRunable = new MyRunable(new Foo());
        for (int i=0;i<3;i++){
            Thread threadA = new Thread(myRunable, "Thread"+i);
            threadA.start();
        }



    }

    @Override
    public void run() {

        try {
            foo.fix(1,Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
    }



