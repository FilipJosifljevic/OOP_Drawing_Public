package geometry;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Point p1=new Point();
		p1.setX(3);
		p1.setY(5);
		System.out.println(p1.getX());
		System.out.println(p1.getY());
		Point p2=new Point();
		p2.setX(13);
		p2.setY(15);
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
		
		//VEZBE 4
		
		System.out.println(p1);
		System.out.println(l1);
		System.out.println(r1);
		System.out.println(c1);
		Circle c2=new Circle();
		c2.setcenter(p2);
		c2.setradius(3);
		System.out.println(c1.equals(c2));
		
		//VEZBE 5
		
		Point p7=new Point(6,6);
		Point p8=new Point(6,7);
		System.out.println(p7.contains(p8.getX(),p8.getY()));
		System.out.println(p7.contains(p8.getX()+3,p8.getY()));
		
		Circle c4=new Circle(p2,10);
		System.out.println(c4.contains(p8));
		System.out.println(c4.contains(9,10));
		
		Donut d1=new Donut();
		//d1.center=new Point(10,20); moze se korisatiti zato sto je centar definisan kao protected
		d1.setcenter(new Point(10,20));
		d1.setinnerRadius(10);
		d1.setradius(50);
		System.out.print(d1);
		System.out.println("d1 contains (14,20) : "+d1.contains(24, 20));
		Circle c5=new Circle(d1.center,d1.radius);
		System.out.println("d1 equals c5: "+d1.equals(c5));
		Donut d2=new Donut(new Point(10,20),50,10);
		System.out.println("d1 equals d2:"+d1.equals(d2));
		
		System.out.println("d1 area: "+d1.area());
		System.out.println("d1 circumference: "+d1.circumference());
		
		//VEZBE 7
		System.out.println("\n VEZBE 7");
		System.out.println(p1);
		p1.moveBy(5, 3);
		System.out.println(p1);
		p1.moveTo(5, 3);
		System.out.println(p1);
		
		System.out.println(l1);
		l1.setendPoint(p1);
		l1.moveBy(5, 3);
		System.out.println(l1);
		l1.moveTo(5,3);
		System.out.println(l1);
		
		System.out.println(r1);
		r1.moveBy(5, 3);
		System.out.println(r1);
		r1.moveTo(5, 3);
		System.out.println(r1);
		
		System.out.println(c1);
		c1.moveBy(5, 3);
		System.out.println(c1);
		c1.moveTo(5, 3);
		System.out.println(c1);
		
		System.out.println(d1);
		d1.moveBy(5, 3);
		System.out.println(d1);
		d1.moveTo(5, 3);
		System.out.println(d1);
		
		Shape d3=new Donut(p1,10,2);
		Shape p9=new Point();
		Shape l9=l1;
		Shape c9=c1;
		
		//Shape[] shapes=new Shape[4];
		Shape[] shapes={d3,p9,l9,c9};
		System.out.println("\n");
		for(int i=0;i<shapes.length;i++)
		{
			System.out.println(shapes[i]);
		}
		for(int i=0;i<shapes.length;i++)
		{
			shapes[i].moveBy(1, 2);
		}
		for(int i=0;i<shapes.length;i++)
		{
			System.out.println(shapes[i]);
		}
		
		int[] ints= {5,2,3,4,1};
		System.out.println("Nesortiran niz : ");
		for(int i=0;i<ints.length;i++)
		{
			System.out.println(ints[i]);
		}
		Arrays.sort(ints);
		for(int i=0;i<ints.length;i++)
		{
			System.out.println(ints[i]);
		}
		
		Point p10=new Point(10,10);
		Point p20=new Point(20,20);
		Point p30=new Point(30,30);
		Point p40=new Point(40,40);
		Point[] points= {p30,p20,p40,p10};
		System.out.println("Nesortiran niz : ");
		for(int i=0;i<points.length;i++)
		{
			System.out.println(points[i]);
		}
		Arrays.sort(points);
		System.out.println("Sortiran niz : ");
		for(int i=0;i<points.length;i++)
		{
			System.out.println(points[i]);
		}
		
		Line l10=new Line(new Point(10,10),new Point(100,100));
		Line l20=new Line(new Point(20,20),new Point(200,200));
		Line l30=new Line(new Point(30,30),new Point(300,300));
		Line l40=new Line(new Point(40,40),new Point(400,400));
		Line[] lines= {l20,l40,l30,l10};
		System.out.println("Nesortiran niz : ");
		for(int i=0;i<lines.length;i++)
		{
			System.out.println(lines[i]);
		}
		Arrays.sort(lines);
		System.out.println("Sortiran niz : ");
		for(int i=0;i<lines.length;i++)
		{
			System.out.println(lines[i]);
		}
		
		Rectangle r10=new Rectangle(p1,10,10);
		Rectangle r20=new Rectangle(p2,20,20);
		Rectangle r30=new Rectangle(p1,30,30);
		Rectangle[] rectangles= {r20,r30,r10};
		Arrays.sort(rectangles);
		System.out.println("Sortiran niz : ");
		for(int i=0;i<rectangles.length;i++)
		{
			System.out.println(rectangles[i]+",area "+rectangles[i].area());
		}
		
		Circle c10=new Circle(p1,10);
		Circle c20=new Circle(p1,20);
		Circle c30=new Circle(p1,30);
		Circle[] circles= {c30,c20,c10};
		Arrays.sort(circles);
		System.out.println("Sortiran niz : ");
		for(int i=0;i<circles.length;i++)
		{
			System.out.println(circles[i]+",area "+circles[i].area());
		}
	}

}
