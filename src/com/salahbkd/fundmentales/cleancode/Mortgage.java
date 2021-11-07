package com.salahbkd.fundmentales.cleancode;

import java.text.NumberFormat;
import java.util.Scanner;

public class Mortgage {
    final byte MONTHS_IN_YEAR = 12;
    final byte PERCENT = 100;

    public void calculate() {
        int principal = (int) readValue("Principal ($1k - $1M): ",
                "Enter a number between 1000 - 1 000 000: ", 1000, 1_000_000);

        float annualInterest = (float) readValue("Annual Interest Rate: ",
                "Enter a value between 1 - 30: ", 1, 30);

        short periodInYears = (short) readValue("Period (Years): ",
                "Enter a value between 1 - 30", 1, 30);

        printMortgage(principal, annualInterest, periodInYears);

        printPaymentSchedule(principal, annualInterest, periodInYears);
    }

    private void printPaymentSchedule(int principal, float annualInterest, short periodInYears) {
        System.out.println("\nPAYMENT SCHEDULE");
        System.out.println("----------------");
        for (short month = 1; month <= periodInYears * MONTHS_IN_YEAR; month++) {
            System.out.println(NumberFormat.getCurrencyInstance().format(remainingBalance(principal, annualInterest, periodInYears, month)));
        }
    }

    private void printMortgage(int principal, float annualInterest, short periodInYears) {
        double monthlyPayment = calculateMortgage(principal, annualInterest, periodInYears);
        String formattedMortgage = NumberFormat.getCurrencyInstance().format(monthlyPayment);
        System.out.println("MORTGAGE");
        System.out.println("--------");
        System.out.println("Monthly Payement: " + formattedMortgage);
    }

    private double remainingBalance(int principal, float annualInterest, short periodInYears, short numberOfPaymentsMade) {
        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
        int periodInMonths = periodInYears * MONTHS_IN_YEAR;

        double result = principal * (Math.pow(1 + monthlyInterest, periodInMonths) - Math.pow(1 + monthlyInterest, numberOfPaymentsMade))
                / (Math.pow(1 + monthlyInterest, periodInMonths) - 1);

        return result;

    }

    private double calculateMortgage(int principal, float annualInterest, short periodInYears) {

        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
        int periodInMonths = periodInYears * MONTHS_IN_YEAR;

        double result = (principal * (monthlyInterest * Math.pow((1 + monthlyInterest), periodInMonths)))
                / (Math.pow((1 + monthlyInterest), periodInMonths) - 1);
        return result;
    }

    private double readValue(String message, String prompt, int min, int max) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println(message);
            double value = scanner.nextDouble();
            if (value >= min && value <= max)
                return value;
            else
                System.out.println(prompt);
        }
    }
}
