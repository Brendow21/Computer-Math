/** Programmer: Mrs. Cossa Block: 10
* The Lab11a class is an application
* that uses creates RockHillClimbers or 
* RockStepClimbers and has them complete
* maps; rock1, rock2, rock3, rock4
*/ 

import edu.fcps.karel2.Display;
import javax.swing.JOptionPane;
import edu.fcps.karel2.WorldFrame;

public class Lab11a
{

 /* Method: rockClimb */
 /**
 /*Precondition: RockClimber subclass starts at 1,1, facing EAST
 * Postcondition: Ends at 19,1,facing EAST
 */
   public static void rockClimb(RockClimber arg)
   {
      arg.climbToTop();
      arg.climbToBottom();
      arg.finishClimb();
   }
   public static void main(String[] args) 
   {
      //dialog box to type in RockClimber type and map #
      String type = JOptionPane.showInputDialog("What type of rock climber?");
      String filename = JOptionPane.showInputDialog("What number rock map (1-4)?");
   
      Display.openWorld("maps/rock" + filename + ".map");
      Display.setSize(19, 15);
      Display.setSpeed(8);
      
      WorldFrame.getCurrent().setLocation(0, 0);
      
      //friend that marks end of map
      Athlete friend = new Athlete(19, 1, Display.EAST, 0);
   
      /*if user types RHC, create RockHillClimber and invoke rockClimb*/
      if(type.equals("RHC"))
      {
         RockHillClimber rh = new RockHillClimber();
         rockClimb( rh );
      }
      /*if user types RSC, create RockStepClimber and invoke rockClimb*/
      else if(type.equals("RSC"))
      {
         RockStepClimber rs = new RockStepClimber();
         rockClimb( rs );
      }
      else
      {
         System.out.println("Invalid robot type.");
      }
   
   }
}