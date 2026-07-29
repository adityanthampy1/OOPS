package Methods;

public class MathOperation {

    public static void multiplyNumbers(int a, int b) {
        System.out.println("Multiplication = " + (a * b));
    }

    public void addNumbers(int a, int b) {
        System.out.println("Addition = " + (a + b));
    }

    public static void main(String[] args) {

        multiplyNumbers(10, 5);

        MathOperation obj = new MathOperation();

        obj.addNumbers(10, 5);
    }
}
	


