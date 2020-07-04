import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class LaLaLand extends JFrame{
	public static void main(String[] args) throws IOException {
		new LaLaLand();
	}

	enum ScreenType {
		INTRO,
		MENU,
		RULES,
		GAME,
		WINNER
	}

	public static ScreenType currentScreen;

	private final MainMenu mainMenu;
	private final Rules rules;

	@Override public void paint(Graphics g) {
		mainMenu.setVisible(currentScreen == ScreenType.MENU);
		rules.setVisible(currentScreen == ScreenType.RULES);

		super.paint(g);
	}

	public void changeScreen(ScreenType newScreen) {
		currentScreen = newScreen;
		mainMenu.setVisible(newScreen == ScreenType.MENU);
		rules.setVisible(newScreen == ScreenType.RULES);
	}

	public LaLaLand() throws IOException {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(new Dimension(1024,700));
		setLayout(null);

		currentScreen = ScreenType.MENU;

		mainMenu = new MainMenu(this::changeScreen);
		this.add(mainMenu);
		rules = new Rules(this::changeScreen);
		this.add(rules);

//		startButton = new Button(365, 230, 153, 60, "buttons/playButton.png", tsHandlerS);
//		rulesButton = new Button(340, 320, 191, 60, "buttons/rulesButton.png", tsHandlerR);
//		exitButton = new Button(355, 410, 160, 60, "buttons/quitButton.png", tsHandlerE);
//
//		this.add(startButton);
//		this.add(rulesButton);
//		this.add(exitButton);
//		this.setOpacity();
		this.setBackground(Color.BLUE);

		setVisible(true);

//		startButton.resize();
//		rulesButton.resize();
//		exitButton.resize();

//		this.revalidate();
//		this.repaint();
		this.repaint();
//		this.revalidate();
//		this.add(rulesButton);
//		currentScreen = Screen.INTRO;

//		MainPanel mainPanel = new MainPanel();
//		JFrame mainFrame = new JFrame();
//		mainFrame.setLayout(new BorderLayout());
//		mainFrame.add(mainPanel, BorderLayout.CENTER);
//		mainFrame.pack();
//		mainFrame.setVisible(true);

		//background
//		JLabel window;
//		new Dimension()

		
//		ImageIcon background_image = new ImageIcon("src/menu.png");
//		//Image img = background_image.getImage();
//		//Image temp_img = img.getScaledInstance(911,600,Image.SCALE_SMOOTH);
//		window = new JLabel("",background_image,JLabel.CENTER);
//		window.setBounds(0, 0, 1020, 700);
////		add(window);
//
//		setVisible(true);
//
//        //Play Button
//		startButtonPanel = new JPanel();
//		startButtonPanel.setBounds(365, 230, 153, 60);
//		startButtonPanel.setBackground(new Color(0,0,0,0));
//		window.add(startButtonPanel);
//
//		ImageIcon startImage = new ImageIcon("src/playButton.png");
//		startButton = new JButton(startImage);
//		startButton.setOpaque(false);
//		startButton.setContentAreaFilled(false);
//		startButton.setBorder(null);
//		startButton.setBorderPainted(false);
//		startButton.addActionListener(tsHandlerS);
//		startButton.setVisible(true);
//
//		//Rules Button
//		rulesButtonPanel = new JPanel();
//		rulesButtonPanel.setBounds(340, 320, 191, 60);
//		rulesButtonPanel.setBackground(new Color(0,0,0,0));
//		window.add(rulesButtonPanel);
//
//		ImageIcon rulesImage = new ImageIcon("src/rulesButton.png");
//		rulesButton = new JButton(rulesImage);
//		rulesButton.setOpaque(false);
//		rulesButton.setContentAreaFilled(false);
//		rulesButton.setBorder(null);
//		rulesButton.setBorderPainted(false);
//		rulesButton.addActionListener(tsHandlerR);
//
//		//Exit Button
//		exitButtonPanel = new JPanel();
//		exitButtonPanel.setBounds(355, 410, 160, 60);
//		exitButtonPanel.setBackground(new Color(0,0,0,0));
//		window.add(exitButtonPanel);
//
//		ImageIcon exitImage = new ImageIcon("src/quitButton.png");
//		exitButton = new JButton(exitImage);
//		exitButton.setOpaque(false);
//		exitButton.setContentAreaFilled(false);
//		exitButton.setBorder(null);
//		exitButton.setBorderPainted(false);
//		exitButton.addActionListener(tsHandlerE);
//
//		startButtonPanel.add(startButton);
//		rulesButtonPanel.add(rulesButton);
//		exitButtonPanel.add(exitButton);
		
		//BGM
//				try {
//					URL url = menu.class.getResource("BGM.wav");
//					AudioInputStream audio = AudioSystem.getAudioInputStream(url);
//					Clip music = AudioSystem.getClip();
//					music.open(audio);
//					music.loop(-1);
//				} catch (Exception ex) {}
	}
	
//	public void rulesPage() {
//
//		rulesFrame = new JFrame("RULES");
//		rulesFrame.setVisible(true);
//		rulesFrame.setSize(911,611);
//
//		JLabel rulesPage = new JLabel();
//		rulesPage.setSize(911,600);
//		rulesPage.setLayout(null);
//		setDefaultCloseOperation(EXIT_ON_CLOSE);
//
//
//		ImageIcon background_image = new ImageIcon("assets/screens/rules.png");
//		rulesPage = new JLabel("",background_image,JLabel.CENTER);
//        rulesPage.setBounds(0, 0, 911, 600);
//
//        //Back to menu button
//        backButtonPanel = new JPanel();
//		backButtonPanel.setBounds(635, 430, 96, 40);
//		backButtonPanel.setBackground(new Color(0,0,0,0));
//
//		ImageIcon backMenu = new ImageIcon("assets/buttons/menuButton.png");
//		backButton = new JButton(backMenu);
//		backButton.setOpaque(false);
//		backButton.setContentAreaFilled(false);
//		backButton.setBorder(null);
//		backButton.setBorderPainted(false);
//		backButton.addActionListener(rsHandler);
//
//		rulesFrame.add(rulesPage);
//		rulesPage.add(backButtonPanel);
//		backButtonPanel.add(backButton);
//	}
}
