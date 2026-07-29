package Constructor;

public class Book {
	String name;
	String title;
	String price;
	
	Book(){
		name="Adi";
		title="Coding";
		price="40000";		
	}
	public void 	display() {
		System.out.println("NAME= "+name);
		System.out.println("TITLE= "+title);
		System.out.println("PRICE= "+price);
	}

	public static void main(String[] args) {
		Book obj=new Book();
		obj.display();

	}

}
