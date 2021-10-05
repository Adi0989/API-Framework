package utility;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class payload_generator {

	
	public static String generateFilepath(String FileName) throws IOException {
		
		String FilePath = System.getProperty("user.dir") + "\\src\\main\\java\\resouces" + FileName;
		
		return new String(Files.readAllBytes(Paths.get(FilePath)));
	}

	public static String generateStringPayload(String string) {
		
		return null;
	}
	
}


