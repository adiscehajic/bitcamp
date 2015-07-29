package ba.bitcamp.w11d03_NetworkingPart2.lectures;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.StringTokenizer;

public class Main {

	public static final int PORT = 7321;

	public static void main(String[] args) {

		try {
			ServerSocket server = new ServerSocket(PORT);

			while (true) {
				Socket client = server.accept();

				BufferedReader reader = new BufferedReader(
						new InputStreamReader(client.getInputStream()));

				String line = "";
				String requestType = "";
				String requestRoute = "";
				while ((line = reader.readLine()) != null) {
					if (line.contains("GET") || line.contains("POST")) {
						String[] get = line.split(" ");
						requestType = get[0];
						requestRoute = get[1];
						break;
					}
				}

				BufferedWriter bw = new BufferedWriter(new
						OutputStreamWriter(
								client.getOutputStream()));
				
				try {
					String htmlContent = FileHandler.getContent(requestRoute);
					Result.ok(bw, htmlContent);
				} catch (FileNotFoundException e) {
					Result.notFound(bw);
				} catch (IOException e) {
					Result.serverError(bw);
				}



				//
				// bw.write("HTTP/1.1 200 OK\n");
				// bw.write("content-type: text/html\n");
				// bw.newLine();
				// bw.write("Hello World\n\n");
				 bw.flush();
				 client.close();

			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
