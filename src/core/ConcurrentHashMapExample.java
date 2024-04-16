package core;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {
	public static void main(String[] args) {
		
		Map<Integer, String> laptopmap = new ConcurrentHashMap<Integer, String>();
		laptopmap.put(1, "IBM");
		laptopmap.put(2, "Dell");
		laptopmap.put(3, "HCL");
		System.out.println("ConcurrentHashMap is: " + laptopmap);
	}
}
