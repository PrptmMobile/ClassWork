package lesson150423.patterns.visitor;

public class GrandPa implements Relative {

	@Override
	public void accept(final VisitorInstruction visitor) {
		visitor.visit(this);
	}

}
