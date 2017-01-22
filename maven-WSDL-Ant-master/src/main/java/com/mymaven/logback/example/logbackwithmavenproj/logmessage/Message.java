package com.mymaven.logback.example.logbackwithmavenproj.logmessage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Message {

	private static Logger logger = LoggerFactory.getLogger(Message.class);

	public String sayHello() {
		String msg = "Hello";
		logger.info("This is Info");
		logger.debug("This is debug");
		return msg;
	}


}
