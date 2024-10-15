//Name: Brendan Hom   Date: 2/27/20
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;

public class PrizePanel extends JPanel
{
   private static final int FRAME = 400;
   private static final Color BACKGROUND = new Color(204, 204, 204);
   private BufferedImage myImage;
   private Graphics myBuffer;
   private Ball ball;
   private Polkadot pd;
   private int hits;
   private Timer t; 
	
   //constructor   
   public PrizePanel()
   {
      //instantiate BufferedImage
      myImage =  new BufferedImage(FRAME, FRAME, BufferedImage.TYPE_INT_RGB);
      //instantiate Graphics object, link to BufferedImage
      myBuffer = myImage.getGraphics();
      //set Color to Color created as constant data field
      myBuffer.setColor(BACKGROUND);
      //fill a rectangle, panel size
      myBuffer.fillRect(0, 0, FRAME, FRAME);
      
      //Create Ball and Polkadot object with 4-arg constructor (different size, location, color)
      ball = new Ball(200, 200, 50, Color.black);
      pd = new Polkadot(100, 100, 25, Color.red);

      
      //instantiate Timer object and link it to ActionListener (every 5 milliseconds)
      t = new Timer(5, new Listener());
      //start the Timer
      t.start();
   }
   
   public void paintComponent(Graphics g)
   {
      //draw buffered image on Panel
      g.drawImage(myImage, 0, 0, getWidth(), getHeight(), null);
   }
   
   private class Listener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         //set Color to Color created as constant data field
         myBuffer.setColor(BACKGROUND);
         //fill a rectangle, panel size to "hide" previous polkadot
         myBuffer.fillRect(0, 0, FRAME, FRAME); 
         
         //You should type the rest of code on the next line.
         ball.move(FRAME, FRAME);
         collide(ball, pd);
         
         ball.draw(myBuffer);
         pd.draw(myBuffer);
         myBuffer.setColor(Color.BLACK);
         myBuffer.setFont(new Font("Monospaced", Font.BOLD, 24));
         myBuffer.drawString("Count: " + hits, FRAME - 150, 25);
         repaint();
     
          
      }
   }
   
   //collide method checks if two ball touches each other   
   private void collide(Ball b, Polkadot pd)
   {
     
      //the actual distance of two balls calculated by distance method
      double d = distance(b.getX(), b.getY(), pd.getX(), pd.getY());  
		
		if (d <= (b.getRadius() + pd.getRadius()))
      {
          pd.jump(FRAME, FRAME);
          hits++;
      }
   }
   
   //distance method calculate the dista  `nce of two balls
   private double distance(double x1, double y1, double x2, double y2)
   {
      //needs to return the distance 
      return Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));              // enter the calculation here.
   }
}
