import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.function.Consumer;

public class Rules extends Screen {
	Button backButton;

	public Rules(Consumer<LaLaLand.ScreenType> changeScreen) throws IOException {
		super(changeScreen, "rules.png");

		ActionListener backListener = actionEvent -> changeScreen.accept(LaLaLand.ScreenType.MENU);
		backButton = new Button(635, 430, 96, 40, "/buttons/menuButton.png", backListener);
		this.add(backButton);
	}
}
