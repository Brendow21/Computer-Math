//Brendan Hom
/*This class executes the explore method from the Mountain class on various
* types of Climbers
*/

import edu.fcps.karel2.Display;
import javax.swing.JOptionPane; //needed for input boxes
import edu.fcps.karel2.WorldFrame;

public class Lab08
{
   public static void race(Racer arg)
   {
      while(!arg.nextToABeeper())
         if(arg.frontIsClear())
            arg.move();
         else
            arg.jumpRight();
   }

   public static void main(String[] args) 
   {
      //Have dialog boxes pop up for input of display, object type, and x-coord
      String filename = JOptionPane.showInputDialog("What robot display?");
      String type = JOptionPane.showInputDialog("What type of Racer?");
      
      /*Load desired display using variable: filename which is now
      * equal to whatever was typed into dialog box*/      
      Display.openWorld("maps/" + filename + ".map");
      Display.setSize(18, 16);
      Display.setSpeed(7);
      
      WorldFrame.getCurrent().setLocation(0, 0);
   
      /*variable type is equal to whatever kind of Climber
      * was input into dialog box (Climber, HillClimber, StepClimber)
      * Invoke explore method with appropriate type of Climber 
      * object based on type.*/  
      if(type.equals("Racer"))
      {
         //instantiate a Climber object 
         Racer r = new Racer(1);
         
         //invoke (static) method explore from Moutain class with a Climber argument
         race(r);
      }
      else if(type.equals("SteepleChaseRacer"))
      {
         //instantiate a HillClimber object
         SteepleChaseRacer s = new SteepleChaseRacer(1);
         
         //invoke (static) method explore from Moutain class with a HillClimber argument
         race( s );
      }
      else if(type.equals("BoxTopRacer"))
      {
            //instantiate a StepClimber object
         BoxTopRacer b = new BoxTopRacer(1);
         
         //invoke (static) method explore from Moutain class with a HillClimber argument
         race( b );
      }
      else //if something other than Climber,HillClimber,StepClimber was input
      {
         System.out.println("Invalid robot type.");
      }
   }
}