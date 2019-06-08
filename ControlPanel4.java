package assignmentEventHandling;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

public class ControlPanel4 extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ControlPanel4() {
		setBackground(Color.YELLOW);
		addMouseListener(new MouseAdapter() {
			
			@Override
			public void mousePressed(MouseEvent e) {
				if(getBackground() == Color.RED)
					setBackground(Color.YELLOW);
				else
					setBackground(Color.RED);
			}
			
		}
		);		
	}

}


