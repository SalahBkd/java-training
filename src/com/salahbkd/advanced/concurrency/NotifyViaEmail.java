package com.salahbkd.advanced.concurrency;

public class NotifyViaEmail implements Runnable {

    @Override
    public void run() {
        //System.out.println("notifying the user via email...");
        //System.out.println(Thread.currentThread().getName());

        // pausing a thread
//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}

//		
        //System.out.println("Finished..." + Thread.currentThread().getName());

        // interrupting a thread
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            if (Thread.currentThread().isInterrupted()) return;
            System.out.println("notifying..." + i);
        }

    }

}
