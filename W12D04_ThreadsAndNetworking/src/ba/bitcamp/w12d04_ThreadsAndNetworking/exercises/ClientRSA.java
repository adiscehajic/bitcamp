package ba.bitcamp.w12d04_ThreadsAndNetworking.exercises;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.net.Socket;

public class ClientRSA {


	private static BigInteger a = new BigInteger("0"); 
	private static BigInteger b = new BigInteger("0"); 
	private static BigInteger ONE = new BigInteger("1");
	private static BigInteger TWO = new BigInteger("2");
	private static BigInteger THREE = new BigInteger("3");
	private static BigInteger ZERO = new BigInteger("0");
	
	
	public static void main(String[] args) {
		
		Socket client;
		try {
			while(true){
			client = new Socket("localhost", 8000);
			BufferedReader reader = new BufferedReader(
					new InputStreamReader(client.getInputStream()));
			BufferedWriter writer = new BufferedWriter(
					new OutputStreamWriter(client.getOutputStream()));
			
			String numbers = reader.readLine();
			System.out.println(numbers);
			BigInteger start = new BigInteger(numbers.split(" ")[0]);
			BigInteger end = new BigInteger(numbers.split(" ")[1]);
			//3602697925, 7005395850
			System.out.println("[" + start + ", " + end + "]");
			BigInteger j =  new BigInteger("3602697925");
			
			BigInteger number1 = new BigInteger("1050809377681880902769"); 
			BigInteger number = new BigInteger("7005395850");
			
			BigInteger divider = new BigInteger("3");
			
			
			long startTime = System.currentTimeMillis();
			BigInteger k = new BigInteger("1");
			
			for (; j.compareTo(number) == -1 || j.compareTo(number) == 0; j = j.add(ONE)) {
				
				if (number1.mod(j).compareTo(ZERO) == 0) {
					a = j;
					break;
				}
			}
			if (a.compareTo(ZERO) == 1) {
				
				b = number.divide(a).add(ONE);
				System.out.println("Time: " + (System.currentTimeMillis() - startTime));
				System.out.println(a);
				System.out.println(b);
				
				
				
				writer.write(String.valueOf(a) + " " + String.valueOf(b));
				writer.newLine();
				writer.flush();
				writer.close();
			} else if (a.compareTo(ZERO) == 0) {
				writer.write("END");
				writer.newLine();
				writer.flush();
				writer.close();
			}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	
	public static boolean isPrimeEfficient(BigInteger num) {
		
		if (num.mod(TWO).compareTo(ZERO) == 0) {
			return false;
		}
		
		
		BigInteger i = new BigInteger("3");
		for (; i.compareTo(num.divide(THREE)) == -1 || i.compareTo(num.divide(THREE)) == 0; i = i.add(ONE)) {
			if (num.divide(THREE).mod(i).compareTo(ZERO) == 0) {
				return false;
			}	
		}
		
		return true;
	}
}
