package listnerExample;
import java.applet.*;
import java.awt.*;


//and applied to the simple where the listner doen't need to call any method in the main 
//window. Listner doesn't call any method of applets class

public class ClickReporter extends Applet {
	
	@Override
	public void init() {
		setBackground(Color.yellow);
		// We are passing an object here to the add Mouse Listener
		addMouseListener(new ClickListener(this));
	}
}
