package starting.model;
import java.awt.*;
import java.util.ArrayList;


public class Model {
	TrianglePuzzle puzzle;
	Node n;

	public Node selectedNode;
	public int numMoves = 0;
	public int score=0;
	public int win=0;
	
	
	public Model() {
		puzzle = new TrianglePuzzle();
		puzzle.nodes.add(new Node(200, 10));//0
		puzzle.nodes.add(new Node(135,130));//1
		puzzle.nodes.add(new Node(265,130));//2
		puzzle.nodes.add(new Node(70,260));//3
		puzzle.nodes.add(new Node(200,260)); //4
		puzzle.nodes.add(new Node(330,260));//5
		puzzle.nodes.add(new Node(10,380));//6
		puzzle.nodes.add(new Node(135,380));//7
		puzzle.nodes.add(new Node(265,380));//8
		puzzle.nodes.add(new Node(385,380));//9

	
		puzzle.edge.add(new Edge((puzzle.nodes.get(0)),(puzzle.nodes.get(1)), Color.RED));
		puzzle.edge.add(new Edge((puzzle.nodes.get(1)),(puzzle.nodes.get(3)), Color.RED));
		puzzle.edge.add(new Edge((puzzle.nodes.get(3)),(puzzle.nodes.get(6)), Color.RED));
		puzzle.edge.add(new Edge((puzzle.nodes.get(0)),(puzzle.nodes.get(2)), Color.RED));
		puzzle.edge.add(new Edge((puzzle.nodes.get(2)),(puzzle.nodes.get(5)), Color.RED));
		puzzle.edge.add(new Edge((puzzle.nodes.get(5)),(puzzle.nodes.get(9)), Color.RED));
		puzzle.edge.add(new Edge((puzzle.nodes.get(1)),(puzzle.nodes.get(4)), Color.BLUE));
		puzzle.edge.add(new Edge((puzzle.nodes.get(2)),(puzzle.nodes.get(4)), Color.BLUE));
		puzzle.edge.add(new Edge((puzzle.nodes.get(3)),(puzzle.nodes.get(7)), Color.BLUE));
		puzzle.edge.add(new Edge((puzzle.nodes.get(4)),(puzzle.nodes.get(7)), Color.BLUE));
		puzzle.edge.add(new Edge((puzzle.nodes.get(4)),(puzzle.nodes.get(8)), Color.BLUE));
		puzzle.edge.add(new Edge((puzzle.nodes.get(5)),(puzzle.nodes.get(8)), Color.BLUE));
		puzzle.edge.add(new Edge((puzzle.nodes.get(1)),(puzzle.nodes.get(2)), Color.GREEN));
		puzzle.edge.add(new Edge((puzzle.nodes.get(3)),(puzzle.nodes.get(4)), Color.GREEN));
		puzzle.edge.add(new Edge((puzzle.nodes.get(4)),(puzzle.nodes.get(5)), Color.GREEN));
		puzzle.edge.add(new Edge((puzzle.nodes.get(6)),(puzzle.nodes.get(7)), Color.GREEN));
		puzzle.edge.add(new Edge((puzzle.nodes.get(7)),(puzzle.nodes.get(8)), Color.GREEN));
		puzzle.edge.add(new Edge((puzzle.nodes.get(8)),(puzzle.nodes.get(9)), Color.GREEN));
		
		
		puzzle.initialedge.add(new Edge((puzzle.nodes.get(0)),(puzzle.nodes.get(1)), Color.RED));//0
		puzzle.initialedge.add(new Edge((puzzle.nodes.get(1)),(puzzle.nodes.get(3)), Color.RED));//1
		puzzle.initialedge.add(new Edge((puzzle.nodes.get(3)),(puzzle.nodes.get(6)), Color.RED));//2
		puzzle.initialedge.add(new Edge((puzzle.nodes.get(0)),(puzzle.nodes.get(2)), Color.RED));//3
		puzzle.initialedge.add(new Edge((puzzle.nodes.get(2)),(puzzle.nodes.get(5)), Color.RED));//4
		puzzle.initialedge.add(new Edge((puzzle.nodes.get(5)),(puzzle.nodes.get(9)), Color.RED));//5
		puzzle.initialedge.add(new Edge((puzzle.nodes.get(1)),(puzzle.nodes.get(4)), Color.BLUE));//6
		puzzle.initialedge.add(new Edge((puzzle.nodes.get(2)),(puzzle.nodes.get(4)), Color.BLUE));//7
		puzzle.initialedge.add(new Edge((puzzle.nodes.get(3)),(puzzle.nodes.get(7)), Color.BLUE));//8
		puzzle.initialedge.add(new Edge((puzzle.nodes.get(4)),(puzzle.nodes.get(7)), Color.BLUE));//9
		puzzle.initialedge.add(new Edge((puzzle.nodes.get(4)),(puzzle.nodes.get(8)), Color.BLUE));//10
		puzzle.initialedge.add(new Edge((puzzle.nodes.get(5)),(puzzle.nodes.get(8)), Color.BLUE));//11
		puzzle.initialedge.add(new Edge((puzzle.nodes.get(1)),(puzzle.nodes.get(2)), Color.GREEN));//12
		puzzle.initialedge.add(new Edge((puzzle.nodes.get(3)),(puzzle.nodes.get(4)), Color.GREEN));//13
		puzzle.initialedge.add(new Edge((puzzle.nodes.get(4)),(puzzle.nodes.get(5)), Color.GREEN));//14
		puzzle.initialedge.add(new Edge((puzzle.nodes.get(6)),(puzzle.nodes.get(7)), Color.GREEN));//15
		puzzle.initialedge.add(new Edge((puzzle.nodes.get(7)),(puzzle.nodes.get(8)), Color.GREEN));//16
		puzzle.initialedge.add(new Edge((puzzle.nodes.get(8)),(puzzle.nodes.get(9)), Color.GREEN));//17
		
		puzzle.winningstate.add(new Edge((puzzle.nodes.get(0)),(puzzle.nodes.get(1)), Color.RED));
		puzzle.winningstate.add(new Edge((puzzle.nodes.get(1)),(puzzle.nodes.get(3)), Color.BLUE));
		puzzle.winningstate.add(new Edge((puzzle.nodes.get(3)),(puzzle.nodes.get(6)), Color.GREEN));
		puzzle.winningstate.add(new Edge((puzzle.nodes.get(0)),(puzzle.nodes.get(2)), Color.RED));
		puzzle.winningstate.add(new Edge((puzzle.nodes.get(2)),(puzzle.nodes.get(5)), Color.GREEN));
		puzzle.winningstate.add(new Edge((puzzle.nodes.get(5)),(puzzle.nodes.get(9)), Color.BLUE));
		puzzle.winningstate.add(new Edge((puzzle.nodes.get(1)),(puzzle.nodes.get(4)), Color.BLUE));
		puzzle.winningstate.add(new Edge((puzzle.nodes.get(2)),(puzzle.nodes.get(4)), Color.GREEN));
		puzzle.winningstate.add(new Edge((puzzle.nodes.get(3)),(puzzle.nodes.get(7)), Color.GREEN));
		puzzle.winningstate.add(new Edge((puzzle.nodes.get(4)),(puzzle.nodes.get(7)), Color.RED));
		puzzle.winningstate.add(new Edge((puzzle.nodes.get(4)),(puzzle.nodes.get(8)), Color.RED));
		puzzle.winningstate.add(new Edge((puzzle.nodes.get(5)),(puzzle.nodes.get(8)), Color.BLUE));
		puzzle.winningstate.add(new Edge((puzzle.nodes.get(1)),(puzzle.nodes.get(2)), Color.RED));
		puzzle.winningstate.add(new Edge((puzzle.nodes.get(3)),(puzzle.nodes.get(4)), Color.BLUE));
		puzzle.winningstate.add(new Edge((puzzle.nodes.get(4)),(puzzle.nodes.get(5)), Color.GREEN));
		puzzle.winningstate.add(new Edge((puzzle.nodes.get(6)),(puzzle.nodes.get(7)), Color.GREEN));
		puzzle.winningstate.add(new Edge((puzzle.nodes.get(7)),(puzzle.nodes.get(8)), Color.RED));
		puzzle.winningstate.add(new Edge((puzzle.nodes.get(8)),(puzzle.nodes.get(9)), Color.BLUE));
		
		
	}
	
	public void setPuzzle(TrianglePuzzle p) { 
		puzzle = p;
	
	}
	public TrianglePuzzle getPuzzle() { return puzzle; }
	
	public void setSelectedNode(Node n) { 
		selectedNode = n;
		//n.isSelected=true;
		 }
	public Node getSelectedNode() { return selectedNode; }
	public void clearSelectedNode() {
		// TODO Auto-generated method stub
		selectedNode=null;
	}
	public int getNumMoves() {
	
		return numMoves;
	}
	public void setNumMoves(int numMoves) {
		this.numMoves = numMoves;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	

	
}
