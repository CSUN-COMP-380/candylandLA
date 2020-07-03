// abstract window toolkit (awt)
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Graphics;
import java.awt.Image;

// awt events
import java.awt.event.ActionEvent;
// swing
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSplitPane;
import javax.swing.JScrollPane;
import javax.swing.JDesktopPane;
import javax.swing.JPanel;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.ImageIcon;
import javax.swing.JTree;

// swing event

// swing tree


public class Candyland {

   private JFrame frame;
   private JPanel panel;
   private JScrollPane scrollPane;
   private JDesktopPane desktop;
   private JSplitPane splitPane;
   private JPanel labelPanel;
   private JLabel statusLabel;
   private JMenuBar menuBar;
   private JMenu fileMenu;
   private JMenu helpMenu;
   private JMenuItem exitItem;
   private JMenuItem aboutItem;
   private JTree tree;

   // constructor
public Candyland() {

   initComponents();
   statusLabel.setText("Initialization complete.");

}
// create a GUI and make it visible to user
private void initComponents() {

   setLookAndFeel();
   buildDesktop();
   buildMenu();
   addMenuListeners();
   buildPanel();
   buildFrame();

} // end initComponents
private void setLookAndFeel() {

   try {

      UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());

   }
   catch (Exception e) {

      e.printStackTrace();

   }

}
private void buildDesktop() {


   desktop = new JDesktopPane()
   {
      @Override
      protected void paintComponent(Graphics g)
      {
         ImageIcon icon = new ImageIcon("assets/screens/map.png");
         Image image = icon.getImage();

         int x=0, y=0;
         double imageWidth = image.getWidth(null);
         double imageHeight = image.getHeight(null);
         double screenWidth = getWidth();
         double screenHeight = getHeight();

         if(screenWidth != 0) {
                      x = (int)screenWidth  / 2 - (int)imageWidth  / 2;
                   }
                   if(screenHeight != 0) {
                      y = (int)screenHeight / 2 - (int)imageHeight / 2;
                   }
                   g.drawImage(image, x, y, this);
                }
             };

          } // end buildDesktop


private void buildMenu() {

   // build menu
   menuBar = new JMenuBar();
   fileMenu = new JMenu("File");
   helpMenu = new JMenu("Help");
   exitItem = new JMenuItem("Exit");
   aboutItem = new JMenuItem("About");
   fileMenu.add(exitItem);
   helpMenu.add(aboutItem);
   menuBar.add(fileMenu);
   menuBar.add(helpMenu);

} // end buildMenu
public void exitActionPerformed() {
   frame.dispose();
}
public void aboutActionPerformed() {
   JOptionPane.showMessageDialog(null, "Press Play to Start!");
}
private void addMenuListeners() {

   // add listener for exit menu item
   exitItem.addActionListener(
      new java.awt.event.ActionListener() {
         public void actionPerformed(ActionEvent e) {
            exitActionPerformed();
         }
      }
   );

   // add listener for about menu item
   aboutItem.addActionListener(
      new java.awt.event.ActionListener() {
         public void actionPerformed(ActionEvent e) {
            aboutActionPerformed();
         }
      }
   );

} // end addMenuListeners
private void buildPanel() {

   panel = new JPanel();
   splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
   scrollPane = new JScrollPane();
   labelPanel = new JPanel();
   statusLabel = new JLabel();

   scrollPane.getViewport().add(tree);

   statusLabel.setBorder(BorderFactory.createLoweredBevelBorder());
   statusLabel.setMinimumSize(new Dimension(0,18));
   statusLabel.setPreferredSize(new Dimension(0,18));

   splitPane.setOneTouchExpandable(true);
   splitPane.setDividerLocation(200);
   splitPane.setContinuousLayout(true);
   splitPane.add(desktop, JSplitPane.RIGHT);
   splitPane.add(scrollPane, JSplitPane.LEFT);

   panel.setLayout(new BorderLayout());
   panel.add(splitPane, BorderLayout.CENTER);

   labelPanel.setLayout(new BorderLayout());
   labelPanel.add(statusLabel, BorderLayout.CENTER);

} // end buildPanel
private void buildFrame() {

   // create a new frame and show it
   frame.setDefaultLookAndFeelDecorated(true);
   frame = new JFrame("Candyland:Los Angeles");
   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   frame.setLayout(new BorderLayout());
   frame.setIconImage(Toolkit.getDefaultToolkit().getImage("assets/buttons/menuButton.png"));

   // add label panel
   frame.getContentPane().add(labelPanel, BorderLayout.SOUTH);
   // add main panel
   frame.getContentPane().add(panel, BorderLayout.CENTER);
   // add menu bar
   frame.setJMenuBar(menuBar);
   frame.setSize(1200,700);
   frame.setVisible(true);
}  
}
