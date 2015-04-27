package lesson150427.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SimpleCollectionsExamples {
	
	public static void main(final String[] args) {
		
		List<String> list = new ArrayList<String>();
		
		list.add("One");
		list.add("Two");
		list.add("Three");
		
		Collections.reverse(list);
		System.out.println(list);
		
		Collections.rotate(list, -1);
		
		System.out.println(list);
		
		
	}

}
