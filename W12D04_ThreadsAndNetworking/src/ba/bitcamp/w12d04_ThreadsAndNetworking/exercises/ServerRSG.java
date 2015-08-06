package ba.bitcamp.w12d04_ThreadsAndNetworking.exercises;

import java.awt.font.NumericShaper;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class ServerRSG {

	private static Integer primeCounter = 0;
	private static ArrayList<Worker> list;
	private static Object lock = new Object();
	
	private static BigInteger ONE = new BigInteger("1");
	private static BigInteger TWO = new BigInteger("2");
	private static BigInteger THREE = new BigInteger("3");
	private static BigInteger TEN = new BigInteger("1000000000");
	private static BigInteger ZERO = new BigInteger("100000000");
	
	// 0 - 1.000.000
	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(8000);
			System.out.println("Server started.");
			
			BigInteger number = new BigInteger("1050809377681880902769");
			BigInteger numDivided = number.divide(THREE);
			
			BigInteger numDivided1 = numDivided.divide(TEN);
			
			BigInteger a = numDivided.subtract(numDivided1); 
			BigInteger b = numDivided;
			
			BigInteger workLoad = numDivided1;
			
			list = new ArrayList<>();
			long t = System.currentTimeMillis();
//			while (b.compareTo(number) == -1 || b.compareTo(number) == 0) {
//				Socket client = server.accept();
//				System.out.println("Got client!");
//				
//				String ip = client.getInetAddress().getHostAddress().toString();
//				System.out.printf("%s got (%d, %d)\n", ip, a, b);
//				
//				Worker w = new Worker(client, a, b);
//				list.add(w);
//				
//				
//				a = a.subtract(workLoad);
//				b = b.subtract(workLoad);
//			}
			
			
			while (b.compareTo(THREE) == 1 || b.compareTo(THREE) == 0) {
				Socket client = server.accept();
				System.out.println("Got client!");
				
				String ip = client.getInetAddress().getHostAddress().toString();
				System.out.printf("%s got (%d, %d)\n", ip, a, b);
				
				Worker w = new Worker(client, a, b);
				list.add(w);
				
				
				a = a.subtract(workLoad);
				b = b.subtract(workLoad);
			}
			
			int tempCounter = 0;
			for (Worker w : list) {
				try {
					if (w != null) {
						w.join();
						
					}
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			}
			
			server.close();
			System.out.println("Total time: " + (System.currentTimeMillis() - t) + " [ms]");
			System.out.println("a: " + a);
			System.out.println("b: " + b);
			System.out.println("Primes: " + primeCounter);
			System.out.println("Primes: " + tempCounter);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static class Worker extends Thread {		
		private Socket socket;
		private BigInteger a;
		private BigInteger b;

		String result = "";
		
		public Worker(Socket socket, BigInteger a, BigInteger b) {
			this.socket = socket;
			this.a = a;
			this.b = b;
			this.start();
		}
		
		@Override
		public void run() {
			try {
				BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
				writer.write(a + " " + b);
				writer.newLine();
				writer.flush();
				
				long t = System.currentTimeMillis();
				
				BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				
				String msg = reader.readLine();
				
				String ip = socket.getInetAddress().getHostAddress().toString();
				try {
					long time = System.currentTimeMillis() - t;
					System.out.println(ip + ": " + msg + " Time: " + time + " [ms]");
					if (!msg.equals("END")) {
						result += msg;						
					}
					synchronized (lock) {
						primeCounter += Integer.parseInt(msg);
					}
				} catch (NumberFormatException ex) {
					System.err.println(ip + " napusta kucu velikog BitCampa.");
				}
				
				writer.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			
			
		}
	}
}
