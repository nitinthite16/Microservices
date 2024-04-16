package java_8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Product {
	int id;
	String name;
	float price;

	public Product(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
}

public class Lambda {

	public static void main(String[] args) {
		List<Product> l = new ArrayList<>();
		l.add(new Product(1, "Hp laptop", 25000f));
		l.add(new Product(3, "Keyboard", 300f));
		l.add(new Product(2, "Dell Mouse", 150f));

		System.out.println("Sorting on the basis of name:");
		
        //implementing lambda expression
		
		Collections.sort(l, (p1, p2) -> {
			return p1.name.compareTo(p2.name);
		});
		for (Product p : l) {

			System.out.println(p.id + " " + p.name + " " + p.price);
		}
	}

}
