package MethodOverloading;

public class Employee {
	void dispaly(int id) {
		System.out.println(id);
	}
	void display(int id,String name) {
		System.out.println(id+" "+name);
	}
	void dispaly(int id, String name,int sal) {
		System.out.println(id+" "+name+" "+"$"+sal);
		
	}

	public static void main(String[] args) {
		Employee e=new Employee();
		e.dispaly(101);
		e.display(112, "ANVI");
		e.dispaly(103, "ADI", 5000000);

	}

}
