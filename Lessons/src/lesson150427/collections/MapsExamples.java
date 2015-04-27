package lesson150427.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapsExamples {
	
	public static void main(final String[] args) {
		
//		Map<String, String> addresses = new HashMap<>();
		Map<String, String> addresses = new LinkedHashMap<>();
		
		addresses.put("Petrov", "Moscow");
		addresses.put("Sidorov", "St.Pete");
		addresses.put("Ivanov", "Saratov");
		addresses.put("Petrova", "New-York");
		addresses.put("Zhdanova", "Valdivostok");
		addresses.put("Petrov", "Novosibirsk");
		
		System.out.println(addresses.get("Petrova"));
		
		for (Map.Entry<String, String> addressEntry: addresses.entrySet()) {
			System.out.println("key " + addressEntry.getKey());
			System.out.println("value " + addressEntry.getValue());
		}
		
		for (String surname : addresses.keySet()) {
			System.out.println(surname);
		}
		
		System.out.println(addresses.values());
		
	}

}
