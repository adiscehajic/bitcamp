package task01;

public class CampStringBuilder {

	private char[] characters;
	
	
	public CampStringBuilder(char[] characters){
		super();
		this.characters = characters;
	}
	
	
	public void append(Object o){
		
		String str = "";
		
		for (int i = 0; i < characters.length; i++) {
			str += characters[i]; 
		}
		
		str += " " + o.toString(); 
			
		System.out.println(str);
	}
	
	public void preppend(Object o){
		
		String str = "";
		
		for (int i = 0; i < characters.length; i++) {
			str += characters[i]; 
		}
		
		str = o.toString() + " " + str; 
			
		System.out.println(str);
	}
	
	public String toString(){
		
		String str = "";
		
		for (int i = 0; i < characters.length; i++) {
			str += characters[i]; 
		}
			
		return str;
	}
	
	
	
	
}