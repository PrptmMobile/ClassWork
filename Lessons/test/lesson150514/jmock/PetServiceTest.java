package lesson150514.jmock;

import static org.junit.Assert.*;

import org.jmock.Expectations;
import org.jmock.Mockery;
import org.jmock.Sequence;
import org.jmock.integration.junit4.JMock;
import org.jmock.integration.junit4.JUnit4Mockery;
import org.jmock.integration.junit4.JUnitRuleMockery;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JMock.class)
public class PetServiceTest {
	Mockery context = new JUnit4Mockery();
	

	@Test
	public void test() {
		
		final Pet pet = context.mock(Pet.class);
		
		final Sequence petCareSequence = context.sequence("petcare");
		
		context.checking(new Expectations() {{
			oneOf(pet).stroke(); inSequence(petCareSequence);
			oneOf(pet).feed(); inSequence(petCareSequence);
			oneOf(pet).wash(); inSequence(petCareSequence);
			oneOf(pet).walk(); inSequence(petCareSequence);
		}});
		
		PetService service = new PetService();
		
		service.serve(pet);
		
	}

}
