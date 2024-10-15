import javax.swing.*;
import java.awt.*;
public class Panel02a extends JPanel
{
   public void paintComponent(Graphics g)
   {
      super.paintComponent(g);
      setBackground(Color.red);
   
      g.setColor(Color.blue);
      g.fillRect(50, 150, 300, 200);
      g.setColor(new Color(139,69,19));
      g.fillRect(0, 350, 400, 75);
      
      g.setColor(Color.ORANGE);
      g.fillOval(125, 225, 100, 50);
      
      int xPoints[] = {220, 245, 245};
      int yPoints[] = {250, 225, 275};
      g.fillPolygon (xPoints, yPoints, 3);
      
      g.setColor(Color.BLACK);
      g.fillOval(135, 235, 15, 15); 
      
      g.setColor(Color.WHITE);
      g.fillOval(140, 240, 8, 8);     
   
   }
}