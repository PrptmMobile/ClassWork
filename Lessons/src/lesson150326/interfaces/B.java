package lesson150326.interfaces;

public class B {

	Changeable a;
	
	void setWorker(final Changeable a) {
		this.a = a;
	}
	
	void use() {
		a.change();
	}
	
}
