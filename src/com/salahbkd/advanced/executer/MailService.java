package com.salahbkd.advanced.executer;

import java.util.concurrent.CompletableFuture;

public class MailService {
    private void send() {
        LongTask.simulate();
        System.out.println("email was sent!");
    }

    public CompletableFuture<Void> sendAsyn() {
        return CompletableFuture.runAsync(() -> send()); // this will be executed on a seperate thread in the common thread
        // pool of --> ForkJoinPool.commonPool() and will be executed asynchronously
    }

}
