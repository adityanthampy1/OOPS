package Constructor;

public class Book1 {
	String name;
	String title;
	int price;
	
	Book1(String n,String title, int p){
		name=n;
		this.title=title;
		price=p;		
	}
	public void displayDetails(){
		System.out.println("NAME OF THE AUTHOR: "+name);
		System.out.println("TITLE OF THE BOOK: "+title);
		System.out.println("PRICE OF THE BOOK: "+price);
	}

	public static void main(String[] args) {
		Book1 obj=new Book1("Adi","Testing",30000);
		obj.displayDetails();

	}

}
