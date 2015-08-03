package ba.bitcamp.w12d01_Recapitulation.exercises;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Calendar;

import org.codehaus.jackson.map.ObjectMapper;

public class Server {

	public static void main(String[] args) {

		String time = "" + Calendar.getInstance().getTime();

		try {
			ServerSocket server = new ServerSocket(8000);

			Socket client = server.accept();

			InputStream is = client.getInputStream();
			FileOutputStream file = new FileOutputStream("list.json");

			byte[] buffer = new byte[1024];
			int readBytes;

			while ((readBytes = is.read(buffer, 0, buffer.length)) > 0) {
				file.write(buffer, 0, readBytes);
				//file.flush();
			}
			is.close();
			//client.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		ObjectMapper mapper = new ObjectMapper();

		try {
			ArrayList<Message> list = mapper.readValue(new File("list.json"),
					ArrayList.class);

			Message msg = new Message("Adis", time.split(" ")[3], "Prepeceni Hasko!");

			list.add(msg);

			mapper.writeValue(new File("list.json"), list);
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			Socket client = new Socket("10.0.82.25", 8000);

			OutputStream os = client.getOutputStream();
			FileInputStream file = new FileInputStream(new File("list.json"));

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
