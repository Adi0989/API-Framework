package basictest;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

import org.apache.log4j.PropertyConfigurator;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.restassured.Baseclass;

import io.restassured.response.Response;
import resouces.pojoclass.TestDataFrompojo;
import utility.Bearer_token;
import utility.CreateURI;
import utility.RestAssuredFWLogger;
import utility.commonutilfunction;
import utility.payload_generator;

@Test
public class CreateRepoTest {

	static String endpoint = CreateURI.getBaseURI("/user/repos");
	static String bearer = Bearer_token.getbearer_token();

	ObjectMapper objectMapper;
	static Response response;

	public static void createRepotest1() {
		PropertyConfigurator.configure("log4j.properties");
		RestAssuredFWLogger.startTestcase("createRepotest1");
		RestAssuredFWLogger.info("Starting test case");
		RestAssuredFWLogger.info("Request URI is : " + endpoint);

		String req_Payload = payload_generator.generateStringPayload("CreateRepo.json");
		RestAssuredFWLogger.info("Reuest payload is : " + req_Payload);

		response = Baseclass.postRequest(endpoint, req_Payload, bearer);

		String responseString = response.getBody().asString();
		RestAssuredFWLogger.info("Request response is : " + responseString);

		Assert.assertEquals(commonutilfunction.getJsonReponse(responseString, "name"),
				commonutilfunction.getJsonReponse(req_Payload, "name"));

		RestAssuredFWLogger.info("Assertion on reponame is completed");
		RestAssuredFWLogger
				.info("Name from the Request is : " + commonutilfunction.getJsonReponse(req_Payload, "name"));
		RestAssuredFWLogger
				.info("Name from the Reponse is : " + commonutilfunction.getJsonReponse(responseString, "name"));

		Assert.assertEquals(commonutilfunction.getJsonReponse(responseString, "description"),
				commonutilfunction.getJsonReponse(req_Payload, "description"));

		RestAssuredFWLogger.EndTestcase("createRepotest1");

	}

	@Test
	public void createRepotestcase1() throws JsonProcessingException {

		PropertyConfigurator.configure("log4j.properties");

		RestAssuredFWLogger.startTestcase("createRepotestcase1");
		RestAssuredFWLogger.info("Starting test case");
		RestAssuredFWLogger.info("Request URI is : " + endpoint);

		TestDataFrompojo reqPayload = new TestDataFrompojo();

		reqPayload.setName("APITesting_Restcalls59");
		reqPayload.setDescription("Repo created via APITesting_Restcall56");

		objectMapper = new ObjectMapper();

		String payload = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(reqPayload);
		RestAssuredFWLogger.info("Request payload is : " + payload);

		response = Baseclass.postRequest(endpoint, payload, bearer);

		String responseString = response.getBody().asString();
		RestAssuredFWLogger.info("Request response is : " + responseString);

		Assert.assertEquals(reqPayload.getName(), commonutilfunction.getJsonReponse(responseString, "name"));
		Assert.assertEquals(reqPayload.getDescription(),
				commonutilfunction.getJsonReponse(responseString, "description"));
	}

	@Test

	public void deleterepotestcase() {

		PropertyConfigurator.configure("log4j.properties");

		RestAssuredFWLogger.startTestcase("deleterepotestcase");
		RestAssuredFWLogger.info("Starting Delete repo test case");

		String req_Payload = payload_generator.generateStringPayload("CreateRepo.json");
		RestAssuredFWLogger.info("Reuest payload is : " + req_Payload);

		String deleteEndpoint = CreateURI.getBaseURI("/repos/")
				+ commonutilfunction.getJsonReponse(req_Payload, "name");

		response = Baseclass.deleteRequest(deleteEndpoint);

		String responseString = response.getBody().asString();

		System.out.println(responseString);
	}

}
