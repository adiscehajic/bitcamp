package ba.bitcamp.w05d02.exercises.task03;

public class Main {

	public static void main(String[] args) {

		Printer printerOne = new Printer();
		Printer printerTwo = new Printer("My printer");

		// System.out.println(printerOne);
		//
		// System.out.println(printerOne.getPagesPrinter());
		//
		// printerOne.putPaper(50);
		// printerTwo.putPaper(100);
		//
		// System.out.println(printerOne.getPaperCapacity());
		//
		// printerOne.putPaper(60);
		//
		// System.out.println(printerOne.getPaperCapacity());
		//
		// printerOne.fillToner();
		// printerTwo.fillToner();
		//
		// System.out.println(printerOne);
		//
		// printerOne.printPaper(1);
		// printerTwo.printPaper(10);
		//
		// System.out.println(printerOne);
		// System.out.println(printerTwo);
		//
		// System.out.println(Printer.getAmountPagesPrinted());
		//
		// System.out.println(printerTwo.getTonerCapacity());
		//
		// printerOne.printPaper(15);
		// printerTwo.printPaper(25);
		//
		// System.out.println(Printer.getAmountPagesPrinted());
		//
		// printerTwo.fillToner();
		//
		// printerTwo.printPaper(20);
		//
		// System.out.println(Printer.getAmountPagesPrinted());

		printerOne.fillToner();
		printerOne.putPaper(100);

		printerTwo.fillToner();
		printerTwo.putPaper(100);

		System.out.println(printerOne);
		System.out.println(printerTwo);
		
		Printer[] printers = new Printer[]{printerOne, printerTwo};
		
		PrinterNetwork printNet = new PrinterNetwork(printers);
		
		printNet.networkPrinting(34);
		
		System.out.println(Printer.getAmountPagesPrinted());
	}

}
