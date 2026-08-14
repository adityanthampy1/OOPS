package Abstract;

public class mainPayment {

	public static void main(String[] args) {
		Payment c=new CreditCardPayment();
		c.payment();
		c.makePayment();
		System.out.println();
		Payment u=new UPIPayment();
		u.payment();
		u.makePayment();

	}

}
