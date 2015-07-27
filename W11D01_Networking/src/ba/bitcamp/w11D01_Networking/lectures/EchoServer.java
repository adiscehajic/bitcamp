package ba.bitcamp.w11D01_Networking.lectures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {

	public static final int ECHO_PORT = 12345;

	public static void main(String[] args) throws IOException {
		ServerSocket server = new ServerSocket(ECHO_PORT);

		while (true) {
			System.out.println("Waiting for next request...");
			Socket clientSocket = server.accept();
			System.out.println("Request accepted, waiting for request...");
			InputStream rqStream = clientSocket.getInputStream();
			BufferedReader rqReader = new BufferedReader(new InputStreamReader(rqStream));
			
			String rq = rqReader.readLine();
			System.out.println("Request accepted: " + rq);
			System.out.println("Writing response..");
			
			OutputStream os = clientSocket.getOutputStream();
			OutputStreamWriter writer = new OutputStreamWriter(os);
			writer.write("OK\n");
			writer.write(rq);
			writer.flush();
			System.out.println("Response flushed, closing connection...");
			os.close();
			clientSocket.close();			
		}
		
	}
}
