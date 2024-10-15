import javax.swing.*;
import java.awt.*;
public class Panel02 extends JPanel
{
   public void paintComponent(Graphics g)
   {
      super.paintComponent(g);
      setBackground(Color.blue);
      
      g.setColor(Color.red);
      
           
      for (int x=90; x<=300 ;x+=20)
      {
         g.fillOval(x, 40, 20, 20);
         g.fillOval(x, 240, 20, 20);
      }
      
      for (int y=40; y<=250; y+=20)
      {
         g.fillOval(90, y, 20, 20);
         g.fillOval(290, y, 20, 20);
      }
      
      ImageIcon Shark = new ImageIcon("Shark.jpg");
      g.drawImage(Shark.getImage(), 100, 50, 200, 200, null);
      
      g.setFont(new Font("Serif",Font.BOLD, 35));
      g.setColor(Color.BLACK);
      g.drawString("Im am da shark",100,300);
      
   }
}