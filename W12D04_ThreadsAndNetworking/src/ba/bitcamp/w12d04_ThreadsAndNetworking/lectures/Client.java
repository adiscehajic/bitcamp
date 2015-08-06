package ba.bitcamp.w12d04_ThreadsAndNetworking.lectures;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class Client {

	private Socket client;
	private String id;
	private BufferedReader reader;
	private BufferedWriter writer;

	public Client(Socket client) {
		this.client = client;
		id = client.getInetAddress().getHostAddress();
		try {
			reader = new BufferedReader(new InputStreamReader(
					client.getInputStream()));
			writer = new BufferedWriter(new OutputStreamWriter(
					client.getOutputStream()));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void close() {
		try {
			client.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public String getId() {
		return id;
	}

	public BufferedReader getReader() {
		return reader;
	}

	public BufferedWriter getWriter() {
		return writer;
	}

}
