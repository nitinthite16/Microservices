package java_8;

import java.util.ArrayList;
import java.util.List;

public class ForEach {

	public static void main(String[] args) {
		List<String> l = new ArrayList<String>();
		l.add("Nitin");
		l.add("Sachin");
		l.add("Sharanya");
		l.add("Aryan");
	//	l.forEach(i -> System.out.println(i));
		l.forEach(System.out::println);
	}

}
