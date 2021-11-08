package starting.controller;

import java.awt.Point;

import javax.print.attribute.standard.MediaSize.Other;

import starting.model.Coordinate;
import starting.model.Model;
import starting.view.TrianglePuzzleApp;

public class SelectController {
	Model m;
	TrianglePuzzleApp app;
	
	public SelectController(Model m, TrianglePuzzleApp app)
	{
		this.m=m;
		this.app=app;
	}

	public void process(Point point) {
		// TODO Auto-generated method stub
		Coordinate c = app.getTrianglePuzzleDrawer().pointToCoordinate(point);
	}

}
