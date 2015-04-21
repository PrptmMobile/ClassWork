package lesson150421.patterns.mediator;

public class Parrot {

	public void setDog(final Dog dog) {
		_dog = dog;
	}

	public void setCat(final Cat cat) {
		_cat = cat;
	}

	private Dog _dog;
	private Cat _cat;

	public void catchHim() {
	}
	
	public void play() {
		_dog.дразнит();
		_cat.flyAway();
	}
	
	

}
