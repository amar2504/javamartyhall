package assignmentEventHandling;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class mouseeffect extends MouseAdapter{

	private ControlPanel1 j;

	public mouseeffect( ControlPanel1 j) {
		this.j = j;
	}
	
	@Override
	public void mousePressed(MouseEvent e) {
		j.swapColors();
	}
	

}
