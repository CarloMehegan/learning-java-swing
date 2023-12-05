package learningjavaswing;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class LearningButtons extends JFrame {
	
	JButton button;
	JLabel label;
	
	LearningButtons() {
		
		ImageIcon icon = new ImageIcon("assets/littlepikmin.png");
		ImageIcon icon2 = new ImageIcon("assets/redpikmin.png");
		
		label = new JLabel();
		label.setIcon(icon2);
		label.setBounds(100, 250, 250, 150);
		label.setVisible(false);
		label.setFocusable(false);
		
		button = new JButton();
		button.setBounds(100, 75, 250, 175);
		//instead of implementing ActionListener,
		//we can use a lambda expression
		button.addActionListener(e -> buttonAction()); 
		button.setText("pikmin!");
		button.setFocusable(false);
		button.setIcon(icon);
		button.setHorizontalTextPosition(JButton.CENTER);
		button.setVerticalTextPosition(JButton.BOTTOM);
		button.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		//button.setIconTextGap(-15);
		//button.setForeground(Color.RED);
		//button.setBackground(Color.lightGray);
		//button.setBorder(BorderFactory.createCompoundBorder());
		
		//can disable a button
		//it gets grayed out it's cute
		button.setEnabled(true);
		
		//initialize the frame
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(500,500);
		this.setVisible(true);
		this.add(button);
		this.add(label);
	}
	
	void buttonAction() {
//		System.out.println("pikmin!");
		label.setVisible(true);
		button.setEnabled(false);
	}

}
