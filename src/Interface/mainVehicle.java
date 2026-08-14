package Interface;

public class mainVehicle {

	public static void main(String[] args) {
		Car a=new Car();
		a.start();
		a.refuel(20);
		System.out.println();
		Bike b=new Bike();
		b.start();
		b.refuel(15);

	}

}
