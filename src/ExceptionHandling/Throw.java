package ExceptionHandling;

public class Throw {

	public static void main(String[] args) {
		int age=15;
		if(age<18) {
			throw new IllegalArgumentException("Access denied - You must be 18+");
			
		}
		System.out.println("WELCOME");
	}

}
