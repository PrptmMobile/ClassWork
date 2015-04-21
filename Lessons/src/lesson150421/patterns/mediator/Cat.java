package lesson150421.patterns.mediator;

public class Cat {
	
	public void setDog(final Dog dog) {
		_dog = dog;
	}

	public void setParrot(final Parrot parrot) {
		_parrot = parrot;
	}

	private Dog _dog;
	private Parrot _parrot;

	public void play() {
		_dog.biteEar();
		_parrot.catchHim();
	}

	public void flyAway() {
		// TODO Auto-generated method stub
		
	}

}
