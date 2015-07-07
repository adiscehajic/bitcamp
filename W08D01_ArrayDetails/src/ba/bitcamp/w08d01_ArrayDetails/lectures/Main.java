package ba.bitcamp.w08d01_ArrayDetails.lectures;

public class Main {

	private static double sumParams(double... params){
		int sum = 0;
		for(int i = 0; i < params.length; i ++){
			sum += params[i];
		}
		return sum;
	}
	
	/**
	 * Adds all elements of 
	 * @param params
	 * @return
	 */
	private static String stringify(Object... params){
		StringBuilder sb = new StringBuilder();
		for(Object s: params){
			sb.append(s);
		}
		return sb.toString();
	}

	public static void main(String[] args) {

		System.out.println(sumParams(1, 2, 3, 4, 5));
		System.out.println(sumParams(4.3, 5.3));
		System.out.println(sumParams(new double[]{1, 2, 3, 4, 5, 6}));
		
		System.out.println(stringify("A", "D", "I", "S"));
		System.out.println(stringify(1, 2, 3, 4, 5, 6));
		
	}
}
