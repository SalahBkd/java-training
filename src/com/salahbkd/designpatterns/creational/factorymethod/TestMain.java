package com.salahbkd.designpatterns.creational.factorymethod;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {
		LoggerFactory loggerFactory;

		Scanner input = new Scanner(System.in);
		System.out.println("Type 'file' to log to a file \nType 'console' to log to a console: ");
		String logginInput = input.next();
		input.close();
		
		if(logginInput.equals("file")) {
			loggerFactory = new FileLoggerFactory();
		} else if(logginInput.equals("console")) {
			loggerFactory = new ConsoleLoggerFactory();
		} else {
			throw new InputMismatchException("Wrong logging input.");		
		}
		
		loggerFactory.log("log message1");
		
		
		
		
		
	}

}
