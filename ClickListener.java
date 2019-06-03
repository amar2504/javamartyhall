package listnerExample;
import java.applet.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ClickListener extends MouseAdapter{
	
	private Applet a;
	// We are taking in the applet in its constructor which is being used 
	// to the graphics method of the applet class.
	
	public ClickListener(Applet a ) {
		this.a = a;
	}

	//This is to get the x and y coordinate of the x and y of the mouse presssed. 	
	@Override
	public void mousePressed(MouseEvent event) {
		int x = event.getX();
		int y = event.getY();
		
		Graphics g = a.getGraphics();
		g.fillRect(x, y, 50, 100);		
		System.out.printf("Mouse Pressed at (%s, %s).%n",x,y);
	}

}
