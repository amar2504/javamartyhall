package assignmentEventHandling;

import java.awt.Color;

import javax.swing.JPanel;

public class ControlPanel1 extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ControlPanel1() {
		setBackground(Color.RED);
		addMouseListener(new mouseeffect(this));		
	}
	
	public void swapColors() {
		if(getBackground() == Color.RED)
			setBackground(Color.YELLOW);
		else
			setBackground(Color.RED);
	}
}
