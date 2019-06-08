package assignmentEventHandling;

import javax.swing.JFrame;

public class Popup4 extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Popup4(){
		super("Anonymous Class");
		setContentPane(new ControlPanel4());
		setSize(800,400);
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    setVisible(true);
		
	}
	
	public static void main(String[] args) {
	    new Popup4();
	  }
}
