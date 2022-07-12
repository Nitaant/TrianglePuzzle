package starting.model;

import java.util.Objects;
import java.awt.*;

public class Edge {
		public Node n1;
		public Node n2;
		
		
		public Color c;
		public Edge(Node n1,Node n2, Color c)
		{
			this.n1 = n1;
			this.n2 = n2;
			this.c = c;
			

		}
		public void setN1(Node n1) { this.n1 = n1; }
		public void setN2(Node n2) { this.n2 = n2; }
		public void setPaint(Color c) { this.c = c; }
		
		public Node getN1() { return n1; }
		public Node getN2() { return n2; }
		
		public Color getPaint() { return c; }

			// TODO Auto-generated method stub
		
			
	
	

}

