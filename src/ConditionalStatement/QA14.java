package ConditionalStatement;

import java.util.Scanner;

public class QA14 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER MARKES= ");
		int a=sc.nextInt();
		
		System.out.println("ENETER MATH MARKS= ");
		int b=sc.nextInt();
		
		if(a>=80){
			System.out.println("Eligible");
			if(b>=75) {
				System.out.println("Eligible");
			}else {
				System.out.println("Not Eligible");
			}
		}else {
			System.out.println("Not Eligible");
		}

	}

}
