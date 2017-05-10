/**
    LabelDemo2 demostrate the use of image icons in labels.

    Wai Wai Wong
    1/31/2017
    CS 111B Section 11:10
    Assignment 1
  
    Steps:
    1) Make a frame.
    2) Load Images.
    3) Define the labels.
    4) Set where images and words are located.
    5) Set the panel.
    6) Link the panel to the frame.

*/
  
// Import Classes.
import java.awt.*;
import javax.swing.*;

public class LabelDemo2
{
  public static void main (String[] args)
  {
    // Make a new frame.
    JFrame frame = new JFrame ("Cute Cat Label Demo");
    frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

    // Loading Images 
    ImageIcon love = new ImageIcon ("love.gif");
    ImageIcon hamburger = new ImageIcon ("hamburger.gif");
    ImageIcon yes = new ImageIcon ("yes.gif");
    ImageIcon wink = new ImageIcon ("wink.gif");

     JLabel label1, label2, label3, label4;  // Define the labels.

     // Alignment of the text and image;
     label1 = new JLabel ("love", love, SwingConstants.LEFT);  
     label1.setHorizontalTextPosition (SwingConstants.CENTER);
     label1.setVerticalTextPosition (SwingConstants.BOTTOM);

     label2 = new JLabel("hamburger", hamburger, SwingConstants.RIGHT);
     label2.setHorizontalTextPosition (SwingConstants.CENTER);
     label2.setVerticalTextPosition (SwingConstants.BOTTOM); 

     label3 = new JLabel("yes", yes, SwingConstants.LEFT);
     label3.setHorizontalTextPosition (SwingConstants.CENTER);
     label3.setVerticalTextPosition (SwingConstants.BOTTOM);

     label4 = new JLabel("wink", wink, SwingConstants.RIGHT);
     label4.setHorizontalTextPosition (SwingConstants.CENTER);
     label4.setVerticalTextPosition (SwingConstants.BOTTOM);

     // Define panel.
     JPanel panel = new JPanel ();
     panel.setBackground (Color.white);
     panel.setPreferredSize (new Dimension (500, 500));
     panel.add (label1);
     panel.add (label2);
     panel.add (label3);
     panel.add (label4);

     frame.getContentPane().add(panel);  // Obtained the content pane of the frame.
     frame.pack();  // Sets frame size to accomdate the size of the panel its contains.
     frame.setVisible(true);  // Display the frame on the monitor screen.
  }
}
