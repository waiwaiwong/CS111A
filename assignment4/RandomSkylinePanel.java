import javax.swing.*;
import java.awt.*;
import java.util.Random;
   
public class RandomSkylinePanel extends JPanel
{
   private Building build1;
   private Random generator;
   private Star star;
   
   /**
      The RandomSkylinePanel sets up the drawing panel.
   */
   public RandomSkylinePanel()
   {
      generator = new Random();
   
      setPreferredSize (new Dimension (550, 400));
      setBackground (new Color(87,24,188));
   }
   
   /**
      The paintComponent method draws the panel by requesting that each building draws itself.  
      @param page A Graphics object for drawing in Java
   */
   public void paintComponent (Graphics page) 
   {
      super.paintComponent(page);
      int numBuilding = generator.nextInt(6)+1;
      int widthBuild=60, heightBuild=150;
      int gap=10, xPosition=60, yPosition=150;  
      int starPos = 0;
      
      // Stars
      for (int i = 0; i < 550; i += 10)
      {
         starPos = generator.nextInt(301);
         yPosition = starPos;
         star = new Star(i, yPosition);
         star.draw(page);	 
      }	 
      
      // Skyline
      for (int count = 0; count < numBuilding && xPosition < 400; count++)
      {
         widthBuild = generator.nextInt(35) + 60;
         heightBuild = generator.nextInt(115) + 135;
         yPosition = 300-heightBuild;
         gap = generator.nextInt(60) + 5;
         build1 = new Building(widthBuild, heightBuild, Color.black, xPosition, yPosition, 3);
         build1.draw(page);
         xPosition += gap + widthBuild;
      }
      
      // Ground
      page.setColor(Color.black);
      page.fillRect(0, 300, 550, 100);
      
      // Name of the city.
      page.setColor(Color.white);
      page.drawString("Wai Wai Wong and Sierna Benoza's City", 200, 30);
   }


}
