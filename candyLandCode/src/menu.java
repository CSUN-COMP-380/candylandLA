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
	JPanel rulesButtonPanel;
	JPanel exitButtonPanel;
	JButton startButton;
	JButton rulesButton;
	JButton exitButton;
	
	TitleScreenHandlerS tsHandlerS = new TitleScreenHandlerS();
	TitleScreenHandlerR tsHandlerR = new TitleScreenHandlerR();
	TitleScreenHandlerE tsHandlerE = new TitleScreenHandlerE();
	
	public menu() {
		
		//BGM
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
        
        //Play Button
		startButtonPanel = new JPanel();
		startButtonPanel.setBounds(365, 230, 153, 60);
		startButtonPanel.setBackground(new Color(0,0,0,0));
		window.add(startButtonPanel);
		
		ImageIcon startImage = new ImageIcon("playButton.png");
		startButton = new JButton(startImage);
		startButton.addActionListener(tsHandlerS);
		
		//Rules Button
		rulesButtonPanel = new JPanel();
		rulesButtonPanel.setBounds(340, 320, 191, 60);
		rulesButtonPanel.setBackground(new Color(0,0,0,0));
		window.add(rulesButtonPanel);
		
		ImageIcon rulesImage = new ImageIcon("rulesButton.png");
		rulesButton = new JButton(rulesImage);
		rulesButton.addActionListener(tsHandlerR);
		
		//Exit Button
		exitButtonPanel = new JPanel();
		exitButtonPanel.setBounds(355, 410, 160, 60);
		exitButtonPanel.setBackground(new Color(0,0,0,0));
		window.add(exitButtonPanel);

		ImageIcon exitImage = new ImageIcon("quitButton.png");
		exitButton = new JButton(exitImage);
		exitButton.addActionListener(tsHandlerE);
		
		//add all buttons to JFrame
		startButtonPanel.add(startButton);
		rulesButtonPanel.add(rulesButton);
		exitButtonPanel.add(exitButton);
	}
	
	//start game
	public class TitleScreenHandlerS implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			//Start game	
		}
	}
	
	//Rules
	public class TitleScreenHandlerR implements ActionListener {
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
			//help text	
		}
	}
	
	//Exit
	public class TitleScreenHandlerE implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			System.exit(0);		
		}
	}
	
}
