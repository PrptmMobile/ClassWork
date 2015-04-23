package lesson150423.patterns.visitor;

import java.util.Arrays;
import java.util.List;

public class UseVisitor {

	public static void main(final String[] args) {

		List<Relative> list = Arrays.asList(new GrandMa(), new GrandPa(),
				new Uncle(), new Aunt());
		
		VisitorInstruction newYear = new NewYear();
		
		for (Relative relative : list) {
			relative.accept(newYear);
			System.out.println();
		}

	}

}
