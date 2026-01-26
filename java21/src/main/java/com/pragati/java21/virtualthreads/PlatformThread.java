package com.pragati.java21.virtualthreads;

public class PlatformThread {

    public static void main(String args[])
    {
        int count = 1000;
        for(int i=0;i<count;i++)
        {
            new Thread(() -> {
                try {
                    // Small sleep to simulate work and stagger outputs
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
                System.out.println("Thread Name: " + Thread.currentThread().getName());
            }).start();

        }
        // Give threads some time to run before main potentially exits
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
