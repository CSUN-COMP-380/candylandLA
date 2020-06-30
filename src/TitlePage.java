import javax.swing.*;
import java.awt.*;

public class TitlePage {

    //Constructor
    public TitlePage() {

        JFrame titleFrame = new JFrame("Candyland: Los Angeles");
        titleFrame.setSize(911,611);
        titleFrame.setLayout(null);
        titleFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon titleImg = new ImageIcon("src/titlePage.png");
        Image img = titleImg.getImage();
        Image newImg = img.getScaledInstance(911,611, Image.SCALE_SMOOTH);
        titleImg = new ImageIcon(newImg);

        JLabel titleBackground = new JLabel("",titleImg,JLabel.CENTER);
        titleBackground.setBounds(0,0,911,611);
        
        titleFrame.add(titleBackground);
        titleFrame.setVisible(true);
        
        /**Work in Progress
         * Need to click screen to move on to Menu.
         * **/
    }
    
}
