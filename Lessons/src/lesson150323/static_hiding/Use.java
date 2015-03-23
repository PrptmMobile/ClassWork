package lesson150323.static_hiding;

public class Use {

	public static void main(final String[] args) {
		A a = new A();
//		a.getCount();  ERROR!
		
		A a2 = new B();
//		a2.getCount(); ERROR!
//		A.getCount();
		
		B b = new B();
//		b.getCount();  ERROR!
//		B.getCount();
	}
	
}
