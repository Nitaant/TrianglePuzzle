package starting.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestNode {

	
	@Test
	void testisSelected()
	{
		Node node = new Node(200,10);
		node.isSelected();
		assertTrue(node.getisSelected());
		
		
	}
	@Test
	void testPlacement()
	{
		Node node= new Node(200,10);
		node.setX(200);
		assertEquals (200, node.getX());
		node.setY(10);
		assertEquals(10,node.getY());
	}

	@Test
	void testContains()
	{
		Node n = new Node(200,10);
		n.setX(200);
		n.setY(10);
		
		assertTrue(n.contains(new Coordinate(200,10)));
		assertTrue(n.contains(new Coordinate(201,11)));
		assertTrue(n.contains(new Coordinate(200,11)));
		assertTrue(n.contains(new Coordinate(201,10)));
		assertFalse(n.contains(new Coordinate(300,200)));
	}
	
	@Test
	void testhashcode()
	{
		Node n = new Node(200,10);
		
	}
}
