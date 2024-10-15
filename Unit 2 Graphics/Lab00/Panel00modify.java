import javax.swing.*;
import java.awt.*;
public class Panel00modify extends JPanel
{
   public void paintComponent(Graphics g)
   {
      g.setColor(Color.RED);
      g.fillRect(0, 0, 800, 400);
   
      g.setFont(new Font("Serif",Font.BOLD, 50));
      g.setColor(new Color(0, 225, 247));
      g.drawString("Do you like Computer Math?",100 ,100 );
   
      g.setFont(new Font("Aria", Font.ITALIC, 30));
      g.setColor(new Color(41, 48, 233));
      g.drawString("Computer math is cool", 100, 150);
   
      g.setFont(new Font("Arial",Font.ITALIC, 20));
      g.setColor(new Color(255, 255, 4));
      g.drawString("How do you get different colors?",100 ,200 );
   
      g.setFont(new Font("Monospaced", Font.BOLD, 20));
      g.setColor(new Color(13, 236, 58));
      g.drawString("From using a color wheel", 100, 250);
   }
}