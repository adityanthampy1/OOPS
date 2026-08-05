package MethodOverloading;

public class Calculator {
	void add(int a,int b) {
		System.out.println("SUM OF 2 INTIGERS = "+(a+b));
		
	}
	void add(double a, double b) {
		System.out.println("SUM OF DOUBLE VALUE = "+(a+b));
	}
	void add(int a,int b,int c) {
		System.out.println("SUM OF 3 INTIGERS = "+(a+b+c));
		
	}
	void add(String a,String b) {
		System.out.println("PERSON 1: "+a);
		System.out.println("PERSON 2: "+b);
		
	}
	public static void main(String[]args) {
		Calculator c=new Calculator();
		c.add(12, 8);
		c.add(2.5, 6.8);
		c.add(8, 66, 31);
		c.add("ADI", "AVI");
		
	}
}
