package lesson150402.polymorphism;

public class Polymorphism {
	
	static class A {
		
	}
	
	static class B extends A {
		
		@Override
		public String toString() {
			return "this is B!";
		}
		
	}
	
	static class C extends B {
		
	}
	
	public static void main(final String[] args) {
		
		B b = new B();
		
		A a = b;
		
		Object o = a;
		
		C c = new C();
		
//		System.out.println(o);
//		printObjectDetails(o);   // ERROR!
		printObjectDetails(c);
		
	}

	private static void printObjectDetails(final Object o) {
		System.out.println(o.toString());
	}

}
