package learningjavaswing;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

public class LearningLayeredPanes {

	LearningLayeredPanes() {
		JLabel label1 = new JLabel();
		label1.setOpaque(true);
		label1.setBackground(Color.RED);
		label1.setBounds(50,50,200,200);
		
		JLabel label2 = new JLabel();
		label2.setOpaque(true);
		label2.setBackground(Color.GREEN);
		label2.setBounds(100,100,200,200);
		
		JLabel label3 = new JLabel();
		label3.setOpaque(true);
		label3.setBackground(Color.BLUE);
		label3.setBounds(150,150,200,200);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(0,0,500,500);
		
//		layeredPane.add(label1); //the first added will appear on top
//		layeredPane.add(label2);
//		layeredPane.add(label3); //the last will appear on the bottom
		
		layeredPane.add(label1, JLayeredPane.DEFAULT_LAYER); 
		layeredPane.add(label2, Integer.valueOf(3));
		layeredPane.add(label3, JLayeredPane.DRAG_LAYER); //now the blue is on top
		
		
		JFrame frame = new JFrame("JLayeredPane");
		frame.add(layeredPane);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setSize(500,500);
		frame.setVisible(true);
		
	}
	
}
