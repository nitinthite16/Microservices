package java_8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class Emp {
	int id;
	String name;
	float price;

	public Emp(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

}

public class Example {

	public static void main(String[] args) {
  
		List<Emp> l = new ArrayList<Emp>();
		l.add(new Emp(1, "hp", 42000f));
		l.add(new Emp(3, "dell", 50000f));     
		l.add(new Emp(2, "lenovo", 55000f));
		l.add(new Emp(4, "apple", 120000f));
		l.add(new Emp(5, "acer", 75000f));
		l.add(new Emp(6, "asus", 60000f));
		l.add(new Emp(8, "samsung", 85000f));
		l.add(new Emp(7, "wipro", 750000f));
		Set<Emp>s=new HashSet<>();
		List<Float> ll = l.stream().filter(i -> i.price > 50000f).map(i -> i.price).collect(Collectors.toList());
		System.out.println(ll);

	}

}
