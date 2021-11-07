package com.salahbkd.advanced.executer;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class ManyTasks {

    public static void main(String[] args) {
        CompletableFuture<Integer> task1 = CompletableFuture.supplyAsync(() -> 1);
        CompletableFuture<Integer> task2 = CompletableFuture.supplyAsync(() -> 2);
        CompletableFuture<Integer> task3 = CompletableFuture.supplyAsync(() -> 3);

        CompletableFuture.allOf(task1, task2, task3)
                .thenRun(() -> {
                    try {
                        Integer first = task1.get();
                        System.out.println(first);
                        System.out.println("all tasks are completed.");
                    } catch (InterruptedException | ExecutionException e) {
                        e.printStackTrace();
                    }

                });
    }

}
