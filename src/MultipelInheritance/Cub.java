package MultipelInheritance;

public class Cub implements Lion,Lioness {

	@Override
	public void roar() {
		System.out.println("LIONESS ROAR");
		
	}

	@Override
	public void hunt() {
		System.out.println("LION HUNT");
		
	}
	void eat() {
		System.out.println("CUB IS EATING");
	}


}
