package ba.bitcamp.w06d01.exercises;

public class CampStringBuilder {

	private char[] array;
	
	public CampStringBuilder(){
		array = new char[0];
	}
	
	
	public String toString(){
		String s = "";
		
		for (int i = 0; i < array.length; i++) {
			s += array[i];
		}
		
		return s;
	}
	
	public void append(Object o){
		String s = o.toString();
		
		char[] tempArray = new char[array.length + s.length()];
		
		for (int i = 0; i < array.length; i++) {
			tempArray[i] = array[i];
		}
		
		for (int i = 0; i < s.length(); i++) {
			tempArray[i + array.length] = s.charAt(i);
		}
		
		array = tempArray;
		
	}
	
	
	public void prepend(Object o){
		String s = o.toString();
		
		char[] tempArray = new char[array.length + s.length()];
		
		for (int i = 0; i < s.length(); i++) {
			tempArray[i] = s.charAt(i);
		}
		
		for (int i = 0; i < array.length; i++) {
			tempArray[i + s.length()] = array[i];
		}
		

		
		array = tempArray;
	}
}
