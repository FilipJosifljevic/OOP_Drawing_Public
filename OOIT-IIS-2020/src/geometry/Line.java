package geometry;

import java.awt.Graphics;

public class Line extends Shape{

	private Point startPoint=new Point();
	private Point endPoint=new Point();
	
	public Line()
	{
		
	}
	public Line(Point startPoint,Point endPoint)
	{
		this.startPoint=startPoint;
		this.endPoint=endPoint;
	}
	public Line(Point startPoint,Point endPoint,boolean selected)
	{
		this(startPoint,endPoint);
		this.selected=selected;
	}
	
	public double length()
	{
		return startPoint.distance(endPoint.getX(), endPoint.getY());
	}
	public boolean contains(int x,int y)
	{
		return (startPoint.distance(x, y)+endPoint.distance(x, y))-length()<=2;
	}
	@Override
	public String toString()
	{
		return startPoint+" --> "+endPoint;
	}
	@Override
	public boolean equals(Object obj)
	{
		if(obj instanceof Line)
		{
			Line temp=(Line) obj;
			return startPoint.equals(temp.startPoint) && endPoint.equals(temp.endPoint);
		}
		return false;
	}
	public Point getstartPoint()
	{
		return startPoint;
	}
	public void setstartPoint(Point startPoint)
	{
		this.startPoint=startPoint;
	}
	public Point getendPoint()
	{
		return endPoint;
	}
	public void setendPoint(Point endPoint)
	{
		this.endPoint=endPoint;
	}
	@Override
	public void Draw(Graphics g) {
		g.drawLine(startPoint.getX(), startPoint.getY(), endPoint.getX(), endPoint.getY());
		
	}

}
