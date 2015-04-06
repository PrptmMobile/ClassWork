package lesson150406.exceptions_finally;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class FinallyExamples {

	public static void main(final String[] args) {

		Lock lock = new ReentrantLock(); // mutex
		lock.lock();
		try {
			doSomething();
		} finally {
			lock.unlock();
			System.out.println("unlocked");
		}
		System.out.println("finish");

	}

	private static void doSomething() {
		// TODO Auto-generated method stub
		throw new RuntimeException();
	}

}
