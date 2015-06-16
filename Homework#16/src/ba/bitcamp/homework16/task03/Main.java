package ba.bitcamp.homework16.task03;

public class Main {

	public static void main(String[] args) {

		// Creating objects printer
		Printer printerOne = new Printer();
		Printer printerTwo = new Printer("My printer");

		// Printing information about first and second printer
		System.out.println(printerOne);
		System.out.println(printerTwo);

		// Putting paper and toner into printers
		printerOne.putPaper(50);
		printerTwo.putPaper(100);
		printerOne.fillToner();
		printerTwo.fillToner();

		// Printing information about first and second printer
		System.out.println(printerOne);
		System.out.println(printerTwo);

		// Printing pages from first and second printer
		printerOne.printPaper(1);
		printerTwo.printPaper(10);

		// Checking status of paper in both printers
		System.out.println("Paper capacity: " + printerOne.getPaperCapacity());
		System.out.println("Paper capacity: " + printerTwo.getPaperCapacity() + "\n");

		// Checking the amount of printed pages of all printers
		System.out.println("Amount of all printer pages is: "
				+ Printer.getAmountPagesPrinted() + "\n");

		// Printing again pages from first and second printer
		printerOne.printPaper(35);
		printerTwo.printPaper(10);

		// Checking the amount of printed pages of all printers
		System.out.println("Amount of all printer pages is: "
				+ Printer.getAmountPagesPrinted() + "\n");
		
		// Checking the status of toner in printer one
		System.out.println("Is there a toner in printer? " + printerOne.hasToner());

	}

}
