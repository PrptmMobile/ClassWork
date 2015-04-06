package lesson150402.exceptions;

public class UseStack {

	public static void main(final String[] args) {
		Stack stack = new Stack(3);

		try {
			stack.push("one");
			stack.push("two");
			stack.push("three");
			stack.push("four");
		} catch (Exception e) {
			System.out.println(e);
		}
		while (!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
	}

}
