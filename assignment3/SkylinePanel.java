import javax.swing.*;
import java.awt.*;

public class SkylinePanel extends JPanel
{
  private Building building1, building2, building3, building4, building5;

  // Constructor: Creates five building objects.
  public SkylinePanel()
  {
    building1 = new Building (50, 300, Color.black, 50, 100);
    building2 = new Building (50, 100, Color.black, 150, 300);
    building3 = new Building (50, 150, Color.black, 300, 250);
    building4 = new Building (50, 200, Color.black, 400, 200);
    building5 = new Building (50, 250, Color.black, 500, 150); 

    setPreferredSize (new Dimension(600, 400));
    setBackground (Color.cyan);
  } 

  // Draws this panel by requesting that each building draw itself.
  public void paintComponent (Graphics page)
  {
    super.paintComponent(page);
    
    building1.draw(page);
    building2.draw(page);
    building3.draw(page);
    building4.draw(page);
    building5.draw(page);

    //Name of the city.
    page.drawString("Wai Wai Wong's Bar City", 10, 30);
  }

}