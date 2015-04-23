package lesson150423.patterns.visitor.commands.server;

import lesson150423.patterns.visitor.commands.shared.Command;
import lesson150423.patterns.visitor.commands.shared.Command.Exit;
import lesson150423.patterns.visitor.commands.shared.Command.Login;
import lesson150423.patterns.visitor.commands.shared.Command.Message;
import lesson150423.patterns.visitor.commands.shared.Processor;

public class Server implements Processor {
	
	// double dispatch with visitor

	@Override
	public void process(final Login command) {
		System.out.println(command);
	}

	@Override
	public void process(final Message command) {
		System.out.println(command);
	}

	@Override
	public void process(final Exit command) {
		System.out.println(command);
	}

	public void received(final Command command) {
		command.accept(this);
	}

}
