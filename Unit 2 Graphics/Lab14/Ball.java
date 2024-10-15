//Name: Brendan Hom             Date: 2/24/20
//Ball Resource class - subclass of Polkadot
import java.awt.*;
import javax.swing.*;
	
public class Ball extends Polkadot
{
   //data fields
   private double dx; // pixels to change myX by each time move() is called.
   private double dy; // pixels to change myX by each time move() is called.
   
   //default constructor	
   public Ball()
   {
      /*invoke superclass 4-arg constructor so that ball
      default values will be x-200, y-200, diameter-50, color-black*/
      super(200, 200, 50, Color.BLACK);
     
      /*set dx (how much x value will change)to random # between -6 & 6
      Continue to generate a random value until it's not 0*/
      do
      {
         dx = Math.random()* 12 - 6;
      } 
      while(dx == 0); 
      
      /*set dy (how much y value will change)to random # between -6 & 6
      Continue to generate a random value until it's not 0*/
      do
      {
         dy = Math.random() * 12 - 6;
      } 
      while(dy == 0);
   }
   
   //4-arg Constructor
   public Ball(double x, double y, double dia, Color c)
   {
      /*invoke superclass 4-arg constructor and send the above
      arguments so x, y, diameter and color will be set accordingly*/
      super(x, y, dia, c);
      
      /*set dx (how much x value will change)to random # between -6 & 6
      Continue to generate a random value until it's not 0*/
      do
      {
         dx = Math.random()* 12 - 6;
      } 
      while(dx == 0); 
      
      /*set dy (how much y value will change)to random # between -6 & 6
      Continue to generate a random value until it's not 0*/
      do
      {
         dy = Math.random() * 12 - 6;
      } 
      while(dy == 0);
   }
      
   //modifier methods 
   public void setdx(double x)        
   {
      dx = x;
   }
   public void setdy(double y)
   {
      dy = y;
   }
      
   //accessor methods
   public double getdx()             
   {
      return dx;
   }
   public double getdy()
   {
      return dy;
   }
      
   /*Method: move
   * Precond: rightEdge & bottomEdge > 0 and Ball has been instantiated
   * Postcond: ball moved in current path by adding dx and dy to current
   * x and y position. If Ball hit left or right wall, dx was reversed. If
   * Ball hit top or bottom wall, dy was reversed.
   */
   public void move(double rightEdge, double bottomEdge)
   {
      //reset the x value to be what it currently is plus the change
      setX(getX() + dx);       // myX = myX + dx
                
      //reset the x value to be what it currently is plus the change
      setY(getY() + dy);       // myY = myY + dy     
       	         
      /* invoke Ball method (defined below this move method) that 
      checks for right edge bounces*/
      checkRight(rightEdge);
      
      /* invoke Ball method (that YOU WILL DEFINE below the move method) that 
      checks for left edge bounces*/
      checkLeft();
         
      /* invoke Ball method (that YOU WILL DEFINE below the move method that 
      checks for bottom edge bounces*/
      checkBottom(bottomEdge);
      
      /* invoke Ball method (that YOU WILL DEFINE below the move method) that 
      checks for top edge bounces*/
      checkTop();   
         
   }
   
   /*Method: checkRight
   * Precond: rightEdge > 0 and Ball has been instantiated
   * Postcond: if ball goes past right edge, re-adjusts x-coord
   * to be max value that makes ball touch edge and reverses diretion of dx. 
   * Returns true if the ball "hit" the right edge, false if it did not
   */
   public boolean checkRight(double rightEdge)
   {
      //if the new x is outside of the panel
      if(getX() >= rightEdge - getRadius() ) 
      {
         //reset it the x to be as far right as can be
         setX(rightEdge - getRadius());
         //reverse the change in x 
         dx = dx * -1; 
         //return true to show that it hit the wall   
         return true;
      }
      else
      {
         //return false to show that it DIDN'T hit the wall 
         return false;
      }
   }
   
   /*Method: checkLeft
   * Precond: Ball has been instantiated
   * Postcond: if ball goes past left edge, re-adjusts x-coord
   * to be min value that makes ball touch edge and reverses dx. 
   * No variable needed for left edge because it is always 0! 
   * Returns true if the ball "hit" the left edge, false if it did not
   */
   public boolean checkLeft()
   {
      if(getX() <= getRadius())
      {
         setX(getRadius());
         
         dx = dx * -1;
         
         return true;
       }
       else
       {
         return false;
       }
   }
   
   /*Method: checkBottom
   * Precond: bottomEdge > 0 and Ball has been instantiated
   * Postcond: if ball goes past bottom edge, re-adjusts y-coord
   * to be max value that makes ball touch edge and reverses dy. Returns true if
   * the ball "hit" the bottom edge, false if it did not
   */
   public boolean checkBottom(double bottomEdge)
   {
       if(getY() >= bottomEdge - getRadius())
      {
         setY(bottomEdge - getRadius());
         
         dy = dy * -1;
         
         return true;
       }
       else
       {
         return false;
       }  
   }
   
   /*Method: checkTop
   * Precond: Ball has been instantiated
   * Postcond: if ball goes past top edge, re-adjusts y-coord
   * to be min value that makes ball touch edge and reverses dy. 
   * No variable needed for top edge because it is always 0! 
   * Returns true if the ball "hit" the top edge, false if it did not
   */
   public boolean checkTop()
   {
       if(getY() <= getRadius())
      {
         setY(getRadius());
         
         dy = dy * -1;
         
         return true;
       }
       else
       {
         return false;
       }  
   }
    
}//End of Ball Class

