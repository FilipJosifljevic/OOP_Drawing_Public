package geometry;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Drawing extends JPanel{

	public static void main(String[] args) {
		
		JFrame frame=new JFrame("Drawing");
		frame.setSize(800, 600);
		Drawing drawing=new Drawing();
		frame.getContentPane().add(drawing);
		frame.setVisible(true);
	}
	
	public void paint(Graphics g)
	{
		Point p1=new Point(50,50);
		//p1.Draw(g);
		g.setColor(Color.RED);
		Line l1=new Line(new Point(100,100),new Point(200,200));
		//l1.Draw(g);
		g.setColor(Color.GREEN);
		//l1.getstartPoint().Draw(g);
		g.setColor(Color.BLACK);
		Rectangle r1=new Rectangle(l1.getendPoint(),100,50);
		//r1.Draw(g);
		Circle c1=new Circle(new Point(500,100),80);
		//c1.Draw(g);
		//c1.getcenter().Draw(g);
		Donut d1=new Donut(new Point(800,100),50,25);
		//d1.Draw(g);
		
		Rectangle k1=new Rectangle(new Point(500,500),50,50);
		//k1.Draw(g);
		int innerRD2=(int)(k1.getheight()*Math.sqrt(2))/2;
		Point p2=new Point(k1.getupperLeft().getX()+k1.getheight()/2,k1.getupperLeft().getY()+k1.getheight()/2);
		Donut d2=new Donut(p2,80,innerRD2);
		//d2.Draw(g);
		
		ArrayList<Shape> shapes=new ArrayList<Shape>();
		shapes.add(p1);
		shapes.add(l1);
		shapes.add(c1);
		shapes.add(d1);
		shapes.add(r1);
		
		Iterator<Shape> it=shapes.iterator();
		
		shapes.get(2).Draw(g);
		shapes.get(shapes.size()-1).Draw(g);
		shapes.remove(2);
		shapes.get(2).Draw(g);
		
		HashMap<String,Shape> hmshapes=new HashMap<String,Shape>();
		while(it.hasNext())
		{
			hmshapes.put(it.next().getClass().getName(), it.next());
		}
		
	}
}
