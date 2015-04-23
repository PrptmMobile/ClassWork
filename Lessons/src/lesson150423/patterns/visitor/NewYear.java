package lesson150423.patterns.visitor;

public class NewYear implements VisitorInstruction {

	@Override
	public void visit(final GrandMa person) {
		System.out.println("hi grandma!");
		System.out.println("eat!");
		System.out.println("sleep!");
		System.out.println("stroke cats!");
		System.out.println("bye-bye!");
	}

	@Override
	public void visit(final GrandPa person) {
		System.out.println("hi grandpa!");
		System.out.println("eat!");
		System.out.println("sleep!");
		System.out.println("stroke dogs!");
		System.out.println("bye-bye!");
	}

	@Override
	public void visit(final Uncle person) {
		
	}

	@Override
	public void visit(final Aunt person) {
		System.out.println("send roses");
	}

}
