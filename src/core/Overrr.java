package core;

class Abc {
	void m1() {
		System.out.println("hi");
	}
}

public class Overrr extends Abc {

	void m1() {
		
		System.out.println("hello");
		//super.m1();//hi
	}

	public static void main(String[] args) {
		//Overrr o = new Overrr();// hello
		//o.m1();

	//	Abc a = new Abc();//hi
	//	a.m1();
		
	//	Abc a = new Overrr();///hello
	//	a.m1();
		
	//	Overrr o = new Abc();//compile type error
		
		
		
	}

}
