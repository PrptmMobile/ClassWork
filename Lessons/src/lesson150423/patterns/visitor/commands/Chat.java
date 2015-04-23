package lesson150423.patterns.visitor.commands;

import lesson150423.patterns.visitor.commands.server.Server;
import lesson150423.patterns.visitor.commands.shared.Command;

public class Chat {
	
	public static void main(final String[] args) {
		
		Server server = new Server();
		
		server.received(new Command.Login());
		server.received(new Command.Message());
		server.received(new Command.Message());
		server.received(new Command.Message());
		server.received(new Command.Exit());
		
		
	}

}
