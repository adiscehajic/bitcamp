package ba.bitcamp.w05d02.exercises.task03;

public class PrinterNetwork {

	private Printer[] printers;

	public PrinterNetwork(Printer[] printers) {
		this.printers = printers;
	}

	public void networkPrinting(int number) {

		int pagesPrinted = 0;

		for (int i = 0; i < printers.length; i++) {
			for (int j = 1; j <= number - pagesPrinted; j=1) {

					while (printers[i].getPaperCapacity() > 0
							&& printers[i].getTonerCapacity() > 0) {
						printers[i].printPaper(j);
						pagesPrinted++;
						
					}

			
			}
		}

	}

}
