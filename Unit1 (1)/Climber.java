/** Programmer: Brendan Hom Block:5
* The Climber class is a subclass of Athlete
* and defines 4 methods for climbing
*/
import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;

public class Climber extends Athlete
{

/* Constructor: Climber, (1 arg) */
 /**
 * Climber will start at x-coord input by int x, y-coord 1
 * facing north with 1 beeper
 */
   public Climber(int x)
   {
      super(x, 1, Display.NORTH, 1);
   }
   
  /* Method: climbUpRight */
  /**
  * Precondition: Facing east, directly in front of step
  * Postcondition: Facing east, directly on top of step
  */
   public void climbUpRight()
   {
      turnLeft();
      move();
      move();
      turnRight();
      move();
   }
  
  //precondition: Facing east, directly at top of step
  //postcondition: facing east, directly at bottom of step
   public void climbDownRight()
   {
      move();
      turnRight();
      move();
      move();
      turnLeft();
   }
   
   //precondition: facing west, directly at botton of step
   //postcondition: facing west, directly at top of step
   public void climbUpLeft()
   {
      turnRight();
      move();
      move();
      turnLeft();
      move();
   }
   
   //precondition: facing west, directly at top of step
   //postcondition: facing west, diretly at bottom of step
   public void climbDownLeft()
   {
      move();
      turnLeft();
      move();
      move();
      turnRight();
    }
}