package java_8;

public class StringJoiner {

	public StringJoiner(String string, String string2) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		StringJoiner join = new StringJoiner(",","[,]");
		join.add("Nitin");
		join.add("Ganesh");
		join.add("sharanya");
		join.add("sachin");
		System.out.println(join);

	}

	private void add(String string) {
		
		
	}

	

}
