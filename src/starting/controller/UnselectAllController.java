package starting.controller;

import starting.model.Model;
import starting.model.Node;
import starting.model.TrianglePuzzle;
import starting.view.TrianglePuzzleApp;

public class UnselectAllController {
	Model model;
	TrianglePuzzleApp app;

	public UnselectAllController(Model model, TrianglePuzzleApp app) {
		// TODO Auto-generated constructor stub'
		this.model = model;
		this.app = app;
	}
	public void process()
	{
		TrianglePuzzle puzzle = model.getPuzzle();
		for(Node n : puzzle.getNodes())
		{
			if(model.selectedNode== null)
				System.out.println("No nodes are selected!");
				
			else
			{
				n.isSelected=false;
				app.repaint( );
			}
			
		}
		
		
	}
}
