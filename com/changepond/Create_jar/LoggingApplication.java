package com.changepond.Create_jar;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
public class LoggingApplication {
	
	 static Logger logger = Logger.getLogger(LoggingApplication.class);
	 
	public static void main(String[] args) {
		
		 PropertyConfigurator.configure("Log4j.properties");

	        logger.debug("Log4j appender configuration is successful..harish");

	}

}

