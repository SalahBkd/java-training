package com.salahbkd.advanced.executer;

import java.util.concurrent.CompletableFuture;

public class FastestTask {

    public static void main(String[] args) {

        CompletableFuture<Integer> task1 = CompletableFuture.supplyAsync(() -> {
            LongTask.simulate();
            return 10;
        });

        CompletableFuture<Integer> task2 = CompletableFuture.supplyAsync(() -> 20);

        CompletableFuture.anyOf(task1, task2)
                .thenAccept(result -> System.out.println(result));
    }

}
