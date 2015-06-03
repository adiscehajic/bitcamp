package exercises;

public class CreatingArray {

	public static void main(String[] args) {
		
		int[] arr = new int[10];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 9 + 1);
		}
		
		for(int num : arr){
			System.out.println(num);
		}
		
	}

}
