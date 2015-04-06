package lesson150406.exceptions;

public class UseStack {

	public static void main(final String[] args) {
		Stack stack = new Stack(3);

		try {
			stack.pop();
		} catch (StackEmptyException e1) {
			System.out.println(e1);
		}
		
		
		try {
			stack.push("one");
			stack.push("two");
			stack.push("three");
			stack.push("four");
		} catch (Exception e) {
			System.out.println(e);
		}
		while (!stack.isEmpty()) {
			try {
				System.out.println(stack.pop());
			} catch (StackEmptyException e) {
				System.out.println(e);
			}
		}
	}
}
