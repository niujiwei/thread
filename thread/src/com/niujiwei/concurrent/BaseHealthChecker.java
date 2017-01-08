package com.niujiwei.concurrent;

import java.util.concurrent.CountDownLatch;

/**
 * Created by 90 on 2017/1/8.
 */
public abstract class BaseHealthChecker implements Runnable {
    private CountDownLatch countDownLatch;
    private String serverName;
    private boolean serverUp;

    public BaseHealthChecker(CountDownLatch countDownLatch, String serverName, boolean serverUp) {
        this.countDownLatch = countDownLatch;
        this.serverName = serverName;
        this.serverUp = serverUp;
    }
    public String getServerName(){
        return serverName;
    }
    public boolean isServerUp(){
        return serverUp;
    }
    public abstract void verifyService();
    @Override
    public void run() {
       try {
           verifyService();
           serverUp = true;
       }catch (Throwable throwable){
           throwable.printStackTrace(System.err);
           serverUp = false;

       }finally {
           if(countDownLatch!=null){
               countDownLatch.countDown();
           }
       }
    }
}
