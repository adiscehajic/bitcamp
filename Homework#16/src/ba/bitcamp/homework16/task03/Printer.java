package ba.bitcamp.homework16.task03;

public class Printer {

	// Declaring properties of printer
	private String name;
	private int paperCapacity;
	private int tonerCapacity;
	private int pagesPrinted;

	private static int amountPagesPrinted = 0;

	/**
	 * Constructor
	 */
	public Printer() {
		this.name = "DefaultPrinter";
		this.pagesPrinted = 0;
	}

	/**
	 * Constructor
	 * 
	 * @param name
	 */
	public Printer(String name) {
		this.name = name;
		this.paperCapacity = 0;
		this.tonerCapacity = 0;
		this.pagesPrinted = 0;
	}

	/**
	 * Prints the information about printer.
	 */
	public String toString() {
		String status = "";
		if (paperCapacity > 0 && tonerCapacity > 0) {
			status = "Ready";
		} else if (paperCapacity == 0 && tonerCapacity > 0) {
			status = "No paper";
		} else if (paperCapacity > 0 && tonerCapacity == 0) {
			status = "No ink";
		} else {
			status = "No ink nor paper";
		}

		String s = "";
		s = "Name: " + name + "\n";
		s += "Status: " + status + "\n";

		return s;
	}

	/**
	 * Calculates if there is toner in printer.
	 * 
	 * @return True if the printer have toner and false if the printer has not
	 *         toner.
	 */
	public boolean hasToner() {
		if (this.tonerCapacity > 0) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Calculates if there is paper in printer.
	 * 
	 * @return True if the printer have paper and false if the printer has not
	 *         paper.
	 */
	public boolean hasPaper() {
		if (this.paperCapacity > 0) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Prints the amount of paper that printer has printed.
	 * 
	 * @return - Amount of paper that printer has printed.
	 */
	public int getPagesPrinter() {
		return this.pagesPrinted;
	}

	/**
	 * Inputs paper into the printer.
	 * 
	 * @param number
	 *            - Amount of paper that user want to putt.
	 */
	public void putPaper(int number) {
		if (this.paperCapacity + number < 100) {
			this.paperCapacity += number;
		} else {
			this.paperCapacity = 100;
		}

	}

	/**
	 * Fills toner to the max.
	 */
	public void fillToner() {
		this.tonerCapacity = 100;
	}

	/**
	 * Prints information about paper capacity.
	 * 
	 * @return
	 */
	public int getPaperCapacity() {
		return paperCapacity;
	}

	public int getTonerCapacity() {
		return tonerCapacity;
	}

	/**
	 * Prints paper from the printer.
	 * 
	 * @param number
	 *            - Amount of paper that we want to print.
	 */
	public void printPaper(int number) {

		// Checks if the capacity of paper and toner is larger than 0 after
		// printing amount of paper that user want.
		if (paperCapacity - number > 0 && tonerCapacity - (number * 3) > 0) {
			this.paperCapacity -= number;
			this.tonerCapacity -= (number * 3);
			this.pagesPrinted += number;
			amountPagesPrinted += number;
			// If the capacity of paper is not enough prints until it has paper
			// and than throws exception and prints message
		} else if (paperCapacity - number < 0) {
			try {
				amountPagesPrinted += number - paperCapacity;
				this.pagesPrinted += number - paperCapacity;
				this.paperCapacity = 0;
				this.tonerCapacity -= (number * 3);
				throw new IllegalArgumentException();
			} catch (IllegalArgumentException ex) {
				System.out.println("No more paper! Please insert some!\n");
			}
			// If the capacity of toner is not enough prints until it has toner
			// and than throws exception and prints message
		} else if (tonerCapacity - (number * 3) < 0) {
			try {
				this.paperCapacity -= tonerCapacity / 3;
				this.pagesPrinted += tonerCapacity / 3;
				amountPagesPrinted += tonerCapacity / 3;
				this.tonerCapacity = 0;
				throw new IllegalArgumentException();
			} catch (IllegalArgumentException ex) {
				System.out.println("No more ink! Please insert some!\n");
			}
		}

	}

	/**
	 * Calculates the amount of printed pages of all printers.
	 * 
	 * @return Number of printed pages of all printers.
	 */
	public static int getAmountPagesPrinted() {
		return amountPagesPrinted;
	}

}
