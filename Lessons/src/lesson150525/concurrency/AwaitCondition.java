package lesson150525.concurrency;

import java.util.LinkedList;
import java.util.List;

import utils.Utils;

public class AwaitCondition {
	
	static class Sprinter implements Runnable {

		volatile boolean start = false;   //  visibility problem
		
		@Override
		public void run() {
			System.out.println("created " + this);
			long count = 0;
			while (!start) {
//				count++;
//				if (count % 1000 == 0) {
//					Thread.yield();
//				}
			}
			System.out.println(this + " started after " + count + " cycles");
			// do something
		}
		
		public void start() {
			start = true;
		}
		
	}
	
	public static void main(final String[] args) {
		
		System.out.println("begin");
		
		List<Sprinter> list = new LinkedList<>();
		
		list.add(startSprinter("First"));
		list.add(startSprinter("Second"));
		list.add(startSprinter("Third"));

		Utils.pause(3000);
		System.out.println("Ready..");
		Utils.pause(1000);
		System.out.println("Steady..");
		Utils.pause(1000);
		System.out.println("Go!!");
		
		
		for (Sprinter sp : list) {
			sp.start();
		}
		
	}

	private static Sprinter startSprinter(final String name) {
		Utils.pause(1000);
		System.out.println(name);
		Sprinter sprinter = new Sprinter();
		new Thread(sprinter).start();
		return sprinter;
	}
	

}
