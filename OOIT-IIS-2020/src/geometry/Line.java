package geometry;

public class Line {

	private Point startPoint=new Point();
	private Point endPoint=new Point();
	private boolean selected;
	
	public double length()
	{
		return startPoint.distance(endPoint.getX(), endPoint.getY());
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
	public boolean isselected()
	{
		return selected;
	}
	public void setselected(boolean selected)
	{
		this.selected=selected;
	}
}
