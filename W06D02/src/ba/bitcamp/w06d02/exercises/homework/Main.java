package ba.bitcamp.w06d02.exercises.homework;

public class Main {

	public static void main(String[] args) {

		char[] macAddressOne = { '1', '2', '3', '4', '5', '6', '7', '8', '9',
				'A', 'B', 'C' };
		char[] macAddressTwo = { '2', 'B', '3', '4', '5', '6', '7', '8', '9',
				'A', 'B', 'C' };
		char[] macAddressThree = { '2', 'B', '3', '4', '5', 'T', '7', '5', 'G',
				'A', 'B', 'C' };

		Client clientOne = new Client("Test", macAddressOne);
		Client clientTwo = new Client("Test2", macAddressTwo);

		Server serverOne = new Server("Server one", macAddressThree, 2);

		clientOne.connect(serverOne);
		clientTwo.connect(serverOne);
		clientOne.disconnect();
		clientOne.connect(serverOne);

	}

}
