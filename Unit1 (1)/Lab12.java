 //Torbert, e-mail: smtorbert@fcps.edu
//version 4.16.2003
/* The Lab12 class randomly selects a Harvester
or Carpeter, both Workable objects, to work the
spiral map doing their appropriate jobs.
*/
import edu.fcps.karel2.*;
public class Lab12
{

  /* Method: work_one_row */
  /**
  * Precondition: Object arg must be from a class that implements Workable
  * Postcondition: arg either clears or fills one row of length n of spiral
  */
   public static void work_one_row(Workable arg, int n)
   {
      //loop executes n times; n represents length of row
      for(int k = 1; k <= n; k++)
      {
         //do appropriate job
         arg.workCorner();
         //move to next spot
         arg.moveOneBlock();
      }
   }
   
  /* Method: work_one_row */
  /**
  * Precondition: Object arg must be from a class that implements Workable
  and must be at lower-left corner of square
  * Postcondition: arg either clears or fills spiral and ends at center
  */
   public static void work_8x8_square(Workable arg)
   { 
   //not matter what direction currently facing, get arg facing north
      arg.turnToTheNorth();
   //work the first row
      work_one_row(arg, 7);
    /*continue to work remaing rows, turning after each one,
    k decreases because the spiral movement causes each row size
    to be shorter*/ 
      for(int k = 7; k >= 1; k--)
      {
         arg.turnToTheRight();
         work_one_row(arg, k);
         arg.turnToTheRight();
         work_one_row(arg, k);
      }
      //do appropriate job on last spot
      arg.workCorner();
   }
   public static void main(String[] args)//begin main
   {
   
   //load spiral map, 8x8
      Display.openWorld("maps/spiral.map");
      Display.setSize(10, 10);
      Display.setSpeed(8);
      
   /*use default Math.random to generate a random decimal >=0 and < 1
   if random # <0.5, invoke static method work_8x8_square with 
   Harvester obj starting at 2,2*/
      if(Math.random() < 0.5)
      {
         work_8x8_square( new Harvester(2, 2) );
      }
      /*if random # >= 0.5, invoke static method work_8x8_square with 
      Harvester obj starting at 2,2*/
      else
      {
         work_8x8_square( new Carpeter(2, 2) );
      }
   }
}