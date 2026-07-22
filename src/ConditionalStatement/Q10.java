package ConditionalStatement;

import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter temperature= ");
		int a=sc.nextInt();
		
		if(a>=30) {
			System.out.println("HOT");
		}else if(a>=20) {
			System.out.println("WARM");
		}else if(a>=10) {
			System.out.println("COLD");
		}else {
			System.out.println("VERY COLD");
		}
		

	}

}
