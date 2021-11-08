package starting.controller;

import java.awt.Color;
import java.util.ArrayList;

import starting.model.Edge;
import starting.model.Model;
import starting.model.Node;
import starting.model.TrianglePuzzle;
import starting.view.TrianglePuzzleApp;

public class SwapEdgesController {

	public static boolean iswin = false;
	public int moves =0 ;
	int win =0;

	Model model;
	TrianglePuzzleApp app;

	public SwapEdgesController(Model model, TrianglePuzzleApp app) {
		// TODO Auto-generated constructor stub
		this.model = model;
		this.app = app;
	}

	public void process() {
		// TODO Auto-generated method stub
	
	
		TrianglePuzzle puzzle = model.getPuzzle();
		ArrayList<Node> selectednodes = new ArrayList<>();
		ArrayList<Edge>selectededges = new ArrayList<>();
		
	
		
	
		for(Node n:puzzle.getNodes())
		{
			if(n.isSelected == true)
			{
				selectednodes.add(n);
			}
		
		}
		if(selectednodes.size()>3)
		{
			System.out.println("Error! More than three nodes selected!Cannot be swapped");
		}
		if(selectednodes.size()<3)
		{
			System.out.println("Select three nodes please!");
		}
		
		
		
	
		if(selectednodes.size()==3)
		{
		for(Edge e : puzzle.getEdge())
		{
			if((selectednodes.get(0)==e.getN1() && selectednodes.get(1)==e.getN2()) || (selectednodes.get(0)==e.getN2() && selectednodes.get(1)==e.getN1()) )
			{
				selectededges.add(e);
			}
			else if((selectednodes.get(1)==e.getN1() && selectednodes.get(2)==e.getN2()) || (selectednodes.get(1)==e.getN2() && selectednodes.get(2)==e.getN1()) )
			{
				selectededges.add(e);
			}
			else if((selectednodes.get(0)==e.getN1() && selectednodes.get(2)==e.getN2()) || (selectednodes.get(0)==e.getN2() && selectednodes.get(2)==e.getN1()) )
			{
				selectededges.add(e);
			}		
	
		}
		if(selectededges.size()==2)
		{
		Color col1 = selectededges.get(0).getPaint();
		Color col2= selectededges.get(1).getPaint();	
		
				selectededges.get(0).setPaint(col2);
				selectededges.get(1).setPaint(col1);
				app.repaint();
				
	
				
				for(Node n:puzzle.getNodes())
				{
					n.isSelected=false;
				}
			
			
			
		}
		else if(selectededges.size()==3)
		{
			Color col1 = selectededges.get(0).getPaint();
			Color col2= selectededges.get(1).getPaint();	
			Color col3= selectededges.get(2).getPaint();
			
					selectededges.get(0).setPaint(col2);
					selectededges.get(1).setPaint(col3);
					selectededges.get(2).setPaint(col1);
					app.repaint();
					
			
					for(Node n:puzzle.getNodes())
					{
						n.isSelected=false;
					}
					
				
					
		}
		model.numMoves = model.numMoves+1;
		
//		if((puzzle.edge.get(0).getPaint() == puzzle.edge.get(3).getPaint()) &&  
//		   (puzzle.edge.get(0).getPaint() == puzzle.edge.get(12).getPaint()) && 
//		   (puzzle.edge.get(12).getPaint() == puzzle.edge.get(3).getPaint()))
//		{
//			model.score=model.score+10;
//		}
//		else if((puzzle.edge.get(1).getPaint() == puzzle.edge.get(6).getPaint()) &&
//				(puzzle.edge.get(1).getPaint() == puzzle.edge.get(13).getPaint()) &&
//				(puzzle.edge.get(6).getPaint() == puzzle.edge.get(13).getPaint()))
//		{
//			model.score=model.score+10;
//		}
//		else if((puzzle.edge.get(7).getPaint() == puzzle.edge.get(4).getPaint()) &&  
//				(puzzle.edge.get(7).getPaint() == puzzle.edge.get(14).getPaint()) && 
//				(puzzle.edge.get(14).getPaint() == puzzle.edge.get(4).getPaint()))
//		{
//			model.score=model.score+10;
//		}
//		else if((puzzle.edge.get(2).getPaint() == puzzle.edge.get(8).getPaint()) &&  
//				(puzzle.edge.get(2).getPaint() == puzzle.edge.get(15).getPaint()) && 
//				(puzzle.edge.get(15).getPaint() == puzzle.edge.get(8).getPaint()))
//		{
//			model.score=model.score+10;
//		}
//		else if((puzzle.edge.get(9).getPaint() == puzzle.edge.get(10).getPaint()) &&  
//				(puzzle.edge.get(9).getPaint() == puzzle.edge.get(16).getPaint()) && 
//				(puzzle.edge.get(16).getPaint() == puzzle.edge.get(9).getPaint()))
//		{
//			model.score=model.score+10;
//		}
//		else if((puzzle.edge.get(11).getPaint() == puzzle.edge.get(5).getPaint()) &&  
//				(puzzle.edge.get(11).getPaint() == puzzle.edge.get(17).getPaint()) && 
//				(puzzle.edge.get(5).getPaint() == puzzle.edge.get(17).getPaint()))
//		{
//			model.score=model.score+10;
//		}
//		else
			model.score=model.score-1;
				
		for(int i=0;i<puzzle.edge.size();i++)
		{
			if(puzzle.edge.get(i).getPaint()==puzzle.winningstate.get(i).getPaint())	
			{		
				win=win+1;
			}
			
		}
		if(win == 18)
		{
			System.out.println("Congratulations you have won!");
			iswin = true;
			
		}
		
		
		
	
		}
	
//		app.playerMovesLabel.setText(String.valueOf(moves));
//		if(puzzle.edge.equals(puzzle.winningstate)==true)
//			
//		{
//				app.WinLbl.setText("You have won!!");
//		}
//		else
//		{
//			app.WinLbl.setText(" ");
//		}
		
			

		}
	

	public  int getMoves() {
		return moves;
	}

	public void setMoves(int moves) {
		this.moves = moves;
	}   
		}
	

