package Methods;

public class StaticMethod {
//	public static void call() {
//		System.out.println("Hello World");
//	}
//
//	public static void main(String[] args) {
//		call();
//
//	}
	static int staticCount=0;
	int nonstaticCount=1;
	
	public static void incrementStatic() {
		staticCount++;
		System.out.println("Static Count : "+staticCount);
	}
	
	public void incrementNonstatic() {
		nonstaticCount++;
		System.out.println("Nonstatic Count: "+nonstaticCount);
	}

}
