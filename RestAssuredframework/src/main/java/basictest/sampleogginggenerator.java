package basictest;

import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.Test;

import utility.RestAssuredFWLogger;

public class sampleogginggenerator {

	
	@Test
	
	public void Rest_Test01() {
		
		PropertyConfigurator.configure("log4j.properties");	
		
		RestAssuredFWLogger.startTestcase("Resttest01");
		
		RestAssuredFWLogger.info("Aditya");
		RestAssuredFWLogger.info("KGkgkj");
		RestAssuredFWLogger.info("jhfjhfjfjf");
		RestAssuredFWLogger.info("jfjgfjk");
		
		
		RestAssuredFWLogger.EndTestcase("Rest01");
	}
	
   @Test
	
	public void Rest_Test02() {
	   
	   PropertyConfigurator.configure("log4j.properties");	
		
		RestAssuredFWLogger.startTestcase("Resttest01");
		
		RestAssuredFWLogger.info("Aditya");
		RestAssuredFWLogger.info("KGkgkj");
		RestAssuredFWLogger.info("jhfjhfjfjf");
		RestAssuredFWLogger.info("jfjgfjk");
		
		
		RestAssuredFWLogger.EndTestcase("Rest01");
	
	
}
}