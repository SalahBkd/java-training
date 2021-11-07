package com.salahbkd.advanced.exceptions;

public class Test {

    public static void main(String[] args) {
		/*Compte cmpt = new Compte();
		try {
			cmpt.withdraw(100);
		} catch (CompteException e) {
			// SoldeMakafichException hya cause dyal CompteException
			System.out.println(e.getCause().getMessage());
		}*/

        int a = 10;
        int b = 0;

        try {
            b = a / 0;
        } catch (ArithmeticException e) {
            System.out.println("error !!!!");
        }


    }
}
