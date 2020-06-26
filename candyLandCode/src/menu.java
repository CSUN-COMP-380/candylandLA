import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;      

public class menu extends JFrame{
   
	JFrame window;
	Container con;
	JPanel titleNamePanel;
	JLabel titleNameLabel;
	JPanel startButtonPanel;
	JPanel helpButtonPanel;
	JPanel exitButtonPanel;
	JButton startButton;
	JButton helpButton;
	JButton exitButton;
	
	Font titleFont = new Font("Time New Roman", Font.PLAIN, 90);
	Font StartFont = new Font("Time New Roman", Font.PLAIN, 30);
	Font HelpFont = new Font("Time New Roman", Font.PLAIN, 30);
	Font ExitFont = new Font("Time New Roman", Font.PLAIN, 30);
	
	TitleScreenHandlerS tsHandlerS = new TitleScreenHandlerS();
	TitleScreenHandlerH tsHandlerH = new TitleScreenHandlerH();
	TitleScreenHandlerE tsHandlerE = new TitleScreenHandlerE();
	
	public static void main(String[] args) {
		
		new menu();
	}
	
	public menu() {
		
		JLabel background;
		setSize(800,600);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	//	window.getContentPane().setBackground(Color.black);
		ImageIcon img = new ImageIcon("mainMenu_buttons.png");
		
		background = new JLabel("",img,JLabel.CENTER);
		background.setBounds(0,0,800,600);
		add(background);
		
		setVisible(true);
		
		
		
		titleNamePanel = new JPanel();
		titleNamePanel.setBounds(100, 50, 600, 120);
		titleNamePanel.setBackground(Color.black);
		titleNameLabel = new JLabel("CandyLand LA");
		titleNameLabel.setForeground(Color.white);
		titleNameLabel.setFont(titleFont);
		
		startButtonPanel = new JPanel();
		startButtonPanel.setBounds(300, 200, 200, 100);
		startButtonPanel.setBackground(Color.black);
		
		startButton = new JButton("START");
		startButton.setBackground(Color.black);
		startButton.setForeground(Color.white);
		startButton.setFont(StartFont);
		
		helpButtonPanel = new JPanel();
		helpButtonPanel.setBounds(300, 300, 200, 100);
		helpButtonPanel.setBackground(Color.black);
		
		helpButton = new JButton("HELP");
		helpButton.setBackground(Color.black);
		helpButton.setForeground(Color.white);
		helpButton.setFont(HelpFont);
		
		exitButtonPanel = new JPanel();
		exitButtonPanel.setBounds(300, 400, 200, 100);
		exitButtonPanel.setBackground(Color.black);
		
		exitButton = new JButton("EXIT");
		exitButton.setBackground(Color.black);
		exitButton.setForeground(Color.white);
		exitButton.setFont(HelpFont);
		exitButton.addActionListener(tsHandlerE);
		
		titleNamePanel.add(titleNameLabel);
		startButtonPanel.add(startButton);
		helpButtonPanel.add(helpButton);
		exitButtonPanel.add(exitButton);
		
		con.add(titleNamePanel);
		con.add(startButtonPanel);
		con.add(helpButtonPanel);
		con.add(exitButtonPanel);
	}
	
	public class TitleScreenHandlerS implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			//Start game	
		}
	}
	
	public class TitleScreenHandlerH implements ActionListener {
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
			//help text	
		}
	}
	public class TitleScreenHandlerE implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			System.exit(0);		
		}
	}
	
}