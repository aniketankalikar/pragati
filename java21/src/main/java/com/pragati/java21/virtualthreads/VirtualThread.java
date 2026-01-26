package com.pragati.java21.virtualthreads;

import java.util.ArrayList;
import java.util.List;

public class VirtualThread {

    public static void main(String[] args)
    {
       int count = 10;
       List<Thread> threads = new ArrayList<>();

       for(int i=0;i<count;i++)
       {
           int idx = i; // capture index for naming
           Thread thread = Thread.ofVirtual()
                   .name("vt-" + idx)
                   .start(() -> {
                       try {
                           // Small sleep to simulate work/stagger output
                           Thread.sleep(2000);
                       } catch (InterruptedException e) {
                           Thread.currentThread().interrupt();
                       }
                       Thread t = Thread.currentThread();
                       System.out.println("Thread Name : " + t.getName() + ", id=" + t.threadId());
                   });
           threads.add(thread);
       }

       // Wait for all virtual threads to complete before exiting main
       for (Thread t : threads) {
           try {
               t.join();
           } catch (InterruptedException e) {
               Thread.currentThread().interrupt();
           }
       }
    }
}
