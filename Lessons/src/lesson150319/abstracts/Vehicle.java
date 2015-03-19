package lesson150319.abstracts;

public abstract class Vehicle {
	
	protected Vehicle() {
		
	}
	
//	public void moveTo(final int x, final int y) {
//		System.out.println("moved to " + x + "," + y);
//	}
	
	public abstract void moveTo(int x, int y);

}
