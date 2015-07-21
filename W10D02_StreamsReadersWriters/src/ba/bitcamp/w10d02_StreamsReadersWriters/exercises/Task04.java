package ba.bitcamp.w10d02_StreamsReadersWriters.exercises;

import java.util.Arrays;

public class Task04 {

	public static void main(String[] args) {
		
		MyBufferedWriter mbw = new MyBufferedWriter(System.out);
		
//		mbw.write('D');
//		mbw.newLine();
//		mbw.write('E');
//		
//		mbw.flush();
		
		MyBufferedReader mbr = new MyBufferedReader(System.in);
		
		//System.out.println(mbr.readLine());
		
		char[] array = new char[10];
		char[] array2 = new char[10];
		
		//System.out.println(mbr.read(array));
		System.out.println(mbr.read(array2, 2, 5));
		System.out.println(Arrays.toString(array));
		System.out.println(Arrays.toString(array2));
		
	}
}
