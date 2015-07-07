package ba.bitcamp.w08d02_ArrayProcessing.exercises;
public class StringFormat {

	public static void main(String[] args) {

		System.out.println(format("%dAdis %f je %s zakon%b%b", 1, 2.0, "ADIS", true, 5));

	}

	public static String format(String str, Object... o) {
		int counter = 0;
		String newString = "";

//		for (int j = 0; j < str.length(); j++) {
//			newString = "" + o[counter];
//			if (j < str.length() - 2) {
//				if (str.substring(j, j + 2).equals("%b")) {
//
//					
//					str = str.substring(0, j) + newString
//							+ str.substring(j + 2, str.length());
//					counter++;
//				}
//			} else {
//				newString = "" + o[counter];
//				str = str.substring(0, str.length() - 2) + newString;
//			}
//		}
		
		for (int j = 0; j < str.length(); j++) {
			
			if (j < str.length() - 2) {
				if (str.substring(j, j + 2).equals("%d") && (o[counter] instanceof Integer)) {
					newString = "" + o[counter];
					
					str = str.substring(0, j) + newString
							+ str.substring(j + 2, str.length());
					counter++;
				} 
				if (str.substring(j, j + 2).equals("%f") && (o[counter] instanceof Double)) {
					newString = "" + o[counter];
					
					str = str.substring(0, j) + newString
							+ str.substring(j + 2, str.length());
					counter++;
				} 
				if (str.substring(j, j + 2).equals("%s") && (o[counter] instanceof String)) {
					newString = "" + o[counter];
					
					str = str.substring(0, j) + newString
							+ str.substring(j + 2, str.length());
					counter++;
				} 
				if (str.substring(j, j + 2).equals("%b") && (o[counter] instanceof Boolean)) {
					newString = "" + o[counter];
					
					str = str.substring(0, j) + newString
							+ str.substring(j + 2, str.length());
					counter++;
				}		
			} else {
				newString = "" + o[counter];
				str = str.substring(0, str.length() - 2) + newString;
			}
		}

		return str;

	}

}
