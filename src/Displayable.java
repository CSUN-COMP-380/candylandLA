import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Optional;

public class Displayable extends JPanel {
	public int relativeX;
	public int relativeY;
	private int relativeHeight;
	private int relativeWidth;
	private BufferedImage image;

	public void resize() {
		double widthRatio = this.getParent().getWidth() / 911.0;
		double heightRatio = this.getParent().getHeight() / 600.0;
		this.setLocation((int) Math.round(relativeX * widthRatio), (int) Math.round(relativeY * heightRatio));
		this.setSize((int) Math.round(relativeWidth * widthRatio), (int) Math.round(relativeHeight * heightRatio));
	}

	@Override public void paintComponent(Graphics g) {
		resize();
//		super.paint(g);

//		g.setColor(new Color(244,0,0,60));
		g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), null);
//		g.setColor(new Color(244,0,0,60));
	}

	public Displayable(int x, int y, int width, int height, String imagePath) throws IOException {
		this.relativeX = x;
		this.relativeY = y;
		this.relativeWidth = width;
		this.relativeHeight = height;
		this.image = ImageIO.read(new File("assets/", imagePath));
		this.setBackground(new Color(0,0,0,0));
		this.setLayout(null);
		this.setOpaque(false);
		this.setLocation(400, 400);
		this.setSize(1, 1);
//		this.setVisible(true);
	}
}
