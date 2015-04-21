package lesson150421.patterns.mediator;

public class Home {
	
	public static void main(final String[] args) {
		
		Cat cat = new Cat();
		Dog dog = new Dog();
		Parrot parrot = new Parrot();
		
		dog.setCat(cat);
		dog.setParrot(parrot);
		
		cat.setDog(dog);
		cat.setParrot(parrot);
		
		parrot.setCat(cat);
		parrot.setDog(dog);
		
		
	}

}
