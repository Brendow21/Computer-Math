//Name: Brendan Hom   Block: 5
	
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
   
public class MovingBumperPanel extends JPanel
{
   private static final int FRAME = 400;
   private static final Color BACKGROUND = new Color(204, 204, 204);
   private static final Color BALL_COLOR = Color.BLACK;
   private static final Color PRIZE_COLOR = Color.RED;
   private static final Color BUMPER_COLOR = Color.BLUE;
   private static final double BALL_DIAM = 50;
   private static final double PRIZE_DIAM = 25;
   private static final int BUMPER_WIDTH = 25;
   private static final int BUMPER_HEIGHT = 100;
   
   private boolean upPush;
   private boolean downPush;
   private boolean rightPush;
   private boolean leftPush;
   
   private BufferedImage myImage;
   private Graphics myBuffer;
   private Ball ball;
   private Polkadot prize;
   private Bumper bumper;
   private int hits;
   private Timer timer;    
      
   public MovingBumperPanel()
   {
      myImage =  new BufferedImage(FRAME, FRAME, BufferedImage.TYPE_INT_RGB);
      myBuffer = myImage.getGraphics();
       
      // create ball and jump
      ball = new Ball(200, 200, BALL_DIAM, BALL_COLOR);
      ball.jump(FRAME, FRAME);
      
      // create prize (Polkadot) and jump
      prize = new Polkadot(100, 100, PRIZE_DIAM, PRIZE_COLOR);
      prize.jump(FRAME, FRAME);
            
      // create bumper and jump
      bumper = new Bumper(300, 300, BUMPER_WIDTH, BUMPER_HEIGHT, BUMPER_COLOR);
      bumper.jump(FRAME, FRAME);
      	
      // ensure ball is outside the bumper
      while(bumper.inBumper(ball))
      {
         ball.jump(FRAME,FRAME);
      }
         
   
        
    	// ensure prize is outside the bumper
      while(bumper.inBumper(prize))
      {
         prize.jump(FRAME,FRAME);
      }
   
     
      hits = 0;
      timer = new Timer(5, new Listener());
      timer.start();
      
      upPush = false;
      downPush = false;
      rightPush = false;
      leftPush = false;
      addKeyListener(new Key());
      setFocusable(true);
   }
   
   private class Key extends KeyAdapter
   {
      //Key will have 2 methods: recognizes when a key is pressed
      public void keyPressed(KeyEvent e)
      {
         //if key is pressed, set boolean variable to true
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
        
   public void moveBumper()
   {
      if(upPush == true)
      {
               //set bumper's y to be what it currently is -1(moving up)
         bumper.setY(bumper.getY() - 1);
               
               //another nested if to see if it went past the top, and if it doesm set it to be the lowest value it should be
         if(bumper.getY() <= 0)
         {
            bumper.setY(0); 
         }
                  
               
      }
             
      if(downPush == true)
      {
         bumper.setY(bumper.getY() + 1);
               
         if(bumper.getY() >= FRAME - bumper.getYWidth())
         {
            bumper.setY(FRAME - bumper.getYWidth());
         }
      }
             
      if(leftPush == true)
      {
         bumper.setX(bumper.getX() - 1);
               
         if(bumper.getX() <= 0)
         {
            bumper.setX(0);
         }
      }
               
      if(rightPush == true)
      {
         bumper.setX(bumper.getX() + 1);
               
         if(bumper.getX() >= FRAME - bumper.getXWidth())
         {
            bumper.setX(FRAME - bumper.getXWidth());
             
         }
             
             
      }   
                 
   }     
          
      
   public void paintComponent(Graphics g)
   {
      g.drawImage(myImage, 0, 0, getWidth(), getHeight(), null);
   }
          
   private class Listener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         // clear buffer and move ball
         myBuffer.setColor(BACKGROUND);
         myBuffer.fillRect(0,0,FRAME,FRAME); 
         ball.move(FRAME, FRAME);
         moveBumper();
         
            
         // check for collisions
         collide(ball, prize);
         BumperCollision.collide(bumper, ball);
         
         // draw ball, bumper & prize
         ball.draw(myBuffer);
         prize.draw(myBuffer);
         bumper.draw(myBuffer);
            
       	// ensure the prize did not jump inside the bumper
         while(bumper.inBumper(prize))
            prize.jump(FRAME, FRAME);
         
         // update hits on buffer
         myBuffer.setColor(Color.black);
         myBuffer.setFont(new Font("Monospaced", Font.BOLD, 24));
         myBuffer.drawString("Count: " + hits, FRAME - 150, 25);
            
         repaint();
      }
   } 
      
 	// checks to see if the ball & prize collide
 	// if so, increments hits & relocates prize	
   public void collide(Ball b, Polkadot p)
   {
      // find distance between ball & prize centers
      double dist = distance(b.getX(), b.getY(), p.getX(), p.getY());
         
      if(dist < p.getRadius() + b.getRadius())
      {
         hits++;
         p.jump(FRAME,FRAME);    	// relocate prize
      }
   }
   		
   private double distance(double x1, double y1, double x2, double y2)
   {
      return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
   }
   

   

}//End of BumperPanel class
