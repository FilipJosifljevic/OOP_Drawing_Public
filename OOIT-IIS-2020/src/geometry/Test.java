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
	}

}
