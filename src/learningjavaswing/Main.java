package learningjavaswing;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.ImageIcon;

public class Main {

	public static void main(String[] args) {
		// https://youtu.be/7GaAW-DdPuI
		
		/*
		JFrame frame = new JFrame();
		frame.setTitle("JFrame title goes here");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //EXIT instead of HIDE on closing the window
		frame.setResizable(false);
		frame.setSize(400,400); //sets the x dimension and y dimension
		frame.setVisible(true);
		
		ImageIcon image = new ImageIcon("assets/rubiks.png");
		frame.setIconImage(image.getImage()); //change icon of frame
		
		frame.getContentPane().setBackground(new Color(158, 231, 245)); //change color of background
		*/
		
		//we can take the above code and put it in a class that extends JFrame
		//then we run the constructor and its the same as doing the above
		new MyFrame();
	}

}
