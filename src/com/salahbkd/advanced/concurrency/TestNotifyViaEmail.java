package com.salahbkd.advanced.concurrency;

public class TestNotifyViaEmail {
    public static void main(String[] args) {

        //System.out.println(Thread.currentThread().getName());

        // starting a thread
        //Thread thread = new Thread(new NotifyViaEmail());
        //thread.start();
		
		
		/*try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/

        // interrupting a thread
        //thread.interrupt();

        // joining a thread
//		try {
//			thread.join();
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}

        //CLASS STUFF

        Thread thread = new Thread(() -> System.out.println("Hello from thread-1"));

        thread.setName("thread-1");
        thread.start();

        ThreadGroup tg = Thread.currentThread().getThreadGroup();
        tg.list();


    }
}
