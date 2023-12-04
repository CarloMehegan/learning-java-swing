package learningjavaswing;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class LearningPanels extends JFrame{
	
	LearningPanels() {
		ImageIcon icon = new ImageIcon("assets/a.png");
		
		JLabel label = new JLabel();
		label.setText("helloo");
		label.setIcon(icon);
		label.setVerticalAlignment(JLabel.CENTER); //this is needed for a border layout
		label.setHorizontalAlignment(JLabel.CENTER); //this is needed for a border layout
		label.setBounds(0,0,75,75); //relative to the panel its in, not the frame
		
		JPanel redPanel = new JPanel();
		redPanel.setBackground(Color.red);
		redPanel.setBounds(0,0,250,250);
		redPanel.setLayout(new BorderLayout());
		
		JPanel bluePanel = new JPanel();
		bluePanel.setBackground(Color.blue);
		bluePanel.setBounds(250,0,250,250);
		bluePanel.setLayout(new BorderLayout());
		
		JPanel greenPanel = new JPanel();
		greenPanel.setBackground(Color.green);
		greenPanel.setBounds(0,250,500,250);
		greenPanel.setLayout(null);
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setSize(750,750);
		frame.setVisible(true);
		
		
		//bluePanel.add(label);
		greenPanel.add(label);
		frame.add(redPanel);
		frame.add(bluePanel);
		frame.add(greenPanel);
	}

}
