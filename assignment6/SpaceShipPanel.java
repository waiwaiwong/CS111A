import java.awt.*;
import java.awt.event.*;
import javax.swing.*; 
import java.util.Random;                                       

public class SpaceShipPanel extends JPanel
{
   private Point clickPoint = null;                     
   private Point currentPt;
   private boolean activate = false; 
   private Color color;
  
   private final int WIDTH = 500, HEIGHT = 400;
   private int randomX, randomY; 
   private int count = 0;
   private JButton reset;
  
   /**
      SpaceShipPanel constructor: Sets up this panel to listen for mouse events.
   */
   public SpaceShipPanel()
   {
      SpaceShipListener listener = new SpaceShipListener();
      addMouseListener(listener);
      addMouseMotionListener(listener);

      setBackground (Color.black);
      setPreferredSize (new Dimension(WIDTH, HEIGHT));     

      reset = new JButton ("Reset Shot Counter to Zero");
      reset.addActionListener(new ButtonListener());
      add(reset);
    
   }

   /**
      The paintComponent method draws the shot counter, the spaceship, and the lasers
      @param page A Graphics object for drawing in Java
   */
   public void paintComponent (Graphics page)
   {
      super.paintComponent(page);
       
      //Counter
      page.setColor(Color.white);
      page.drawString("Shots fired: " + count, (WIDTH/2)-25, 55);
      
      //Ship
      page.setColor(Color.white);
      page.fillOval(currentPt.x, currentPt.y, 20,20);
    
      //Lasers
      Random generator = new Random();
      randomX = generator.nextInt(WIDTH) + 1;
      randomY = generator.nextInt(HEIGHT) + 1;
      
      //Laser colors
      switch (count%4)
      {
         case 1: 
            color = Color.red;
            break;
         case 2: 
            color = Color.blue;
            break;
         case 3: 
            color = Color.green;
            break;
         case 0: 
            color = Color.cyan;
            break;
      }
      page.setColor(color); 
      
      if (clickPoint != null && activate)
         page.drawLine(clickPoint.x, clickPoint.y, randomX, randomY);
  }

   /**
      The SpaceShipListener represents the listener for all mouse events.
   */
   private class SpaceShipListener implements MouseListener, MouseMotionListener
   {
      /**
         The mousePressed method repaints the panel when the mouse button 
         has been pressed on a component.
         @param event A mouse event
      */
      public void mousePressed (MouseEvent event) 
      {
         activate = true;
         currentPt = event.getPoint();
         clickPoint = currentPt;
         count++;
         repaint();        
      }
      
      
      /**
         The mouseDragged method repaints the panel when the mouse button 
         has been pressed and dragged in the panel.
         @param event A mouse event
      */
      public void mouseDragged (MouseEvent event) 
      {
         currentPt = event.getPoint();
         clickPoint = currentPt;
         activate = false;
         repaint();
      }
      
      
      /**
         The mouseEntered method repaints the panel when the mouse button 
         enters the panel.
         @param event A mouse event
      */
      public void mouseEntered (MouseEvent event) 
      {
         currentPt = event.getPoint();
         repaint();
      }
      
      
      /**
         The mouseMoved method repaints the panel when the mouse button is moved
         @param event A mouse event
      */
      public void mouseMoved (MouseEvent event) 
      {
         currentPt = event.getPoint();
         repaint();
      }
      
      
      /**
         The mouseClicked method repaints the panel when the mouse button 
         has been clicked (pressed and released) on a component.
         @param event A mouse event
      */
      public void mouseClicked (MouseEvent event) 
      {
         clickPoint = event.getPoint();
      }
      
      
      /**
         The mouseReleased method repaints the panel when the mouse button 
         has been released
         @param event A mouse event
      */
      public void mouseReleased (MouseEvent event) 
      {
         activate = false;
         repaint();
      }
      
      
      /**
         The mouseReleased method repaints the panel when the mouse button 
         exits the panel
         @param event A mouse event
      */
      public void mouseExited (MouseEvent event) {}

   }

   
   /**
      The ButtonListener class is a private inner class that 
      handles the event when the user clicks the button.
   */
   private class ButtonListener implements ActionListener
   {
      public void actionPerformed(ActionEvent event)
      {
         if (event.getSource() == reset)
         {
            count = 0;
            repaint();
         }
      }
   }
}