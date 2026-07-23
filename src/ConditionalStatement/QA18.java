package ConditionalStatement;

import java.util.Scanner;

public class QA18 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER: ");
		char vo=sc.next().charAt(0);
		
//		char vo='A';
		
		switch(vo) {
		
		case 'a' :
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("Vowel");
		break;
		default:
			System.out.println("Consonant");
			
		}

	}

}
