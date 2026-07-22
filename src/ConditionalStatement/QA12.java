package ConditionalStatement;

import java.util.Scanner;

public class QA12 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER NUMBER= ");
		int a=sc.nextInt();
		
		if(a>0){
			System.out.println("NUM IS POSITIVE");
		}else if(a<0) {
			System.out.println("NUM IS NEGETIVE");
		}else {
			System.out.println("NUM IS ZERO");
		}

	}

}
