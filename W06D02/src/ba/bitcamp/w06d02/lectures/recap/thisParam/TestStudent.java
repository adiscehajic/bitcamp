package ba.bitcamp.w06d02.lectures.recap.thisParam;

public class TestStudent {

	public static void main(String[] args) {

		int[] ocjene = new int[] { 1, 2, 3 };
		Student st = new Student("Test", ocjene);

//		Student st2 = new Student("Test2", 1, 2, 3);
//
//		Student st3 = new Student("Test");
		
		System.out.println("Prosjecna static: " + Student.prosjecnaStaticOcjena(st));
		System.out.println(st.toString());
		System.out.println("Prosjecna instance: " + st.prosjecnaInstanceOcjena());
	}

}
