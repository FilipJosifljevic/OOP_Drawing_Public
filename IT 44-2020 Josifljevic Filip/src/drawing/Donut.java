package drawing;

import java.awt.Color;
import java.awt.Graphics;

public class Donut extends Circle{
	private int innerRadius;
	
	public Donut()
	{
		
	}
	public Donut(Point center,int radius,int innerRadius)
	{
		super(center,radius);
		this.innerRadius=innerRadius;
	}
	public Donut(Point center,int radius,int innerRadius,boolean selected)
	{
		this(center,radius,innerRadius);
		this.selected=selected;
	}
	@Override
	public boolean contains(int x,int y)
	{
		return super.contains(x,y) && center.distance(x, y)>=innerRadius;
	}
	@Override
	public boolean contains(Point p)
	{
		return this.contains(p.getX(),p.getY());
	}
	@Override
	public void Draw(Graphics g) {
		g.setColor(Color.BLACK);
		super.Draw(g);
		g.drawOval(center.getX()-innerRadius, center.getY()-innerRadius, 2*innerRadius, 2*innerRadius);
		if(selected)
		{
			g.setColor(Color.BLUE);
			g.drawRect(center.getX()-2, center.getY()-2, 4, 4);
			g.drawRect(center.getX()-radius-2, center.getY()-2, 4, 4);
			g.drawRect(center.getX()+radius-2, center.getY()-2, 4, 4);
			g.drawRect(center.getX()-2, center.getY()-radius-2, 4, 4);
			g.drawRect(center.getX()-2, center.getY()+radius-2, 4, 4);
			g.drawRect(center.getX()-2, center.getY()-2, 4, 4);
			g.drawRect(center.getX()-innerRadius-2, center.getY()-2, 4, 4);
			g.drawRect(center.getX()+innerRadius-2, center.getY()-2, 4, 4);
			g.drawRect(center.getX()-2, center.getY()-innerRadius-2, 4, 4);
			g.drawRect(center.getX()-2, center.getY()+innerRadius-2, 4, 4);
		}
	}
	@Override
	public double area()
	{
		return super.area() - Math.pow(innerRadius,2)*Math.PI;
	}
	@Override
	public String toString()
	{
		return super.toString() + ",inner radius = "+innerRadius;
	}
	@Override
	public boolean equals(Object obj)
	{
		if(obj instanceof Donut)
		{
			Donut temp=(Donut) obj;
			if(super.equals(new Circle(temp.center,temp.radius)) && innerRadius==temp.innerRadius);
			{
				return true;
			}
		}
		return false;
	}
	public int getinnerRadius()
	{
		return innerRadius;
	}
	public void setinnerRadius(int innerRadius)
	{
		this.innerRadius=innerRadius;
	}
}
