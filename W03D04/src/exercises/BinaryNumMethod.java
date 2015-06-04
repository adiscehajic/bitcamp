package exercises;

public class BinaryNumMethod {

	public static boolean canBeBinary(int num) {
		try{
			Integer.parseInt(num + "", 2);
			return true;
		}catch (NumberFormatException e){
			return false;
		}
	}

	public static void main(String[] args) {

		System.out.println(canBeBinary(1112));
	}

}
