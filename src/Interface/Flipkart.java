package Interface;

public class Flipkart implements ECommerce{

	@Override
	public void placeOrder(String item, int quantity) {
		System.out.println("Order placed on Flipkart");
		System.out.println("Item:"+item +" Quantity: "+quantity);
		
	}

}
