import javax.swing.*;
import java.awt.*;
public class Panel01modify extends JPanel
{
   public void paintComponent(Graphics g)
   {
      g.setColor(Color.BLUE);
      g.fillRect(0, 0, 400, 400);
      g.setColor(Color.GREEN.darker());
      g.fillRect(0, 350, 400, 350);
      g.setColor(Color.RED);
      g.fillRect(100, 200, 150, 150);
      g.setColor(Color.BLACK);
      g.fillRect(150, 275, 50, 75);
      
      int xPoints[] = {75, 175, 275};
      int yPoints[] = {200, 150, 200};
      g.fillPolygon (xPoints, yPoints, 3);
      
      g.setColor(Color.YELLOW);
      g.fillOval(300, 75, 50, 50);
      
      g.setColor(Color.WHITE);
      g.setFont(new Font("Serif",Font.BOLD, 50));
      g.drawString("Welcome Home", 40, 40);
      
      for(int x=0; x<400; x+=25)
      {
         g.fillOval(x, 50,  20, 20);
      }
      
      for(int x=0; x<100; x+=5)
      {
         g.drawLine(x, 325, x, 350);
      }
      for(int x=255; x<400; x+=5)
      {
      g.drawLine(x, 325, x, 350);
      }
      
   
   }
}