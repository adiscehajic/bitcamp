package ba.bitcamp.w08d02_ArrayProcessing.exercises;

public class DynamicDouble {

	private double myArray[];
	private int count;

	public DynamicDouble(int n, double value) {
		super();
		myArray = new double[n];
		count = n;
		for (int i = 0; i < myArray.length; i++) {
			myArray[i] = value;
		}
	}

	public DynamicDouble(int n) {
		this(n, 0.0);
		count = 0;
	}

	public DynamicDouble() {
		this(8);
	}

	public void addElement(double element) {
		if (count >= myArray.length) {
			double temp[] = myArray;
			myArray = new double[myArray.length * 2 + 1];

			for (int i = 0; i < temp.length; i++) {
				myArray[i] = temp[i];
			}
			myArray[count] = element;
			count++;

		} else if (count < myArray.length) {
			myArray[count] = element;
			count++;
		}
	}

	public void addArrayOfElements(double[] array) {
		for (int i = 0; i < array.length; i++) {
			addElement(array[i]);
		}
	}

	public int size() {
		return count;
	}

	public int totalSize() {
		return myArray.length;
	}

	public String toString() {
		String str = size() + "\t[ ";
		for (int i = 0; i < count - 1; i++) {
			str += myArray[i] + ", ";
		}

		str += myArray[count - 1] + " ]\n" + totalSize() + "\t[ ";

		for (int i = 0; i < myArray.length - 1; i++) {
			str += myArray[i] + ", ";
		}
		str += myArray[myArray.length - 1] + " ]";

		return str;
	}

	public void removeQuick(int offset) throws IndexOutOfBoundsException {

		if (count == 0) {
			throw new IndexOutOfBoundsException();
		}

		if (offset >= count) {
			throw new IndexOutOfBoundsException();
		}

		myArray[offset] = myArray[count - 1];
		count--;
		
		if (count <= myArray.length / 3) {
			double[] temp = new double[totalSize()/2];
			for (int i = 0; i < temp.length; i++) {
				temp[i] = myArray[i];
			}
			myArray = temp;
		}

	}
	
	public void removeSlow(int offset){
		
		
		
		
	}

	public static void main(String[] args) {

		DynamicDouble array = new DynamicDouble(5, 2.0);

		array.addElement(2.5);
		array.addElement(15);

		System.out.println(array.toString());
		
		array.removeQuick(0);
		System.out.println(array.toString());
		
		array.addElement(13);
		System.out.println(array.toString());
		
		array.removeQuick(0);
		array.removeQuick(1);
		array.removeQuick(2);
		array.removeQuick(0);
		array.removeQuick(2);
		System.out.println(array.toString());
		
		
	}

}
