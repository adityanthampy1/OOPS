package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class QA2 {

	public static void main(String[] args) {
		ArrayList<Integer> num=new ArrayList<>();
		num.add(89);
		num.add(78);
		num.add(56);
		num.add(45);
		num.add(199);
		System.out.println(num);
		System.out.println();
		System.out.println("INDEX 4: "+num.get(4));
		System.out.println();
		
		num.add(2, 200);
		System.out.println("INSERT: "+num);
		
		num.remove(1);
		System.out.println("REMOVE: "+num);
		System.out.println();
		
		System.out.println("Iterating over elements:");
        for (int number : num) {
            System.out.print(number+",");
        }
        System.out.println();
        
        Collections.sort(num);
        System.out.println("alphabetical order: "+num);
        System.out.println();
        
        Collections.reverse(num);
        System.out.println("REVERSE: "+num);
	}
}



