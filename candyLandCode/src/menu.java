import java.awt.Color;
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
	
	JFrame main;
	JFrame rulesFrame;
	JPanel backButtonPanel;
	
	JPanel startButtonPanel;
	JPanel rulesButtonPanel;
	JPanel exitButtonPanel;
	JPanel rulesPagePanel;
	
	JButton startButton;
	JButton rulesButton;
	JButton exitButton;
	JButton backButton;
	
	JLabel rulesPage;
	
	TitleScreenHandlerS tsHandlerS = new TitleScreenHandlerS();
	TitleScreenHandlerR tsHandlerR = new TitleScreenHandlerR();
	TitleScreenHandlerE tsHandlerE = new TitleScreenHandlerE();
	rulesScreenHandler rsHandler = new rulesScreenHandler();
	
	public menu() {
		
		//background
		JLabel window;
		setSize(911,600);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		ImageIcon background_image = new ImageIcon("menu.png");	
		//Image img = background_image.getImage();
		//Image temp_img = img.getScaledInstance(911,600,Image.SCALE_SMOOTH);
		window = new JLabel("",background_image,JLabel.CENTER);	
        window.setBounds(0, 0, 911, 600);
        main.add(window);
		
        setVisible(true);
        
        //Play Button
		startButtonPanel = new JPanel();
		startButtonPanel.setBounds(365, 230, 153, 60);
		startButtonPanel.setBackground(new Color(0,0,0,0));
		window.add(startButtonPanel);
		
		ImageIcon startImage = new ImageIcon("playButton.png");
		startButton = new JButton(startImage);
		startButton.setOpaque(false);
		startButton.setContentAreaFilled(false);
		startButton.setBorderPainted(false);
		startButton.addActionListener(tsHandlerS);
		
		//Rules Button
		rulesButtonPanel = new JPanel();
		rulesButtonPanel.setBounds(340, 320, 191, 60);
		rulesButtonPanel.setBackground(new Color(0,0,0,0));
		window.add(rulesButtonPanel);
		
		ImageIcon rulesImage = new ImageIcon("rulesButton.png");
		rulesButton = new JButton(rulesImage);
		rulesButton.setOpaque(false);
		rulesButton.setContentAreaFilled(false);
		rulesButton.setBorderPainted(false);
		rulesButton.addActionListener(tsHandlerR);
		
		//Exit Button
		exitButtonPanel = new JPanel();
		exitButtonPanel.setBounds(355, 410, 160, 60);
		exitButtonPanel.setBackground(new Color(0,0,0,0));
		window.add(exitButtonPanel);

		ImageIcon exitImage = new ImageIcon("quitButton.png");
		exitButton = new JButton(exitImage);
		exitButton.setOpaque(false);
		exitButton.setContentAreaFilled(false);
		exitButton.setBorderPainted(false);
		exitButton.addActionListener(tsHandlerE);
		
		startButtonPanel.add(startButton);
		rulesButtonPanel.add(rulesButton);
		exitButtonPanel.add(exitButton);
		
		//BGM
				try {
					URL url = menu.class.getResource("BGM.wav");
					AudioInputStream audio = AudioSystem.getAudioInputStream(url);
					Clip music = AudioSystem.getClip();
					music.open(audio);
					music.loop(-1);
				} catch (Exception ex) {}
	}
	
	public void rulesPage() {
		
		rulesFrame = new JFrame("RULES");
		rulesFrame.setVisible(true);
		rulesFrame.setSize(911,611);
		
		JLabel rulesPage = new JLabel();
		rulesPage.setSize(911,600);
		rulesPage.setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		ImageIcon background_image = new ImageIcon("rulesPage.png");	
		rulesPage = new JLabel("",background_image,JLabel.CENTER);	
        rulesPage.setBounds(0, 0, 911, 600);
		
        //Back to menu button
        backButtonPanel = new JPanel();
		backButtonPanel.setBounds(635, 430, 96, 40);
		backButtonPanel.setBackground(new Color(0,0,0,0));
		
		ImageIcon backMenu = new ImageIcon("backMenu.png");
		backButton = new JButton(backMenu);
		backButton.setOpaque(false);
		backButton.setContentAreaFilled(false);
		backButton.setBorderPainted(false);
		backButton.addActionListener(rsHandler);
        
		rulesFrame.add(rulesPage);
		rulesPage.add(backButtonPanel);
		backButtonPanel.add(backButton);
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
		
			rulesPage();
		}
	}
	
	//Exit
	public class TitleScreenHandlerE implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			System.exit(0);		
		}
	}
	
	public class rulesScreenHandler implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			rulesFrame.dispose();;	
		}
	}
	
}
