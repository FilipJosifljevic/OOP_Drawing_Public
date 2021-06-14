package drawing;

import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JPanel;

public class PnlDrawing extends JPanel{
	 ArrayList<Shape> shapes=new ArrayList<Shape>();
	 Shape sel;
	public PnlDrawing()
	{
		this.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				for(Shape s : shapes)
				{
					if(s.contains(e.getX(),e.getY()))
					{
						if(s!=null)
						{
							sel.setselected(false);
						}
						sel=s;
						s.setselected(true);
					}
				}
				
			}
		});
	
	}
	
	public ArrayList<Shape> getShapes() {
		return shapes;
	}

	public void setShapes(ArrayList<Shape> shapes) {
		this.shapes = shapes;
	}

	public Shape getSel() {
		return sel;
	}

	public void setSel(Shape sel) {
		this.sel = sel;
	}

	@Override
	public void paint(Graphics g)
	{
		for(Shape s : this.shapes)
		{
			s.Draw(g);
		}
	}
	
}
