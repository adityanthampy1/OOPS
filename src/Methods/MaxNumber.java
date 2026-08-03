package Methods;

public class MaxNumber {
	public void findMax(int a,int b,int c) {
		if(a>b&&a>c) {
			System.out.println(a+ "LARGEST NUMBER");
		}else if(b>a&&b>c) {
			System.out.println(b+ "LARGEST NUMBER");
			
		}else {
			System.out.println(c+ "LARGEST NUMBER");
		}
	}

	public static void main(String[] args) {
		MaxNumber obj=new MaxNumber();
		obj.findMax(20, 40, 60);
		

	}

}
