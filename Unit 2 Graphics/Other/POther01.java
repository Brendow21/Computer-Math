import javax.swing.*;
import java.awt.*;
public class POther01 extends JPanel
{
   public void paintComponent(Graphics g)
   {
       //sky
      setBackground(new Color(28,200,252));
      
      //road
      g.setColor(Color.BLACK);
      g.fillRect(0, 500, 600, 100);
   
   }
}