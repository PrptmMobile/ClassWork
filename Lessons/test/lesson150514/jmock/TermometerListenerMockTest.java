package lesson150514.jmock;

import static org.junit.Assert.*;

import org.hamcrest.Matcher;
import org.jmock.Expectations;
import org.jmock.integration.junit4.JUnitRuleMockery;
import org.junit.Rule;
import org.junit.Test;

public class TermometerListenerMockTest {
	@Rule public JUnitRuleMockery context = new JUnitRuleMockery();

	@Test
	public void test() {
		final TermometerListener tl = context.mock(TermometerListener.class);
		
		context.checking(new Expectations() {
			{
				atLeast(1).of(tl).changed(with(any(Integer.class)));
			}
		});
		
		Termometer t = new Termometer();
		t.setListener(tl);

		t.inc();
		t.inc();
		
	}

}
