package starting.model;
import java.util.Objects;
import java.awt.*;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestEdge {

	@Test
	void testConstruction()
	{
		Node node1 = new Node(200,10);
		Node node2 = new Node(130,135);
		Edge edge = new Edge(node1, node2, Color.GREEN);
		assertEquals(edge.getN1(),node1);
		assertEquals(edge.getN2(),node2);
		
	}
	@Test
	void testset()
	{
		Node node1 = new Node(200,10);
		Node node2 = new Node(130,135);
		Edge edge = new Edge(node1, node2, Color.GREEN);
		Node node3 = new Node(70,260);
		edge.setN1(node3);
		assertEquals(edge.getN1(),node3);
	}
		

		
		
	}
	

