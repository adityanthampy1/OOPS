package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class QA1 {

	public static void main(String[] args) {
		ArrayList<String> color=new ArrayList<>();
		
		color.add("RED");
		color.add("BLUE");
		color.add("GREEN");
		color.add("YELLOW");
		
		System.out.println(color+",");
		System.out.println();
		
		System.out.println("INDEX 2: "+color.get(2));
		System.out.println();
		
		color.set(1, "Purple");
		System.out.println("EXCHANGE: "+color+",");
		System.out.println();
		
		color.remove(2);
		System.out.println("REMOVE: "+color+",");
		System.out.println();
		
		Collections.sort(color);
		System.out.println("alphabetical order: "+color+",");
		System.out.println();
		
		Collections.reverse(color);
		System.out.println("REVERSE: "+color+",");
		System.out.println();
		
        System.out.println("Iterating over elements:");
        for (String col : color) {
            System.out.print(col+",");
        }

	}

}
