package geometry;

public class Rectangle {

	private Point upperLeft;
	private int width;
	private int height;
	private boolean selected;
	
	public Rectangle()
	{
		
	}
	public Rectangle(Point upperLeft,int width,int height)
	{
		this.upperLeft=upperLeft;
		this.width=width;
		this.height=height;
	}
	public Rectangle(Point upperLeft,int width,int height,boolean selected)
	{
		this(upperLeft,width,height);
		this.selected=selected;
	}
	
	public int area()
	{
		return this.width*this.height;
	}
	public int circumference()
	{
		return 2*(this.width+this.height);
	}
	
	@Override
	public String toString()
	{
		return "Upper left point : "+upperLeft+",width : "+width+",height : "+height;
	}
	@Override
	public boolean equals(Object obj)
	{
		if(obj instanceof Rectangle)
		{
			Rectangle temp=(Rectangle) obj;
			if(upperLeft.equals(temp.upperLeft) && width==temp.width && height==temp.height)
			{
				return true;
			}
		}
		return false;
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
