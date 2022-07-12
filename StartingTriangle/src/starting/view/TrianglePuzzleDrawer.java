package starting.view;

import java.awt.*;

import javax.swing.JPanel;

import starting.model.Coordinate;
import starting.model.Edge;
import starting.model.Model;
import starting.model.Node;
import starting.model.TrianglePuzzle;

public class TrianglePuzzleDrawer extends JPanel {

	Model model;
	TrianglePuzzleApp app;
	
	/**
	 * Create the panel.
	 */
	public TrianglePuzzleDrawer(Model model, TrianglePuzzleApp app) {
		this.model = model;
		this.app = app;
	}
	
	public Rectangle computeRectangle (Node n)
	{
		int x = n.getX();
		int y = n.getY();
		Rectangle rect = new Rectangle(x,y,20,20);
		return rect;
	}
		

		
	

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		
		// protects you when looking inside WindowBuilder
		if (model == null) { return; }
		
		// do the math and figure out WHERE to draw all the boxes (nodes) lines (edges)
		
		// DRAW ENTIRE PUZZLE HERE...
		TrianglePuzzle puzzle = model.getPuzzle();

		
		for(Edge e:puzzle.getEdge())
		{
			Graphics2D g2d = (Graphics2D) g;
			g2d.setPaint(e.getPaint());
			g2d.setStroke(new BasicStroke(5));
			g2d.drawLine(e.getN1().getX(),e.getN1().getY()+5,e.getN2().getX(),e.getN2().getY()+5);
		}
		for(Node n: puzzle.nodes)
		{
			
			if(n.isSelected==false)
			{
					
				g.setColor(Color.WHITE);

			}
					
			else if(n.isSelected==true)
			{
				g.setColor(Color.BLACK);
			
			}
			

			Rectangle r = computeRectangle(n);
			g.fillRect(r.x-8, r.y-3, r.width, r.height);
		}
		app.playerMovesLabel.setText(" "+String.valueOf(model.getNumMoves()));
		app.playerScoreLabel.setText(" "+String.valueOf(model.getScore()));
	}
		

				
		

	public Coordinate pointToCoordinate(Point p) {
		return new Coordinate(p.x,p.y);
		// TODO Auto-generated method stub
		
	}

}
