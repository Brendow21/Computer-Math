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
   
   private boolean upPush;
   private boolean downPush;
   private boolean rightPush;
   private boolean leftPush;
   	
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
      
      upPush = false;
      downPush = false;
      rightPush = false;
      leftPush = false;
   
      addMouseListener(new Mouse());
      addKeyListener(new Key());
      setFocusable(true);
   }
   
   public void paintComponent(Graphics g)
   {
      //draw buffered image on Panel
      g.drawImage(myImage, 0, 0, getWidth(), getHeight(), null);
   }
   
   private class Mouse extends MouseAdapter
   {
      public void mousePressed(MouseEvent e)
      {
         if(e.isMetaDown())
         {
            ball.setX(e.getX());
            ball.setY(e.getY());
         }
         else if (e.isShiftDown())
         {
            ball.setdx((int)(Math.random()*11-6));
            ball.setdy((int)(Math.random()*11-6));
         } 
         else
         {
            pd.setX(e.getX());
            pd.setY(e.getY());
         }
      }
   }
      
   private class Key extends KeyAdapter
   {
      public void keyPressed(KeyEvent e)
      {
         if(e.getKeyCode() == KeyEvent.VK_UP)
         {
            upPush = true;
         }
            
         if(e.getKeyCode() == KeyEvent.VK_DOWN)
         {
            downPush = true;
         }
           
         if(e.getKeyCode() == KeyEvent.VK_LEFT)
         {
            leftPush = true;
         }
            
         if(e.getKeyCode() == KeyEvent.VK_RIGHT)
         {
            rightPush = true;
         }
      }
          
      public void keyReleased(KeyEvent e)
      {
         if(e.getKeyCode() == KeyEvent.VK_UP)
         {
            upPush = false;
         }
            
         if(e.getKeyCode() == KeyEvent.VK_DOWN)
         {
            downPush = false;
         }
            
         if(e.getKeyCode() == KeyEvent.VK_LEFT)
         {
            leftPush = false;
         }
            
         if(e.getKeyCode() == KeyEvent.VK_RIGHT)
         {
            rightPush = false;
         }
      
      }
   }
   
   public void movepd()
   {
      if(upPush == true)
      {
               //set bumper's y to be what it currently is -1(moving up)
         pd.setY(pd.getY() - 1);
               
               //another nested if to see if it went past the top, and if it doesm set it to be the lowest value it should be
         if(pd.getY() <= 0)
         {
            pd.setY(0); 
         }
                  
               
      }
             
      if(downPush == true)
      {
         pd.setY(pd.getY() + 1);
               
         if(pd.getY() >= FRAME - pd.getY())
         {
            pd.setY(FRAME - pd.getY());
         }
      }
             
      if(leftPush == true)
      {
         pd.setX(pd.getX() - 1);
               
         if(pd.getX() <= 0)
         {
            pd.setX(0);
         }
      }
               
      if(rightPush == true)
      {
         pd.setX(pd.getX() + 1);
               
         if(pd.getX() >= FRAME - pd.getX())
         {
            pd.setX(FRAME - pd.getX());
             
         }
             
             
      }   
                 
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
