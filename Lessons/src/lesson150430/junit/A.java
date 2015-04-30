package lesson150430.junit;

public class A {
	
	int state;
	
	public void change() {
		state++;
		if (state > 2) {
			state = 0;
		}
	}
	
	
	public static void main(final String[] args) {
		A a = new A();
		
		a.change();
		
		if (a.state != 1) {
			System.out.println("wrong implementation!  should be 1!");
		} else {
			System.out.println("ok");
		}
		
	}


	public void dec() {
		state--;
	}

}
