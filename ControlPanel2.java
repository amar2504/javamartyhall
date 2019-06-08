package assignmentEventHandling;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

public class ControlPanel2 extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ControlPanel2() {
		setBackground(Color.YELLOW);
		addMouseListener(new clickeffect1());		
	}
	
	
	
	private class clickeffect1 extends MouseAdapter{
		@Override
		public void mousePressed(MouseEvent e) {
			if(getBackground() == Color.RED)
				setBackground(Color.YELLOW);
			else
				setBackground(Color.RED);
		}
	}
}	

