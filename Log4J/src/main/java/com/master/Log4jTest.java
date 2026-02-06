package com.master;
 

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jTest {
	
	private static final Logger logger = LogManager.getLogger(Log4jTest.class);
	
	public static void main(String[] args) {
		Process();
	}
	public static void Process() {
		//service
		logger.trace("From Trace Methods");
		logger.debug("From Debug Methods");
		logger.info("From Info Methods");
		logger.warn("From Warn Methods");
		logger.error("From Error Methods");
		logger.fatal("From Fatal Methods");
	}
}
