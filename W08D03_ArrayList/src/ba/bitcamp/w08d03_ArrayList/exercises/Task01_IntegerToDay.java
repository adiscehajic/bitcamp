package ba.bitcamp.w08d03_ArrayList.exercises;

public class Task01_IntegerToDay {

	public static String getDay(int day) {
		try {
			String[] days = { "Mondey", "Thusday", "Wednesday", "Thursday",
					"Friday", "Saturday", "Sunday" };
			return days[day - 1];
		} catch (ArrayIndexOutOfBoundsException e) {
			return "Inputed day does not exist!";
		}
	}

	public static void main(String[] args) {

		System.out.println(getDay(1));

	}

}
