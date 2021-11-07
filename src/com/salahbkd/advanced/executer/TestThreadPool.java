package com.salahbkd.advanced.executer;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.function.Supplier;

public class TestThreadPool {

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        // We submit a runnable object
		/*try {
			executor.submit(() -> 
			System.out.println(Thread.currentThread().getName())
			);
			
		} finally { // we make sure that we always shutdown our executor, ila chi exception interruptud the flow of the program
			executor.shutdown();
		}*/

        // we submit a callable object
		/*try {
			
			Future<Integer> future = executor.submit(() -> {
				System.out.println(Thread.currentThread().getName());
				LongTask.simulate();
				return 1;
			});
			
			System.out.println("doing work...!");
			
			try {
				Integer result = future.get();
				System.out.println(Thread.currentThread().getName());
				System.out.println(result);
			} catch (InterruptedException | ExecutionException e) {
				e.printStackTrace();
			}			
			
		} finally { 
			executor.shutdown();
		}*/

        // Asynchronous programming
	
		/*try {
			
			Future<Integer> future = executor.submit(() -> {
				System.out.println(Thread.currentThread().getName());
				LongTask.simulate();
				return 1;
			});
			
			System.out.println("doing work...!");
			
			try {
				Integer result = future.get();
				System.out.println(Thread.currentThread().getName());
				System.out.println(result);
			} catch (InterruptedException | ExecutionException e) {
				e.printStackTrace();
			}			
			
		} finally { 
			executor.shutdown();
		}*/

        // Asynchronous programming with CompletableFuture type
        // using this type we don't have to create an executor, submit a task and shut it down like the above example
        Supplier<Integer> task = () -> 1;
        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(task);
        try {
            Integer result = future.get();
            System.out.println("doing work");
            System.out.println(result);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

    }

}
