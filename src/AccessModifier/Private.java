package AccessModifier;

public class Private {
	private int a=200;
	
	private void show() {   
        System.out.println("Private Method");

	}	
	public static void main(String[] args) {
		Private obj=new Private();
		obj.show();

	}

}
