package ConditionalStatement;

import java.util.Scanner;

public class QA9 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter mark = ");
		int a=sc.nextInt();
		
		if(90<=a) {
			System.out.println("A+");
		}else if(a>=80) {
			System.out.println("A");
			
		}else if(a>=70){
			System.out.println("B");
			
		}else if(a>=60) {
			System.out.println("C");
		}else {
			System.out.println("FAIL");
		}
		

	}

}
