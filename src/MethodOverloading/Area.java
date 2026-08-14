package MethodOverloading;

import java.util.Scanner;

public class Area {
	void calculateArea(int a) {
		System.out.println("AREA OF SQUARE ="+(a*a));
	}
	void calculateArea(int l,int w) {
		int mul=l*w;
		System.out.println("AREA OF RECTANGLE ="+mul);
		
	}
	void calculateArea(double r) {
		System.out.println("AREA OF CIRCLE ="+(3.141*(r*r)));
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Area b=new Area();
		System.out.println("ENTER SIDE OF SQUARE: ");
		b.calculateArea(sc.nextInt());
		System.out.println("ENTER L OF RECTANGLE: ");
		System.out.println("ENTER W OF RECTANGLE: ");
		b.calculateArea(sc.nextInt(),sc.nextInt());
		System.out.println("ENTER RADIUS OF CIRCLE: ");
		b.calculateArea(sc.nextDouble());
		

	}

}
