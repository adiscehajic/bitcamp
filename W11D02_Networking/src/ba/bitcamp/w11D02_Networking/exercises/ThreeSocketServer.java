package ba.bitcamp.w11D02_Networking.exercises;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

public class ThreeSocketServer {

public static String getRandomIP(HashMap<String, String> hmap) {
		
		Random rand = new Random();
		
		Set<String> set = hmap.keySet();
		
		Object[] array = set.toArray();
		
		return (String) array[rand.nextInt(array.length)];
	}
	
	public static void main(String[] args) {

		HashMap<String, String> hmap = new HashMap<String, String>();
		BufferedReader br = null;

		try {
			br = new BufferedReader(new FileReader(new File("text.txt")));
			while (br.ready()) {
				String text = br.readLine();
				
				StringTokenizer st = new StringTokenizer(text, " ");
				
				String address = st.nextToken();
				String name = st.nextToken();
				
				hmap.put(address, name);
				
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		try {
			System.out.println("[SERVER] Server started...");
			ServerSocket server = new ServerSocket(8888);

			System.out.println("[SERVER] Server socked made.");

			System.out.println("[SERVER] Listening for a client...");
			Socket client = server.accept();
			System.out.println("[SERVER] Client found.");

			BufferedReader reader = new BufferedReader(new InputStreamReader(
					client.getInputStream()));

			String messageRecieved = reader.readLine();

			System.out.println(messageRecieved);

			Scanner input = new Scanner(System.in);

			Socket socketSecond = new Socket("10.0.82.98", 8888);

			BufferedWriter writerSecond = new BufferedWriter(
					new OutputStreamWriter(socketSecond.getOutputStream()));

			String message = input.nextLine();

			writerSecond.write(messageRecieved + " " + message);
			writerSecond.newLine();
			writerSecond.flush();

			
			while (true) {
				try {
					String addressIP = getRandomIP(hmap);
					System.out.println("Trying to connect to: " + hmap.get(addressIP));
					Socket socketFirst = new Socket(addressIP,
							8888);
					
					BufferedWriter writerFirst = new BufferedWriter(
							new OutputStreamWriter(
									socketFirst.getOutputStream()));

					writerFirst.write(messageRecieved + " " + message);
					writerFirst.newLine();
					writerFirst.flush();
					System.out.println("Message sent!");
					break;
				} catch (ConnectException ex) {
					System.out.println("Not turned on!");
				}
			}

			reader.close();

		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
