package assignmentEventHandling;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JPanel;
import java.awt.event.KeyAdapter;
public class ControlPanel5 extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ControlPanel5() {
		setBackground(Color.YELLOW);
		addKeyListener(new KeyAdapter() {
			
			@Override
			public void keyPressed(KeyEvent e) {
				String key = String.valueOf(e.getKeyChar());
				switch(key) {
				case "r" : setBackground(Color.RED);break;
				case "o" : setBackground(Color.orange);break;
				case "y" : setBackground(Color.YELLOW);break;
				
				}
				
			};
		}
		);	
	    setFocusable(true);
	    requestFocusInWindow();
	}

}


