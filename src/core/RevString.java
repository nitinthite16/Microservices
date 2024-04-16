package core;

public class RevString {

	public static void main(String[] args) {

		String s = "Nitin";
		String r = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			r = r + s.charAt(i);
		}
		System.out.println(r);
		if (s.equals(r)) {
			System.out.println("palindrome string");
		} else {
			System.out.println("not a palindrome");

		}
	}

}
