package core;

import java.util.HashMap;
import java.util.Map;

public class ItrMap {
	public static void main(String[] args) {

		HashMap<Integer, String> m = new HashMap<>();
		m.put(101, "Nitin");
		m.put(102, "Sachin");
		m.put(103, "Nitin");
		m.put(105, null);    
		m.put(107, "Sharnya");
		m.put(109, null);
		m.put(111, "Nitin");
		m.put(120, "Sachin");
		for (Map.Entry n : m.entrySet()) {

			System.out.println(n.getKey() + ": " + n.getValue());

		}
		System.out.println("after replacing entry");
		m.replace(111, "Shiv");
		for (Map.Entry ee : m.entrySet()) {
			System.out.println(ee.getKey() + ":" + ee.getValue());
		}
		HashMap<Integer, String> m1 = new HashMap<>();
		m1.putIfAbsent(200, "God");
		m1.putAll(m); 
		System.out.println("after invoking put ifAbsent method");

		for (Map.Entry e : m1.entrySet()) {
			System.out.println(e.getKey() + " - " + e.getValue());

		}
	}

}
