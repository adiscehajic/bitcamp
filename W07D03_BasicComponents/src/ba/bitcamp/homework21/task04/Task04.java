package ba.bitcamp.homework21.task04;

import javax.swing.JOptionPane;

public class Task04 {

	public static void main(String[] args) {

		int number;
		int sum = 0;

		try {

			String str = JOptionPane.showInputDialog("Input number: ");
			if (str.equals(null)) {
				System.exit(0);
			}

			number = Integer.parseInt(str);
			sum += number;

			int choice = JOptionPane.showConfirmDialog(null,
					"Would you like to input another number?");
			if (choice == JOptionPane.NO_OPTION) {
				JOptionPane.showMessageDialog(null, sum);
				System.exit(0);
			} else if (choice == JOptionPane.CANCEL_OPTION) {
				System.exit(0);
			}

			do {
				String str2 = JOptionPane.showInputDialog("Input number: ");
				if (str2.equals(null)) {
					throw new NullPointerException();
				}

				number = Integer.parseInt(str2);
				sum += number;

				choice = JOptionPane.showConfirmDialog(null,
						"Would you like to input another number?");
				if (choice == JOptionPane.NO_OPTION) {
					JOptionPane.showMessageDialog(null, sum);
					System.exit(0);
				} else if (choice == JOptionPane.CANCEL_OPTION) {
					JOptionPane.showMessageDialog(null, sum);
					System.exit(0);
				}

			} while (choice == JOptionPane.YES_OPTION);
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Inputed wrong number format!");
			System.exit(0);
		} catch (NullPointerException ek) {
			JOptionPane.showMessageDialog(null, sum);
			System.exit(0);
		}
	}

}
