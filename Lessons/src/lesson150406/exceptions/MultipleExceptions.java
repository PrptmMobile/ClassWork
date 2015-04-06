package lesson150406.exceptions;

public class MultipleExceptions {
	
	public static class Exception3 extends Exception2 {
		public Exception3(final String string) {
			super(string);
		}
	}

	public static class Exception2 extends Exception1 {
		public Exception2(final String string) {
			super(string);
		}
	}

	public static class Exception1 extends Exception {
		public Exception1(final String string) {
			super(string);
		}
	}

	public static void main(final String[] args) {
		System.out.println("start");
//		try {
//			a();
//			System.out.println("after a");
//		} catch (Exception1 | Exception2 | Exception3 e) { // multi-catch
//			e.printStackTrace();
//		}
//		try {
//			a();
//			System.out.println("after a");
//		} catch (Exception1 e) { // multi-catch via inheritance 
//			e.printStackTrace();  // common processing block
//		}
		try {
			a();
			System.out.println("after a");
		} catch (Exception3 e) {
			System.out.println("exception 3 special block");
			System.out.println(e.getMessage());
		} catch (Exception2 e) {
			System.out.println(e.getLocalizedMessage());
		} catch (Exception1 e) { // multi-catch via inheritance 
			e.printStackTrace();  // common processing block
		}
		System.out.println("finish");
	}

	private static void a() throws Exception1, Exception2, Exception3 {
		b();
		System.out.println("after b");
		throw new Exception3("ex3");
	}

	private static void b() throws Exception1, Exception2 {
		c();
		System.out.println("after c");
		throw new Exception2("ex2");
	}

	private static void c() throws Exception1 {
//		throw new Exception1();
//		System.out.println("inside c");  // UNREACHABLE!
	}

}
