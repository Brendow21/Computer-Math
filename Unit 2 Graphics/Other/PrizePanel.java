/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab17;
//Phil Ero 16NOV07
	
   import javax.swing.*;
   import java.awt.*;
   import java.awt.event.*;
   import java.awt.image.*;
	
    public class PrizePanel extends JPanel
   {
      // constants
      private static final int FRAME_WIDTH = 400;
      private static final Color BACKGROUND = new Color(204, 204, 204);
      private static final Color BALL_COLOR = Color.black;
      private static final Color PRIZE_COLOR = Color.red;
      private static final int BALL_DIAM = 50;
      private static final int PRIZE_DIAM = 25;
      private static final int PRIZE_SHIFT = 10;
      
   	// fields
      private BufferedImage myImage;
      private Graphics myBuffer;
      private Ball ball;
      private Polkadot prize;
      private Timer t;   
      private int hits;  // number of times ball hits prize
   	    
       public PrizePanel()
      {
         myImage =  new BufferedImage(FRAME_WIDTH, FRAME_WIDTH, BufferedImage.TYPE_INT_RGB);
         myBuffer = myImage.getGraphics();
         myBuffer.setColor(BACKGROUND);
         myBuffer.fillRect(0, 0, FRAME_WIDTH, FRAME_WIDTH);
         
      	// create ball
         ball = new Ball(0, 0, BALL_DIAM, BALL_COLOR);
         ball.jump(FRAME_WIDTH, FRAME_WIDTH);
       
         // create prize
         prize = new Polkadot(0, 0, PRIZE_DIAM, PRIZE_COLOR);
         prize.jump(FRAME_WIDTH, FRAME_WIDTH);
        
        // start with 0 hits
         hits = 0;
        
         // create & start timer
         t = new Timer(5, new Listener());
         t.start();
         
      	// add a mouse listener
         addMouseListener(new Mouse());
         
      	// also, add a keyboard listener
         addKeyListener(new Key());
         setFocusable(true);
      }
      
       public void paintComponent(Graphics g)
      {
         g.drawImage(myImage, 0, 0, getWidth(), getHeight(), null);
      }
      
       private class Mouse extends MouseAdapter
      {
          public void mousePressed(MouseEvent e)
         {
            if(e.isMetaDown())
            {
            // mouse was right clicked, resets position of ball 
            // to where the mouse is right-clicked
               ball.setX(e.getX());
               ball.setY(e.getY());
            }
            else if (e.isShiftDown())
            {
            	// shift key was held, so change direcftion of ball
               ball.setdx((int)(Math.random()*11-6));
               ball.setdy((int)(Math.random()*11-6));
            } 
            else
            {
            // mouse was left clicked, resets position of prize 
            // to where the mouse is left-clicked
               prize.setX(e.getX());
               prize.setY(e.getY());
            }
         }
      }
      
       private class Key extends KeyAdapter
      {
          public void keyPressed(KeyEvent e)
         {
         	// check for up arrow
            if(e.getKeyCode() == KeyEvent.VK_UP && prize.getY() > PRIZE_SHIFT  )
               prize.setY( prize.getY() - PRIZE_SHIFT ); 
            // check for down arrow   
            else if(e.getKeyCode() == KeyEvent.VK_DOWN && prize.getY() < FRAME_WIDTH - PRIZE_SHIFT )
               prize.setY( prize.getY()+ PRIZE_SHIFT ); 
            // check for left arrow   
            else if(e.getKeyCode() == KeyEvent.VK_LEFT && prize.getX() > PRIZE_SHIFT  )
               prize.setX( prize.getX()- PRIZE_SHIFT ); 
            // check for right arrow
            else if(e.getKeyCode() == KeyEvent.VK_RIGHT && prize.getX() < FRAME_WIDTH - PRIZE_SHIFT)
               prize.setX( prize.getX()+ PRIZE_SHIFT ); 
         }
      }
      
       private class Listener implements ActionListener
      {
          public void actionPerformed(ActionEvent e)
         {
            // clear buffer
            myBuffer.setColor(BACKGROUND);
            myBuffer.fillRect(0,0,FRAME_WIDTH,FRAME_WIDTH);
             
            // move ball and check to see if it hits prize
            ball.move(FRAME_WIDTH, FRAME_WIDTH);
            collide(ball, prize);
             
            // draw ball & prize
            ball.draw(myBuffer);
            prize.draw(myBuffer);
             
            // display number of hits
            myBuffer.setColor(Color.black);
            myBuffer.setFont(new Font("Monospaced", Font.BOLD, 24));
            myBuffer.drawString("Count: " + hits, FRAME_WIDTH - 150, 25);
            
            repaint();
         }
      }
         
   	// checks to see if the ball & prize collide
   	// if so, increments hits & relocates prize	
       public void collide(Ball b, Polkadot p)
      {
         // find distance between ball & prize centers
         double dist = distance(b.getX(), b.getY(), p.getX(), p.getY());
         
         if(dist < PRIZE_DIAM/2 + BALL_DIAM/2)
         {
            hits++;
            
         	// relocate prize
            p.jump(FRAME_WIDTH,FRAME_WIDTH);
         }
      }
      
   	// returns the distance between (x1, y1) and (x2, y2)
       private double distance(double x1, double y1, double x2, double y2)
      {
         return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
      }
   }

