package lesson150331.nested.localvar;

import java.util.Scanner;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class LocalVarExample {

	public static void main(final String[] args) {
		
//		if (args.length == 0) {
//			System.out.println("Usage:  give name as first parameter");
//			System.exit(0);
//		}
		
		System.out.print("Enter your name: ");
		Scanner scanner = new Scanner(System.in);
		
		String name = scanner.nextLine();
		
		ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
		
		greet(name, service);
		
	}

	private static void greet(final String name,
			final ScheduledExecutorService service) {
		service.schedule(new Runnable() {
			// String name
			@Override
			public void run() {
				System.out.println("hello, " + name);
			}
		},  3, TimeUnit.SECONDS);
	}
	
}
