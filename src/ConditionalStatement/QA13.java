package ConditionalStatement;

public class QA13 {

	public static void main(String[] args) {
		int a=-2;
		
		if(a>=0) {
			System.out.println("NUM IS POSITIVE");
			if(a%2==0){
				System.out.println("NUM IS EVEN");
				
			}else {
				System.out.println("NUM IS ODD");
			}
		}else {
			System.out.println("NUM IS NEGETIVE");
		}
	}

}
