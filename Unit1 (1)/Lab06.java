   //Name Brendan Hom Date 9/30 Block: 5
   /*Lab06: Half Dozen Tasks
  
   */
   
import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
import javax.swing.JOptionPane;//Library for the dialog box
import edu.fcps.karel2.WorldFrame;

public class Lab06
{
   public static void main(String[] args) //MAIN METHOD BEGINS
   {
      /*********************************************************
         Dialog Box Display:
         The next two lines of code display a dialog box so you can input
         the map names when you run your program
      ***********************************************************/
      String filename = JOptionPane.showInputDialog("What robot world?");
      Display.openWorld("maps/" + filename + ".map");
         
      Display.setSize(10, 10);
      Display.setSpeed(8);
      
      WorldFrame.getCurrent().setLocation(0, 0);
      
      doJob_01(); //go to the end of the row of beepers
      doJob_02(); //go to the beeper
      doJob_03(); //go to the wall
      doJob_04(); //go to the wall, pick up all the beepers (max one per pile)
      doJob_05(); //go to the wall, pick up all the beepers
      doJob_06(); //go to the end of the row of beepers, there is one gap
      
   }//  END OF MAIN METHOD
   
   
   /***********************************************************
     Static Methods that are called in the Main method
   ***********************************************************/
  
     
   public static void  doJob_01()	
   { 
   //create new robot a1
      Robot a1 = new Robot(1, 1, Display.EAST, 0);
   
   //go to the end of the row of beepers
      while(a1.nextToABeeper())
      {
         a1.move();
      }
   
   }
   
   public static void doJob_02()
   { 
   //create robot a2
      Robot a2 = new Robot(1, 2, Display.EAST, 0);
   
   //go to the beeper
      while(!a2.nextToABeeper())
      {
         a2.move();
      }
   }
 /* Method: doJob_03() */
 /**
 * Precondition: row must contain a wall
 * Postcondition: Robot ends on spot before wall
 */ 
   public static void doJob_03()	
   { 
   //create a Robot at 1, 3, facing E
      Robot a3 = new Robot(1, 3, Display.EAST, 0);
      
   //go to the wall
      while(a3.frontIsClear())
      {
         a3.move();
      }   
   }
   
   public static void doJob_04() 
   { 
      //create robot a4
      Robot a4 = new Robot(1, 4, Display.EAST, 0);
      
   //go to the wall, pick up all the beepers (max one per pile)
      while(a4.nextToABeeper())
      {
         a4.pickBeeper();
      }
      while(a4.frontIsClear())
      {
         a4.move();
         while(a4.nextToABeeper())
         {
            a4.pickBeeper();
         }
      }
   }

   public static void doJob_05()	
   { 
   //create robot a5
      Robot a5 = new Robot(1, 5, Display.EAST, 0);
      
   //go to the wall, pick up all the beepers (multiple in each pile)
      while(a5.frontIsClear())
      {
         a5.move();
         while(a5.nextToABeeper())
         {
            a5.pickBeeper();
         }
      }
      if(!a5.frontIsClear())
      {
         while(a5.nextToABeeper())
         {
            a5.pickBeeper();
         }
      }
   }
  
   public static void doJob_06()
   { 
   //create robot a6
      Robot a6 = new Robot(1, 6, Display.EAST, 0);
   //go to the end of the row of beepers, there is one gap
      while(a6.nextToABeeper())
      { 
         a6.move();
      }
      if(a6.frontIsClear())
      {
         a6.move();
      }
      while(a6.nextToABeeper())
      {
         a6.move();
      }
   }
}
// end  Lab06