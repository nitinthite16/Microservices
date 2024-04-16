package core;

public class Duplicate {

	public static void main(String[] args) {
		String s = "NitinThite";
		String s1 = s.toLowerCase();
		char[] s2 = s1.toCharArray();
		for (int i = 0; i < s2.length; i++) { 
			for (int j = i + 1; j < s2.length; j++) {
				if (s2[i] == s2[j]) {
					System.out.println(s2[j]);
				}
			}
		}

	}

}
