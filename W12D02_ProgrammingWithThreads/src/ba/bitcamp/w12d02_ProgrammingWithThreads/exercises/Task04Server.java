package ba.bitcamp.w12d02_ProgrammingWithThreads.exercises;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Calendar;
import java.util.Date;

public class Task04Server {

	public static void main(String[] args) {

		try {
			ServerSocket server = new ServerSocket(8888);

			while (true) {
				Socket client = server.accept();
				new MyThread(client).start();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private static class MyThread extends Thread {

		private Socket client;
		String date;
		FileWriter writer;

		public MyThread(Socket client) {
			this.client = client;
			date = Calendar.getInstance().getTime() + "";
		}

		public void run() {
			try {
				BufferedReader reader = new BufferedReader(
						new InputStreamReader(client.getInputStream()));

				writer = new FileWriter(new File("logger.txt"), true);

				String information = reader.readLine();
				String[] parts = information.split(" ");

				if (parts.length < 2) {
					writer.write(date
							+ " [COMMAND ERROR] Sent message does not contain right informations.\n");
					writer.flush();
				}

				switch (parts[0]) {
				case "1":
					try {
						writer.write(date + " [TEMPERATURE] "
								+ Double.parseDouble(parts[1]) + " K\n");
						writer.flush();
					} catch (NumberFormatException e1) {
						writeMessage(writer, date, parts[1]);
					}
					break;
				case "2":
					try {
						writer.write(date + " [PRESSURE] "
								+ Integer.parseInt(parts[1]) + " hPa\n");
						writer.flush();
					} catch (NumberFormatException e1) {
						writeMessage(writer, date, parts[1]);
					}
					break;
				case "3":
					if (parts[1].equals(true) || parts[1].equals(false)) {
						writer.write(date + " [MOVEMENT] "
								+ Boolean.parseBoolean(parts[1]) + "\n");
						writer.flush();
					} else {
						writeMessage(writer, date, parts[1]);
					}
					break;
				case "4":
					writer.write(date + " [ERROR] " + information.substring(2) + "\n");
					writer.flush();
					break;
				default:
					writeErrorMessage(writer, date, parts[0]);
					break;
				}

				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	private static void writeMessage(FileWriter writer, String date, String part) {
		try {
			writer.write(date + " [COMMAND ERROR] '" + part
					+ "' is not a information format.\n");
			writer.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void writeErrorMessage(FileWriter writer, String date,
			String part) {
		try {
			writer.write(date + " [COMMAND ERROR] '" + part
					+ "' is not a valid communication identification number.\n");
			writer.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
