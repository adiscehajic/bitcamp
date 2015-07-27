package ba.bitcamp.w11D01_Networking.lectures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class EchoClient {

	private static final String HOST = "localhost";
	private static final int PORT = EchoServer.ECHO_PORT;

	public static void main(String[] args) throws UnknownHostException,
			IOException {

		System.out.println("Connecting to " + HOST + ":" + PORT);
		Socket client = new Socket(HOST, PORT);
		System.out.println("Connection established, sending request...");
		OutputStream rqStream = client.getOutputStream();
		OutputStreamWriter rqWriter = new OutputStreamWriter(rqStream);
		rqWriter.write("Hello Server!!!\n");
		rqWriter.flush();
		System.out.println("Request sent, waiting for response...");
		InputStream respStream = client.getInputStream();
		BufferedReader br = new BufferedReader(
				new InputStreamReader(respStream));

		String line = null;
		while ((line = br.readLine()) != null) {
			System.out.println(line);
		}
		System.out.println("Finishing request/response client program!");
		client.close();
	}
}
