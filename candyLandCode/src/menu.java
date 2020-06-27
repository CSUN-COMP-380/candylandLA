import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;      

public class menu extends JFrame{
	
	public static void main(String[] args) {
		
		new menu();
	}
	
	JPanel startButtonPanel;
	JPanel helpButtonPanel;
	JPanel exitButtonPanel;
	JButton startButton;
	JButton helpButton;
	JButton exitButton;
	
	Font StartFont = new Font("Time New Roman", Font.PLAIN, 30);
	Font HelpFont = new Font("Time New Roman", Font.PLAIN, 30);
	Font ExitFont = new Font("Time New Roman", Font.PLAIN, 30);
	
	TitleScreenHandlerS tsHandlerS = new TitleScreenHandlerS();
	TitleScreenHandlerH tsHandlerH = new TitleScreenHandlerH();
	TitleScreenHandlerE tsHandlerE = new TitleScreenHandlerE();
	
	public menu() {
		
		try {
			URL url = menu.class.getResource("BGM.wav");
			AudioInputStream audio = AudioSystem.getAudioInputStream(url);
			Clip music = AudioSystem.getClip();
			music.open(audio);
			music.loop(-1);
		} catch (Exception ex) {}
		
		//frame
		JLabel window;
		setSize(911,600);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//background
		ImageIcon background_image = new ImageIcon("menu.png");
		
		Image img = background_image.getImage();
		Image temp_img = img.getScaledInstance(911,600,Image.SCALE_SMOOTH);
		window = new JLabel("",background_image,JLabel.CENTER);
		
        window.setBounds(0, 0, 911, 600);
		add(window);
		
        setVisible(true);
		
		startButtonPanel = new JPanel();
		startButtonPanel.setBounds(355, 250, 200, 100);
		startButtonPanel.setBackground(new Color(0,0,0,0));
		window.add(startButtonPanel);
		
		startButton = new JButton("START");
		startButton.setBackground(Color.black);
		startButton.setForeground(Color.white);
		startButton.setFont(StartFont);
		startButtonPanel.add(startButton);	
		
		helpButtonPanel = new JPanel();
		helpButtonPanel.setBounds(355, 350, 200, 100);
		helpButtonPanel.setBackground(new Color(0,0,0,0));
		window.add(helpButtonPanel);
		
		helpButton = new JButton("HELP");
		helpButton.setBackground(Color.black);
		helpButton.setForeground(Color.white);
		helpButton.setFont(HelpFont);
		
		exitButtonPanel = new JPanel();
		exitButtonPanel.setBounds(355, 450, 200, 100);
		exitButtonPanel.setBackground(new Color(0,0,0,0));
		window.add(exitButtonPanel);
		
		exitButton = new JButton("EXIT");
		exitButton.setBackground(Color.black);
		exitButton.setForeground(Color.white);
		exitButton.setFont(HelpFont);
		exitButton.addActionListener(tsHandlerE);
		
		
		startButtonPanel.add(startButton);
		helpButtonPanel.add(helpButton);
		exitButtonPanel.add(exitButton);
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
