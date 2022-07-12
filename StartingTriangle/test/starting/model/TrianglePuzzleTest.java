package starting.model;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import java.awt.*;

class TrianglePuzzleTest {

	@Test
	void testsetNodes()
	{
		
		ArrayList<Node> nodes = new ArrayList<Node>();
		Node node = new Node(200,10);
		nodes.add(node);
		TrianglePuzzle puzzle = new TrianglePuzzle();
		puzzle.setNodes(nodes);
		assertEquals(puzzle.getNodes(),nodes);
	
	
		
		
		
		
		}
	@Test
	void testEdges()
	{
		ArrayList<Edge> edges = new ArrayList<Edge>();
		Node node1 = new Node(200,10);
		Node node2 = new Node(230,10);
		Edge edge = new Edge(node1,node2,Color.GREEN);
		TrianglePuzzle puzzle = new TrianglePuzzle();
		edges.add(edge);
		puzzle.setEdge(edges);
		assertEquals(puzzle.getEdge(),edges);
	}
	@Test
	void testinitialedges()
	{
		ArrayList<Edge> initialedge = new ArrayList<Edge>();
		Node node1 = new Node(200,10);
		Node node2 = new Node(130,30);
		Edge edge = new Edge(node1, node2, Color.GREEN);
		TrianglePuzzle puzzle = new TrianglePuzzle();
		initialedge.add(edge);
		puzzle.setInitialedge(initialedge);
		assertEquals(puzzle.getInitialedge(),initialedge);
		
		
		
		
		
	}
}


