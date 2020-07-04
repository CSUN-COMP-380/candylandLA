import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.function.Consumer;

public class MainMenu extends Screen {
	Button startButton;
	Button rulesButton;
	Button exitButton;

	public MainMenu(Consumer<LaLaLand.ScreenType> changeScreen) throws IOException {
		super(changeScreen, "mainMenu.png");

		ActionListener startListener = actionEvent -> changeScreen.accept(LaLaLand.ScreenType.GAME);
		ActionListener rulesListener = actionEvent -> changeScreen.accept(LaLaLand.ScreenType.RULES);
		ActionListener exitListener = actionEvent -> System.exit(0);

		startButton = new Button(365, 230, 153, 60, "buttons/playButton.png", startListener);
		rulesButton = new Button(340, 320, 191, 60, "buttons/rulesButton.png", rulesListener);
		exitButton = new Button(355, 410, 160, 60, "buttons/quitButton.png", exitListener);

		this.add(startButton);
		this.add(rulesButton);
		this.add(exitButton);

		setVisible(true);
	}
}
