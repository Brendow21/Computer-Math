   //Name Brendan Hom Date: 10/4 Block: 5
   //Lab06b
   
import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
import javax.swing.JOptionPane;//Library for the dialog box
import edu.fcps.karel2.WorldFrame;

public class Lab06b
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
      
      doJob_07(); //go to the beeper or the wall (which ever one comes first) Count and report number of steps taken
      doJob_08(); //Go until you next to another robot, then put all beepers down. Then both robots move so we can see 10 beepers
      doJob_09(); //put down 5 different piles with 4 beepers in each pile.
      doJob_10(); //fill gaps with a beeper. Stop when you reach wall.
      doJob_11(); //fill gaps with a beeper. 
      doJob_12(); //Stop when you reach wall.go until there is a wall to your right and you are standing on a beeper.
      
   }//  END OF MAIN METHOD
   
   
   /***********************************************************
     Static Methods that are called in the Main method
   ***********************************************************/
  
     //Method doJob_07()
     //precondition: row must contain a wall
     //postcondition: Robot ends on spot before the wall
   public static void  doJob_07()	
   { 
   //create new robot a1
      Robot a1 = new Robot(1, 1, Display.EAST, 0);
      
   
   //go to the beeper or the wall (which ever one comes first) Count and report number of steps taken.
      int count = 0;
      while(!a1.nextToABeeper() &&a1.frontIsClear())
      {
         a1.move();
         count++;
      }
      System.out.print("steps taken: " + count);
   }
   
   //Method doJob_08
   //precondition: row must have a random robot and a2 must have 10 beepers
   //postcondition: 10 beeperes placed at end of row and both robots take 1 step
   public static void doJob_08()
   { 
   //create robot a2
      Robot a2 = new Robot(1, 2, Display.EAST, 10);
   
   //create randomrobot, starts at random x locaton.
      int randomX = (int) (Math.random() * 10+1);
      Robot randomRobot = new Robot(randomX, 2, Display.EAST, 0);
   
   //Go until you next to another robot, then put all beepers down.
   /*Then both robots move so we can see 10 beepers*/
      while(!a2.nextToARobot())
      {
         a2.move();
      }
      for (int x=1; x<=10; x++)
      {
         a2.putBeeper();
      }
      
      //Both of the robots will move after placing the 10 beepers
      a2.move();
      randomRobot.move();

   }
   
   //Method doJob_09()
   //precondition: robot must have 20 beepers
   //post condition: 5 piles with 4 beepers
   public static void doJob_09()	
   { 
   //create a Robot at 1, 3, facing E
      Robot a3 = new Robot(1, 3, Display.EAST, 20);
      
   //put down 5 different piles with 4 beepers in each pile.
      for (int x = 1 ; x<=5 ; x++ )
      {
         if(a3.frontIsClear())
         {
            for (int y = 1 ; y<=4 ; y++ )
               a3.putBeeper();
         }
         a3.move();
}
   }
   
   //Method doJob_10()
   //precondition: row must have wall and scattered beepers
   //postcondition: row must be filled with 1 beeper in each spot to the wall
   public static void doJob_10() 
   { 
      //create robot a4
      Robot a4 = new Robot(1, 4, Display.EAST, Display.INFINITY);
      
   //fill gaps with a beeper. Stop when you reach wall.
      while(a4.frontIsClear())
      {
         if(!a4.nextToABeeper())
         {
            a4.putBeeper();
         }
         if(a4.nextToABeeper())
         {
            a4.move();
         }
      }
   }

   //Method doJob_11()
   //precondition: row must have wall on the right
   //postcondition: 1 beeper placed next to wall and robot 1 space after wall
   public static void doJob_11()	
   { 
   //create robot a5
      Robot a5 = new Robot(1, 5, Display.EAST, Display.INFINITY);
      
   //while there is a wall to your right, put down one beeper at each step.
      while(!a5.rightIsClear())
      {
         a5.putBeeper();
         a5.move();
      }
   }
  
   //Method doJob_12()
   //precondition: must have beeper and wall on right in the row
   //postcondition: robot is next to a wall and is on a beeper
   public static void doJob_12()
   { 
   //create robot a6
      Robot a6 = new Robot(1, 6, Display.EAST, 0);
   //go until there is a wall to your right and you are standing on a beeper.
      while(a6.rightIsClear()|| !a6.nextToABeeper())
      {
         a6.move();
      }
   }
}
// end  Lab06b