package com.salahbkd.advanced.executer;

import java.util.concurrent.CompletableFuture;

public class RunCodeOnCompletion {
    public static void main(String[] args) {

        CompletableFuture<Void> future = CompletableFuture
                .supplyAsync(() -> 1)
                //.thenAcceptAsync(result -> System.out.println(result)) // runs on a diff thread.
                .thenAccept(result -> System.out.println(result)); // runs on single thread
    }
}
