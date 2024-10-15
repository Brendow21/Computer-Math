/** Programmer: Brendan Hom Block: 5 
* Instantiates two Climbers who are BFFs - 
* They will climb the right mountain, retrieve
* the beeper, and bring it back to the start.
*/
import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
import edu.fcps.karel2.WorldFrame;

public class Lab03
{
   public static void main(String[] args) 
   {
   //Display the mountain map size 16 X 16 
    Display.openWorld("maps/mountain.map");
      Display.setSize(16, 16);
      Display.setSpeed(10);
      
      WorldFrame.getCurrent().setLocation(0, 0);

   //Instantiate 2 Climber objects, both starting at x-xoord 8	

      Climber c1 = new Climber(8);
      Climber c2 = new Climber(8);

   //One Climber puts down a beeper
       c1.putBeeper();
       
       
   //Both Climbers go to base of right mountain	
       c1.turnRight();
       c1.move();
       c2.turnRight();
       c2.move();
       
       //both climbers climbing up right 3 times
       c1.climbUpRight();
       c2.climbUpRight();
       c1.climbUpRight();
       c2.climbUpRight();
       c1.climbUpRight();
       c2.climbUpRight();
       
       //both climbing down right twice
       c1.climbDownRight();
       c2.climbDownRight();
       c1.climbDownRight();
       c2.climbDownRight();
       
       //get the treasure
       c1.pickBeeper();
       c1.turnAround();
       c2.turnAround();
       
       //coming back to the base camp
       c1.climbUpLeft();
       c2.climbUpLeft();
       c1.climbUpLeft();
       c2.climbUpLeft();
       
       c1.climbDownLeft();
       c2.climbDownLeft();
       c1.climbDownLeft();
       c2.climbDownLeft();
       c1.climbDownLeft();
       c2.climbDownLeft();
       
       //finishing up
       c1.move();
       c2.move();
       c1.putBeeper();
       c1.move();
       c2.move();
       
   }
}