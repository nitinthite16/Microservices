package java_8;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class practice {

	public static void main(String[] args) {

		String[] str = { "nitin", "shubham", "clover", "nitin", "dinesh", "shubham" };
		
		List<String> l = Arrays.asList(str);
		
		Set<String> s = new LinkedHashSet<>();
		
		List<String> ll = l.stream().filter(i -> !s.add(i)).collect(Collectors.toList());
		
		System.out.println(ll);
		
		for (String lll : ll) {
			System.out.println(lll + ":" + Collections.frequency(l, lll));
		}
	}

}
