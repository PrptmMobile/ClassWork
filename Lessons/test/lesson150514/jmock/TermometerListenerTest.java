package lesson150514.jmock;

import static org.junit.Assert.*;

import org.jmock.integration.junit4.JUnitRuleMockery;
import org.junit.Rule;
import org.junit.Test;

public class TermometerListenerTest {

	@Test
	public void testListener() {
		TermometerListener tl = new TermometerListener() {
			@Override
			public void changed(final int currentTemp) {
				assertEquals(1, currentTemp);
			}
		};
		Termometer t = new Termometer();
		t.setListener(tl);
		t.inc();
		
	}

}
