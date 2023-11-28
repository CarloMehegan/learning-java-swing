package learningjavaswing;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame{
	
	MyFrame() {
		
		this.setTitle("jframe title goes here");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //EXIT instead of HIDE on closing the window
		this.setResizable(false);
		this.setSize(400,400); //sets the x dimension and y dimension
		this.setVisible(true);
		
		ImageIcon image = new ImageIcon("assets/rubiks.png");
		this.setIconImage(image.getImage()); //change icon of this
		
		this.getContentPane().setBackground(new Color(158, 231, 245)); //change color of background
	}

}
