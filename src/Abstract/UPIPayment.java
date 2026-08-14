package Abstract;

public class UPIPayment extends Payment {

	@Override
	void makePayment() {
		System.out.println("Paid"+"$"+a+ " using UPI");
		
	}
	

}
