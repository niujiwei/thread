package com.niujiwei.notfiy;

/**
 * Created by 90 on 2017/1/8.
 */
public class ThreadA {
    public static void main(String[] args) {
        ThreadB threadB = new ThreadB();
        threadB.start();
        synchronized (threadB) {
            try {
                threadB.wait();
                System.out.println("等待对象b完成计算。。。");
                //当前线程A等待
                System.out.println("等待结束");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("b对象计算的总和是：" + threadB.total);
        }
    }
}

