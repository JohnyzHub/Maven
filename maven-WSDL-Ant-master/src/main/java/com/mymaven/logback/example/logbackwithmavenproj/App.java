package com.mymaven.logback.example.logbackwithmavenproj;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mymaven.logback.example.logbackwithmavenproj.logmessage.Message;





/**
 * Hello world!
 *
 */
public class App {

	public final static Logger logger = LoggerFactory.getLogger(App.class);

	public static void main( String[] args ) {
		logger.info("Info");
		logger.warn("Warn");
		logger.error("Error");
		logger.debug("Debug");

		new Message().sayHello();
	}
}
