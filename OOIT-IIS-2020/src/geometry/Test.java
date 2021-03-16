package geometry;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Point p1=new Point();
		p1.setX(3);
		p1.setY(5);
		p1.setSelected(true);
		System.out.println(p1.getX());
		System.out.println(p1.getY());
		Point p2=new Point();
		p2.setX(13);
		p2.setY(15);
		p2.setSelected(true);
		System.out.println("Udaljenost je : "+p1.distance(p2.getX(), p2.getY()));
		//VEZBE 3
		
		Line l1=new Line();
		l1.setstartPoint(p1);
		l1.setendPoint(p2);
		l1.setselected(true);
		p1.setX(33);
		l1.getstartPoint().setX(55);
		System.out.println("X startpoint l1 : "+l1.getstartPoint().getX());
		
		Line l2=new Line();
		l2.setstartPoint(l1.getstartPoint());
		l2.getendPoint().setY(p1.getX());
		
		
		Rectangle r1=new Rectangle();
		r1.setupperLeft(p2);
		r1.setwidth(5);
		r1.setheight(10);
		System.out.println("Area of r1 : "+r1.area());
		
		Rectangle r2=new Rectangle();
		System.out.println("Circumference of r2 : "+r2.circumference());
		
		
		Circle c1=new Circle();
		c1.setcenter(p2);
		System.out.println("\n\nX center c1: "+c1.getcenter().getX()+"\n\nY center c1 : "+c1.getcenter().getY());
		c1.setradius((int)c1.getcenter().distance(l1.getstartPoint().getX(), l1.getstartPoint().getY()));
		System.out.println(c1.getradius());
		
		l1.getendPoint().setY((c1.getcenter().getX()-c1.getcenter().getY())-(r1.getupperLeft().getX()+(int)c1.area()));
		System.out.println(l1.getendPoint().getY());

	}

}
