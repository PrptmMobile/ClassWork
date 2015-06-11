package lesson150611.network;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class TelnetClient {

	public static void main(final String[] args) {

		try (Socket socket = new Socket("ya.ru", 80);) {
			
			OutputStream os = socket.getOutputStream();
			
			PrintStream ps = new PrintStream(os);
			
			ps.println("GET / HTTP/1.0");
			ps.println();
			ps.println();

			Scanner scanner = new Scanner(socket.getInputStream());

			while (scanner.hasNextLine()) {
				System.out.println(scanner.nextLine());
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
