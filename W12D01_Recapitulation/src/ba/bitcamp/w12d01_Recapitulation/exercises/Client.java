package ba.bitcamp.w12d01_Recapitulation.exercises;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.ArrayList;

import org.codehaus.jackson.map.ObjectMapper;

public class Client {

	public static void main(String[] args) {

//		ObjectMapper mapper = new ObjectMapper();
//		
//		try {
//			ArrayList<Message> list = mapper.readValue(new File("list.json"), ArrayList.class);
//			Message msg = new Message("Zaid", "14:00", "Hello");
//			list.add(msg);
//			mapper.writeValue(new File("list.json"), list);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		
		try {
			Socket client = new Socket("10.0.82.22", 8000);

			OutputStream os = client.getOutputStream();
			FileInputStream file = new FileInputStream(new File(
					"list.json"));

			byte[] buffer = new byte[1024];
			int readBytes;

			while ((readBytes = file.read(buffer, 0, buffer.length)) > 0) {
				os.write(buffer, 0, readBytes);
			}
			file.close();
			//client.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
