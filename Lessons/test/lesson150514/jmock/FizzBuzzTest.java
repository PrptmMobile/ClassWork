package lesson150514.jmock;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class FizzBuzzTest {
	
	private int _input;
	private String _output;


	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] {
				{1, "1"},
				{4, "4"},
				{3, "fizz"},
				{6, "fizz"},
				{5, "buzz"},
				{10, "buzz"},
				{15, "fizzbuzz"},
				{25, "buzz"},
				{26, "26"},
		});
	}
	
	public FizzBuzzTest(final int input, final String output) {
		_input = input;
		_output = output;
	}
	

	@Test
	public void test() {
		assertEquals(_output, FizzBuzz.check(_input));
	}

}
