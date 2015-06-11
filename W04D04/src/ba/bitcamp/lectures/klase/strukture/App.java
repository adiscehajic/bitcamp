package ba.bitcamp.lectures.klase.strukture;

import ba.bitcamp.lectures.klase.modeli.Person;
import ba.bitcamp.lectures.klase.modeli.Test;

/**
 *
 * @author adis.cehajic
 *
 */
public class App {

	public static void main(String[] args) {

		/*
		 *  Using arrays as a data structure
		 */
		
//		String[] person1 = { "Tarik", "Celik", "1986", "Jadranska", "A16F00A",
//				"187", "1", "Software Developer", "Pasta", "7UP",
//				"tarik.celik@bitcamp.ba", "+387 61 829 621" };
//		String[] person2 = { "John", "Doe", "1947", "Rodiceva", "A10000",
//				"213", "0", "Pekar", "Grah", "Boza", "john.doe@pekara.ba",
//				"+387 61 999 999" };
//
//		Test.getOlderPerson(person1, person2);

		/*
		 *  Using classes as a data structure
		 */
		
		Person per1 = new Person("Tarik", "Celik", 1986, "Jadranska", "A16F00A", "tarik.celik@bitcamp.ba", 1987, true, "Pasta", "7UP");
		Person per2 = new Person("John", "Doe", 1947, "Rodiceva", "A10000", "john.doe@pekara.ba", 213, false, "Grah", "Boza");
	
		Test.getOlderPersonObject(per1, per2);

		
	}

}
