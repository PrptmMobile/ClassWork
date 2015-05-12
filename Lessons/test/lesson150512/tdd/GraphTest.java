package lesson150512.tdd;

import static org.junit.Assert.*;

import org.junit.Test;

public class GraphTest {

	@Test
	public void edgesCreatedInConstructor() throws Exception {
		Graph g = new Graph(4);
		assertNotNull(g.edges);
	}
	
	@Test
	public void verticesStoredInConstructor() {
		Graph g = new Graph(4);
		assertEquals(4, g.edges.length);
		Graph g2 = new Graph(10);
		assertEquals(10, g2.edges.length);
	}
	
	@Test
	public void zeroConstructorParameter() throws Exception {
		try {
			new Graph(0);
			fail("Graph vertices must be greater than zero, should throw exception");
		} catch (IllegalArgumentException iae) {
			
		}
		// after all
	}

	@Test
	public void negativeConstructorParameter() throws Exception {
		try {
			new Graph(-1);
			fail("Graph vertices must be greater than zero, should throw exception");
		} catch (IllegalArgumentException iae) {
			
		}
		// after all
	}
	
}
