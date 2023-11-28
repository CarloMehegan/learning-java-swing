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







## References
https://youtu.be/7GaAW-DdPuI first video