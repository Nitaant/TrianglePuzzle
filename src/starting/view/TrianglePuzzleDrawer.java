package starting.view;

import java.util.HashMap;
import java.awt.*;
import javax.swing.*;

import org.w3c.dom.Node;

import starting.model.Coordinate;
import starting.model.Model;
import starting.model.TrianglePuzzle;

public class TrianglePuzzleDrawer extends JPanel {

	Model model;
	
	/**
	 * Create the panel.
	 */
	public TrianglePuzzleDrawer(Model model) {
		this.model = model;
		
	}

	
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		
		
		// protects you when looking inside WindowBuilder
		if (model == null) { return; }
		
		// do the math and figure out WHERE to draw all the boxes (nodes) lines (edges)
	
		// DRAW ENTIRE PUZZLE HERE..

		
		g2d.setPaint(Color.RED);
		g2d.setStroke(new BasicStroke(5));
		g2d.drawLine(200, 15, 140, 140);//node0tonode1
		g2d.drawLine(140,140,75,270);//node1tonode3
		g2d.drawLine(75,270,10,395);//node3tonode6
		g2d.drawLine(210,15,270,145);//node0tonode2
		g2d.drawLine(270,145,335,275);//node2tonode5
		g2d.drawLine(335,275,390,395);//node5tonode9
		
		g2d.setPaint(Color.BLUE);
		g2d.drawLine(140, 140, 205, 270);//node1tonode4
		g2d.drawLine(270, 140, 205, 270);//node2tonode4
		g2d.drawLine(75, 270, 140, 390);//node3tonode7
		g2d.drawLine(205, 270, 140, 390);//nodetonode7
		g2d.drawLine(205, 270, 270,390);////node5tonode8
		g2d.drawLine(335, 270, 270,390);//nodenode6tonode8
		
		g2d.setPaint(Color.GREEN);//node1tonode2
		g2d.drawLine(140, 140, 260, 140);//node1tonode2
		g2d.drawLine(75, 270, 205, 270);//3to4
		g2d.drawLine(205, 270, 325, 270);//4to5
		g2d.drawLine(0, 390, 130, 390);//6to7	
		g2d.drawLine(130, 390, 260, 390);//7to8
		g2d.drawLine(260, 390, 380, 390);//8to9
		
	
		g.setColor(Color.WHITE);
		g.fillRect(195, 10, 20,20); //node0
		g.fillRect(130,130,20,20);//node1
		g.fillRect(260,130,20,20);//node2
		g.fillRect(195,260,20,20);//node4
		g.fillRect(65,260,20,20);//node3
		g.fillRect(325,260,20,20);//node5
		g.fillRect(0,380,20,20);//node6
		g.fillRect(130,380,20,20);//node7
		g.fillRect(260,380,20,20);//node8
		g.fillRect(380,380,20,20);//node10
		

	}
	public Coordinate pointToCoordinate(Point p) {
		// TODO Auto-generated method stub
		return new Coordinate(p.x, p.y);
	}

}
