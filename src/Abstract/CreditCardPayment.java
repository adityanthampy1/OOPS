package Abstract;

public class CreditCardPayment extends Payment{

	@Override
	void makePayment() {
		System.out.println("Paid"+"$"+a+ " using Credit Card");
		
	}
	

}
