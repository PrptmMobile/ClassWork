package lesson150330.inner_example;

public class Dog {
	
	private interface BrainState {
		void stroke();
		void feed();
	}
	
	private class Evil implements BrainState {
		public void stroke() {
			Dog.this.bite();
		}

		public void feed() {
			Dog.this.state = Dog.this.new Good();
			Dog.this.bark();
		}
	}
	
	private class Good implements BrainState {

		int count;
		
		public void stroke() {
			wag();
			count++;
			if (count > 3) {
				state = new Evil();
			}
		}

		public void feed() {
			wag(); wag();
			count = 0;
		}
	}
	
	BrainState state;

	public Dog() {
		state = new Evil();
	}
	
	public void stroke() {
		state.stroke();
	}
	
	public void feed() {
		state.feed();
	}
	
	private void bark() {
		System.out.println("bark");
	}

	private void wag() {
		System.out.println("wag");
	}
	
	private void bite() {
		System.out.println("bite");
	}

}
