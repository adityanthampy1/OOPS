package Array;

public class Copy {

	public static void main(String[] args) {
		int[] arr1 = {10, 20, 30, 40, 50};
        int[] arr2 = new int[arr1.length];  //int[] arr2= new int[i]

        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }

        System.out.println("Copied Array:");
        for (int num : arr2) {
            System.out.print(num + " ,");
        }

	}

}
