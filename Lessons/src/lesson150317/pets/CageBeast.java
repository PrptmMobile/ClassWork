package lesson150317.pets;

public class CageBeast extends Pet {

	@Override
	public void feed() {
		cleanCage();
		super.feed();
	}

	private void cleanCage() {
		System.out.println("cleaning cage");
	}

}
