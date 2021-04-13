package geometry;

import java.awt.Graphics;

public class Circle extends Shape{

	protected Point center;
	protected int radius;
	
	public Circle()
	{
		
	}
	public Circle(Point center,int radius)
	{
		this.center=center;
		this.radius=radius;
	}
	public Circle(Point center,int radius,boolean selected)
	{
		this(center,radius);
		this.selected=selected;
	}
	
	public double area()
	{
		return Math.pow(this.radius,2)*Math.PI;
	}
	public double circumference()
	{
		return 2*this.radius*Math.PI;
	}
	public boolean contains(int x,int y)
	{
		return center.distance(x, y) <=radius;
	}
	public boolean contains(Point p)
	{
		return this.contains(p.getX(),p.getY());
	}
	@Override
	public String toString()
	{
		return "Center : "+center.toString()+",radius : "+radius;
	}
	@Override
	public boolean equals(Object obj)
	{
		if(obj instanceof Circle)
		{
			Circle temp=(Circle) obj;
			if(center.equals(temp.center) && radius==temp.radius)
			{
				return true;
			}
		}
		return false;
	}
	public Point getcenter()
	{
		return center;
	}
	public void setcenter(Point center)
	{
		this.center=center;
	}
	public int getradius()
	{
		return radius;
	}
	public void setradius(int radius)
	{
		this.radius=radius;
	}
	@Override
	public void Draw(Graphics g) {
		g.drawOval(center.getX()-radius, center.getY()-radius, 2*radius, 2*radius);
		
	}

}
