package punt1;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;

public class Circulo extends JFrame{
	private int radio;
	
	public Circulo() {
		super();
		radio=50;
	}
	
	public void rojo(Graphics g) {
		super.paint(g);
		Graphics2D circle=(Graphics2D)g; //dibujar
		circle.setStroke(new BasicStroke(10.f));
		circle.setPaint(Color.red);
		circle.drawOval(180, 228, radio, radio);
	}
	public void verde(Graphics g) {
		super.paint(g);
		Graphics2D circle=(Graphics2D)g; //dibujar
		circle.setStroke(new BasicStroke(10.f));
		circle.setPaint(Color.green);
		circle.drawOval(180, 228, radio, radio);
	}
}
