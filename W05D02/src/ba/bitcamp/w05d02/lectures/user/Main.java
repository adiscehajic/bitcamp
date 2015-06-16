package ba.bitcamp.w05d02.lectures.user;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("User count: " + User.userCount);
		
		User u = new User("John", "Doe");
		System.out.println("User count: " + User.userCount);
		
		User u2 = new User("Adis", "Cehajic");
		System.out.println("User count: " + User.userCount);
		
		u = u2;
		System.out.println(u.getName() + " " + u.getId());
		System.out.println(u2.getName() + " " + u2.getId());

		System.out.println(u.equals(u2));
		
	}
	
}
