package lesson150427.collections;

import java.util.NavigableMap;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(final String[] args) {
		
		NavigableMap<String, String> calls = new TreeMap<>();
		
		calls.put("01:23", "23434");
		calls.put("11:20", "23422");
		calls.put("11:23", "12312");
		calls.put("02:00", "12345");
		calls.put("13:40", "54321");
		calls.put("16:50", "12345");
		calls.put("05:00", "23423");

		System.out.println(calls.ceilingKey("10:00"));
		
		System.out.println(calls.headMap("12:00"));
		
		System.out.println(calls.tailMap("15:00"));
		
		System.out.println(calls.subMap("02:00", true, "05:00", true));
		
		for (String key : calls.keySet()) {
			System.out.println(key);
		}
	}
	
}
