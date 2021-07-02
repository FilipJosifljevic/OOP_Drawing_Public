package drawing;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JPanel;

public class PnlDrawing extends JPanel {

	ArrayList<Shape> al=new ArrayList<Shape>();
	Iterator<Shape> it=al.iterator();
	/**
	 * Create the panel.
	 */
	public PnlDrawing() {
		
	}
	@Override
	public void paint(Graphics g)
	{
		
		while(it.hasNext())
		{
			it.next().Draw(g);
		}
	}
	public ArrayList<Shape> getAl() {
		return al;
	}
	public void setAl(ArrayList<Shape> al) {
		this.al = al;
	}
	public void removeShape(Shape s)
	{
		al.remove(s);
		repaint();
	}
	public void deselect()
	{
		for(Shape s:this.al)
		{
			s.setselected(false);
		}
	}
	public void select(Point p)
	{
		for(Shape s:this.al)
		{
			if(s.contains(p.getX(), p.getY()))
			{
				s.setselected(true);
				repaint();
			}
		}
	}
	

}
