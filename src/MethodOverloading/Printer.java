package MethodOverloading;

public class Printer {
	void printValue(int a) {
		System.out.println("PRINT INTIGER VALUE: "+a);
	}
	void printValue(double a) {
		System.out.println("PRINT DOUBLE VALUE: "+a);
		
	}
	void printValue(String text) {
		System.out.println("PRINTS STRINGS VALUE: "+text);
		
	}
	void printValue(boolean flag) {
		System.out.println("PRINTS BOOLEAN VALUE: "+flag);
		
		
	}

	public static void main(String[] args) {
		Printer p=new Printer();
		p.printValue(6);
		p.printValue(6.7);
		p.printValue("ADI");
		p.printValue(true);
	}

}
