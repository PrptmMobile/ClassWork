package lesson150519.concurrency;

import utils.Utils;

public class ThreadCreation {
	
	private static final class SimpleThread extends Thread {
		@Override
		public void run() {
			new Task("-2-").run();
		}
	}

	private static final class Task implements Runnable {
		private String _message;
		
		public Task(final String message) {
			_message = message;
		}
		
		@Override
		public void run() {
			while (true) {
				Utils.pause(1000);
				System.out.println(_message);
			}
		}
	}

	public static void main(final String[] args) {
		
		Thread thread = new Thread(new Task("-1-"));
		thread.start();
		
		new SimpleThread().start();
		
		new Thread().start();
		
	}

}
