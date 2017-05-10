
import java.awt.*;

public class Building
{
  private int x, y, width, height;
  private Color color;

  // Constructor: set up this building with the specified values.
  public Building (int nWidth, int nHeight, Color shade, int upperX, int upperY)
  {
    width = nWidth;
    height = nHeight;
    x = upperX;
    y = upperY;
  }

  // Draw this bulding in the specified graphics context.
  public void draw (Graphics page)
  {
    page.setColor (color);
    page.fillRect(x, y, width, height); 
  }

  // Width mutator.
  public void setWidth (int nWidth)
  {
    width = nWidth;   
  }

  // Height mutator.
  public void setHeight (int nHeight)
  {
    height = nHeight; 
  }

  // Color mutator.
  public void setColor (Color shade)
  {
    color = shade;
  }

  // X mutator
  public void setX (int upperX)
  {
    x = upperX;
  }

  // Y mutator
  public void setY (int upperY)
  {
    y = upperY;
  }

  // Width accessor.
  public int getWidth()
  {
    return width;
  }

  // Height accessor.
  public int getHeight()
  {
    return height;
  }

  // Color accessor.
  public Color getColor()
  {
    return color;
  }

  // X accessor.
  public int getX()
  {
    return x;
  }

  // Y accessor.
  public int getY()
  {
    return y;
  }
}