package ConditionalStatement;

import java.util.Scanner;

public class QA15 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER YOUR AGE= ");
		int age=sc.nextInt();
		//boolean mem=false;
		
		if(age>=18) {
			System.out.println("Entry Allowed");
		System.out.println("DO YOU HAVE MEMBERSHP CARD= ");
		boolean mem=sc.nextBoolean();
			if(mem==true) {
				System.out.println("Entry Allowed");
			}else {
				System.out.println("Entry Denied");
			}
		}
			else {
		System.out.println("Entry Denied");
		
			}
	}

}
