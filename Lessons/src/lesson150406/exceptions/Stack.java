package lesson150406.exceptions;

public class Stack {

	Object[] items;
	int tos;  // top of stack
	
	public Stack(final int capacity) {
		items = new Object[capacity];
		tos = -1;
	}
	
	public void push(final Object item) throws StackFullException {
		if (tos == items.length - 1 ) {
			throw new StackFullException("tos is " + tos);
		}
		items[++tos] = item;
	}
	
	public Object pop() throws StackEmptyException {
		if (isEmpty()) {
			throw new StackEmptyException("tos is " + tos);
		}
		return items[tos--];
	}
	
	public Object top() {
		return items[tos];
	}
	
	public boolean isEmpty() {
		return -1 == tos;
	}
	
}
