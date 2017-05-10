import java.awt.*;
public class Star
{
   private int x, y;
   private final int SIZE = 2;

   /**
      Star constructor: sets up the star with the specified values
      @param upperX The x-coordinate of the upper-left corner of a star
      @param upperY The y-coordinate of the upper-left corner of a star
   */
   public Star(int upperX, int upperY)
   {
      x = upperX;
      y = upperY;
   } 

   /**
      The draw method draws the star in the specified graphics context.
      @param page A Graphics object for drawing in Java
   */
   public void draw(Graphics page)
   {
      page.setColor(Color.white);
      page.fillRect(x, y, SIZE, SIZE);
   }
  
   /**
      The setX method serves as the x mutator.
      @param upperX The x-coordinate of the upper-left corner of the star.
   */  
   public void setX(int upperX)
   {
      x = upperX;
   }

   /**
      The setY method serves as the y mutator.
      @param upperY The y-coordinate of the upper-left corner of the star.
   */  
   public void setY(int upperY)
   {
      y = upperY;
   }

   /**
      The getX method serves as the x accessor.
      @return The x-coordinate of the upper-left corner of the star.
   */  
   public int getX()
   {
      return x;
   }

   /**
      The getY method serves as the y accessor.
      @return The y-coordinate of the upper-left corner of the star.
   */ 
   public int getY()
   {
      return y;
   }
}
