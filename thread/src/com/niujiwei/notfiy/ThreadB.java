package com.niujiwei.notfiy;

/**
 * Created by 90 on 2017/1/8.
 */
public class ThreadB extends Thread {
    int total;
    @Override
    public void run(){
        synchronized (this) {
            for (int i = 0; i < 101; i++) {
                total += i;
            }
            //（完成计算了）唤醒在此对象监视器上等待的单个线程，在本例中线程A被唤醒
           notify();
        }
    }

}
