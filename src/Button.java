import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Button extends Displayable {
	private JButton button;

	@Override public void paint(Graphics g) {
		super.paint(g);
		button.setSize(this.getSize());
	}

	public Button(int x, int y, int width, int height, String imagePath, ActionListener listener) throws IOException {
		super(x, y, width, height, imagePath);
		button = new JButton();
//		button.setVisible(false);
		button.setOpaque(false);
		button.setContentAreaFilled(false);
		button.setBorderPainted(false);
		button.addActionListener(listener);
		this.add(button);
	}
}
