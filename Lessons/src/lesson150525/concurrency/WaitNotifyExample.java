package lesson150525.concurrency;

import utils.Utils;

public class WaitNotifyExample {
	
	static class Sprinter implements Runnable {

		@Override
		public void run() {
			System.out.println("created " + this);
			
			synchronized (this) {
				try {
					System.out.println("before wait " + this);
					this.wait();
					System.out.println("after wait " + this);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
			System.out.println("started " + this);
			
		}
		
		public static void main(final String[] args) {
			
			Sprinter sprinter = new Sprinter();
			
			new Thread(sprinter).start();
			
			Utils.pause(10000);
			
			synchronized (sprinter) {
				sprinter.notifyAll();
				Utils.pause(15000);
			}
			Utils.pause(15000);
		}
		
	}

}
