package lesson150331.linked_list.anonymous;

public class A {
	
	String state = "hello";

	static class B implements I {
		@Override
		public int calc() {
			return 0;
		}
	}
	
	public I getI() {
		return new B();
	}
	
	public I getAnonymousI() {
		return new I() {
			@Override
			public int calc() {
				System.out.println(state);
				return 0;
			}
		};
	}
	
	public static void main(final String[] args) {
		
		A a = new A();
		
		I i = a.getAnonymousI();
		i.calc();
		
		System.out.println(i);
	}
	
}
