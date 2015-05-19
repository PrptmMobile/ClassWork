package lesson150519.concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockExamples {
	
	static class Counter {
		
		volatile long count;
		Lock lock = new ReentrantLock();
		
		public void inc() {
			lock.lock();
			try {
				count++;
			} finally {
				lock.unlock();
			}
		}
		
		public long get() {
			return count;
		}
		
	}

}
