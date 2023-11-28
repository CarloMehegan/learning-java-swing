package learningjavaswing;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;

public class Main {

	public static void main(String[] args) {
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
		
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //EXIT instead of HIDE on closing the window
		//frame.setSize(400,800); //sets the x dimension and y dimension
		//frame.setLayout(null);
		frame.setVisible(true);
		frame.add(label);
		frame.pack(); //size of the frame will adjust to fit all components. AKA don't need to do setSize
	}

}
