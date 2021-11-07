package com.salahbkd.fundmentales.basics;

import com.salahbkd.fundmentales.cleancode.Mortgage;

import java.awt.*;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //primitiveTypesSamples();
        //referenceTypesSamples();
        //pirmitiveVsReferenceSample();
        //SdArraysSamples();
        //TwoDArraysSample();
        //castingSample();
        //mathClassSample();
        //formatNumberSample();
        //readInputSample();
        Mortgage mortgage = new Mortgage();
        mortgage.calculate();

    }

    private static void readInputSample() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a value: ");
        //scanner.next();
        String value = scanner.nextLine().trim();
        System.out.println(value);
    }

    private static void formatNumberSample() {
        String result = NumberFormat.getPercentInstance().format(0.4);
        System.out.println(result);
    }

    private static void mathClassSample() {
        double random = Math.round(Math.random() * 100);
        System.out.println(random);
    }

    private static void castingSample() {
        // implicit casting
        int a = 10;
        float b = a;
        System.out.println(b);

        // explicit casting
        float z = 14F;
        int c = (int) z;
        System.out.println(c);

        // to cast a string, use wrapper classes Integer.parse(), Integer.toInt()...etc
        String str = "10";
        System.out.println(a + Integer.parseInt(str));
    }

    private static void TwoDArraysSample() {
        int[][] matrix = {{1, 2, 3}, {4, 5, 5}};
        System.out.println(Arrays.deepToString(matrix));
    }

    private static void SdArraysSamples() {
        int[] numbers = new int[4];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 5;
        System.out.println(Arrays.toString(numbers));

        int[] ages = {25, 20, 35, 40};
        System.out.println(Arrays.toString(ages));
    }

    private static void pirmitiveVsReferenceSample() {
        int a = 1;
        int b = a; // copy by value
        a = 2;
        System.out.println(a + " " + b);

        Point point1 = new Point(10, 10);
        Point point2 = point1; // copy by reference
        point1.x = 20;
        System.out.println(point2);
    }

    private static void referenceTypesSamples() {
        Date now = new Date();
        System.out.println(now);
    }

    private static void primitiveTypesSamples() {
        byte age = 30;
        int viewsCount = 100_000_000;
        long longNum = 320_100_000_000L;
        System.out.print((viewsCount));
    }


}
