/** Programmer: Mrs. Cossa Block: 10
* The RockClimber class is a subclass of Athlete
* and contains 1 concrete method, climbToTop
* and 2 abstract methods, climbToBottom and FinishClimb
*/ 

import edu.fcps.karel2.Display;

public class RockStepClimber extends RockClimber
{
   
 /* Constructor: Default */
 /**
 /*invokes Athlete 4 arg constructor starting at 1,1,facing EAST, with INFINITE beepers
 */   
   public RockStepClimber()
   {
      super();
   }
   
 /* Method: climbToBottom */
 /**
 /*Precondition: Starts at summit facing EAST, beeper at bottom of mountain
 * Postcondition: Ends at beeper at bottom of mountain facing EAST
 */
   public void climbToBottom() //make it to bottom, marked by a beeper
   {
      while(!this.nextToABeeper())
      {
         this.move();
         this.turnRight();
         this.move();
         this.turnLeft();
      }
   }
 /* Method: finishClimb */
 /**
 /*Precondition: Starts at bottom of mountain facing East
 * Postcondition: Ends at Robot at end of map
 *                RockHillClimber also puts down beepers where there are none
 *                RockStepClimber also picks up beepers where there are some               
 */   
   public void finishClimb()
   {
   while(!this.nextToARobot())
   {
      if(this.nextToABeeper())
      {
         this.pickBeeper();
      }
      this.move();
   }
   }

}