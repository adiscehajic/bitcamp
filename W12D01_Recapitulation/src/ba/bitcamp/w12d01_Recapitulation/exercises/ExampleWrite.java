package ba.bitcamp.w12d01_Recapitulation.exercises;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;

import org.codehaus.jackson.map.ObjectMapper;

public class ExampleWrite {

	public static void main(String[] args) {
		Message msg = new Message("Adis", "14:00", "Hello");
		
		ArrayList<Message> list = new ArrayList<>();
		list.add(msg);

		ObjectMapper mapper = new ObjectMapper();
		try {
			mapper.writeValue(new File("list.json"), list);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
