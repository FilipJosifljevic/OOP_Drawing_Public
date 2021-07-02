package drawing;

import java.awt.Graphics;

public abstract class Shape implements Moveable,Comparable{
	protected boolean selected;
	
	public Shape()
	{
		
	}
	public Shape(boolean selected)
	{
		this.selected=selected;
	}
	
	public abstract boolean contains(int x,int y);
	public abstract void Draw(Graphics g);
	
	public boolean isselected()
	{
		return selected;
	}
	public void setselected(boolean selected)
	{
		this.selected=selected;
	}
}
