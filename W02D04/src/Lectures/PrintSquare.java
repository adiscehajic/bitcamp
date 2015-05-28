package Lectures;

public class PrintSquare {

	public static void main(String[] args) {
        String userInput;  // The number input by the user.
        //int square;     // The userInput, multiplied by itself.

        System.out.print("Please type a number: ");
        userInput = TextIO.getlnWord();
        //square = userInput * userInput;

        System.out.println();
        System.out.println("The number that you entered was " + userInput);
        System.out.println("The square of that number is " + userInput);
        System.out.println();
	}

}
