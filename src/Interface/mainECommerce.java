package Interface;

public class mainECommerce {

	public static void main(String[] args) {
		ECommerce a=new Amazon();
		a.placeOrder("PEN", 200);
		System.out.println();
		ECommerce f=new Flipkart();
		f.placeOrder("PAPER", 100);

	}

}
