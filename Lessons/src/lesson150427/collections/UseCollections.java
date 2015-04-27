package lesson150427.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UseCollections {
	
	public static void main(final String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("One");
		list.add("Two");
		list.add("Three");
		
		
		broadcast(Collections.unmodifiableList(list), "Hello");
		
		
	}

	private static void broadcast(final List<String> list, final String message) {
		for (String userName : list) {
			System.out.println(userName + " > " + message);
		}
		list.add("Drakula");
		list.clear();
	}
	
	

	private List<String> _list;
	
	/** 
	 * 
	 * @return  unmodifiable list
	 */
	public List<String> getUserList() {
		return Collections.unmodifiableList(_list);
	}

}
