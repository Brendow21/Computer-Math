//Brendan Hom
//Creating the Polkadot resource class
import java.awt.*;

public class Polkadot
{
   //data fields
   private double myX; //x-coord of CENTER
   private double myY; //y-coord of CENTER
   private double myDiameter;
   private double myRadius;
   private Color myColor;

   //Default constructor
   public Polkadot()
   {
      myX = 200;
      myY = 200;
      myDiameter = 25;
      myRadius = myDiameter/2;
      myColor = Color.RED;
   }
   
   //4-arg constructor
   public Polkadot(double x, double y, double d, Color c)
   {
      //Your code
      myX = x;
      myY = y;
      myDiameter = d;
      myRadius = d/2;
      myColor = c;
   }
   
   //Accessor methods (Getter): to be able to access the value of data fields
   public double getX()
   {
      return myX;
   }
   public double getY()
   {
      return myY;
      
   }
   public double getDiameter()
   {
      return myDiameter;
      
   }
   public double getRadius()
   {
      return myRadius;
   }
   public Color getColor()
   {
      return myColor;
   }
   
   //Modifier methods (Setter): to be able to modify the value of data fields
   public void setX(double x)
   {
      myX=x;
   }
   public void setY(double y)
   {
      //Your code
      myY=y;
      
   }
   public void setDiameter(double d)
   {
      myDiameter=d;
      myRadius = d/2; //also have to update to new radius
   }
   public void setRadius(double r)
   {
      myRadius=r;
      myDiameter = r * 2;
                     
   }
   public void setColor(Color c)
   {
      myColor=c;
   }
   
   /*Method: jump
   * Precond: Polkadot object has been instantiated
   * Postcond: generates a random # for myX and myY in the range
   * myRadius through rightEdge/bottomeEdge - myRadius
   */
   public void jump(int rightEdge, int bottomEdge)
   {
   //generates a random # for myX in the range myRadius through rightEdge - myRadius
   //Example: myDiameter 40, rightEdge 400, range 20 - 380
     myX = Math.random()*(rightEdge-myDiameter)+myRadius; 
      
   //generates a random # for myY in the range myRadius through bottomEdge - myRadius
   //Example: myDiameter 40, rightEdge 400, range 20 - 380
   myY = Math.random()*(bottomEdge-myDiameter)+myRadius;   
   
   }
   
   /*Method: draw
   * Precond: Polkadot and Graphics objects have been instantiated
   * Postcond: draws a Polkadot wtih corresponding data fields
   */
   public void draw(Graphics myBuffer)
   {
      //set color to data field so each Polkadot is different
      myBuffer.setColor(myColor);
      
      //must cast doubles to ints (chop off decimal) to prevent errors since fillOval requires ints
      myBuffer.fillOval((int)(myX-myRadius), (int)(myY-myRadius), (int)(myDiameter), (int)(myDiameter));
   }
}
