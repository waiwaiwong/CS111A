import javax.swing.JFrame;

/**
   SpaceShip.java
   Emirsierna Benoza, Wai Wai Wong
   CS 111B 11:10
   Assignment 6
   
   This program displays a spaceship that follows the mouse and
   shoots lasers. It also keeps track of how many shots were fired.
   The counter reset button resets the shot counter to zero.

   ALGORITHM: 
   1. Create main program frame.
   2. Draw the spaceship.
   3. Create a mouse listener that:
      a. makes the spaceship follow the movement of the mouse
      b. enables spaceship to fire lasers when mouse is pressed
   4. Have lasers cycle through four colors.
   5. Implement shot counter.
   6. Create a listener for button push (action)events.
   7. Create reset button
*/

public class SpaceShip
{
   //Creates the main program frame.
   public static void main (String[] args)
   {
      JFrame frame = new JFrame ("Space Ship");
      frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

      frame.getContentPane().add(new SpaceShipPanel());

      frame.pack();
      frame.setVisible(true);
   }

}