package Constructor;

public class Car {
	String make;
	String model;
	int price;
	
	Car(String make, String m, int p){
		this.make=make;
		model=m;
		price=p;
	}
	public void displayCarInfo() {
		System.out.println("NAME OF THE BRAND: "+ make);
		System.out.println("MODEL OF THE BIKE: "+model);
		System.out.println("PRICE: "+price);
	}

	public static void main(String[] args) {
		Car obj=new Car("BMW","G310",600000);
		obj.displayCarInfo();

	}

}
