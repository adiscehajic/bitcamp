package ba.bitcamp.w05d03.exercises.speaker;

public class Main {

	public static void main(String[] args) {

		// Creating object speaker
		Speaker speakerOne = new Speaker("Samsung", 50, 2);

		// Printing speaker status
		System.out.println(speakerOne);

		// Enabling speaker
		speakerOne.enable();

		// Increasing speaker volume
		speakerOne.increaseVolume();

		// Printing speaker status
		System.out.println(speakerOne);

		// Lowering speaker volume
		speakerOne.lowerVolume();
		speakerOne.lowerVolume();

		// Printing speaker status
		System.out.println(speakerOne);

	}

}
