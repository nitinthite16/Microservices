package core;

import java.util.LinkedList;

public class ListDemo {

	public static void main(String[] args) {

		LinkedList<Integer> ll = new LinkedList<>();
		ll.addFirst(11);
		ll.addLast(22);
		ll.add(0, 33);
		System.out.println(ll);
		for (Integer l : ll) {
			System.out.println(l);
		}
	}
}
