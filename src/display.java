import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;   

public class display extends JFrame {
	
	JPanel gas1panel;
	JPanel gas2panel;
	JPanel gas3panel;
	JPanel gas4panel;
	
	JButton gas1button;
	JButton gas2button;
	JButton gas3button;
	JButton gas4button;
	
	gas1handler G1H = new gas1handler();
	gas2handler G2H = new gas2handler();
	gas3handler G3H = new gas3handler();
	gas4handler G4H = new gas4handler();
	
	public static void main(String[] args) {
		
		new display();
	}
	
	public display() {
		
		//background
		JLabel window;
		
		setSize(1097,625);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
				
		ImageIcon background_image = new ImageIcon("dtest.png");	
		window = new JLabel("",background_image,JLabel.CENTER);	
		window.setBounds(0, 0, 1080, 586);
		add(window);
				
		setVisible(true);
		
		//gas1
		gas1panel = new JPanel();
		gas1panel.setBounds(1018, 60, 52, 70);
		gas1panel.setBackground(new Color(0,0,0,0));
		window.add(gas1panel);
				
		ImageIcon gasImage1 = new ImageIcon("gas.png");
		gas1button = new JButton(gasImage1);
		gas1button.setOpaque(false);
		gas1button.setContentAreaFilled(false);
		gas1button.setBorder(null);
		gas1button.setBorderPainted(false);
		gas1button.addActionListener(G1H);
				
		//gas2
		gas2panel = new JPanel();
		gas2panel.setBounds(1018, 200, 52, 70);
		gas2panel.setBackground(new Color(0,0,0,0));
		window.add(gas2panel);
				
		ImageIcon gasImage2 = new ImageIcon("gas.png");
		gas2button = new JButton(gasImage2);
		gas2button.setOpaque(false);
		gas2button.setContentAreaFilled(false);
		gas2button.setBorder(null);
		gas2button.setBorderPainted(false);
		gas2button.addActionListener(G2H);
				
		//gas3
		gas3panel = new JPanel();
		gas3panel.setBounds(1018, 352, 52, 70);
		gas3panel.setBackground(new Color(0,0,0,0));
		window.add(gas3panel);

		ImageIcon gasImage3 = new ImageIcon("gas.png");
		gas3button = new JButton(gasImage3);
		gas3button.setOpaque(false);
		gas3button.setContentAreaFilled(false);
		gas3button.setBorder(null);
		gas3button.setBorderPainted(false);
		gas3button.addActionListener(G3H);
		
		//gas4
		gas4panel = new JPanel();
		gas4panel.setBounds(1018, 500, 52, 70);
		gas4panel.setBackground(new Color(0,0,0,0));
		window.add(gas4panel);

		ImageIcon gasImage4 = new ImageIcon("gas.png");
		gas4button = new JButton(gasImage4);
		gas4button.setOpaque(false);
		gas4button.setContentAreaFilled(false);
		gas4button.setBorder(null);
		gas4button.setBorderPainted(false);
		gas4button.addActionListener(G4H);
		
		gas1panel.add(gas1button);
		gas2panel.add(gas2button);
		gas3panel.add(gas3button);
		gas4panel.add(gas4button);
	}
	
	//gas1 draw
	public class gas1handler implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			
	
		}
	}
	
	//gas2 draw
	public class gas2handler implements ActionListener {
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
			
		}
	}
	
	//gas3 draw
	public class gas3handler implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			
				
		}
	}
	
	//gas4 draw
	public class gas4handler implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			
				
		}
	}
}
