package com.salahbkd.designpatterns.creational.factorymethod;

public class ConsoleLogger implements Logger {

	@Override
	public void log(String message) {
		System.out.println("loggin [" + message + "] to a console !");
	}

}
