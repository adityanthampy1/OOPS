package MethodOverriding;

public class mainPerson {

	public static void main(String[] args) {
		Person p;
		p=new Teacher();
		p.showRole();
		System.out.println();
		p=new Student();
		p.showRole();

	}

}
