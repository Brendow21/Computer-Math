//Brendan Hom

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;

public class PolkadotPanel extends JPanel
{
   //data fields:
   //(constants)
   private static final int FRAME = 400;  //size of Panel 
   private static final Color BACKGROUND = new Color(204, 204, 204);//color of Panel
   
   //(not constants)
   private BufferedImage myImage;
   private Graphics myBuffer;
   private Timer t;
   private Polkadot pd, pd2;
   private int xPos, yPos;
   private int r, g, b;
   
   //Default Constructor
   public PolkadotPanel()
   {
      //instantiate BufferedImage
      myImage =  new BufferedImage(FRAME, FRAME, BufferedImage.TYPE_INT_RGB);
      //instantiate Graphics object, link to BufferedImage
      myBuffer = myImage.getGraphics();
      //set Color to Color created as constant data field
      myBuffer.setColor(BACKGROUND);
      //fill a rectangle, panel size
      myBuffer.fillRect(0, 0, FRAME, FRAME);
      //instantiate a Polkadot object using the default constructor
      pd = new Polkadot();
         int r = (int)Math.random() * 255 + 0;
         int g = (int)Math.random() * 255 + 0;
         int b = (int)Math.random() * 255 + 0;
      pd2 = new Polkadot(250, 250, 60, new Color(r,g,b));
      //instantiate Timer object and link it to ActionListener (every 1000 milliseconds)
      t = new Timer(1000, new Listener());
      //start the Timer
      t.start();
   }
   
   //Define paintComponent
   public void paintComponent(Graphics g)
   {
      //draw buffered image on Panel
      g.drawImage(myImage, 0, 0, getWidth(), getHeight(), null);
   }
   
   //Listener class
   private class Listener implements ActionListener
   {
   
      //actionPerformed method will be executed every 1000 milliseconds by Timer
      public void actionPerformed(ActionEvent e)
      {
         //set Color to Color created as constant data field
         myBuffer.setColor(BACKGROUND);
         //fill a rectangle, panel size to "hide" previous polkadot
         myBuffer.fillRect(0, 0, FRAME, FRAME); 
         //invoke jump method on Polkadot object
         pd.jump(FRAME, FRAME);
         pd2.jump(FRAME, FRAME);
         //invoke draw method on Polkadot object
         pd.draw(myBuffer);
         pd2.draw(myBuffer);
         //invoke paintComponent method so new image is redrawn on Panel
         repaint();
      }
   }
}

