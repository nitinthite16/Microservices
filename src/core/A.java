package core;

//singletonn pattern used for multithreaded & db application. logging,caching,thread pool

class A {

	private static A obj = new A(); // private static member

	private A() { // private constructor

	}
 
	public static void doSomething() { // static method

	}
}
