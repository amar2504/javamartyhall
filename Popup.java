package assignmentEventHandling;

import javax.swing.JFrame;

public class Popup extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Popup(){
		super("Separate Class for listener");
		setContentPane(new ControlPanel1());
		setSize(800,400);
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    setVisible(true);
		
	}
	
	public static void main(String[] args) {
	    new Popup();
	  }
}
