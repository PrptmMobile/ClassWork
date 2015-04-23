package lesson150423.patterns.visitor;

public class UseAB {

	public static void main(final String[] args) {
		
		A a = new A();
		B b = new B();
		
		if (args[0].equals("One")) {
			a.methodA();
			b.methodB();
		}
		
		if (args[0].equals("Two")) {
			b.methodB();
		}
		
		if (args[0].equals("Three")) {
			a.methodA();
		}
		
		if (args[0].equals("Four")) {
		}
		
		
	}
	
}
