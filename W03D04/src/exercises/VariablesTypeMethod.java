package exercises;

public class VariablesTypeMethod {

	public static String getType(String value) {

		Integer num = Integer.parseInt(value);
		Double num1 = Double.parseDouble(value);
		System.out.println(num1);
		
		return value;
	}

	public static void main(String[] args) {

		System.out.println(getType("2.14"));

	}

}
