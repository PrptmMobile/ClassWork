package lesson150525.concurrency;

import java.util.LinkedList;
import java.util.Queue;

public class MyBlockingQueue<T> {
	
	Queue<T> queue = new LinkedList<>();
	private Thread thread;
	
	public void add(final T item) {
		synchronized (queue) {
			queue.add(item);
//			queue.notifyAll();
			if (thread != null) {
				thread.interrupt();
			}
		}
	}
	
	public T remove() {
		synchronized (queue) {
			while (queue.isEmpty()) {
				thread = Thread.currentThread();
				try {
					queue.wait();
				} catch (InterruptedException e) {
					thread = null;
				}
			}
			return queue.remove();
		}
	}

}
