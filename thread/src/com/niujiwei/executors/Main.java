package com.niujiwei.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Created by 90 on 2017/1/8.
 */
public class Main {
    public static void main(String[] args){
       //ExecutorService pool = Executors.newFixedThreadPool(2);
        //ExecutorService pool = Executors.newSingleThreadExecutor();
       // ExecutorService pool = Executors.newCachedThreadPool();
        ScheduledExecutorService pool = Executors.newScheduledThreadPool(4);
        Thread thread1 = new MyThread();
        Thread thread2 = new MyThread();
        Thread thread3 = new MyThread();
        Thread thread4 = new MyThread();
        pool.schedule(thread4, 10, TimeUnit.MILLISECONDS);
        pool.schedule(thread3, 10, TimeUnit.MILLISECONDS);
        pool.execute(thread1);
        pool.execute(thread2);
       pool.execute(thread3);
        pool.execute(thread4);

        //关闭线程池
        pool.shutdown();

    }
}
