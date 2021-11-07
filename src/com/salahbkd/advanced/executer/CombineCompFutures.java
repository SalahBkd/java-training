package com.salahbkd.advanced.executer;

import java.util.concurrent.CompletableFuture;

public class CombineCompFutures {

    public static void main(String[] args) {
        // kan7awlou mabin USD and EU asynchronously w kan3tiw result, machi tsana first 
        // ta3tin USD w second ta3tina EUR 3ad converter

        CompletableFuture<Integer> first = CompletableFuture.supplyAsync(() -> 20);
        CompletableFuture<Double> second = CompletableFuture.supplyAsync(() -> 0.9);

        first.thenCombine(second, (price, exchangeRate) -> price * exchangeRate)
                .thenAccept(result -> System.out.println(result));

    }

}
