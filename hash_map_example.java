package maps_example;

import java.util.HashMap;

public class TestHashMap {
	public static void main(String[] args) {
		/*
		*Input: (0, "James"), (1, "Mike"), (2, "Mary")
		*Output: The String stored under the key 0 is: null
		*	 The String stored under the key 1 is: null
		*	 The String stored under the key 2 is: null
		*/
		//HashMap created,HashMap<key, val>, key:integer, val:String 
		HashMap<Integer, String> myMap = new HashMap<>();
		//"put" method to add elements to our HashMap.
		myMap.put(0, "James");
		myMap.put(1, "Mike");
		myMap.put(2, "Mary");
		//uses "get" method to retrieve a value stored at a location set by the key
		for (int i = 0;i<myMap.size();i++) {
			System.out.println("The String stored under the key "+i+" is: " + myMap.get(3));
		}
	}
}
