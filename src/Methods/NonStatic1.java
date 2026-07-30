package Methods;

public class NonStatic1 {
	public void hi() {
		System.out.println("Hello Adi");
	}

	public static void main(String[] args) {
		NonStatic1 obj=new NonStatic1();
		obj.hi();

	}

}
