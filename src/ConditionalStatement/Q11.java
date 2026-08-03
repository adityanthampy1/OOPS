package ConditionalStatement;

import java.util.Scanner;

public class Q11 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER FIRST NUM = ");
		int a=sc.nextInt();
		System.out.println("ENTER SECOND NUM = ");
		int b=sc.nextInt();
		System.out.println("ENTER THIRD NUM =");
		int c=sc.nextInt();
		
		if(a>b&&a>c) {
			System.out.println(a+ " is Greater");
		}else if(b>a&&b>c) {
			System.out.println(b+" is Greater");
		}else {
			System.out.println(c+" is Greater");
		}
		

	}

}
