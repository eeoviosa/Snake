import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginPage implements ActionListener{
	JFrame frame = new JFrame();
	JButton loginButton = new JButton("Login");
	JButton resetButton = new JButton("Reset");
	JTextField userIDField  = new JTextField();
	JPasswordField userPasswordField = new JPasswordField();
	JLabel userIDLabel = new JLabel("UserID");
	JLabel userPasswordLabel = new JLabel("Password");
	HashMap<String, String> logininfo = new HashMap<String, String>();
	JLabel messageLabel = new JLabel();

	LoginPage(HashMap<String, String> loginInfoOriginal)
	{
		logininfo = loginInfoOriginal;

		userIDLabel.setBounds(50,100,75,25);
		userPasswordLabel.setBounds(50,150,75,25);

		messageLabel.setBounds(125,250,250,35);
		messageLabel.setFont(new Font(null, Font.ITALIC,25));

		userIDField.setBounds(125,100,200,25);
		userPasswordField.setBounds(125,150,200,25);

		loginButton.setBounds(125,200,100,25);
		loginButton.addActionListener(this);
		loginButton.setFocusable(false);

		resetButton.setBounds(235,200,100,25);
		resetButton.addActionListener(this);
		resetButton.setFocusable(false);

		frame.add(loginButton);
		frame.add(resetButton);
		frame.add(userIDField);
		frame.add(userPasswordField);
		frame.add(messageLabel);
		frame.add(userIDLabel);
		frame.add(userPasswordLabel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,420);
		frame.setLayout(null);
		frame.setVisible(true);

	}
	@Override
	public void actionPerformed(ActionEvent e) {

		if(e.getSource() == resetButton)
		{
			userIDField.setText("");
			userPasswordField.setText("");

		}
		
		if(e.getSource() == loginButton)
		{
				String userID = userIDField.getText();
				String password = String.valueOf(userPasswordField.getPassword());
				
				if(logininfo.containsKey(userID))
				{
					if(logininfo.get(userID).equals(password))
					{
						
								messageLabel.setForeground(Color.green);
								messageLabel.setText("Login Succesful");
								frame.dispose();
								WelcomePage welcome = new WelcomePage(userID);
							
					}
					else
					{
						messageLabel.setForeground(Color.red);
						messageLabel.setText("Invalid Password");
						
					}
				}
				else
				{
					messageLabel.setForeground(Color.red);
					messageLabel.setText("Invalid Username");
				}

		}
		

		
		}

		
	}








