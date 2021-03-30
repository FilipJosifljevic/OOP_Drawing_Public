package geometry;

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
