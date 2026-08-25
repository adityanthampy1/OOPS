package Encapsulation;

public class mainEmployee {

	public static void main(String[] args) {
		Employee e=new Employee();
		e.setId(101);
		e.setSal(20000);
		System.out.println("EMPID: "+e.getId());
		System.out.println("SALARY: "+"$"+e.getSal());
	}

}
