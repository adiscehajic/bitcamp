package ba.bitcamp.w10d02_StreamsReadersWriters.lectures;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;

public class PartI {

	public static void main(String[] args) {

		InputStream is = null;
		try {
			is = new FileInputStream("nesto.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		Reader r = new InputStreamReader(is);
		Writer w = new OutputStreamWriter(System.out);

		BufferedReader br = new BufferedReader(r);
		PrintWriter pw = new PrintWriter(w);

		String line = null;
		
		try {
			while ((line = br.readLine()) != null) {
				//System.out.println(line);
				pw.println(line);
			} 
			pw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//pw.close();

	}
}
