package MethodOverriding;

public class mainBank {

	public static void main(String[] args) {
		Payment p;
		p=new UPI();
		p.pay(100);
		System.out.println();
		p=new Card();
		p.pay(200);
		System.out.println();
		p=new NetBank();
		p.pay(500);

	}

}
