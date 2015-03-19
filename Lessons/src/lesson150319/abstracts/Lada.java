package lesson150319.abstracts;

public final class Lada extends Car {
	
	@Override
	public void moveTo(final int x, final int y) {
		turnOn();
		while (notBroken()) {
			drive();
			repair();
		}
		shutDown();
	}
	
//	public abstract void something(); ERROR!
	

	public void turnOn() {
		
	}
	
}
