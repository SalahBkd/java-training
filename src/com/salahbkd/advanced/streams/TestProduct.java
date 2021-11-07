package com.salahbkd.advanced.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestProduct {

    public static void main(String[] args) {
        List<Product> products = new ArrayList<Product>();
        products.add(new Product("a", 75));
        products.add(new Product("a", 75));
        products.add(new Product("b", 99));
        products.add(new Product("c", 89));


        // Imperative programming
        int count = 0;
        for (Product product : products)
            if (product.getPrice() < 100)
                count++;

        System.out.println(count);

        // Declarative (functional) programming
        long count2 = products.stream()
                .filter((product) -> product.getPrice() < 100)
                .count();
        System.out.println(count2);

        // MAPPING
        // map()
        products.stream()
                .map((product) -> product.getName())
                .forEach((name) -> System.out.println(name));

        // flatMap()
        // ila 3adna a stream of lists of integers w b4ina nmappewh li individual integers
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);

        List<Integer> list2 = new ArrayList<>();
        list1.add(3);
        list1.add(4);

        Stream<List<Integer>> stream = Stream.of(list1, list2);
        stream.flatMap((list) -> list.stream())
                .forEach((n) -> System.out.println(n));

        // Filtering
        products.stream()
                .filter((product) -> product.getPrice() < 100)
                .forEach((product) -> System.out.println(product.getName()));
        // our data source (products) is not affected 


        // SLICING STREAMS
        products.stream()
                .skip(1)
                .limit(2)
                .forEach((product) -> System.out.println(product.getName()));


        // SORTING
        products.stream()
                .sorted((a, b) -> a.getName().compareTo(b.getName()))
                .forEach((p) -> System.out.println(p.getName()));

        // GETTING UNIQUE ELEMENTS
        products.stream()
                .map((product) -> product.getPrice())
                .distinct()
                .forEach((price) -> System.out.println(price));

        // Peeking Elements
        products.stream()
                .map((product) -> product.getPrice())
                .peek((price) -> System.out.println("mapped" + price))
                .distinct()
                .peek((price) -> System.out.println("distincted" + price))
                .forEach((price) -> System.out.println(price));

        // REDUCING

        // simple reducers
        products.stream()
                .count();

        boolean result = products.stream()
                .anyMatch(m -> m.getName() == "a");

        boolean result2 = products.stream()
                .allMatch(m -> m.getPrice() > 100);


        boolean result3 = products.stream()
                .noneMatch(m -> m.getPrice() > 100);

        Product result4 = products.stream()
                .findFirst()
                .get();

        Product result5 = products.stream()
                .findAny()
                .get();

        // MAX version1
//		Product result6 = products.stream()
//				.max(Comparator.comparing(Product::getPrice))
//				.get();

        // MAX version2
        Product result6 = products.stream()
                .max((a, b) -> a.getName().compareTo(b.getName()))
                .get();

        // reduce()
        // version1
        Optional<Float> sum = products.stream()
                .map(p -> p.getPrice())
                .reduce((a, b) -> a + b);

        // version2
        Float sum2 = products.stream()
                .map(p -> p.getPrice())
                .reduce(0F, (a, b) -> a + b);

        System.out.println(sum.orElse(0F));


    }

}
