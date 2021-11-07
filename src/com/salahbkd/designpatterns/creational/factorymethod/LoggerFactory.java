package com.salahbkd.designpatterns.creational.factorymethod;

public abstract class LoggerFactory {
	public void log(String logMessage) {
		Logger logger = getLogger();
		logger.log(logMessage);
	}
	protected abstract Logger getLogger();
}
