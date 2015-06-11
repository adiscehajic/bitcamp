import java.util.Scanner;


public class GuessNumber {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int imaginedNum = (int) (Math.random() * 10);
		int guessNum = 0; 
		int counter = 0;
		int levelEasy = 5;
		int levelNormal = 3;
		int levelHard = 1;
		
		
		System.out.println(imaginedNum);
		
		System.out.println("Try to gues a number!");
		
		do{
			System.out.print("Input number: ");
			guessNum = in.nextInt();
			counter++;
		} while(imaginedNum != guessNum);
		
		System.out.printf("Congratulations! You have guess imagined number in %d times.", counter);
			
		in.close();
		
	}
	
	
}
