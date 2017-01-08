package com.niujiwei.concurrent;

import java.util.concurrent.CountDownLatch;

/**
 * Created by 90 on 2017/1/8.
 */
public class NetworkHealthChecker extends BaseHealthChecker{
    public NetworkHealthChecker(CountDownLatch countDownLatch, String serverName, boolean serverUp) {
        super(countDownLatch, serverName, serverUp);
    }

    @Override
    public void verifyService() {
        System.out.println("Checking " + this.getServerName());
        try
        {
            Thread.sleep(7000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        System.out.println(this.getServerName() + " is UP");
    }
}

