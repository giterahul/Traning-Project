package com.all;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Student {
	
	//private static final Logger LOGGER=Logger.getLogger(Student.class);
	private static final Logger LOGGER = Logger.getLogger(Student.class);
	public static void main(String[] args) {
		BasicConfigurator.configure();
		LOGGER.debug("This is debug message");
		LOGGER.info("this is info message");
		LOGGER.warn("this is warn message ");
		LOGGER.fatal("this is fatal message");
		LOGGER.error("this is error message");
		System.out.println("Logic executed successfully..");
		
	}
	

}
