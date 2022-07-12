package starting.model;

import java.awt.Point;
import java.util.ArrayList;
import java.util.Iterator;

import starting.view.TrianglePuzzleApp;

public class TrianglePuzzle  {
	public ArrayList<Node> nodes = new ArrayList<>();
	public ArrayList<Edge> edge = new ArrayList<>();
	public ArrayList<Edge> initialedge = new ArrayList<>();
	public ArrayList<Edge> winningstate = new ArrayList<>();
	

	
	
		Model model;
	TrianglePuzzleApp app;
	
	public ArrayList<Node> getNodes() {
		return nodes;
	}
	public void setNodes(ArrayList<Node> nodes) {
		this.nodes = nodes;
	}
	public ArrayList<Edge> getEdge() {
		return edge;
	}
	public void setEdge(ArrayList<Edge> edge) {
		this.edge = edge;
	}
	public Model getModel() {
		return model;
	}
	public void setModel(Model model) {
		this.model = model;
	}
	public TrianglePuzzleApp getApp() {
		return app;
	}
	public void setApp(TrianglePuzzleApp app) {
		this.app = app;
	}
	public ArrayList<Edge> getInitialedge() {
		return initialedge;
	}
	public void setInitialedge(ArrayList<Edge> initialedge) {
		this.initialedge = initialedge;
	}

	
	
	}
	
	


	

	
	
	


