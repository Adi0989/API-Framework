package utility;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class commonutilfunction {

	static JsonPath jsonPath;

	public static String getJsonReponse(String response_Body, String response_key) {
		jsonPath = new JsonPath(response_Body);
		String key_value = jsonPath.get(response_key);

		return key_value;

	}

	public static int getstatuscode(Response response) {

		int Status_code = response.getStatusCode();

		return Status_code;
	}

	public static String getstatusmessage(Response response) {

		String Status_message = response.getStatusLine();

		return Status_message;
	}

	public static String getResponseheader(Response response, String Header_key) {

		String response_header = response.getHeader(Header_key);

		return response_header;

	}

	public static String getContenttye(Response response) {

		String content_type = response.getContentType();

		return content_type;

	}
}