/**
  RandomSkyline.java  Author: Lewis/Loftus

  Wai Wai Wong
  2/28/2017
  CS 111B Section 11:10
  Assignment 3

  This program demonstrates java classes by drawing 5 buildings.

*/

/**
  Steps:
  1) Create a class called Building that represents a rectangle
     with a particular position, width, height, and color.
  2) Create a class called SkylinePanel that creates five rectangle
     objects.
  3) Then draw the panel by requesting that each rectangle draw itself.
  4) Create a class called Skyline that setup the frame for the program.

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
