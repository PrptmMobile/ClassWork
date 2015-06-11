package lesson150611.network;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class EchoServer {
	
	private static class SocketHandler implements Runnable {

		private Socket _socket;
		private PrintStream _ps;

		public SocketHandler(final Socket socket) {
			_socket = socket;
		}
		
		@Override
		public void run() {
			
			try {
				_ps = new PrintStream(_socket.getOutputStream());
			} catch (IOException e1) {
				e1.printStackTrace();
				return;
			}
			
			try (Scanner scanner = new Scanner(_socket.getInputStream());) {
				
				while (scanner.hasNextLine()) {
					process(scanner.nextLine());
				}
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		private void process(final String nextLine) {
			_ps.println(nextLine);
		}
		
	}

	public static void main(final String[] args) {
		
		System.out.println("Started listening on port 10000");

		ExecutorService service = Executors.newCachedThreadPool();
		
		try (ServerSocket serverSocket = new ServerSocket(10000)) {
			
			while (true) {
				Socket socket = serverSocket.accept();
				service.execute(new SocketHandler(socket));
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
