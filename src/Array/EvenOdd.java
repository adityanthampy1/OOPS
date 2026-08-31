package Array;

public class EvenOdd {

	public static void main(String[] args) {
		int[] arr = {12, 7, 9, 14, 6, 3};

        System.out.println("Even Numbers:");
        for (int num : arr) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }

        System.out.println("\nOdd Numbers:");
        for (int num : arr) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
	}

}
