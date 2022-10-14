package Project;

import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LoginPage implements ActionListener{
	// login page has the hash map
	HashMap<String,String> loginIds = new HashMap<String,String>();
	
	// all the buttons
	JFrame frame;
	JPanel panel;
	JLabel enterId;
	JLabel welcomeMessage;
	JTextField usrId;
	JButton status;
	JButton login;
	
	
	public void setupButtons() {
		frame = new JFrame();
		panel = new JPanel();
		welcomeMessage = new JLabel(); 
		enterId = new JLabel("Enter ID: ");
		usrId = new JTextField("Enter your ASURITE ID");
		status = new JButton("Status");
		login = new JButton("Order Now");
		status.addActionListener(this);
		login.addActionListener(this);
	}
	
	public void setUpScene() {
		//panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		//panel.setLayout(new GridLayout());
		//frame.add(panel);
		frame.setTitle("Welcome | Enter your ID");
		frame.setSize(400,150);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	public void addButtons() {
		enterId.setBounds(170, 1, 100, 50);
		usrId.setBounds(25, 40, 350, 30);
		status.setBounds(200, 70, 100, 30);
		login.setBounds(100, 70, 100, 30);

		frame.add(enterId);
		frame.add(usrId);
		frame.add(status);
		frame.add(login);

	}
	LoginPage(HashMap<String, String> ids)
	{
		
		this.loginIds = ids;
		setupButtons();
		setUpScene();
		addButtons();
		
	}

	
	@Override // ignore for now
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if(arg0.getSource() == login) {
			String id = usrId.getText();
			System.out.println(id);	// for debug purposes
			if(loginIds.containsKey(id)) {
				String actor = loginIds.get(id);
				//JOptionPane.showMessageDialog(JOptionPane.INFORMATION_MESSAGE, "Welcome "+ actor);
				JOptionPane.showMessageDialog(frame, "Welcome "+ actor, "",JOptionPane.PLAIN_MESSAGE);
				
			}else {
				JOptionPane.showMessageDialog(frame, "ID Not found!", "", JOptionPane.ERROR);

			}
			
		}
		
	}
}
