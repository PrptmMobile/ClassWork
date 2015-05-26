package lesson150526.concurrency;

import utils.Utils;

public class InterruptedExample {
	
	static class Task implements Runnable {

		@Override
		public void run() {
			long count = 0;
			while (!Thread.interrupted()) {
				count++;
			}
			System.out.println("count = " + count);
		}
		
	}
	
	public static void main(final String[] args) {
		
		System.out.println("start");
		
		Task task = new Task();
		Thread thread = new Thread(task);
		
		thread.start();
		
		Utils.pause(5000);
		
//		task.stop();
		
		thread.interrupt();
		
		System.out.println("finish");
	}

}
