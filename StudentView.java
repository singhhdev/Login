package Project;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class StudentView {
	JFrame frame;
	JButton orderHere;
	JButton checkStatus;
	JLabel actorName;
	
	public void setUpButtons() {
		frame = new JFrame();
		orderHere = new JButton();
		checkStatus = new JButton();
	}
	public void setUpScene(String actor) {
		frame.setLayout(null);
		frame.setSize(400, 400);
		frame.setVisible(true);
		frame.setTitle("Welcome || " + actor);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		
	}
	StudentView(String actor){
		setUpButtons();
		setUpScene(actor);
	}
}
