tags: #notes #topic
creation date: [[2023-11-28 Tuesday]] 14:34:52
description::

## Learning Java Swing

JFrame
- a gui window to add components to
- https://youtu.be/7GaAW-DdPuI first video in series

```Java
JFrame frame = new JFrame();
frame.setTitle("JFrame title goes here");

//EXIT instead of HIDE on closing the window
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

frame.setResizable(false);
frame.setSize(400,400); //sets the x dimension and y dimension
frame.setVisible(true);

ImageIcon image = new ImageIcon("assets/rubiks.png");
frame.setIconImage(image.getImage()); //change icon of frame

frame.getContentPane().setBackground(new Color(158, 231, 245)); //change color of background
```

JLabel
- a gui display area for a a string of text, an image, or both
- second video

```java
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
```

JPanel
- a GUI component that functions as a container to hold other components
	- you can add labels to a panels and then add panels to a frame, for example
- panels use a flow layout manager
	- with a flow layout when we add components they stick to the top, get centered, and then compoenents are added until the row fills up and then it moves on to a new row under the previous
	- in the example code we set it to a border layout, which we used in the previous example with JLabels

JButton
- a java gui button that performs an action when clicked on
- we implement the ActionListener interface in order to perform actions when the button is clicked
- alternatively, we can use a lambda expression to make it way easier and not have to implement ActionListener

```Java
package learningjavaswing;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class LearningButtons extends JFrame implements ActionListener {
	JButton button;
	
	LearningButtons() {
		button = new JButton();
		button.setBounds(200, 100, 100, 50);
		button.addActionListener(this);
		//we pass in this class, bc it implements ActionListener
		
		//initialize the frame
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(500,500);
		this.setVisible(true);
		this.add(button);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		//check to see if event that occurs is our button
		if (e.getSource() == button) {
			System.out.println("pikmin!");
		}
	}
}
```

alternatively
```Java
package learningjavaswing;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class LearningButtons extends JFrame {
	
	JButton button;
	
	LearningButtons() {
		button = new JButton();
		button.setBounds(200, 100, 100, 50);
		//instead of implementing ActionListener,
		//we can use a lambda expression
		button.addActionListener(e -> System.out.println("pikmin!")); 
		
		//initialize the frame
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(500,500);
		this.setVisible(true);
		this.add(button);
	}
}
```

Layout Manager
- defines the natural layout for components within a container
- 3 common managers

BorderLayout
- a BorderLayout places components in five areas
- NORTH SOUTH EAST WEST and CENTER
- all extra space is placed in the center area
- typically
	- north border for a title bar
	- west or east for a navigation bar
	- south border for footer
	- center for the main body of a program
- 





## References
https://youtu.be/7GaAW-DdPuI first video