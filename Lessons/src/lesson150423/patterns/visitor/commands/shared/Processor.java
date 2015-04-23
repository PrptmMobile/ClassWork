package lesson150423.patterns.visitor.commands.shared;

public interface Processor {

	void process(Command.Login command);
	void process(Command.Message command);
	void process(Command.Exit command);

}
