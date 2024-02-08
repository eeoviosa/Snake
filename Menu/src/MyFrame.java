import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MyFrame extends JFrame implements ActionListener {
	JMenuBar menuBar;
	JMenu file;
	JMenu edit;
	JMenu help;
	JMenuItem save;
	JMenuItem load; 
	JMenuItem exit;
	JButton button = new JButton("SelectFile");

	MyFrame()
	{
		button.addActionListener(this);
		//menuBar = new JMenuBar();
		     //file = new JMenu("File");
			// edit = new JMenu("Edit");
			//help = new JMenu("Help");
		//menuBar.add(file);
		//menuBar.add(help);
		//menuBar.add(edit);
		
		//file.setMnemonic(KeyEvent.VK_F);// Alt + key
		//edit.setMnemonic(KeyEvent.VK_E);
		//help.setMnemonic(KeyEvent.VK_H);
		
		
		
		//load = new JMenuItem("Load");
		// save = new JMenuItem("Save");
		// exit = new JMenuItem("Exit");
		
		
		//load.addActionListener(this);
		//save.addActionListener(this);
		//exit.addActionListener(this);
		
		//file.add(load);
		//file.add(save);
		//file.add(exit);
		
		//load.setMnemonic(KeyEvent.VK_L);// l for load
		//save.setMnemonic(KeyEvent.VK_S);//s for save
		//exit.setMnemonic(KeyEvent.VK_E);// e for exit
		
	
		this.setJMenuBar(menuBar);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setVisible(true);
	this.setSize(500,500);
	this.setLayout(new FlowLayout());
	this.getContentPane().setBackground(Color.BLUE);
	this.add(button);
	
	
	

		// TODO Auto-generated method stub
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == load)
		{
			System.out.println("You loaded a file");
		}
		
		if(e.getSource() == save)
		{
			System.out.println("You save a file");
		}
		
		if(e.getSource() == exit)
		{
			System.exit(0);
		}
		
		if(e.getSource() == button)
		{
			JFileChooser Filechooser = new JFileChooser();
			Filechooser.setCurrentDirectory(new File("."));
			int response = Filechooser.showSaveDialog(null);
			//int response = Filechooser.showOpenDialog(null);//select file to open
			if (response == JFileChooser.APPROVE_OPTION);
			{
				File file = new File (Filechooser.getSelectedFile().getAbsolutePath());
				System.out.print(file);
			}
		}
	} 

}
