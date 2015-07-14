package ba.bitcamp.w09d01_LinkedDataStructures.lectures;

import java.util.Scanner;

public class ListOfNumbers {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		Node head = null;
		Node last = null;

		System.out.println("Input positiv numbers: ");
		while (true) {
			int n = in.nextInt();
			if (n > 0) {
				Node newNode = new Node(n);
				if (head == null && last == null) {
					head = newNode;
					last = newNode;
				} else {
					last.setNext(newNode);
					last = newNode;
				}
			} else {
				break;
			}
		}

		int length = 0;
		int sum = 0;
		Node currentNode = head;

		while (currentNode != null) {
			length++;
			sum += currentNode.getValue();
			currentNode = currentNode.getNext();
		}
		
		System.out.printf("You have inputed %d number of positiv numbers and their sum is %d.", length, sum);

		in.close();
	}

}
