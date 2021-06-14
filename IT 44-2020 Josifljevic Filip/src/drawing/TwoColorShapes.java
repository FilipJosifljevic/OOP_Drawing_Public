package drawing;

import java.awt.Color;
import java.awt.Graphics;

public abstract class TwoColorShapes extends Shape{
	private Color innerColor;

	public abstract void fill(Graphics g);

	public Color getInnerColor() {
		return innerColor;
	}

	public void setInnerColor(Color innerColor) {
		this.innerColor = innerColor;
	}
}
