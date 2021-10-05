package utility;

import org.apache.log4j.Logger;

import com.sun.tools.javac.util.Log;



public class RestAssuredFWLogger {

	/* Initilize the log4J logs */
	
	public static Logger log = Logger.getLogger(RestAssuredFWLogger.class.getName());
	
	/* This is the log for printing the start of the test case */
	
	public static void startTestcase(String STestName) {
	
		log.info("*********************");
		log.info("*****************");
		log.info("$$$$$$$$$$ " + STestName + " $$$$$$$$$$$$$$");
	
}
	
	public static void EndTestcase(String EndtestName) {
	
		
		log.info("***************************");
		
	log.info("*************************");
	log.info("$$$$$$$$$$$$$$$$$$$$$$$"  +EndtestName+ "$$$$$$$$$$$$$$$");
}
	
/* Need to define the levels of Logger */
	public static void info(String message) {
	log.info(message);
	}
	
	public static void warn(String message) {
		
	log.info(message);
	}
	
	public static void error(String message) {
		log.info(message);
		
	}
	
	
	public static void fatal(String message) {
		log.info(message);

	}
	
	public static void Debug(String message) {
		log.info(message);
	}
}