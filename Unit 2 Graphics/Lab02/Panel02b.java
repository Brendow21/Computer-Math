import javax.swing.*;
import java.awt.*;
public class Panel02b extends JPanel
{
   public void paintComponent(Graphics g)
   {
      super.paintComponent(g);
      
      //sky
      setBackground(new Color(28,200,252));
      
      //Ocean
      g.setColor(new Color(8,37,181));
      g.fillRect(0, 400, 600, 200);
            
      //Sun
      g.setColor(new Color(255,255,13));
      g.fillOval(500, 25, 60, 60);
      
      //Land
      g.setColor(new Color(29, 181, 49));
      g.fillRect(0, 375, 175, 225);
      g.setColor(new Color(194, 178, 128));
      g.fillRect(175, 375, 25, 225);
      int cPoints[] = {200, 200, 300};
      int uPoints[] = {375, 600, 600};
      g.fillPolygon (cPoints, uPoints, 3);
      g.fillRect(175, 500, 425, 100);
      
      
      //House
      g.setColor(new Color(255, 28, 28));
      g.fillRect(50, 275, 100, 100);
      g.setColor(Color.BLACK);
      int xPoints[] = {25, 100, 175};
      int yPoints[] = {275, 250, 275};
      g.fillPolygon (xPoints, yPoints, 3);
      g.fillRect(90, 350, 20, 25);
      g.fillRect(60, 350, 16, 16);
      g.fillRect(120, 350, 16, 16);
      for (int x=60; x<=120 ;x+=30)
      {
         g.fillRect(x, 300, 16, 16);
      
      }
      g.setColor(Color.WHITE);
      g.fillRect(67, 350, 2, 16);
      g.fillRect(60, 357, 16, 2);
      g.fillRect(127, 350, 2, 16);
      g.fillRect(120, 357, 16, 2);
      for (int x=67; x<=130 ;x+=30)
      {
         g.fillRect(x, 300, 2, 16);
      
      }
      for (int x=60; x<=130 ;x+=30)
      {
         g.fillRect(x, 307, 16, 2);
      
      }

      //Boat
      g.setColor(new Color(255,28,28));
      g.fillOval(350, 350, 200, 76);
      
      g.setColor(new Color(28,200,252));
      g.fillRect(350, 350, 250, 38);
      
      //boat sail
      g.setColor(new Color(101,67,33));
      g.fillRect(445, 250, 10, 140);
      
      //boat flag
      for (int y=250; y<=300 ;y+=10)
      {
         g.setColor(Color.RED);
         g.fillRect(455, y, 80, 5);
      }
      for (int y=255; y<=300 ;y+=10)
      {
         g.setColor(Color.WHITE);
         g.fillRect(455, y, 80, 5);
      }
      g.setColor(Color.BLUE);
      g.fillRect(455,250,40,25);
      g.setColor(Color.WHITE);
      
      for (int x=457; x<495 ;x+=4)
      {
         g.fillOval(x, 252, 2, 2);
         g.fillOval(x, 256, 2, 2);
         g.fillOval(x, 260, 2, 2);
         g.fillOval(x, 264, 2, 2);
         g.fillOval(x, 268, 2, 2);
         g.fillOval(x, 272, 2, 2);
      }
      
      //Cloud1
      g.fillOval(50, 20, 30, 30);
      g.fillOval(70, 20, 30, 30);
      g.fillOval(80, 30, 30, 30);
      g.fillOval(70, 40, 30, 30);
      g.fillOval(50, 40, 30, 30);
      g.fillOval(40, 30, 30, 30);
      //Cloud 2
      g.fillOval(210, 20, 30, 30);
      g.fillOval(230, 20, 30, 30);
      g.fillOval(240, 30, 30, 30);
      g.fillOval(230, 40, 30, 30);
      g.fillOval(210, 40, 30, 30);
      g.fillOval(200, 30, 30, 30);
      g.fillOval(180, 20, 30, 30);
      g.fillOval(200, 20, 30, 30);
      g.fillOval(210, 30, 30, 30);
      g.fillOval(200, 40, 30, 30);
      g.fillOval(180, 40, 30, 30);
      g.fillOval(170, 30, 30, 30);
      //Cloud 3
      g.fillOval(360, 20, 30, 30);
      g.fillOval(380, 20, 30, 30);
      g.fillOval(390, 30, 30, 30);
      g.fillOval(380, 40, 30, 30);
      g.fillOval(360, 40, 30, 30);
      g.fillOval(350, 30, 30, 30);
      
   
   }
}