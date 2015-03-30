package lesson150330.nested_classes;

public class E {
	
	class I {  // inner
		void print() {
			System.out.println(E.this.state);
		}
	}

	int state;
	I i;
	
	public E() {
		i = this.new I();
	}
	

}
