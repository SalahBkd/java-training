package com.salahbkd.designpatterns.creational.factorymethod;

public class FileLogger implements Logger {

	@Override
	public void log(String message) {
		System.out.println("loggin [" + message + "] to a file !");
	}
	
}
