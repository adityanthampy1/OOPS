package Constructor;

public class Person {
	String name;
	int age;
	
	Person(){
		name="Adi";
		age=22;
	}
	public void greeting() {
		System.out.println("Hello "+name);
		System.out.println("Age "+age);
	}

	public static void main(String[] args) {
		Person obj=new Person();
		obj.greeting();

	}

}
