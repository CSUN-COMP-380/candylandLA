import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.function.Consumer;

public abstract class Screen extends JPanel {
	BufferedImage image;

	@Override public void paintComponent(Graphics g) {
		this.setSize(this.getParent().getSize());

		g.drawImage(image,
				this.getParent().getInsets().left, this.getParent().getInsets().top,
				this.getParent().getWidth(), this.getParent().getHeight(), null);
	}

	public Screen(Consumer<LaLaLand.ScreenType> changeScreen, String screenName) throws IOException {
		this.setSize(911, 600);
		image = ImageIO.read(new File("assets/screens/", screenName));
	}
}
