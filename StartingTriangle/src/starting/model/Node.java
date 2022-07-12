package starting.model;

import java.util.Objects;

public class Node {
	
	public int x;
	public int y;
	public boolean isSelected;
	public Node(int x, int y)
	{
		this.x = x;
		this.y = y;
		this.isSelected= false;
		

	}
	public void setX(int x) { this.x = x; }
	public void setY(int y) { this.y = y; }

	public int getX() { return x; }
	public int getY() { return y; }
	
	public boolean getisSelected()
	{
		return this.isSelected;
	}
	public void isSelected()
	{
		isSelected = !isSelected;
	}
	
//	public int hashcode()
//	{
//		return Objects.hash(isSelected, x, y);
//	}
//	public boolean equals(Object o) {
//		if (o == null) { return false; }
//		
//		if (o instanceof Node) {
//			Node other = (Node) o;
//			return x == other.x && y == other.y && isSelected==other.isSelected;
//		}
//		
//		return false;
//	}
	public boolean contains(Coordinate c) {
		// TODO Auto-generated method stub
	
		if (c.x >= x-10 && c.x < x+10 && c.y >= y-10 && c.y< y + 20) {
			return true;
		}
		return false;
	}
	
}