package MethodOverloading;

import java.util.Scanner;

public class Area {
	void calculateArea(int a) {
		System.out.println("AREA OF SQUARE ="+(a*a));
	}
	void calculateArea(int l,int w) {
		System.out.println("AREA OF RECTANGLE ="+(l*w));
		
	}
	void calculateArea(double r) {
		System.out.println("AREA OF CIRCLE ="+(3.141*(r*r)));
	}
	public static void main(String[] args) {
		Area b=new Area();
		b.calculateArea(5);
		b.calculateArea(4, 16);
		b.calculateArea(6.9);
		

	}

}
