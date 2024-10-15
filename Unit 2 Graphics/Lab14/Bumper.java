// Name: Brenda Hom 	Date:3/5/20

import java.awt.*;
   
public class Bumper
{
   //Declare all 5 private data fields for a Bumper
   //hint: the "location" of the bumper begins at its top left corner.      
   private int myX;     //This one is given for an example.
   private int myY;
   private int myXWidth;
   private int myYWidth;
   private Color myColor;
   private int r, g, b;

   
   //defalut constructor: Position (50, 50), XWidth=25, YWidth = 50, Blue 
   public Bumper()
   {
      //Your code here!
      myX = 50;
      myY = 50;
      myXWidth = 25;
      myYWidth = 50;
      myColor = Color.blue;
   }

   //5-arg constructor
   public Bumper(int x, int y, int w, int h, Color c)
   {
      //Your code here!
      myX = x;
      myY = y; 
      myXWidth = w;
      myYWidth = h;
      myColor = c;
      
   }
      
   // Accessor (Getter) methods  (one for each field)
   // One is give for an example
   public int getX()
   {
      return myX;
   }
   //Rest of code here!
   public int getY()
   {
      return myY;
   }
   
   public int getXWidth()
   {
      return myXWidth;
   }
   
   public int getYWidth()
   {
      return myYWidth;
   }
   
   public Color getColor()
   {
      return myColor;
   }



   
   // Modifier (Setter) methods  (one for each field)
   // One is give for an example
   public void setX(int x)
   {
      myX = x;
   }
   //Rest of code here!
   public void setY(int y)
   {
      myY = y;
   }
    
   public void getXWidth(int w)
   {
      myXWidth = w;
   }
   
   public void getYWidth(int h)
   {
      myYWidth = h;
   }
    
   public void setColor(Color c)
   {
      myColor = c;
   }


   // instance methods (Optional)
   // chooses a random (x,y) location.  Bumper stays entirely in the window.
   public void jump(int rightEdge, int bottomEdge)
   {
      // moves location to random (x, y) within the edges
      // moves location to random (x, y) within the edges
      myX = (int)(Math.random()* (rightEdge - myXWidth));
      myY = (int)(Math.random()* (bottomEdge - myYWidth));
   }
      
   // draws a rectangular bumper on the buffer
   public void draw(Graphics myBuffer) 
   {
      myBuffer.setColor(getColor());
      myBuffer.fillRect(getX(), getY(), getXWidth(), getYWidth());
   }   
   
   // returns true if any part of the polkadot is inside the bumper
   public boolean inBumper(Polkadot dot)
   {
      for(int x = getX(); x <= getX() + getXWidth(); x++)   //starts at upper left corner(x,y)
         for(int y = getY(); y <= getY() + getYWidth(); y++)
            if(distance(x, y, dot.getX(), dot.getY()) <= dot.getRadius() ) //checks every point on the bumper
               return true;            
      return false;
   }  
   
   // returns distance between (x1, y1) and (x2, y2)
   private double distance(double x1, double y1, double x2, double y2)
   {
      return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
   }	
}//End of Bumper Class
