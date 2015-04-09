package lesson150407.generics;

public class AutoBoxingExamples {

	public static void main(final String[] args) {
		
		int a = new Integer(10);
		int b = new Integer(10).intValue();
		
		Integer c = 20;
		Integer d = new Integer(20); // immutable
		
	}
	
	static int calc() {
		return new Integer(30);
	}
	
	static Integer calc2() {
		return 20;
	}
	
}
