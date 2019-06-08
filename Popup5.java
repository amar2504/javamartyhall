package assignmentEventHandling;

import javax.swing.JFrame;

public class Popup5 extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Popup5(){
		super("Anonymous Class");
		setContentPane(new ControlPanel5());
		setSize(800,400);
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 setVisible(true);
		
	}
	
	public static void main(String[] args) {
	    new Popup5();
	  }
}
