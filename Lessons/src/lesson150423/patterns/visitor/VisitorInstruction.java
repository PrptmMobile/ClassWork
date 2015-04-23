package lesson150423.patterns.visitor;

public interface VisitorInstruction {
	
	void visit(GrandMa person);
	void visit(GrandPa person);
	void visit(Uncle person);
	void visit(Aunt person);

}
