package MethodOverloading;

public class Bank {
	void deposit(int amount) {
		System.out.println("TOTAL BALNACE: "+"$"+amount);
	}
	void deposit(int amount,int acc) {
		System.out.println("CASH AMOUNT: "+"$"+amount);
		System.out.println("ACCOUNT NUMBER: "+acc);
	}
	void deposit(int amount,int acc,String Dname) {
		System.out.println("CASH AMOUNT: "+"$"+amount);
		System.out.println("ACCOUNT NUMBER: "+acc);
		System.out.println("DEPOSITER NAME: "+Dname);
	}
	public static void main(String[] args) {
		Bank b=new Bank();
		b.deposit(5000000);
		b.deposit(4000, 686543229);
		b.deposit(70000000, 736545467, "ADI");
		
	}

}
