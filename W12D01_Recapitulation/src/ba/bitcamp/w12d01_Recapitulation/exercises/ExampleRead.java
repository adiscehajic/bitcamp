package ba.bitcamp.w12d01_Recapitulation.exercises;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.codehaus.jackson.map.ObjectMapper;

public class ExampleRead {

	public static void main(String[] args) {
		ObjectMapper mapper = new ObjectMapper();
		
		try {
			ArrayList<String> list = mapper.readValue(new File("/Users/adis.cehajic/Desktop/list.json"), ArrayList.class);
			System.out.println(list);
		
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
