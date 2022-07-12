package starting.controller;

import java.awt.Color;
import starting.model.Model;
import starting.model.TrianglePuzzle;
import starting.view.TrianglePuzzleApp;

public class ResetController {

	TrianglePuzzleApp app;
	Model model;
	
	public ResetController(Model m, TrianglePuzzleApp app) {
		this.model = m;
		this.app = app;
	}
	
	public void process() {
		TrianglePuzzle puzzle = model.getPuzzle();
		for(int i=0; i < puzzle.edge.size(); i++)
		{
			if(puzzle.edge.get(i).getPaint()==puzzle.initialedge.get(i).getPaint())
			{
				System.out.println("");
			}
			else
			{
				Color c = puzzle.initialedge.get(i).getPaint();
				puzzle.edge.get(i).setPaint(c);
				app.repaint();
				model.numMoves=0;
				model.score=0;
				SwapEdgesController.iswin=false;
				
			}
	
		}
	}
}
