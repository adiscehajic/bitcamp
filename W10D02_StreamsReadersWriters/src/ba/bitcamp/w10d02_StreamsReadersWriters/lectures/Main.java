package ba.bitcamp.w10d02_StreamsReadersWriters.lectures;

import java.io.*;

public class Main {

	private static void printByteArray(byte[] array) {
		for (byte b : array) {
			System.out.print((char) b);
		}
		System.out.println();
	}

	public static void main(String[] args) {

		InputStream is = null;
		OutputStream os = null;
		try {
			is = System.in;//new FileInputStream("nesto.txt");
			os = new FileOutputStream("nesto.txt", true);
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
			return;
		}

		Reader r = new InputStreamReader(System.in);
		Writer w = new OutputStreamWriter(System.out);

		BufferedReader br = new BufferedReader(r);
		BufferedWriter bw = new BufferedWriter(w);

		byte[] buffer = new byte[1];

		try {
			int read = 0;
			do {
				read = is.read(buffer);
				// printByteArray(buffer);
				os.write(buffer, 0, read);
			} while (is.available() > 0);

			String hello = "Hello World!\n";
			buffer = hello.getBytes();

			os.write(buffer);

		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("Done!");
	}
}
