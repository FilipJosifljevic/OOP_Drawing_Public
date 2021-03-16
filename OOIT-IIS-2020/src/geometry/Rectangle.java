package geometry;

public class Rectangle {

	private Point upperLeft;
	private int width;
	private int height;
	private boolean selected;
	
	public int area()
	{
		return this.width*this.height;
	}
	public int circumference()
	{
		return 2*(this.width+this.height);
	}
	
	public Point getupperLeft()
	{
		return upperLeft;
	}
	public void setupperLeft(Point upperLeft)
	{
		this.upperLeft=upperLeft;
	}
	public int getwidth()
	{
		return width;
	}
	public void setwidth(int width)
	{
		this.width=width;
	}
	public int getheight()
	{
		return height;
	}
	public void setheight(int height)
	{
		this.height=height;
	}
	public boolean isselected()
	{
		return selected;
	}
	public void setselected(boolean selected)
	{
		this.selected=selected;
	}
}
