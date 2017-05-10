import java.awt.*;

public class Building
{
   private int x, y, width, height, windows;
   private Color color;

   /**
      Building constructor: sets up this building with the specified values
      @param nWidthwidth The width of the building
      @param nHeightheight The height of the building
      @param shade The color of the building
      @param upperX The x-coordinate of the upper-left corner of the building
      @param upperY The y-coordinate of the upper-left corner of the building
   */
   public Building (int nWidth, int nHeight, Color shade, int upperX, int upperY, int nWindows)
   {
      width = nWidth;
      height = nHeight;
      color = shade;
      x = upperX;
      y = upperY;
      windows = nWindows;   
   }
   
   /**
      The draw method draws this building in the specified graphics context.
      @param page A Graphics object for drawing in Java
   */
 
   public void draw (Graphics page)
   {
      int sX = x;
      int sY = y;
      page.setColor (color);
      page.fillRect(x, y, width, height);
      
      // Windows 
      for (int i = 0; i < windows; i++)
      {
         if (x < width + sX && y < height + sY)
         {
            page.setColor (color.yellow);
            page.fillRect (x+5, y+5, 5, 5);
            x += 10;
         }
      }
   }
   
   /**
      The setWidth method serves as the Width mutator.
      @param nWidth The width of the building.
   */   
   public void setWidth (int nWidth)
   {
      width = nWidth;   
   }

   /**
      The setHeight method serves as the Height mutator.
      @param nHeight The height of the building.
   */    
   public void setHeight (int nHeight)
   {
      height = nHeight; 
   }

   /**
      The setColor method serves as the Color mutator.
      @param shade The color of the building.
   */ 
   public void setColor (Color shade)
   {
      color = shade;
   }

   /**
      The setX method serves as the X mutator
      @param upperX The x-coordinate of the building's upper corner
   */ 
   public void setX (int upperX)
   {
      x = upperX;
   }

   /**
      The setY method serves as the Y mutator
      @param upperY The y-coordinate of the building's upper corner
   */ 
   public void setY (int upperY)
   {
      y = upperY;
   }

   /**
      The setWindows method serves as the Window mutator.
      @param nWindows The number of windows on the building.
   */ 
   public void setWindows (int nWindows)
   {
      windows = nWindows;
   }

   /**
      The getWidth method serves as the Width accessor.
      @return The width of the building.
   */ 
   public int getWidth()
   {
      return width;
   }

   /**
      The getHeight method serves as the Height accessor.
      @return The height of the building.
   */ 
   public int getHeight()
   {
      return height;
   }

   /**
      The getColor method serves as the color accessor.
      @return The color of the building.
   */    
   public Color getColor()
   {
      return color;
    }

   /**
      The getX method serves as the x accessor.
      @return The x-coordinate of the building's upperleft corner.
   */ 
   public int getX()
   {
      return x;
   }

   /**
      The getY method serves as the y accessor.
      @return The y-coordinate of the building's upperleft corner.
   */
   public int getY()
   {
      return y;
   }

   /**
      The getWindows method serves as the Window accessor.
      @return The number of windows on the building
   */
   public int getWindows()
   {
      return windows;
   }
}

