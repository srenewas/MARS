package com.seenu.MultiThreadding;

import org.springframework.scheduling.config.ScheduledTask;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExample {
    public static void main(String[] args) {
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(3);
        Runnable run = ()->System.out.println("Hello World: "+System.currentTimeMillis());
        // 1. Run task once after 3 seconds
        scheduler.schedule(run,3, TimeUnit.SECONDS);

        // 2. Run task repeatedly every 5 seconds after initial 2-second delay
        scheduler.scheduleAtFixedRate(run,2,5,TimeUnit.SECONDS);

        // 3. Run task repeatedly with 5 seconds between task END and next START
        // scheduler.scheduleWithFixedDelay(task, 2, 5, TimeUnit.SECONDS);

        // Stop the scheduler after 20 seconds
        Executors.newSingleThreadScheduledExecutor().schedule(() -> {
            System.out.println("Shutting down scheduler...");
            scheduler.shutdown();
        }, 20, TimeUnit.SECONDS);
    }
}
