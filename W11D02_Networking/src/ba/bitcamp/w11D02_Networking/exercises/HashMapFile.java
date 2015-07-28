package ba.bitcamp.w11D02_Networking.exercises;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Random;
import java.util.Set;
import java.util.StringTokenizer;

public class HashMapFile {

	public static HashMap<String, String> hmap = new HashMap<String, String>();

	public static void main(String[] args) {

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
		
		
		System.out.println(getRandomIP(hmap));

	}
	
	public static String getRandomIP(HashMap<String, String> hmap) {
		
		Random rand = new Random();
		
		Set<String> set = hmap.keySet();
		
		Object[] array = set.toArray();
		
		return (String) array[rand.nextInt(array.length)];
	}
	
	public static String getName(String address){
		return hmap.get(address);
	}
}
