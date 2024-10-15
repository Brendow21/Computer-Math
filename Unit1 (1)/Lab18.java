//Torbert, e-mail: smtorbert@fcps.edu
//version 4.16.2003

/*Lab18: A Pirate hunts for treasure*/

import edu.fcps.karel2.Display;
import javax.swing.JOptionPane;
public class Lab18
{
   public static void main(String[] args)
   {
      //Dialog box to type in map name
      String filename = JOptionPane.showInputDialog("What robot world?");
      //Load proper map and set Display size and speed
      Display.openWorld("maps/" + filename + ".map");
      Display.setSize(8, 8);
      Display.setSpeed(10);
   
      //Create a Pirate object
      Pirate karel = new Pirate();
      
      //variable to keep track of # of beepers in each pile
      int currentBeepers = 0;

      //Loop to make karel continue finding treasures until the pile of 5 is found
      while(currentBeepers != 5) //as long as currentBeepers does NOT equal 5
      {
         //execute the Pirate method to approach the pile
         karel.approachPile();
         
         /*execute the Pirate method to count the number of beepers in the pile
         and set the variable currentBeepers equal to the number returned*/
         currentBeepers = karel.numOfBeepersInPile();
         
         //execute the Pirate method to make karel turn the right way
          karel.turnAppropriately(currentBeepers);
           
         //end of loop it will restart if not on the pile of 5 beepers
      
      }
    
   }
}