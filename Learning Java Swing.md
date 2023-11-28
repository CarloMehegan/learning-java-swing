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





## References
https://youtu.be/7GaAW-DdPuI first video