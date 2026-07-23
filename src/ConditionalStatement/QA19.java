package ConditionalStatement;

import java.util.Scanner;

public class QA19 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENETER FIRST NUMBER: ");
		int a=sc.nextInt();
		System.out.println("ENETER SECOND NUMBER: ");
		int b=sc.nextInt();
		System.out.println("SELECT OP(+,-,*,/)");
		char op=sc.next().charAt(0);	
		
//		int a=2;
//		int b=3;
//		char op='+';
		
		switch(op) {
		case '+':
			System.out.println(a+b);
			break;
		case '-':
			System.out.println(a-b);
			break;
		case '*':
			System.out.println(a*b);
			break;
		case '/':
			System.out.println(a/b);
			break;
		default:
			System.out.println("INVALID");
			
		}

	}

}
