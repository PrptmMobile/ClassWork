package lesson150519.concurrency;

import java.util.Random;

import utils.Utils;

public class RaceConditionWhileReading {

	static class Data {
		int a;
		int b;
		
		public Data(final int value) {
			setValue(value);
		}
		
		public void setValue(final int value) {
			int calcResult = calc(value);
			synchronized (this) {  // mutex  mutual exclusive
				a = value;
				Utils.pause(1000);
				b = a + calcResult;
			}
		}
		
		private int calc(final int value) {
			for (int i = 0; i < 1000000; i++) {
				Math.sqrt(value);
			}
			return value;
		}
		
		public boolean isGood() {
			int x, y;
			synchronized (this) {
				x = a;
				y = b;
			}
			int r = calc(x);
			return y == x + r;
		}
		
	}
	
	public static void main(final String[] args) {
		
		final Data data = new Data(100);
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				Random random = new Random();
				while (true) {
					Utils.pause(1000);
					int nextInt = random.nextInt(100);
					System.out.println(nextInt);
					data.setValue(nextInt);
				}
			}
		}).start();
		
		while (true) {
			Utils.pause(1000);
			if (!data.isGood()) {
				System.out.println("data is corrupted!");
			}
		}
		
		
	}
	
	
}
