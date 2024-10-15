//Brendan Hom, e-mail: smtorbert@fcps.edu
//version 4.22.2003
/*This class executes the explore method from the Mountain class on various
* types of Climbers
*/

import edu.fcps.karel2.Display;
import javax.swing.JOptionPane; //needed for input boxes
import edu.fcps.karel2.WorldFrame;

public class Lab07
{
   public static void main(String[] args) 
   {
      //Have dialog boxes pop up for input of display, object type, and x-coord
      String filename = JOptionPane.showInputDialog("What robot display?");
      String type = JOptionPane.showInputDialog("What type of Climber?");
      String avenue = JOptionPane.showInputDialog("What x-coord to start?");
      int x = Integer.parseInt(avenue);
      
      /*Load desired display using variable: filename which is now
      * equal to whatever was typed into dialog box*/      
      Display.openWorld("maps/" + filename + ".map");
      Display.setSize(17, 15);
      Display.setSpeed(7);
      WorldFrame.getCurrent().setLocation(0, 0);

   
      /*variable type is equal to whatever kind of Climber
      * was input into dialog box (Climber, HillClimber, StepClimber)
      * Invoke explore method with appropriate type of Climber 
      * object based on type.*/  
      if(type.equals("Climber"))
      {
         //instantiate a Climber object 
         Climber c = new Climber(x);
         
         //invoke (static) method explore from Moutain class with a Climber argument
         Mountain.explore( c );
      }
      else if(type.equals("HillClimber"))
      {
         //instantiate a HillClimber object
         HillClimber h = new HillClimber(x);
         
         //invoke (static) method explore from Moutain class with a HillClimber argument
         Mountain.explore( h );
      }
      else if(type.equals("StepClimber"))
      {
            //instantiate a StepClimber object
         StepClimber s = new StepClimber(x);
         
         //invoke (static) method explore from Moutain class with a HillClimber argument
         Mountain.explore( s );
      }
      else //if something other than Climber,HillClimber,StepClimber was input
      {
         System.out.println("Invalid robot type.");
      }
   }
}