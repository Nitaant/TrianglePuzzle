package starting.controller;

import java.awt.Point;

import starting.model.Coordinate;
import starting.model.Model;
import starting.model.Node;
import starting.model.TrianglePuzzle;
import starting.view.TrianglePuzzleApp;

public class SelectNodeController {
	Model model;
	TrianglePuzzleApp app;

	public SelectNodeController(Model m, TrianglePuzzleApp app) {
		this.model = m;
		this.app = app;
	}

	public void process(Point point) {
		Coordinate c =app.getPanel().pointToCoordinate(point);
		TrianglePuzzle puzzle = model.getPuzzle();
		

		if(SwapEdgesController.iswin == false)
		{
		for(Node n:puzzle.getNodes())
		{
			if(n.contains(c))
			{
				
				model.setSelectedNode(n);
				app.repaint();
				n.isSelected(); 
			}
		}
		}
		
	}
		
	}



