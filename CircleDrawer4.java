package listnerExample;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CircleDrawer4 extends Applet{
	@Override
	public void init() {
		setForeground(Color.BLUE);
		// We are passing an object here to the add Mouse Listener
		addMouseListener( new MouseAdapter() {
			private int radius = 25;
			
			@Override
			public void mousePressed(MouseEvent e) {
				Graphics g = getGraphics();
				g.fillOval(e.getX()-radius, e.getY() - radius, 2*radius, 2*radius);
			}; 	
				
		});
	}

}