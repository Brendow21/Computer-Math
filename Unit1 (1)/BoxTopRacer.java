/** Programmer: Brendan Hom Block:5
* The Racer class is a subclass of Athlete
*They know how to jumpRight, jumpLeft, sprint, etc
*/
import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;

public class BoxTopRacer extends Racer
{
   //1-arg constructor set y-coordinate of Racer
   public BoxTopRacer(int y)
   {
      super(y);
   }
   //Preconditon: facing EAST in front of hurdle
   //postcondition: facing EAST behind hurdle
   public void jumpRight()
   {
      this.turnLeft();
      while(!this.rightIsClear())
      {
         this.move();
      }
      {
         this.turnRight();
         this.move();
      }
      while(!this.rightIsClear())
      {
         this.move();
      }
      this.turnRight();
      while(frontIsClear())
      {
         this.move();
      }
      {
         this.turnLeft();
      }
   }
}