package Constructor;

import java.util.Scanner;

public class Circle {
	Scanner sc=new Scanner(System.in);
	double r;
	Circle(){
	System.out.println("ENTER RADIUS= ");
	r=sc.nextDouble();
	}
	public double calculateArea() {
	return 3.14*r*r;
	}

	public static void main(String[] args) {
		Circle obj=new Circle();
		System.out.println("Area: "+obj.calculateArea());

	}

}
