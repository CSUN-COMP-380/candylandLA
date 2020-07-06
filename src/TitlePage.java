import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TitlePage implements ActionListener {

    public TitlePage() {

        JFrame frame = new JFrame("Candyland: Los Angeles");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon titleImg = new ImageIcon("src/titlePage.png");
        Image img = (titleImg.getImage());
        Image newImg = img.getScaledInstance( 911, 611,  java.awt.Image.SCALE_SMOOTH ) ;
        titleImg = new ImageIcon(newImg);

        JButton titleBackground = new JButton(titleImg);
        frame.add(titleBackground);
        frame.setSize(911,611);
        frame.setVisible(true);

        titleBackground.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Menu menu = new Menu();
    }
}
