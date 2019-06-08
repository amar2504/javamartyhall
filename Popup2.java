package assignmentEventHandling;

import javax.swing.JFrame;

public class Popup2 extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Popup2(){
		super("Separate Class for listener");
		setContentPane(new ControlPanel2());
		setSize(800,400);
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    setVisible(true);
		
	}
	
	public static void main(String[] args) {
	    new Popup2();
	  }
}
