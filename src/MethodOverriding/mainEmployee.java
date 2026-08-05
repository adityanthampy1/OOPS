package MethodOverriding;

public class mainEmployee {

	public static void main(String[] args) {
		Employee e;
		e=new Manager();
		e.calculateSalary();
		System.out.println();
		e=new Developer();
		e.calculateSalary();

	}

}
