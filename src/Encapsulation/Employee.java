package Encapsulation;

public class Employee {
	private int empid;
	private int salary;
	
	public void setId(int empid) {
		this.empid=empid;
	}
	public void setSal(int salary) {
		this.salary=salary;
	}
	public int getId() {
		return empid;
	}
	public int getSal() {
		return salary;
	}

}
