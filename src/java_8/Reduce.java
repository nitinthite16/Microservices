package java_8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Reduce {

	
	public static void main(String[] args) {
	
		List<String> l = Arrays.asList("GFG", "Geeks", "for", "GeeksQuiz", "GeeksforGeeks");

		// The lambda expression passed to
		// reduce() method takes two Strings  
		// and returns the longer String.
		// The result of the reduce() method is
		// an Optional because the list on which
		// reduce() is called may be empty.
		
		Optional<String> longestString = l.stream()
				.reduce((a, b) -> a.length() > b.length() ? a : b);

		// Displaying the longest String
		longestString.ifPresent(System.out::println);
		System.out.println(longestString);
	}
}
