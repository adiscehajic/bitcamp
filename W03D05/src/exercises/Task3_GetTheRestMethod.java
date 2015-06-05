package exercises;

public class Task3_GetTheRestMethod {

	public static String getTheRest(String s1, String s2){
		String s3 = "";
		
		s3 = s1.substring((s1.indexOf(s2.charAt(0))), s1.length());
		
		return s3;
		
	}
	
	
	public static void main(String[] args) {
	

		
		System.out.println(getTheRest("Boolean", "ole"));
		
	}
}
