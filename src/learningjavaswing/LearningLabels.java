package learningjavaswing;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class LearningLabels extends JFrame{
	
	LearningLabels() {
		//JLabel = a GUI display area for a a string of text, an image, or both
		
		ImageIcon image = new ImageIcon("assets/redpikmin.png");
		Border border = BorderFactory.createLineBorder(Color.red, 3);
		
		JLabel label = new JLabel();
		label.setText("hello world!!!!!!!!!!!!!!!"); //set text. can also put string in constructor on line above
		label.setIcon(image);
		label.setHorizontalTextPosition(JLabel.CENTER); //set text LEFT CENTER or RIGHT of image
		label.setVerticalTextPosition(JLabel.TOP);
		label.setForeground(Color.pink);
		label.setFont(new Font("MV Boli", Font.PLAIN, 20)); //set font
		label.setIconTextGap(-300); //set gap between image and text
		label.setBackground(Color.black);
		label.setOpaque(true);
		label.setBorder(border);
		label.setVerticalAlignment(JLabel.CENTER); //sets the position of the icon and text within the label
		label.setHorizontalAlignment(JLabel.CENTER);
		//label.setBounds(0, 0, 250, 250); //set position within frame and dimensions
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //EXIT instead of HIDE on closing the window
		//this.setSize(400,800); //sets the x dimension and y dimension
		//this.setLayout(null);
		this.setVisible(true);
		this.add(label);
		this.pack(); //size of the frame will adjust to fit all components. AKA don't need to do setSize
	}

}
