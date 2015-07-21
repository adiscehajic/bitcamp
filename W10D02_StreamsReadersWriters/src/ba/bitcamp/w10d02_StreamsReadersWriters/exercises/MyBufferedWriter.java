package ba.bitcamp.w10d02_StreamsReadersWriters.exercises;

import java.io.IOException;
import java.io.OutputStream;

public class MyBufferedWriter {

	private OutputStream stream;

	public MyBufferedWriter(OutputStream stream) {
		super();
		this.stream = stream;
	}
	
	public void write(char c){
		try {
			stream.write(c);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void write(int n){
		try {
			stream.write(n);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void write(String str){
		for (int i = 0; i < str.length(); i++) {
			try {
				stream.write(str.charAt(i));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void close(){
		try {
			stream.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void flush(){
		try {
			stream.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void newLine(){
		try {
			stream.write(10);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
