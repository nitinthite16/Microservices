package java_8;

import java.util.Optional;

public class OptionalClass {

	public static void main(String[] args) {
		String[] s = new String[10];
		Optional<String> checkNull = Optional.ofNullable(s[5]);
		if (checkNull.isPresent()) {
			String lower = s[5].toLowerCase();

			System.out.println(lower);

		}
		else {
			System.out.println("String value is not present");
		}
	}
}