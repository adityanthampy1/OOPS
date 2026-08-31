package Array;

public class AscendingOrder {

	public static void main(String[] args) {
		int[] arr = {9,1, 3, 5, 7,8};   
        boolean sorted = true;     

        for (int i = 0; i < arr.length - 1; i++) {
         
            if (arr[i] > arr[i + 1]) {   
                sorted = false;  
                break;
            }
        }

        if (sorted)
            System.out.println("Array is sorted in ascending order");
        else
            System.out.println("Array is NOT sorted in ascending order");

	}

}
