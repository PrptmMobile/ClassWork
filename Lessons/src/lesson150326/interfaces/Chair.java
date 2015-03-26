package lesson150326.interfaces;

public class Chair extends Furniture {

	@Override
	public void move() {
		System.out.println("moving chair");
	}

	@Override
	public void clean() {
		System.out.println("cleaning chair");
	}

	@Override
	public void repair() {
		System.out.println("repairing chair");
	}

	@Override
	public void paint() {
		System.out.println("painting chair");
	}

}
