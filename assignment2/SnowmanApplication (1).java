

/**
    SnowmanApplication.java       Author: Lewis/Loftus
    Modified: Conner   Date: 1/13/15

    Wai Wai Wong
    2/8/2017
    CS 111B Section 11:10
    Assignment 2

    Demonstrates basic drawing methods and the use of color.
    Modified Snowman applet to be stand-along application. 

*/

/**
    Steps:
    1) shift the snowman 20 pixels to the right
    2) move the sun to the right
    3) add buttons to the snowman upper torso
    4) change the snowman's smile to a frown
    5) display name in the upper-left corner of the picture

*/ 

import javax.swing.*;
import java.awt.*;

public class SnowmanApplication
{
   public static void main (String [] args)
   {
      JFrame frame = new JFrame("Snowman Application");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      SnowmanPanel panel = new SnowmanPanel();
      frame.getContentPane().add(panel);
      frame.pack();
      frame.setVisible(true);
   }
}
      
        
//********************************************************************
//  SnowmanPanel class used for drawing shapes 
//********************************************************************

class SnowmanPanel extends JPanel
{

   //-----------------------------------------------------------------
   //  Constructor sets size and color of panel
   //-----------------------------------------------------------------
   public SnowmanPanel()
   {
     setPreferredSize(new Dimension(300,225));
     setBackground(Color.cyan);
   }
     
   //-----------------------------------------------------------------
   //  Draws a snowman.
   //-----------------------------------------------------------------
   public void paintComponent (Graphics page)
   {
      super.paintComponent(page);
      final int MID = 170;  // midpoint of snowman
      final int TOP = 50;  // top of snowman's head

      setBackground (Color.cyan);

      page.setColor (Color.blue);
      page.fillRect (0, 175, 300, 50);  // ground

      page.setColor (Color.yellow);
      page.fillOval (250, -40, 80, 80);  // sun to the right

      page.setColor (Color.white);
      page.fillOval (MID-20, TOP, 40, 40);      // head
      page.fillOval (MID-35, TOP+35, 70, 50);   // upper torso
      page.fillOval (MID-50, TOP+80, 100, 60);  // lower torso

      page.setColor (Color.red); //button color
      page.fillOval (MID-4, TOP+45, 10, 10);  // the first button
      page.fillOval (MID-5, TOP+60, 10, 10); // the second button

      page.setColor (Color.black);
      page.fillOval (MID-10, TOP+10, 5, 5);   // left eye
      page.fillOval (MID+5, TOP+10, 5, 5);    // right eye

      page.drawArc (MID-10, TOP+20, 20, 10, 15, 160);   // frown

      page.drawLine (MID-25, TOP+60, MID-50, TOP+40);  // left arm
      page.drawLine (MID+25, TOP+60, MID+55, TOP+60);  // right arm

      page.drawLine (MID-20, TOP+5, MID+20, TOP+5);  // brim of hat
      page.fillRect (MID-15, TOP-20, 30, 25);        // top of hat

      page.drawString ("Wai Wai Wong", 10, 30);  // name
   }
}