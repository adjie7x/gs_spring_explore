package utility.hackerrank;

import java.io.IOException;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class MitraisTest2 {
	
	static String[] readJson(String subSrtr) throws Exception{
		
		ObjectMapper objectMapper = new ObjectMapper();
		String jsonString = "{" 
				   + "    \"nama\": \"Julie Sherman\","
				   + "    \"geodata\": [" 
				   + "        {" 
				   + "                \"id\": \"1\"," 
				   + "                \"name\": \"Julie Sherman\","                  
				   + "                \"gender\" : \"female\"," 
				   + "                \"latitude\" : \"37.33774833333334\"," 
				   + "                \"longitude\" : \"-121.88670166666667\""            
				   + "                }" 
				   + "        }," 
				   + "        {" 
				   + "                \"id\": \"2\"," 
				   + "                \"name\": \"Johnny Depp\","          
				   + "                \"gender\" : \"male\"," 
				   + "                \"latitude\" : \"37.336453\"," 
				   + "                \"longitude\" : \"-121.884985\""            
				   + "                }" 
				   + "        }" 
				   + "    ]" 
				   + "}"; 
		
		JsonNode actualObj = objectMapper.readTree(jsonString);
		JsonNode idName = actualObj.path("nama");
		
		System.out.println(idName.asText());
		
		return null;
	}
	
	public static void main(String[] args) throws Exception {
		readJson("");
	}

}
