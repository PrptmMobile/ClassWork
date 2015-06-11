package lesson150611.network;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class TimeServerClient {

	public static void main(final String[] args) {

		try (Socket socket = new Socket("time-a.timefreq.bldrdoc.gov", 13);) {

			Scanner scanner = new Scanner(socket.getInputStream());

			while (scanner.hasNextLine()) {
				System.out.println(scanner.nextLine());
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
