package TestController;
import java.awt.Point;

import starting.controller.SelectNodeController;
import starting.model.Coordinate;
import starting.model.Model;
import starting.model.Node;
import starting.model.TrianglePuzzle;
import starting.view.TrianglePuzzleApp;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SelectNodeControllerTest {

	@Test
	void test() {
		Point point = new Point(200,10);
		Node node1 = new Node(200,10);
		Node node2= new Node(80,70);
		Model model = new Model();
		TrianglePuzzleApp app = new TrianglePuzzleApp(model);
		SelectNodeController snc = new SelectNodeController(model, app);
		snc.process(point);
		assertEquals(point.getX(),node1.getX());
		assertEquals(point.getY(),node1.getY());
		
		
		
		
	}

}
