package com.salahbkd.designpatterns.creational.factorymethod;

public class ConsoleLoggerFactory extends LoggerFactory {

	@Override
	public Logger getLogger() {
		return new ConsoleLogger();
	}

}
