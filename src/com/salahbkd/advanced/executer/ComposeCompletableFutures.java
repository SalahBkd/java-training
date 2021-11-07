package com.salahbkd.advanced.executer;

import java.util.concurrent.CompletableFuture;

public class ComposeCompletableFutures {

    public static void main(String[] args) {
        // get user by email and display its playlist
        CompletableFuture.supplyAsync(() -> "email")
                .thenCompose(email -> CompletableFuture.supplyAsync(() -> "playlist"))
                .thenAccept(playlist -> System.out.println(playlist));
    }

}
