/**
   RandomSkyline.java  Author: Lewis/Loftus

   Emirsierna Benoza, Wai Wai Wong
   3/13/2017
   CS 111B Section 11:10
   Assignment 4

   This program demonstrates java classes by drawing a skyline
   and stars

*/

/**
   Algorithm:
   1) Create a class called Building that represents a rectangle
      with a particular position, width, height, and color.
   2) Create a class called Star that creates stars.
   3) Create a class called RandomSkylinePanel that creates random building.
   4) Draw the panel by requesting that each rectangle draws itself.
   5) Create a class called Skyline that setup the frame for the program.

*/

import javax.swing.*;
import java.awt.*;

public class RandomSkyline
{
   //Presents a collection of buildings.
   public static void main (String[] args)
   {
      JFrame frame = new JFrame ("Building");
      frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

      frame.getContentPane().add(new RandomSkylinePanel());

      frame.pack();
      frame.setVisible(true);
   }
}
